package com.gsb.MainPackage.WorkManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGPOJO.Notification;
import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.BasicObject.MBGPOJO.WorkPlan;
import com.gsb.BasicObject.Services.WorkService;
import com.gsb.Utils.Decorator;
import com.gsb.Utils.TypeTransfer;

@Controller
public class WorkController {
	
	@Autowired
	WorkService work_service;
	

	@RequestMapping( value="/WorkManage")
	public ModelAndView work_manage(ModelAndView mv) {
		mv.addObject("notify_list", work_service.showAllNotification());
		mv.addObject("workplan_list", work_service.showAllWorkplans());
		return mv;
	}

	@RequestMapping( value="/Notification")
	public ModelAndView show_a_notification(@RequestParam("nid") String nid, ModelAndView mv) {
		mv.addObject("notification", work_service.getNotificationByNId(Integer.parseInt(nid)));
		System.out.println(work_service.getNotificationByNId(Integer.parseInt(nid)));
		return mv;
	}
	
	@RequestMapping(value="/Notifications")
	public ModelAndView show_notify( ModelAndView mv) {
		mv.addObject("notify_list", work_service.showAllNotification());
		return mv;
	}
	
	@RequestMapping(value="/NotificationAdd")
	public String add_notify_ui() {
		return "NotificationAdd";
	}
	
	@RequestMapping( value="/NotificationDel")
	public String del_notify_ui() {
		return "NotificationDel";
	}
	
	@RequestMapping( value="/del_notify")
	public void del_notify( ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		Notification targetNotification = new Notification();
		Decorator.asUTF8(request);
		targetNotification.setNotificationContent( request.getParameter("content").getBytes());
		targetNotification.setNotificationContent(request.getParameter("content").getBytes());
		targetNotification.setNotificationNo( Integer.parseInt(request.getParameter("nid")));
		boolean result = work_service.delNotification(targetNotification);
		Decorator.asUTF8(response).getWriter().print("<script>alert('通知删除结果为："+(result?"是":"否")+"'); window.location = \"WorkManage\";</script>");
	}
	@RequestMapping( value="/change_notify")
	public void change_notify( ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		Notification changedNotification = new Notification();
		Decorator.asUTF8(request);
		changedNotification.setNotificationContent( request.getParameter("content").getBytes());
		changedNotification.setNotificationContent(request.getParameter("content").getBytes());
		changedNotification.setTitle(request.getParameter("title"));
		changedNotification.setSocietyNo( Integer.parseInt(request.getParameter("society_no")));
		changedNotification.setPublisherNo( Integer.parseInt(request.getParameter("publisher_no")));
		changedNotification.setPublishTime( TypeTransfer.Str2Date(request.getParameter("publish_time")));
		boolean result = work_service.changeNotification(changedNotification);
		Decorator.asUTF8(response).getWriter().print("<script>alert('通知修改结果为："+(result?"是":"否")+"'); window.location = \"WorkManage\";</script>");
	}
	
	@RequestMapping(value="/add_notify" ,method=RequestMethod.POST)
	public void add_notify( ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		Notification newNotification = new Notification();
		Decorator.asUTF8(request);
		newNotification.setNotificationContent(request.getParameter("content").getBytes());
		newNotification.setTitle(request.getParameter("title"));
		newNotification.setSocietyNo( Integer.parseInt(request.getParameter("society_no")));
		newNotification.setPublisherNo( Integer.parseInt(request.getParameter("publisher_no")));
		newNotification.setPublishTime( TypeTransfer.Str2Date(request.getParameter("publish_time")));
		int notification_no = work_service.addNotification(newNotification);
		Decorator.asUTF8(response).getWriter().print("<script>alert('新添加的通知Id为："+notification_no+"'); window.location = \"WorkManage\";</script>");
	}
	
	@RequestMapping(value="/WorkPlans")
	public ModelAndView show_workplan(ModelAndView mv) {
		mv.addObject("workplan_list", work_service.showAllWorkplans());
		return mv;
	}
	
	@RequestMapping(value="/WorkPlanAdd")
	public String add_plan_ui() {
		return "WorkPlanAdd";
	}
	
	@RequestMapping(value="/WorkPlanDel") 
	public String del_plan_ui() {
		return "WorkPlanDel";
	}
	
	@RequestMapping( value="/del_workplan")
	public void del_plan(HttpSession session, ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		int sys_no = this.readSysNo(request);
		WorkPlan targetWorkPlan = new WorkPlan();
		Decorator.asUTF8(request);
		targetWorkPlan.setRemark(request.getParameter("content").getBytes());
		targetWorkPlan.setTitle( request.getParameter("title"));
		targetWorkPlan.setStatus( Integer.parseInt(request.getParameter("plan_status")));
		targetWorkPlan.setSysNo( Integer.parseInt(request.getParameter("planer_no")));
		targetWorkPlan.setStatus(0);
		targetWorkPlan.setSysNo(sys_no);
		targetWorkPlan.setHappenDate( TypeTransfer.Str2Date(request.getParameter("happen_time")));
		boolean result = work_service.delPlan(targetWorkPlan);
		Decorator.asUTF8(response).getWriter().print("<script>alert('工作计划删除结果为："+(result?"是":"否")+"'); window.location = \"WorkManage\";</script>");
	}

	@RequestMapping( value="/change_workplan")
	public void change_plan(ModelAndView mv, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ParseException, IOException {
		int sys_no = this.readSysNo(request);
		WorkPlan changedWorkPlan = new WorkPlan();
		Decorator.asUTF8(request);
		changedWorkPlan.setRemark(request.getParameter("content").getBytes());
		changedWorkPlan.setTitle( request.getParameter("title"));
		changedWorkPlan.setStatus( Integer.parseInt(request.getParameter("plan_status")));
		changedWorkPlan.setSysNo( Integer.parseInt(request.getParameter("planer_no")));
		changedWorkPlan.setStatus(0);
		changedWorkPlan.setSysNo(sys_no);
		changedWorkPlan.setHappenDate( TypeTransfer.Str2Date(request.getParameter("happen_time")));
		boolean result = work_service.changePlan(changedWorkPlan);
		Decorator.asUTF8(response).getWriter().print("<script>alert('工作计划变更结果为："+(result?"是":"否")+"'); window.location = \"WorkManage\";</script>");
	}
	@RequestMapping(value="/add_workplan" ,method=RequestMethod.POST)
	public void add_workplan(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		int sys_no = readSysNo(request);
		WorkPlan newPlan = new WorkPlan();
		Decorator.asUTF8(request);
		newPlan.setRemark(request.getParameter("content").getBytes());
		newPlan.setTitle( request.getParameter("title"));
		newPlan.setStatus( Integer.parseInt(request.getParameter("plan_status")));
		newPlan.setSysNo( Integer.parseInt(request.getParameter("planer_no")));
		newPlan.setStatus(0);
		newPlan.setSysNo(sys_no);
		newPlan.setHappenDate( TypeTransfer.Str2Date(request.getParameter("happen_time")));
		boolean result = work_service.addPlan(newPlan);
        Decorator.asUTF8(response).getWriter().print("<script>alert('计划添加结果为："+(result?"成功":"失败")+"'); window.location = \"WorkManage\";</script>");
	}

	private int readSysNo(HttpServletRequest request) {
		int sys_no = -1;
		Object o = request.getSession().getAttribute("login_staff");
		if( o != null && o instanceof Staff) {
			sys_no = ((Staff)o).getSysNo();
		}
		return sys_no;
	}
	

}

package com.gsb.MainPackage.WorkManager;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGPOJO.Notification;
import com.gsb.BasicObject.MBGPOJO.WorkPlan;
import com.gsb.BasicObject.Services.WorkService;
import com.gsb.Utils.TypeTransfer;

@Controller
public class WorkController {
	
	@Autowired
	WorkService work_service;
	
	@RequestMapping(value="/Notifications")
	public ModelAndView show_notify( ModelAndView mv) {
		mv.addObject("notify_list", work_service.showAllNotification());
		return mv;
	}
	
	@RequestMapping(value="/NotificationAdd")
	public String add_notify_ui() {
		return "NotificationAdd";
	}
	
	@RequestMapping(value="/add_notify" ,method=RequestMethod.POST)
	public void add_notify( ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		Notification newNotification = new Notification();
		request.setCharacterEncoding("UTF-8");
		newNotification.setNotificationContent(request.getParameter("content").getBytes());
		newNotification.setTitle(request.getParameter("title"));
		newNotification.setSocietyNo( Integer.parseInt(request.getParameter("society_no")));
		newNotification.setPublisherNo( Integer.parseInt(request.getParameter("publisher_no")));
		newNotification.setPublishTime( TypeTransfer.Str2Date(request.getParameter("publish_time")));
		int notification_no = work_service.addNotification(newNotification);
		response.setContentType("text/html; charset=UTF-8");
        response.getWriter().print("<script>alert('新添加的通知Id为："+notification_no+"'); window.location = \"Notifications\";</script>");
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
	
	@RequestMapping(value="/add_workplan" ,method=RequestMethod.POST)
	public void add_workplan( ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		System.out.println("add_plan started");
		WorkPlan newPlan = new WorkPlan();
		request.setCharacterEncoding("UTF-8");
		newPlan.setRemark(request.getParameter("content").getBytes());
		newPlan.setTitle( request.getParameter("title"));
		newPlan.setStatus( Integer.parseInt(request.getParameter("plan_status")));
		newPlan.setSysNo( Integer.parseInt(request.getParameter("planer_no")));
		newPlan.setStatus(0);
		newPlan.setSysNo(0);
		newPlan.setHappenDate( TypeTransfer.Str2Date(request.getParameter("happen_time")));
		boolean result = false;
		if(work_service.addPlan(newPlan)) {
			result = true;
		}
		response.setContentType("text/html; charset=UTF-8");
        response.getWriter().print("<script>alert('计划添加结果为："+(result?"成功":"失败")+"'); window.location = \"WorkPlans\";</script>");
	}
	

}

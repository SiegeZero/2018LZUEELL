package MainPackage.HumanManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import BasicObject.Target;

@Controller
public class HMController {
	
	@ModelAttribute
	public void setAttribute( ModelAndView mv) {
		mv.addObject("hello", "hello");
	}
	
	@RequestMapping(value="/TestHMControllerPage")
	public ModelAndView test(ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value="/HMDtal", method=RequestMethod.GET)
	public ModelAndView query( @RequestParam("id") String id, ModelAndView mv) {
		Target t = Target.getById( id);
		mv.addObject("target", t);
		return mv;
	}
	
	@RequestMapping(value="/HMHome")
	public ModelAndView home(ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value="/HMMang")
	public ModelAndView manage( ModelAndView mv) {
		return mv;
	}
	
	
	
	@RequestMapping(value="/HMPaty")
	public ModelAndView party( ModelAndView mv) {
		return mv;
	}
	
	
}

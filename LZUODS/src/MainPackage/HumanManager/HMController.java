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
	
	@RequestMapping(value="/query", method=RequestMethod.POST)
	public Target query( @RequestParam("id") String id) {
		Target t = Target.getById( id);
		return t;
	}
	
	@RequestMapping(value="/HMHome")
	public ModelAndView home(ModelAndView mv) {
		return mv;
	}
	
}

package TestPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestNameOnlyKlass {
	
	@RequestMapping(value="/TestNameOnlyPage")
	public String sayHi( ModelAndView mv) {
		return "TestNameOnlyPage";
	}
	
	@RequestMapping(value="/TestNameOnlyPageWithTitle")
	public ModelAndView sayHiAgain() {
		ModelAndView mv = new ModelAndView("/WEB-INF/views/testPages/TestNameOnlyPage.jsp");
		mv.addObject("title", "TestNameOnlyPage");
		return mv;
	}
}

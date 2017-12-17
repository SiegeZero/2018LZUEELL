package TestPackage.AutoPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestKlassWithTitle {

	@RequestMapping(value="/TestKlassWithTitle")
	public Model sayHi( Model m) {
		m.addAttribute("title", "TestKlassWithTitle");
		return m;
	}
}

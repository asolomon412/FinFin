package finalprep.FinFin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import finalprep.FinFin.daorepo.PersonRepository;

@Controller
public class PersonController {
	@Autowired
	PersonRepository pr;
	
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@GetMapping("/search")
	public ModelAndView search(@RequestParam("person") String name) {
		
		return new ModelAndView("results", "personinfo", pr.findByNameContaining(name));
	}
	
	
	@GetMapping("/colorresults")
	public ModelAndView colorResults(@RequestParam("color") String col) {
		
		return new ModelAndView("results", "personinfo", pr.findByFavColor(col));
	}

}

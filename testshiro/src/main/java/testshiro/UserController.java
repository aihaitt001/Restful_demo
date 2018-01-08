package testshiro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {
	@RequestMapping(value = "/user")
	public ModelAndView user(ModelAndView mav) {
		System.out.println("user");
		mav.setViewName("user");
		return mav;
	}

	@RequestMapping(value = "/listuser")
	public ModelAndView listuser(ModelAndView mav) {
		System.out.println("listuser");
		mav.setViewName("listuser");
		return mav;
	}
}

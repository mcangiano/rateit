package it.mc.spin.presentation.html.login.controller;

import it.mc.spin.presentation.html.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController extends BaseController {

	@RequestMapping(method = RequestMethod.GET)
	public String show(final ModelMap model) {

		model.addAttribute("form", new LoginForm());
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(final LoginForm form, final ModelMap model) {

		model.addAttribute("form", form);
		return "loginSuccess";
	}
}

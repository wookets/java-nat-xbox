package com.wookets.nat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wookets.nat.model.Vote;

@Controller
@RequestMapping("/votes")
public class VoteController {

   @RequestMapping(value = "/", method = RequestMethod.GET, produces="application/json")
   public Vote printHello(ModelMap model) {
      model.addAttribute("message", "Hello Meow!");
      return new Vote();//"hello";
   }
	
}

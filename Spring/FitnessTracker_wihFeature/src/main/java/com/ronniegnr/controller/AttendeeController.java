package com.ronniegnr.controller;

import com.ronniegnr.model.Attendee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AttendeeController {

    @RequestMapping(value = "/attendee", method = RequestMethod.GET)
    public String showAttendeePage(Model model) {
        model.addAttribute("attendee", new Attendee());
        return "attendee";
    }

    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
    public String getAttendee(@ModelAttribute("attendee") Attendee attendee) {
        System.out.println(attendee);
        return "redirect:attendee";
    }

}

package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/welcome")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
    {

        String name=request.getParameter("name");
        User us=new User();
        us.setName(name);
        ModelAndView mv=new ModelAndView("display");
        mv.addObject("uname",us.getName());
        return mv;
    }
}

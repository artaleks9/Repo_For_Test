package com.codenvy.example.spring;

//123456789
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.codenvy.example.spring.gg.PklassRename;

public class GreetingContr implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse respon) throws Exception {
        String userName = req.getParameter("user");
        String result = "";
        if (userName != null) {
            result = "Hello, " + userName + "!";
        }
        String s,n;
        
        
        ModelAndView view = new ModelAndView("hello_view");
        view.addObject("greeting", result);
        return view;
    }
    PklassRename pklass = new PklassRename();
}

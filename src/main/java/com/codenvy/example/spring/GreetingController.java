package com.codenvy.example.spring;

//123456789
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.codenvy.example.spring.rr.Pklass;

public class GreetingController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userName = request.getParameter("user");
        String result = "";
        if (userName != null) {
            result = "Hello, " + userName + "!";
        }
        String s;
        double n = 4.8;
        ModelAndView view = new ModelAndView("hello_view");
        view.addObject("greeting", result);
        return view;
    }
    Pklass pklass = new Pklass();
}

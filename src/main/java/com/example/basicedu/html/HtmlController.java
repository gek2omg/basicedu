package com.example.basicedu.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HtmlController {


    @PostMapping("/html/html02")
    public String html02Proc(HttpServletRequest request) {
        System.out.printf("html02 메인 페이지 진입 ");

        System.out.printf(request.getParameter("title"));
        System.out.printf(request.getParameter("content"));
        System.out.printf("-----------------------------");

        return "";
    }
}

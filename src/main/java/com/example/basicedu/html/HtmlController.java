package com.example.basicedu.html;

import com.example.basicedu.html.dto.Html03Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class HtmlController {

    private final HtmlService htmlService;


    @PostMapping("/html/html02")
    public String html02Proc(HttpServletRequest request) {
        System.out.printf("html02 메인 페이지 진입 ");

        System.out.printf(request.getParameter("title"));
        System.out.printf(request.getParameter("content"));
        System.out.printf("-----------------------------");

        return "";
    }


    @PostMapping("/html/html03")
    public String html03Proc(Html03Dto html03Dto) {
        System.out.printf("html03 메인 페이지 진입 ");

        System.out.printf(html03Dto.getTitle());
        System.out.printf(html03Dto.getContent());
        System.out.printf("-----------------------------");

        return "";
    }


    @PostMapping("/html/html04")
    public String html04Proc(Html03Dto html03Dto) {

        return htmlService.html04(html03Dto);
    }

}

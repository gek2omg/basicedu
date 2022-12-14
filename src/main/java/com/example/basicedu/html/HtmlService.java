package com.example.basicedu.html;

import com.example.basicedu.html.dto.Html03Dto;
import com.example.basicedu.html.entity.Html;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HtmlService {

    private final HtmlRepository htmlRepository;

    public void html04(Html03Dto html03Dto) {

//        html 객체 담기

        Html html = Html.builder()
                .title(html03Dto.getTitle())
                .content(html03Dto.getContent())
                .build();

//       html 저장하기
        htmlRepository.save(html);

    }

    public List<Html> searchFindAll() {

        return htmlRepository.findAll();
    }

}

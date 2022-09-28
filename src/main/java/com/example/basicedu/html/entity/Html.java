package com.example.basicedu.html.entity;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Html {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="html_id")
    private Long id;

    private String title;

    private String content;

}

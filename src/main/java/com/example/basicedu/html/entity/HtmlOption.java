package com.example.basicedu.html.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="html_option")
public class HtmlOption {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="option_id")
    private long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="html_id", updatable = false)
    private Html html;

    private String name;


    public void setHtml(Html html) {
        this.html = html;
        html.getHtmlOptions().add(this);
    }

}

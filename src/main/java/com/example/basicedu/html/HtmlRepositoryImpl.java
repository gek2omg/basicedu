package com.example.basicedu.html;

import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;

import javax.persistence.EntityManager;

public class HtmlRepositoryImpl implements HtmlRepositoryCustom {

    private final JpaQueryFactory jpaQueryFactory;

    public HtmlRepositoryImpl(EntityManager em) {
        this.jpaQueryFactory = new JpaQueryFactory(em);
    }

}

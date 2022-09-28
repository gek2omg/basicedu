package com.example.basicedu.html;


import com.example.basicedu.html.entity.Html;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HtmlRepository extends JpaRepository<Html, Long> {
}

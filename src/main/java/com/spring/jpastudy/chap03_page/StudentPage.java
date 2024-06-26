package com.spring.jpastudy.chap03_page;

import com.spring.jpastudy.chap02.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentPage extends JpaRepository<Student, String > {

    //전체조회 상황에서 페이징 처리하기
    //따러 만들 필요 없음 문법에 있는 거임
    Page<Student> findAll(Pageable pageable);

    //검색 + 페이징
    Page<Student> findByNameContaining(String name, Pageable pageable);

//    @Query("")
//    Page<Student> getList;
}

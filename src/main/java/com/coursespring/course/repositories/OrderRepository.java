package com.coursespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespring.course.entities.Order;

//Não precisa da annotation @Repository porque já
//herda o componente do Spring 'JpaRepository'
public interface OrderRepository extends JpaRepository<Order, Long>{

}

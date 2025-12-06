package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {

	@Autowired
	private OrderService orderService;
	
    @GetMapping
    private ResponseEntity<List<Order>> findAll() {
      List <Order> orderList = orderService.findAll();
        return ResponseEntity.ok().body(orderList);
    }
    
    @GetMapping(value = "/{id}")
    private ResponseEntity<Order> findById (@PathVariable Long id) {
    	Order obj = orderService.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
 }

package com.self.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.self.repository.BlogRepository;

import org.springframework.http.HttpStatus;

//@RequestMapping("api/v1")
@RestController
public class BlogController {
 
   @Autowired
   private BlogRepository blogRepository;
   
   @RequestMapping("/")
   public String test() {
       return "Hello World!";
   }
 
   @GetMapping("/blogs")
   public List<Blog> findAll() {
       return (List<Blog>)blogRepository.findAll();
   }
 
   @PostMapping("/blog")
   @ResponseStatus(HttpStatus.CREATED)
  public Blog saveBlog(@Valid @RequestBody Blog savedBlog) {
       return blogRepository.save(savedBlog);
   }
   
}
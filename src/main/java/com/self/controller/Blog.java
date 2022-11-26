package com.self.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Blog {
      public Blog() {
    	  System.out.println("In Blog DTO");
   }
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   @NotNull
   @Size(min = 2, message = "Blog Title must have at least 2 characters")
   private String blogTitle;
   @NotBlank(message = "Blog Editor cannot be blank")
   private String blogEditor;
   @Email(message = "Email should be valid")
   private String blogEmail;
  
// Getters and Setters
}
package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Robert Hemingway on 03/05/2017.
 */
 @Entity
 /* Defines the Bars on the site and their features i.e. ID and Message
-------------------------------------------------- */
 public class Bar {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String bar;

     public Bar(){
     }

     public Bar(String message){
         this.bar = message;
     }

     public long getId() {
         return id;
     }

     public String getBar() {
         return bar;
     }

     public void setBar(String message) {
         this.bar = message;
     }
 }

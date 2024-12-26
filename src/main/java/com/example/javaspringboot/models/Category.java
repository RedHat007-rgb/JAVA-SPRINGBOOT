package com.example.javaspringboot.models;


import lombok.Getter;
import lombok.Setter;


public class Category {

   private long id;
   private String title;

   public void setId(long id) {
       this.id = id;
   }
   public void setTitle(String title) {
       this.title = title;
   }
   public long getId() {
       return id;
   }
   public String getTitle() {
       return title;
   }


}

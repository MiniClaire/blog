package com.example.demo.model;

import java.util.Date;

public class Post {
       private long id;
       private String title;
       private String content;
       private Date created;
       public Post(String title, String content) {
    	   this.title = title;
    	   this.content = content;
       }
}

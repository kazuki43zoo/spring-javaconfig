package com.springapp.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class Todo {
    private String todoId;
    private String todoTitle;
    private Boolean finished;
    private Date createdAt;
}

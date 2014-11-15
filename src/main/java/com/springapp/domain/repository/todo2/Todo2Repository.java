package com.springapp.domain.repository.todo2;

import com.springapp.domain.model.Todo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Todo2Repository {

    @Select("SELECT todo_id , todo_title , finished ,created_at FROM t_todo ORDER BY todo_id")
    List<Todo> findAll();

}

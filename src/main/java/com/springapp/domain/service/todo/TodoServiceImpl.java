package com.springapp.domain.service.todo;

import com.springapp.domain.model.Todo;
import com.springapp.domain.repository.todo.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by shimizukazuki on 2014/11/14.
 */
@Service
@Transactional
public class TodoServiceImpl implements TodoService {

    @Inject
    TodoRepository todoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
}

package com.springapp.domain.service.todo;

import com.springapp.domain.model.Todo;
import com.springapp.domain.repository.todo.TodoRepository;
import com.springapp.domain.repository.todo2.Todo2Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {

    @Inject
    TodoRepository todoRepository;

    @Inject
    Todo2Repository todo2Repository;

    @Transactional(readOnly = true)
    @Override
    public List<Todo> getTodos() {
        List<Todo> todos = new ArrayList<>();
        todos.addAll(todoRepository.findAll());
        todos.addAll(todo2Repository.findAll());
        return todos;

    }
}

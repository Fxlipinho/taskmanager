package com.felipe.taskmanager.controller;

import com.felipe.taskmanager.entity.Task;
import com.felipe.taskmanager.facade.TaskFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskFacade taskFacade;

    public TaskController(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskFacade.create(task);
    }

    @GetMapping
    public List<Task> findAll(
            @RequestParam(required = false, defaultValue = "") String sort) {
        return taskFacade.findAll(sort);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id) {
        return taskFacade.findById(id);
    }

    @PutMapping("/{id}")
    public Task update(
            @PathVariable Long id,
            @RequestBody Task task) {
        return taskFacade.update(id, task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskFacade.delete(id);
    }
}
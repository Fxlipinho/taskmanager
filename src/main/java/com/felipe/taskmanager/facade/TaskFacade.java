package com.felipe.taskmanager.facade;

import com.felipe.taskmanager.entity.Task;
import com.felipe.taskmanager.service.TaskService;
import com.felipe.taskmanager.strategy.TaskSortStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskFacade {

    private final TaskService taskService;
    private final TaskSortStrategy titleSortStrategy;
    private final TaskSortStrategy dateSortStrategy;

    public TaskFacade(
            TaskService taskService,
            @Qualifier("titleSortStrategy") TaskSortStrategy titleSortStrategy,
            @Qualifier("dateSortStrategy") TaskSortStrategy dateSortStrategy) {

        this.taskService = taskService;
        this.titleSortStrategy = titleSortStrategy;
        this.dateSortStrategy = dateSortStrategy;
    }

    public Task create(Task task) {
        return taskService.create(task);
    }

    public List<Task> findAll(String sort) {
        List<Task> tasks = taskService.findAll();

        if ("title".equalsIgnoreCase(sort)) {
            return titleSortStrategy.sort(tasks);
        }

        if ("date".equalsIgnoreCase(sort)) {
            return dateSortStrategy.sort(tasks);
        }

        return tasks;
    }

    public Task findById(Long id) {
        return taskService.findById(id);
    }

    public Task update(Long id, Task task) {
        return taskService.update(id, task);
    }

    public void delete(Long id) {
        taskService.delete(id);
    }
}
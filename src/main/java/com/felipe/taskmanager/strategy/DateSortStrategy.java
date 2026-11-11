package com.felipe.taskmanager.strategy;

import com.felipe.taskmanager.entity.Task;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component("dateSortStrategy")
public class DateSortStrategy implements TaskSortStrategy {

    @Override
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getCreatedAt).reversed())
                .toList();
    }
}
package com.felipe.taskmanager.strategy;

import com.felipe.taskmanager.entity.Task;
import java.util.List;

public interface TaskSortStrategy {

    List<Task> sort(List<Task> tasks);

}
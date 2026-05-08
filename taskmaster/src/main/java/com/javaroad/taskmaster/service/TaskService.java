package com.javaroad.taskmaster.service;


import com.javaroad.taskmaster.dto.TaskDto;
import com.javaroad.taskmaster.model.Task;
import com.javaroad.taskmaster.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Returns all tasks from the database mapped to TaskDto.
     */
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskDto(
                        task.getId(),
                        task.getDescription(),
                        task.isCompleted()
                ))
                .toList();
    }

    /**
     * Saves a new task to the database and returns the persisted entity.
     */
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
package com.javaroad.taskmaster.controller;


import com.javaroad.taskmaster.dto.TaskDto;
import com.javaroad.taskmaster.model.Task;
import com.javaroad.taskmaster.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Returns all tasks as a list of TaskDto — createdAt is intentionally excluded.
     */
    @GetMapping
    public List<TaskDto> getAllTasks() {
        return taskService.getAllTasks();
    }

    /**
     * Creates and persists a new task. Accepts a Task entity in the request body.
     */
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    /**
     * Deletes the task with the given id. Returns 200 OK on success.
     */
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}

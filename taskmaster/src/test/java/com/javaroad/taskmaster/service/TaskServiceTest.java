package com.javaroad.taskmaster.service;

import com.javaroad.taskmaster.dto.TaskDto;
import com.javaroad.taskmaster.model.Task;
import com.javaroad.taskmaster.repository.TaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link TaskService}.
 * Uses Mockito to mock {@link TaskRepository} — no database required.
 */
@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    // --- AB HIER STARTEN DIE TEST-METHODEN ---

    @Test
    @DisplayName("Should map all task entities to dtos correctly")
    void shouldReturnAllTasks() {
        // 1. ARRANGE: Die Test-Daten vorbereiten
        Task testTask = new Task();
        testTask.setId(1L);
        testTask.setDescription("Prepare stage");
        testTask.setCompleted(false);

        List<Task> tasksFromDb = List.of(testTask);

        // Den Mock "programmieren" (Stubbing)
        when(taskRepository.findAll()).thenReturn(tasksFromDb);

        // 2. ACT: Die Methode wirklich ausführen
        List<TaskDto> result = taskService.getAllTasks();


        // 3. ASSERT: Prüfen, ob das Ergebnis stimmt
        assertThat(result).hasSize(1);
        assertThat(result.get(0).description()).isEqualTo("Prepare stage");
        assertThat(result.get(0).id()).isEqualTo(1L);
    }
    @Test
    @DisplayName("Should save a task and return the saved entity")
    void shouldCreateTask() {
        // Arrange
        Task task = new Task();
        task.setDescription("Lightshow setup");
        when(taskRepository.save(task)).thenReturn(task);

        // Act
        Task result = taskService.createTask(task);

        // Assert
        verify(taskRepository).save(task); // Verhaltens-Assert
        assertThat(result).isEqualTo(task); // Ergebnis-Assert
    }

    @Test
    @DisplayName("Should call deleteById when deleteTask is invoked")
    void shouldDeleteTask() {
        // Arrange
        Long taskId = 1L;

        // Act
        taskService.deleteTask(taskId);

        // Assert
        // Hier gibt es kein assertThat, da deleteTask void ist!
        verify(taskRepository).deleteById(taskId); // Wir prüfen nur das Verhalten
    }
}

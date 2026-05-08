package com.javaroad.taskmaster.repository;

import com.javaroad.taskmaster.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link com.javaroad.taskmaster.model.Task} entities.
 *
 * <p>Provides standard CRUD operations automatically via JpaRepository.
 * Spring Data generates the implementation at runtime — no SQL required.
 * Custom query methods can be added here following Spring Data naming conventions.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
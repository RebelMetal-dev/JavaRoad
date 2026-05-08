package com.javaroad.taskmaster.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * JPA entity representing a task in the taskmaster application.
 *
 * <p>Mapped to the database table "tasks". Use {@link com.javaroad.taskmaster.dto.TaskDto}
 * for the public API representation — this entity is an internal database concern only.
 *
 * <p>Note: {@code @Data} is intentionally avoided. Lombok's {@code @Data} generates
 * equals() and hashCode() on all fields including id, which is null before JPA assigns
 * it. Two unsaved tasks would appear equal, breaking Set and HashMap behaviour.
 */
@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    private boolean completed = false;

    private LocalDateTime createdAt;

    /**
     * Sets createdAt to the current timestamp before the entity is first persisted.
     */
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}

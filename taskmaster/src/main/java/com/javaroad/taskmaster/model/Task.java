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

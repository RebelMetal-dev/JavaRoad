package com.javaroad.taskmaster.dto;

/**
 * Data Transfer Object for the Task entity.
 * Represents the public API view — decoupled from the database model.
 * The field createdAt is intentionally excluded (internal database concern).
 *
 * @param id          the unique task identifier
 * @param description the task description
 * @param completed   whether the task has been completed
 */
public record TaskDto(Long id, String description, boolean completed) {
}
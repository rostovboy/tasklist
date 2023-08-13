package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;

import java.util.Optional;

public interface TaskRepository {
    Optional<Task> findById(Long id);

    Optional<Task> findAllByUserId(Long UserId);

    void assignToUserById(Long taskId, Long userId);

    void update(Task task);

    void create(Task task);

    void delete(Long id);
}

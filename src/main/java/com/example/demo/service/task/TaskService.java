package com.example.demo.service.task;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.repository.task.TaskRecord;
import com.example.demo.repository.task.TaskRepository;
import com.example.demo.service.task.exception.TaskEntityNotFoundExeption;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskEntity find(long taskId) {
        return taskRepository.select(taskId)
            .map(record -> new TaskEntity(record.getId(), record.getTitle()))
            .orElseThrow(() -> new TaskEntityNotFoundExeption(taskId));
    }

    public List<TaskEntity> find(long offset, int limit) {
        var recordList = taskRepository.selectList(offset, limit);
        var entityList = recordList.stream().map(record -> {
            var entity = new TaskEntity(record.getId(), record.getTitle());
            return entity;
        }).collect(Collectors.toList());

        return entityList;
    }

    public TaskEntity create(String title) {
        var record = new TaskRecord(null, title);
        taskRepository.insert(record);

        return new TaskEntity(record.getId(), record.getTitle());
    }

    public void update(long taskId, String title) {
        taskRepository.select(taskId)
            .orElseThrow(() -> new TaskEntityNotFoundExeption(taskId));
        taskRepository.update(new TaskRecord(taskId, title));
    }

    public void delete(long taskId) {
        taskRepository.select(taskId)
            .orElseThrow(() -> new TaskEntityNotFoundExeption(taskId));
        taskRepository.delete(taskId);
    }
}

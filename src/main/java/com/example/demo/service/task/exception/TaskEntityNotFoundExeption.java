package com.example.demo.service.task.exception;

public class TaskEntityNotFoundExeption extends RuntimeException{
    private long taskId;

    public TaskEntityNotFoundExeption(long taskId) {
        super("TaskEntity (id = " + taskId + ") is not found." );
    }
}

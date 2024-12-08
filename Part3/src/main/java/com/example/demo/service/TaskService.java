package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Task;
import com.examples.demo.repositories.TaskRepository;


@Service("taskService")

public class TaskService {

	@Autowired
	private TaskRepository taskRepo;
	public List<Task> getAllToDo() {
		
		return taskRepo.findAll();
	}
	public Task getTaskById(long id) {
		
		return taskRepo.findById(id).get();
	}
	public Task saveTask(Task todo) {
		
		return taskRepo.save(todo);
	}
	public void removeTask(Task todo) {
		taskRepo.delete(todo);
	}
	public void deleteById(long l) {
		taskRepo.deleteById(l);
		
	}}

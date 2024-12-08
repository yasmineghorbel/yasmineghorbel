package com.examples.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Task;

@Repository("taskRepository")

public interface TaskRepository  extends JpaRepository<Task, Long> {

}

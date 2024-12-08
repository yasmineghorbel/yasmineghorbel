package com.example.demo.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data@AllArgsConstructor@NoArgsConstructor
@Builder
public class Task implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String title ;
	private String description ;
	private Date dueDate ;
	private String category ;
	private String priority;
	private String completionStatus ;
}

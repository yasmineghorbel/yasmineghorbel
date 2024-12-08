package comp.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Task;
import com.example.demo.service.TaskService;


@RestController

public class TaskController {

	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	@Autowired
	private TaskService taskService;
	
	@GetMapping(value="/task")
	public List <Task> getAllToDo(){
    	logger.info("Returning all the Tasks");
		return taskService.getAllToDo();
	}
	
	@GetMapping(value = "/task/{id}")
	public Task getTaskById(@PathVariable("id") long id) throws Exception{
    	logger.info("ToDo id to return " + id);
    	Task task = taskService.getTaskById(id);
    	
    	if (task == null || task.getId() <= 0){
            throw new Exception("task doesn't exist");
    	}
	return taskService.getTaskById(id);
    }
	@PostMapping("/task")
	 Task newEmployee(@RequestBody Task task) {
	    return taskService.saveTask(task);
	  }
	//update exemple juste pour le titre et description 
	@PutMapping("/task/{id}")
	  Task replaceTask(@RequestBody Task newtask, @PathVariable Long id) {
	    Task task=taskService.getTaskById(id);
	        task.setTitle(newtask.getTitle());
	        task.setDescription(newtask.getDescription());
	        return taskService.saveTask(task);
	     
	  }
	  @DeleteMapping("/task/{id}")
	  void deleteTask(@PathVariable Long id) {
		  taskService.deleteById(id);
	  }
}

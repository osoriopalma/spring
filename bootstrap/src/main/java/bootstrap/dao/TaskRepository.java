package bootstrap.dao;

import org.springframework.data.repository.CrudRepository;

import bootstrap.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}

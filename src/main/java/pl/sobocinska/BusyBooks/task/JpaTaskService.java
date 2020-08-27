package pl.sobocinska.BusyBooks.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JpaTaskService implements TaskService {
    private final TaskRepository repository;

    @Autowired
    public JpaTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> findTasks() {
        return repository.findAll();
    }

    @Override
    public Task findTaskById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public void createTask(Task task) {
        repository.save(task);
    }

    @Override
    public void editTask(Task task) {
        repository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        repository.delete(repository.getOne(id));
    }
}

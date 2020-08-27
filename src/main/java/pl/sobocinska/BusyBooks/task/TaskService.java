package pl.sobocinska.BusyBooks.task;

import java.util.List;

public interface TaskService {

    List<Task> findTasks();
    Task findTaskById(Long id);
    void createTask(Task task);
    void editTask(Task task);
    void deleteTask(Long id);
}

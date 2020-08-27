package pl.sobocinska.BusyBooks.taskDictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JpaTaskDictService implements TaskDictService {
    private final TaskDictRepository repository;

    @Autowired
    public JpaTaskDictService(TaskDictRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TasksDictionary> findTask() {
        return repository.findAll();
    }

    @Override
    public TasksDictionary findTaskById(Long id) {
        return repository.getOne(id);
    }
}

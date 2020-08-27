package pl.sobocinska.BusyBooks.statusTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JpaStatusTaskService implements StatusTaskService {
    private final StatusTaskRepository repository;

    @Autowired
    public JpaStatusTaskService(StatusTaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StatusTaskDictionary> findStatus() {
        return repository.findAll();
    }

    @Override
    public StatusTaskDictionary findStatusById(Long id) {
        return repository.getOne(id);
    }
}

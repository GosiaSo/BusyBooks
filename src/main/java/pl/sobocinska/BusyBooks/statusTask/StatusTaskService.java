package pl.sobocinska.BusyBooks.statusTask;

import java.util.List;

public interface StatusTaskService {
    List<StatusTaskDictionary> findStatus();
    StatusTaskDictionary findStatusById(Long id);
}

package pl.sobocinska.BusyBooks.taskDictionary;

import java.util.List;

public interface TaskDictService {

    List<TasksDictionary> findTask();
    TasksDictionary findTaskById(Long id);
}

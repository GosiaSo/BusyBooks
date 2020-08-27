package pl.sobocinska.BusyBooks.taskDictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDictRepository extends JpaRepository<TasksDictionary, Long> {
}

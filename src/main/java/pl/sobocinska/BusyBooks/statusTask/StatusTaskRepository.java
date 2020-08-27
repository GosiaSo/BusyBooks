package pl.sobocinska.BusyBooks.statusTask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusTaskRepository extends JpaRepository<StatusTaskDictionary, Long> {
}

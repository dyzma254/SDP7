package pl.dyzma254.demospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dyzma254.demospringdata.dao.Task;

@Repository("TaskRepository")
public interface TaskRepository extends JpaRepository<Task, Long> {
}

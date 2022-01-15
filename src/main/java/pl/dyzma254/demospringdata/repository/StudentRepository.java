package pl.dyzma254.demospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.dyzma254.demospringdata.dao.Student;

import java.util.List;

@Repository("StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query
    List<Student> findByName(String name);
}

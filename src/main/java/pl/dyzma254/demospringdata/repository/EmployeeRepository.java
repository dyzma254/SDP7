package pl.dyzma254.demospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dyzma254.demospringdata.dao.Employee;

@Repository("EmployeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

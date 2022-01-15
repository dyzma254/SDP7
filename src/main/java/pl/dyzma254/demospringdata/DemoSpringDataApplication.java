package pl.dyzma254.demospringdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.dyzma254.demospringdata.dao.Employee;
import pl.dyzma254.demospringdata.dao.Task;
import pl.dyzma254.demospringdata.repository.EmployeeRepository;
import pl.dyzma254.demospringdata.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoSpringDataApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmployeeRepository employeeRepository;
    private final TaskRepository taskRepository;

    public DemoSpringDataApplication(EmployeeRepository employeeRepository, TaskRepository taskRepository) {
        this.employeeRepository = employeeRepository;
        this.taskRepository = taskRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args){

        logger.info("{}", taskRepository.findAll());

        Optional<Employee> optionalEmployee = employeeRepository.findById(1L);
        Employee employee = optionalEmployee.get();
        employee.setTasks(List.of(new Task(1, "To nie jest task")));
        employeeRepository.save(employee);
        logger.info("{}", taskRepository.findAll());

        employeeRepository.delete(employee);
        logger.info("{}", taskRepository.findAll());
    }
}

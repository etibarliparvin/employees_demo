package az.example.nadirbey_demo.service.impl;

import az.example.nadirbey_demo.dto.request.EmployeeRequest;
import az.example.nadirbey_demo.dto.response.EmployeeResponse;
import az.example.nadirbey_demo.entity.Employee;
import az.example.nadirbey_demo.mapper.EmployeeMapper;
import az.example.nadirbey_demo.repository.EmployeeRepository;
import az.example.nadirbey_demo.service.inter.EmployeeServiceInter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInter {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest request) {
        return EmployeeMapper.toResponse(employeeRepository.save(EmployeeMapper.toEmployee(request)));
    }

    @Override
    public EmployeeResponse findById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return EmployeeMapper.toResponse(employee.get());
        }
        throw new RuntimeException("Object not found");
    }

    @Override
    public List<EmployeeResponse> findAll() {
        List<Employee> employees = employeeRepository.findAll();
//        List<EmployeeResponse> responses = new ArrayList<>();
//        for (Employee employee : employees) {
//            responses.add(EmployeeMapper.toResponse(employee));
//        }
//        return responses;
        return employees.stream().map(employee -> EmployeeMapper.toResponse(employee)).collect(Collectors.toList());
    }
}

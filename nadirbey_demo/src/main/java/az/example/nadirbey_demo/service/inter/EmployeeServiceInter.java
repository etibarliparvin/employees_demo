package az.example.nadirbey_demo.service.inter;

import az.example.nadirbey_demo.dto.request.EmployeeRequest;
import az.example.nadirbey_demo.dto.response.EmployeeResponse;

import java.util.List;

public interface EmployeeServiceInter {

    EmployeeResponse createEmployee(EmployeeRequest request);

    EmployeeResponse findById(Long id);

    List<EmployeeResponse> findAll();
}

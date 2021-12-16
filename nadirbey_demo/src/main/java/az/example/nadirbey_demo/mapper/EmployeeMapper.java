package az.example.nadirbey_demo.mapper;

import az.example.nadirbey_demo.dto.request.EmployeeRequest;
import az.example.nadirbey_demo.dto.response.EmployeeResponse;
import az.example.nadirbey_demo.entity.Employee;

public class EmployeeMapper {

    public static Employee toEmployee(EmployeeRequest request) {
        return Employee.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .birthDate(request.getBirthDate())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .build();
    }

    public static EmployeeResponse toResponse(Employee employee) {
        return EmployeeResponse.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .birthDate(employee.getBirthDate())
                .email(employee.getEmail())
                .phone(employee.getPhone())
                .address(employee.getAddress())
                .build();
    }
}

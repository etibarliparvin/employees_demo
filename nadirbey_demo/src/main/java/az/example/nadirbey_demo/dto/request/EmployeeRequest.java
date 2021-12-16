package az.example.nadirbey_demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeRequest {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private String email;
    private String phone;
}

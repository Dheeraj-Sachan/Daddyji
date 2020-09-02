package jai.example.mummydaddy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int eId;
    @NotEmpty
    private String employeeName;
    private float eSalary;
}

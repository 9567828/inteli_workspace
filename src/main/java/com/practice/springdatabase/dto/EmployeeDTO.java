package com.practice.springdatabase.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {
    private Integer employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private String job_id;
    private Double salary;
    private Double commission_pct;
    private Integer manager_id;
    private Integer department_id;
}

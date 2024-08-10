package com.practice.springdatabase.mapper;

import com.practice.springdatabase.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class EmployeesMapper {
    private final SqlSessionTemplate sql;

    public List<EmployeeDTO> getAll() {
        return sql.selectList("Employees.getAll");
    }
}

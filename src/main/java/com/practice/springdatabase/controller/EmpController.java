package com.practice.springdatabase.controller;

import com.practice.springdatabase.mapper.EmployeesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/emp")
@Controller
public class EmpController {
    private final EmployeesMapper empMapper;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("empList", empMapper.getAll());
        return "emp/list";
    }
}

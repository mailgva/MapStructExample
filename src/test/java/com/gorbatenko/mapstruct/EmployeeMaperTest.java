package com.gorbatenko.mapstruct;


import com.gorbatenko.mapstruct.mapper.EmployeeMapper;
import com.gorbatenko.mapstruct.model.employee.Employee;
import com.gorbatenko.mapstruct.model.employee.EmployeeDTO;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

public class EmployeeMaperTest {
    private EmployeeMapper mapper
            = Mappers.getMapper(EmployeeMapper.class);

    @Test
    public void givenEmployeeToEmployeeDTO__whenMaps__thenCorrect() {
        Employee employee = new Employee(100, "Jack Daniels");
        EmployeeDTO employeeDTO = mapper.employeeToEmployeeDTO(employee);

        assertEquals(employee.getName(), employeeDTO.getEmployeeName());
        assertEquals(employee.getId(),
                employeeDTO.getEmployeeId());
    }
    @Test
    public void givenEmployeeDTOToEmployee__whenMaps__thenCorrect() {
        EmployeeDTO employeeDTO = new EmployeeDTO(500, "Capitan Morgan");

        Employee employee = mapper.employeeDTOtoEmployee(employeeDTO);
        assertEquals(employeeDTO.getEmployeeName(), employee.getName());
        assertEquals(employeeDTO.getEmployeeId(),
                employee.getId());
    }
}
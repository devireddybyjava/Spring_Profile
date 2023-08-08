package com.param.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.param.Entity.Employee;

public interface EmpRespository extends JpaRepository  <Employee, Integer> {

}

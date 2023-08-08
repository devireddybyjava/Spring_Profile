package com.param.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.param.Entity.Address;

public interface AddRepository  extends JpaRepository <Address, Integer> {

}


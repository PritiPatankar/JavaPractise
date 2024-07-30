package com.ltimindtree.ols.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimindtree.ols.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
    
}

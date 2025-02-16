package com.Feastify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Feastify.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

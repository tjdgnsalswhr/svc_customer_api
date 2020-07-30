package com.example.demo.customer.core.port_infra.persistent;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.core.entity.Store;

public interface StoreRepository extends JpaRepository<Store, String> {

}

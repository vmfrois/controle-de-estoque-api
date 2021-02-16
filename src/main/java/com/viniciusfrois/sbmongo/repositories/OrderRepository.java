package com.viniciusfrois.sbmongo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sbmongo.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
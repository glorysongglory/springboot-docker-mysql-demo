package com.afm.repositories;

import com.afm.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rchen on 3/12/16.
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}

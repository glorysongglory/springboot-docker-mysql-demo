package com.afm.services;

import com.afm.entities.Order;
import com.afm.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rchen on 3/12/16.
 */
@Service
public class OrderManager {

    @Autowired
    OrderRepository repository;

    public void saveOrder(Order order) {
        repository.save(order);
    }

}

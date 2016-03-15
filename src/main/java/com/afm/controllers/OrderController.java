package com.afm.controllers;

import com.afm.entities.Order;
import com.afm.services.OrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rchen on 3/12/16.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderManager manager;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveOrder(Order order) {
        manager.saveOrder(order);
    }
}

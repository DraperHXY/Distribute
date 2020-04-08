package com.draper.distribute.order.web.controller;

import com.draper.distribute.common.domain.Order;
import com.draper.distribute.order.web.service.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author draper_hxy
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private FeignOrderService feignOrderService;

    @PostMapping("")
    public String add(@RequestBody Order order) {
        return feignOrderService.add(order);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return feignOrderService.delete(id);
    }

}

package com.draper.distribute.order.web.service;

import com.draper.distribute.common.domain.Order;
import com.draper.distribute.common.service.BaseOrderService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author draper_hxy
 */
@FeignClient(value = "order-service")
public interface FeignOrderService extends BaseOrderService {

    @Override
    @RequestMapping(value = "/api/order", method = RequestMethod.POST)
    String add(@RequestBody Order order);

    @Override
    @RequestMapping(value = "/api/order/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Long id);
}

package com.draper.distribute.order.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.draper.distribute.common.domain.Order;
import com.draper.distribute.common.service.BaseOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author draper_hxy
 */
@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController implements BaseOrderService {

    @Override
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String add(@RequestBody Order order) {
        log.warn("新增订单，order = {}", order);
        return "新增订单，order = " + JSONObject.toJSONString(order);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        log.warn("删除订单，订单 id = {}", id);
        return "删除订单，订单 id = " + JSONObject.toJSONString(id);

    }

}

package com.draper.distribute.common.service;

import com.draper.distribute.common.domain.Order;

/**
 * @author draper_hxy
 */
public interface BaseOrderService {

    String add(Order order);

    String delete(Long id);

}

package com.huijia.order.service;

import com.huijia.common.pojo.TaotaoResult;
import com.huijia.order.pojo.OrderInfo;

public interface OrderService {

	TaotaoResult createOrder(OrderInfo orderInfo);
}

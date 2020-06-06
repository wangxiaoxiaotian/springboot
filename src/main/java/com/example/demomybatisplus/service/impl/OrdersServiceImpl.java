package com.example.demomybatisplus.service.impl;

import com.example.demomybatisplus.entity.Orders;
import com.example.demomybatisplus.mapper.OrdersMapper;
import com.example.demomybatisplus.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王小甜
 * @since 2020-06-06
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}

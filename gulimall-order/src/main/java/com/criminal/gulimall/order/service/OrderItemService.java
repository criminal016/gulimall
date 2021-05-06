package com.criminal.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.criminal.common.utils.PageUtils;
import com.criminal.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 14:59:32
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


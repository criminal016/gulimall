package com.criminal.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.criminal.common.utils.PageUtils;
import com.criminal.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 14:59:32
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


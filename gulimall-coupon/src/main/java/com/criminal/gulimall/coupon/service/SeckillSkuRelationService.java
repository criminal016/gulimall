package com.criminal.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.criminal.common.utils.PageUtils;
import com.criminal.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 14:46:59
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


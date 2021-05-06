package com.criminal.gulimall.coupon.dao;

import com.criminal.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 14:47:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

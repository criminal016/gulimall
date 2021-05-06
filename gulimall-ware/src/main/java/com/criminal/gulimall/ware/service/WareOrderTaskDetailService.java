package com.criminal.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.criminal.common.utils.PageUtils;
import com.criminal.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 15:03:16
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.criminal.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.criminal.common.utils.PageUtils;
import com.criminal.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 09:14:15
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}


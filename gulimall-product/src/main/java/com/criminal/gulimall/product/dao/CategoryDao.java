package com.criminal.gulimall.product.dao;

import com.criminal.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 商品三级分类
 * 
 * @author lifg
 * @email lifg@gmail.com
 * @date 2021-05-05 09:14:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}

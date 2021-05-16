package com.criminal.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.criminal.gulimall.product.entity.BrandEntity;
import com.criminal.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brand;

    @Test
    void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(7L);
//		brandEntity.setDescript("huawei");
//		brandEntity.setDescript("000");
//		brandEntity.setName("华为");
//		brand.save(brandEntity);
//		System.out.println("保存成功！");
//		brand.updateById(brandEntity);


        List<BrandEntity> list = brand.list(new QueryWrapper<BrandEntity>().eq("brand_id", 7L));

        list.forEach((item) -> {
            System.out.println(item);
        });
    }
}

package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Category;
import com.peacock.shop.web.domain.CategoryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/7/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {


    @Autowired
    CategoryMapper categoryMapper;

    @Test
    public void test(){
        CategoryExample example = new CategoryExample();
        example.or().andIsShowEqualTo(true);
        List<Category> alist = categoryMapper.selectByExample(example);
        System.out.println(alist.toString());
    }
}

package com.peacock.shop.web.service;

import com.peacock.shop.web.domain.Category;
import com.peacock.shop.web.domain.CategoryExample;
import com.peacock.shop.web.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.peacock.shop.web.common.Constants.*;

/**
 * Created by Kelvin Yeung on 2018/7/8.
 */
@Component
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据ID获取其下面所有的子类目
     * @param parentId
     * @return
     */
    public List<Category> getCategoryTreeByParentId(Short parentId) {
        if (null == parentId) {
            return null;
        }

        CategoryExample catExample = new CategoryExample();
        catExample.or().andParentIdEqualTo(parentId.shortValue()).andIsShowEqualTo(true);
        catExample.setOrderByClause("sort_order ASC, cat_id ASC");
        List<Category> categories = categoryMapper.selectByExample(catExample);

        for (Category cat : categories) {
            List<Category> categories1 = getCategoryTreeByParentId(cat.getCatId());
            cat.setChildren(categories1);
        }

        return categories;
    }
}

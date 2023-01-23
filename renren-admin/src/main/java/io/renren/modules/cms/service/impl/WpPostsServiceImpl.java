package io.renren.modules.cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.cms.dao.WpPostsDao;
import io.renren.modules.cms.dto.WpPostsDTO;
import io.renren.modules.cms.entity.WpPostsEntity;
import io.renren.modules.cms.service.WpPostsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * wp_posts表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Service
public class WpPostsServiceImpl extends CrudServiceImpl<WpPostsDao, WpPostsEntity, WpPostsDTO> implements WpPostsService {

    @Override
    public QueryWrapper<WpPostsEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WpPostsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
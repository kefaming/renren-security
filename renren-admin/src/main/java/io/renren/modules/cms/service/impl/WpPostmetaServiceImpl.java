package io.renren.modules.cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.cms.dao.WpPostmetaDao;
import io.renren.modules.cms.dto.WpPostmetaDTO;
import io.renren.modules.cms.entity.WpPostmetaEntity;
import io.renren.modules.cms.service.WpPostmetaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 文章元数据表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Service
public class WpPostmetaServiceImpl extends CrudServiceImpl<WpPostmetaDao, WpPostmetaEntity, WpPostmetaDTO> implements WpPostmetaService {

    @Override
    public QueryWrapper<WpPostmetaEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WpPostmetaEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
package io.renren.modules.cms.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.cms.entity.WpPostmetaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章元数据表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Mapper
public interface WpPostmetaDao extends BaseDao<WpPostmetaEntity> {
	
}
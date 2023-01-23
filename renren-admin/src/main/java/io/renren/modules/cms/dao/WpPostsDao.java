package io.renren.modules.cms.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.cms.entity.WpPostsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * wp_posts表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Mapper
public interface WpPostsDao extends BaseDao<WpPostsEntity> {
	
}
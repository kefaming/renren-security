package io.renren.modules.cms.service;

import io.renren.common.service.CrudService;
import io.renren.modules.cms.dto.WpPostsDTO;
import io.renren.modules.cms.entity.WpPostsEntity;

/**
 * wp_posts表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
public interface WpPostsService extends CrudService<WpPostsEntity, WpPostsDTO> {

}
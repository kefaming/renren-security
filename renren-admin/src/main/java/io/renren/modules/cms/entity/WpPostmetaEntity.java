package io.renren.modules.cms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 文章元数据表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Data
@TableName("wp_postmeta")
public class WpPostmetaEntity {

    /**
     * ID
     */
	private Long metaId;
    /**
     * 对应文章ID
     */
	private Long postId;
    /**
     * 键名
     */
	private String metaKey;
    /**
     * 
     */
	private String metaValue;
}
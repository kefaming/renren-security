package io.renren.modules.cms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 文章元数据表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Data
@ApiModel(value = "文章元数据表")
public class WpPostmetaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private Long metaId;

	@ApiModelProperty(value = "对应文章ID")
	private Long postId;

	@ApiModelProperty(value = "键名")
	private String metaKey;

	@ApiModelProperty(value = "")
	private String metaValue;


}
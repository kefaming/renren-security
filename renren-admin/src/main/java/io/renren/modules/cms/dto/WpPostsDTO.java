package io.renren.modules.cms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * wp_posts表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Data
@ApiModel(value = "wp_posts表")
public class WpPostsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "")
	private Long postAuthor;

	@ApiModelProperty(value = "")
	private Date postDate;

	@ApiModelProperty(value = "")
	private Date postDateGmt;

	@ApiModelProperty(value = "")
	private String postContent;

	@ApiModelProperty(value = "")
	private String postTitle;

	@ApiModelProperty(value = "")
	private String postExcerpt;

	@ApiModelProperty(value = "")
	private String postStatus;

	@ApiModelProperty(value = "")
	private String commentStatus;

	@ApiModelProperty(value = "")
	private String pingStatus;

	@ApiModelProperty(value = "")
	private String postPassword;

	@ApiModelProperty(value = "")
	private String postName;

	@ApiModelProperty(value = "")
	private String toPing;

	@ApiModelProperty(value = "")
	private String pinged;

	@ApiModelProperty(value = "")
	private Date postModified;

	@ApiModelProperty(value = "")
	private Date postModifiedGmt;

	@ApiModelProperty(value = "")
	private String postContentFiltered;

	@ApiModelProperty(value = "")
	private Long postParent;

	@ApiModelProperty(value = "")
	private String guid;

	@ApiModelProperty(value = "")
	private Integer menuOrder;

	@ApiModelProperty(value = "")
	private String postType;

	@ApiModelProperty(value = "")
	private String postMimeType;

	@ApiModelProperty(value = "")
	private Long commentCount;


}
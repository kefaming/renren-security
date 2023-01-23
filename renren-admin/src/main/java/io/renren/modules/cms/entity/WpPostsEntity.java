package io.renren.modules.cms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * wp_posts表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Data
@TableName("wp_posts")
public class WpPostsEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 
     */
	private Long postAuthor;
    /**
     * 
     */
	private Date postDate;
    /**
     * 
     */
	private Date postDateGmt;
    /**
     * 
     */
	private String postContent;
    /**
     * 
     */
	private String postTitle;
    /**
     * 
     */
	private String postExcerpt;
    /**
     * 
     */
	private String postStatus;
    /**
     * 
     */
	private String commentStatus;
    /**
     * 
     */
	private String pingStatus;
    /**
     * 
     */
	private String postPassword;
    /**
     * 
     */
	private String postName;
    /**
     * 
     */
	private String toPing;
    /**
     * 
     */
	private String pinged;
    /**
     * 
     */
	private Date postModified;
    /**
     * 
     */
	private Date postModifiedGmt;
    /**
     * 
     */
	private String postContentFiltered;
    /**
     * 
     */
	private Long postParent;
    /**
     * 
     */
	private String guid;
    /**
     * 
     */
	private Integer menuOrder;
    /**
     * 
     */
	private String postType;
    /**
     * 
     */
	private String postMimeType;
    /**
     * 
     */
	private Long commentCount;
}
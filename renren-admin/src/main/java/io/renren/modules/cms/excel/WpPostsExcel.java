package io.renren.modules.cms.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * wp_posts表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Data
public class WpPostsExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "")
    private Long postAuthor;
    @Excel(name = "")
    private Date postDate;
    @Excel(name = "")
    private Date postDateGmt;
    @Excel(name = "")
    private String postContent;
    @Excel(name = "")
    private String postTitle;
    @Excel(name = "")
    private String postExcerpt;
    @Excel(name = "")
    private String postStatus;
    @Excel(name = "")
    private String commentStatus;
    @Excel(name = "")
    private String pingStatus;
    @Excel(name = "")
    private String postPassword;
    @Excel(name = "")
    private String postName;
    @Excel(name = "")
    private String toPing;
    @Excel(name = "")
    private String pinged;
    @Excel(name = "")
    private Date postModified;
    @Excel(name = "")
    private Date postModifiedGmt;
    @Excel(name = "")
    private String postContentFiltered;
    @Excel(name = "")
    private Long postParent;
    @Excel(name = "")
    private String guid;
    @Excel(name = "")
    private Integer menuOrder;
    @Excel(name = "")
    private String postType;
    @Excel(name = "")
    private String postMimeType;
    @Excel(name = "")
    private Long commentCount;

}
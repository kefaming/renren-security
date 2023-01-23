package io.renren.modules.cms.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 文章元数据表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-07
 */
@Data
public class WpPostmetaExcel {
    @Excel(name = "ID")
    private Long metaId;
    @Excel(name = "对应文章ID")
    private Long postId;
    @Excel(name = "键名")
    private String metaKey;
    @Excel(name = "")
    private String metaValue;

}
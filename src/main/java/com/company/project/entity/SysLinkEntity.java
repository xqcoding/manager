package com.company.project.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.company.project.vo.req.PageReqVO;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统链接管理
 *
 * @author wenbin
 * @email *****@mail.com
 * @date 2020-07-24 09:24:03
 */
@Data
@TableName("sys_link")
public class SysLinkEntity extends PageReqVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("id")
	private String id;

	/**
	 * 链接名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 链接描述
	 */
	@TableField("description")
	private String description;

	/**
	 * 访问地址URL
	 */
	@TableField("url")
	private String url;

	/**
	 * 访问短地址URL
	 */
	@TableField("short_url")
	private String shortUrl;

	/**
	 * 点击次数
	 */
	@TableField("total_click_count")
	private Integer totalClickCount;

	/**
	 * 是否提取码访问(0：否 1：是)
	 */
	@TableField("is_open")
	private Integer isOpen;

	/**
	 * 提取码
	 */
	@TableField("extract_code")
	private String extractCode;

	/**
	 * 保存天数
	 */
	@TableField("days")
	private Integer days;

	/**
	 * 过期日期
	 */
	@TableField("expiration_date")
	private Date expirationDate;

	/**
	 * 排序
	 */
	@TableField("order_num")
	private Integer orderNum;

	/**
	 * 类型(1:普通;2:短链接;3:其它)
	 */
	@TableField("type")
	private Integer type;

	/**
	 * 状态(1:正常 0：禁用)
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	/**
	 * 是否删除(1未删除；0已删除)
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private Integer deleted;


}

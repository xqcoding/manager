package com.company.project.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: create by luzhiqiang
 * @version: v1.0
 * @packageName: com.company.project.entity
 * @projectName: springboot-manager
 * @date: 2020/7/24 11:13
 * @desc:
 */
@Data
public class SysLink implements Serializable {

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 链接名称
     */
    private String name;

    /**
     * 链接描述
     */
    private String description;

    /**
     * 访问地址URL
     */
    @NotBlank(message = "访问地址URL不能为空")
    private String url;

    /**
     * 访问短地址URL
     */
    private String shortUrl;

    /**
     * 点击次数
     */
    private Integer totalClickCount;

    /**
     * 是否提取码访问(0：否 1：是)
     *
    private Integer isOpen;

    /**
     * 提取码
     */
    private String extractCode;

    /**
     * 保存天数
     */
    private Integer days;

    /**
     * 过期日期
     */
    private Date expirationDate;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 类型(1:普通;2:短链接;3:其它)
     */
    private Integer type;

    /**
     * 状态(1:正常 0：禁用)
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 是否删除(1未删除；0已删除)
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;
}

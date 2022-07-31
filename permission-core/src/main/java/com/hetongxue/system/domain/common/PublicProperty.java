package com.hetongxue.system.domain.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 公共属性
 * @ClassNmae: PublicProperty
 * @Author: 何同学
 * @DateTime: 2022-07-31 17:07
 */
@Data
public class PublicProperty implements Serializable {

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

}
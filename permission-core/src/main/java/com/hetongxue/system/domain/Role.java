package com.hetongxue.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hetongxue.system.domain.common.PublicProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description: 角色表
 * @ClassNmae: Role
 * @Author: 何同学
 * @DateTime: 2022-07-31 18:21
 */
@Data
@Accessors(chain = true)
@TableName("sys_role")
public class Role extends PublicProperty implements Serializable {

    /**
     * 角色ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色说明
     */
    private String illustrate;

}
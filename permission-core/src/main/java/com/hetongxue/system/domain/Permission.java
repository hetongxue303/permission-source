package com.hetongxue.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hetongxue.system.domain.common.PublicProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description: 权限便
 * @ClassNmae: Permission
 * @Author: 何同学
 * @DateTime: 2022-07-31 18:22
 */
@Data
@Accessors(chain = true)
@TableName("sys_permission")
public class Permission extends PublicProperty implements Serializable {
    /**
     * 权限ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 权限名称/菜单标题
     */
    private String title;
    /**
     * 父ID[默认0]
     */
    private Long parentId;
    /**
     * 菜单类型(1:菜单[默认] 2:菜单项 3:按钮)
     */
    private Integer type;
    /**
     * 菜单排序
     */
    private Integer sort;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 菜单权限
     */
    private String code;
    /**
     * 路由名称
     */
    private String name;
    /**
     * 路由/菜单地址
     */
    private String path;
    /**
     * 是否缓存
     */
    private Boolean cache;
    /**
     * 组件地址
     */
    private String component;

}
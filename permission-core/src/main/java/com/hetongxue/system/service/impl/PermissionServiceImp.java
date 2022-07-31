package com.hetongxue.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hetongxue.system.domain.Permission;
import com.hetongxue.system.mapper.PermissionMapper;
import com.hetongxue.system.service.PermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 权限服务实现
 * @ClassNmae: PermissionServiceImp
 * @Author: 何同学
 * @DateTime: 2022-07-31 18:37
 */
@Service
@Transactional
public class PermissionServiceImp extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
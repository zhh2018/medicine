package com.jk.kit.service;

import com.jk.kit.pojo.Kit;

import java.util.Map;

/**
 * @Author：ZhangHuihui_java
 * @Description：
 * @Date：Created in 19:14 2018/1/24
 * @Modified By：
 */
public interface KitService {
    //查询
    Map<String, Object> queryKitAll(Integer pageSize, Integer start, Kit kit);
    //回显
    Kit queryKitById(Integer id);
}

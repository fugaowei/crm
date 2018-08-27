package cn.itcast.crm.service;

import cn.itcast.crm.po.BaseDict;

import java.util.List;

public interface BaseDictService {
    public List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}

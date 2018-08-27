package cn.itcast.crm.mapper;

import cn.itcast.crm.po.BaseDict;

import java.util.List;

public interface BaseDictMapper {

    public List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}

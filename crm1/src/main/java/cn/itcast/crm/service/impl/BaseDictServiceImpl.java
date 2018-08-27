package cn.itcast.crm.service.impl;

import cn.itcast.crm.mapper.BaseDictMapper;
import cn.itcast.crm.po.BaseDict;
import cn.itcast.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;
    @Override
    public List<BaseDict> queryBaseDictByTypeCode(String typeCode) {
        return baseDictMapper.queryBaseDictByTypeCode(typeCode);
    }
}

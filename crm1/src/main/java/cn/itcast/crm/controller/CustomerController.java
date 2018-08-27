package cn.itcast.crm.controller;

import cn.itcast.crm.po.BaseDict;
import cn.itcast.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping("cust")
public class CustomerController {
    @Autowired
   private BaseDictService baseDictService;
    @RequestMapping("list")
    public String list(Model model){
        List<BaseDict> fromType = baseDictService.queryBaseDictByTypeCode("002");
        model.addAttribute("fromType",fromType);
        List<BaseDict> industryType = baseDictService.queryBaseDictByTypeCode("001");
        model.addAttribute("industryType",industryType);
        return "customer";
    }
}

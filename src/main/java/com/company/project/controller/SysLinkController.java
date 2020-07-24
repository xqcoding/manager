package com.company.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import com.company.project.common.utils.DataResult;

import com.company.project.entity.SysLinkEntity;
import com.company.project.service.SysLinkService;



/**
 * 系统链接管理
 *
 * @author wenbin
 * @email *****@mail.com
 * @date 2020-07-24 09:24:03
 */
@Controller
@RequestMapping("/")
public class SysLinkController {
    @Autowired
    private SysLinkService sysLinkService;


    /**
    * 跳转到页面
    */
    @GetMapping("/index/sysLink")
    public String sysLink() {
        return "syslink/list";
        }

    @ApiOperation(value = "新增")
    @PostMapping("sysLink/add")
    @RequiresPermissions("sysLink:add")
    @ResponseBody
    public DataResult add(@RequestBody SysLinkEntity sysLink){
        sysLinkService.save(sysLink);
        return DataResult.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("sysLink/delete")
    @RequiresPermissions("sysLink:delete")
    @ResponseBody
    public DataResult delete(@RequestBody @ApiParam(value = "id集合") List<String> ids){
        sysLinkService.removeByIds(ids);
        return DataResult.success();
    }

    @ApiOperation(value = "更新")
    @PutMapping("sysLink/update")
    @RequiresPermissions("sysLink:update")
    @ResponseBody
    public DataResult update(@RequestBody SysLinkEntity sysLink){
        sysLinkService.updateById(sysLink);
        return DataResult.success();
    }

    @ApiOperation(value = "查询分页数据")
    @PostMapping("sysLink/listByPage")
    @RequiresPermissions("sysLink:list")
    @ResponseBody
    public DataResult findListByPage(@RequestBody SysLinkEntity sysLink){
        Page page = new Page(sysLink.getPage(), sysLink.getLimit());
        LambdaQueryWrapper<SysLinkEntity> queryWrapper = Wrappers.lambdaQuery();
        //查询条件示例
        //queryWrapper.eq(SysLinkEntity::getId, sysLink.getId());
        IPage<SysLinkEntity> iPage = sysLinkService.page(page, queryWrapper);
        return DataResult.success(iPage);
    }

}

package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Willie Chen
 * @Description
 * @Date 2018/10/17
 * @Param $param
 **/
@RestController
@RequestMapping("/label")
@CrossOrigin //处理跨域问题
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 查询所有
     */
  @RequestMapping(method = RequestMethod.GET)
  public Result findAll(){
      return  new Result(true, StatusCode.OK,"查找成功",labelService.findAll());
  }

    /**
     * 查询一个
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id){
       return new Result(true,StatusCode.OK,"查找成功",labelService.findById(id)) ;

   }

    /**
     * 添加
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label){
        labelService.add(label);
        return new Result(true,StatusCode.OK,"增加成功") ;

    }

    /**
     * 修改
     */
    @RequestMapping(value= "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Label label,@PathVariable String id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功") ;
    }

    /**
     * 删除
     */
    @RequestMapping(value= "/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
       labelService.deleteById(id);
       return new Result(true,StatusCode.OK,"删除成功") ;
    }
}

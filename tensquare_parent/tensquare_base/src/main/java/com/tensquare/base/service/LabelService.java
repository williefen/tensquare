package com.tensquare.base.service;

/**
 * @Author Willie Chen
 * @Description
 * @Date 2018/10/17
 * @Param $param
 **/

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

/**
 * 标签Service
 */
@Service
public class LabelService {

 @Autowired
 private LabelDao labelDao;
 @Autowired
private IdWorker idWorker;

    /**
     * 查找所有
     */
  public List<Label> findAll(){
        return  labelDao.findAll();
    }
    /**
     *查询一个
     */
    public Label findById(String id){
        return  labelDao.findById(id).get();
    }
    /**
     *增加
     */
    public void add (Label label){
        // 获取分布式id
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }
    /**
     *修改
     */
    public void update(Label label){
          labelDao.save(label);
    }

    /**
     *删除
     */
    public void deleteById(String id){
        labelDao.deleteById(id);
    }
}

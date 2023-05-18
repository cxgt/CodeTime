package com.mapper;


import com.bean.ModelDes;

public interface ModelDesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ModelDes record);

    int insertSelective(ModelDes record);

    ModelDes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ModelDes record);

    int updateByPrimaryKey(ModelDes record);
}
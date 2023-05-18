package com.service.impl;


import com.bean.ModelDes;
import com.mapper.ModelDesMapper;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private ModelDesMapper mapper;

    @Override
    public ModelDes queryById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

}

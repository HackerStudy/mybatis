package com.gdms.dao;

import com.gdms.model.FiveType;

public interface FiveTypeMapper {
    int insert(FiveType record);

    int insertSelective(FiveType record);
}
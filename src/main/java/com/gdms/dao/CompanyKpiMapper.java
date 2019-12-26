package com.gdms.dao;

import com.gdms.model.CompanyKpi;

public interface CompanyKpiMapper {
    int deleteByPrimaryKey(String kpiId);

    int insert(CompanyKpi record);

    int insertSelective(CompanyKpi record);

    CompanyKpi selectByPrimaryKey(String kpiId);

    int updateByPrimaryKeySelective(CompanyKpi record);

    int updateByPrimaryKey(CompanyKpi record);
}
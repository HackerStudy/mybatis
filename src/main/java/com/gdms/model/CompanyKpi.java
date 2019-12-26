package com.gdms.model;

import java.math.BigDecimal;
import java.util.Date;

public class CompanyKpi {
    private String kpiId;

    private String deptId;

    private String yearNumber;

    private String indexName;

    private String unitName;

    private BigDecimal goalValue;

    private String createdBy;

    private Date creationDate;

    private String lastUpdatedBy;

    private Date lastUpdateDate;

    public CompanyKpi(String kpiId, String deptId, String yearNumber, String indexName, String unitName, BigDecimal goalValue, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdateDate) {
        this.kpiId = kpiId;
        this.deptId = deptId;
        this.yearNumber = yearNumber;
        this.indexName = indexName;
        this.unitName = unitName;
        this.goalValue = goalValue;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getKpiId() {
        return kpiId;
    }

    public String getDeptId() {
        return deptId;
    }

    public String getYearNumber() {
        return yearNumber;
    }

    public String getIndexName() {
        return indexName;
    }

    public String getUnitName() {
        return unitName;
    }

    public BigDecimal getGoalValue() {
        return goalValue;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }
}
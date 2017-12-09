package com.hdu.test.model;

/**
 * Created by CTWLPC on 2017/8/28.
 */
public class Params {
    private Integer beginDate;
    private Integer endDate;
    private String areaId;

    public Params() {
    }

    public Params(Integer beginDate, Integer endDate, String areaId) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.areaId = areaId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Integer beginDate) {
        this.beginDate = beginDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Params{" +
                "beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", areaId='" + areaId + '\'' +
                '}';
    }
}

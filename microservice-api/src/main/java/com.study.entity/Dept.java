package com.study.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


public class Dept implements Serializable {

    private Long deptNo;
    private String deptName;
    //这个表对应哪个数据库
    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }


    public Dept() {
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}

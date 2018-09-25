package com.zwt.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SflpScheduledTasks implements Serializable {

    private static final long serialVersionUID = -6227695284471223431L;

    //主键ID
    private Integer id;

    //组织编码
    private String storeCode;

    //录入员工编号
    private String userCode;

    //录入员工姓名
    private String userName;

    //系统推荐增长目标（单位：元）
    private Integer adviceGrowthTarget;

    //增长目标（单位：元）
    private Integer growthTarget;

    //销售成本（单位：元）
    private Integer sellingCost;

    //增长方案ID
    private Integer planId;

    //增长方案名称
    private String planName;

    //触达客群基数
    private Integer triggerCardinality;

    //执行开始时间
    private Integer startTime;

    //执行结束时间
    private Integer endTime;

    //回写时间
    private Integer callbackTime;

    //创建时间
    private Integer createdTime;

    //是否删除
    private Integer isDelete;

    //回写状态 1: 未回写 2:回写成功 3:回写失败
    private Integer status;

    //活动ID
    private Integer actId;

}

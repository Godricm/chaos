package org.chaos.domain.vo;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2019/6/23 0023
 * \* Time: 21:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ColumnInfo {
    /**
     * 数据库字段名称
     */
    private Object columnName;

    /**
     * 允许空值
     */
    private Object isNullable;

    /**
     * 数据库字段类型
     */
    private Object columnType;

    /**
     * 数据库字段注释
     */
    private Object columnComment;

    /**
     * 数据库字段键类型
     */
    private Object columnKey;

    /**
     * 额外参数
     */
    private Object extra;

    /**
     * 查询 1：模糊；2：精确；
     */
    private String columnQuery;

    /**
     * 是否在列表显示
     */
    private String  columnShow;}

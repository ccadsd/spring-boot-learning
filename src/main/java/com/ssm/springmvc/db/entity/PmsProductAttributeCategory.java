package com.ssm.springmvc.db.entity;

public class PmsProductAttributeCategory {
    private Long id;

    private String name;

    private Integer attributeCount;

    private Integer paramCount;

    public PmsProductAttributeCategory(Long id, String name, Integer attributeCount, Integer paramCount) {
        this.id = id;
        this.name = name;
        this.attributeCount = attributeCount;
        this.paramCount = paramCount;
    }

    public PmsProductAttributeCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }
}
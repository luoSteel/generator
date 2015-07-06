package com.suse.edu.bean;

import java.math.BigDecimal;

public class Menu {
    private String menuId;

    private String name;

    private String menuDescription;

    private String type;

    private String parentId;

    private Integer sort;

    private String icon;

    private String openAddress;

    private BigDecimal enable;

    private Short leaf;

    private String menucode;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription == null ? null : menuDescription.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getOpenAddress() {
        return openAddress;
    }

    public void setOpenAddress(String openAddress) {
        this.openAddress = openAddress == null ? null : openAddress.trim();
    }

    public BigDecimal getEnable() {
        return enable;
    }

    public void setEnable(BigDecimal enable) {
        this.enable = enable;
    }

    public Short getLeaf() {
        return leaf;
    }

    public void setLeaf(Short leaf) {
        this.leaf = leaf;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode == null ? null : menucode.trim();
    }
}
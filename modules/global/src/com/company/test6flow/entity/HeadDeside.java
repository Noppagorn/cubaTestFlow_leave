package com.company.test6flow.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TEST6FLOW_HEAD_DESIDE")
@Entity(name = "test6flow_HeadDeside")
public class HeadDeside extends StandardEntity {
    private static final long serialVersionUID = 3553618499267300184L;

    @NotNull
    @Column(name = "HEAD_NAME", nullable = false)
    protected String headName;

    @NotNull
    @Column(name = "PERMISSION", nullable = false)
    protected String permission;

    public String getPermission() { return permission; }

    public void setPermission(String permission) { this.permission = permission; }

    public String getHeadName() { return headName; }

    public void setHeadName(String headName) { this.headName = headName; }
}
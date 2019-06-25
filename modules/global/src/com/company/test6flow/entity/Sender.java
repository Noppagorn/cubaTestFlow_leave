package com.company.test6flow.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "TEST6FLOW_SENDER")
@Entity(name = "test6flow_Sender")
public class Sender extends StandardEntity {
    private static final long serialVersionUID = 5900645979242850681L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "FROM_DATE", nullable = false)
    protected Date fromDate;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "TO_DATE", nullable = false)
    protected Date toDate;

    @Column(name = "STATE")
    protected String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
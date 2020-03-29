package com.vhaibrothers.car_client.model;

import com.vhaibrothers.car_client.config.ActiveStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    private Date createdAt;
    private Long createdBy;
    private Date updatedAt;
    private Long updatedBy;
    private int active;

    public BaseModel(Date createdAt, Long createdBy, Date updatedAt, Long updatedBy, int active) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.active = active;
    }

    public BaseModel() {
    }

    @PrePersist
    public void prePersist() {
        this.createdAt = new Date();
        this.active = ActiveStatus.ACTIVE.getValue();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = new Date();
    }
}

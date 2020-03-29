package com.vhaibrothers.car_client.model;

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
    private Boolean active;

    public BaseModel(Date createdAt, Long createdBy, Date updatedAt, Long updatedBy, Boolean active) {
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
        this.active = true;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = new Date();
    }
}

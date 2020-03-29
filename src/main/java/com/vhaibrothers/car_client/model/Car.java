package com.vhaibrothers.car_client.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "car")
public class Car {
    @Id
    private String carRegNo;
    @Column(unique = true, nullable = false)
    private String carEngineNo;
    @Column(unique = true, nullable = false)
    private String carChasisNo;
    private String carBrand;
    private String carBrandModel;
    @OneToOne(mappedBy = "car")
    private CarDetails carDetails;


    public Car(String carRegNo, String carEngineNo, String carChasisNo, String carBrand, String carBrandModel, CarDetails carDetails) {
        this.carRegNo = carRegNo;
        this.carEngineNo = carEngineNo;
        this.carChasisNo = carChasisNo;
        this.carBrand = carBrand;
        this.carBrandModel = carBrandModel;
        this.carDetails = carDetails;
    }

    public Car() {
    }
}

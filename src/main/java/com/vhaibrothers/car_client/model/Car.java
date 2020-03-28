package com.vhaibrothers.car_client.model;

import javax.persistence.*;

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

    public String getCarRegNo() {
        return carRegNo;
    }

    public void setCarRegNo(String carRegNo) {
        this.carRegNo = carRegNo;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrandModel() {
        return carBrandModel;
    }

    public void setCarBrandModel(String carBrandModel) {
        this.carBrandModel = carBrandModel;
    }

    public String getCarEngineNo() {
        return carEngineNo;
    }

    public void setCarEngineNo(String carEngineNo) {
        this.carEngineNo = carEngineNo;
    }

    public String getCarChasisNo() {
        return carChasisNo;
    }

    public void setCarChasisNo(String carChasisNo) {
        this.carChasisNo = carChasisNo;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }
}

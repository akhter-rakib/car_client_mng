package com.vhaibrothers.car_client.model;

import javax.persistence.*;

@Entity
public class CarDetails extends BaseModel {
    @Id
    private Long id;
    private String carCompanyName;
    private String carYearModel;
    private String carCC;
    private String carColor;
    private Double carKilometers;
    private Double price;
    @OneToOne
    @JoinColumn(name = "car_reg_no")
    private Car car;

    public CarDetails(Long id, String carCompanyName, String carYearModel, String carCC, String carColor, Double carKilometers, Double price, Car car) {
        this.id = id;
        this.carCompanyName = carCompanyName;
        this.carYearModel = carYearModel;
        this.carCC = carCC;
        this.carColor = carColor;
        this.carKilometers = carKilometers;
        this.price = price;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarCompanyName() {
        return carCompanyName;
    }

    public void setCarCompanyName(String carCompanyName) {
        this.carCompanyName = carCompanyName;
    }

    public String getCarYearModel() {
        return carYearModel;
    }

    public void setCarYearModel(String carYearModel) {
        this.carYearModel = carYearModel;
    }

    public String getCarCC() {
        return carCC;
    }

    public void setCarCC(String carCC) {
        this.carCC = carCC;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Double getCarKilometers() {
        return carKilometers;
    }

    public void setCarKilometers(Double carKilometers) {
        this.carKilometers = carKilometers;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

package com.vhaibrothers.car_client.model;

import lombok.Data;

import javax.persistence.*;

@Data
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
}

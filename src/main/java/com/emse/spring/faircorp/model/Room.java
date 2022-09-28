package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int floor;
    @Column(nullable = false)
    private String name;

    private Double currentTemperature;

    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;
    @OneToMany(mappedBy = "room")
    private Set<Window> windows;



    public Room() {
    }

    public Room(Integer floor,String name) {
        this.floor=floor;
        this.name = name;

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFloor() {
        return this.floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature= targetTemperature;
    }



}

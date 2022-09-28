package com.emse.spring.faircorp.model;


import javax.persistence.*;

@Entity
public class Heater {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true)
    private long power;
    @ManyToOne(optional = false)
    private  Room room;
    @Column(nullable = false)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(String name, Room room,HeaterStatus status) {
        this.name = name;
        this.room=room;
        this.heaterStatus = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPower() {
        return this.power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

}

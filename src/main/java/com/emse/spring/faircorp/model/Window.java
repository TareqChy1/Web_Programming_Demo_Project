package com.emse.spring.faircorp.model;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(
        name = "RWINDOW"
)
public class Window {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(optional = false)
    private  Room room;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WindowStatus windowStatus;


    public Window() {
    }

    public Window(String name, WindowStatus status) {
        this.windowStatus = status;
        this.name = name;
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

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    public void setWindowStatus(WindowStatus windowStatus) {
        this.windowStatus = windowStatus;
    }
}


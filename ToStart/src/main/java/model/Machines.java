package model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Machines")
public class Machines {

    @Id
    @Column(name = "ID")
    private int id;


    @Column(name = "Tools_count")
    private int tools_count;


    @Column(name = "Weight")
    private int Weight;


    @Column(name = "Name")
    private String name;

    @Column(name = "Motor")
    private String motor;

    @Column(name = "Floor_Space")
    private String floor_space;

    public int getId() {
        return id;
    }

    public int getTools_count() {
        return tools_count;
    }

    public int getWeight() {
        return Weight;
    }

    public String getName() {
        return name;
    }

    public String getMotor() {
        return motor;
    }

    public String getFloor_space() {
        return floor_space;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTools_count(int tools_count) {
        this.tools_count = tools_count;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setFloor_space(String floor_space) {
        this.floor_space = floor_space;
    }
}

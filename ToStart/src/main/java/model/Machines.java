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

/**
* Class representing a CNC machine.
*/
@Table(name="Machines")
public class Machines {

    /**
     * These filed represents, the attributes of a CNC machine.
     * They also get initialized as table columns.
     */
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

    /**
     * Simple getter
     * @return the value tools_count;
     */
    public int getTools_count() {
        return tools_count;
    }
    /**
     * Simple getter
     * @return the value tools_count;
     */
    public int getWeight() {
        return Weight;
    }
    /**
     * Simple getter
     * @return the name;
     */
    public String getName() {
        return name;
    }
    /**
     * Simple getter
     * @return the motor specs;
     */
    public String getMotor() {
        return motor;
    }
    /**
     * Simple getter
     * @return the floor space;
     */
    public String getFloor_space() {
        return floor_space;
    }

    /**
     * Simple setter.
     * @param id the field that will be set.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Simple setter.
     * @param tools_count the field that will be set.
     */
    public void setTools_count(int tools_count) {
        this.tools_count = tools_count;
    }
    /**
     * Simple setter.
     * @param weight the field that will be set.
     */
    public void setWeight(int weight) {
        Weight = weight;
    }
    /**
     * Simple setter.
     * @param name the field that will be set.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Simple setter.
     * @param motor the field that will be set.
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    /**
     * Simple setter.
     * @param floor_space the field that will be set.
     */
    public void setFloor_space(String floor_space) {
        this.floor_space = floor_space;
    }
}

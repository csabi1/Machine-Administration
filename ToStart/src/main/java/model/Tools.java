package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Class representing a CNC tool.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Tools")
public class Tools {

    /**
     * These filed represents, the attributes of a CNC tool.
     * They also get initialized as table columns.
     */
    @Id
    @Column(name = "ID")
    private int toolId;

    @Column(name = "Name")
    private String name;


    @Column(name = "Cond")
    private String condition;

    @Column(name = "Machine_ID")
    private int machineId;

    @Column(name = "Weight")
    private int weight;

    @Column(name ="Material")
    private String material;

    @Column(name = "Abrasion")
    private int abrasion;

    @Column(name ="Grade")
    private String grade;

    /**
     * Simple getter
     * @return the value machineId;
     */
    public int getMachineId() {
        return machineId;
    }


    /**
     * Simple setter.
     * @param machineId the field that will be set.
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }


    /**
     * Simple getter
     * @return the value toolId;
     */
    public int getToolId() {
        return toolId;
    }


    /**
     * Simple getter
     * @return the value condition;
     */
    public String getCondition() {
        return condition;
    }


    /**
     * Simple getter
     * @return the value weight;
     */
    public int getWeight() {
        return weight;
    }


    /**
     * Simple getter
     * @return the value name;
     */
    public String getName() {
        return name;
    }


    /**
     * Simple getter
     * @return the value material;
     */
    public String getMaterial() {
        return material;
    }


    /**
     * Simple getter
     * @return the value abrasion;
     */
    public int getAbrasion() {
        return abrasion;
    }


    /**
     * Simple getter
     * @return the value grade;
     */
    public String getGrade() {
        return grade;
    }


    /**
     * Simple setter.
     * @param toolId the field that will be set.
     */
    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    /**
     * Simple setter.
     * @param condition the field that will be set.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Simple setter.
     * @param weight the field that will be set.
     */
    public void setWeight(int weight) {
        this.weight = weight;
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
     * @param material the field that will be set.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Simple setter.
     * @param abrasion the field that will be set.
     */
    public void setAbrasion(int abrasion) {
        this.abrasion = abrasion;
    }

    /**
     * Simple setter.
     * @param grade the field that will be set.
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }








}
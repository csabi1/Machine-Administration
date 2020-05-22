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
@Table(name="Tools")
public class Tools {


    @Id
    @Column(name = "ID")
    private int toolId;

    @Column(name = "Name")
    private String name;


    @Column(name = "Cond")
    private String condition;


    @Column(name = "Weight")
    private int weight;

    @Column(name ="Material")
    private String material;

    @Column(name = "Abrasion")
    private int abrasion;

    @Column(name ="Grade")
    private String grade;


    public int getToolId() {
        return toolId;
    }

    public String getCondition() {
        return condition;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getAbrasion() {
        return abrasion;
    }

    public String getGrade() {
        return grade;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAbrasion(int abrasion) {
        this.abrasion = abrasion;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }








}
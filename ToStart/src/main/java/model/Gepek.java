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
@Table(name="Gepek")
public class Gepek {

    @Id
    @Column(name = "AzID")
    private int id;


    @Column(name = "Szerszamok_darab")
    private int szerszamok_db;


    @Column(name = "Suly")
    private int suly;


    @Column(name = "Name")
    private String nev;




    public String getNev() {
        return nev;
    }

    public void setNev(String value) {
        this.nev = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id ) {
        this.id = id;
    }

    public int getSzerszamok_db() {
        return szerszamok_db;
    }

    public void setSzerszamok_db(int szerszamok_db ) {
        this.szerszamok_db = szerszamok_db;
    }


    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }


}

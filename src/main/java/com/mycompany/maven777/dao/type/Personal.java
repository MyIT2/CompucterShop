package com.mycompany.maven777.dao.type;
public class Personal 
{
    private String name;
    private int id_personal;
    private int id_location;
    private String position;

    public String getName() {
        return name;
    }

    public int getId_personal() {
        return id_personal;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId_personal(int id_personal,int id_location) {
        this.id_personal = id_personal;
                this.id_location = id_location;

    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}

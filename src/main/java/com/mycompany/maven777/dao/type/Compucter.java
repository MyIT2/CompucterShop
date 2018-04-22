package com.mycompany.maven777.dao.type;
public class Compucter 
{
    private String detail;
    private int id_compucter;
    private int id_device;
   

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setId_compucter(int id_compucter,int id_device) {
        this.id_compucter = id_compucter;
        this.id_device = id_device;
    }

    public String getDetail() {
        return detail;
    }

    public int getId_compucter() {
        return id_compucter;
    }
    
}

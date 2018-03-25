package com.mycompany.maven777.Service.Impl;
import com.mycompany.maven777.Service.Interface.PersonalService;
import com.mycompany.maven777.dao.type.Personal;
import com.mycompany.maven777.mappers.PersonalMappers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
public  class PersonalServiceImpl implements PersonalService 
{

    @Autowired 
    PersonalMappers comp; 

    @Override 
    public List<Personal> getAll() { 
    return comp.getAll(); 
    } 

    @Override
    public Personal getPersonalById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Personal id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteIdByPersonal(Personal id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



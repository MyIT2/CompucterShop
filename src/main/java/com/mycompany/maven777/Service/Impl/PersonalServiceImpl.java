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
    return comp.getPersonalById(id);
    }

    @Override
    public void update(Personal personal) {
    comp.update(personal);
    }

    @Override
    public void delete(Long id) {
    comp.delete(id);
    }
    @Override
    public void insert(Personal personal) {
    comp.insert(personal);
    }
    
}



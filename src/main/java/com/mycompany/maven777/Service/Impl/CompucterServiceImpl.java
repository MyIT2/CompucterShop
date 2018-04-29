package com.mycompany.maven777.Service.Impl;

import com.mycompany.maven777.Service.Interface.CompucterService;
import com.mycompany.maven777.dao.type.Compucter;
import com.mycompany.maven777.dao.type.Compucter_has_Device;
import com.mycompany.maven777.mappers.CompucterMappers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CompucterServiceImpl implements CompucterService 
{
@Autowired 
CompucterMappers comp; 


    @Override 
    public List<Compucter> getAll() { 
    return comp.getAll(); 
    } 

    @Override
    public Compucter getCompucterById(Long id) {
    return comp.getCompucterById(id);
    }

    @Override
    public void update(Compucter compucter) {
    comp.update(compucter);    
    }

    @Override
    public void delete(Long id) {
    comp.delete(id);
    }
    @Override
    public void insert(Compucter compucter) {
    comp.insert(compucter);
    }

    @Override
    public List<Compucter_has_Device> getCompucter_has_Device(Long id) {
     return comp.getCompucter_has_Device(id);
    }
    

}

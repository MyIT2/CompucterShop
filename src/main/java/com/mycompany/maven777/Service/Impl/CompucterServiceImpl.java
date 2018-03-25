package com.mycompany.maven777.Service.Impl;

import com.mycompany.maven777.Service.Interface.CompucterService;
import com.mycompany.maven777.dao.type.Compucter;
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
    public void update(Compucter id) {
    comp.update(id);    
    }

    @Override
    public void deleteIdByCompucter(Compucter id) {
    comp.deleteIdByCompucter(id);
    }

}

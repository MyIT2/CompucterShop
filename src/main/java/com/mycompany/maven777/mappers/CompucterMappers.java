package com.mycompany.maven777.mappers;     

import com.mycompany.maven777.dao.type.Compucter;
import com.mycompany.maven777.dao.type.Compucter_has_Device;
import java.util.List;

public interface CompucterMappers
{ 
    public Compucter getCompucterById(Long id); 
    public void update(Compucter compucter);  
    public void delete(Long id); 
    public List<Compucter> getAll();
    public void insert(Compucter compucter);
    public List<Compucter_has_Device> getCompucter_has_Device(Long id);
}
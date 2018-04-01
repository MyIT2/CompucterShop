package com.mycompany.maven777.mappers;

import com.mycompany.maven777.dao.type.Location;
import java.util.List;

public interface LocationMappers 
{
     public Location getLocationById(Long id); 
    public void update(Location location); 
    public void delete(Long id); 
    public List<Location> getAll();
    public void insert(Location location); 
}

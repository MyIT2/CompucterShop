package com.mycompany.maven777.Service.Impl;


import com.mycompany.maven777.Service.Interface.LocationService;
import com.mycompany.maven777.dao.type.Location;
import com.mycompany.maven777.mappers.LocationMappers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class LocationServiceImpl implements LocationService 
{
@Autowired 
LocationMappers comp; 


    @Override 
    public List<Location> getAll() { 
    return comp.getAll(); 
    } 

    @Override
    public Location getLocationById(Long id) {
    return comp.getLocationById(id);
    }

    @Override
    public void update(Location id) {
    comp.update(id);
    }

    @Override
    public void deleteIdByLocation(Long id) {
    comp.deleteIdByLocation(id);
    }

}
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Location id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteIdByLocation(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
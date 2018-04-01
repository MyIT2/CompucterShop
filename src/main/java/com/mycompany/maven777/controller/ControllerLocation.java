package com.mycompany.maven777.controller;
import com.mycompany.maven777.Service.Interface.LocationService;
import com.mycompany.maven777.dao.type.Location;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 
@RestController
@RequestMapping("/Location")
public class ControllerLocation 
{
@Autowired
LocationService comp;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Location> getAll()
{ 
return comp.getAll();
}
@RequestMapping(value = "/insert/",method = RequestMethod.POST) 
public void insert(
       @RequestBody Location location)
{ 
    comp.insert(location); 
} 

@RequestMapping(value = "/update/",method = RequestMethod.PUT) 
public void update(
        @RequestBody Location location)
{ 
    comp.update(location); 
} 

@RequestMapping(value="/delete/" , method = RequestMethod.DELETE) 
public void  delete(
       @RequestParam("delete")Long id)
{ 
    comp.delete(id); 
}
@RequestMapping(value="/getLocationById/",method = RequestMethod.GET) 
public Location getLocationById(
        @RequestParam(value = "idlocation",required = false,defaultValue = "0")Long id){ 
return comp.getLocationById(id); 
} 
}

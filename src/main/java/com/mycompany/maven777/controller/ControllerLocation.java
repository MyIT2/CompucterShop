package com.mycompany.maven777.controller;
import com.mycompany.maven777.dao.type.Location;
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 
@RestController
@RequestMapping("/Location")
public class ControllerLocation 
{ 
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<ControllerLocation> getAll()
{ 
return null; 
}
@RequestMapping(value = "/insertLocationById/insertId",method = RequestMethod.POST) 
public Location insertLocationById(
        @PathVariable("insertId") Integer insertId)
{ 
return null; 
} 

@RequestMapping(value = "/updateLocationById/updateId",method = RequestMethod.PUT) 
public Location updateLocationById(
        @PathVariable("updateId") Integer updateId)
{ 
return null; 
} 

@RequestMapping(value="/deleteLocationById/deleteId" , method = RequestMethod.DELETE) 
public Location deleteLocationById(
        @PathVariable("deleteId") Integer deleteId )
{ 
return null; 
}
@RequestMapping(value="getLocationById/idBrand",method = RequestMethod.GET) 
public Location getLocationById(
        @RequestParam(value = "idBrand",required = false,defaultValue = "0") int id){ 
return null; 
} 
}

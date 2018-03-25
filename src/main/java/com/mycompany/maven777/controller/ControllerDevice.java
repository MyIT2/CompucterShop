package com.mycompany.maven777.controller;
import com.mycompany.maven777.dao.type.Device;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 
@RestController
@RequestMapping("/Device")
public class ControllerDevice 
{
@Autowired
ControllerDevice  comp;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<ControllerDevice> getAll()
{ 
return comp.getAll(); 
}
@RequestMapping(value = "/insertDeviceById/insertId",method = RequestMethod.POST) 
public Device insertDeviceById(
        @PathVariable("insertId") Integer insertId)
{ 
return comp.insertDeviceById(insertId); 
} 

@RequestMapping(value = "/updateDeviceById/updateId",method = RequestMethod.PUT) 
public Device updateDeviceById(
        @PathVariable("updateId") Integer updateId)
{ 
return comp.updateDeviceById(updateId); 
} 

@RequestMapping(value="/deleteDeviceById/deleteId" , method = RequestMethod.DELETE) 
public Device deleteDeviceById(
        @PathVariable("deleteId") Integer deleteId )
{ 
return comp.deleteDeviceById(deleteId); 
}
@RequestMapping(value="getDeviceById/idBrand",method = RequestMethod.GET) 
public Device getDeviceById(
        @RequestParam(value = "idBrand",required = false,defaultValue = "0") int id){ 
return comp.getDeviceById(id); 
} 
}

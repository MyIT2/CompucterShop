package com.mycompany.maven777.controller;
import com.mycompany.maven777.Service.Interface.DeviceService;
import com.mycompany.maven777.dao.type.Device;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 
@RestController
@RequestMapping("/Device")
public class ControllerDevice 
{
@Autowired
DeviceService  comp;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Device> getAll()
{ 
return comp.getAll(); 
}
@RequestMapping(value = "/insert/",method = RequestMethod.POST) 
public void insert(
        @RequestBody Device device)
{ 
    comp.insert(device); 
} 

@RequestMapping(value = "/update/",method = RequestMethod.PUT) 
public void update(
        @RequestBody Device device)
{ 
    comp.update(device); 
} 

@RequestMapping(value="/delete/" , method = RequestMethod.DELETE) 
public void delete(
         @RequestParam("delete")Long id)
{ 
    comp.delete(id); 
}
@RequestMapping(value="getDeviceById/",method = RequestMethod.GET) 
public Device getDeviceById(
        @RequestParam(value = "idDevice",required = false,defaultValue = "0")  Long id){ 
return comp.getDeviceById(id); 
} 
}

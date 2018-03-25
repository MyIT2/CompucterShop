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
@RequestMapping("/Compucter")
public class ControllerCompucter
{
@Autowired
ControllerCompucter  comp;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<ControllerCompucter> getAll()
{ 
return comp.getAll(); 
}
@RequestMapping(value = "/insertCompucterById/insertId",method = RequestMethod.POST) 
public Device insertCompucterById(
        @PathVariable("insertId") Integer insertId)
{ 
return comp.insertCompucterById(insertId); 
} 

@RequestMapping(value = "/updateCompucterById/updateId",method = RequestMethod.PUT) 
public Device updateCompucterById(
        @PathVariable("updateId") Integer updateId)
{ 
return comp.updateCompucterById(updateId); 
} 

@RequestMapping(value="/deleteCompucterById/deleteId" , method = RequestMethod.DELETE) 
public Device deleteCompucterById(
        @PathVariable("deleteId") Integer deleteId )
{ 
return comp.deleteCompucterById(deleteId); 
}
@RequestMapping(value="getCompucterById/idBrand",method = RequestMethod.GET) 
public Device getCompucterById(
        @RequestParam(value = "idBrand",required = false,defaultValue = "0") int id){ 
return comp.getCompucterById(id); 
}
}

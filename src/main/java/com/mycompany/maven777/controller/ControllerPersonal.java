package com.mycompany.maven777.controller;
import com.mycompany.maven777.Service.Interface.PersonalService;
import com.mycompany.maven777.dao.type.Personal;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/Personal")
public class ControllerPersonal 
{
@Autowired
PersonalService  comp;

@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Personal> getAll()
{ 
return comp.getAll();
}

@RequestMapping(value = "/insertPersonalById/insertId",method = RequestMethod.POST) 
public Personal insertPersonalById(@PathVariable("insertId") Integer insertId)
{ 
return comp.insertPersonalById(id);
} 

@RequestMapping(value = "/updatePersonalById/updateId",method = RequestMethod.PUT) 
public Personal updatePersonalById(
        @PathVariable("updateId") Integer updateId)
{ 
return comp.updatePersonalById(id); 
} 

@RequestMapping(value="/deleteBrandById/deleteId" , method = RequestMethod.DELETE) 
public void deletePersonalById(@PathVariable("deleteId") Long id )
{ 
comp.deleteIdByPersonal(id); 
}
@RequestMapping(value="getPersonalById/idBrand",method = RequestMethod.GET) 
public Personal getPersonalById(
        @RequestParam(value = "idBrand",required = false,defaultValue = "0") int id){ 
return comp.getPersonalById(id); 
} 
}

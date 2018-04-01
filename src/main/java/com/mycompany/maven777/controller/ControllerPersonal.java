package com.mycompany.maven777.controller;
import com.mycompany.maven777.Service.Interface.PersonalService;
import com.mycompany.maven777.dao.type.Personal;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

@RequestMapping(value = "/insert/",method = RequestMethod.POST) 
public void insert(@RequestBody Personal personal)
{ 
comp.insert(personal);
} 

@RequestMapping(value = "/update/",method = RequestMethod.PUT) 
public void update(@RequestBody  Personal personal)

{ 
    comp.update(personal);
} 

@RequestMapping(value="/delete/" , method = RequestMethod.DELETE) 
public void delete(@RequestParam("delete")Long id )
{ 
comp.delete(id); 
}
@RequestMapping(value="getPersonalById/idBrand",method = RequestMethod.GET) 
public Personal getPersonalById(
        @RequestParam(value = "idBrand",required = false,defaultValue = "0")Long id){ 
return comp.getPersonalById(id);
} 
}

package com.mycompany.maven777.controller;
import com.mycompany.maven777.dao.type.Personal;
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/Personal")
public class ControllerPersonal 
{ 
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<ControllerPersonal> getAll()
{ 
return null; 
}

@RequestMapping(value = "/insertPersonalById/insertId",method = RequestMethod.POST) 
public Personal insertPersonalById(@PathVariable("insertId") Integer insertId)
{ 
return null; 
} 

@RequestMapping(value = "/updatePersonalById/updateId",method = RequestMethod.PUT) 
public Personal updatePersonalById(
        @PathVariable("updateId") Integer updateId)
{ 
return null; 
} 

@RequestMapping(value="/deleteBrandById/deleteId" , method = RequestMethod.DELETE) 
public Personal deletePersonalById(@PathVariable("deleteId") Integer deleteId )
{ 
return null; 
}
@RequestMapping(value="getPersonalById/idBrand",method = RequestMethod.GET) 
public Personal getBrandById(
        @RequestParam(value = "idBrand",required = false,defaultValue = "0") int id){ 
return null; 
} 
}

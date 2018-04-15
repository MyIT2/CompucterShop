package com.mycompany.maven777.controller;

import com.mycompany.maven777.Service.Interface.CompucterService;
import com.mycompany.maven777.dao.type.Compucter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compucter")
public class ControllerCompucter {

    @Autowired
    CompucterService comp;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Compucter> getAll() {
        return comp.getAll();
    }

    @RequestMapping(value = "/insert/", method = RequestMethod.POST)
    public void insert(
            @RequestBody Compucter compucter) {
        comp.insert(compucter);
    }

    @RequestMapping(value = "/update/", method = RequestMethod.PUT)
    public void update(
            @RequestBody Compucter compucter) {
        comp.update(compucter);
    }

    @RequestMapping(value = "/delete/", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam("delete") Long id) {
        comp.delete(id);
    }

    @RequestMapping(value = "/getCompucterById/", method = RequestMethod.GET)
    public Compucter getCompucterById(
            @RequestParam(value = "idCompucter", required = false, defaultValue = "0") Long id) {
        return comp.getCompucterById(id);
    }
}

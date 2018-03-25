package com.mycompany.maven777.mappers;     

import com.mycompany.maven777.dao.type.Compucter;
import java.util.List;

public interface CompucterMappers
{ 
     public Compucter getCompucterById(Long id); 

    /** Сохраняет состояние объекта group в базе данных 
    * @param id */ 
    public void update(Compucter id); 

    /** Удаляет запись об объекте из базы данных 
    * @param id */ 
    public void deleteIdByCompucter(Compucter id); 

    /** Возвращает список объектов соответствующих всем записям в базе данных 
    * @return */ 
    public List<Compucter> getAll();
}
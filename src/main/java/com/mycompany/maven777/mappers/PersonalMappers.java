package com.mycompany.maven777.mappers;     

import com.mycompany.maven777.dao.type.Personal;
import java.util.List;

public interface PersonalMappers       
{   
    public Personal getPersonalById(Long id); 

    /** Сохраняет состояние объекта group в базе данных 
    * @param id*/ 
    public void update(Personal id); 

    /** Удаляет запись об объекте из базы данных 
    * @param id */ 
    public void deleteIdByPersonal(Long id); 

    /** Возвращает список объектов соответствующих всем записям в базе данных 
    * @return */ 
    public List<Personal> getAll();
}

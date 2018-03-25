package com.mycompany.maven777.mappers;

import com.mycompany.maven777.dao.type.Location;
import java.util.List;

public interface LocationMappers 
{
     public Location getLocationById(Long id); 

    /** Сохраняет состояние объекта group в базе данных 
    * @param id */ 
    public void update(Location id); 

    /** Удаляет запись об объекте из базы данных 
    * @param id */ 
    public void deleteIdByLocation(Location id); 

    /** Возвращает список объектов соответствующих всем записям в базе данных 
    * @return */ 
    public List<Location> getAll();
}

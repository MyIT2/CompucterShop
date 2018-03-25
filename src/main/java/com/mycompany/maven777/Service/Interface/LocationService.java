package com.mycompany.maven777.Service.Interface;
import com.mycompany.maven777.dao.type.Location;
import java.util.List;
public interface LocationService {


     public Location getLocationById(Long id); 

    /** Сохраняет состояние объекта group в базе данных 
    * @param id */ 
    public void update(Location id); 

    /** Удаляет запись об объекте из базы данных 
    * @param id */ 
    public void deleteIdByLocation(Long id); 

    /** Возвращает список объектов соответствующих всем записям в базе данных 
    * @return */ 
    public List<Location> getAll();

}

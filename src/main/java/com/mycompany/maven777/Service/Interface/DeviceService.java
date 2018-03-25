package com.mycompany.maven777.Service.Interface;
import com.mycompany.maven777.dao.type.Device;
import java.util.List;
public interface DeviceService {


     public Device getDeviceById(Long id); 

    /** Сохраняет состояние объекта group в базе данных 
    * @param id */ 
    public void update(Device id); 

    /** Удаляет запись об объекте из базы данных 
    * @param id */ 
    public void deleteIdByDevice(Device id); 

    /** Возвращает список объектов соответствующих всем записям в базе данных 
    * @return */ 
    public List<Device> getAll();

}

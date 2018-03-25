package com.mycompany.maven777.mappers;

import com.mycompany.maven777.dao.type.Device;
import java.util.List;

public interface DeviceMappers 
{
public DeviceMappers getDeviceById(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param brand */ 
public void update(Device brand); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteIdByDevice
        (Device id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Device> getAll();
}

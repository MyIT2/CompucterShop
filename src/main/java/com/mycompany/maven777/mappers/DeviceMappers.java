package com.mycompany.maven777.mappers;

import com.mycompany.maven777.dao.type.Device;
import java.util.List;

public interface DeviceMappers 
{
public Device getDeviceById(Long id); 
public void update(Device device); 
public void delete(Long id); 
public List<Device> getAll();
public void insert(Device device); 
}

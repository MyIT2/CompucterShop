package com.mycompany.maven777.Service.Impl;
import com.mycompany.maven777.Service.Interface.DeviceService;
import com.mycompany.maven777.dao.type.Device;
import com.mycompany.maven777.mappers.DeviceMappers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class DeviceServiceImpl implements DeviceService 
{
    @Autowired 
    DeviceMappers comp; 

    @Override 
    public List<Device> getAll() { 
    return comp.getAll(); 
    } 

    @Override
    public Device getDeviceById(Long id) {
    return comp.getDeviceById(id);
    }

    @Override
    public void update(Device id) {
    comp.update(id);
    }

    @Override
    public void deleteIdByDevice(Device id) {
    comp.deleteIdByDevice(id);
    }
}

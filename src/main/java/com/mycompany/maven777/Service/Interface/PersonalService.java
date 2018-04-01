package com.mycompany.maven777.Service.Interface;
import com.mycompany.maven777.dao.type.Personal;
import java.util.List;
public interface PersonalService {


     public Personal getPersonalById(Long id); 
    public void update(Personal personal); 
    public void delete(Long id); 
    public List<Personal> getAll();
    public void insert(Personal personal); 
    

}

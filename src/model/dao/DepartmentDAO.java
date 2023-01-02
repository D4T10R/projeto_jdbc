package model.dao;

import java.util.List;

import model.Department;

public interface DepartmentDAO {

    void insert(Department obj);
    void update(Department obt);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll(); 

    
}

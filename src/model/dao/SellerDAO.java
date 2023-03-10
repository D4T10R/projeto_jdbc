package model.dao;

import java.util.List;

import model.Seller;

public interface SellerDAO {

    void insert(Seller obj);
    void update(Seller obt);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll(); 

    
}

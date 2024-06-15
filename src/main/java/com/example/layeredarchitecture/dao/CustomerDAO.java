package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;

    public  void save(CustomerDTO customer) throws SQLException, ClassNotFoundException ;

    public void  update(CustomerDTO customer) throws SQLException, ClassNotFoundException ;

    public  boolean  existCustomer(String id) throws SQLException, ClassNotFoundException;
    public void  delete(String id) throws SQLException, ClassNotFoundException ;
    public String  lastId() throws SQLException, ClassNotFoundException ;

    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException ;


    public ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException ;

}

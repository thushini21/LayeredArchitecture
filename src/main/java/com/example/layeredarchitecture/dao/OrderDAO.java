package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.*;
import java.util.List;

public interface OrderDAO {

    public String lastOrderId() throws SQLException, ClassNotFoundException ;

    public boolean checkOrderIdExist(String orderId) throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(OrderDTO orderDTO, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException;


}

package com.example.demo.Service;

import com.example.demo.DTO.Order;
import com.example.demo.DTO.User;
import com.example.demo.payload.Request.ClientOrdersRequest;
import com.example.demo.payload.Request.CustomerRequest;
import com.example.demo.payload.Response.OrdersTableResponse;
import itd.dt.dtException;

import java.util.List;

public interface OrdersService {


    OrdersTableResponse getCroppedOrderList(ClientOrdersRequest clientOrdersRequest) throws dtException;

    List<User> getCustomers(CustomerRequest customerRequest);

    OrdersTableResponse getListOfWorks(ClientOrdersRequest clientOrdersRequest);

}


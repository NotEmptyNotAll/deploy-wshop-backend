package com.example.demo.payload.Response;


import com.example.demo.DTO.OrdersTableColumn;
import com.example.demo.DTO.OrdersTableRow;

import java.util.List;

public class OrdersTableResponse {
    private List<OrdersTableColumn> ordersTableColumns;
    private List<OrdersTableRow> ordersTableBody;

    public OrdersTableResponse() {
    }

    public OrdersTableResponse(List<OrdersTableColumn> ordersTableColumns, List<OrdersTableRow> ordersTableBody) {
        this.ordersTableColumns = ordersTableColumns;
        this.ordersTableBody = ordersTableBody;
    }

    public List<OrdersTableColumn> getColumnTables() {
        return ordersTableColumns;
    }

    public void setColumnTables(List<OrdersTableColumn> ordersTableColumns) {
        this.ordersTableColumns = ordersTableColumns;
    }


    public List<OrdersTableRow> getOrdersTableBody() {
        return ordersTableBody;
    }

    public void setOrdersTableBody(List<OrdersTableRow> ordersTableBody) {
        this.ordersTableBody = ordersTableBody;
    }



    @Override
    public String toString() {
        return "OrdersTableResponse{" +
                "columnTables=" + ordersTableColumns +
                ", ordersTableBody=" + ordersTableBody +
                '}';
    }
}

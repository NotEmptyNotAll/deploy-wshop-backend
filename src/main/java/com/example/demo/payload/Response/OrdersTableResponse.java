package com.example.demo.payload.Response;


import com.example.demo.DTO.OrdersTableColumn;
import com.example.demo.DTO.OrdersTableRow;

import java.util.List;

public class OrdersTableResponse {
    private List<OrdersTableColumn> ordersTableColumns;
    private List<OrdersTableRow> ordersTableBody;
    private Integer sizeTwoPartData;
    private Integer status;

    public OrdersTableResponse() {
    }

    public OrdersTableResponse(Integer status) {
        this.status = status;
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


    public List<OrdersTableColumn> getOrdersTableColumns() {
        return ordersTableColumns;
    }

    public void setOrdersTableColumns(List<OrdersTableColumn> ordersTableColumns) {
        this.ordersTableColumns = ordersTableColumns;
    }


    public Integer getSizeTwoPartData() {
        return sizeTwoPartData;
    }

    public void setSizeTwoPartData(Integer sizeTwoPartData) {
        this.sizeTwoPartData = sizeTwoPartData;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdersTableResponse{" +
                "columnTables=" + ordersTableColumns +
                ", ordersTableBody=" + ordersTableBody +
                '}';
    }
}

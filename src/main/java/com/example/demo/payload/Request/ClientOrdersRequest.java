package com.example.demo.payload.Request;

import com.example.demo.DTO.CellData;
import com.example.demo.DTO.User;

import java.util.List;
import java.util.Objects;

public class ClientOrdersRequest {

    private String dateFrom;
    private String dateTo;
    private Boolean payed;
    private String searchString;
    private String state;
    private Boolean closeDate;
    private Integer sizeResponse;
    private Integer customerId;

    private Integer employeeId;

    private Boolean status;

    private User user;

    private String lang;

    private List<CellData> cellData;

    public ClientOrdersRequest() {
    }


    public ClientOrdersRequest(String dateFrom, String dateTo, Boolean payed, String searchString, String state, Boolean closeDate, Integer sizeResponse, Integer customerId, Integer employeeId, Boolean status, User user, String lang, List<CellData> cellData) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.payed = payed;
        this.searchString = searchString;
        this.state = state;
        this.closeDate = closeDate;
        this.sizeResponse = sizeResponse;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.status = status;
        this.user = user;
        this.lang = lang;
        this.cellData = cellData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientOrdersRequest that = (ClientOrdersRequest) o;
        return Objects.equals(dateFrom, that.dateFrom) && Objects.equals(dateTo, that.dateTo) && Objects.equals(payed, that.payed) && Objects.equals(searchString, that.searchString) && Objects.equals(state, that.state) && Objects.equals(closeDate, that.closeDate) && Objects.equals(sizeResponse, that.sizeResponse) && Objects.equals(customerId, that.customerId) && Objects.equals(employeeId, that.employeeId) && Objects.equals(status, that.status) && Objects.equals(user, that.user) && Objects.equals(lang, that.lang) && Objects.equals(cellData, that.cellData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateFrom, dateTo, payed, searchString, state, closeDate, sizeResponse, customerId, employeeId, status, user, lang, cellData);
    }

    public Integer getSizeResponse() {
        return sizeResponse;
    }

    public void setSizeResponse(Integer sizeResponse) {
        this.sizeResponse = sizeResponse;
    }

    public Boolean getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Boolean closeDate) {
        this.closeDate = closeDate;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Boolean getPayed() {
        return payed;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CellData> getCellData() {
        return cellData;
    }

    public void setCellData(List<CellData> cellData) {
        this.cellData = cellData;
    }
}

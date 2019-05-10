package com.codeyearn.pojo;

import com.codeyearn.tool.DateTool;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author CaiYu
 * @Data 2019/5/7 11:20
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class Product {

    private Integer productID;
    private String productName;
    private String city;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date time;
    private String timeString;

    private Double productPrice;
    private String productDescription;

    private Integer productStatus;
    private String productStatusString;

    public Product() {
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTimeString() {
        if (this.time != null){
            this.timeString = DateTool.date2String(this.time,"yyyy-MM-dd HH:mm");
        }
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusString() {
        if (productStatus!=null){
            if (productStatus == 0){
                this.productStatusString = "关闭";
            }else if (productStatus == 1){
                this.productStatusString = "开启";
            }else{
                this.productStatusString = "关闭";
            }
        }
        return productStatusString;
    }

    public void setProductStatusString(String productStatusString) {
        this.productStatusString = productStatusString;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", city='" + city + '\'' +
                ", time=" + time +
                ", timeString='" + timeString + '\'' +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", productStatus=" + productStatus +
                ", productStatusString='" + productStatusString + '\'' +
                '}';
    }
}

package com.codeyearn.pojo;

import com.codeyearn.tool.DateTool;

import java.util.Date;
import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 19:01
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class Order {

    private Integer orderID;

    private Date orderCreateTime;
    private String orderCreateTimeString;  //订单支付状态的字符串表示

    private Integer orderPeopleCount;
    private String orderDescription;

    private Integer orderPayType;
    private String orderPayTypeString;  //订单支付状态的字符串表示

    private Integer orderStatus;
    private String orderStatusString;  //订单状态的字符串表示

    private Product product;
    private Member member;

    private List<Tourist> touristList;

    public Order() {
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderCreateTimeString() {
        if (this.orderCreateTime != null){
            this.orderCreateTimeString = DateTool.date2String(this.orderCreateTime, "yyyy-MM-dd HH:mm");
        }
        return orderCreateTimeString;
    }

    public void setOrderCreateTimeString(String orderCreateTimeString) {
        this.orderCreateTimeString = orderCreateTimeString;
    }

    public Integer getOrderPeopleCount() {
        return orderPeopleCount;
    }

    public void setOrderPeopleCount(Integer orderPeopleCount) {
        this.orderPeopleCount = orderPeopleCount;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Integer getOrderPayType() {
        return orderPayType;
    }

    public void setOrderPayType(Integer orderPayType) {
        this.orderPayType = orderPayType;
    }

    public String getOrderPayTypeString() {
        if (this.orderPayType != null){
            if (this.orderPayType == 0){
                this.orderPayTypeString = "支付宝";
            }else if (this.orderPayType == 1){
                this.orderPayTypeString = "微信";
            }else{
                this.orderPayTypeString = "其他";
            }
        }
        return orderPayTypeString;
    }

    public void setOrderPayTypeString(String orderPayTypeString) {
        this.orderPayTypeString = orderPayTypeString;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusString() {
        if (this.orderStatus != null){
            if (this.orderStatus == 1){
                this.orderStatusString = "已支付";
            }else if (this.orderStatus == 0){
                this.orderStatusString = "未支付";
            }else{
                this.orderStatusString = "未支付";
            }
        }
        return orderStatusString;
    }

    public void setOrderStatusString(String orderStatusString) {
        this.orderStatusString = orderStatusString;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Tourist> getTouristList() {
        return touristList;
    }

    public void setTouristList(List<Tourist> touristList) {
        this.touristList = touristList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderCreateTime=" + orderCreateTime +
                ", orderCreateTimeString='" + orderCreateTimeString + '\'' +
                ", orderPeopleCount=" + orderPeopleCount +
                ", orderDescription='" + orderDescription + '\'' +
                ", orderPayType=" + orderPayType +
                ", orderPayTypeString='" + orderPayTypeString + '\'' +
                ", orderStatus=" + orderStatus +
                ", orderStatusString='" + orderStatusString + '\'' +
                ", product=" + product +
                ", member=" + member +
                ", touristList=" + touristList +
                '}';
    }
}

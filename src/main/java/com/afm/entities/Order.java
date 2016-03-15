package com.afm.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by rchen on 3/10/16.
 */
@Entity
@Table(name="orders") //creating a new table
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "rest_id")
    private Integer restId;

    @Column(name = "details")
    private String detail; //json string of the details

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "order_type")
    private Integer type; // 1 delivery 2 pick up

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "subtotal")
    private BigDecimal subTotal;

    @Column(name = "coupon")
    private BigDecimal coupon; //priced reduced by coupon

    @Column(name = "delivery_fee")
    private BigDecimal deliveryFee;

    @Column(name = "tip")
    private BigDecimal tip;

    @Column(name = "process_fee")
    private BigDecimal processFee;

    @Column(name = "order_comment")
    private String comment;

    @Column(name = "order_now")
    private Integer orderNow;

    @Column(name = "future_order_time")
    private String futureOrderTime;

    @Column(name = "before_tip")
    private BigDecimal beforeTip;

    @Column(name = "payment_type")
    private Integer paymentType;

    @Column(name = "tax")
    private BigDecimal tax;

    @Column(name = "tip_type")
    private Integer tipType;

    public Integer getTipType() {
        return tipType;
    }

    public void setTipType(Integer tipType) {
        this.tipType = tipType;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public BigDecimal getProcessFee() {
        return processFee;
    }

    public void setProcessFee(BigDecimal processFee) {
        this.processFee = processFee;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getOrderNow() {
        return orderNow;
    }

    public void setOrderNow(Integer orderNow) {
        this.orderNow = orderNow;
    }

    public String getFutureOrderTime() {
        return futureOrderTime;
    }

    public void setFutureOrderTime(String futureOrderTime) {
        this.futureOrderTime = futureOrderTime;
    }

    public BigDecimal getBeforeTip() {
        return beforeTip;
    }

    public void setBeforeTip(BigDecimal beforeTip) {
        this.beforeTip = beforeTip;
    }

}

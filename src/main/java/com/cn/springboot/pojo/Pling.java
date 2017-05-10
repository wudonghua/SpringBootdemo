package com.cn.springboot.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by dw07 on 2017/4/26.
 * 光大退货请求实体
 */
//@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "Plain",namespace = "id=s")
public class Pling {
    @XmlElement(name = "transId")
    private String transId;
//    @XmlElement(name = "merId")
    private String merId;
//    @XmlElement(name = "serialNo")
    private String serialNo;
//    @XmlElement(name = "date")
    private String date;
//    @XmlElement(name = "originalSerialNo")
    private String originalSerialNo;
//    @XmlElement(name = "originalDate")
    private String originalDate;
//    @XmlElement(name = "amount")
    private String amount;

    public Pling(String transId, String merId, String serialNo, String date, String originalSerialNo, String originalDate, String amount) {
        this.transId = transId;
        this.merId = merId;
        this.serialNo = serialNo;
        this.date = date;
        this.originalSerialNo = originalSerialNo;
        this.originalDate = originalDate;
        this.amount = amount;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOriginalSerialNo() {
        return originalSerialNo;
    }

    public void setOriginalSerialNo(String originalSerialNo) {
        this.originalSerialNo = originalSerialNo;
    }

    public String getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(String originalDate) {
        this.originalDate = originalDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Pling{" +
                "transId='" + transId + '\'' +
                ", merId='" + merId + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", date='" + date + '\'' +
                ", originalSerialNo='" + originalSerialNo + '\'' +
                ", originalDate='" + originalDate + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}

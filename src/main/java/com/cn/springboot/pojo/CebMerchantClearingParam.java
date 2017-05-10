package com.cn.springboot.pojo;

/**
 * Created by dw07 on 2017/4/28.
 */
public class CebMerchantClearingParam {
    // 交易代码
    private String transId;
    // 清算日期
    private String clearDate;
    // 交易发生时间
    private String dealDate;
    // 订单号
    private String gateSn;
    // 网关流水号
    private String transactionGateSn;
    // 商户号
    private String merId;
    // 终端号
    private String terminalId;
    // 交易金额
    private String dealAmant;
    // 手续费 (始终为零)
    private String poundage;
    // 净清算金额(交易金融减去手续费)
    private String clearAmant;
    // 响应码
    private String responseCode;
    // 商户保留 1
    private String fied1;
    // 商户保留 2
    private String fied2;

    public CebMerchantClearingParam() {
    }

    public CebMerchantClearingParam(String transId, String clearDate, String dealDate, String gateSn, String transactionGateSn,
                                    String merId, String terminalId, String dealAmant, String poundage, String clearAmant,
                                    String responseCode, String fied1, String fied2) {
        this.transId = transId;
        this.clearDate = clearDate;
        this.dealDate = dealDate;
        this.gateSn = gateSn;
        this.transactionGateSn = transactionGateSn;
        this.merId = merId;
        this.terminalId = terminalId;
        this.dealAmant = dealAmant;
        this.poundage = poundage;
        this.clearAmant = clearAmant;
        this.responseCode = responseCode;
        this.fied1 = fied1;
        this.fied2 = fied2;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getGateSn() {
        return gateSn;
    }

    public void setGateSn(String gateSn) {
        this.gateSn = gateSn;
    }

    public String getTransactionGateSn() {
        return transactionGateSn;
    }

    public void setTransactionGateSn(String transactionGateSn) {
        this.transactionGateSn = transactionGateSn;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getDealAmant() {
        return dealAmant;
    }

    public void setDealAmant(String dealAmant) {
        this.dealAmant = dealAmant;
    }

    public String getPoundage() {
        return poundage;
    }

    public void setPoundage(String poundage) {
        this.poundage = poundage;
    }

    public String getClearAmant() {
        return clearAmant;
    }

    public void setClearAmant(String clearAmant) {
        this.clearAmant = clearAmant;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getFied1() {
        return fied1;
    }

    public void setFied1(String fied1) {
        this.fied1 = fied1;
    }

    public String getFied2() {
        return fied2;
    }

    public void setFied2(String fied2) {
        this.fied2 = fied2;
    }

    @Override
    public String toString() {
        return "CebMerchantClearingParam{" +
                "transId='" + transId + '\'' +
                ", clearDate='" + clearDate + '\'' +
                ", dealDate='" + dealDate + '\'' +
                ", gateSn='" + gateSn + '\'' +
                ", transactionGateSn='" + transactionGateSn + '\'' +
                ", merId='" + merId + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", dealAmant='" + dealAmant + '\'' +
                ", poundage='" + poundage + '\'' +
                ", clearAmant='" + clearAmant + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", fied1='" + fied1 + '\'' +
                ", fied2='" + fied2 + '\'' +
                '}';
    }
}

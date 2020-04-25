package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.List;

public class PaymentStatusMainBean implements Serializable {
    @C5860a
    @C5862c("cards")
    private List<PaymentCardsBean> cards;
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("payment_hash")
    private PaymentHashBean paymentHash;
    @C5860a
    @C5862c("payment_receipt")
    private PaymentReceiptBean paymentReceipt;

    public List<PaymentCardsBean> getCards() {
        return this.cards;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public PaymentHashBean getPaymentHash() {
        return this.paymentHash;
    }

    public PaymentReceiptBean getPaymentReceipt() {
        return this.paymentReceipt;
    }

    public void setCards(List<PaymentCardsBean> list) {
        this.cards = list;
    }
}

package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.ArrayList;

public class CardListMainBean implements Serializable {
    @C5862c("cards")
    private ArrayList<PaymentCardsBean> cardsBeans;
    private Integer code;
    private String message;

    public ArrayList<PaymentCardsBean> getCardsBeans() {
        return this.cardsBeans;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}

package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PaymentCardsBean implements Serializable {
    @C5862c("brand")
    private String brand;
    @C5862c("card_token")
    private String cardToken;
    @C5862c("expiry_month")
    private String expiryMonth;
    @C5862c("expiry_year")
    private String expiryYear;
    @C5862c("id")

    /* renamed from: id */
    private Integer f27625id;
    @C5862c("is_default")
    private boolean isDefault;
    @C5862c("last_digits")
    private String lastDigits;

    public String getBrand() {
        return this.brand;
    }

    public String getCardToken() {
        return this.cardToken;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public Integer getId() {
        return this.f27625id;
    }

    public String getLastDigits() {
        return this.lastDigits;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }
}

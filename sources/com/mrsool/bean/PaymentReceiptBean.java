package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.List;

public class PaymentReceiptBean implements Serializable {
    @C5860a
    @C5862c("grand_total")
    private InvoiceBean grandTotal;
    private List<InvoiceBean> invoice;
    @C5860a
    @C5862c("tax_number")
    private String taxNumber;

    public InvoiceBean getGrandTotal() {
        return this.grandTotal;
    }

    public List<InvoiceBean> getInvoice() {
        return this.invoice;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public void setGrandTotal(InvoiceBean invoiceBean) {
        this.grandTotal = invoiceBean;
    }

    public void setInvoice(List<InvoiceBean> list) {
        this.invoice = list;
    }

    public void setTaxNumber(String str) {
        this.taxNumber = str;
    }
}

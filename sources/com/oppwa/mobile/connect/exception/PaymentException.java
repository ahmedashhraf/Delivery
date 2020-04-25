package com.oppwa.mobile.connect.exception;

public class PaymentException extends Exception {

    /* renamed from: a */
    private PaymentError f34454a;

    public PaymentException(PaymentError paymentError) {
        StringBuilder sb = new StringBuilder();
        sb.append(paymentError.mo40760a());
        sb.append(": ");
        sb.append(paymentError.mo40764c());
        super(sb.toString());
        this.f34454a = paymentError;
    }

    public PaymentException(PaymentError paymentError, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(paymentError.mo40760a());
        sb.append(": ");
        sb.append(paymentError.mo40764c());
        super(sb.toString(), th);
        this.f34454a = paymentError;
    }

    /* renamed from: a */
    public PaymentError mo40774a() {
        return this.f34454a;
    }
}

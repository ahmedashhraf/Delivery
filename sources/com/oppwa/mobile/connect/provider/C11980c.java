package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;

/* renamed from: com.oppwa.mobile.connect.provider.c */
public interface C11980c {
    /* renamed from: a */
    void mo38838a(PaymentError paymentError);

    /* renamed from: a */
    void mo38839a(BrandsValidation brandsValidation);

    /* renamed from: a */
    void mo38840a(CheckoutInfo checkoutInfo);

    /* renamed from: a */
    void mo38841a(ImagesRequest imagesRequest);

    /* renamed from: a */
    void mo38842a(Transaction transaction);

    /* renamed from: a */
    void mo38843a(Transaction transaction, PaymentError paymentError);

    /* renamed from: b */
    void mo38844b(PaymentError paymentError);

    /* renamed from: q */
    void mo38850q();
}

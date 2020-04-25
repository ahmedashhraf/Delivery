package com.oppwa.mobile.connect.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.C11977a;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.C11979b;
import com.oppwa.mobile.connect.provider.C11980c;
import com.oppwa.mobile.connect.provider.Transaction;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConnectService extends Service implements C11980c {

    /* renamed from: N */
    private C11992b f34576N;

    /* renamed from: a */
    private C11979b f34577a;

    /* renamed from: b */
    private Set<C11980c> f34578b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11979b mo41058a() {
        return this.f34577a;
    }

    /* renamed from: a */
    public void mo38838a(PaymentError paymentError) {
        for (C11980c a : this.f34578b) {
            a.mo38838a(paymentError);
        }
    }

    /* renamed from: a */
    public void mo38839a(BrandsValidation brandsValidation) {
        for (C11980c a : this.f34578b) {
            a.mo38839a(brandsValidation);
        }
    }

    /* renamed from: a */
    public void mo38840a(CheckoutInfo checkoutInfo) {
        for (C11980c a : this.f34578b) {
            a.mo38840a(checkoutInfo);
        }
    }

    /* renamed from: a */
    public void mo38841a(ImagesRequest imagesRequest) {
        for (C11980c a : this.f34578b) {
            a.mo38841a(imagesRequest);
        }
    }

    /* renamed from: a */
    public void mo38842a(Transaction transaction) {
        for (C11980c a : this.f34578b) {
            a.mo38842a(transaction);
        }
    }

    /* renamed from: a */
    public void mo38843a(Transaction transaction, PaymentError paymentError) {
        for (C11980c a : this.f34578b) {
            a.mo38843a(transaction, paymentError);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41059a(C11978a aVar) throws PaymentException {
        this.f34577a = C11977a.m54066a(this, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41060a(C11980c cVar) {
        this.f34578b.add(cVar);
    }

    /* renamed from: b */
    public void mo38844b(PaymentError paymentError) {
        for (C11980c b : this.f34578b) {
            b.mo38844b(paymentError);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41061b(C11980c cVar) {
        this.f34578b.remove(cVar);
    }

    public IBinder onBind(Intent intent) {
        return this.f34576N;
    }

    public void onCreate() {
        super.onCreate();
        this.f34578b = new CopyOnWriteArraySet();
        this.f34576N = new C11992b(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* renamed from: q */
    public void mo38850q() {
        for (C11980c q : this.f34578b) {
            q.mo38850q();
        }
    }
}

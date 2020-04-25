package com.oppwa.mobile.connect.checkout.dialog;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.tasks.C5547e;
import com.google.android.gms.tasks.C5560k;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.exception.PaymentProviderNotInitializedException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.C11980c;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.service.C11991a;
import com.oppwa.mobile.connect.service.ConnectService;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.c */
public abstract class C11803c extends C11794a implements C11870l0, C11980c {

    /* renamed from: Y */
    protected String f34135Y;

    /* renamed from: Z */
    protected C11991a f34136Z;

    /* renamed from: a0 */
    private ServiceConnection f34137a0 = new C11804a();

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.c$a */
    class C11804a implements ServiceConnection {
        C11804a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C11803c cVar = C11803c.this;
            cVar.f34136Z = (C11991a) iBinder;
            C11991a aVar = cVar.f34136Z;
            if (aVar != null) {
                aVar.mo41069a((C11980c) cVar);
                try {
                    if (C11803c.this.f34136Z.mo41076b()) {
                        C11803c.this.f34136Z.mo41068a(C11803c.this.f34100P.mo40735y());
                    } else {
                        C11803c.this.f34136Z.mo41074b(C11803c.this.f34100P.mo40735y());
                    }
                    if (!C11803c.this.f34099O) {
                        C11803c.this.mo40415j();
                    }
                } catch (PaymentException e) {
                    C11803c.this.mo40390c(null, e.mo40774a());
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C11803c.this.f34136Z = null;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.c$b */
    class C11805b implements C5547e<Boolean> {
        C11805b() {
        }

        /* renamed from: a */
        public void mo17805a(@C0193h0 C5560k<Boolean> kVar) {
            try {
                C11803c.this.f34105U.mo40617a(kVar, C11803c.this.mo40392d());
                C11803c.this.mo40416l();
            } catch (PaymentException e) {
                C11803c.this.mo40390c(null, e.mo40774a());
            }
        }
    }

    /* renamed from: b */
    private void m53075b(BrandsValidation brandsValidation) throws PaymentException {
        if (brandsValidation != null) {
            this.f34103S = brandsValidation;
            if (this.f34100P.mo40692a() != null) {
                this.f34103S.mo40793a(this.f34100P.mo40692a());
            }
            this.f34109a.mo40562a(this.f34100P.mo40698c().equals(CheckoutCardBrandsDisplayMode.GROUPED) && this.f34105U.mo40621a(brandsValidation));
            mo40417m();
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_INTERNAL_ERROR, "BrandsValidation is null"));
    }

    /* renamed from: b */
    private void m53076b(CheckoutInfo checkoutInfo) throws PaymentException {
        if (checkoutInfo != null) {
            this.f34104T = checkoutInfo;
            this.f34105U = new C11921z(this.f34100P.mo40730u(), checkoutInfo.mo40848l());
            this.f34105U.mo40619a(checkoutInfo);
            this.f34105U.mo40618a(this.f34100P, this.f34108X.mo40498a());
            this.f34105U.mo40620a(this.f34100P.mo40723o(), mo40392d());
            if (this.f34105U.mo40616a().contains(C10527a.f28541b)) {
                mo40326k();
            } else {
                mo40416l();
            }
        } else {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_INTERNAL_ERROR, "CheckoutInfo is null"));
        }
    }

    /* renamed from: b */
    private void m53077b(ImagesRequest imagesRequest) {
        C11887q.m53456a((Context) this).mo40546a(imagesRequest);
        mo40325i();
    }

    /* renamed from: f */
    private void m53078f(Transaction transaction) throws PaymentException {
        String j = transaction.mo41027b().mo40899j();
        if (!j.equals("ALIPAY") || !C11825d1.f34190a) {
            if (transaction.mo41033i() == TransactionType.ASYNC) {
                C11903s0.m53520a(transaction.mo41028c());
                if (!mo40388b(j) || !this.f34100P.mo40672K()) {
                    mo40384a(transaction.mo41028c());
                } else {
                    mo40393d(transaction);
                    return;
                }
            }
            mo40387b(transaction);
            return;
        }
        mo40414e(transaction);
    }

    /* renamed from: k */
    private void mo40326k() {
        this.f34106V = C11862j.m53332a(this, mo40392d());
        C11862j.m53334a(this.f34106V, C11903s0.m53517a(this.f34100P), new C11805b());
    }

    /* renamed from: n */
    private void mo40327n() throws PaymentException {
        if (this.f34136Z == null) {
            throw new PaymentException(PaymentError.m53757K());
        }
    }

    /* renamed from: o */
    private Transaction m53081o() throws PaymentException {
        C11840g0 g0Var = new C11840g0(this.f34107W);
        g0Var.mo40470b(this.f34135Y);
        g0Var.mo40467a(this.f34110b);
        g0Var.mo40468a(this.f34100P.mo40662A());
        if (this.f34104T.mo40850n()) {
            g0Var.mo40466a((Context) this);
        }
        return new Transaction(g0Var.mo40465a());
    }

    /* renamed from: a */
    public void mo38838a(PaymentError paymentError) {
        mo40390c(null, paymentError);
    }

    /* renamed from: a */
    public void mo38839a(BrandsValidation brandsValidation) {
        try {
            m53075b(brandsValidation);
        } catch (PaymentException e) {
            mo40390c(null, e.mo40774a());
        }
    }

    /* renamed from: a */
    public void mo38840a(CheckoutInfo checkoutInfo) {
        try {
            m53076b(checkoutInfo);
        } catch (PaymentException e) {
            mo40390c(null, e.mo40774a());
        }
    }

    /* renamed from: a */
    public void mo38841a(ImagesRequest imagesRequest) {
        m53077b(imagesRequest);
    }

    /* renamed from: a */
    public void mo38842a(Transaction transaction) {
        try {
            m53078f(transaction);
        } catch (PaymentException e) {
            mo40390c(transaction, e.mo40774a());
        }
    }

    /* renamed from: a */
    public void mo38843a(Transaction transaction, PaymentError paymentError) {
        mo40390c(transaction, paymentError);
    }

    /* renamed from: b */
    public void mo38844b(PaymentError paymentError) {
        mo40390c(null, paymentError);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40389c() throws PaymentException {
        mo40327n();
        this.f34098N = false;
        this.f34136Z.mo41067a(m53081o(), this.f34104T.mo40845i());
        this.f34107W = null;
    }

    /* renamed from: c */
    public void mo40413c(Transaction transaction) {
        mo40387b(transaction);
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: d */
    public C11978a mo40392d() {
        C11991a aVar = this.f34136Z;
        if (aVar == null) {
            return null;
        }
        try {
            return aVar.mo41065a();
        } catch (PaymentProviderNotInitializedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo40414e(@C0193h0 Transaction transaction) {
        new C11835f0(this, transaction, this).execute(new String[]{transaction.mo41024a()});
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo40325i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo40415j() throws PaymentException {
        CheckoutInfo checkoutInfo = this.f34104T;
        if (checkoutInfo == null) {
            mo40327n();
            this.f34136Z.mo41070a(this.f34100P.mo40717i());
            return;
        }
        mo38840a(checkoutInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo40416l() throws PaymentException {
        C11921z zVar = this.f34105U;
        if (zVar == null || zVar.mo40616a().isEmpty()) {
            throw new PaymentException(PaymentError.m53764j());
        }
        BrandsValidation brandsValidation = this.f34103S;
        if (brandsValidation == null) {
            mo40327n();
            this.f34136Z.mo41071a(this.f34100P.mo40717i(), this.f34105U.mo40623c());
            return;
        }
        mo38839a(brandsValidation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo40417m() throws PaymentException {
        mo40327n();
        this.f34136Z.mo41072a(this.f34105U.mo40623c());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C11991a aVar = this.f34136Z;
        if (aVar != null) {
            aVar.mo41069a((C11980c) this);
        }
        Intent intent = new Intent(this, ConnectService.class);
        startService(intent);
        bindService(intent, this.f34137a0, 1);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C11991a aVar = this.f34136Z;
        if (aVar != null) {
            aVar.mo41075b((C11980c) this);
        }
        Intent intent = new Intent(this, ConnectService.class);
        unbindService(this.f34137a0);
        stopService(intent);
    }

    /* renamed from: q */
    public void mo38850q() {
        m53077b((ImagesRequest) null);
    }

    /* renamed from: y */
    public void mo40418y() {
        mo40399w();
    }
}

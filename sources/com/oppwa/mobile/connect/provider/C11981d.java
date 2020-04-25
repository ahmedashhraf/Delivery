package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;

/* renamed from: com.oppwa.mobile.connect.provider.d */
public class C11981d extends C11990i {

    /* renamed from: com.oppwa.mobile.connect.provider.d$a */
    class C11982a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C11980c f34560N;

        /* renamed from: a */
        final /* synthetic */ String f34562a;

        /* renamed from: b */
        final /* synthetic */ String[] f34563b;

        C11982a(String str, String[] strArr, C11980c cVar) {
            this.f34562a = str;
            this.f34563b = strArr;
            this.f34560N = cVar;
        }

        public void run() {
            try {
                this.f34560N.mo38839a(C11989h.m54099a(C11981d.this.mo41053c(), C11981d.this.f34574a, this.f34562a, this.f34563b));
            } catch (PaymentException e) {
                this.f34560N.mo38838a(e.mo40774a());
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.provider.d$b */
    class C11983b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String[] f34565a;

        /* renamed from: b */
        final /* synthetic */ C11980c f34566b;

        C11983b(String[] strArr, C11980c cVar) {
            this.f34565a = strArr;
            this.f34566b = cVar;
        }

        public void run() {
            try {
                this.f34566b.mo38841a(C11989h.m54101a(C11981d.this.f34574a, this.f34565a));
            } catch (PaymentException unused) {
                this.f34566b.mo38850q();
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.provider.d$c */
    class C11984c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f34568a;

        /* renamed from: b */
        final /* synthetic */ C11980c f34569b;

        C11984c(String str, C11980c cVar) {
            this.f34568a = str;
            this.f34569b = cVar;
        }

        public void run() {
            try {
                CheckoutInfo a = C11989h.m54100a(C11981d.this.mo41053c(), C11981d.this.f34574a, this.f34568a);
                C11778a.m52945e(C11981d.this.mo41053c());
                this.f34569b.mo38840a(a);
            } catch (PaymentException e) {
                C11778a.m52945e(C11981d.this.mo41053c());
                this.f34569b.mo38844b(e.mo40774a());
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.provider.d$d */
    class C11985d implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C11980c f34570N;

        /* renamed from: a */
        final /* synthetic */ String f34572a;

        /* renamed from: b */
        final /* synthetic */ Transaction f34573b;

        C11985d(String str, Transaction transaction, C11980c cVar) {
            this.f34572a = str;
            this.f34573b = transaction;
            this.f34570N = cVar;
        }

        public void run() {
            try {
                C11989h.m54107a(C11981d.this.mo41053c(), C11981d.this.f34574a, this.f34572a, this.f34573b);
                C11778a.m52945e(C11981d.this.mo41053c());
                this.f34573b.mo41027b().mo40901l();
                this.f34570N.mo38842a(this.f34573b);
            } catch (PaymentException e) {
                C11778a.m52945e(C11981d.this.mo41053c());
                this.f34573b.mo41027b().mo40901l();
                this.f34570N.mo38843a(this.f34573b, e.mo40774a());
            }
        }
    }

    public C11981d(Context context, C11978a aVar) {
        super(context, aVar);
        this.f34574a = aVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C11978a mo41045a() {
        return super.mo41045a();
    }

    /* renamed from: a */
    public void mo41046a(Transaction transaction, C11980c cVar) throws PaymentException {
        mo41047a(transaction, "/payment", cVar);
    }

    /* renamed from: a */
    public void mo41047a(Transaction transaction, String str, C11980c cVar) {
        C11778a.m52943d(mo41053c());
        new Thread(new C11985d(str, transaction, cVar)).start();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo41048a(C11978a aVar) {
        super.mo41048a(aVar);
    }

    /* renamed from: a */
    public void mo41049a(String str, C11980c cVar) {
        new Thread(new C11984c(str, cVar)).start();
    }

    /* renamed from: a */
    public void mo41050a(String str, String[] strArr, C11980c cVar) {
        new Thread(new C11982a(str, strArr, cVar)).start();
    }

    /* renamed from: a */
    public void mo41051a(String[] strArr, C11980c cVar) {
        new Thread(new C11983b(strArr, cVar)).start();
    }

    /* renamed from: b */
    public void mo41052b(Transaction transaction, C11980c cVar) throws PaymentException {
        mo41047a(transaction, "/registration", cVar);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Context mo41053c() {
        return super.mo41053c();
    }
}

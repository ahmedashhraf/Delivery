package com.oppwa.mobile.connect.service;

import android.content.Context;
import android.os.Binder;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.exception.PaymentProviderNotInitializedException;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.C11980c;
import com.oppwa.mobile.connect.provider.Transaction;

/* renamed from: com.oppwa.mobile.connect.service.b */
class C11992b extends Binder implements C11991a {

    /* renamed from: a */
    private ConnectService f34579a;

    C11992b(ConnectService connectService) {
        this.f34579a = connectService;
    }

    /* renamed from: d */
    private void m54136d() throws PaymentProviderNotInitializedException {
        if (this.f34579a.mo41058a() == null) {
            throw new PaymentProviderNotInitializedException();
        }
    }

    /* renamed from: a */
    public C11978a mo41065a() throws PaymentProviderNotInitializedException {
        m54136d();
        return this.f34579a.mo41058a().mo41045a();
    }

    /* renamed from: a */
    public void mo41066a(Transaction transaction) throws PaymentException {
        m54136d();
        this.f34579a.mo41058a().mo41046a(transaction, (C11980c) this.f34579a);
    }

    /* renamed from: a */
    public void mo41067a(Transaction transaction, String str) throws PaymentException {
        m54136d();
        this.f34579a.mo41058a().mo41047a(transaction, str, (C11980c) this.f34579a);
    }

    /* renamed from: a */
    public void mo41068a(C11978a aVar) throws PaymentProviderNotInitializedException {
        m54136d();
        this.f34579a.mo41058a().mo41048a(aVar);
    }

    /* renamed from: a */
    public void mo41069a(C11980c cVar) {
        this.f34579a.mo41060a(cVar);
    }

    /* renamed from: a */
    public void mo41070a(String str) throws PaymentException {
        m54136d();
        this.f34579a.mo41058a().mo41049a(str, (C11980c) this.f34579a);
    }

    /* renamed from: a */
    public void mo41071a(String str, String[] strArr) throws PaymentException {
        m54136d();
        this.f34579a.mo41058a().mo41050a(str, strArr, (C11980c) this.f34579a);
    }

    /* renamed from: a */
    public void mo41072a(String[] strArr) throws PaymentException {
        m54136d();
        this.f34579a.mo41058a().mo41051a(strArr, (C11980c) this.f34579a);
    }

    /* renamed from: b */
    public void mo41073b(Transaction transaction) throws PaymentException {
        m54136d();
        this.f34579a.mo41058a().mo41052b(transaction, this.f34579a);
    }

    /* renamed from: b */
    public void mo41074b(C11978a aVar) throws PaymentException {
        this.f34579a.mo41059a(aVar);
    }

    /* renamed from: b */
    public void mo41075b(C11980c cVar) {
        this.f34579a.mo41061b(cVar);
    }

    /* renamed from: b */
    public boolean mo41076b() {
        return this.f34579a.mo41058a() != null;
    }

    /* renamed from: c */
    public Context mo41077c() throws PaymentProviderNotInitializedException {
        m54136d();
        return this.f34579a.mo41058a().mo41053c();
    }
}

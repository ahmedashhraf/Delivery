package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;

/* renamed from: com.oppwa.mobile.connect.provider.b */
public interface C11979b {
    /* renamed from: a */
    C11978a mo41045a();

    /* renamed from: a */
    void mo41046a(Transaction transaction, C11980c cVar) throws PaymentException;

    /* renamed from: a */
    void mo41047a(Transaction transaction, String str, C11980c cVar) throws PaymentException;

    /* renamed from: a */
    void mo41048a(C11978a aVar);

    /* renamed from: a */
    void mo41049a(String str, C11980c cVar) throws PaymentException;

    /* renamed from: a */
    void mo41050a(String str, String[] strArr, C11980c cVar) throws PaymentException;

    /* renamed from: a */
    void mo41051a(String[] strArr, C11980c cVar) throws PaymentException;

    /* renamed from: b */
    void mo41052b(Transaction transaction, C11980c cVar) throws PaymentException;

    /* renamed from: c */
    Context mo41053c();
}

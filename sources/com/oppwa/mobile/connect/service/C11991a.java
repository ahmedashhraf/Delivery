package com.oppwa.mobile.connect.service;

import android.content.Context;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.exception.PaymentProviderNotInitializedException;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.C11980c;
import com.oppwa.mobile.connect.provider.Transaction;

/* renamed from: com.oppwa.mobile.connect.service.a */
public interface C11991a {
    /* renamed from: a */
    C11978a mo41065a() throws PaymentProviderNotInitializedException;

    /* renamed from: a */
    void mo41066a(Transaction transaction) throws PaymentException;

    /* renamed from: a */
    void mo41067a(Transaction transaction, String str) throws PaymentException;

    /* renamed from: a */
    void mo41068a(C11978a aVar) throws PaymentProviderNotInitializedException;

    /* renamed from: a */
    void mo41069a(C11980c cVar);

    /* renamed from: a */
    void mo41070a(String str) throws PaymentException;

    /* renamed from: a */
    void mo41071a(String str, String[] strArr) throws PaymentException;

    /* renamed from: a */
    void mo41072a(String[] strArr) throws PaymentException;

    /* renamed from: b */
    void mo41073b(Transaction transaction) throws PaymentException;

    /* renamed from: b */
    void mo41074b(C11978a aVar) throws PaymentException;

    /* renamed from: b */
    void mo41075b(C11980c cVar);

    /* renamed from: b */
    boolean mo41076b();

    /* renamed from: c */
    Context mo41077c() throws PaymentProviderNotInitializedException;
}

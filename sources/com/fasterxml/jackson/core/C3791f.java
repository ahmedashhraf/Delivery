package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p158s.C3818c;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.fasterxml.jackson.core.f */
/* compiled from: JsonGenerator */
public abstract class C3791f implements Closeable, Flushable, C3805p {

    /* renamed from: a */
    protected C3801l f11835a;

    /* renamed from: com.fasterxml.jackson.core.f$a */
    /* compiled from: JsonGenerator */
    public enum C3792a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        FLUSH_PASSED_TO_STREAM(true),
        ESCAPE_NON_ASCII(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private C3792a(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }

        /* renamed from: f */
        public static int m15987f() {
            C3792a[] values;
            int i = 0;
            for (C3792a aVar : values()) {
                if (aVar.mo16652d()) {
                    i |= aVar.mo16653e();
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo16652d() {
            return this._defaultState;
        }

        /* renamed from: e */
        public int mo16653e() {
            return this._mask;
        }
    }

    protected C3791f() {
    }

    /* renamed from: B */
    public abstract C3791f mo16581B();

    /* renamed from: F */
    public abstract void mo16582F() throws IOException, JsonGenerationException;

    /* renamed from: G */
    public abstract void mo16583G() throws IOException, JsonGenerationException;

    /* renamed from: H */
    public abstract void mo16584H() throws IOException, JsonGenerationException;

    /* renamed from: I */
    public abstract void mo16585I() throws IOException, JsonGenerationException;

    /* renamed from: J */
    public abstract void mo16586J() throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract int mo16587a(C3785a aVar, InputStream inputStream, int i) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public C3791f mo16589a(int i) {
        return this;
    }

    /* renamed from: a */
    public abstract C3791f mo16590a(C3792a aVar);

    /* renamed from: a */
    public abstract C3791f mo16592a(C3800k kVar);

    /* renamed from: a */
    public C3791f mo16594a(C3802m mVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C3791f mo16595a(C3818c cVar) {
        return this;
    }

    /* renamed from: a */
    public C3818c mo16596a() {
        return null;
    }

    /* renamed from: a */
    public abstract void mo16597a(char c) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16598a(double d) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16599a(float f) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16600a(long j) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16601a(C3785a aVar, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16602a(C3794h hVar) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract void mo16603a(C3803n nVar) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract void mo16604a(Object obj) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract void mo16614a(BigDecimal bigDecimal) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16615a(BigInteger bigInteger) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16616a(boolean z) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo16619a(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public boolean mo16620a(C3787c cVar) {
        return false;
    }

    /* renamed from: b */
    public abstract C3791f mo16621b(C3792a aVar);

    /* renamed from: b */
    public void mo16622b(C3787c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Generator of type ");
        sb.append(getClass().getName());
        sb.append(" does not support schema of type '");
        sb.append(cVar.mo16508a());
        sb.append("'");
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: b */
    public abstract void mo16623b(C3794h hVar) throws IOException, JsonProcessingException;

    /* renamed from: b */
    public abstract void mo16624b(C3802m mVar) throws IOException, JsonGenerationException;

    /* renamed from: b */
    public abstract void mo16626b(String str, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: b */
    public abstract void mo16627b(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: b */
    public abstract void mo16628b(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: c */
    public void mo16629c(C3802m mVar) throws IOException, JsonGenerationException {
        mo16646g(mVar.getValue());
    }

    /* renamed from: c */
    public abstract void mo16630c(String str) throws IOException, JsonGenerationException;

    /* renamed from: c */
    public abstract void mo16631c(String str, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: c */
    public abstract void mo16632c(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: c */
    public abstract void mo16633c(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: c */
    public abstract boolean mo16634c(C3792a aVar);

    public abstract void close() throws IOException;

    /* renamed from: d */
    public abstract C3800k mo16636d();

    /* renamed from: d */
    public abstract void mo16637d(C3802m mVar) throws IOException, JsonGenerationException;

    /* renamed from: d */
    public final void mo16638d(String str) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16584H();
    }

    /* renamed from: e */
    public int mo16639e() {
        return 0;
    }

    /* renamed from: e */
    public abstract void mo16640e(int i) throws IOException, JsonGenerationException;

    /* renamed from: e */
    public abstract void mo16641e(String str) throws IOException, JsonGenerationException, UnsupportedOperationException;

    /* renamed from: f */
    public abstract C3798i mo16642f();

    /* renamed from: f */
    public final void mo16643f(String str) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16586J();
    }

    public abstract void flush() throws IOException;

    /* renamed from: g */
    public Object mo16645g() {
        return null;
    }

    /* renamed from: g */
    public abstract void mo16646g(String str) throws IOException, JsonGenerationException;

    /* renamed from: h */
    public C3801l mo16647h() {
        return this.f11835a;
    }

    /* renamed from: h */
    public abstract void mo16648h(String str) throws IOException, JsonGenerationException;

    /* renamed from: i */
    public C3787c mo16649i() {
        return null;
    }

    /* renamed from: i */
    public abstract void mo16650i(String str) throws IOException, JsonGenerationException;

    public abstract boolean isClosed();

    public abstract C3804o version();

    /* renamed from: a */
    public final C3791f mo16591a(C3792a aVar, boolean z) {
        if (z) {
            mo16621b(aVar);
        } else {
            mo16590a(aVar);
        }
        return this;
    }

    /* renamed from: b */
    public final void mo16625b(String str) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16585I();
    }

    /* renamed from: a */
    public C3791f mo16593a(C3801l lVar) {
        this.f11835a = lVar;
        return this;
    }

    /* renamed from: a */
    public void mo16618a(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16601a(C3786b.m15845a(), bArr, i, i2);
    }

    /* renamed from: a */
    public void mo16617a(byte[] bArr) throws IOException, JsonGenerationException {
        mo16601a(C3786b.m15845a(), bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public int mo16588a(InputStream inputStream, int i) throws IOException, JsonGenerationException {
        return mo16587a(C3786b.m15845a(), inputStream, i);
    }

    /* renamed from: a */
    public void mo16610a(String str, String str2) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16650i(str2);
    }

    /* renamed from: a */
    public final void mo16612a(String str, boolean z) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16616a(z);
    }

    /* renamed from: a */
    public final void mo16607a(String str, int i) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16640e(i);
    }

    /* renamed from: a */
    public final void mo16608a(String str, long j) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16600a(j);
    }

    /* renamed from: a */
    public final void mo16605a(String str, double d) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16598a(d);
    }

    /* renamed from: a */
    public final void mo16606a(String str, float f) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16599a(f);
    }

    /* renamed from: a */
    public final void mo16611a(String str, BigDecimal bigDecimal) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16614a(bigDecimal);
    }

    /* renamed from: a */
    public final void mo16613a(String str, byte[] bArr) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16617a(bArr);
    }

    /* renamed from: a */
    public final void mo16609a(String str, Object obj) throws IOException, JsonProcessingException {
        mo16630c(str);
        mo16604a(obj);
    }
}

package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    static final long serialVersionUID = 123;

    /* renamed from: a */
    protected C3793g f11803a;

    protected JsonProcessingException(String str, C3793g gVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f11803a = gVar;
    }

    /* renamed from: a */
    public C3793g mo16481a() {
        return this.f11803a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo16482d() {
        return null;
    }

    /* renamed from: e */
    public String mo16483e() {
        return super.getMessage();
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C3793g a = mo16481a();
        String d = mo16482d();
        if (a == null && d == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (d != null) {
            sb.append(d);
        }
        if (a != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(a.toString());
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMessage());
        return sb.toString();
    }

    protected JsonProcessingException(String str) {
        super(str);
    }

    protected JsonProcessingException(String str, C3793g gVar) {
        this(str, gVar, null);
    }

    protected JsonProcessingException(String str, Throwable th) {
        this(str, null, th);
    }

    protected JsonProcessingException(Throwable th) {
        this(null, null, th);
    }
}

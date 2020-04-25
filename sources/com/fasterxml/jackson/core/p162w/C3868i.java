package com.fasterxml.jackson.core.p162w;

import com.fasterxml.jackson.core.C3791f;
import com.fasterxml.jackson.core.C3801l;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.w.i */
/* compiled from: MinimalPrettyPrinter */
public class C3868i implements C3801l, Serializable {

    /* renamed from: b */
    public static final String f12248b = " ";
    private static final long serialVersionUID = -562765100295218442L;

    /* renamed from: a */
    protected String f12249a;

    public C3868i() {
        this(f12248b);
    }

    /* renamed from: a */
    public void mo16762a(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a('{');
    }

    /* renamed from: b */
    public void mo17112b(String str) {
        this.f12249a = str;
    }

    /* renamed from: c */
    public void mo16766c(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a(',');
    }

    /* renamed from: d */
    public void mo16767d(C3791f fVar) throws IOException, JsonGenerationException {
    }

    /* renamed from: e */
    public void mo16768e(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a('[');
    }

    /* renamed from: f */
    public void mo16769f(C3791f fVar) throws IOException, JsonGenerationException {
    }

    /* renamed from: g */
    public void mo16770g(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a(',');
    }

    /* renamed from: h */
    public void mo16771h(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a(':');
    }

    public C3868i(String str) {
        this.f12249a = f12248b;
        this.f12249a = str;
    }

    /* renamed from: a */
    public void mo16763a(C3791f fVar, int i) throws IOException, JsonGenerationException {
        fVar.mo16597a('}');
    }

    /* renamed from: b */
    public void mo16764b(C3791f fVar) throws IOException, JsonGenerationException {
        String str = this.f12249a;
        if (str != null) {
            fVar.mo16646g(str);
        }
    }

    /* renamed from: b */
    public void mo16765b(C3791f fVar, int i) throws IOException, JsonGenerationException {
        fVar.mo16597a(']');
    }
}

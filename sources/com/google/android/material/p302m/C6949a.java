package com.google.android.material.p302m;

import android.graphics.Typeface;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.m.a */
/* compiled from: CancelableFontCallback */
public final class C6949a extends C6957f {

    /* renamed from: a */
    private final Typeface f19437a;

    /* renamed from: b */
    private final C6950a f19438b;

    /* renamed from: c */
    private boolean f19439c;

    /* renamed from: com.google.android.material.m.a$a */
    /* compiled from: CancelableFontCallback */
    public interface C6950a {
        /* renamed from: a */
        void mo27572a(Typeface typeface);
    }

    public C6949a(C6950a aVar, Typeface typeface) {
        this.f19437a = typeface;
        this.f19438b = aVar;
    }

    /* renamed from: a */
    public void mo22819a(Typeface typeface, boolean z) {
        m33318a(typeface);
    }

    /* renamed from: a */
    public void mo22818a(int i) {
        m33318a(this.f19437a);
    }

    /* renamed from: a */
    public void mo27690a() {
        this.f19439c = true;
    }

    /* renamed from: a */
    private void m33318a(Typeface typeface) {
        if (!this.f19439c) {
            this.f19438b.mo27572a(typeface);
        }
    }
}

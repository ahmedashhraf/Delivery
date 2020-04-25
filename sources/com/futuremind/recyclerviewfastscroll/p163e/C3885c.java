package com.futuremind.recyclerviewfastscroll.p163e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: com.futuremind.recyclerviewfastscroll.e.c */
/* compiled from: ScrollerViewProvider */
public abstract class C3885c {

    /* renamed from: a */
    private FastScroller f12297a;

    /* renamed from: b */
    private C3886d f12298b;

    /* renamed from: c */
    private C3886d f12299c;

    /* renamed from: a */
    public abstract View mo17163a(ViewGroup viewGroup);

    /* renamed from: a */
    public void mo17170a(FastScroller fastScroller) {
        this.f12297a = fastScroller;
    }

    /* renamed from: b */
    public abstract int mo17164b();

    /* renamed from: b */
    public abstract View mo17165b(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Context mo17171c() {
        return this.f12297a.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C3886d mo17172d() {
        if (this.f12298b == null) {
            this.f12298b = mo17168l();
        }
        return this.f12298b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FastScroller mo17173e() {
        return this.f12297a;
    }

    /* renamed from: f */
    public void mo17174f() {
        if (mo17172d() != null) {
            mo17172d().mo17160b();
        }
        if (mo17169a() != null) {
            mo17169a().mo17160b();
        }
    }

    /* renamed from: g */
    public void mo17175g() {
        if (mo17172d() != null) {
            mo17172d().mo17161c();
        }
        if (mo17169a() != null) {
            mo17169a().mo17161c();
        }
    }

    /* renamed from: h */
    public void mo17176h() {
        if (mo17172d() != null) {
            mo17172d().mo17159a();
        }
        if (mo17169a() != null) {
            mo17169a().mo17159a();
        }
    }

    /* renamed from: i */
    public void mo17177i() {
        if (mo17172d() != null) {
            mo17172d().mo17162d();
        }
        if (mo17169a() != null) {
            mo17169a().mo17162d();
        }
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: j */
    public abstract C3886d mo17166j();

    /* renamed from: k */
    public abstract TextView mo17167k();

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: l */
    public abstract C3886d mo17168l();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3886d mo17169a() {
        if (this.f12299c == null) {
            this.f12299c = mo17166j();
        }
        return this.f12299c;
    }
}

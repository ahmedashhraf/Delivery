package com.fasterxml.jackson.core.p159t;

import com.fasterxml.jackson.core.C3793g;
import com.fasterxml.jackson.core.C3798i;
import com.fasterxml.jackson.core.p158s.C3817b;
import kotlin.p217i1.C14662d0;

/* renamed from: com.fasterxml.jackson.core.t.d */
/* compiled from: JsonReadContext */
public final class C3834d extends C3798i {

    /* renamed from: f */
    protected final C3834d f12077f;

    /* renamed from: g */
    protected int f12078g;

    /* renamed from: h */
    protected int f12079h;

    /* renamed from: i */
    protected String f12080i;

    /* renamed from: j */
    protected C3834d f12081j = null;

    public C3834d(C3834d dVar, int i, int i2, int i3) {
        this.f11851a = i;
        this.f12077f = dVar;
        this.f12078g = i2;
        this.f12079h = i3;
        this.f11852b = -1;
    }

    /* renamed from: c */
    public static C3834d m16361c(int i, int i2) {
        return new C3834d(null, 0, i, i2);
    }

    /* renamed from: j */
    public static C3834d m16362j() {
        return new C3834d(null, 0, 1, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16939a(int i, int i2, int i3) {
        this.f11851a = i;
        this.f11852b = -1;
        this.f12078g = i2;
        this.f12079h = i3;
        this.f12080i = null;
    }

    /* renamed from: b */
    public C3834d mo16941b(int i, int i2) {
        C3834d dVar = this.f12081j;
        if (dVar == null) {
            C3834d dVar2 = new C3834d(this, 2, i, i2);
            this.f12081j = dVar2;
            return dVar2;
        }
        dVar.mo16939a(2, i, i2);
        return dVar;
    }

    /* renamed from: i */
    public boolean mo16942i() {
        int i = this.f11852b + 1;
        this.f11852b = i;
        if (this.f11851a == 0 || i <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f11851a;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo16735a());
            sb.append(']');
        } else if (i == 2) {
            sb.append('{');
            if (this.f12080i != null) {
                sb.append(C14662d0.f42850a);
                C3817b.m16259a(sb, this.f12080i);
                sb.append(C14662d0.f42850a);
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }

    /* renamed from: d */
    public C3834d m16370d() {
        return this.f12077f;
    }

    /* renamed from: b */
    public String mo16736b() {
        return this.f12080i;
    }

    /* renamed from: a */
    public C3834d mo16938a(int i, int i2) {
        C3834d dVar = this.f12081j;
        if (dVar == null) {
            C3834d dVar2 = new C3834d(this, 1, i, i2);
            this.f12081j = dVar2;
            return dVar2;
        }
        dVar.mo16939a(1, i, i2);
        return dVar;
    }

    /* renamed from: a */
    public C3793g mo16937a(Object obj) {
        C3793g gVar = new C3793g(obj, -1, this.f12078g, this.f12079h);
        return gVar;
    }

    /* renamed from: a */
    public void mo16940a(String str) {
        this.f12080i = str;
    }
}

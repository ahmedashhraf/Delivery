package com.fasterxml.jackson.core.p159t;

import com.fasterxml.jackson.core.C3798i;
import kotlin.p217i1.C14662d0;

/* renamed from: com.fasterxml.jackson.core.t.e */
/* compiled from: JsonWriteContext */
public class C3835e extends C3798i {

    /* renamed from: i */
    public static final int f12082i = 0;

    /* renamed from: j */
    public static final int f12083j = 1;

    /* renamed from: k */
    public static final int f12084k = 2;

    /* renamed from: l */
    public static final int f12085l = 3;

    /* renamed from: m */
    public static final int f12086m = 4;

    /* renamed from: n */
    public static final int f12087n = 5;

    /* renamed from: f */
    protected final C3835e f12088f;

    /* renamed from: g */
    protected String f12089g;

    /* renamed from: h */
    protected C3835e f12090h = null;

    protected C3835e(int i, C3835e eVar) {
        this.f11851a = i;
        this.f12088f = eVar;
        this.f11852b = -1;
    }

    /* renamed from: a */
    private C3835e m16372a(int i) {
        this.f11851a = i;
        this.f11852b = -1;
        this.f12089g = null;
        return this;
    }

    /* renamed from: l */
    public static C3835e m16373l() {
        return new C3835e(0, null);
    }

    /* renamed from: b */
    public final String mo16736b() {
        return this.f12089g;
    }

    /* renamed from: i */
    public final C3835e mo16946i() {
        C3835e eVar = this.f12090h;
        if (eVar != null) {
            return eVar.m16372a(1);
        }
        C3835e eVar2 = new C3835e(1, this);
        this.f12090h = eVar2;
        return eVar2;
    }

    /* renamed from: j */
    public final C3835e mo16947j() {
        C3835e eVar = this.f12090h;
        if (eVar != null) {
            return eVar.m16372a(2);
        }
        C3835e eVar2 = new C3835e(2, this);
        this.f12090h = eVar2;
        return eVar2;
    }

    /* renamed from: k */
    public final int mo16948k() {
        int i = this.f11851a;
        if (i != 2) {
            int i2 = 0;
            if (i == 1) {
                int i3 = this.f11852b;
                this.f11852b = i3 + 1;
                if (i3 >= 0) {
                    i2 = 1;
                }
                return i2;
            }
            this.f11852b++;
            if (this.f11852b != 0) {
                i2 = 3;
            }
            return i2;
        } else if (this.f12089g == null) {
            return 5;
        } else {
            this.f12089g = null;
            this.f11852b++;
            return 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        mo16945a(sb);
        return sb.toString();
    }

    /* renamed from: d */
    public final C3835e m16378d() {
        return this.f12088f;
    }

    /* renamed from: a */
    public final int mo16944a(String str) {
        if (this.f11851a != 2 || this.f12089g != null) {
            return 4;
        }
        this.f12089g = str;
        return this.f11852b < 0 ? 0 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16945a(StringBuilder sb) {
        int i = this.f11851a;
        if (i == 2) {
            sb.append('{');
            if (this.f12089g != null) {
                sb.append(C14662d0.f42850a);
                sb.append(this.f12089g);
                sb.append(C14662d0.f42850a);
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo16735a());
            sb.append(']');
        } else {
            sb.append("/");
        }
    }
}

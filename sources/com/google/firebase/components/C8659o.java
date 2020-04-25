package com.google.firebase.components;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import org.jivesoftware.smack.packet.Session.Feature;
import org.jivesoftware.smackx.rsm.packet.RSMSet;

@C4056a
/* renamed from: com.google.firebase.components.o */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public final class C8659o {

    /* renamed from: a */
    private final Class<?> f22700a;

    /* renamed from: b */
    private final int f22701b;

    /* renamed from: c */
    private final int f22702c;

    private C8659o(Class<?> cls, int i, int i2) {
        this.f22700a = (Class) C4300a0.m18621a(cls, (Object) "Null dependency anInterface.");
        this.f22701b = i;
        this.f22702c = i2;
    }

    @C4056a
    /* renamed from: a */
    public static C8659o m40694a(Class<?> cls) {
        return new C8659o(cls, 0, 0);
    }

    @C4056a
    /* renamed from: b */
    public static C8659o m40695b(Class<?> cls) {
        return new C8659o(cls, 0, 1);
    }

    @C4056a
    /* renamed from: c */
    public static C8659o m40696c(Class<?> cls) {
        return new C8659o(cls, 1, 0);
    }

    @C4056a
    /* renamed from: d */
    public static C8659o m40697d(Class<?> cls) {
        return new C8659o(cls, 1, 1);
    }

    @C4056a
    /* renamed from: e */
    public static C8659o m40698e(Class<?> cls) {
        return new C8659o(cls, 2, 0);
    }

    @C4056a
    /* renamed from: f */
    public static C8659o m40699f(Class<?> cls) {
        return new C8659o(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8659o)) {
            return false;
        }
        C8659o oVar = (C8659o) obj;
        if (this.f22700a == oVar.f22700a && this.f22701b == oVar.f22701b && this.f22702c == oVar.f22702c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22700a.hashCode() ^ 1000003) * 1000003) ^ this.f22701b) * 1000003) ^ this.f22702c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f22700a);
        sb.append(", type=");
        int i = this.f22701b;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? Feature.OPTIONAL_ELEMENT : RSMSet.ELEMENT;
        sb.append(str);
        sb.append(", direct=");
        if (this.f22702c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public Class<?> mo32021a() {
        return this.f22700a;
    }

    /* renamed from: b */
    public boolean mo32022b() {
        return this.f22702c == 0;
    }

    /* renamed from: c */
    public boolean mo32023c() {
        return this.f22701b == 1;
    }

    /* renamed from: d */
    public boolean mo32024d() {
        return this.f22701b == 2;
    }
}

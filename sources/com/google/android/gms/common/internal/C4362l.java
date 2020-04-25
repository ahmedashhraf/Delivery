package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.C4056a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C4056a
/* renamed from: com.google.android.gms.common.internal.l */
public abstract class C4362l {

    /* renamed from: a */
    private static final Object f13502a = new Object();

    /* renamed from: b */
    private static C4362l f13503b;

    /* renamed from: com.google.android.gms.common.internal.l$a */
    protected static final class C4363a {

        /* renamed from: a */
        private final String f13504a;

        /* renamed from: b */
        private final String f13505b;

        /* renamed from: c */
        private final ComponentName f13506c;

        /* renamed from: d */
        private final int f13507d;

        public C4363a(String str, int i) {
            this.f13504a = C4300a0.m18630b(str);
            this.f13505b = "com.google.android.gms";
            this.f13506c = null;
            this.f13507d = C13959t.f40835R1;
        }

        /* renamed from: a */
        public final ComponentName mo18338a() {
            return this.f13506c;
        }

        /* renamed from: b */
        public final String mo18340b() {
            return this.f13505b;
        }

        /* renamed from: c */
        public final int mo18341c() {
            return this.f13507d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4363a)) {
                return false;
            }
            C4363a aVar = (C4363a) obj;
            return C4413y.m19053a(this.f13504a, aVar.f13504a) && C4413y.m19053a(this.f13505b, aVar.f13505b) && C4413y.m19053a(this.f13506c, aVar.f13506c) && this.f13507d == aVar.f13507d;
        }

        public final int hashCode() {
            return C4413y.m19051a(this.f13504a, this.f13505b, this.f13506c, Integer.valueOf(this.f13507d));
        }

        public final String toString() {
            String str = this.f13504a;
            return str == null ? this.f13506c.flattenToString() : str;
        }

        /* renamed from: a */
        public final Intent mo18339a(Context context) {
            String str = this.f13504a;
            if (str != null) {
                return new Intent(str).setPackage(this.f13505b);
            }
            return new Intent().setComponent(this.f13506c);
        }

        public C4363a(String str, String str2, int i) {
            this.f13504a = C4300a0.m18630b(str);
            this.f13505b = C4300a0.m18630b(str2);
            this.f13506c = null;
            this.f13507d = i;
        }

        public C4363a(ComponentName componentName, int i) {
            this.f13504a = null;
            this.f13505b = null;
            this.f13506c = (ComponentName) C4300a0.m18620a(componentName);
            this.f13507d = C13959t.f40835R1;
        }
    }

    @C4056a
    /* renamed from: a */
    public static C4362l m18835a(Context context) {
        synchronized (f13502a) {
            if (f13503b == null) {
                f13503b = new C4313d1(context.getApplicationContext());
            }
        }
        return f13503b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18226a(C4363a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo18227b(C4363a aVar, ServiceConnection serviceConnection, String str);

    @C4056a
    /* renamed from: b */
    public void mo18337b(String str, ServiceConnection serviceConnection, String str2) {
        mo18227b(new C4363a(str, (int) C13959t.f40835R1), serviceConnection, str2);
    }

    @C4056a
    /* renamed from: b */
    public void mo18336b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo18227b(new C4363a(componentName, (int) C13959t.f40835R1), serviceConnection, str);
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18335a(String str, ServiceConnection serviceConnection, String str2) {
        return mo18226a(new C4363a(str, (int) C13959t.f40835R1), serviceConnection, str2);
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18334a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return mo18226a(new C4363a(componentName, (int) C13959t.f40835R1), serviceConnection, str);
    }

    /* renamed from: a */
    public final void mo18333a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo18227b(new C4363a(str, str2, i), serviceConnection, str3);
    }
}

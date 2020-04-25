package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.n */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4167n<L> {

    /* renamed from: a */
    private final C4170c f13052a;

    /* renamed from: b */
    private volatile L f13053b;

    /* renamed from: c */
    private final C4168a<L> f13054c;

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4168a<L> {

        /* renamed from: a */
        private final L f13055a;

        /* renamed from: b */
        private final String f13056b;

        @C4056a
        C4168a(L l, String str) {
            this.f13055a = l;
            this.f13056b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4168a)) {
                return false;
            }
            C4168a aVar = (C4168a) obj;
            return this.f13055a == aVar.f13055a && this.f13056b.equals(aVar.f13056b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f13055a) * 31) + this.f13056b.hashCode();
        }
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.n$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4169b<L> {
        @C4056a
        /* renamed from: a */
        void mo17831a();

        @C4056a
        /* renamed from: a */
        void mo17832a(L l);
    }

    /* renamed from: com.google.android.gms.common.api.internal.n$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class C4170c extends C2612r {
        public C4170c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C4300a0.m18627a(z);
            C4167n.this.mo17933b((C4169b) message.obj);
        }
    }

    @C4056a
    C4167n(@C0193h0 Looper looper, @C0193h0 L l, @C0193h0 String str) {
        this.f13052a = new C4170c(looper);
        this.f13053b = C4300a0.m18621a(l, (Object) "Listener must not be null");
        this.f13054c = new C4168a<>(l, C4300a0.m18630b(str));
    }

    @C4056a
    /* renamed from: a */
    public final void mo17931a(C4169b<? super L> bVar) {
        C4300a0.m18621a(bVar, (Object) "Notifier must not be null");
        this.f13052a.sendMessage(this.f13052a.obtainMessage(1, bVar));
    }

    @C0193h0
    @C4056a
    /* renamed from: b */
    public final C4168a<L> mo17932b() {
        return this.f13054c;
    }

    @C4056a
    /* renamed from: c */
    public final boolean mo17934c() {
        return this.f13053b != null;
    }

    /* access modifiers changed from: 0000 */
    @C4056a
    /* renamed from: b */
    public final void mo17933b(C4169b<? super L> bVar) {
        L l = this.f13053b;
        if (l == null) {
            bVar.mo17831a();
            return;
        }
        try {
            bVar.mo17832a(l);
        } catch (RuntimeException e) {
            bVar.mo17831a();
            throw e;
        }
    }

    @C4056a
    /* renamed from: a */
    public final void mo17930a() {
        this.f13053b = null;
    }
}

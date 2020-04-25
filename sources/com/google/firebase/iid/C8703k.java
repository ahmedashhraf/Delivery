package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.firebase.iid.k */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
abstract class C8703k<T> {

    /* renamed from: a */
    final int f22827a;

    /* renamed from: b */
    final C5562l<T> f22828b = new C5562l<>();

    /* renamed from: c */
    final int f22829c;

    /* renamed from: d */
    final Bundle f22830d;

    C8703k(int i, int i2, Bundle bundle) {
        this.f22827a = i;
        this.f22829c = i2;
        this.f22830d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo32127a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32133a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f22828b.mo22019a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo32128a();

    public String toString() {
        int i = this.f22829c;
        int i2 = this.f22827a;
        boolean a = mo32128a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32132a(zzag zzag) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzag);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f22828b.mo22018a((Exception) zzag);
    }
}

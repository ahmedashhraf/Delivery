package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.C0187e0;
import androidx.annotation.C0194i;
import androidx.annotation.C0224v0;
import com.google.android.gms.common.util.p173f0.C4481b;
import com.google.android.gms.tasks.C5547e;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;
import com.google.android.gms.tasks.C5566n;
import com.google.firebase.iid.C8684c0;
import com.google.firebase.iid.C8733z;
import java.util.concurrent.ExecutorService;
import p076c.p112d.p113a.p114a.p118d.p123e.C2620a;
import p076c.p112d.p113a.p114a.p118d.p123e.C2621b;
import p076c.p112d.p113a.p114a.p118d.p123e.C2625f;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.e */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public abstract class C8747e extends Service {

    /* renamed from: N */
    private final Object f22957N;

    /* renamed from: O */
    private int f22958O;

    /* renamed from: P */
    private int f22959P;
    @C0224v0

    /* renamed from: a */
    private final ExecutorService f22960a;

    /* renamed from: b */
    private Binder f22961b;

    public C8747e() {
        C2621b a = C2620a.m12731a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = "Firebase-";
        this.f22960a = a.mo10136a(new C4481b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)), C2625f.f9736b);
        this.f22957N = new Object();
        this.f22959P = 0;
    }

    /* access modifiers changed from: private */
    @C0187e0
    /* renamed from: e */
    public final C5560k<Void> mo32250d(Intent intent) {
        if (mo32194b(intent)) {
            return C5566n.m24211a(null);
        }
        C5562l lVar = new C5562l();
        this.f22960a.execute(new C8749g(this, intent, lVar));
        return lVar.mo22017a();
    }

    /* renamed from: f */
    private final void m41023f(Intent intent) {
        if (intent != null) {
            C8733z.m40936a(intent);
        }
        synchronized (this.f22957N) {
            this.f22959P--;
            if (this.f22959P == 0) {
                stopSelfResult(this.f22958O);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo32189a(Intent intent) {
        return intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32249a(Intent intent, C5560k kVar) {
        m41023f(intent);
    }

    /* renamed from: b */
    public boolean mo32194b(Intent intent) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo32195c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        if (this.f22961b == null) {
            this.f22961b = new C8684c0(new C8750h(this));
        }
        return this.f22961b;
    }

    @C0194i
    public void onDestroy() {
        this.f22960a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f22957N) {
            this.f22958O = i2;
            this.f22959P++;
        }
        Intent a = mo32189a(intent);
        if (a == null) {
            m41023f(intent);
            return 2;
        }
        C5560k e = mo32250d(a);
        if (e.mo22012d()) {
            m41023f(intent);
            return 2;
        }
        e.mo21998a(C8752j.f22971a, (C5547e<TResult>) new C8751i<TResult>(this, intent));
        return 3;
    }
}

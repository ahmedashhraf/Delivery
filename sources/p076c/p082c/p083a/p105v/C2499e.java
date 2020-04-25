package p076c.p082c.p083a.p105v;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.mrsool.utils.C11644i;
import p076c.p082c.p083a.p105v.C2496c.C2497a;

/* renamed from: c.c.a.v.e */
/* compiled from: DefaultConnectivityMonitor */
class C2499e implements C2496c {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f9517N;

    /* renamed from: O */
    private boolean f9518O;

    /* renamed from: P */
    private final BroadcastReceiver f9519P = new C2500a();

    /* renamed from: a */
    private final Context f9520a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2497a f9521b;

    /* renamed from: c.c.a.v.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C2500a extends BroadcastReceiver {
        C2500a() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean a = C2499e.this.f9517N;
            C2499e eVar = C2499e.this;
            eVar.f9517N = eVar.m12443a(context);
            if (a != C2499e.this.f9517N) {
                C2499e.this.f9521b.mo9550a(C2499e.this.f9517N);
            }
        }
    }

    public C2499e(Context context, C2497a aVar) {
        this.f9520a = context.getApplicationContext();
        this.f9521b = aVar;
    }

    public void onDestroy() {
    }

    public void onStart() {
        m12442a();
    }

    public void onStop() {
        m12448b();
    }

    /* renamed from: b */
    private void m12448b() {
        if (this.f9518O) {
            this.f9520a.unregisterReceiver(this.f9519P);
            this.f9518O = false;
        }
    }

    /* renamed from: a */
    private void m12442a() {
        if (!this.f9518O) {
            this.f9517N = m12443a(this.f9520a);
            this.f9520a.registerReceiver(this.f9519P, new IntentFilter(C11644i.f33356l7));
            this.f9518O = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12443a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

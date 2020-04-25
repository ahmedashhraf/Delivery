package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5336n3 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ Object f15329N;

    /* renamed from: O */
    private final /* synthetic */ Object f15330O;

    /* renamed from: P */
    private final /* synthetic */ Object f15331P;

    /* renamed from: Q */
    private final /* synthetic */ C5303k3 f15332Q;

    /* renamed from: a */
    private final /* synthetic */ int f15333a;

    /* renamed from: b */
    private final /* synthetic */ String f15334b;

    C5336n3(C5303k3 k3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f15332Q = k3Var;
        this.f15333a = i;
        this.f15334b = str;
        this.f15329N = obj;
        this.f15330O = obj2;
        this.f15331P = obj3;
    }

    public final void run() {
        C5446x3 o = this.f15332Q.f15309a.mo21601o();
        if (o.mo21616s()) {
            if (this.f15332Q.f15159c == 0) {
                if (this.f15332Q.mo21214m().mo21654o()) {
                    C5303k3 k3Var = this.f15332Q;
                    k3Var.mo21189B();
                    k3Var.f15159c = 'C';
                } else {
                    C5303k3 k3Var2 = this.f15332Q;
                    k3Var2.mo21189B();
                    k3Var2.f15159c = 'c';
                }
            }
            if (this.f15332Q.f15160d < 0) {
                C5303k3 k3Var3 = this.f15332Q;
                k3Var3.f15160d = k3Var3.mo21214m().mo21652n();
            }
            char charAt = "01VDIWEA?".charAt(this.f15333a);
            char a = this.f15332Q.f15159c;
            long b = this.f15332Q.f15160d;
            String a2 = C5303k3.m23053a(true, this.f15334b, this.f15329N, this.f15330O, this.f15331P);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a);
            sb.append(b);
            sb.append(":");
            sb.append(a2);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f15334b.substring(0, 1024);
            }
            o.f15569d.mo21172a(sb2, 1);
            return;
        }
        this.f15332Q.mo21530a(6, "Persisted config not initialized. Not logging error/warn");
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import androidx.annotation.C0190g;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.C4286h;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4474c0;
import com.google.android.gms.common.util.C4476d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C5414u4 extends C5248f3 {

    /* renamed from: N */
    private Boolean f15504N;
    @C0195i0

    /* renamed from: O */
    private String f15505O;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5461y8 f15506b;

    public C5414u4(C5461y8 y8Var) {
        this(y8Var, null);
    }

    @C0190g
    /* renamed from: a */
    public final void mo21161a(zzak zzak, zzm zzm) {
        C4300a0.m18620a(zzak);
        m23539b(zzm, false);
        m23537a((Runnable) new C5228d5(this, zzak, zzm));
    }

    @C0190g
    /* renamed from: b */
    public final void mo21168b(zzm zzm) {
        m23539b(zzm, false);
        m23537a((Runnable) new C5403t4(this, zzm));
    }

    @C0190g
    /* renamed from: c */
    public final String mo21169c(zzm zzm) {
        m23539b(zzm, false);
        return this.f15506b.mo21852d(zzm);
    }

    @C0190g
    /* renamed from: d */
    public final void mo21170d(zzm zzm) {
        m23539b(zzm, false);
        m23537a((Runnable) new C5305k5(this, zzm));
    }

    private C5414u4(C5461y8 y8Var, @C0195i0 String str) {
        C4300a0.m18620a(y8Var);
        this.f15506b = y8Var;
        this.f15505O = null;
    }

    /* access modifiers changed from: 0000 */
    @C4476d0
    /* renamed from: b */
    public final zzak mo21718b(zzak zzak, zzm zzm) {
        boolean z = false;
        if ("_cmp".equals(zzak.f15686a)) {
            zzaf zzaf = zzak.f15687b;
            if (!(zzaf == null || zzaf.mo21875a() == 0)) {
                String f = zzak.f15687b.mo21879f("_cis");
                if (!TextUtils.isEmpty(f) && (("referrer broadcast".equals(f) || "referrer API".equals(f)) && this.f15506b.mo21846b().mo21648j(zzm.f15709a))) {
                    z = true;
                }
            }
        }
        if (!z) {
            return zzak;
        }
        this.f15506b.mo21205d().mo21539z().mo21550a("Event has been filtered ", zzak.toString());
        zzak zzak2 = new zzak("_cmpx", zzak.f15687b, zzak.f15684N, zzak.f15685O);
        return zzak2;
    }

    @C0190g
    /* renamed from: a */
    public final void mo21162a(zzak zzak, String str, String str2) {
        C4300a0.m18620a(zzak);
        C4300a0.m18630b(str);
        m23538a(str, true);
        m23537a((Runnable) new C5272h5(this, zzak, str));
    }

    @C0190g
    /* renamed from: a */
    public final byte[] mo21167a(zzak zzak, String str) {
        C4300a0.m18630b(str);
        C4300a0.m18620a(zzak);
        m23538a(str, true);
        this.f15506b.mo21205d().mo21527A().mo21550a("Log and bundle. event", this.f15506b.mo21859m().mo21429a(zzak.f15686a));
        long b = this.f15506b.mo21208g().mo18570b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f15506b.mo21203c().mo21556b((Callable<V>) new C5261g5<V>(this, zzak, str)).get();
            if (bArr == null) {
                this.f15506b.mo21205d().mo21533t().mo21550a("Log and bundle returned null. appId", C5303k3.m23051a(str));
                bArr = new byte[0];
            }
            this.f15506b.mo21205d().mo21527A().mo21552a("Log and bundle processed. event, size, time_ms", this.f15506b.mo21859m().mo21429a(zzak.f15686a), Integer.valueOf(bArr.length), Long.valueOf((this.f15506b.mo21208g().mo18570b() / 1000000) - b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f15506b.mo21205d().mo21533t().mo21552a("Failed to log and bundle. appId, event, error", C5303k3.m23051a(str), this.f15506b.mo21859m().mo21429a(zzak.f15686a), e);
            return null;
        }
    }

    @C0190g
    /* renamed from: b */
    private final void m23539b(zzm zzm, boolean z) {
        C4300a0.m18620a(zzm);
        m23538a(zzm.f15709a, false);
        this.f15506b.mo21860n().mo21385c(zzm.f15711b, zzm.f15713c0);
    }

    @C0190g
    /* renamed from: a */
    public final void mo21163a(zzjx zzjx, zzm zzm) {
        C4300a0.m18620a(zzjx);
        m23539b(zzm, false);
        if (zzjx.mo21886a() == null) {
            m23537a((Runnable) new C5294j5(this, zzjx, zzm));
        } else {
            m23537a((Runnable) new C5283i5(this, zzjx, zzm));
        }
    }

    @C0190g
    /* renamed from: a */
    public final List<zzjx> mo21155a(zzm zzm, boolean z) {
        m23539b(zzm, false);
        try {
            List<C5265g9> list = (List) this.f15506b.mo21203c().mo21554a((Callable<V>) new C5316l5<V>(this, zzm)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5265g9 g9Var : list) {
                if (z || !C5254f9.m22844g(g9Var.f15072c)) {
                    arrayList.add(new zzjx(g9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f15506b.mo21205d().mo21533t().mo21551a("Failed to get user attributes. appId", C5303k3.m23051a(zzm.f15709a), e);
            return null;
        }
    }

    @C0190g
    /* renamed from: a */
    private final void m23538a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f15504N == null) {
                        if (!"com.google.android.gms".equals(this.f15505O) && !C4474c0.m19321a(this.f15506b.mo21206e(), Binder.getCallingUid())) {
                            if (!C4286h.m18530a(this.f15506b.mo21206e()).mo18127a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f15504N = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f15504N = Boolean.valueOf(z2);
                    }
                    if (this.f15504N.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f15506b.mo21205d().mo21533t().mo21550a("Measurement Service called with invalid calling package. appId", C5303k3.m23051a(str));
                    throw e;
                }
            }
            if (this.f15505O == null && C4284g.uidHasPackageName(this.f15506b.mo21206e(), Binder.getCallingUid(), str)) {
                this.f15505O = str;
            }
            if (!str.equals(this.f15505O)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        String str2 = "Measurement Service called without app package";
        this.f15506b.mo21205d().mo21533t().mo21549a(str2);
        throw new SecurityException(str2);
    }

    @C0190g
    /* renamed from: a */
    public final void mo21160a(long j, String str, String str2, String str3) {
        C5338n5 n5Var = new C5338n5(this, str2, str3, str, j);
        m23537a((Runnable) n5Var);
    }

    @C0190g
    /* renamed from: a */
    public final void mo21166a(zzs zzs, zzm zzm) {
        C4300a0.m18620a(zzs);
        C4300a0.m18620a(zzs.f15717N);
        m23539b(zzm, false);
        zzs zzs2 = new zzs(zzs);
        zzs2.f15726a = zzm.f15709a;
        if (zzs.f15717N.mo21886a() == null) {
            m23537a((Runnable) new C5436w4(this, zzs2, zzm));
        } else {
            m23537a((Runnable) new C5425v4(this, zzs2, zzm));
        }
    }

    @C0190g
    /* renamed from: a */
    public final void mo21165a(zzs zzs) {
        C4300a0.m18620a(zzs);
        C4300a0.m18620a(zzs.f15717N);
        m23538a(zzs.f15726a, true);
        zzs zzs2 = new zzs(zzs);
        if (zzs.f15717N.mo21886a() == null) {
            m23537a((Runnable) new C5457y4(this, zzs2));
        } else {
            m23537a((Runnable) new C5447x4(this, zzs2));
        }
    }

    @C0190g
    /* renamed from: a */
    public final List<zzjx> mo21159a(String str, String str2, boolean z, zzm zzm) {
        m23539b(zzm, false);
        try {
            List<C5265g9> list = (List) this.f15506b.mo21203c().mo21554a((Callable<V>) new C5195a5<V>(this, zzm, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5265g9 g9Var : list) {
                if (z || !C5254f9.m22844g(g9Var.f15072c)) {
                    arrayList.add(new zzjx(g9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f15506b.mo21205d().mo21533t().mo21551a("Failed to get user attributes. appId", C5303k3.m23051a(zzm.f15709a), e);
            return Collections.emptyList();
        }
    }

    @C0190g
    /* renamed from: a */
    public final List<zzjx> mo21158a(String str, String str2, String str3, boolean z) {
        m23538a(str, true);
        try {
            List<C5265g9> list = (List) this.f15506b.mo21203c().mo21554a((Callable<V>) new C5468z4<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5265g9 g9Var : list) {
                if (z || !C5254f9.m22844g(g9Var.f15072c)) {
                    arrayList.add(new zzjx(g9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f15506b.mo21205d().mo21533t().mo21551a("Failed to get user attributes. appId", C5303k3.m23051a(str), e);
            return Collections.emptyList();
        }
    }

    @C0190g
    /* renamed from: a */
    public final List<zzs> mo21156a(String str, String str2, zzm zzm) {
        m23539b(zzm, false);
        try {
            return (List) this.f15506b.mo21203c().mo21554a((Callable<V>) new C5217c5<V>(this, zzm, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f15506b.mo21205d().mo21533t().mo21550a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @C0190g
    /* renamed from: a */
    public final List<zzs> mo21157a(String str, String str2, String str3) {
        m23538a(str, true);
        try {
            return (List) this.f15506b.mo21203c().mo21554a((Callable<V>) new C5206b5<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f15506b.mo21205d().mo21533t().mo21550a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @C0190g
    /* renamed from: a */
    public final void mo21164a(zzm zzm) {
        m23538a(zzm.f15709a, false);
        m23537a((Runnable) new C5250f5(this, zzm));
    }

    @C4476d0
    /* renamed from: a */
    private final void m23537a(Runnable runnable) {
        C4300a0.m18620a(runnable);
        if (this.f15506b.mo21203c().mo21558t()) {
            runnable.run();
        } else {
            this.f15506b.mo21203c().mo21555a(runnable);
        }
    }
}

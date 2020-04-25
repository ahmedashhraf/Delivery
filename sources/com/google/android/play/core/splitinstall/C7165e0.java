package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.tasks.C7191d;
import com.google.android.play.core.tasks.C7194f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p076c.p112d.p113a.p130b.p131a.p132c.C6162a;

/* renamed from: com.google.android.play.core.splitinstall.e0 */
final class C7165e0 implements C7158b {

    /* renamed from: a */
    private final C7169g0 f20278a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5772b0 f20279b;

    /* renamed from: c */
    private final C5784z f20280c;

    /* renamed from: d */
    private final C7184o f20281d;

    /* renamed from: e */
    private final Handler f20282e;

    C7165e0(C7169g0 g0Var, Context context) {
        this(g0Var, context, context.getPackageName());
    }

    private C7165e0(C7169g0 g0Var, Context context, String str) {
        this.f20282e = new Handler(Looper.getMainLooper());
        this.f20280c = new C5784z(context, str);
        this.f20278a = g0Var;
        this.f20279b = C5772b0.m25324a(context);
        this.f20281d = new C7184o(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static List<String> m34425f(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            if (VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C7191d<SplitInstallSessionState> mo28574a(int i) {
        return this.f20278a.mo28598a(i);
    }

    /* renamed from: a */
    public final C7191d<Integer> mo28575a(C7161d dVar) {
        boolean z;
        if (!dVar.mo28587a().isEmpty() && VERSION.SDK_INT < 21) {
            return C7194f.m34505a((Exception) new SplitInstallException(-5));
        }
        List<Locale> a = dVar.mo28587a();
        Set b = this.f20280c.mo23068b();
        if (b == null) {
            z = true;
        } else {
            HashSet hashSet = new HashSet();
            for (Locale language : a) {
                hashSet.add(language.getLanguage());
            }
            z = b.containsAll(hashSet);
        }
        if (z) {
            if (mo28577a().containsAll(dVar.mo28588b()) && (VERSION.SDK_INT < 21 || Collections.disjoint(dVar.mo28588b(), this.f20281d.mo28605a()))) {
                this.f20282e.post(new C7163d0(this, dVar));
                return C7194f.m34506a(Integer.valueOf(0));
            }
        }
        return this.f20278a.mo28599a(dVar.mo28588b(), m34425f(dVar.mo28587a()));
    }

    /* renamed from: a */
    public final C7191d<Void> mo28576a(List<String> list) {
        this.f20281d.mo28606a(list);
        return this.f20278a.mo28600a(list);
    }

    /* renamed from: a */
    public final Set<String> mo28577a() {
        return this.f20280c.mo23067a();
    }

    /* renamed from: a */
    public final synchronized void mo28578a(C7164e eVar) {
        this.f20279b.mo10357b(eVar);
    }

    /* renamed from: a */
    public final boolean mo28579a(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        activity.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    /* renamed from: b */
    public final C7191d<List<SplitInstallSessionState>> mo28580b() {
        return this.f20278a.mo28597a();
    }

    /* renamed from: b */
    public final C7191d<Void> mo28581b(int i) {
        return this.f20278a.mo28601b(i);
    }

    /* renamed from: b */
    public final C7191d<Void> mo28582b(List<Locale> list) {
        return VERSION.SDK_INT < 21 ? C7194f.m34505a((Exception) new SplitInstallException(-5)) : this.f20278a.mo28603c(m34425f(list));
    }

    /* renamed from: b */
    public final synchronized void mo28583b(C7164e eVar) {
        this.f20279b.mo10354a((C6162a<StateT>) eVar);
    }

    /* renamed from: c */
    public final C7191d<Void> mo28584c(List<String> list) {
        return this.f20278a.mo28602b(list);
    }

    /* renamed from: c */
    public final Set<String> mo28585c() {
        Set<String> b = this.f20280c.mo23068b();
        return b == null ? Collections.emptySet() : b;
    }

    /* renamed from: d */
    public final C7191d<Void> mo28586d(List<Locale> list) {
        return VERSION.SDK_INT < 21 ? C7194f.m34505a((Exception) new SplitInstallException(-5)) : this.f20278a.mo28604d(m34425f(list));
    }
}

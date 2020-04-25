package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0187e0;
import com.google.android.gms.internal.measurement.C5064y9;

@TargetApi(14)
@C0187e0
/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5416u6 implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C5437w5 f15507a;

    private C5416u6(C5437w5 w5Var) {
        this.f15507a = w5Var;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[SYNTHETIC, Splitter:B:33:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8 A[Catch:{ Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9 A[SYNTHETIC, Splitter:B:49:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128 A[Catch:{ Exception -> 0x01ab }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0129 A[Catch:{ Exception -> 0x01ab }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m23558a(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.w5 r3 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C5310l.f15191D0     // Catch:{ Exception -> 0x01ab }
            boolean r3 = r3.mo21635a(r4)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.measurement.internal.w5 r3 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C5310l.f15195F0     // Catch:{ Exception -> 0x01ab }
            boolean r3 = r3.mo21635a(r11)     // Catch:{ Exception -> 0x01ab }
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.measurement.internal.w5 r3 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C5310l.f15193E0     // Catch:{ Exception -> 0x01ab }
            boolean r3 = r3.mo21635a(r11)     // Catch:{ Exception -> 0x01ab }
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x009a
        L_0x003f:
            com.google.android.gms.measurement.internal.w5 r3 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.f9 r3 = r3.mo21212k()     // Catch:{ Exception -> 0x01ab }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01ab }
            if (r11 == 0) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01ab }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01ab }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01ab }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01ab }
            if (r11 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21527A()     // Catch:{ Exception -> 0x01ab }
            r3.mo21549a(r4)     // Catch:{ Exception -> 0x01ab }
            goto L_0x003d
        L_0x0070:
            com.google.android.gms.measurement.internal.f9 r3 = r3.mo21212k()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r11 = "https://google.com/search?"
            java.lang.String r12 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x01ab }
            int r13 = r12.length()     // Catch:{ Exception -> 0x01ab }
            if (r13 == 0) goto L_0x0085
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x01ab }
            goto L_0x008b
        L_0x0085:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01ab }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01ab }
            r11 = r12
        L_0x008b:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01ab }
            android.os.Bundle r3 = r3.mo21360a(r11)     // Catch:{ Exception -> 0x01ab }
            if (r3 == 0) goto L_0x009a
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01ab }
        L_0x009a:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.w5 r14 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.f9 r14 = r14.mo21212k()     // Catch:{ Exception -> 0x01ab }
            r15 = r19
            android.os.Bundle r14 = r14.mo21360a(r15)     // Catch:{ Exception -> 0x01ab }
            if (r14 == 0) goto L_0x00e9
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C5310l.f15191D0     // Catch:{ Exception -> 0x01ab }
            boolean r6 = r6.mo21635a(r15)     // Catch:{ Exception -> 0x01ab }
            if (r6 == 0) goto L_0x00e2
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01ab }
            if (r6 != 0) goto L_0x00e2
            if (r3 == 0) goto L_0x00e2
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01ab }
            if (r6 == 0) goto L_0x00e2
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01ab }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x01ab }
            r9[r11] = r16     // Catch:{ Exception -> 0x01ab }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x01ab }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x01ab }
        L_0x00e2:
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            r6.mo21764a(r0, r12, r14)     // Catch:{ Exception -> 0x01ab }
            goto L_0x00e9
        L_0x00e8:
            r14 = 0
        L_0x00e9:
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C5310l.f15195F0     // Catch:{ Exception -> 0x01ab }
            boolean r6 = r6.mo21635a(r9)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x0122
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C5310l.f15193E0     // Catch:{ Exception -> 0x01ab }
            boolean r6 = r6.mo21635a(r15)     // Catch:{ Exception -> 0x01ab }
            if (r6 != 0) goto L_0x0122
            if (r3 == 0) goto L_0x0122
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01ab }
            if (r6 == 0) goto L_0x0122
            if (r14 == 0) goto L_0x0117
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01ab }
            if (r6 != 0) goto L_0x0122
        L_0x0117:
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01ab }
            r6.mo21768a(r9, r14, r15, r13)     // Catch:{ Exception -> 0x01ab }
        L_0x0122:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01ab }
            if (r6 == 0) goto L_0x0129
            return
        L_0x0129:
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.k3 r6 = r6.mo21205d()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21527A()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r14 = "Activity created with referrer"
            r6.mo21550a(r14, r2)     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.w5 r6 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21214m()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C5310l.f15193E0     // Catch:{ Exception -> 0x01ab }
            boolean r6 = r6.mo21635a(r14)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x0166
            if (r3 == 0) goto L_0x0150
            com.google.android.gms.measurement.internal.w5 r2 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            r2.mo21764a(r0, r12, r3)     // Catch:{ Exception -> 0x01ab }
            goto L_0x015f
        L_0x0150:
            com.google.android.gms.measurement.internal.w5 r0 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21527A()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.mo21550a(r3, r2)     // Catch:{ Exception -> 0x01ab }
        L_0x015f:
            com.google.android.gms.measurement.internal.w5 r0 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            r2 = 0
            r0.mo21768a(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01ab }
            return
        L_0x0166:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01ab }
            if (r0 == 0) goto L_0x018f
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01ab }
            if (r0 != 0) goto L_0x018e
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01ab }
            if (r0 != 0) goto L_0x018e
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01ab }
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01ab }
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01ab }
            if (r0 == 0) goto L_0x018f
        L_0x018e:
            r11 = 1
        L_0x018f:
            if (r11 != 0) goto L_0x019f
            com.google.android.gms.measurement.internal.w5 r0 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ Exception -> 0x01ab }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21527A()     // Catch:{ Exception -> 0x01ab }
            r0.mo21549a(r4)     // Catch:{ Exception -> 0x01ab }
            return
        L_0x019f:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01ab }
            if (r0 != 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.w5 r0 = r1.f15507a     // Catch:{ Exception -> 0x01ab }
            r0.mo21768a(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01ab }
        L_0x01aa:
            return
        L_0x01ab:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w5 r2 = r1.f15507a
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo21550a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5416u6.m23558a(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f15507a.mo21205d().mo21528C().mo21549a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f15507a.mo21212k();
                        String str = C5254f9.m22830a(intent) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        C5064y9.m21842b();
                        if (((Boolean) C5310l.f15197G0.mo21225a(null)).booleanValue()) {
                            C5326m4 c = this.f15507a.mo21203c();
                            C5405t6 t6Var = new C5405t6(this, z, data, str, queryParameter);
                            c.mo21555a((Runnable) t6Var);
                        } else {
                            m23558a(z, data, str, queryParameter);
                        }
                        this.f15507a.mo21231r().mo21308a(activity, bundle);
                        return;
                    }
                }
                this.f15507a.mo21231r().mo21308a(activity, bundle);
            }
        } catch (Exception e) {
            this.f15507a.mo21205d().mo21533t().mo21550a("Throwable caught in onActivityCreated", e);
        } finally {
            this.f15507a.mo21231r().mo21308a(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f15507a.mo21231r().mo21313c(activity);
    }

    @C0187e0
    public final void onActivityPaused(Activity activity) {
        this.f15507a.mo21231r().mo21311b(activity);
        C5330m8 t = this.f15507a.mo21233t();
        t.mo21203c().mo21555a((Runnable) new C5396s8(t, t.mo21208g().mo18572d()));
    }

    @C0187e0
    public final void onActivityResumed(Activity activity) {
        this.f15507a.mo21231r().mo21307a(activity);
        C5330m8 t = this.f15507a.mo21233t();
        t.mo21203c().mo21555a((Runnable) new C5363p8(t, t.mo21208g().mo18572d()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f15507a.mo21231r().mo21312b(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ C5416u6(C5437w5 w5Var, C5458y5 y5Var) {
        this(w5Var);
    }
}

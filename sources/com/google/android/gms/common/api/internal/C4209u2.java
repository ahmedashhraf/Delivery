package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C4476d0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.u2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4209u2 {

    /* renamed from: d */
    public static final Status f13155d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e */
    private static final BasePendingResult<?>[] f13156e = new BasePendingResult[0];
    @C4476d0

    /* renamed from: a */
    final Set<BasePendingResult<?>> f13157a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C4214v2 f13158b = new C4204t2(this);

    /* renamed from: c */
    private final Map<C4062c<?>, C4071f> f13159c;

    public C4209u2(Map<C4062c<?>, C4071f> map) {
        this.f13159c = map;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17980a(BasePendingResult<? extends C4246q> basePendingResult) {
        this.f13157a.add(basePendingResult);
        basePendingResult.mo17742a(this.f13158b);
    }

    /* renamed from: b */
    public final void mo17981b() {
        for (BasePendingResult c : (BasePendingResult[]) this.f13157a.toArray(f13156e)) {
            c.mo17748c(f13155d);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.x, com.google.android.gms.common.api.internal.t2, com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.r] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0, types: [com.google.android.gms.common.api.x, com.google.android.gms.common.api.internal.t2, com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.r]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.r, com.google.android.gms.common.api.x, com.google.android.gms.common.api.internal.t2]
      mth insns count: 47
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17979a() {
        /*
            r8 = this;
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r8.f13157a
            com.google.android.gms.common.api.internal.BasePendingResult<?>[] r1 = f13156e
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.gms.common.api.internal.BasePendingResult[] r0 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x0088
            r4 = r0[r3]
            r5 = 0
            r4.mo17742a(r5)
            java.lang.Integer r6 = r4.mo17750d()
            if (r6 != 0) goto L_0x0027
            boolean r5 = r4.mo17752f()
            if (r5 == 0) goto L_0x0085
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f13157a
            r5.remove(r4)
            goto L_0x0085
        L_0x0027:
            r4.mo17745a(r5)
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r6 = r8.f13159c
            r7 = r4
            com.google.android.gms.common.api.internal.e$a r7 = (com.google.android.gms.common.api.internal.C4115e.C4116a) r7
            com.google.android.gms.common.api.a$c r7 = r7.mo17814i()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.common.api.a$f r6 = (com.google.android.gms.common.api.C4059a.C4071f) r6
            android.os.IBinder r6 = r6.mo17647p()
            boolean r7 = r4.mo17751e()
            if (r7 == 0) goto L_0x004c
            com.google.android.gms.common.api.internal.w2 r7 = new com.google.android.gms.common.api.internal.w2
            r7.<init>(r4, r5, r6, r5)
            r4.mo17742a(r7)
            goto L_0x0080
        L_0x004c:
            if (r6 == 0) goto L_0x006f
            boolean r7 = r6.isBinderAlive()
            if (r7 == 0) goto L_0x006f
            com.google.android.gms.common.api.internal.w2 r7 = new com.google.android.gms.common.api.internal.w2
            r7.<init>(r4, r5, r6, r5)
            r4.mo17742a(r7)
            r6.linkToDeath(r7, r2)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0080
        L_0x0060:
            r4.mo17653b()
            java.lang.Integer r6 = r4.mo17750d()
            int r6 = r6.intValue()
            r5.mo18015a(r6)
            goto L_0x0080
        L_0x006f:
            r4.mo17742a(r5)
            r4.mo17653b()
            java.lang.Integer r6 = r4.mo17750d()
            int r6 = r6.intValue()
            r5.mo18015a(r6)
        L_0x0080:
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f13157a
            r5.remove(r4)
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C4209u2.mo17979a():void");
    }
}

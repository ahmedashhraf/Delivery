package p076c.p112d.p113a.p114a.p129i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.p170o.C4433a;
import com.google.android.gms.common.util.C4472b0;
import com.google.android.gms.common.util.C4478e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p201f.p202a.p203u.C5969d;

@C4056a
@C4312d0
@C5969d
/* renamed from: c.d.a.a.i.d */
public class C2688d {

    /* renamed from: n */
    private static ScheduledExecutorService f9790n;

    /* renamed from: o */
    private static volatile C2689a f9791o = new C2690e();

    /* renamed from: a */
    private final Object f9792a;

    /* renamed from: b */
    private final WakeLock f9793b;

    /* renamed from: c */
    private WorkSource f9794c;

    /* renamed from: d */
    private final int f9795d;

    /* renamed from: e */
    private final String f9796e;

    /* renamed from: f */
    private final String f9797f;

    /* renamed from: g */
    private final String f9798g;

    /* renamed from: h */
    private final Context f9799h;

    /* renamed from: i */
    private boolean f9800i;

    /* renamed from: j */
    private final Map<String, Integer[]> f9801j;

    /* renamed from: k */
    private final Set<Future<?>> f9802k;

    /* renamed from: l */
    private int f9803l;

    /* renamed from: m */
    private AtomicInteger f9804m;

    /* renamed from: c.d.a.a.i.d$a */
    public interface C2689a {
    }

    @C4056a
    public C2688d(@C0193h0 Context context, int i, @C0193h0 String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    /* renamed from: c */
    private final List<String> m13055c() {
        return C4478e0.m19333a(this.f9794c);
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.common.stats.c.a(android.os.PowerManager$WakeLock, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f9803l == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C4465d.m19284a().mo18556a(r13.f9799h, com.google.android.gms.common.stats.C4464c.m19281a(r13.f9793b, r6), 7, r13.f9796e, r6, null, r13.f9795d, m13055c(), r14);
        r13.f9803l++;
     */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10348a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f9804m
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m13052a(r0)
            java.lang.Object r0 = r13.f9792a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f9801j     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.f9803l     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f9793b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f9801j     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.f9803l = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.f9800i     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f9801j     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f9801j     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.f9800i     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.f9803l     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C4465d.m19284a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.f9799h     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f9793b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.C4464c.m19281a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f9796e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f9795d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.m13055c()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.mo18556a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.f9803l     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.f9803l = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f9793b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = f9790n
            c.d.a.a.i.f r1 = new c.d.a.a.i.f
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p114a.p129i.C2688d.mo10348a(long):void");
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.common.stats.c.a(android.os.PowerManager$WakeLock, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r12.f9803l == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        com.google.android.gms.common.stats.C4465d.m19284a().mo18555a(r12.f9799h, com.google.android.gms.common.stats.C4464c.m19281a(r12.f9793b, r6), 8, r12.f9796e, r6, (java.lang.String) null, r12.f9795d, m13055c());
        r12.f9803l--;
     */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10351b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f9804m
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0013
            java.lang.String r0 = r12.f9796e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            r0.concat(r1)
        L_0x0013:
            r0 = 0
            java.lang.String r6 = r12.m13052a(r0)
            java.lang.Object r0 = r12.f9792a
            monitor-enter(r0)
            boolean r1 = r12.f9800i     // Catch:{ all -> 0x0078 }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x004c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f9801j     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0078 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r1 = 0
            goto L_0x004a
        L_0x002d:
            r2 = r1[r11]     // Catch:{ all -> 0x0078 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0078 }
            if (r2 != r10) goto L_0x003c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f9801j     // Catch:{ all -> 0x0078 }
            r1.remove(r6)     // Catch:{ all -> 0x0078 }
            r1 = 1
            goto L_0x004a
        L_0x003c:
            r2 = r1[r11]     // Catch:{ all -> 0x0078 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0078 }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0078 }
            r1[r11] = r2     // Catch:{ all -> 0x0078 }
            goto L_0x002b
        L_0x004a:
            if (r1 != 0) goto L_0x0054
        L_0x004c:
            boolean r1 = r12.f9800i     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0073
            int r1 = r12.f9803l     // Catch:{ all -> 0x0078 }
            if (r1 != r10) goto L_0x0073
        L_0x0054:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C4465d.m19284a()     // Catch:{ all -> 0x0078 }
            android.content.Context r2 = r12.f9799h     // Catch:{ all -> 0x0078 }
            android.os.PowerManager$WakeLock r3 = r12.f9793b     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = com.google.android.gms.common.stats.C4464c.m19281a(r3, r6)     // Catch:{ all -> 0x0078 }
            r4 = 8
            java.lang.String r5 = r12.f9796e     // Catch:{ all -> 0x0078 }
            r7 = 0
            int r8 = r12.f9795d     // Catch:{ all -> 0x0078 }
            java.util.List r9 = r12.m13055c()     // Catch:{ all -> 0x0078 }
            r1.mo18555a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0078 }
            int r1 = r12.f9803l     // Catch:{ all -> 0x0078 }
            int r1 = r1 - r10
            r12.f9803l = r1     // Catch:{ all -> 0x0078 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            r12.m13053a(r11)
            return
        L_0x0078:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x007b:
            throw r1
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p114a.p129i.C2688d.mo10351b():void");
    }

    private C2688d(@C0193h0 Context context, int i, @C0193h0 String str, @C0195i0 String str2, @C0193h0 String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C2688d(@C0193h0 Context context, int i, @C0193h0 String str, @C0195i0 String str2, @C0193h0 String str3, @C0195i0 String str4) {
        this.f9792a = this;
        this.f9800i = true;
        this.f9801j = new HashMap();
        this.f9802k = Collections.synchronizedSet(new HashSet());
        this.f9804m = new AtomicInteger(0);
        C4300a0.m18621a(context, (Object) "WakeLock: context must not be null");
        C4300a0.m18622a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f9795d = i;
        this.f9797f = null;
        this.f9798g = null;
        this.f9799h = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String str5 = "*gcore*:";
            String valueOf = String.valueOf(str);
            this.f9796e = valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5);
        } else {
            this.f9796e = str;
        }
        this.f9793b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C4478e0.m19335a(context)) {
            if (C4472b0.m19314b(str3)) {
                str3 = context.getPackageName();
            }
            this.f9794c = C4478e0.m19329a(context, str3);
            WorkSource workSource = this.f9794c;
            if (workSource != null && C4478e0.m19335a(this.f9799h)) {
                WorkSource workSource2 = this.f9794c;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.f9794c = workSource;
                }
                try {
                    this.f9793b.setWorkSource(this.f9794c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        if (f9790n == null) {
            f9790n = C4433a.m19096a().mo18438a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13053a(int i) {
        if (this.f9793b.isHeld()) {
            try {
                this.f9793b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    String.valueOf(this.f9796e).concat(" was already released!");
                } else {
                    throw e;
                }
            }
            this.f9793b.isHeld();
        }
    }

    /* renamed from: a */
    private final String m13052a(String str) {
        if (this.f9800i) {
            return !TextUtils.isEmpty(str) ? str : this.f9797f;
        }
        return this.f9797f;
    }

    @C4056a
    /* renamed from: a */
    public void mo10349a(boolean z) {
        this.f9793b.setReferenceCounted(z);
        this.f9800i = z;
    }

    @C4056a
    /* renamed from: a */
    public boolean mo10350a() {
        return this.f9793b.isHeld();
    }
}

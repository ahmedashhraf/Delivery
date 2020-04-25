package p212io.branch.referral;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6017h;

/* renamed from: io.branch.referral.h0 */
/* compiled from: ServerRequestQueue */
class C14131h0 {

    /* renamed from: d */
    private static final String f41567d = "BNCServerRequestQueue";

    /* renamed from: e */
    private static final int f41568e = 25;

    /* renamed from: f */
    private static C14131h0 f41569f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f41570g = new Object();

    /* renamed from: a */
    private SharedPreferences f41571a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Editor f41572b = this.f41571a.edit();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C14205y> f41573c;

    /* renamed from: io.branch.referral.h0$a */
    /* compiled from: ServerRequestQueue */
    class C14132a implements Runnable {
        C14132a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:13|23|24|25|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(4:6|(2:8|(2:10|33)(1:32))(1:31)|30|4)|(2:11|12)|20|21) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0089 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0074=Splitter:B:20:0x0074, B:25:0x0089=Splitter:B:25:0x0089} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.Object r0 = p212io.branch.referral.C14131h0.f41570g
                monitor-enter(r0)
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x008a }
                r1.<init>()     // Catch:{ all -> 0x008a }
                io.branch.referral.h0 r2 = p212io.branch.referral.C14131h0.this     // Catch:{ all -> 0x008a }
                java.util.List r2 = r2.f41573c     // Catch:{ all -> 0x008a }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008a }
            L_0x0014:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x0030
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x008a }
                io.branch.referral.y r3 = (p212io.branch.referral.C14205y) r3     // Catch:{ all -> 0x008a }
                boolean r4 = r3.mo44622l()     // Catch:{ all -> 0x008a }
                if (r4 == 0) goto L_0x0014
                org.json.JSONObject r3 = r3.mo45028t()     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x0014
                r1.put(r3)     // Catch:{ all -> 0x008a }
                goto L_0x0014
            L_0x0030:
                io.branch.referral.h0 r2 = p212io.branch.referral.C14131h0.this     // Catch:{ Exception -> 0x0046 }
                android.content.SharedPreferences$Editor r2 = r2.f41572b     // Catch:{ Exception -> 0x0046 }
                java.lang.String r3 = "BNCServerRequestQueue"
                java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0046 }
                android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)     // Catch:{ Exception -> 0x0046 }
                r2.commit()     // Catch:{ Exception -> 0x0046 }
                goto L_0x0074
            L_0x0044:
                r2 = move-exception
                goto L_0x0076
            L_0x0046:
                r2 = move-exception
                java.lang.String r3 = "Persisting Queue: "
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
                r4.<init>()     // Catch:{ all -> 0x0044 }
                java.lang.String r5 = "Failed to persit queue "
                r4.append(r5)     // Catch:{ all -> 0x0044 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0044 }
                r4.append(r2)     // Catch:{ all -> 0x0044 }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0044 }
                p212io.branch.referral.C14204x.m61509d(r3, r2)     // Catch:{ all -> 0x0044 }
                io.branch.referral.h0 r2 = p212io.branch.referral.C14131h0.this     // Catch:{ Exception -> 0x0074 }
                android.content.SharedPreferences$Editor r2 = r2.f41572b     // Catch:{ Exception -> 0x0074 }
                java.lang.String r3 = "BNCServerRequestQueue"
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0074 }
                android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)     // Catch:{ Exception -> 0x0074 }
                r1.commit()     // Catch:{ Exception -> 0x0074 }
            L_0x0074:
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                return
            L_0x0076:
                io.branch.referral.h0 r3 = p212io.branch.referral.C14131h0.this     // Catch:{ Exception -> 0x0089 }
                android.content.SharedPreferences$Editor r3 = r3.f41572b     // Catch:{ Exception -> 0x0089 }
                java.lang.String r4 = "BNCServerRequestQueue"
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0089 }
                android.content.SharedPreferences$Editor r1 = r3.putString(r4, r1)     // Catch:{ Exception -> 0x0089 }
                r1.commit()     // Catch:{ Exception -> 0x0089 }
            L_0x0089:
                throw r2     // Catch:{ all -> 0x008a }
            L_0x008a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                goto L_0x008e
            L_0x008d:
                throw r1
            L_0x008e:
                goto L_0x008d
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.C14132a.run():void");
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private C14131h0(Context context) {
        this.f41571a = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.f41573c = m61108b(context);
    }

    /* renamed from: i */
    private void m61110i() {
        new Thread(new C14132a()).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo44658c() {
        synchronized (f41570g) {
            for (C14205y yVar : this.f41573c) {
                if (yVar != null && ((yVar instanceof C14145l0) || (yVar instanceof C14147m0))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p212io.branch.referral.C14205y mo44659d() {
        /*
            r4 = this;
            java.lang.Object r0 = f41570g
            monitor-enter(r0)
            r1 = 0
            java.util.List<io.branch.referral.y> r2 = r4.f41573c     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0013 }
            r3 = 0
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0013 }
            io.branch.referral.y r2 = (p212io.branch.referral.C14205y) r2     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0013 }
            r4.m61110i()     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0014 }
            goto L_0x0014
        L_0x0011:
            r1 = move-exception
            goto L_0x0016
        L_0x0013:
            r2 = r1
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return r2
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.mo44659d():io.branch.referral.y");
    }

    /* renamed from: e */
    public int mo44660e() {
        int size;
        synchronized (f41570g) {
            size = this.f41573c.size();
        }
        return size;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C14205y mo44661f() {
        C14205y yVar;
        synchronized (f41570g) {
            try {
                yVar = (C14205y) this.f41573c.get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                yVar = null;
            }
        }
        return yVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo44662g() {
        synchronized (f41570g) {
            for (C14205y yVar : this.f41573c) {
                if (yVar != null && (yVar instanceof C14125e0)) {
                    yVar.mo45015a(C14207b.STRONG_MATCH_PENDING_WAIT_LOCK);
                }
            }
        }
    }

    /* renamed from: a */
    public static C14131h0 m61105a(Context context) {
        if (f41569f == null) {
            synchronized (C14131h0.class) {
                if (f41569f == null) {
                    f41569f = new C14131h0(context);
                }
            }
        }
        return f41569f;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0039 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<p212io.branch.referral.C14205y> m61108b(android.content.Context r7) {
        /*
            r6 = this;
            android.content.SharedPreferences r0 = r6.f41571a
            java.lang.String r1 = "BNCServerRequestQueue"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List r1 = java.util.Collections.synchronizedList(r1)
            java.lang.Object r2 = f41570g
            monitor-enter(r2)
            if (r0 == 0) goto L_0x0039
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0039 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0039 }
            r0 = 0
            int r4 = r3.length()     // Catch:{ JSONException -> 0x0039 }
            r5 = 25
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ JSONException -> 0x0039 }
        L_0x0027:
            if (r0 >= r4) goto L_0x0039
            org.json.JSONObject r5 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0039 }
            io.branch.referral.y r5 = p212io.branch.referral.C14205y.m61598a(r5, r7)     // Catch:{ JSONException -> 0x0039 }
            if (r5 == 0) goto L_0x0036
            r1.add(r5)     // Catch:{ JSONException -> 0x0039 }
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return r1
        L_0x003b:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003e:
            throw r7
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.m61108b(android.content.Context):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44652a(C14205y yVar) {
        synchronized (f41570g) {
            if (yVar != null) {
                this.f41573c.add(yVar);
                if (mo44660e() >= 25) {
                    this.f41573c.remove(1);
                }
                m61110i();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p212io.branch.referral.C14205y mo44655b(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = f41570g
            monitor-enter(r0)
            r1 = 0
            java.util.List<io.branch.referral.y> r2 = r3.f41573c     // Catch:{ IndexOutOfBoundsException -> 0x0012 }
            java.lang.Object r4 = r2.remove(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0012 }
            io.branch.referral.y r4 = (p212io.branch.referral.C14205y) r4     // Catch:{ IndexOutOfBoundsException -> 0x0012 }
            r3.m61110i()     // Catch:{ IndexOutOfBoundsException -> 0x0013 }
            goto L_0x0013
        L_0x0010:
            r4 = move-exception
            goto L_0x0015
        L_0x0012:
            r4 = r1
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return r4
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.mo44655b(int):io.branch.referral.y");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14205y mo44648a(int i) {
        C14205y yVar;
        synchronized (f41570g) {
            try {
                yVar = (C14205y) this.f41573c.get(i);
            } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                yVar = null;
            }
        }
        return yVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44657b(p212io.branch.referral.C14205y r4) {
        /*
            r3 = this;
            java.lang.Object r0 = f41570g
            monitor-enter(r0)
            r1 = 0
            java.util.List<io.branch.referral.y> r2 = r3.f41573c     // Catch:{ UnsupportedOperationException -> 0x0010 }
            boolean r1 = r2.remove(r4)     // Catch:{ UnsupportedOperationException -> 0x0010 }
            r3.m61110i()     // Catch:{ UnsupportedOperationException -> 0x0010 }
            goto L_0x0010
        L_0x000e:
            r4 = move-exception
            goto L_0x0012
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            return r1
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.mo44657b(io.branch.referral.y):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44653a(p212io.branch.referral.C14205y r3, int r4) {
        /*
            r2 = this;
            java.lang.Object r0 = f41570g
            monitor-enter(r0)
            java.util.List<io.branch.referral.y> r1 = r2.f41573c     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            int r1 = r1.size()     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            if (r1 >= r4) goto L_0x0011
            java.util.List<io.branch.referral.y> r4 = r2.f41573c     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            int r4 = r4.size()     // Catch:{ IndexOutOfBoundsException -> 0x001c }
        L_0x0011:
            java.util.List<io.branch.referral.y> r1 = r2.f41573c     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            r1.add(r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            r2.m61110i()     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            goto L_0x001c
        L_0x001a:
            r3 = move-exception
            goto L_0x001e
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.mo44653a(io.branch.referral.y, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo44656b() {
        synchronized (f41570g) {
            for (C14205y yVar : this.f41573c) {
                if (yVar != null && yVar.mo45024h().equals(C14171c.RegisterClose.mo44768d())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44649a() {
        /*
            r2 = this;
            java.lang.Object r0 = f41570g
            monitor-enter(r0)
            java.util.List<io.branch.referral.y> r1 = r2.f41573c     // Catch:{ UnsupportedOperationException -> 0x000e }
            r1.clear()     // Catch:{ UnsupportedOperationException -> 0x000e }
            r2.m61110i()     // Catch:{ UnsupportedOperationException -> 0x000e }
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            goto L_0x0010
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14131h0.mo44649a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44654a(C14205y yVar, int i, C6017h hVar) {
        synchronized (f41570g) {
            Iterator it = this.f41573c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14205y yVar2 = (C14205y) it.next();
                if (yVar2 == null || (!(yVar2 instanceof C14145l0) && !(yVar2 instanceof C14147m0))) {
                }
            }
            it.remove();
        }
        mo44653a(yVar, i == 0 ? 0 : 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44650a(C6017h hVar) {
        synchronized (f41570g) {
            for (C14205y yVar : this.f41573c) {
                if (yVar != null) {
                    if (yVar instanceof C14145l0) {
                        ((C14145l0) yVar).mo44705a(hVar);
                    } else if (yVar instanceof C14147m0) {
                        ((C14147m0) yVar).mo44706a(hVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44651a(C14207b bVar) {
        synchronized (f41570g) {
            for (C14205y yVar : this.f41573c) {
                if (yVar != null) {
                    yVar.mo45019b(bVar);
                }
            }
        }
    }
}

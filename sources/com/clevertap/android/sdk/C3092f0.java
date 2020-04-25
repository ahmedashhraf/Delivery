package com.clevertap.android.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.clevertap.android.sdk.f0 */
/* compiled from: CTInboxController */
class C3092f0 {

    /* renamed from: f */
    private static ExecutorService f11091f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static long f11092g;

    /* renamed from: a */
    private ArrayList<C3129l0> f11093a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f11094b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3211r0 f11095c;

    /* renamed from: d */
    private boolean f11096d;

    /* renamed from: e */
    private final Object f11097e = new Object();

    /* renamed from: com.clevertap.android.sdk.f0$a */
    /* compiled from: CTInboxController */
    static class C3093a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11098a;

        /* renamed from: b */
        final /* synthetic */ Runnable f11099b;

        C3093a(String str, Runnable runnable) {
            this.f11098a = str;
            this.f11099b = runnable;
        }

        public void run() {
            C3092f0.f11092g = Thread.currentThread().getId();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("CTInboxController Executor Service: Starting task - ");
                sb.append(this.f11098a);
                C3111h1.m14938f(sb.toString());
                this.f11099b.run();
            } catch (Throwable th) {
                C3111h1.m14941f("CTInboxController Executor Service: Failed to complete the scheduled task", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.f0$b */
    /* compiled from: CTInboxController */
    class C3094b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11100a;

        C3094b(String str) {
            this.f11100a = str;
        }

        public void run() {
            C3092f0.this.f11095c.mo12567a(this.f11100a, C3092f0.this.f11094b);
        }
    }

    /* renamed from: com.clevertap.android.sdk.f0$c */
    /* compiled from: CTInboxController */
    class C3095c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11102a;

        C3095c(String str) {
            this.f11102a = str;
        }

        public void run() {
            C3092f0.this.f11095c.mo12570b(this.f11102a, C3092f0.this.f11094b);
        }
    }

    C3092f0(String str, C3211r0 r0Var, boolean z) {
        this.f11094b = str;
        this.f11095c = r0Var;
        this.f11093a = this.f11095c.mo12573c(this.f11094b);
        this.f11096d = z;
        if (f11091f == null) {
            f11091f = Executors.newFixedThreadPool(1);
        }
    }

    /* renamed from: d */
    private C3129l0 m14833d(String str) {
        synchronized (this.f11097e) {
            Iterator it = this.f11093a.iterator();
            while (it.hasNext()) {
                C3129l0 l0Var = (C3129l0) it.next();
                if (l0Var.mo12371e().equals(str)) {
                    return l0Var;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inbox Message for message id - ");
            sb.append(str);
            sb.append(" not found");
            C3111h1.m14938f(sb.toString());
            return null;
        }
    }

    /* renamed from: e */
    private void m14834e() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f11097e) {
            Iterator it = this.f11093a.iterator();
            while (it.hasNext()) {
                C3129l0 l0Var = (C3129l0) it.next();
                if (this.f11096d || !l0Var.mo12362a()) {
                    long d = l0Var.mo12369d();
                    if (d > 0 && System.currentTimeMillis() / 1000 > d) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Inbox Message: ");
                        sb.append(l0Var.mo12371e());
                        sb.append(" is expired - removing");
                        C3111h1.m14938f(sb.toString());
                        arrayList.add(l0Var);
                    }
                } else {
                    C3111h1.m14930d("Removing inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    arrayList.add(l0Var);
                }
            }
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    mo12252a(((C3129l0) it2.next()).mo12371e());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo12257c(String str) {
        C3129l0 d = m14833d(str);
        if (d == null) {
            return false;
        }
        synchronized (this.f11097e) {
            d.mo12358a(1);
        }
        m14831a("RunMarkMessageRead", new C3095c(str));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3129l0 mo12254b(String str) {
        return m14833d(str);
    }

    /* renamed from: a */
    private static void m14831a(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == f11092g) {
                runnable.run();
            } else {
                f11091f.submit(new C3093a(str, runnable));
            }
        } catch (Throwable th) {
            C3111h1.m14941f("Failed to submit task to the executor service", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ArrayList<C3129l0> mo12255b() {
        ArrayList<C3129l0> arrayList;
        synchronized (this.f11097e) {
            m14834e();
            arrayList = this.f11093a;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12253a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                C3129l0 a = C3129l0.m15025a(jSONArray.getJSONObject(i), this.f11094b);
                if (a != null) {
                    if (this.f11096d || !a.mo12362a()) {
                        arrayList.add(a);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Inbox Message for message id - ");
                        sb.append(a.mo12371e());
                        sb.append(" added");
                        C3111h1.m14938f(sb.toString());
                    } else {
                        C3111h1.m14930d("Dropping inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    }
                }
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to update notification inbox messages - ");
                sb2.append(e.getLocalizedMessage());
                C3111h1.m14930d(sb2.toString());
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        this.f11095c.mo12564a(arrayList);
        C3111h1.m14938f("New Notification Inbox messages added");
        synchronized (this.f11097e) {
            this.f11093a = this.f11095c.mo12573c(this.f11094b);
            m14834e();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ArrayList<C3129l0> mo12256c() {
        ArrayList<C3129l0> arrayList = new ArrayList<>();
        synchronized (this.f11097e) {
            Iterator it = mo12255b().iterator();
            while (it.hasNext()) {
                C3129l0 l0Var = (C3129l0) it.next();
                if (l0Var.mo12376j() == 0) {
                    arrayList.add(l0Var);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo12258d() {
        return mo12256c().size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12252a(String str) {
        C3129l0 d = m14833d(str);
        if (d == null) {
            return false;
        }
        synchronized (this.f11097e) {
            this.f11093a.remove(d);
        }
        m14831a("RunDeleteMessage", new C3094b(str));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo12251a() {
        return mo12255b().size();
    }
}

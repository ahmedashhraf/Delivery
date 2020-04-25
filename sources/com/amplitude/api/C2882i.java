package com.amplitude.api;

import android.util.Log;
import com.mrsool.utils.webservice.C11687c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p468g.C13813c0.C13814a;
import p468g.C13863s.C13864a;
import p468g.C13876z;

/* renamed from: com.amplitude.api.i */
/* compiled from: Diagnostics */
public class C2882i {

    /* renamed from: j */
    public static final String f10189j = "https://api.amplitude.com/diagnostic";

    /* renamed from: k */
    public static final int f10190k = 1;

    /* renamed from: l */
    public static final int f10191l = 50;

    /* renamed from: m */
    public static final int f10192m = 5;

    /* renamed from: n */
    protected static C2882i f10193n;

    /* renamed from: a */
    volatile boolean f10194a = false;

    /* renamed from: b */
    private volatile String f10195b;

    /* renamed from: c */
    private volatile C13876z f10196c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile String f10197d;

    /* renamed from: e */
    int f10198e = 50;

    /* renamed from: f */
    String f10199f = f10189j;

    /* renamed from: g */
    C2893o f10200g = new C2893o("diagnosticThread");

    /* renamed from: h */
    List<String> f10201h = new ArrayList(this.f10198e);

    /* renamed from: i */
    Map<String, JSONObject> f10202i = new HashMap(this.f10198e);

    /* renamed from: com.amplitude.api.i$a */
    /* compiled from: Diagnostics */
    class C2883a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2882i f10204a;

        /* renamed from: b */
        final /* synthetic */ int f10205b;

        C2883a(C2882i iVar, int i) {
            this.f10204a = iVar;
            this.f10205b = i;
        }

        public void run() {
            this.f10204a.f10198e = Math.max(this.f10205b, 5);
            C2882i iVar = this.f10204a;
            iVar.f10198e = Math.min(iVar.f10198e, 50);
            C2882i iVar2 = this.f10204a;
            if (iVar2.f10198e < iVar2.f10201h.size()) {
                for (int i = 0; i < C2882i.this.f10201h.size() - this.f10204a.f10198e; i++) {
                    C2882i.this.f10202i.remove((String) C2882i.this.f10201h.remove(0));
                }
            }
        }
    }

    /* renamed from: com.amplitude.api.i$b */
    /* compiled from: Diagnostics */
    class C2884b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10207a;

        /* renamed from: b */
        final /* synthetic */ Throwable f10208b;

        C2884b(String str, Throwable th) {
            this.f10207a = str;
            this.f10208b = th;
        }

        public void run() {
            JSONObject jSONObject = (JSONObject) C2882i.this.f10202i.get(this.f10207a);
            String str = "count";
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("error", C2857c.m13471j(this.f10207a));
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    jSONObject2.put("device_id", C2882i.this.f10197d);
                    jSONObject2.put(str, 1);
                    if (this.f10208b != null) {
                        String stackTraceString = Log.getStackTraceString(this.f10208b);
                        if (!C2892n.m13815a(stackTraceString)) {
                            jSONObject2.put("stack_trace", C2857c.m13471j(stackTraceString));
                        }
                    }
                    if (C2882i.this.f10201h.size() >= C2882i.this.f10198e) {
                        for (int i = 0; i < 5; i++) {
                            C2882i.this.f10202i.remove((String) C2882i.this.f10201h.remove(0));
                        }
                    }
                    C2882i.this.f10202i.put(this.f10207a, jSONObject2);
                    C2882i.this.f10201h.add(this.f10207a);
                } catch (JSONException unused) {
                }
            } else {
                jSONObject.put(str, jSONObject.optInt(str, 0) + 1);
            }
        }
    }

    /* renamed from: com.amplitude.api.i$c */
    /* compiled from: Diagnostics */
    class C2885c implements Runnable {
        C2885c() {
        }

        public void run() {
            if (!C2882i.this.f10201h.isEmpty()) {
                ArrayList arrayList = new ArrayList(C2882i.this.f10201h.size());
                for (String str : C2882i.this.f10201h) {
                    arrayList.add(C2882i.this.f10202i.get(str));
                }
                String jSONArray = new JSONArray(arrayList).toString();
                if (!C2892n.m13815a(jSONArray)) {
                    C2882i.this.mo11356b(jSONArray);
                }
            }
        }
    }

    private C2882i() {
        this.f10200g.start();
    }

    /* renamed from: c */
    static synchronized C2882i m13675c() {
        C2882i iVar;
        synchronized (C2882i.class) {
            if (f10193n == null) {
                f10193n = new C2882i();
            }
            iVar = f10193n;
        }
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2882i mo11355b() {
        if (this.f10194a && !C2892n.m13815a(this.f10195b) && this.f10196c != null && !C2892n.m13815a(this.f10197d)) {
            mo11354a((Runnable) new C2885c());
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2882i mo11351a(C13876z zVar, String str, String str2) {
        this.f10194a = true;
        this.f10195b = str;
        this.f10196c = zVar;
        this.f10197d = str2;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11356b(String str) {
        C13864a a = new C13864a().mo43599a(C11687c.f33838t0, "1").mo43599a("client", this.f10195b).mo43599a("e", str);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(System.currentTimeMillis());
        try {
            if (this.f10196c.mo43405a(new C13814a().mo43374b(this.f10199f).mo43377c(a.mo43599a("upload_time", sb.toString()).mo43600a()).mo43371a()).execute().mo43416a().string().equals("success")) {
                this.f10202i.clear();
                this.f10201h.clear();
            }
        } catch (IOException | AssertionError | Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2882i mo11349a() {
        this.f10194a = false;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2882i mo11350a(int i) {
        mo11354a((Runnable) new C2883a(this, i));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2882i mo11352a(String str) {
        return mo11353a(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2882i mo11353a(String str, Throwable th) {
        if (this.f10194a && !C2892n.m13815a(str) && !C2892n.m13815a(this.f10197d)) {
            mo11354a((Runnable) new C2884b(str, th));
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11354a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C2893o oVar = this.f10200g;
        if (currentThread != oVar) {
            oVar.mo11478a(runnable);
        } else {
            runnable.run();
        }
    }
}

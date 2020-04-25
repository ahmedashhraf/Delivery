package com.amplitude.api;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.amplitude.api.o */
/* compiled from: WorkerThread */
public class C2893o extends HandlerThread {

    /* renamed from: a */
    private Handler f10237a;

    public C2893o(String str) {
        super(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Handler mo11477a() {
        return this.f10237a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11480b(Runnable runnable) {
        m13818b();
        this.f10237a.removeCallbacks(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11478a(Runnable runnable) {
        m13818b();
        this.f10237a.post(runnable);
    }

    /* renamed from: b */
    private synchronized void m13818b() {
        if (this.f10237a == null) {
            this.f10237a = new Handler(getLooper());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11479a(Runnable runnable, long j) {
        m13818b();
        this.f10237a.postDelayed(runnable, j);
    }
}

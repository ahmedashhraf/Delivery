package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.gms.common.util.C4476d0;
import com.google.firebase.FirebaseApp;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.y */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8731y implements Runnable {

    /* renamed from: N */
    private final FirebaseInstanceId f22890N;

    /* renamed from: O */
    private final C8678a0 f22891O;

    /* renamed from: a */
    private final long f22892a;

    /* renamed from: b */
    private final WakeLock f22893b = ((PowerManager) mo32177a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    @C4476d0
    C8731y(FirebaseInstanceId firebaseInstanceId, C8705l lVar, C8678a0 a0Var, long j) {
        this.f22890N = firebaseInstanceId;
        this.f22891O = a0Var;
        this.f22892a = j;
        this.f22893b.setReferenceCounted(false);
    }

    @C4476d0
    /* renamed from: c */
    private final boolean m40932c() throws IOException {
        String str = "FirebaseInstanceId";
        C8725v g = this.f22890N.mo32076g();
        if (!this.f22890N.mo32066a(g)) {
            return true;
        }
        try {
            String h = this.f22890N.mo32077h();
            if (h == null) {
                return false;
            }
            boolean isLoggable = Log.isLoggable(str, 3);
            if ((g == null || (g != null && !h.equals(g.f22879a))) && FirebaseApp.f22597k.equals(this.f22890N.mo32075f().mo31954c())) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Invoking onNewToken for app: ";
                    String valueOf = String.valueOf(this.f22890N.mo32075f().mo31954c());
                    if (valueOf.length() != 0) {
                        str2.concat(valueOf);
                    } else {
                        new String(str2);
                    }
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", h);
                Context a = mo32177a();
                Intent intent2 = new Intent(a, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                if (!"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    if (e.getMessage() == null) {
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                        sb.append("Token retrieval failed: ");
                        sb.append(message);
                        sb.append(". Will retry token retrieval");
                        sb.toString();
                        return false;
                    }
                    throw e;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo32177a() {
        return this.f22890N.mo32075f().mo31950b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32178b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo32177a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C8721t.m40887b().mo32155a(mo32177a())) {
            this.f22893b.acquire();
        }
        try {
            this.f22890N.mo32065a(true);
            if (!this.f22890N.mo32079j()) {
                this.f22890N.mo32065a(false);
                if (C8721t.m40887b().mo32155a(mo32177a())) {
                    this.f22893b.release();
                }
            } else if (!C8721t.m40887b().mo32156b(mo32177a()) || mo32178b()) {
                if (!m40932c() || !this.f22891O.mo32092a(this.f22890N)) {
                    this.f22890N.mo32063a(this.f22892a);
                } else {
                    this.f22890N.mo32065a(false);
                }
                if (C8721t.m40887b().mo32155a(mo32177a())) {
                    this.f22893b.release();
                }
            } else {
                new C8729x(this).mo32171a();
                if (C8721t.m40887b().mo32155a(mo32177a())) {
                    this.f22893b.release();
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            sb.toString();
            this.f22890N.mo32065a(false);
            if (C8721t.m40887b().mo32155a(mo32177a())) {
                this.f22893b.release();
            }
        } catch (Throwable th) {
            if (C8721t.m40887b().mo32155a(mo32177a())) {
                this.f22893b.release();
            }
            throw th;
        }
    }
}

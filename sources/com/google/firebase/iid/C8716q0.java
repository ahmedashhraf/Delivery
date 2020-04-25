package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.C0224v0;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.internal.C4411x;
import com.google.android.gms.tasks.C5543c;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p192p.C8764g;
import java.io.IOException;
import java.util.concurrent.Executor;
import p205i.p489f.C14069f;

/* renamed from: com.google.firebase.iid.q0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8716q0 {

    /* renamed from: a */
    private final FirebaseApp f22855a;

    /* renamed from: b */
    private final C8705l f22856b;

    /* renamed from: c */
    private final C8717r f22857c;

    /* renamed from: d */
    private final Executor f22858d;

    /* renamed from: e */
    private final C8764g f22859e;

    C8716q0(FirebaseApp firebaseApp, C8705l lVar, Executor executor, C8764g gVar) {
        this(firebaseApp, lVar, executor, new C8717r(firebaseApp.mo31950b(), lVar), gVar);
    }

    /* renamed from: a */
    public final C5560k<String> mo32146a(String str, String str2, String str3) {
        return m40869b(m40866a(str, str2, str3, new Bundle()));
    }

    /* renamed from: b */
    public final C5560k<Void> mo32148b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m40865a(m40869b(m40866a(str, str2, str3, bundle)));
    }

    /* renamed from: c */
    public final C5560k<Void> mo32149c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return m40865a(m40869b(m40866a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    /* renamed from: d */
    public final C5560k<Void> mo32150d(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m40865a(m40869b(m40866a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    @C0224v0
    private C8716q0(FirebaseApp firebaseApp, C8705l lVar, Executor executor, C8717r rVar, C8764g gVar) {
        this.f22855a = firebaseApp;
        this.f22856b = lVar;
        this.f22857c = rVar;
        this.f22858d = executor;
        this.f22859e = gVar;
    }

    /* renamed from: a */
    public final C5560k<Void> mo32145a(String str) {
        Bundle bundle = new Bundle();
        String str2 = "delete";
        bundle.putString("iid-operation", str2);
        bundle.putString(str2, "1");
        String str3 = C14069f.f41343G;
        return m40865a(m40869b(m40866a(str, str3, str3, bundle)));
    }

    /* renamed from: b */
    private final C5560k<String> m40869b(C5560k<Bundle> kVar) {
        return kVar.mo21996a(this.f22858d, (C5543c<TResult, TContinuationResult>) new C8724u0<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    private final C5560k<Bundle> m40866a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f22855a.mo31955d().mo32038b());
        bundle.putString("gmsv", Integer.toString(this.f22856b.mo32140d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f22856b.mo32138b());
        bundle.putString("app_ver_name", this.f22856b.mo32139c());
        String a = C4411x.m19049a().mo18400a("firebase-iid");
        if ("UNKNOWN".equals(a)) {
            int i = C4282f.f13284a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            a = sb.toString();
        }
        String str4 = "fiid-";
        String valueOf = String.valueOf(a);
        bundle.putString("cliv", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("Firebase-Client", this.f22859e.mo32277a());
        C5562l lVar = new C5562l();
        this.f22858d.execute(new C8720s0(this, bundle, lVar));
        return lVar.mo22017a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m40867a(Bundle bundle) throws IOException {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                sb.toString();
                new Throwable();
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }

    /* renamed from: a */
    private final <T> C5560k<Void> m40865a(C5560k<T> kVar) {
        return kVar.mo21996a(C8686d.m40830a(), (C5543c<TResult, TContinuationResult>) new C8718r0<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32147a(Bundle bundle, C5562l lVar) {
        try {
            lVar.mo22019a(this.f22857c.mo32151a(bundle));
        } catch (IOException e) {
            lVar.mo22018a((Exception) e);
        }
    }
}

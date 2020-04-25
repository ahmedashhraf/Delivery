package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.media.j */
/* compiled from: MediaSessionManager */
public final class C1577j {

    /* renamed from: b */
    static final String f6042b = "MediaSessionManager";

    /* renamed from: c */
    static final boolean f6043c = Log.isLoggable(f6042b, 3);

    /* renamed from: d */
    private static final Object f6044d = new Object();

    /* renamed from: e */
    private static volatile C1577j f6045e;

    /* renamed from: a */
    C1578a f6046a;

    /* renamed from: androidx.media.j$a */
    /* compiled from: MediaSessionManager */
    interface C1578a {
        /* renamed from: a */
        boolean mo6792a(C1580c cVar);

        /* renamed from: c */
        Context mo6793c();
    }

    /* renamed from: androidx.media.j$b */
    /* compiled from: MediaSessionManager */
    public static final class C1579b {

        /* renamed from: b */
        public static final String f6047b = "android.media.session.MediaController";

        /* renamed from: a */
        C1580c f6048a;

        public C1579b(@C0193h0 String str, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f6048a = new C1583a(str, i, i2);
            } else {
                this.f6048a = new C1585a(str, i, i2);
            }
        }

        @C0193h0
        /* renamed from: a */
        public String mo6794a() {
            return this.f6048a.mo6801n();
        }

        /* renamed from: b */
        public int mo6795b() {
            return this.f6048a.mo6800b();
        }

        /* renamed from: c */
        public int mo6796c() {
            return this.f6048a.mo6799a();
        }

        public boolean equals(@C0195i0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1579b)) {
                return false;
            }
            return this.f6048a.equals(((C1579b) obj).f6048a);
        }

        public int hashCode() {
            return this.f6048a.hashCode();
        }

        @RequiresApi(28)
        @C0207n0({C0208a.LIBRARY_GROUP})
        public C1579b(RemoteUserInfo remoteUserInfo) {
            this.f6048a = new C1583a(remoteUserInfo);
        }
    }

    /* renamed from: androidx.media.j$c */
    /* compiled from: MediaSessionManager */
    interface C1580c {
        /* renamed from: a */
        int mo6799a();

        /* renamed from: b */
        int mo6800b();

        /* renamed from: n */
        String mo6801n();
    }

    private C1577j(Context context) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f6046a = new C1582l(context);
        } else if (i >= 21) {
            this.f6046a = new C1581k(context);
        } else {
            this.f6046a = new C1584m(context);
        }
    }

    @C0193h0
    /* renamed from: a */
    public static C1577j m8065a(@C0193h0 Context context) {
        C1577j jVar = f6045e;
        if (jVar == null) {
            synchronized (f6044d) {
                jVar = f6045e;
                if (jVar == null) {
                    f6045e = new C1577j(context.getApplicationContext());
                    jVar = f6045e;
                }
            }
        }
        return jVar;
    }

    /* renamed from: a */
    public boolean mo6791a(@C0193h0 C1579b bVar) {
        if (bVar != null) {
            return this.f6046a.mo6792a(bVar.f6048a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Context mo6790a() {
        return this.f6046a.mo6793c();
    }
}

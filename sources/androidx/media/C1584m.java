package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.core.p033k.C0937e;

/* renamed from: androidx.media.m */
/* compiled from: MediaSessionManagerImplBase */
class C1584m implements C1578a {

    /* renamed from: c */
    private static final String f6051c = "MediaSessionManager";

    /* renamed from: d */
    private static final boolean f6052d = C1577j.f6043c;

    /* renamed from: e */
    private static final String f6053e = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: f */
    private static final String f6054f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: g */
    private static final String f6055g = "enabled_notification_listeners";

    /* renamed from: a */
    Context f6056a;

    /* renamed from: b */
    ContentResolver f6057b = this.f6056a.getContentResolver();

    /* renamed from: androidx.media.m$a */
    /* compiled from: MediaSessionManagerImplBase */
    static class C1585a implements C1580c {

        /* renamed from: a */
        private String f6058a;

        /* renamed from: b */
        private int f6059b;

        /* renamed from: c */
        private int f6060c;

        C1585a(String str, int i, int i2) {
            this.f6058a = str;
            this.f6059b = i;
            this.f6060c = i2;
        }

        /* renamed from: a */
        public int mo6799a() {
            return this.f6060c;
        }

        /* renamed from: b */
        public int mo6800b() {
            return this.f6059b;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1585a)) {
                return false;
            }
            C1585a aVar = (C1585a) obj;
            if (!(TextUtils.equals(this.f6058a, aVar.f6058a) && this.f6059b == aVar.f6059b && this.f6060c == aVar.f6060c)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return C0937e.m5327a(this.f6058a, Integer.valueOf(this.f6059b), Integer.valueOf(this.f6060c));
        }

        /* renamed from: n */
        public String mo6801n() {
            return this.f6058a;
        }
    }

    C1584m(Context context) {
        this.f6056a = context;
    }

    /* renamed from: a */
    public boolean mo6792a(@C0193h0 C1580c cVar) {
        boolean z = false;
        try {
            if (this.f6056a.getPackageManager().getApplicationInfo(cVar.mo6801n(), 0).uid != cVar.mo6799a()) {
                if (f6052d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Package name ");
                    sb.append(cVar.mo6801n());
                    sb.append(" doesn't match with the uid ");
                    sb.append(cVar.mo6799a());
                    sb.toString();
                }
                return false;
            }
            if (m8082a(cVar, f6053e) || m8082a(cVar, f6054f) || cVar.mo6799a() == 1000 || mo6804b(cVar)) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException unused) {
            if (f6052d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Package ");
                sb2.append(cVar.mo6801n());
                sb2.append(" doesn't exist");
                sb2.toString();
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6804b(@C0193h0 C1580c cVar) {
        String string = Secure.getString(this.f6057b, f6055g);
        if (string != null) {
            String[] split = string.split(":");
            for (String unflattenFromString : split) {
                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                if (unflattenFromString2 != null && unflattenFromString2.getPackageName().equals(cVar.mo6801n())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public Context mo6793c() {
        return this.f6056a;
    }

    /* renamed from: a */
    private boolean m8082a(C1580c cVar, String str) {
        boolean z = true;
        if (cVar.mo6800b() < 0) {
            if (this.f6056a.getPackageManager().checkPermission(str, cVar.mo6801n()) != 0) {
                z = false;
            }
            return z;
        }
        if (this.f6056a.checkPermission(str, cVar.mo6800b(), cVar.mo6799a()) != 0) {
            z = false;
        }
        return z;
    }
}

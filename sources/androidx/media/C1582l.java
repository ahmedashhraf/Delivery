package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.media.session.MediaSessionManager.RemoteUserInfo;
import androidx.annotation.RequiresApi;
import androidx.core.p033k.C0937e;

@RequiresApi(28)
/* renamed from: androidx.media.l */
/* compiled from: MediaSessionManagerImplApi28 */
class C1582l extends C1581k {

    /* renamed from: h */
    MediaSessionManager f6049h;

    /* renamed from: androidx.media.l$a */
    /* compiled from: MediaSessionManagerImplApi28 */
    static final class C1583a implements C1580c {

        /* renamed from: a */
        final RemoteUserInfo f6050a;

        C1583a(String str, int i, int i2) {
            this.f6050a = new RemoteUserInfo(str, i, i2);
        }

        /* renamed from: a */
        public int mo6799a() {
            return this.f6050a.getUid();
        }

        /* renamed from: b */
        public int mo6800b() {
            return this.f6050a.getPid();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1583a)) {
                return false;
            }
            return this.f6050a.equals(((C1583a) obj).f6050a);
        }

        public int hashCode() {
            return C0937e.m5327a(this.f6050a);
        }

        /* renamed from: n */
        public String mo6801n() {
            return this.f6050a.getPackageName();
        }

        C1583a(RemoteUserInfo remoteUserInfo) {
            this.f6050a = remoteUserInfo;
        }
    }

    C1582l(Context context) {
        super(context);
        this.f6049h = (MediaSessionManager) context.getSystemService("media_session");
    }

    /* renamed from: a */
    public boolean mo6792a(C1580c cVar) {
        if (cVar instanceof C1583a) {
            return this.f6049h.isTrustedForMediaControl(((C1583a) cVar).f6050a);
        }
        return false;
    }
}

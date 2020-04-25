package androidx.media;

import android.content.Context;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.media.k */
/* compiled from: MediaSessionManagerImplApi21 */
class C1581k extends C1584m {
    C1581k(Context context) {
        super(context);
        this.f6056a = context;
    }

    /* renamed from: c */
    private boolean m8076c(@C0193h0 C1580c cVar) {
        return mo6793c().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.mo6800b(), cVar.mo6799a()) == 0;
    }

    /* renamed from: a */
    public boolean mo6792a(@C0193h0 C1580c cVar) {
        return m8076c(cVar) || super.mo6792a(cVar);
    }
}

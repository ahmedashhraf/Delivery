package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager.C4288a;
import com.google.android.gms.common.internal.C4311d;
import com.google.android.gms.common.internal.C4413y;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.d */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4296d extends C4295c {

    /* renamed from: h */
    private WeakReference<C4288a> f13333h;

    public C4296d(C4288a aVar, Uri uri) {
        super(uri, 0);
        C4311d.m18636a((Object) aVar);
        this.f13333h = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18161a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            C4288a aVar = (C4288a) this.f13333h.get();
            if (aVar != null) {
                aVar.mo18139a(this.f13326a.f13325a, drawable, z3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4296d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C4296d dVar = (C4296d) obj;
        C4288a aVar = (C4288a) this.f13333h.get();
        C4288a aVar2 = (C4288a) dVar.f13333h.get();
        return aVar2 != null && aVar != null && C4413y.m19053a(aVar2, aVar) && C4413y.m19053a(dVar.f13326a, this.f13326a);
    }

    public final int hashCode() {
        return C4413y.m19051a(this.f13326a);
    }
}

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C4413y;

/* renamed from: com.google.android.gms.common.images.b */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4294b {

    /* renamed from: a */
    public final Uri f13325a;

    public C4294b(Uri uri) {
        this.f13325a = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4294b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C4413y.m19053a(((C4294b) obj).f13325a, this.f13325a);
    }

    public final int hashCode() {
        return C4413y.m19051a(this.f13325a);
    }
}

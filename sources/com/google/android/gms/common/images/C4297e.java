package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.google.android.gms.common.internal.C4311d;
import com.google.android.gms.common.internal.C4413y;
import java.lang.ref.WeakReference;
import p076c.p112d.p113a.p114a.p118d.p121c.C2599e;
import p076c.p112d.p113a.p114a.p118d.p121c.C2605k;

/* renamed from: com.google.android.gms.common.images.e */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4297e extends C4295c {

    /* renamed from: h */
    private WeakReference<ImageView> f13334h;

    public C4297e(ImageView imageView, Uri uri) {
        super(uri, 0);
        C4311d.m18636a((Object) imageView);
        this.f13334h = new WeakReference<>(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18161a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.f13334h.get();
        if (imageView != null) {
            int i = 0;
            boolean z4 = !z2 && !z3;
            if (z4 && (imageView instanceof C2605k)) {
                int a = C2605k.m12710a();
                int i2 = this.f13328c;
                if (i2 != 0 && a == i2) {
                    return;
                }
            }
            boolean a2 = mo18162a(z, z2);
            Uri uri = null;
            if (a2) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof C2599e) {
                    drawable2 = ((C2599e) drawable2).mo10098a();
                }
                drawable = new C2599e(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof C2605k) {
                if (z3) {
                    uri = this.f13326a.f13325a;
                }
                C2605k.m12712a(uri);
                if (z4) {
                    i = this.f13328c;
                }
                C2605k.m12711a(i);
            }
            if (a2) {
                ((C2599e) drawable).mo10099a(C1750f.f6813c);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4297e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = (ImageView) this.f13334h.get();
        ImageView imageView2 = (ImageView) ((C4297e) obj).f13334h.get();
        return (imageView2 == null || imageView == null || !C4413y.m19053a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    public C4297e(ImageView imageView, int i) {
        super(null, i);
        C4311d.m18636a((Object) imageView);
        this.f13334h = new WeakReference<>(imageView);
    }
}

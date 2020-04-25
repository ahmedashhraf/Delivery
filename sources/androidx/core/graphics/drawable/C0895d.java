package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p018c.C0820a;
import androidx.core.p034l.C0984g;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.drawable.d */
/* compiled from: RoundedBitmapDrawableFactory */
public final class C0895d {

    /* renamed from: a */
    private static final String f4112a = "RoundedBitmapDrawableFa";

    /* renamed from: androidx.core.graphics.drawable.d$a */
    /* compiled from: RoundedBitmapDrawableFactory */
    private static class C0896a extends C0894c {
        C0896a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4589a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C0984g.m5638a(i, i2, i3, rect, rect2, 0);
        }

        /* renamed from: c */
        public void mo4590c(boolean z) {
            Bitmap bitmap = this.f4099a;
            if (bitmap != null) {
                C0820a.m4782a(bitmap, z);
                invalidateSelf();
            }
        }

        /* renamed from: f */
        public boolean mo4591f() {
            Bitmap bitmap = this.f4099a;
            return bitmap != null && C0820a.m4783b(bitmap);
        }
    }

    private C0895d() {
    }

    @C0193h0
    /* renamed from: a */
    public static C0894c m5185a(@C0193h0 Resources resources, @C0195i0 Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new C0893b(resources, bitmap);
        }
        return new C0896a(resources, bitmap);
    }

    @C0193h0
    /* renamed from: a */
    public static C0894c m5187a(@C0193h0 Resources resources, @C0193h0 String str) {
        C0894c a = m5185a(resources, BitmapFactory.decodeFile(str));
        if (a.mo4593a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("RoundedBitmapDrawable cannot decode ");
            sb.append(str);
            sb.toString();
        }
        return a;
    }

    @C0193h0
    /* renamed from: a */
    public static C0894c m5186a(@C0193h0 Resources resources, @C0193h0 InputStream inputStream) {
        C0894c a = m5185a(resources, BitmapFactory.decodeStream(inputStream));
        if (a.mo4593a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("RoundedBitmapDrawable cannot decode ");
            sb.append(inputStream);
            sb.toString();
        }
        return a;
    }
}

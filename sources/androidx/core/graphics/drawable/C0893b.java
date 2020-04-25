package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.core.graphics.drawable.b */
/* compiled from: RoundedBitmapDrawable21 */
class C0893b extends C0894c {
    protected C0893b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4589a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    /* renamed from: c */
    public void mo4590c(boolean z) {
        Bitmap bitmap = this.f4099a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public boolean mo4591f() {
        Bitmap bitmap = this.f4099a;
        return bitmap != null && bitmap.hasMipMap();
    }

    public void getOutline(Outline outline) {
        mo4612h();
        outline.setRoundRect(this.f4106h, mo4599b());
    }
}

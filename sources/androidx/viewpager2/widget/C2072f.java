package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2.C2056j;
import androidx.viewpager2.widget.ViewPager2.C2062m;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.f */
/* compiled from: PageTransformerAdapter */
final class C2072f extends C2056j {

    /* renamed from: a */
    private final LinearLayoutManager f7913a;

    /* renamed from: b */
    private C2062m f7914b;

    C2072f(LinearLayoutManager linearLayoutManager) {
        this.f7913a = linearLayoutManager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2062m mo9033a() {
        return this.f7914b;
    }

    /* renamed from: a */
    public void mo8944a(int i) {
    }

    /* renamed from: b */
    public void mo8945b(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9034a(@C0195i0 C2062m mVar) {
        this.f7914b = mVar;
    }

    /* renamed from: a */
    public void mo9016a(int i, float f, int i2) {
        if (this.f7914b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f7913a.mo7467e()) {
                View d = this.f7913a.mo7462d(i3);
                if (d != null) {
                    this.f7914b.mo9019a(d, ((float) (this.f7913a.mo7496p(d) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f7913a.mo7467e())}));
                }
            }
        }
    }
}

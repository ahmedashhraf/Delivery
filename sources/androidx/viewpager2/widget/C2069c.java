package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.C0193h0;
import androidx.viewpager2.widget.ViewPager2.C2062m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.c */
/* compiled from: CompositePageTransformer */
public final class C2069c implements C2062m {

    /* renamed from: a */
    private final List<C2062m> f7903a = new ArrayList();

    /* renamed from: a */
    public void mo9027a(@C0193h0 C2062m mVar) {
        this.f7903a.add(mVar);
    }

    /* renamed from: b */
    public void mo9028b(@C0193h0 C2062m mVar) {
        this.f7903a.remove(mVar);
    }

    /* renamed from: a */
    public void mo9019a(@C0193h0 View view, float f) {
        for (C2062m a : this.f7903a) {
            a.mo9019a(view, f);
        }
    }
}

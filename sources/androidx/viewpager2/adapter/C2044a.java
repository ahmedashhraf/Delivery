package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.core.p034l.C0962e0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;

/* renamed from: androidx.viewpager2.adapter.a */
/* compiled from: FragmentViewHolder */
public final class C2044a extends C1635d0 {
    private C2044a(@C0193h0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @C0193h0
    /* renamed from: a */
    static C2044a m10671a(@C0193h0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.setId(C0962e0.m5482c());
        frameLayout.setSaveEnabled(false);
        return new C2044a(frameLayout);
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: D */
    public FrameLayout mo8948D() {
        return (FrameLayout) this.f6294a;
    }
}

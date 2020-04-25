package com.futuremind.recyclerviewfastscroll.p163e;

import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.futuremind.recyclerviewfastscroll.C3873R;
import com.futuremind.recyclerviewfastscroll.C3882d;
import com.futuremind.recyclerviewfastscroll.p163e.C3887e.C3890c;

/* renamed from: com.futuremind.recyclerviewfastscroll.e.b */
/* compiled from: DefaultScrollerViewProvider */
public class C3884b extends C3885c {

    /* renamed from: d */
    private View f12295d;

    /* renamed from: e */
    private View f12296e;

    /* renamed from: a */
    public View mo17163a(ViewGroup viewGroup) {
        this.f12295d = LayoutInflater.from(mo17171c()).inflate(C3873R.layout.fastscroll__default_bubble, viewGroup, false);
        return this.f12295d;
    }

    /* renamed from: b */
    public View mo17165b(ViewGroup viewGroup) {
        this.f12296e = new View(mo17171c());
        int dimensionPixelSize = mo17173e().mo17139a() ? 0 : mo17171c().getResources().getDimensionPixelSize(C3873R.dimen.fastscroll__handle_inset);
        int dimensionPixelSize2 = !mo17173e().mo17139a() ? 0 : mo17171c().getResources().getDimensionPixelSize(C3873R.dimen.fastscroll__handle_inset);
        InsetDrawable insetDrawable = new InsetDrawable(C0841b.m4928c(mo17171c(), C3873R.C3876drawable.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        C3882d.m16958a(this.f12296e, insetDrawable);
        this.f12296e.setLayoutParams(new LayoutParams(mo17171c().getResources().getDimensionPixelSize(mo17173e().mo17139a() ? C3873R.dimen.fastscroll__handle_clickable_width : C3873R.dimen.fastscroll__handle_height), mo17171c().getResources().getDimensionPixelSize(mo17173e().mo17139a() ? C3873R.dimen.fastscroll__handle_height : C3873R.dimen.fastscroll__handle_clickable_width)));
        return this.f12296e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C3886d mo17166j() {
        return new C3883a(new C3890c(this.f12295d).mo17183a(1.0f).mo17186b(1.0f).mo17185a());
    }

    /* renamed from: k */
    public TextView mo17167k() {
        return (TextView) this.f12295d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C3886d mo17168l() {
        return null;
    }

    /* renamed from: b */
    public int mo17164b() {
        int i;
        float f;
        if (mo17173e().mo17139a()) {
            f = ((float) this.f12296e.getHeight()) / 2.0f;
            i = this.f12295d.getHeight();
        } else {
            f = ((float) this.f12296e.getWidth()) / 2.0f;
            i = this.f12295d.getWidth();
        }
        return (int) (f - ((float) i));
    }
}

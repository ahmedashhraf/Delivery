package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.m */
public class C11871m extends C1638g<C11872a> {

    /* renamed from: c */
    private String[] f34289c;

    /* renamed from: d */
    private Context f34290d;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.m$a */
    public static class C11872a extends C1635d0 {

        /* renamed from: s0 */
        ImageView f34291s0;

        /* renamed from: t0 */
        ProgressBar f34292t0;

        public C11872a(View view) {
            super(view);
            this.f34291s0 = (ImageView) view.findViewById(C11771R.C11775id.grouped_cards_item_image);
            this.f34292t0 = (ProgressBar) view.findViewById(C11771R.C11775id.loading_panel);
        }
    }

    C11871m(Context context, String[] strArr) {
        this.f34289c = strArr;
        this.f34290d = context;
    }

    /* renamed from: a */
    public void mo7330b(C11872a aVar, int i) {
        aVar.f34292t0.setVisibility(0);
        Bitmap a = C11887q.m53456a(this.f34290d).mo40544a(this.f34289c[i]);
        if (a != null) {
            aVar.f34292t0.setVisibility(8);
            aVar.f34291s0.setImageBitmap(a);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f34289c.length;
    }

    /* renamed from: b */
    public C11872a m53366b(ViewGroup viewGroup, int i) {
        return new C11872a(LayoutInflater.from(this.f34290d).inflate(C11771R.layout.opp_item_card, viewGroup, false));
    }
}

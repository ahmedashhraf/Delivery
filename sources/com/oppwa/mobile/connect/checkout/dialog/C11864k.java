package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.k */
public class C11864k extends C1638g<C1635d0> {

    /* renamed from: c */
    private Context f34281c;

    /* renamed from: d */
    private String[] f34282d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11867c f34283e;

    /* renamed from: f */
    private C11871m f34284f;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.k$a */
    class C11865a implements OnClickListener {
        C11865a() {
        }

        public void onClick(View view) {
            if (C11864k.this.f34283e != null) {
                C11864k.this.f34283e.mo40423a("CARD");
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.k$b */
    class C11866b extends C1635d0 {

        /* renamed from: s0 */
        RecyclerView f34286s0;

        C11866b(View view) {
            super(view);
            this.f34286s0 = (RecyclerView) view.findViewById(C11771R.C11775id.grouped_cards_recycler_view);
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.k$c */
    interface C11867c {
        /* renamed from: a */
        void mo40423a(String str);
    }

    C11864k(Context context, String[] strArr) {
        this.f34281c = context;
        this.f34282d = strArr;
    }

    /* renamed from: a */
    private static int m53343a(Context context) {
        Resources resources = context.getResources();
        return resources.getDisplayMetrics().widthPixels / (((int) resources.getDimension(C11771R.dimen.card_brand_logo_width)) + (((int) resources.getDimension(C11771R.dimen.card_brand_logo_padding)) * 2));
    }

    /* renamed from: a */
    public void mo40503a(C11867c cVar) {
        this.f34283e = cVar;
    }

    /* renamed from: b */
    public int mo7325b() {
        return 1;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        return new C11866b(LayoutInflater.from(this.f34281c).inflate(C11771R.layout.opp_item_grouped_cards, viewGroup, false));
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        C11866b bVar = (C11866b) d0Var;
        Context context = this.f34281c;
        bVar.f34286s0.setLayoutManager(new GridLayoutManager(context, m53343a(context)));
        this.f34284f = new C11871m(this.f34281c, this.f34282d);
        bVar.f34286s0.setAdapter(this.f34284f);
        bVar.f34286s0.setLayoutFrozen(true);
        bVar.f6294a.setOnClickListener(new C11865a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C11871m mo40504f() {
        return this.f34284f;
    }
}

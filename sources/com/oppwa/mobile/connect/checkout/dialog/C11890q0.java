package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.q0 */
class C11890q0 extends C1638g<C11893c> {

    /* renamed from: c */
    private Context f34334c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String[] f34335d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11892b f34336e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f34337f = 0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q0$a */
    class C11891a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11893c f34338a;

        C11891a(C11893c cVar) {
            this.f34338a = cVar;
        }

        public void onClick(View view) {
            C11890q0.this.f34337f = this.f34338a.mo7273f();
            C11890q0.this.mo7341e();
            if (C11890q0.this.f34336e != null) {
                C11890q0.this.f34336e.mo40320a(C11890q0.this.f34335d[C11890q0.this.f34337f]);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q0$b */
    interface C11892b {
        /* renamed from: a */
        void mo40320a(String str);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q0$c */
    class C11893c extends C1635d0 {

        /* renamed from: s0 */
        ImageView f34340s0;

        /* renamed from: t0 */
        ProgressBar f34341t0;

        /* renamed from: u0 */
        RelativeLayout f34342u0;

        C11893c(View view) {
            super(view);
            this.f34340s0 = (ImageView) view.findViewById(C11771R.C11775id.card_brand_logo);
            this.f34341t0 = (ProgressBar) view.findViewById(C11771R.C11775id.loading_panel);
            this.f34342u0 = (RelativeLayout) view.findViewById(C11771R.C11775id.card_brand_border);
        }
    }

    C11890q0(Context context, String[] strArr) {
        this.f34334c = context;
        this.f34335d = strArr;
    }

    /* renamed from: a */
    public void mo40553a(C11892b bVar) {
        this.f34336e = bVar;
    }

    /* renamed from: a */
    public void mo7330b(C11893c cVar, int i) {
        RelativeLayout relativeLayout;
        boolean z = false;
        cVar.f34341t0.setVisibility(0);
        String str = this.f34335d[i];
        Bitmap a = C11887q.m53456a(this.f34334c).mo40544a(str);
        if (a != null) {
            cVar.f34340s0.setImageBitmap(a);
            cVar.f34341t0.setVisibility(8);
        }
        cVar.f6294a.setOnClickListener(new C11891a(cVar));
        if (i == this.f34337f) {
            relativeLayout = cVar.f34342u0;
            z = true;
        } else {
            relativeLayout = cVar.f34342u0;
        }
        relativeLayout.setSelected(z);
        cVar.f6294a.setTag(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40555a(String str) {
        String[] strArr = this.f34335d;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length && !strArr[i].equals(str)) {
            i2++;
            i++;
        }
        this.f34337f = i2;
    }

    /* renamed from: a */
    public void mo40556a(String[] strArr) {
        this.f34335d = strArr;
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f34335d.length;
    }

    /* renamed from: c */
    public C11893c mo7327b(ViewGroup viewGroup, int i) {
        return new C11893c(LayoutInflater.from(this.f34334c).inflate(C11771R.layout.opp_item_card_brands, viewGroup, false));
    }
}

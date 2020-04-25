package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.g1 */
class C11841g1 extends C1638g<C11844c> {

    /* renamed from: c */
    private Context f34225c;

    /* renamed from: d */
    private String[] f34226d;

    /* renamed from: e */
    private Bundle f34227e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11843b f34228f;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.g1$a */
    class C11842a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f34229a;

        C11842a(String str) {
            this.f34229a = str;
        }

        public void onClick(View view) {
            if (C11841g1.this.f34228f != null) {
                C11841g1.this.f34228f.mo40422a(this.f34229a);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.g1$b */
    interface C11843b {
        /* renamed from: a */
        void mo40422a(String str);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.g1$c */
    class C11844c extends C1635d0 {

        /* renamed from: s0 */
        ImageView f34231s0;

        /* renamed from: t0 */
        TextView f34232t0;

        /* renamed from: u0 */
        ProgressBar f34233u0;

        C11844c(View view) {
            super(view);
            this.f34231s0 = (ImageView) view.findViewById(C11771R.C11775id.payment_brand_image);
            this.f34232t0 = (TextView) view.findViewById(C11771R.C11775id.payment_brand_title);
            this.f34233u0 = (ProgressBar) view.findViewById(C11771R.C11775id.loading_panel);
        }
    }

    C11841g1(Context context, String[] strArr, Bundle bundle) {
        this.f34225c = context;
        this.f34226d = strArr;
        this.f34227e = bundle;
    }

    /* renamed from: a */
    private String m53269a(Context context, String str) {
        int b = C11906t0.m53535b(context, str);
        if (b != 0) {
            return context.getString(b);
        }
        String string = this.f34227e.getString(str);
        return (string == null || string.isEmpty()) ? C11868k0.m53356a(str) : string;
    }

    /* renamed from: a */
    public void mo40471a(C11843b bVar) {
        this.f34228f = bVar;
    }

    /* renamed from: a */
    public void mo7330b(C11844c cVar, int i) {
        cVar.f34233u0.setVisibility(0);
        String str = this.f34226d[i];
        Bitmap a = C11887q.m53456a(this.f34225c).mo40544a(str);
        if (a != null) {
            cVar.f34233u0.setVisibility(8);
            cVar.f34231s0.setImageBitmap(a);
        }
        cVar.f34232t0.setText(m53269a(this.f34225c, str));
        cVar.f6294a.setContentDescription(str);
        cVar.f6294a.setOnClickListener(new C11842a(str));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f34226d.length;
    }

    /* renamed from: c */
    public C11844c mo7327b(ViewGroup viewGroup, int i) {
        return new C11844c(LayoutInflater.from(this.f34225c).inflate(C11771R.layout.opp_item_payment_brand, viewGroup, false));
    }
}

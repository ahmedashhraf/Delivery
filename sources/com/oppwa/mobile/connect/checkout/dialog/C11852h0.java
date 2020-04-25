package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.Card;
import com.oppwa.mobile.connect.payment.token.Token;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.h0 */
class C11852h0 extends C1638g<C11856d> {

    /* renamed from: c */
    private Context f34253c;

    /* renamed from: d */
    private Token[] f34254d;

    /* renamed from: e */
    private int f34255e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11855c f34256f;

    /* renamed from: g */
    private boolean f34257g = false;

    /* renamed from: h */
    private int f34258h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f34259i = 0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h0$a */
    class C11853a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C11856d f34260a;

        C11853a(C11856d dVar) {
            this.f34260a = dVar;
        }

        public void onGlobalLayout() {
            this.f34260a.f6294a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C11852h0.this.m53299a(this.f34260a.f6294a);
            C11852h0.this.mo7341e();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h0$b */
    class C11854b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Token f34262a;

        C11854b(Token token) {
            this.f34262a = token;
        }

        public void onClick(View view) {
            if (C11852h0.this.f34256f != null) {
                C11852h0.this.f34256f.mo40421a(this.f34262a);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h0$c */
    interface C11855c {
        /* renamed from: a */
        void mo40421a(Token token);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h0$d */
    class C11856d extends C1635d0 {

        /* renamed from: s0 */
        ImageView f34264s0;

        /* renamed from: t0 */
        TextView f34265t0;

        /* renamed from: u0 */
        ProgressBar f34266u0;

        C11856d(View view) {
            super(view);
            this.f34264s0 = (ImageView) view.findViewById(C11771R.C11775id.payment_token_image);
            this.f34265t0 = (TextView) view.findViewById(C11771R.C11775id.payment_token_title);
            this.f34266u0 = (ProgressBar) view.findViewById(C11771R.C11775id.loading_panel);
            C11852h0.this.f34259i = this.f34265t0.getCurrentTextColor();
        }
    }

    C11852h0(Context context, Token[] tokenArr, int i) {
        this.f34253c = context;
        this.f34254d = tokenArr;
        this.f34255e = i;
    }

    /* renamed from: a */
    private String m53298a(Token token) {
        if ("DIRECTDEBIT_SEPA".equals(token.mo41012i())) {
            return C11868k0.m53360c(token.mo41007b().mo40985c());
        }
        Card c = token.mo41008c();
        StringBuilder sb = new StringBuilder();
        sb.append(C11868k0.m53359b(c.mo41000j()));
        sb.append(C3868i.f12248b);
        sb.append(C11868k0.m53355a(c));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53299a(View view) {
        double width = (double) (this.f34255e / view.getWidth());
        Double.isNaN(width);
        double d = width - 0.5d;
        double d2 = (double) this.f34255e;
        Double.isNaN(d2);
        double d3 = d2 / d;
        double width2 = (double) view.getWidth();
        Double.isNaN(width2);
        double d4 = d3 / width2;
        double width3 = (double) view.getWidth();
        Double.isNaN(width3);
        this.f34258h = (int) (width3 * d4);
    }

    /* renamed from: b */
    private boolean m53301b(Token token) {
        Card c = token.mo41008c();
        return c != null && CardPaymentParams.m53953c(c.mo40994b(), c.mo40995c());
    }

    /* renamed from: a */
    public void mo40490a(C11855c cVar) {
        this.f34256f = cVar;
    }

    /* renamed from: a */
    public void mo7330b(C11856d dVar, int i) {
        int i2;
        TextView textView;
        Token token = this.f34254d[i];
        String a = m53298a(token);
        Bitmap a2 = C11887q.m53456a(this.f34253c).mo40544a(token.mo41012i());
        if (a2 != null) {
            dVar.f34264s0.setImageBitmap(a2);
            dVar.f34266u0.setVisibility(8);
        }
        dVar.f34265t0.setText(a);
        dVar.f6294a.setContentDescription(a);
        if (m53301b(token)) {
            textView = dVar.f34265t0;
            i2 = this.f34253c.getResources().getColor(C11771R.C11773color.error_color);
        } else {
            textView = dVar.f34265t0;
            i2 = this.f34259i;
        }
        textView.setTextColor(i2);
        dVar.f6294a.setOnClickListener(new C11854b(token));
        if (this.f34258h != 0) {
            C1656p pVar = (C1656p) dVar.f6294a.getLayoutParams();
            pVar.width = this.f34258h;
            dVar.f6294a.setLayoutParams(pVar);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f34254d.length;
    }

    /* renamed from: c */
    public C11856d mo7327b(ViewGroup viewGroup, int i) {
        C11856d dVar = new C11856d(LayoutInflater.from(this.f34253c).inflate(C11771R.layout.opp_item_payment_token, viewGroup, false));
        if (!this.f34257g) {
            ViewTreeObserver viewTreeObserver = dVar.f6294a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f34257g = true;
                viewTreeObserver.addOnGlobalLayoutListener(new C11853a(dVar));
            }
        }
        return dVar;
    }
}

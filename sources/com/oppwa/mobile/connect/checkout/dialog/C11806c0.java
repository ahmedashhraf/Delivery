package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.dialog.C11887q.C11889b;
import com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.ArrayList;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.c0 */
public class C11806c0 extends C11799b implements C11889b {

    /* renamed from: P */
    private Token[] f34140P;

    /* renamed from: Q */
    private String[] f34141Q;

    /* renamed from: R */
    private String[] f34142R;

    /* renamed from: S */
    private String[] f34143S;

    /* renamed from: T */
    private CheckoutInfo f34144T;

    /* renamed from: U */
    private CheckoutSettings f34145U;

    /* renamed from: V */
    private BrandsValidation f34146V;

    /* renamed from: W */
    private C11841g1 f34147W;

    /* renamed from: X */
    private C11864k f34148X;

    /* renamed from: Y */
    private C11852h0 f34149Y;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.c0$a */
    class C11807a implements C11855c {
        C11807a() {
        }

        /* renamed from: a */
        public void mo40421a(Token token) {
            C11909u0 u0Var = C11806c0.this.f34130a;
            if (u0Var != null) {
                u0Var.mo40385a(token.mo41012i(), token);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.c0$b */
    class C11808b implements C11843b {
        C11808b() {
        }

        /* renamed from: a */
        public void mo40422a(String str) {
            C11909u0 u0Var = C11806c0.this.f34130a;
            if (u0Var != null) {
                u0Var.mo40385a(str, (Token) null);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.c0$c */
    class C11809c implements C11867c {
        C11809c() {
        }

        /* renamed from: a */
        public void mo40423a(String str) {
            C11909u0 u0Var = C11806c0.this.f34130a;
            if (u0Var != null) {
                u0Var.mo40385a(str, (Token) null);
            }
        }
    }

    /* renamed from: a */
    public static C11806c0 m53100a(C11921z zVar, CheckoutSettings checkoutSettings, CheckoutInfo checkoutInfo, BrandsValidation brandsValidation) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PAYMENT_METHODS", zVar);
        bundle.putParcelable(CheckoutActivity.f34061b0, checkoutSettings);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_INFO", checkoutInfo);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_BRANDS_VALIDATION", brandsValidation);
        C11806c0 c0Var = new C11806c0();
        c0Var.setArguments(bundle);
        return c0Var;
    }

    /* renamed from: a */
    private void m53101a(View view) {
        view.findViewById(C11771R.C11775id.total_amount_view).setVisibility(0);
        TextView textView = (TextView) view.findViewById(C11771R.C11775id.total_amount_header);
        TextView textView2 = (TextView) view.findViewById(C11771R.C11775id.total_amount_value);
        textView.setText(getString(C11771R.string.checkout_layout_text_total_amount));
        textView2.setText(C11868k0.m53354a(this.f34144T.mo40837a(), this.f34144T.mo40840c()));
    }

    /* renamed from: a */
    private void m53102a(View view, String[] strArr) {
        Token[] tokenArr = this.f34140P;
        boolean z = tokenArr != null && tokenArr.length > 0;
        boolean z2 = this.f34142R.length > 0 && m53107d();
        if (z || z2) {
            TextView textView = (TextView) view.findViewById(C11771R.C11775id.payment_brand_section_title);
            textView.setVisibility(0);
            textView.setText(textView.getText().toString().toUpperCase());
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C11771R.C11775id.payment_brands_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f34147W = new C11841g1(getContext(), strArr, this.f34146V.mo40796c());
        linearLayoutManager.mo7000l(1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f34147W);
        this.f34147W.mo40471a((C11843b) new C11808b());
    }

    /* renamed from: b */
    private void m53103b(View view) {
        Token[] tokenArr = this.f34140P;
        if (tokenArr != null && tokenArr.length > 0) {
            TextView textView = (TextView) view.findViewById(C11771R.C11775id.payment_tokens_section_title);
            textView.setVisibility(0);
            textView.setText(textView.getText().toString().toUpperCase());
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C11771R.C11775id.payment_tokens_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f34149Y = new C11852h0(getContext(), this.f34140P, C11868k0.m53351a((Activity) getActivity()));
        linearLayoutManager.mo7000l(0);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f34149Y);
        this.f34149Y.mo40490a((C11855c) new C11807a());
    }

    /* renamed from: c */
    private void m53104c() {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.f34141Q) {
            if (this.f34146V.mo40798d(str)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        this.f34142R = (String[]) arrayList.toArray(new String[arrayList.size()]);
        this.f34143S = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
    }

    /* renamed from: c */
    private void m53105c(View view) {
        m53102a(view, this.f34141Q);
    }

    /* renamed from: d */
    private void m53106d(View view) {
        m53102a(view, this.f34143S);
    }

    /* renamed from: d */
    private boolean m53107d() {
        return this.f34145U.mo40698c() == CheckoutCardBrandsDisplayMode.GROUPED;
    }

    /* renamed from: e */
    private void m53108e(View view) {
        if (this.f34142R.length > 0) {
            m53109f(view);
        }
        if (this.f34143S.length > 0) {
            m53106d(view);
        }
    }

    /* renamed from: f */
    private void m53109f(View view) {
        TextView textView = (TextView) view.findViewById(C11771R.C11775id.payment_cards_brand_section_title);
        textView.setVisibility(0);
        textView.setText(textView.getText().toString().toUpperCase());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C11771R.C11775id.payment_cards_brands_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f34148X = new C11864k(getContext(), this.f34142R);
        linearLayoutManager.mo7000l(1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f34148X);
        this.f34148X.mo40503a((C11867c) new C11809c());
    }

    /* renamed from: e */
    public void mo40406e(String str) {
        if (this.f34149Y != null) {
            int i = 0;
            for (Token i2 : this.f34140P) {
                if (i2.mo41012i().equals(str)) {
                    this.f34149Y.mo7337d(i);
                }
                i++;
            }
        }
        if (this.f34147W != null) {
            int i3 = 0;
            for (String equalsIgnoreCase : m53107d() ? this.f34143S : this.f34141Q) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    this.f34147W.mo7337d(i3);
                }
                i3++;
            }
        }
        if (this.f34148X != null) {
            int i4 = 0;
            for (String equals : this.f34142R) {
                if (equals.equals(str)) {
                    if (this.f34148X.mo40504f() != null) {
                        this.f34148X.mo40504f().mo7337d(i4);
                    }
                    this.f34148X.mo7337d(0);
                }
                i4++;
            }
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34145U = (CheckoutSettings) arguments.getParcelable(CheckoutActivity.f34061b0);
            this.f34144T = (CheckoutInfo) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_INFO");
            this.f34146V = (BrandsValidation) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_BRANDS_VALIDATION");
            C11921z zVar = (C11921z) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PAYMENT_METHODS");
            this.f34140P = zVar.mo40622b();
            this.f34141Q = zVar.mo40623c();
            m53104c();
        }
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_payment_method_selection, viewGroup, false);
    }

    public void onPause() {
        super.onPause();
        C11887q.m53456a(getContext()).mo40548b((C11889b) this);
    }

    public void onResume() {
        super.onResume();
        C11887q.m53456a(getContext()).mo40545a((C11889b) this);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34131b.setText(C11771R.string.checkout_layout_text_select_payment_method);
        if (this.f34140P != null) {
            m53103b(view);
        }
        if (this.f34141Q != null) {
            if (m53107d()) {
                m53108e(view);
            } else {
                m53105c(view);
            }
        }
        if (this.f34145U.mo40671J() && this.f34144T != null) {
            m53101a(view);
        }
    }
}

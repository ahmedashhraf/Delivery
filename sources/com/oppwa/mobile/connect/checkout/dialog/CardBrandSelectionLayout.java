package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.oppwa.mobile.connect.C11771R;

public class CardBrandSelectionLayout extends LinearLayout {

    /* renamed from: N */
    private String[] f34052N;

    /* renamed from: O */
    private boolean f34053O;

    /* renamed from: P */
    private C11890q0 f34054P;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public RecyclerView f34055a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11786d f34056b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout$a */
    class C11783a implements C11892b {
        C11783a() {
        }

        /* renamed from: a */
        public void mo40320a(String str) {
            if (CardBrandSelectionLayout.this.f34056b != null) {
                CardBrandSelectionLayout.this.f34056b.mo40323a(str);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout$b */
    class C11784b implements Runnable {
        C11784b() {
        }

        public void run() {
            C1638g adapter = CardBrandSelectionLayout.this.f34055a.getAdapter();
            if (adapter != null) {
                CardBrandSelectionLayout.this.setVisibility(0);
                C11875n0.m53375a(CardBrandSelectionLayout.this.getContext(), (View) CardBrandSelectionLayout.this);
                adapter.mo7341e();
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout$c */
    class C11785c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f34059a;

        C11785c(int i) {
            this.f34059a = i;
        }

        public void run() {
            CardBrandSelectionLayout.this.setVisibility(4);
            C11875n0.m53376a(CardBrandSelectionLayout.this, this.f34059a, 0);
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout$d */
    interface C11786d {
        /* renamed from: a */
        void mo40323a(String str);
    }

    public CardBrandSelectionLayout(Context context) {
        this(context, null);
    }

    public CardBrandSelectionLayout(Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34053O = false;
        LayoutInflater.from(context).inflate(C11771R.layout.opp_layout_card_brand_selection, this, true);
        this.f34055a = (RecyclerView) findViewById(C11771R.C11775id.grouped_cards_recycler_view);
        this.f34055a.setHasFixedSize(true);
        this.f34055a.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public CardBrandSelectionLayout(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    @RequiresApi(api = 21)
    public CardBrandSelectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet);
    }

    /* renamed from: a */
    private C11890q0 m52975a(String[] strArr) {
        C11890q0 q0Var = new C11890q0(getContext(), strArr);
        q0Var.mo40553a((C11892b) new C11783a());
        return q0Var;
    }

    /* renamed from: a */
    public void mo40312a() {
        if (this.f34053O) {
            this.f34053O = false;
            int height = getHeight();
            if (height != 0) {
                C11875n0.m53377b(getContext(), this);
                new Handler().postDelayed(new C11785c(height), 200);
            }
        }
    }

    /* renamed from: a */
    public void mo40313a(String str) {
        if (this.f34054P != null) {
            int i = 0;
            for (String equals : this.f34052N) {
                if (equals.equals(str)) {
                    this.f34054P.mo7337d(i);
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo40314a(String[] strArr, String str) {
        this.f34054P = (C11890q0) this.f34055a.getAdapter();
        C11890q0 q0Var = this.f34054P;
        if (q0Var == null) {
            this.f34054P = m52975a(strArr);
            this.f34055a.setAdapter(this.f34054P);
        } else {
            q0Var.mo40556a(strArr);
        }
        this.f34054P.mo40555a(str);
        this.f34054P.mo7341e();
        this.f34052N = strArr;
    }

    /* renamed from: b */
    public boolean mo40315b() {
        return this.f34053O;
    }

    /* renamed from: c */
    public void mo40316c() {
        if (!this.f34053O && this.f34052N != null) {
            int height = getHeight();
            int dimension = (int) getResources().getDimension(C11771R.dimen.card_brand_selection_layout_height);
            setVisibility(4);
            C11875n0.m53376a(this, height, dimension);
            this.f34053O = true;
            new Handler().postDelayed(new C11784b(), 200);
        }
    }

    public String[] getCardBrands() {
        return this.f34052N;
    }

    public void setListener(C11786d dVar) {
        this.f34056b = dVar;
    }

    public void setSelectedBrand(String str) {
        this.f34054P.mo40555a(str);
    }
}

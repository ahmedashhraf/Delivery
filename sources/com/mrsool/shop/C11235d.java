package com.mrsool.shop;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1374b;
import com.airbnb.lottie.LottieAnimationView;
import com.mrsool.C10232R;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;

/* renamed from: com.mrsool.shop.d */
/* compiled from: MyCustomDialogFragment */
public class C11235d extends C1374b implements OnClickListener {

    /* renamed from: N */
    private TextView f31249N;

    /* renamed from: O */
    private TextView f31250O;

    /* renamed from: P */
    private Dialog f31251P;

    /* renamed from: Q */
    private TextView f31252Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public LottieAnimationView f31253R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public LinearLayout f31254S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ScrollView f31255T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f31256U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f31257V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f31258W;

    /* renamed from: a */
    private C5887x f31259a;

    /* renamed from: b */
    private AppSingleton f31260b;

    /* renamed from: com.mrsool.shop.d$a */
    /* compiled from: MyCustomDialogFragment */
    class C11236a implements Runnable {
        C11236a() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("SPOOKY Height is :");
            sb.append(C11235d.this.f31253R.getHeight());
            C5880q.m25751b(sb.toString());
            C11235d dVar = C11235d.this;
            dVar.f31256U = dVar.f31253R.getHeight();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SPOOKY Width is :");
            sb2.append(C11235d.this.f31253R.getWidth());
            C5880q.m25751b(sb2.toString());
            C11235d dVar2 = C11235d.this;
            dVar2.f31258W = dVar2.f31254S.getHeight();
            C11235d dVar3 = C11235d.this;
            dVar3.f31257V = dVar3.f31253R.getWidth();
            ScrollView e = C11235d.this.f31255T;
            double d = (double) C11235d.this.f31257V;
            Double.isNaN(d);
            int i = (int) (d * 0.12d);
            double b = (double) C11235d.this.f31256U;
            Double.isNaN(b);
            int i2 = (int) (b * 0.12d);
            double d2 = (double) C11235d.this.f31257V;
            Double.isNaN(d2);
            e.setPadding(i, i2, (int) (d2 * 0.24d), 0);
            double b2 = (double) C11235d.this.f31256U;
            Double.isNaN(b2);
            C11235d.this.f31255T.setLayoutParams(new LayoutParams(-2, (int) (b2 * 0.5d)));
        }
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.txtdOk) {
            C5880q.m25751b("txtdOk");
            Dialog dialog = this.f31251P;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f31259a.mo23614f(this.f31260b.f16955b.getPromotion().getPromotionId());
        }
    }

    public void onCreate(Bundle bundle) {
        setStyle(0, C10232R.style.FullScreenDialogStyle);
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity());
        this.f31251P = dialog;
        dialog.getWindow().addFlags(Integer.MIN_VALUE);
        int i = VERSION.SDK_INT;
        if (i >= 21 && i < 23) {
            dialog.getWindow().setStatusBarColor(getResources().getColor(C10232R.C10234color.sky_blue_color));
        } else if (VERSION.SDK_INT >= 23) {
            dialog.getWindow().setStatusBarColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.white));
        }
        return dialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C10232R.layout.activity_promotional_offer, viewGroup, false);
        this.f31259a = new C5887x(getActivity());
        this.f31260b = (AppSingleton) getActivity().getApplicationContext();
        this.f31249N = (TextView) inflate.findViewById(C10232R.C10236id.txtdMessage);
        this.f31249N.setText(this.f31260b.f16955b.getPromotion().getContent());
        this.f31250O = (TextView) inflate.findViewById(C10232R.C10236id.txtdOk);
        this.f31250O.setOnClickListener(this);
        this.f31254S = (LinearLayout) inflate.findViewById(C10232R.C10236id.llContainer);
        this.f31252Q = (TextView) inflate.findViewById(C10232R.C10236id.tvContent);
        this.f31255T = (ScrollView) inflate.findViewById(C10232R.C10236id.svContent);
        this.f31253R = (LottieAnimationView) inflate.findViewById(C10232R.C10236id.laEnvelop);
        new Handler().postDelayed(new C11236a(), 200);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
    }
}

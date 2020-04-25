package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.r */
public class C11894r extends C11795a0 implements OnCheckedChangeListener {

    /* renamed from: a0 */
    private String[] f34344a0;

    /* renamed from: b0 */
    private List<CheckBox> f34345b0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.r$a */
    class C11895a implements Runnable {
        C11895a() {
        }

        public void run() {
            C11894r.this.f34119X.setVisibility(8);
        }
    }

    /* renamed from: a */
    private String m53486a(C11810c1 c1Var, String str) {
        StringBuilder sb;
        double d;
        String replace = c1Var.mo40428c().replace("{EID}", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(replace);
        sb2.append("?fee=");
        String sb3 = sb2.toString();
        if (this.f34114S.equals("KLARNA_INVOICE")) {
            sb = new StringBuilder();
            sb.append(sb3);
            d = this.f34111P.mo40725q();
        } else {
            sb = new StringBuilder();
            sb.append(sb3);
            d = this.f34111P.mo40724p();
        }
        sb.append(d);
        return sb.toString();
    }

    /* renamed from: a */
    private void m53487a(CheckBox checkBox) {
        if (this.f34345b0 == null) {
            this.f34345b0 = new ArrayList();
        }
        this.f34345b0.add(checkBox);
    }

    /* renamed from: a */
    private void m53488a(String str, C11810c1 c1Var, ViewGroup viewGroup) {
        View inflate = ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(C11771R.layout.opp_layout_terms_agreement, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C11771R.C11775id.agreement_text);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C11771R.C11775id.agreement_checkbox);
        C11868k0.m53358a(getContext(), (TextView) inflate.findViewById(C11771R.C11775id.agreement_link), C11868k0.m53357a(c1Var.mo40426b(), m53486a(c1Var, str)));
        if (c1Var.mo40430d() != null) {
            if (this.f34111P.mo40723o().equals("NL")) {
                ImageView imageView = (ImageView) inflate.findViewById(C11771R.C11775id.agreement_image);
                imageView.setVisibility(0);
                imageView.setImageResource(C11771R.C11774drawable.klarna_credit_warning);
            } else {
                C11868k0.m53358a(getContext(), textView, m53489b(c1Var, str));
                checkBox.setOnCheckedChangeListener(this);
                m53487a(checkBox);
                viewGroup.addView(inflate);
            }
        }
        textView.setVisibility(8);
        checkBox.setVisibility(8);
        viewGroup.addView(inflate);
    }

    /* renamed from: b */
    private String m53489b(C11810c1 c1Var, String str) {
        String d = c1Var.mo40430d();
        if (d != null) {
            return d.replace("{EID}", str);
        }
        return null;
    }

    /* renamed from: e */
    private String m53490e() {
        return C11906t0.m53534a(getContext(), this.f34114S.equals("KLARNA_INVOICE") ? C11771R.C11776raw.klarna_invoice_settings : C11771R.C11776raw.klarna_installments_settings);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        try {
            return new PaymentParams(this.f34111P.mo40717i(), this.f34114S);
        } catch (PaymentException unused) {
            return null;
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        List<CheckBox> list = this.f34345b0;
        if (!(list == null || list.size() == 0)) {
            for (CheckBox isChecked : this.f34345b0) {
                if (!isChecked.isChecked()) {
                    this.f34119X.setEnabled(false);
                    this.f34119X.startAnimation(AnimationUtils.loadAnimation(getContext(), C11771R.anim.opp_hide_button));
                    new Handler().postDelayed(new C11895a(), (long) getResources().getInteger(C11771R.integer.button_anim_time));
                    return;
                }
            }
            this.f34119X.setEnabled(true);
            this.f34119X.startAnimation(AnimationUtils.loadAnimation(getContext(), C11771R.anim.opp_show_button));
            this.f34119X.setVisibility(0);
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        this.f34344a0 = this.f34112Q.mo40846j();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_klarna_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        String[] strArr = this.f34344a0;
        if (!(strArr == null || strArr.length == 0)) {
            C11810c1 a = C11802b1.m53071a(m53490e(), this.f34111P.mo40723o());
            if (a != null) {
                ((TextView) view.findViewById(C11771R.C11775id.klarna_title)).setText(a.mo40424a());
                for (String a2 : this.f34344a0) {
                    m53488a(a2, a, (ViewGroup) view.findViewById(C11771R.C11775id.payment_info));
                }
                List<CheckBox> list = this.f34345b0;
                if (list != null && list.size() > 0) {
                    this.f34119X.setVisibility(8);
                }
            }
        }
    }
}

package com.mrsool.chat;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.bean.InvoiceBean;
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.bean.PaymentReceiptBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.payment.C11118l;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.List;

/* renamed from: com.mrsool.chat.l */
/* compiled from: InvoiceBottomSheet */
public class C10523l implements OnClickListener {

    /* renamed from: N */
    private C5887x f28514N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public View f28515O;

    /* renamed from: P */
    private C5665a f28516P;

    /* renamed from: Q */
    private LinearLayout f28517Q;

    /* renamed from: R */
    private LinearLayout f28518R;

    /* renamed from: S */
    private TextView f28519S;

    /* renamed from: T */
    private TextView f28520T;

    /* renamed from: U */
    private TextView f28521U;

    /* renamed from: V */
    private TextView f28522V;

    /* renamed from: W */
    private TextView f28523W;

    /* renamed from: X */
    private MaterialButton f28524X;

    /* renamed from: Y */
    private MaterialButton f28525Y;

    /* renamed from: Z */
    private TextView f28526Z;

    /* renamed from: a */
    private Context f28527a;

    /* renamed from: a0 */
    private ImageView f28528a0;

    /* renamed from: b */
    private Bundle f28529b;

    /* renamed from: b0 */
    private C11118l f28530b0;

    /* renamed from: c0 */
    private OnClickListener f28531c0;

    /* renamed from: d0 */
    PaymentStatusMainBean f28532d0;

    /* renamed from: com.mrsool.chat.l$a */
    /* compiled from: InvoiceBottomSheet */
    class C10524a implements OnShowListener {
        C10524a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior c = BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet));
            c.mo22467c(C10523l.this.f28515O.getHeight());
            c.mo22474e(3);
        }
    }

    public C10523l(Context context, Bundle bundle) {
        this.f28527a = context;
        this.f28529b = bundle;
        m48630g();
    }

    /* renamed from: e */
    private Activity m48628e() {
        Context context = this.f28527a;
        if (context instanceof ChatActivityNew) {
            return (ChatActivityNew) context;
        }
        return (C0295d) context;
    }

    /* renamed from: f */
    private void m48629f() {
        this.f28518R = (LinearLayout) this.f28515O.findViewById(C10232R.C10236id.llBack);
        this.f28517Q = (LinearLayout) this.f28515O.findViewById(C10232R.C10236id.llInvoice);
        this.f28519S = (TextView) this.f28515O.findViewById(C10232R.C10236id.lblTotal);
        this.f28520T = (TextView) this.f28515O.findViewById(C10232R.C10236id.tvTotalCost);
        this.f28521U = (TextView) this.f28515O.findViewById(C10232R.C10236id.tvTaxNumber);
        this.f28523W = (TextView) this.f28515O.findViewById(C10232R.C10236id.tvCardNumber);
        this.f28528a0 = (ImageView) this.f28515O.findViewById(C10232R.C10236id.ivCardType);
        this.f28524X = (MaterialButton) this.f28515O.findViewById(C10232R.C10236id.btnPay);
        this.f28525Y = (MaterialButton) this.f28515O.findViewById(C10232R.C10236id.btnBack);
        this.f28526Z = (TextView) this.f28515O.findViewById(C10232R.C10236id.tvChange);
        this.f28525Y.setOnClickListener(this);
        this.f28524X.setOnClickListener(this);
        this.f28518R.setOnClickListener(this);
        this.f28526Z.setOnClickListener(this);
        this.f28514N.mo23582b(this.f28523W);
    }

    /* renamed from: g */
    private void m48630g() {
        this.f28514N = new C5887x(this.f28527a);
        this.f28515O = m48628e().getLayoutInflater().inflate(C10232R.layout.bottomsheet_invoice, null);
        this.f28516P = new C5665a(this.f28527a, C10232R.style.DialogStyle);
        Bundle bundle = this.f28529b;
        if (bundle != null && bundle.containsKey(C11644i.f33164P2)) {
            this.f28532d0 = (PaymentStatusMainBean) this.f28529b.getSerializable(C11644i.f33164P2);
        }
        m48629f();
        if (this.f28532d0 != null) {
            m48631h();
        }
        this.f28516P.setOnShowListener(new C10524a());
        this.f28516P.setCancelable(false);
        this.f28516P.setContentView(this.f28515O);
        this.f28516P.getWindow().setSoftInputMode(19);
    }

    /* renamed from: h */
    private void m48631h() {
        try {
            PaymentReceiptBean paymentReceipt = this.f28532d0.getPaymentReceipt();
            for (int i = 0; i < paymentReceipt.getInvoice().size(); i++) {
                View inflate = ((LayoutInflater) this.f28527a.getSystemService("layout_inflater")).inflate(C10232R.layout.row_hyper_pay_invoice, null);
                TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvValue);
                ((TextView) inflate.findViewById(C10232R.C10236id.tvLabel)).setText(((InvoiceBean) paymentReceipt.getInvoice().get(i)).getKey());
                textView.setText(String.format(this.f28527a.getString(C10232R.string.lbl_two_string), new Object[]{((InvoiceBean) paymentReceipt.getInvoice().get(i)).getValue(), ((InvoiceBean) paymentReceipt.getInvoice().get(i)).getCurrency()}));
                this.f28517Q.addView(inflate);
            }
            this.f28519S.setText(paymentReceipt.getGrandTotal().getKey());
            this.f28520T.setText(String.format(this.f28527a.getString(C10232R.string.lbl_two_string), new Object[]{paymentReceipt.getGrandTotal().getValue(), paymentReceipt.getGrandTotal().getCurrency()}));
            C5887x.m25800a(this.f28527a, String.format(this.f28527a.getString(C10232R.string.lbl_tax_number_), new Object[]{paymentReceipt.getTaxNumber()}), this.f28527a.getString(C10232R.string.lbl_tax_number_1), "Roboto-Medium.ttf", this.f28521U);
            if (this.f28532d0.getCards() != null) {
                mo37909c();
                this.f28526Z.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo37908b() {
        C5665a aVar = this.f28516P;
        if (aVar != null && aVar.isShowing()) {
            this.f28516P.dismiss();
        }
    }

    /* renamed from: c */
    public void mo37909c() {
        PaymentCardsBean a = m48627a(this.f28532d0.getCards());
        if (a != null) {
            this.f28523W.setText(String.format(this.f28527a.getString(C10232R.string.card_ending_format), new Object[]{a.getLastDigits()}));
            this.f28528a0.setImageResource(C5887x.m25788P(a.getBrand()));
            return;
        }
        this.f28523W.setText(this.f28527a.getString(C10232R.string.credit_or_debit_card));
        this.f28528a0.setImageResource(C10232R.C10235drawable.ic_saved_card);
    }

    /* renamed from: d */
    public void mo37910d() {
        C5665a aVar = this.f28516P;
        if (aVar != null && !aVar.isShowing()) {
            this.f28516P.show();
        }
    }

    public void onClick(View view) {
        if (view == this.f28525Y || view == this.f28518R) {
            mo37908b();
        } else if (view == this.f28524X) {
            C11118l lVar = this.f28530b0;
            if (lVar != null) {
                lVar.mo37743a();
            }
        } else if (view == this.f28526Z) {
            OnClickListener onClickListener = this.f28531c0;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: a */
    private PaymentCardsBean m48627a(List<PaymentCardsBean> list) {
        for (PaymentCardsBean paymentCardsBean : list) {
            if (paymentCardsBean.isDefault()) {
                return paymentCardsBean;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C11118l mo37905a() {
        return this.f28530b0;
    }

    /* renamed from: a */
    public void mo37907a(C11118l lVar) {
        this.f28530b0 = lVar;
    }

    /* renamed from: a */
    public void mo37906a(OnClickListener onClickListener) {
        this.f28531c0 = onClickListener;
    }
}

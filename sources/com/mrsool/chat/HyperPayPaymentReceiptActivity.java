package com.mrsool.chat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.InvoiceBean;
import com.mrsool.bean.PaymentReceiptBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.payment.AddCardActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;

public class HyperPayPaymentReceiptActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private LinearLayout f28250S;

    /* renamed from: T */
    private LinearLayout f28251T;

    /* renamed from: U */
    private TextView f28252U;

    /* renamed from: V */
    private TextView f28253V;

    /* renamed from: W */
    private TextView f28254W;

    /* renamed from: X */
    private TextView f28255X;

    /* renamed from: Y */
    private TextView f28256Y;

    /* renamed from: Z */
    private MaterialButton f28257Z;

    /* renamed from: a0 */
    private MaterialButton f28258a0;

    /* renamed from: b0 */
    PaymentStatusMainBean f28259b0;

    /* renamed from: J */
    private void m48463J() {
        this.f28251T = (LinearLayout) findViewById(C10232R.C10236id.llBack);
        this.f28250S = (LinearLayout) findViewById(C10232R.C10236id.llInvoice);
        this.f28252U = (TextView) findViewById(C10232R.C10236id.lblTotal);
        this.f28253V = (TextView) findViewById(C10232R.C10236id.tvTotalCost);
        this.f28254W = (TextView) findViewById(C10232R.C10236id.tvTaxNumber);
        this.f28255X = (TextView) findViewById(C10232R.C10236id.tvOrderID);
        this.f28256Y = (TextView) findViewById(C10232R.C10236id.tvCardNumber);
        this.f28257Z = (MaterialButton) findViewById(C10232R.C10236id.btnPay);
        this.f28258a0 = (MaterialButton) findViewById(C10232R.C10236id.btnBack);
        this.f28258a0.setOnClickListener(this);
        this.f28257Z.setOnClickListener(this);
        this.f28251T.setOnClickListener(this);
        this.f29642a.mo23582b(this.f28256Y);
    }

    /* renamed from: K */
    private void m48464K() {
        try {
            PaymentReceiptBean paymentReceipt = this.f28259b0.getPaymentReceipt();
            this.f28255X.setText(String.format(getString(C10232R.string.lbl_order_id_value), new Object[]{ChatActivityNew.f27655C6}));
            for (int i = 0; i < paymentReceipt.getInvoice().size(); i++) {
                View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(C10232R.layout.row_hyper_pay_invoice, null);
                TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvValue);
                ((TextView) inflate.findViewById(C10232R.C10236id.tvLabel)).setText(((InvoiceBean) paymentReceipt.getInvoice().get(i)).getKey());
                textView.setText(String.format(getString(C10232R.string.lbl_two_string), new Object[]{((InvoiceBean) paymentReceipt.getInvoice().get(i)).getValue(), ((InvoiceBean) paymentReceipt.getInvoice().get(i)).getCurrency()}));
                this.f28250S.addView(inflate);
            }
            this.f28252U.setText(paymentReceipt.getGrandTotal().getKey());
            this.f28253V.setText(String.format(getString(C10232R.string.lbl_two_string), new Object[]{paymentReceipt.getGrandTotal().getValue(), paymentReceipt.getGrandTotal().getCurrency()}));
            C5887x.m25800a(this, String.format(getString(C10232R.string.lbl_tax_number_), new Object[]{paymentReceipt.getTaxNumber()}), getString(C10232R.string.lbl_tax_number_1), "Roboto-Medium.ttf", this.f28254W);
        } catch (Exception unused) {
        }
    }

    public void onClick(View view) {
        if (view == this.f28258a0 || view == this.f28251T) {
            onBackPressed();
        } else if (view == this.f28257Z) {
            startActivity(new Intent(this, AddCardActivity.class));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29642a.mo23590c((Activity) this);
        setContentView((int) C10232R.layout.activity_hyper_pay_reciept);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(C11644i.f33164P2)) {
            this.f28259b0 = (PaymentStatusMainBean) extras.getSerializable(C11644i.f33164P2);
        }
        m48463J();
        if (this.f28259b0 != null) {
            m48464K();
        }
    }
}

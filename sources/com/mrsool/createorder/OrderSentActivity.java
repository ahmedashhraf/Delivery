package com.mrsool.createorder;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import com.mrsool.C10232R;
import com.mrsool.order.C11071t;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;

public class OrderSentActivity extends C0295d implements OnClickListener {

    /* renamed from: O */
    public static C11071t f28828O;

    /* renamed from: N */
    private C5887x f28829N;

    /* renamed from: a */
    private TextView f28830a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f28831b;

    /* renamed from: com.mrsool.createorder.OrderSentActivity$a */
    private class C10585a implements OnGlobalLayoutListener {

        /* renamed from: a */
        private View f28832a;

        public C10585a(View view) {
            this.f28832a = view;
        }

        public void onGlobalLayout() {
            if (OrderSentActivity.this.f28831b.getLineCount() > 2) {
                OrderSentActivity.this.f28831b.setTextSize(2, 16.0f);
            }
            this.f28832a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: C */
    private void m48875C() {
        this.f28829N = new C5887x(this);
        this.f28830a = (TextView) findViewById(C10232R.C10236id.tvGoMyOrder);
        this.f28830a.setOnClickListener(this);
        this.f28831b = (TextView) findViewById(C10232R.C10236id.tvOrderDone);
        this.f28831b.getViewTreeObserver().addOnGlobalLayoutListener(new C10585a(this.f28831b));
    }

    /* renamed from: D */
    private void m48876D() {
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
            C11730j.m52801b(this);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f28829N.mo23473E(C11644i.f33205U3);
    }

    public void onClick(View view) {
        if (view == this.f28830a) {
            f28828O.mo36518A();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m48876D();
        setContentView((int) C10232R.layout.activity_order_sent);
        m48875C();
    }

    /* renamed from: a */
    public static void m48878a(C11071t tVar) {
        f28828O = tVar;
        StringBuilder sb = new StringBuilder();
        sb.append("setonPostOrderSuccessfullyListener after");
        sb.append(f28828O);
        C5880q.m25753d(sb.toString());
    }
}

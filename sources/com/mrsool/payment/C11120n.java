package com.mrsool.payment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.C0193h0;
import androidx.appcompat.app.C0295d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C5662e;
import com.google.android.material.bottomsheet.C5665a;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.mrsool.C10232R;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.payment.C11125p.C11126a;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;

/* renamed from: com.mrsool.payment.n */
/* compiled from: Payment3DSecureWebviewBottomSheet */
public class C11120n implements OnClickListener {

    /* renamed from: N */
    private View f30793N;

    /* renamed from: O */
    private C5665a f30794O;

    /* renamed from: P */
    private WebView f30795P;

    /* renamed from: Q */
    private C5887x f30796Q;

    /* renamed from: R */
    public ProgressBar f30797R;

    /* renamed from: S */
    private LinearLayout f30798S;

    /* renamed from: T */
    private LinearLayout f30799T;

    /* renamed from: U */
    int f30800U;

    /* renamed from: a */
    private Context f30801a;

    /* renamed from: b */
    private Bundle f30802b;

    /* renamed from: com.mrsool.payment.n$a */
    /* compiled from: Payment3DSecureWebviewBottomSheet */
    class C11121a implements OnShowListener {

        /* renamed from: com.mrsool.payment.n$a$a */
        /* compiled from: Payment3DSecureWebviewBottomSheet */
        class C11122a extends C5662e {

            /* renamed from: a */
            final /* synthetic */ BottomSheetBehavior f30804a;

            C11122a(BottomSheetBehavior bottomSheetBehavior) {
                this.f30804a = bottomSheetBehavior;
            }

            /* renamed from: a */
            public void mo22486a(@C0193h0 View view, float f) {
            }

            /* renamed from: a */
            public void mo22487a(@C0193h0 View view, int i) {
                if (i == 1) {
                    this.f30804a.mo22474e(3);
                }
            }
        }

        C11121a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior c = BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet));
            c.mo22467c(C11120n.this.f30800U);
            c.mo22474e(3);
            c.mo22458a((C5662e) new C11122a(c));
        }
    }

    /* renamed from: com.mrsool.payment.n$b */
    /* compiled from: Payment3DSecureWebviewBottomSheet */
    class C11123b implements C11126a {
        C11123b() {
        }

        /* renamed from: a */
        public void mo38931a() {
            C11120n.this.m50481a(false);
        }
    }

    public C11120n(Context context, Bundle bundle) {
        this.f30801a = context;
        this.f30802b = bundle;
        m50483e();
    }

    /* renamed from: d */
    private Activity m50482d() {
        Context context = this.f30801a;
        if (context instanceof ChatActivityNew) {
            return (ChatActivityNew) context;
        }
        return (C0295d) context;
    }

    /* renamed from: e */
    private void m50483e() {
        this.f30796Q = new C5887x(this.f30801a);
        this.f30793N = ((Activity) this.f30801a).getLayoutInflater().inflate(C10232R.layout.bottomsheet_3d_secure_webview, null);
        this.f30794O = new C5665a(this.f30801a, C10232R.style.DialogStyle);
        this.f30800U = C11644i.f33105I - this.f30796Q.mo23601d(51);
        m50484f();
        this.f30794O.setOnShowListener(new C11121a());
        this.f30794O.setCancelable(false);
        this.f30794O.setContentView(this.f30793N);
        this.f30794O.getWindow().setSoftInputMode(19);
    }

    /* renamed from: f */
    private void m50484f() {
        this.f30797R = (ProgressBar) this.f30793N.findViewById(C10232R.C10236id.pgLoader);
        this.f30798S = (LinearLayout) this.f30793N.findViewById(C10232R.C10236id.llBack);
        this.f30798S.setOnClickListener(this);
        this.f30799T = (LinearLayout) this.f30793N.findViewById(C10232R.C10236id.llInflate);
        C5887x xVar = this.f30796Q;
        xVar.mo23477G(xVar.mo23496R() ? C11644i.f33191S5 : C11644i.f33183R5);
        if (this.f30796Q.mo23502X()) {
            this.f30795P = (WebView) this.f30793N.findViewById(C10232R.C10236id.wvTermsService);
            this.f30795P.getSettings().setJavaScriptEnabled(true);
            this.f30795P.setScrollBarStyle(MediaHttpDownloader.f20486j);
            this.f30795P.getSettings().setAllowFileAccess(true);
            m50485g();
            this.f30795P.loadUrl(this.f30802b.getString(C11644i.f33383p1));
            m50481a(true);
        }
    }

    /* renamed from: g */
    private void m50485g() {
        C11125p pVar = new C11125p(m50482d(), this.f30801a, this.f30797R);
        pVar.mo38933a((C11126a) new C11123b());
        this.f30795P.setWebViewClient(pVar);
    }

    /* renamed from: b */
    public boolean mo38927b() {
        return this.f30794O.isShowing();
    }

    /* renamed from: c */
    public void mo38928c() {
        C5665a aVar = this.f30794O;
        if (aVar != null && !aVar.isShowing()) {
            this.f30794O.show();
        }
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.llBack) {
            mo38926a();
            this.f30796Q.mo23473E(C11644i.f33174Q4);
        }
    }

    /* renamed from: a */
    public void mo38926a() {
        C5665a aVar = this.f30794O;
        if (aVar != null && aVar.isShowing()) {
            this.f30794O.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50481a(boolean z) {
        if (z) {
            LayoutParams layoutParams = (LayoutParams) this.f30795P.getLayoutParams();
            layoutParams.height = this.f30800U - this.f30796Q.mo23601d(60);
            this.f30795P.setLayoutParams(layoutParams);
            return;
        }
        this.f30795P.setLayoutParams(new LayoutParams(-1, -1));
    }
}

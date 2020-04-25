package com.mrsool.payment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.C0295d;
import androidx.appcompat.widget.Toolbar;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.mrsool.C10232R;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;

public class Payment3DSecureWebviewActivity extends C0295d implements OnClickListener {

    /* renamed from: N */
    private WebView f30688N;

    /* renamed from: O */
    private C5887x f30689O;

    /* renamed from: P */
    private Toolbar f30690P;

    /* renamed from: Q */
    private LinearLayout f30691Q;

    /* renamed from: R */
    public ProgressBar f30692R;

    /* renamed from: S */
    private ImageView f30693S;

    /* renamed from: a */
    private TextView f30694a;

    /* renamed from: b */
    private View f30695b;

    @RequiresApi(api = 19)
    @SuppressLint({"JavascriptInterface"})
    /* renamed from: C */
    private void m50358C() {
        this.f30689O = new C5887x(this);
        this.f30692R = (ProgressBar) findViewById(C10232R.C10236id.pgLoader);
        C5887x xVar = this.f30689O;
        xVar.mo23477G(xVar.mo23496R() ? C11644i.f33191S5 : C11644i.f33183R5);
        m50359D();
        if (this.f30689O.mo23502X()) {
            this.f30688N = (WebView) findViewById(C10232R.C10236id.wvTermsService);
            this.f30688N.getSettings().setJavaScriptEnabled(true);
            this.f30688N.setScrollBarStyle(MediaHttpDownloader.f20486j);
            this.f30688N.getSettings().setAllowFileAccess(true);
            this.f30688N.setWebViewClient(new C11125p(this, this, this.f30692R));
            this.f30688N.loadUrl(getIntent().getExtras().getString(C11644i.f33383p1));
        }
    }

    /* renamed from: D */
    private void m50359D() {
        this.f30694a = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f30694a.setText(getIntent().getExtras().getString(C11644i.f33391q1));
        this.f30693S = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f30693S.setOnClickListener(this);
        if (this.f30689O.mo23496R()) {
            this.f30693S.setScaleX(-1.0f);
        }
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 19)
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_payment_3d_secure);
        m50358C();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f30689O;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }
}

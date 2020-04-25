package com.mrsool.p409me;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.C0295d;
import androidx.appcompat.widget.Toolbar;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.mrsool.C10232R;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;

/* renamed from: com.mrsool.me.TermsOfServiceActivity */
public class TermsOfServiceActivity extends C0295d implements OnClickListener {

    /* renamed from: N */
    private WebView f29899N;

    /* renamed from: O */
    private C5887x f29900O;

    /* renamed from: P */
    private Toolbar f29901P;

    /* renamed from: Q */
    private LinearLayout f29902Q;

    /* renamed from: R */
    private ImageView f29903R;

    /* renamed from: a */
    private TextView f29904a;

    /* renamed from: b */
    private View f29905b;

    @RequiresApi(api = 19)
    @SuppressLint({"JavascriptInterface"})
    /* renamed from: C */
    private void m49762C() {
        this.f29900O = new C5887x(this);
        C5887x xVar = this.f29900O;
        xVar.mo23477G(xVar.mo23496R() ? C11644i.f33191S5 : C11644i.f33183R5);
        m49763D();
        if (this.f29900O.mo23502X()) {
            this.f29899N = (WebView) findViewById(C10232R.C10236id.wvTermsService);
            this.f29899N.getSettings().setJavaScriptEnabled(true);
            this.f29899N.setScrollBarStyle(MediaHttpDownloader.f20486j);
            this.f29899N.getSettings().setAllowFileAccess(true);
            this.f29899N.setWebViewClient(new C10925h(this));
            this.f29899N.loadUrl(getIntent().getExtras().getString(C11644i.f33383p1));
        }
    }

    /* renamed from: D */
    private void m49763D() {
        this.f29904a = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29904a.setText(getIntent().getExtras().getString(C11644i.f33391q1));
        this.f29903R = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29903R.setOnClickListener(this);
        if (this.f29900O.mo23496R()) {
            this.f29903R.setScaleX(-1.0f);
        }
    }

    public void onBackPressed() {
        setResult(-1);
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
        setContentView((int) C10232R.layout.activity_terms_condition);
        m49762C();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f29900O;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }
}

package com.mrsool;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import com.mrsool.utils.C11644i;

public class WebviewActivity extends C0295d implements OnClickListener {

    /* renamed from: U */
    public static Context f27459U;

    /* renamed from: N */
    private WebView f27460N;

    /* renamed from: O */
    private TextView f27461O;

    /* renamed from: P */
    private String f27462P = C11644i.f33183R5;

    /* renamed from: Q */
    private boolean f27463Q = false;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ProgressBar f27464R;

    /* renamed from: S */
    private LinearLayout f27465S;

    /* renamed from: T */
    private ImageView f27466T;

    /* renamed from: a */
    private String f27467a = "https://mrsool.co/appinaction.html";

    /* renamed from: b */
    public Bundle f27468b;

    /* renamed from: com.mrsool.WebviewActivity$a */
    class C10252a extends WebChromeClient {
        C10252a() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    /* renamed from: com.mrsool.WebviewActivity$b */
    private class C10253b extends WebViewClient {
        private C10253b() {
        }

        public void onPageFinished(WebView webView, String str) {
            WebviewActivity.this.f27464R.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        /* synthetic */ C10253b(WebviewActivity webviewActivity, C10252a aVar) {
            this();
        }
    }

    /* renamed from: C */
    private void m47664C() {
        f27459U = this;
        this.f27468b = getIntent().getExtras();
        this.f27464R = (ProgressBar) findViewById(C10232R.C10236id.progressBar);
        this.f27460N = (WebView) findViewById(C10232R.C10236id.webview);
    }

    /* renamed from: D */
    private void m47665D() {
        this.f27460N.setWebViewClient(new C10253b(this, null));
        this.f27460N.getSettings().setLoadsImagesAutomatically(true);
        this.f27460N.getSettings().setBuiltInZoomControls(true);
        this.f27460N.getSettings().setJavaScriptEnabled(true);
        this.f27460N.getSettings().setSupportZoom(true);
        this.f27460N.clearCache(true);
        this.f27460N.clearHistory();
        this.f27460N.getSettings().setLoadWithOverviewMode(true);
        this.f27460N.getSettings().setUseWideViewPort(true);
        this.f27460N.setScrollBarStyle(0);
        this.f27460N.setWebChromeClient(new C10252a());
        this.f27464R.setVisibility(0);
        this.f27460N.loadUrl(this.f27467a);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.llLeft) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_webview);
        m47664C();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m47665D();
    }
}

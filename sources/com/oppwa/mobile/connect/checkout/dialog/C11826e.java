package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.facebook.common.util.UriUtil;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.provider.Transaction;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.e */
public class C11826e extends C11799b {

    /* renamed from: T */
    public static final String f34194T = "TRANSACTION";
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C11909u0 f34195P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Transaction f34196Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ProgressBar f34197R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public String f34198S;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.e$a */
    class C11827a extends WebViewClient {
        C11827a() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C11826e.this.f34197R.setVisibility(8);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C11826e.this.f34197R.setProgress(0);
            C11826e.this.f34197R.setVisibility(0);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http") || str.startsWith(UriUtil.HTTPS_SCHEME)) {
                return false;
            }
            C11826e.this.f34195P.mo40387b(C11826e.this.f34196Q);
            C11826e.this.f34198S = str;
            return true;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.e$b */
    class C11828b extends WebChromeClient {
        C11828b() {
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            C11826e.this.f34197R.setProgress(i);
        }
    }

    /* renamed from: a */
    public static C11826e m53219a(Transaction transaction) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f34194T, transaction);
        C11826e eVar = new C11826e();
        eVar.setArguments(bundle);
        return eVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34195P = (C11909u0) getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34196Q = (Transaction) arguments.getParcelable(f34194T);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_webview_checkout, viewGroup, false);
    }

    public void onStop() {
        super.onStop();
        String str = this.f34198S;
        if (str != null) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34131b.setText(C11771R.string.checkout_payment_details);
        this.f34197R = (ProgressBar) view.findViewById(C11771R.C11775id.progress_bar);
        if (this.f34196Q != null) {
            WebView webView = (WebView) view.findViewById(C11771R.C11775id.checkout_webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new C11827a());
            webView.setWebChromeClient(new C11828b());
            webView.loadUrl(this.f34196Q.mo41028c());
        }
    }
}

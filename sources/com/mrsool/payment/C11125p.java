package com.mrsool.payment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.mrsool.C10232R;
import com.mrsool.chat.AdvanceWebviewActivity;
import com.mrsool.utils.C5880q;
import java.lang.ref.WeakReference;

/* renamed from: com.mrsool.payment.p */
/* compiled from: PaymentWebViewClient */
public class C11125p extends WebViewClient {

    /* renamed from: a */
    private final WeakReference<Activity> f30807a;

    /* renamed from: b */
    private Context f30808b;

    /* renamed from: c */
    private ProgressBar f30809c;

    /* renamed from: d */
    private C11126a f30810d;

    /* renamed from: com.mrsool.payment.p$a */
    /* compiled from: PaymentWebViewClient */
    public interface C11126a {
        /* renamed from: a */
        void mo38931a();
    }

    public C11125p(Activity activity, Context context, ProgressBar progressBar) {
        this.f30807a = new WeakReference<>(activity);
        m50495a(true);
        this.f30808b = context;
        this.f30809c = progressBar;
    }

    /* renamed from: a */
    private Intent m50494a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.CC", str4);
        intent.setType("message/rfc822");
        return intent;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C11126a aVar = this.f30810d;
        if (aVar != null) {
            aVar.mo38931a();
        }
        m50495a(false);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.startsWith(this.f30808b.getString(C10232R.string.checkout_ui_callback_scheme))) {
            C5880q.m25751b("Payment DONE");
            Context context = this.f30808b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30808b.getString(C10232R.string.checkout_ui_callback_scheme));
            sb.append("://callback");
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Activity activity = (Activity) this.f30807a.get();
        if (str.startsWith("mailto:")) {
            activity.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
        } else if (str.startsWith("tel:")) {
            activity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
        } else {
            webView.loadUrl(str);
        }
        return true;
    }

    /* renamed from: a */
    private void m50495a(boolean z) {
        try {
            Activity activity = (Activity) this.f30807a.get();
            int i = 0;
            if (activity instanceof AdvanceWebviewActivity) {
                ProgressBar progressBar = ((Payment3DSecureWebviewActivity) activity).f30692R;
                if (!z) {
                    i = 8;
                }
                progressBar.setVisibility(i);
                return;
            }
            ProgressBar progressBar2 = this.f30809c;
            if (!z) {
                i = 8;
            }
            progressBar2.setVisibility(i);
        } catch (Exception unused) {
        }
    }

    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Activity activity = (Activity) this.f30807a.get();
        Uri url = webResourceRequest.getUrl();
        if (url.toString().startsWith("mailto:")) {
            activity.startActivity(new Intent("android.intent.action.SENDTO", url));
        } else if (url.toString().startsWith("tel:")) {
            activity.startActivity(new Intent("android.intent.action.DIAL", url));
        } else {
            webView.loadUrl(url.toString());
        }
        return true;
    }

    /* renamed from: a */
    public C11126a mo38932a() {
        return this.f30810d;
    }

    /* renamed from: a */
    public void mo38933a(C11126a aVar) {
        this.f30810d = aVar;
    }
}

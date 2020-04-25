package com.mrsool.p409me;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mrsool.chat.AdvanceWebviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: com.mrsool.me.h */
/* compiled from: MyWebViewClient */
public class C10925h extends WebViewClient {

    /* renamed from: a */
    private final WeakReference<Activity> f30075a;

    public C10925h(Activity activity) {
        this.f30075a = new WeakReference<>(activity);
        m49890a(true);
    }

    /* renamed from: a */
    private Intent m49889a(Context context, String str, String str2, String str3, String str4) {
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
        m49890a(false);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Activity activity = (Activity) this.f30075a.get();
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
    private void m49890a(boolean z) {
        try {
            Activity activity = (Activity) this.f30075a.get();
            if (activity instanceof AdvanceWebviewActivity) {
                ((AdvanceWebviewActivity) activity).f27647X.setVisibility(z ? 0 : 8);
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Activity activity = (Activity) this.f30075a.get();
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
}

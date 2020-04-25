package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.C0195i0;
import com.instabug.library.model.NetworkLog;
import java.net.URLDecoder;

/* renamed from: com.clevertap.android.sdk.j */
/* compiled from: CTInAppBaseFullHtmlFragment */
public abstract class C3116j extends C3112i {

    /* renamed from: S */
    private C3074c0 f11174S;

    /* renamed from: com.clevertap.android.sdk.j$a */
    /* compiled from: CTInAppBaseFullHtmlFragment */
    class C3117a implements OnClickListener {
        C3117a() {
        }

        public void onClick(View view) {
            C3116j.this.mo12298b((Bundle) null);
        }
    }

    /* renamed from: com.clevertap.android.sdk.j$b */
    /* compiled from: CTInAppBaseFullHtmlFragment */
    private class C3118b extends WebViewClient {
        C3118b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2 = "wzrk_c2a";
            try {
                Bundle a = C3232v1.m15645a(str, false);
                if (a != null && a.containsKey(str2)) {
                    String string = a.getString(str2);
                    if (string != null) {
                        String[] split = string.split("__dl__");
                        if (split.length == 2) {
                            a.putString(str2, URLDecoder.decode(split[0], "UTF-8"));
                            str = split[1];
                        }
                    }
                }
                C3116j.this.mo12293a(a);
                StringBuilder sb = new StringBuilder();
                sb.append("Executing call to action for in-app: ");
                sb.append(str);
                C3111h1.m14930d(sb.toString());
                C3116j.this.mo12295a(str, a);
            } catch (Throwable th) {
                C3111h1.m14941f("Error parsing the in-app notification action!", th);
            }
            return true;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    /* renamed from: a */
    private View m14977a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            View inflate = layoutInflater.inflate(C3058R.layout.inapp_html_full, viewGroup, false);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C3058R.C3061id.inapp_html_full_relative_layout);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(13);
            m14978a(layoutParams);
            C3074c0 c0Var = new C3074c0(getActivity().getBaseContext(), this.f11150a.mo11918E(), this.f11150a.mo11943o(), this.f11150a.mo11919F(), this.f11150a.mo11944p());
            this.f11174S = c0Var;
            this.f11174S.setWebViewClient(new C3118b());
            if (this.f11150a.mo11923J()) {
                this.f11174S.getSettings().setJavaScriptEnabled(true);
                this.f11174S.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
                this.f11174S.getSettings().setAllowContentAccess(false);
                this.f11174S.getSettings().setAllowFileAccess(false);
                if (VERSION.SDK_INT >= 16) {
                    this.f11174S.getSettings().setAllowFileAccessFromFileURLs(false);
                }
                this.f11174S.addJavascriptInterface(new C3147o0(C3150p0.m15209b((Context) getActivity(), this.f11151b)), "CleverTap");
            }
            if (m14980f()) {
                relativeLayout.setBackgroundDrawable(new ColorDrawable(-1157627904));
            } else {
                relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
            }
            relativeLayout.addView(this.f11174S, layoutParams);
            if (m14979e()) {
                this.f11146O = new CloseImageView(getActivity().getBaseContext());
                LayoutParams layoutParams2 = new LayoutParams(-1, -1);
                layoutParams2.addRule(2, this.f11174S.getId());
                layoutParams2.addRule(1, this.f11174S.getId());
                int i = -(mo12291a(40) / 2);
                layoutParams2.setMargins(i, 0, 0, i);
                this.f11146O.setOnClickListener(new C3117a());
                relativeLayout.addView(this.f11146O, layoutParams2);
            }
            return inflate;
        } catch (Throwable th) {
            this.f11151b.mo12108l().mo12316c(this.f11151b.mo12093a(), "Fragment view not created", th);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m14979e() {
        return this.f11150a.mo11926M();
    }

    /* renamed from: f */
    private boolean m14980f() {
        return this.f11150a.mo11920G();
    }

    /* renamed from: g */
    private void m14981g() {
        this.f11174S.mo12212a();
        if (this.f11150a.mo11941m().isEmpty()) {
            Point point = this.f11174S.f10990P;
            int i = point.y;
            int i2 = point.x;
            float f = getResources().getDisplayMetrics().density;
            int i3 = (int) (((float) i) / f);
            int i4 = (int) (((float) i2) / f);
            String q = this.f11150a.mo11945q();
            StringBuilder sb = new StringBuilder();
            sb.append("<style>body{width:");
            sb.append(i4);
            sb.append("px; height: ");
            sb.append(i3);
            sb.append("px; margin: 0; padding:0;}</style>");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            String str = "<head>";
            sb3.append(str);
            sb3.append(sb2);
            String replaceFirst = q.replaceFirst(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Density appears to be ");
            sb4.append(f);
            C3111h1.m14938f(sb4.toString());
            this.f11174S.setInitialScale((int) (f * 100.0f));
            this.f11174S.loadDataWithBaseURL(null, replaceFirst, NetworkLog.HTML, "utf-8", null);
            return;
        }
        this.f11174S.loadUrl(this.f11150a.mo11941m());
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m14981g();
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        return m14977a(layoutInflater, viewGroup);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m14981g();
    }

    /* renamed from: a */
    private void m14978a(LayoutParams layoutParams) {
        char y = this.f11150a.mo11954y();
        if (y == 'b') {
            layoutParams.addRule(12);
        } else if (y == 'c') {
            layoutParams.addRule(13);
        } else if (y == 'l') {
            layoutParams.addRule(9);
        } else if (y == 'r') {
            layoutParams.addRule(11);
        } else if (y == 't') {
            layoutParams.addRule(10);
        }
        layoutParams.setMargins(0, 0, 0, 0);
    }
}

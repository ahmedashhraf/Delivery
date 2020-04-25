package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.C0195i0;
import com.instabug.library.model.NetworkLog;
import java.net.URLDecoder;

/* renamed from: com.clevertap.android.sdk.m */
/* compiled from: CTInAppBasePartialHtmlFragment */
public abstract class C3131m extends C3128l implements OnTouchListener, OnLongClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C3074c0 f11199S;

    /* renamed from: T */
    private final GestureDetector f11200T = new GestureDetector(new C3133b());

    /* renamed from: com.clevertap.android.sdk.m$b */
    /* compiled from: CTInAppBasePartialHtmlFragment */
    private class C3133b extends SimpleOnGestureListener {

        /* renamed from: a */
        private final int f11202a;

        /* renamed from: b */
        private final int f11203b;

        /* renamed from: com.clevertap.android.sdk.m$b$a */
        /* compiled from: CTInAppBasePartialHtmlFragment */
        class C3134a implements AnimationListener {
            C3134a() {
            }

            public void onAnimationEnd(Animation animation) {
                C3131m.this.mo12298b((Bundle) null);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        private C3133b() {
            this.f11202a = 120;
            this.f11203b = 200;
        }

        /* renamed from: a */
        private boolean m15052a(MotionEvent motionEvent, MotionEvent motionEvent2, boolean z) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                translateAnimation = new TranslateAnimation(0.0f, (float) C3131m.this.mo12291a(50), 0.0f, 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, (float) (-C3131m.this.mo12291a(50)), 0.0f, 0.0f);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new C3134a());
            C3131m.this.f11199S.startAnimation(animationSet);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f) > 200.0f) {
                return m15052a(motionEvent, motionEvent2, false);
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
                return false;
            }
            return m15052a(motionEvent, motionEvent2, true);
        }
    }

    /* renamed from: com.clevertap.android.sdk.m$c */
    /* compiled from: CTInAppBasePartialHtmlFragment */
    private class C3135c extends WebViewClient {
        C3135c() {
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
                C3131m.this.mo12293a(a);
                StringBuilder sb = new StringBuilder();
                sb.append("Executing call to action for in-app: ");
                sb.append(str);
                C3111h1.m14930d(sb.toString());
                C3131m.this.mo12295a(str, a);
            } catch (Throwable th) {
                C3111h1.m14941f("Error parsing the in-app notification action!", th);
            }
            return true;
        }
    }

    /* renamed from: b */
    private View m15048b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            View a = mo12379a(layoutInflater, viewGroup);
            ViewGroup a2 = mo12380a(a);
            C3074c0 c0Var = new C3074c0(getActivity().getBaseContext(), this.f11150a.mo11918E(), this.f11150a.mo11943o(), this.f11150a.mo11919F(), this.f11150a.mo11944p());
            this.f11199S = c0Var;
            this.f11199S.setWebViewClient(new C3135c());
            this.f11199S.setOnTouchListener(this);
            this.f11199S.setOnLongClickListener(this);
            if (a2 != null) {
                a2.addView(this.f11199S);
            }
            return a;
        } catch (Throwable th) {
            this.f11151b.mo12108l().mo12316c(this.f11151b.mo12093a(), "Fragment view not created", th);
            return null;
        }
    }

    /* renamed from: d */
    private void m15049d() {
        this.f11199S.mo12212a();
        Point point = this.f11199S.f10990P;
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
        this.f11199S.setInitialScale((int) (f * 100.0f));
        this.f11199S.loadDataWithBaseURL(null, replaceFirst, NetworkLog.HTML, "utf-8", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract View mo12379a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ViewGroup mo12380a(View view);

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m15049d();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        return m15048b(layoutInflater, viewGroup);
    }

    public boolean onLongClick(View view) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f11200T.onTouchEvent(motionEvent) || motionEvent.getAction() == 2;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m15049d();
    }
}

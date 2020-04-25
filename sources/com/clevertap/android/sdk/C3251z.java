package com.clevertap.android.sdk;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0984g;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;

/* renamed from: com.clevertap.android.sdk.z */
/* compiled from: CTInAppNativeInterstitialFragment */
public class C3251z extends C3122k {

    /* renamed from: f0 */
    private static long f11731f0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public GifImageView f11732S;

    /* renamed from: T */
    private PlayerView f11733T;

    /* renamed from: U */
    private SimpleExoPlayer f11734U;

    /* renamed from: V */
    private Dialog f11735V;

    /* renamed from: W */
    private ImageView f11736W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f11737X = false;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public RelativeLayout f11738Y;

    /* renamed from: Z */
    private LayoutParams f11739Z;

    /* renamed from: a0 */
    private LayoutParams f11740a0;

    /* renamed from: b0 */
    private LayoutParams f11741b0;

    /* renamed from: c0 */
    private FrameLayout f11742c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public int f11743d0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f11744e0 = 0;

    /* renamed from: com.clevertap.android.sdk.z$a */
    /* compiled from: CTInAppNativeInterstitialFragment */
    class C3252a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f11746a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f11747b;

        C3252a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11746a = frameLayout;
            this.f11747b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11746a.findViewById(C3058R.C3061id.interstitial_relative_layout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (C3251z.this.f11150a.mo11927N() && C3251z.this.mo12318d()) {
                C3251z zVar = C3251z.this;
                int measuredWidth = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.78f);
                layoutParams.height = measuredWidth;
                zVar.f11743d0 = measuredWidth;
            } else if (C3251z.this.mo12318d()) {
                layoutParams.setMargins(85, 60, 85, 0);
                layoutParams.width = relativeLayout.getMeasuredWidth() - 85;
                C3251z zVar2 = C3251z.this;
                int i = (int) (((float) layoutParams.width) * 1.78f);
                layoutParams.height = i;
                zVar2.f11743d0 = i;
                relativeLayout.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f11747b.getWidth(), this.f11747b.getHeight());
                layoutParams2.gravity = BadgeDrawable.f16064b0;
                layoutParams2.setMargins(0, 40, 65, 0);
                this.f11747b.setLayoutParams(layoutParams2);
            } else {
                C3251z zVar3 = C3251z.this;
                int measuredWidth2 = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.78f);
                layoutParams.height = measuredWidth2;
                zVar3.f11743d0 = measuredWidth2;
                StringBuilder sb = new StringBuilder();
                sb.append("Layout height = ");
                sb.append(C3251z.this.f11743d0);
                C3111h1.m14930d(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Layout width = ");
                sb2.append(relativeLayout.getMeasuredWidth());
                C3111h1.m14930d(sb2.toString());
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (VERSION.SDK_INT >= 16) {
                C3251z.this.f11738Y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3251z.this.f11738Y.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.z$b */
    /* compiled from: CTInAppNativeInterstitialFragment */
    class C3253b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f11749a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f11750b;

        C3253b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11749a = frameLayout;
            this.f11750b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11749a.findViewById(C3058R.C3061id.interstitial_relative_layout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (!C3251z.this.f11150a.mo11927N() || !C3251z.this.mo12318d()) {
                if (C3251z.this.mo12318d()) {
                    layoutParams.setMargins(120, 40, 85, 0);
                    layoutParams.height = relativeLayout.getMeasuredHeight() - 75;
                    C3251z zVar = C3251z.this;
                    int i = (int) (((float) layoutParams.height) * 1.78f);
                    layoutParams.width = i;
                    zVar.f11744e0 = i;
                    relativeLayout.setLayoutParams(layoutParams);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f11750b.getWidth(), this.f11750b.getHeight());
                    layoutParams2.gravity = BadgeDrawable.f16064b0;
                    layoutParams2.setMargins(0, 20, 90, 0);
                    this.f11750b.setLayoutParams(layoutParams2);
                } else {
                    C3251z zVar2 = C3251z.this;
                    int measuredHeight = (int) (((float) relativeLayout.getMeasuredHeight()) * 1.78f);
                    layoutParams.width = measuredHeight;
                    zVar2.f11744e0 = measuredHeight;
                    layoutParams.gravity = 1;
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            if (VERSION.SDK_INT >= 16) {
                C3251z.this.f11738Y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3251z.this.f11738Y.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.z$c */
    /* compiled from: CTInAppNativeInterstitialFragment */
    class C3254c implements OnClickListener {
        C3254c() {
        }

        public void onClick(View view) {
            C3251z.this.mo12298b((Bundle) null);
            if (C3251z.this.f11732S != null) {
                C3251z.this.f11732S.mo12124a();
            }
            C3251z.this.getActivity().finish();
        }
    }

    /* renamed from: com.clevertap.android.sdk.z$d */
    /* compiled from: CTInAppNativeInterstitialFragment */
    class C3255d implements OnClickListener {
        C3255d() {
        }

        public void onClick(View view) {
            if (!C3251z.this.f11737X) {
                C3251z.this.m15698i();
            } else {
                C3251z.this.m15694f();
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.z$e */
    /* compiled from: CTInAppNativeInterstitialFragment */
    class C3256e extends Dialog {
        C3256e(Context context, int i) {
            super(context, i);
        }

        public void onBackPressed() {
            if (C3251z.this.f11737X) {
                C3251z.this.m15694f();
            }
            super.onBackPressed();
        }
    }

    /* renamed from: g */
    private void m15696g() {
        this.f11736W.setVisibility(8);
    }

    /* renamed from: h */
    private void m15697h() {
        this.f11735V = new C3256e(getActivity(), 16973834);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m15698i() {
        this.f11741b0 = this.f11736W.getLayoutParams();
        this.f11740a0 = this.f11733T.getLayoutParams();
        this.f11739Z = this.f11742c0.getLayoutParams();
        ((ViewGroup) this.f11733T.getParent()).removeView(this.f11733T);
        ((ViewGroup) this.f11736W.getParent()).removeView(this.f11736W);
        ((ViewGroup) this.f11742c0.getParent()).removeView(this.f11742c0);
        this.f11735V.addContentView(this.f11733T, new LayoutParams(-1, -1));
        this.f11737X = true;
        this.f11735V.show();
    }

    /* renamed from: j */
    private void m15699j() {
        this.f11733T.requestFocus();
        this.f11733T.setVisibility(0);
        this.f11733T.setPlayer(this.f11734U);
        this.f11734U.setPlayWhenReady(true);
    }

    /* renamed from: k */
    private void m15700k() {
        this.f11742c0 = (FrameLayout) this.f11738Y.findViewById(C3058R.C3061id.video_frame);
        this.f11742c0.setVisibility(0);
        this.f11733T = new PlayerView(getActivity().getBaseContext());
        this.f11736W = new ImageView(getActivity().getBaseContext());
        this.f11736W.setImageDrawable(getActivity().getBaseContext().getResources().getDrawable(C3058R.C3060drawable.ct_ic_fullscreen_expand));
        this.f11736W.setOnClickListener(new C3255d());
        if (!this.f11150a.mo11927N() || !mo12318d()) {
            this.f11733T.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 240.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 134.0f, getResources().getDisplayMetrics())));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()));
            layoutParams.gravity = C0984g.f4395c;
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()), 0);
            this.f11736W.setLayoutParams(layoutParams);
        } else {
            this.f11733T.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 408.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 229.0f, getResources().getDisplayMetrics())));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics()));
            layoutParams2.gravity = C0984g.f4395c;
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()), 0);
            this.f11736W.setLayoutParams(layoutParams2);
        }
        this.f11733T.setShowBuffering(true);
        this.f11733T.setUseArtwork(true);
        this.f11733T.setControllerAutoShow(false);
        this.f11742c0.addView(this.f11733T);
        this.f11742c0.addView(this.f11736W);
        Drawable drawable = getActivity().getBaseContext().getResources().getDrawable(C3058R.C3060drawable.ct_audio);
        if (VERSION.SDK_INT >= 23) {
            this.f11733T.setDefaultArtwork(C3238w1.m15658a(drawable));
        } else {
            this.f11733T.setDefaultArtwork(C3238w1.m15658a(drawable));
        }
        TransferListener defaultBandwidthMeter = new DefaultBandwidthMeter();
        this.f11734U = ExoPlayerFactory.newSimpleInstance(getActivity().getBaseContext(), new DefaultTrackSelector(new Factory(defaultBandwidthMeter)));
        this.f11734U.prepare(new HlsMediaSource.Factory(new DefaultDataSourceFactory(getActivity().getBaseContext(), Util.getUserAgent(getActivity().getBaseContext(), getActivity().getApplication().getPackageName()), defaultBandwidthMeter)).createMediaSource(Uri.parse(((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11988c())));
        this.f11734U.setRepeatMode(1);
        this.f11734U.seekTo(f11731f0);
    }

    @RequiresApi(api = 17)
    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        View view;
        ArrayList arrayList = new ArrayList();
        if (!this.f11150a.mo11927N() || !mo12318d()) {
            view = layoutInflater.inflate(C3058R.layout.inapp_interstitial, viewGroup, false);
        } else {
            view = layoutInflater.inflate(C3058R.layout.tab_inapp_interstitial, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C3058R.C3061id.inapp_interstitial_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        this.f11738Y = (RelativeLayout) frameLayout.findViewById(C3058R.C3061id.interstitial_relative_layout);
        this.f11738Y.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        int i = this.f11147P;
        if (i == 1) {
            this.f11738Y.getViewTreeObserver().addOnGlobalLayoutListener(new C3252a(frameLayout, closeImageView));
            if (!this.f11150a.mo11950v().isEmpty()) {
                if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11993l()) {
                    CTInAppNotification cTInAppNotification = this.f11150a;
                    if (cTInAppNotification.mo11933b((CTInAppNotificationMedia) cTInAppNotification.mo11950v().get(0)) != null) {
                        ImageView imageView = (ImageView) this.f11738Y.findViewById(C3058R.C3061id.backgroundImage);
                        imageView.setVisibility(0);
                        CTInAppNotification cTInAppNotification2 = this.f11150a;
                        imageView.setImageBitmap(cTInAppNotification2.mo11933b((CTInAppNotificationMedia) cTInAppNotification2.mo11950v().get(0)));
                    }
                } else if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11992k()) {
                    CTInAppNotification cTInAppNotification3 = this.f11150a;
                    if (cTInAppNotification3.mo11932a((CTInAppNotificationMedia) cTInAppNotification3.mo11950v().get(0)) != null) {
                        this.f11732S = (GifImageView) this.f11738Y.findViewById(C3058R.C3061id.gifImage);
                        this.f11732S.setVisibility(0);
                        GifImageView gifImageView = this.f11732S;
                        CTInAppNotification cTInAppNotification4 = this.f11150a;
                        gifImageView.mo12130a(cTInAppNotification4.mo11932a((CTInAppNotificationMedia) cTInAppNotification4.mo11950v().get(0)));
                        this.f11732S.mo12139k();
                    }
                } else if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11994m()) {
                    m15697h();
                    m15700k();
                    m15699j();
                } else if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11991j()) {
                    m15700k();
                    m15699j();
                    m15696g();
                }
            }
        } else if (i == 2) {
            this.f11738Y.getViewTreeObserver().addOnGlobalLayoutListener(new C3253b(frameLayout, closeImageView));
            if (!this.f11150a.mo11950v().isEmpty()) {
                if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11993l()) {
                    CTInAppNotification cTInAppNotification5 = this.f11150a;
                    if (cTInAppNotification5.mo11933b((CTInAppNotificationMedia) cTInAppNotification5.mo11950v().get(0)) != null) {
                        ImageView imageView2 = (ImageView) this.f11738Y.findViewById(C3058R.C3061id.backgroundImage);
                        imageView2.setVisibility(0);
                        CTInAppNotification cTInAppNotification6 = this.f11150a;
                        imageView2.setImageBitmap(cTInAppNotification6.mo11933b((CTInAppNotificationMedia) cTInAppNotification6.mo11950v().get(0)));
                    }
                } else if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11992k()) {
                    CTInAppNotification cTInAppNotification7 = this.f11150a;
                    if (cTInAppNotification7.mo11932a((CTInAppNotificationMedia) cTInAppNotification7.mo11950v().get(0)) != null) {
                        this.f11732S = (GifImageView) this.f11738Y.findViewById(C3058R.C3061id.gifImage);
                        this.f11732S.setVisibility(0);
                        GifImageView gifImageView2 = this.f11732S;
                        CTInAppNotification cTInAppNotification8 = this.f11150a;
                        gifImageView2.mo12130a(cTInAppNotification8.mo11932a((CTInAppNotificationMedia) cTInAppNotification8.mo11950v().get(0)));
                        this.f11732S.mo12139k();
                    }
                } else if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11994m()) {
                    m15697h();
                    m15700k();
                    m15699j();
                } else if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11991j()) {
                    m15700k();
                    m15699j();
                    m15696g();
                }
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.f11738Y.findViewById(C3058R.C3061id.interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(C3058R.C3061id.interstitial_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(C3058R.C3061id.interstitial_button2);
        arrayList.add(button2);
        TextView textView = (TextView) this.f11738Y.findViewById(C3058R.C3061id.interstitial_title);
        textView.setText(this.f11150a.mo11955z());
        textView.setTextColor(Color.parseColor(this.f11150a.mo11914A()));
        TextView textView2 = (TextView) this.f11738Y.findViewById(C3058R.C3061id.interstitial_message);
        textView2.setText(this.f11150a.mo11951w());
        textView2.setTextColor(Color.parseColor(this.f11150a.mo11953x()));
        ArrayList j = this.f11150a.mo11938j();
        if (j.size() == 1) {
            int i2 = this.f11147P;
            if (i2 == 2) {
                button.setVisibility(8);
            } else if (i2 == 1) {
                button.setVisibility(4);
            }
            mo12337a(button2, (CTInAppNotificationButton) j.get(0), 0);
        } else if (!j.isEmpty()) {
            for (int i3 = 0; i3 < j.size(); i3++) {
                if (i3 < 2) {
                    mo12337a((Button) arrayList.get(i3), (CTInAppNotificationButton) j.get(i3), i3);
                }
            }
        }
        frameLayout.setBackgroundDrawable(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new C3254c());
        if (!this.f11150a.mo11922I()) {
            closeImageView.setVisibility(8);
        } else {
            closeImageView.setVisibility(0);
        }
        return view;
    }

    public void onPause() {
        super.onPause();
        GifImageView gifImageView = this.f11732S;
        if (gifImageView != null) {
            gifImageView.mo12124a();
        }
        if (this.f11737X) {
            m15694f();
        }
        SimpleExoPlayer simpleExoPlayer = this.f11734U;
        if (simpleExoPlayer != null) {
            f11731f0 = simpleExoPlayer.getCurrentPosition();
            this.f11734U.stop();
            this.f11734U.release();
            this.f11734U = null;
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f11150a.mo11950v().isEmpty() && this.f11734U == null) {
            if (((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11994m() || ((CTInAppNotificationMedia) this.f11150a.mo11950v().get(0)).mo11991j()) {
                m15700k();
                m15699j();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        GifImageView gifImageView = this.f11732S;
        if (gifImageView != null) {
            CTInAppNotification cTInAppNotification = this.f11150a;
            gifImageView.mo12130a(cTInAppNotification.mo11932a((CTInAppNotificationMedia) cTInAppNotification.mo11950v().get(0)));
            this.f11732S.mo12139k();
        }
    }

    public void onStop() {
        super.onStop();
        GifImageView gifImageView = this.f11732S;
        if (gifImageView != null) {
            gifImageView.mo12124a();
        }
        SimpleExoPlayer simpleExoPlayer = this.f11734U;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            this.f11734U.release();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m15694f() {
        ((ViewGroup) this.f11733T.getParent()).removeView(this.f11733T);
        this.f11733T.setLayoutParams(this.f11740a0);
        ((FrameLayout) this.f11742c0.findViewById(C3058R.C3061id.video_frame)).addView(this.f11733T);
        this.f11736W.setLayoutParams(this.f11741b0);
        ((FrameLayout) this.f11742c0.findViewById(C3058R.C3061id.video_frame)).addView(this.f11736W);
        this.f11742c0.setLayoutParams(this.f11739Z);
        ((RelativeLayout) this.f11738Y.findViewById(C3058R.C3061id.interstitial_relative_layout)).addView(this.f11742c0);
        this.f11737X = false;
        this.f11735V.dismiss();
        this.f11736W.setImageDrawable(C0841b.m4928c(getActivity().getApplicationContext(), C3058R.C3060drawable.ct_ic_fullscreen_expand));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12292a() {
        super.mo12292a();
        GifImageView gifImageView = this.f11732S;
        if (gifImageView != null) {
            gifImageView.mo12124a();
        }
        SimpleExoPlayer simpleExoPlayer = this.f11734U;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            this.f11734U.release();
            this.f11734U = null;
        }
    }
}

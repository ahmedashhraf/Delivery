package com.clevertap.android.sdk;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.C0195i0;
import com.google.android.material.badge.BadgeDrawable;

/* renamed from: com.clevertap.android.sdk.a0 */
/* compiled from: CTInAppNativeInterstitialImageFragment */
public class C3064a0 extends C3112i {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public RelativeLayout f10921S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f10922T = 0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f10923U = 0;

    /* renamed from: com.clevertap.android.sdk.a0$a */
    /* compiled from: CTInAppNativeInterstitialImageFragment */
    class C3065a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f10925a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f10926b;

        C3065a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f10925a = frameLayout;
            this.f10926b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f10925a.findViewById(C3058R.C3061id.interstitial_image_relative_layout);
            LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
            if (C3064a0.this.f11150a.mo11927N() && C3064a0.this.mo12318d()) {
                C3064a0 a0Var = C3064a0.this;
                int measuredWidth = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.78f);
                layoutParams.height = measuredWidth;
                a0Var.f10922T = measuredWidth;
            } else if (C3064a0.this.mo12318d()) {
                layoutParams.setMargins(85, 60, 85, 0);
                layoutParams.width = relativeLayout.getMeasuredWidth() - 85;
                C3064a0 a0Var2 = C3064a0.this;
                int i = (int) (((float) layoutParams.width) * 1.78f);
                layoutParams.height = i;
                a0Var2.f10922T = i;
                relativeLayout.setLayoutParams(layoutParams);
                LayoutParams layoutParams2 = new LayoutParams(this.f10926b.getWidth(), this.f10926b.getHeight());
                layoutParams2.gravity = BadgeDrawable.f16064b0;
                layoutParams2.setMargins(0, 40, 65, 0);
                this.f10926b.setLayoutParams(layoutParams2);
            } else {
                C3064a0 a0Var3 = C3064a0.this;
                int measuredWidth2 = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.78f);
                layoutParams.height = measuredWidth2;
                a0Var3.f10922T = measuredWidth2;
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (VERSION.SDK_INT >= 16) {
                C3064a0.this.f10921S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3064a0.this.f10921S.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.a0$b */
    /* compiled from: CTInAppNativeInterstitialImageFragment */
    class C3066b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f10928a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f10929b;

        C3066b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f10928a = frameLayout;
            this.f10929b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f10928a.findViewById(C3058R.C3061id.interstitial_image_relative_layout);
            LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
            if (!C3064a0.this.f11150a.mo11927N() || !C3064a0.this.mo12318d()) {
                if (C3064a0.this.mo12318d()) {
                    layoutParams.setMargins(120, 40, 85, 0);
                    layoutParams.height = C3064a0.this.f10921S.getMeasuredHeight() - 75;
                    C3064a0 a0Var = C3064a0.this;
                    int i = (int) (((float) layoutParams.height) * 1.78f);
                    layoutParams.width = i;
                    a0Var.f10923U = i;
                    relativeLayout.setLayoutParams(layoutParams);
                    LayoutParams layoutParams2 = new LayoutParams(this.f10929b.getWidth(), this.f10929b.getHeight());
                    layoutParams2.gravity = BadgeDrawable.f16064b0;
                    layoutParams2.setMargins(0, 20, 90, 0);
                    this.f10929b.setLayoutParams(layoutParams2);
                } else {
                    C3064a0 a0Var2 = C3064a0.this;
                    int measuredHeight = (int) (((float) relativeLayout.getMeasuredHeight()) * 1.78f);
                    layoutParams.width = measuredHeight;
                    a0Var2.f10923U = measuredHeight;
                    layoutParams.gravity = 1;
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            if (VERSION.SDK_INT >= 16) {
                C3064a0.this.f10921S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3064a0.this.f10921S.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.a0$c */
    /* compiled from: CTInAppNativeInterstitialImageFragment */
    class C3067c implements OnClickListener {
        C3067c() {
        }

        public void onClick(View view) {
            C3064a0.this.mo12298b((Bundle) null);
            C3064a0.this.getActivity().finish();
        }
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        View view;
        if (!this.f11150a.mo11927N() || !mo12318d()) {
            view = layoutInflater.inflate(C3058R.layout.inapp_interstitial_image, viewGroup, false);
        } else {
            view = layoutInflater.inflate(C3058R.layout.tab_inapp_interstitial_image, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C3058R.C3061id.inapp_interstitial_image_frame_layout);
        frameLayout.setBackgroundDrawable(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        this.f10921S = (RelativeLayout) frameLayout.findViewById(C3058R.C3061id.interstitial_image_relative_layout);
        this.f10921S.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        ImageView imageView = (ImageView) this.f10921S.findViewById(C3058R.C3061id.interstitial_image);
        int i = this.f11147P;
        if (i == 1) {
            this.f10921S.getViewTreeObserver().addOnGlobalLayoutListener(new C3065a(frameLayout, closeImageView));
        } else if (i == 2) {
            this.f10921S.getViewTreeObserver().addOnGlobalLayoutListener(new C3066b(frameLayout, closeImageView));
        }
        if (this.f11150a.mo11930a(this.f11147P) != null) {
            CTInAppNotification cTInAppNotification = this.f11150a;
            if (cTInAppNotification.mo11933b(cTInAppNotification.mo11930a(this.f11147P)) != null) {
                CTInAppNotification cTInAppNotification2 = this.f11150a;
                imageView.setImageBitmap(cTInAppNotification2.mo11933b(cTInAppNotification2.mo11930a(this.f11147P)));
                imageView.setTag(Integer.valueOf(0));
                imageView.setOnClickListener(new C3108a());
            }
        }
        closeImageView.setOnClickListener(new C3067c());
        if (!this.f11150a.mo11922I()) {
            closeImageView.setVisibility(8);
        } else {
            closeImageView.setVisibility(0);
        }
        return view;
    }
}

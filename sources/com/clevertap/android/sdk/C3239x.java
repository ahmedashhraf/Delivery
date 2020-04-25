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

/* renamed from: com.clevertap.android.sdk.x */
/* compiled from: CTInAppNativeHalfInterstitialImageFragment */
public class C3239x extends C3112i {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public RelativeLayout f11711S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f11712T = 0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f11713U = 0;

    /* renamed from: com.clevertap.android.sdk.x$a */
    /* compiled from: CTInAppNativeHalfInterstitialImageFragment */
    class C3240a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f11715a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f11716b;

        C3240a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11715a = frameLayout;
            this.f11716b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11715a.findViewById(C3058R.C3061id.half_interstitial_image_relative_layout);
            LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
            if (C3239x.this.f11150a.mo11927N() && C3239x.this.mo12318d()) {
                C3239x xVar = C3239x.this;
                int measuredWidth = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.3f);
                layoutParams.height = measuredWidth;
                xVar.f11712T = measuredWidth;
            } else if (C3239x.this.mo12318d()) {
                layoutParams.setMargins(90, 240, 90, 0);
                layoutParams.width = relativeLayout.getMeasuredWidth() - 90;
                C3239x xVar2 = C3239x.this;
                int i = (int) (((float) layoutParams.width) * 1.3f);
                layoutParams.height = i;
                xVar2.f11712T = i;
                relativeLayout.setLayoutParams(layoutParams);
                LayoutParams layoutParams2 = new LayoutParams(this.f11716b.getWidth(), this.f11716b.getHeight());
                layoutParams2.gravity = BadgeDrawable.f16064b0;
                layoutParams2.setMargins(0, 220, 70, 0);
                this.f11716b.setLayoutParams(layoutParams2);
            } else {
                C3239x xVar3 = C3239x.this;
                int measuredWidth2 = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.3f);
                layoutParams.height = measuredWidth2;
                xVar3.f11712T = measuredWidth2;
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (VERSION.SDK_INT >= 16) {
                C3239x.this.f11711S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3239x.this.f11711S.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.x$b */
    /* compiled from: CTInAppNativeHalfInterstitialImageFragment */
    class C3241b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f11718a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f11719b;

        C3241b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11718a = frameLayout;
            this.f11719b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11718a.findViewById(C3058R.C3061id.half_interstitial_image_relative_layout);
            LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
            if (!C3239x.this.f11150a.mo11927N() || !C3239x.this.mo12318d()) {
                if (C3239x.this.mo12318d()) {
                    layoutParams.setMargins(200, 40, 190, 0);
                    layoutParams.height = relativeLayout.getMeasuredHeight() - 40;
                    layoutParams.width = (int) (((float) layoutParams.height) * 1.3f);
                    relativeLayout.setLayoutParams(layoutParams);
                    LayoutParams layoutParams2 = new LayoutParams(this.f11719b.getWidth(), this.f11719b.getHeight());
                    layoutParams2.gravity = BadgeDrawable.f16064b0;
                    layoutParams2.setMargins(0, 20, 220, 0);
                    this.f11719b.setLayoutParams(layoutParams2);
                } else {
                    C3239x xVar = C3239x.this;
                    int measuredHeight = (int) (((float) relativeLayout.getMeasuredHeight()) * 1.3f);
                    layoutParams.width = measuredHeight;
                    xVar.f11713U = measuredHeight;
                    layoutParams.gravity = 1;
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            if (VERSION.SDK_INT >= 16) {
                C3239x.this.f11711S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3239x.this.f11711S.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.x$c */
    /* compiled from: CTInAppNativeHalfInterstitialImageFragment */
    class C3242c implements OnClickListener {
        C3242c() {
        }

        public void onClick(View view) {
            C3239x.this.mo12298b((Bundle) null);
            C3239x.this.getActivity().finish();
        }
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        View view;
        if (!this.f11150a.mo11927N() || !mo12318d()) {
            view = layoutInflater.inflate(C3058R.layout.inapp_half_interstitial_image, viewGroup, false);
        } else {
            view = layoutInflater.inflate(C3058R.layout.tab_inapp_half_interstitial_image, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C3058R.C3061id.inapp_half_interstitial_image_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        frameLayout.setBackgroundDrawable(new ColorDrawable(-1157627904));
        this.f11711S = (RelativeLayout) frameLayout.findViewById(C3058R.C3061id.half_interstitial_image_relative_layout);
        this.f11711S.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        ImageView imageView = (ImageView) this.f11711S.findViewById(C3058R.C3061id.half_interstitial_image);
        int i = this.f11147P;
        if (i == 1) {
            this.f11711S.getViewTreeObserver().addOnGlobalLayoutListener(new C3240a(frameLayout, closeImageView));
        } else if (i == 2) {
            this.f11711S.getViewTreeObserver().addOnGlobalLayoutListener(new C3241b(frameLayout, closeImageView));
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
        closeImageView.setOnClickListener(new C3242c());
        if (!this.f11150a.mo11922I()) {
            closeImageView.setVisibility(8);
        } else {
            closeImageView.setVisibility(0);
        }
        return view;
    }
}

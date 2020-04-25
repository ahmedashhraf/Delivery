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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;

/* renamed from: com.clevertap.android.sdk.w */
/* compiled from: CTInAppNativeHalfInterstitialFragment */
public class C3233w extends C3122k {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public RelativeLayout f11701S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f11702T = 0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f11703U = 0;

    /* renamed from: com.clevertap.android.sdk.w$a */
    /* compiled from: CTInAppNativeHalfInterstitialFragment */
    class C3234a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f11705a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f11706b;

        C3234a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11705a = frameLayout;
            this.f11706b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11705a.findViewById(C3058R.C3061id.half_interstitial_relative_layout);
            LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
            if (C3233w.this.f11150a.mo11927N() && C3233w.this.mo12318d()) {
                C3233w wVar = C3233w.this;
                int measuredWidth = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.3f);
                layoutParams.height = measuredWidth;
                wVar.f11702T = measuredWidth;
            } else if (C3233w.this.mo12318d()) {
                layoutParams.setMargins(90, 240, 90, 0);
                layoutParams.width = relativeLayout.getMeasuredWidth() - 90;
                C3233w wVar2 = C3233w.this;
                int i = (int) (((float) layoutParams.width) * 1.3f);
                layoutParams.height = i;
                wVar2.f11702T = i;
                relativeLayout.setLayoutParams(layoutParams);
                LayoutParams layoutParams2 = new LayoutParams(this.f11706b.getWidth(), this.f11706b.getHeight());
                layoutParams2.gravity = BadgeDrawable.f16064b0;
                layoutParams2.setMargins(0, 220, 70, 0);
                this.f11706b.setLayoutParams(layoutParams2);
            } else {
                C3233w wVar3 = C3233w.this;
                int measuredWidth2 = (int) (((float) relativeLayout.getMeasuredWidth()) * 1.3f);
                layoutParams.height = measuredWidth2;
                wVar3.f11702T = measuredWidth2;
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (VERSION.SDK_INT >= 16) {
                C3233w.this.f11701S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3233w.this.f11701S.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.w$b */
    /* compiled from: CTInAppNativeHalfInterstitialFragment */
    class C3235b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f11708a;

        /* renamed from: b */
        final /* synthetic */ CloseImageView f11709b;

        C3235b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11708a = frameLayout;
            this.f11709b = closeImageView;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11708a.findViewById(C3058R.C3061id.half_interstitial_relative_layout);
            LayoutParams layoutParams = (LayoutParams) relativeLayout.getLayoutParams();
            if (!C3233w.this.f11150a.mo11927N() || !C3233w.this.mo12318d()) {
                if (C3233w.this.mo12318d()) {
                    layoutParams.setMargins(200, 40, 190, 0);
                    layoutParams.height = relativeLayout.getMeasuredHeight() - 40;
                    layoutParams.width = (int) (((float) layoutParams.height) * 1.3f);
                    relativeLayout.setLayoutParams(layoutParams);
                    LayoutParams layoutParams2 = new LayoutParams(this.f11709b.getWidth(), this.f11709b.getHeight());
                    layoutParams2.gravity = BadgeDrawable.f16064b0;
                    layoutParams2.setMargins(0, 20, 220, 0);
                    this.f11709b.setLayoutParams(layoutParams2);
                } else {
                    C3233w wVar = C3233w.this;
                    int measuredHeight = (int) (((float) relativeLayout.getMeasuredHeight()) * 1.3f);
                    layoutParams.width = measuredHeight;
                    wVar.f11703U = measuredHeight;
                    layoutParams.gravity = 1;
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            if (VERSION.SDK_INT >= 16) {
                C3233w.this.f11701S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C3233w.this.f11701S.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.w$c */
    /* compiled from: CTInAppNativeHalfInterstitialFragment */
    class C3236c implements OnClickListener {
        C3236c() {
        }

        public void onClick(View view) {
            C3233w.this.mo12298b((Bundle) null);
            C3233w.this.getActivity().finish();
        }
    }

    @RequiresApi(api = 17)
    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        View view;
        ArrayList arrayList = new ArrayList();
        if (!this.f11150a.mo11927N() || !mo12318d()) {
            view = layoutInflater.inflate(C3058R.layout.inapp_half_interstitial, viewGroup, false);
        } else {
            view = layoutInflater.inflate(C3058R.layout.tab_inapp_half_interstitial, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C3058R.C3061id.inapp_half_interstitial_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        this.f11701S = (RelativeLayout) frameLayout.findViewById(C3058R.C3061id.half_interstitial_relative_layout);
        this.f11701S.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        int i = this.f11147P;
        if (i == 1) {
            this.f11701S.getViewTreeObserver().addOnGlobalLayoutListener(new C3234a(frameLayout, closeImageView));
        } else if (i == 2) {
            this.f11701S.getViewTreeObserver().addOnGlobalLayoutListener(new C3235b(frameLayout, closeImageView));
        }
        if (this.f11150a.mo11930a(this.f11147P) != null) {
            CTInAppNotification cTInAppNotification = this.f11150a;
            if (cTInAppNotification.mo11933b(cTInAppNotification.mo11930a(this.f11147P)) != null) {
                ImageView imageView = (ImageView) this.f11701S.findViewById(C3058R.C3061id.backgroundImage);
                CTInAppNotification cTInAppNotification2 = this.f11150a;
                imageView.setImageBitmap(cTInAppNotification2.mo11933b(cTInAppNotification2.mo11930a(this.f11147P)));
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.f11701S.findViewById(C3058R.C3061id.half_interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(C3058R.C3061id.half_interstitial_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(C3058R.C3061id.half_interstitial_button2);
        arrayList.add(button2);
        TextView textView = (TextView) this.f11701S.findViewById(C3058R.C3061id.half_interstitial_title);
        textView.setText(this.f11150a.mo11955z());
        textView.setTextColor(Color.parseColor(this.f11150a.mo11914A()));
        TextView textView2 = (TextView) this.f11701S.findViewById(C3058R.C3061id.half_interstitial_message);
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
        closeImageView.setOnClickListener(new C3236c());
        if (!this.f11150a.mo11922I()) {
            closeImageView.setVisibility(8);
        } else {
            closeImageView.setVisibility(0);
        }
        return view;
    }
}

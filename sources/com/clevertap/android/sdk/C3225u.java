package com.clevertap.android.sdk;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.C0195i0;

/* renamed from: com.clevertap.android.sdk.u */
/* compiled from: CTInAppNativeCoverImageFragment */
public class C3225u extends C3112i {

    /* renamed from: com.clevertap.android.sdk.u$a */
    /* compiled from: CTInAppNativeCoverImageFragment */
    class C3226a implements OnClickListener {
        C3226a() {
        }

        public void onClick(View view) {
            C3225u.this.mo12298b((Bundle) null);
            C3225u.this.getActivity().finish();
        }
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3058R.layout.inapp_cover_image, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C3058R.C3061id.inapp_cover_image_frame_layout);
        frameLayout.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        ImageView imageView = (ImageView) ((RelativeLayout) frameLayout.findViewById(C3058R.C3061id.cover_image_relative_layout)).findViewById(C3058R.C3061id.cover_image);
        if (this.f11150a.mo11930a(this.f11147P) != null) {
            CTInAppNotification cTInAppNotification = this.f11150a;
            if (cTInAppNotification.mo11933b(cTInAppNotification.mo11930a(this.f11147P)) != null) {
                CTInAppNotification cTInAppNotification2 = this.f11150a;
                imageView.setImageBitmap(cTInAppNotification2.mo11933b(cTInAppNotification2.mo11930a(this.f11147P)));
                imageView.setTag(Integer.valueOf(0));
                imageView.setOnClickListener(new C3108a());
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new C3226a());
        if (!this.f11150a.mo11922I()) {
            closeImageView.setVisibility(8);
        } else {
            closeImageView.setVisibility(0);
        }
        return inflate;
    }
}

package com.clevertap.android.sdk;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* renamed from: com.clevertap.android.sdk.t */
/* compiled from: CTInAppNativeCoverFragment */
public class C3218t extends C3122k {

    /* renamed from: com.clevertap.android.sdk.t$a */
    /* compiled from: CTInAppNativeCoverFragment */
    class C3219a implements OnClickListener {
        C3219a() {
        }

        public void onClick(View view) {
            C3218t.this.mo12298b((Bundle) null);
            C3218t.this.getActivity().finish();
        }
    }

    @RequiresApi(api = 17)
    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        View inflate = layoutInflater.inflate(C3058R.layout.inapp_cover, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C3058R.C3061id.inapp_cover_frame_layout);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(C3058R.C3061id.cover_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(C3058R.C3061id.cover_linear_layout);
        Button button = (Button) linearLayout.findViewById(C3058R.C3061id.cover_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(C3058R.C3061id.cover_button2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) relativeLayout.findViewById(C3058R.C3061id.backgroundImage);
        if (this.f11150a.mo11930a(this.f11147P) != null) {
            CTInAppNotification cTInAppNotification = this.f11150a;
            if (cTInAppNotification.mo11933b(cTInAppNotification.mo11930a(this.f11147P)) != null) {
                CTInAppNotification cTInAppNotification2 = this.f11150a;
                imageView.setImageBitmap(cTInAppNotification2.mo11933b(cTInAppNotification2.mo11930a(this.f11147P)));
                imageView.setTag(Integer.valueOf(0));
                imageView.setOnClickListener(new C3108a());
            }
        }
        TextView textView = (TextView) relativeLayout.findViewById(C3058R.C3061id.cover_title);
        textView.setText(this.f11150a.mo11955z());
        textView.setTextColor(Color.parseColor(this.f11150a.mo11914A()));
        TextView textView2 = (TextView) relativeLayout.findViewById(C3058R.C3061id.cover_message);
        textView2.setText(this.f11150a.mo11951w());
        textView2.setTextColor(Color.parseColor(this.f11150a.mo11953x()));
        ArrayList j = this.f11150a.mo11938j();
        if (j.size() == 1) {
            int i = this.f11147P;
            if (i == 2) {
                button.setVisibility(8);
            } else if (i == 1) {
                button.setVisibility(4);
            }
            mo12337a(button2, (CTInAppNotificationButton) j.get(0), 0);
        } else if (!j.isEmpty()) {
            for (int i2 = 0; i2 < j.size(); i2++) {
                if (i2 < 2) {
                    mo12337a((Button) arrayList.get(i2), (CTInAppNotificationButton) j.get(i2), i2);
                }
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new C3219a());
        if (!this.f11150a.mo11922I()) {
            closeImageView.setVisibility(8);
        } else {
            closeImageView.setVisibility(0);
        }
        return inflate;
    }
}

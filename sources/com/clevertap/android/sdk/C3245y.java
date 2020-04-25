package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
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

/* renamed from: com.clevertap.android.sdk.y */
/* compiled from: CTInAppNativeHeaderFragment */
public class C3245y extends C3138n {

    /* renamed from: com.clevertap.android.sdk.y$a */
    /* compiled from: CTInAppNativeHeaderFragment */
    class C3246a implements OnTouchListener {
        C3246a() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C3245y.this.f11210T.onTouchEvent(motionEvent);
            return true;
        }
    }

    @RequiresApi(api = 17)
    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        this.f11209S = layoutInflater.inflate(C3058R.layout.inapp_header, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) this.f11209S.findViewById(C3058R.C3061id.header_frame_layout)).findViewById(C3058R.C3061id.header_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11150a.mo11935c()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(C3058R.C3061id.header_linear_layout_1);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(C3058R.C3061id.header_linear_layout_2);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(C3058R.C3061id.header_linear_layout_3);
        Button button = (Button) linearLayout3.findViewById(C3058R.C3061id.header_button_1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(C3058R.C3061id.header_button_2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) linearLayout.findViewById(C3058R.C3061id.header_icon);
        if (!this.f11150a.mo11950v().isEmpty()) {
            CTInAppNotification cTInAppNotification = this.f11150a;
            Bitmap b = cTInAppNotification.mo11933b((CTInAppNotificationMedia) cTInAppNotification.mo11950v().get(0));
            if (b != null) {
                imageView.setImageBitmap(b);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) linearLayout2.findViewById(C3058R.C3061id.header_title);
        textView.setText(this.f11150a.mo11955z());
        textView.setTextColor(Color.parseColor(this.f11150a.mo11914A()));
        TextView textView2 = (TextView) linearLayout2.findViewById(C3058R.C3061id.header_message);
        textView2.setText(this.f11150a.mo11951w());
        textView2.setTextColor(Color.parseColor(this.f11150a.mo11953x()));
        ArrayList j = this.f11150a.mo11938j();
        if (j != null && !j.isEmpty()) {
            for (int i = 0; i < j.size(); i++) {
                if (i < 2) {
                    mo12402a((Button) arrayList.get(i), (CTInAppNotificationButton) j.get(i), this.f11150a, i);
                }
            }
        }
        if (this.f11150a.mo11937i() == 1) {
            mo12401a(button, button2);
        }
        this.f11209S.setOnTouchListener(new C3246a());
        return this.f11209S;
    }
}

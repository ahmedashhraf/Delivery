package com.clevertap.android.sdk;

import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;

/* renamed from: com.clevertap.android.sdk.k */
/* compiled from: CTInAppBaseFullNativeFragment */
public abstract class C3122k extends C3112i {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12337a(Button button, CTInAppNotificationButton cTInAppNotificationButton, int i) {
        ShapeDrawable shapeDrawable;
        ShapeDrawable shapeDrawable2;
        Button button2 = button;
        if (cTInAppNotificationButton != null) {
            button2.setVisibility(0);
            button2.setTag(Integer.valueOf(i));
            button2.setText(cTInAppNotificationButton.mo11979l());
            button2.setTextColor(Color.parseColor(cTInAppNotificationButton.mo11980m()));
            button2.setOnClickListener(new C3108a());
            if (!cTInAppNotificationButton.mo11976i().isEmpty()) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f}, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                shapeDrawable.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.mo11966b()));
                shapeDrawable.getPaint().setStyle(Style.FILL);
                shapeDrawable.getPaint().setAntiAlias(true);
                shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f}, null, new float[]{Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f, Float.parseFloat(cTInAppNotificationButton.mo11976i()) * (480.0f / ((float) mo12338e())) * 2.0f}));
            } else {
                shapeDrawable2 = null;
                shapeDrawable = null;
            }
            if (!cTInAppNotificationButton.mo11968c().isEmpty() && shapeDrawable2 != null) {
                shapeDrawable2.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.mo11968c()));
                shapeDrawable2.setPadding(1, 1, 1, 1);
                shapeDrawable2.getPaint().setStyle(Style.FILL);
            }
            if (shapeDrawable != null) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
                if (VERSION.SDK_INT >= 16) {
                    button2.setBackground(layerDrawable);
                } else {
                    button2.setBackgroundDrawable(layerDrawable);
                }
            }
        } else {
            button2.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo12338e() {
        WindowManager windowManager = (WindowManager) getActivity().getBaseContext().getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }
}

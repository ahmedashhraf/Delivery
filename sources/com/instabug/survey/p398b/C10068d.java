package com.instabug.survey.p398b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.InstabugLogoProvider;
import com.instabug.survey.C10049R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.d */
/* compiled from: PowerbyInstabugfooterUtils */
public class C10068d {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26797a;

    /* renamed from: a */
    public static void m46832a(@C0193h0 Context context, View view) {
        boolean[] a = m46834a();
        if (view == null) {
            a[1] = true;
        } else {
            a[2] = true;
            view.findViewById(C10049R.C10053id.instabug_pbi_container).setVisibility(0);
            a[3] = true;
            View findViewById = view.findViewById(C10049R.C10053id.instabug_pbi_container);
            a[4] = true;
            int backgroundColor = AttrResolver.getBackgroundColor(context);
            a[5] = true;
            findViewById.setBackgroundColor(backgroundColor);
            a[6] = true;
            TextView textView = (TextView) view.findViewById(C10049R.C10053id.text_view_pb);
            a[7] = true;
            ImageView imageView = (ImageView) view.findViewById(C10049R.C10053id.image_instabug_logo);
            a[8] = true;
            imageView.setImageBitmap(InstabugLogoProvider.getInstabugLogo());
            a[9] = true;
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
                a[10] = true;
                imageView.setColorFilter(Color.parseColor("#FFFFFF"), Mode.SRC_ATOP);
                a[11] = true;
                textView.setTextColor(C0841b.m4915a(context, 17170443));
                a[12] = true;
            } else {
                imageView.setColorFilter(C0841b.m4915a(context, C10049R.C10051color.instabug_survey_pbi_color), Mode.SRC_ATOP);
                a[13] = true;
                textView.setTextColor(C0841b.m4915a(context, C10049R.C10051color.instabug_survey_pbi_color));
                a[14] = true;
            }
        }
        a[15] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46834a() {
        boolean[] zArr = f26797a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5453429813656793853L, "com/instabug/survey/utils/PowerbyInstabugfooterUtils", 20);
        f26797a = a;
        return a;
    }

    /* renamed from: a */
    public static void m46833a(View view) {
        boolean[] a = m46834a();
        if (view == null) {
            a[16] = true;
        } else {
            a[17] = true;
            view.findViewById(C10049R.C10053id.instabug_pbi_container).setVisibility(8);
            a[18] = true;
        }
        a[19] = true;
    }
}

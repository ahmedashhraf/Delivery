package com.instabug.survey.p398b;

import android.widget.TextView;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.h */
/* compiled from: TextSizeCalculator */
public class C10075h {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26807a;

    /* renamed from: com.instabug.survey.b.h$a */
    /* compiled from: TextSizeCalculator */
    static class C10076a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26808b;

        /* renamed from: a */
        final /* synthetic */ TextView f26809a;

        C10076a(TextView textView) {
            boolean[] a = m46878a();
            this.f26809a = textView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46878a() {
            boolean[] zArr = f26808b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4963291731765656005L, "com/instabug/survey/utils/TextSizeCalculator$1", 11);
            f26808b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46878a();
            if (this.f26809a.getLineCount() > 2) {
                a[1] = true;
                this.f26809a.setTextSize(2, 16.0f);
                a[2] = true;
                this.f26809a.setLineSpacing(1.0f, 1.1f);
                a[3] = true;
                this.f26809a.setMaxLines(2);
                a[4] = true;
            } else if (this.f26809a.getLineCount() <= 1) {
                a[5] = true;
            } else {
                a[6] = true;
                this.f26809a.setTextSize(2, 17.0f);
                a[7] = true;
                this.f26809a.setLineSpacing(1.0f, 1.1f);
                a[8] = true;
                this.f26809a.setMaxLines(2);
                a[9] = true;
            }
            a[10] = true;
        }
    }

    /* renamed from: a */
    public static void m46875a(TextView textView) {
        boolean[] a = m46876a();
        if (InstabugDeviceProperties.isTablet(textView.getContext())) {
            a[1] = true;
            textView.setTextSize(2, 18.0f);
            a[2] = true;
            textView.setLineSpacing(1.0f, 1.2f);
            a[3] = true;
            textView.setMaxLines(4);
            a[4] = true;
        } else if (textView.getText().toString().length() > 150) {
            a[5] = true;
            textView.setTextSize(2, 15.0f);
            a[6] = true;
            textView.setLineSpacing(1.0f, 1.1f);
            a[7] = true;
            textView.setMaxLines(5);
            a[8] = true;
        } else if (textView.getText().toString().length() > 100) {
            a[9] = true;
            textView.setTextSize(2, 16.0f);
            a[10] = true;
            textView.setLineSpacing(1.0f, 1.2f);
            a[11] = true;
            textView.setMaxLines(4);
            a[12] = true;
        } else if (textView.getText().toString().length() < 150) {
            a[13] = true;
            textView.post(new C10076a(textView));
            a[14] = true;
        } else {
            textView.setTextSize(2, 18.0f);
            a[15] = true;
            textView.setLineSpacing(1.0f, 1.2f);
            a[16] = true;
            textView.setMaxLines(4);
            a[17] = true;
        }
        a[18] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46876a() {
        boolean[] zArr = f26807a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-927321868476943450L, "com/instabug/survey/utils/TextSizeCalculator", 33);
        f26807a = a;
        return a;
    }

    /* renamed from: b */
    public static void m46877b(TextView textView) {
        boolean[] a = m46876a();
        if (InstabugDeviceProperties.isTablet(textView.getContext())) {
            a[19] = true;
            textView.setTextSize(2, 15.0f);
            a[20] = true;
            textView.setLineSpacing(1.0f, 1.2f);
            a[21] = true;
            textView.setMaxLines(4);
            a[22] = true;
        } else if (textView.getText().toString().length() >= 150) {
            a[23] = true;
            textView.setTextSize(2, 12.0f);
            a[24] = true;
            textView.setLineSpacing(1.0f, 1.1f);
            a[25] = true;
            textView.setMaxLines(5);
            a[26] = true;
        } else if (textView.getText().toString().length() < 100) {
            a[27] = true;
        } else {
            a[28] = true;
            textView.setTextSize(2, 14.0f);
            a[29] = true;
            textView.setLineSpacing(1.0f, 1.2f);
            a[30] = true;
            textView.setMaxLines(4);
            a[31] = true;
        }
        a[32] = true;
    }
}

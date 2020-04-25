package com.instabug.featuresrequest.p370c;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.instabug.library.Instabug;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.featuresrequest.c.j */
/* compiled from: TextViewUtils */
public class C9548j {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25244a;

    /* renamed from: com.instabug.featuresrequest.c.j$a */
    /* compiled from: TextViewUtils */
    static class C9549a extends C9551c {

        /* renamed from: S */
        private static transient /* synthetic */ boolean[] f25245S;

        /* renamed from: N */
        final /* synthetic */ String f25246N;

        /* renamed from: O */
        final /* synthetic */ String f25247O;

        /* renamed from: P */
        final /* synthetic */ String f25248P;

        /* renamed from: Q */
        final /* synthetic */ boolean f25249Q;

        /* renamed from: R */
        final /* synthetic */ Runnable f25250R;

        /* renamed from: b */
        final /* synthetic */ TextView f25251b;

        C9549a(TextView textView, String str, String str2, String str3, boolean z, Runnable runnable) {
            boolean[] a = m44654a();
            this.f25251b = textView;
            this.f25246N = str;
            this.f25247O = str2;
            this.f25248P = str3;
            this.f25249Q = z;
            this.f25250R = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44654a() {
            boolean[] zArr = f25245S;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-806553137475668419L, "com/instabug/featuresrequest/utils/TextViewUtils$1", 7);
            f25245S = a;
            return a;
        }

        public void onClick(View view) {
            boolean z;
            boolean[] a = m44654a();
            TextView textView = this.f25251b;
            String str = this.f25246N;
            String str2 = this.f25247O;
            String str3 = this.f25248P;
            if (!this.f25249Q) {
                a[1] = true;
                z = true;
            } else {
                z = false;
                a[2] = true;
            }
            C9548j.m44652a(textView, str, str2, str3, z, this.f25250R);
            Runnable runnable = this.f25250R;
            if (runnable == null) {
                a[3] = true;
            } else {
                a[4] = true;
                runnable.run();
                a[5] = true;
            }
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.c.j$b */
    /* compiled from: TextViewUtils */
    static class C9550b extends C9551c {

        /* renamed from: S */
        private static transient /* synthetic */ boolean[] f25252S;

        /* renamed from: N */
        final /* synthetic */ String f25253N;

        /* renamed from: O */
        final /* synthetic */ String f25254O;

        /* renamed from: P */
        final /* synthetic */ String f25255P;

        /* renamed from: Q */
        final /* synthetic */ boolean f25256Q;

        /* renamed from: R */
        final /* synthetic */ Runnable f25257R;

        /* renamed from: b */
        final /* synthetic */ TextView f25258b;

        C9550b(TextView textView, String str, String str2, String str3, boolean z, Runnable runnable) {
            boolean[] a = m44655a();
            this.f25258b = textView;
            this.f25253N = str;
            this.f25254O = str2;
            this.f25255P = str3;
            this.f25256Q = z;
            this.f25257R = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44655a() {
            boolean[] zArr = f25252S;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1149607275895596899L, "com/instabug/featuresrequest/utils/TextViewUtils$2", 7);
            f25252S = a;
            return a;
        }

        public void onClick(View view) {
            boolean z;
            boolean[] a = m44655a();
            TextView textView = this.f25258b;
            String str = this.f25253N;
            String str2 = this.f25254O;
            String str3 = this.f25255P;
            if (!this.f25256Q) {
                a[1] = true;
                z = true;
            } else {
                z = false;
                a[2] = true;
            }
            C9548j.m44652a(textView, str, str2, str3, z, this.f25257R);
            Runnable runnable = this.f25257R;
            if (runnable == null) {
                a[3] = true;
            } else {
                a[4] = true;
                runnable.run();
                a[5] = true;
            }
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.c.j$c */
    /* compiled from: TextViewUtils */
    public static class C9551c extends ClickableSpan {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25259a;

        public C9551c() {
            m44656a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44656a() {
            boolean[] zArr = f25259a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7116385121680678945L, "com/instabug/featuresrequest/utils/TextViewUtils$MoreLessSpannable", 3);
            f25259a = a;
            return a;
        }

        public void onClick(View view) {
            m44656a()[2] = true;
        }

        public void updateDrawState(TextPaint textPaint) {
            boolean[] a = m44656a();
            textPaint.setUnderlineText(false);
            a[1] = true;
        }
    }

    /* renamed from: a */
    public static void m44652a(TextView textView, String str, String str2, @C0193h0 String str3, boolean z, @C0195i0 Runnable runnable) {
        TextView textView2 = textView;
        String str4 = str;
        boolean[] a = m44653a();
        if (textView.getTag() != null) {
            a[1] = true;
        } else {
            a[2] = true;
            textView2.setTag(textView.getText());
            a[3] = true;
        }
        if (str.length() < 170) {
            a[4] = true;
            textView.setText(str);
            a[5] = true;
            return;
        }
        if (z) {
            a[6] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(str4.substring(0, C13959t.f40792G2));
            sb.append("... ");
            sb.append(str2);
            String sb2 = sb.toString();
            a[7] = true;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            a[8] = true;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Instabug.getPrimaryColor());
            a[9] = true;
            int length = sb2.length() - str2.length();
            a[10] = true;
            int length2 = sb2.length();
            a[11] = true;
            spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 33);
            a[12] = true;
            C9549a aVar = new C9549a(textView, str, str2, str3, z, runnable);
            a[13] = true;
            int length3 = sb2.length() - str2.length();
            int length4 = sb2.length();
            a[14] = true;
            spannableStringBuilder.setSpan(aVar, length3, length4, 33);
            a[15] = true;
            textView2.setText(spannableStringBuilder);
            a[16] = true;
        } else {
            String str5 = str2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(C3868i.f12248b);
            sb3.append(str3);
            String sb4 = sb3.toString();
            a[17] = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb4);
            a[18] = true;
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(Instabug.getPrimaryColor());
            a[19] = true;
            int length5 = sb4.length() - str3.length();
            a[20] = true;
            int length6 = sb4.length();
            a[21] = true;
            spannableStringBuilder2.setSpan(foregroundColorSpan2, length5, length6, 33);
            a[22] = true;
            C9550b bVar = new C9550b(textView, str, str2, str3, z, runnable);
            a[23] = true;
            int length7 = sb4.length() - str3.length();
            int length8 = sb4.length();
            a[24] = true;
            spannableStringBuilder2.setSpan(bVar, length7, length8, 33);
            a[25] = true;
            textView2.setText(spannableStringBuilder2);
            a[26] = true;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        a[27] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44653a() {
        boolean[] zArr = f25244a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1252778069034018473L, "com/instabug/featuresrequest/utils/TextViewUtils", 28);
        f25244a = a;
        return a;
    }
}

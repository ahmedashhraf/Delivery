package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.Display;
import android.widget.TextView;
import androidx.browser.p013a.C0591c;
import androidx.browser.p013a.C0591c.C0592a;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.payment.token.Card;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.k0 */
class C11868k0 {
    /* renamed from: a */
    static int m53351a(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: a */
    private static SpannableString m53352a(Context context, String str) {
        URLSpan[] uRLSpanArr;
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(str));
        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            valueOf.removeSpan(uRLSpan);
            valueOf.setSpan(new C11869l(context, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return valueOf;
    }

    /* renamed from: a */
    static C0591c m53353a(Context context) {
        C0592a aVar = new C0592a();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C11771R.attr.headerBackground, typedValue, true);
        aVar.mo3043b(typedValue.data);
        aVar.mo3044b(context, C11771R.anim.opp_slide_in_right, C11771R.anim.opp_slide_out_left);
        aVar.mo3036a(context, 17432578, 17432579);
        return aVar.mo3046b();
    }

    /* renamed from: a */
    static String m53354a(double d, String str) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance(str));
        currencyInstance.setMaximumFractionDigits(2);
        return currencyInstance.format(d);
    }

    /* renamed from: a */
    static String m53355a(Card card) {
        String b = card.mo40994b();
        String c = card.mo40995c();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("/");
        sb.append(c.substring(c.length() - 2, c.length()));
        return sb.toString();
    }

    /* renamed from: a */
    static String m53356a(String str) {
        String[] split;
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR)) {
            if (str2.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                if (str2.length() >= 2) {
                    sb.append(str2.charAt(0));
                    str2 = str2.substring(1).toLowerCase();
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m53357a(String str, String str2) {
        return String.format("<a target='_blank' href='%s'>%s</a>", new Object[]{str2, str});
    }

    /* renamed from: a */
    static void m53358a(Context context, TextView textView, String str) {
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(m53352a(context, str));
    }

    /* renamed from: b */
    static String m53359b(String str) {
        StringBuilder sb;
        String str2 = "• ";
        if (str.length() <= 4) {
            sb = new StringBuilder();
            sb.append(str2);
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = str.substring(str.length() - 4, str.length());
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    static String m53360c(String str) {
        if (str.length() <= 8) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 4));
        sb.append(" •••• ");
        sb.append(str.substring(str.length() - 4, str.length()));
        return sb.toString();
    }
}

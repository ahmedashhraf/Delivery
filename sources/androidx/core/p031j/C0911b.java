package androidx.core.p031j;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

@SuppressLint({"InlinedApi"})
/* renamed from: androidx.core.j.b */
/* compiled from: HtmlCompat */
public final class C0911b {

    /* renamed from: a */
    public static final int f4158a = 0;

    /* renamed from: b */
    public static final int f4159b = 1;

    /* renamed from: c */
    public static final int f4160c = 1;

    /* renamed from: d */
    public static final int f4161d = 2;

    /* renamed from: e */
    public static final int f4162e = 4;

    /* renamed from: f */
    public static final int f4163f = 8;

    /* renamed from: g */
    public static final int f4164g = 16;

    /* renamed from: h */
    public static final int f4165h = 32;

    /* renamed from: i */
    public static final int f4166i = 256;

    /* renamed from: j */
    public static final int f4167j = 0;

    /* renamed from: k */
    public static final int f4168k = 63;

    private C0911b() {
    }

    @C0193h0
    /* renamed from: a */
    public static Spanned m5250a(@C0193h0 String str, int i) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }

    @C0193h0
    /* renamed from: a */
    public static Spanned m5251a(@C0193h0 String str, int i, @C0195i0 ImageGetter imageGetter, @C0195i0 TagHandler tagHandler) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }
        return Html.fromHtml(str, imageGetter, tagHandler);
    }

    @C0193h0
    /* renamed from: a */
    public static String m5252a(@C0193h0 Spanned spanned, int i) {
        if (VERSION.SDK_INT >= 24) {
            return Html.toHtml(spanned, i);
        }
        return Html.toHtml(spanned);
    }
}

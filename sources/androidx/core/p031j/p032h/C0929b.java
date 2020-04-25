package androidx.core.p031j.p032h;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0939g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.core.j.h.b */
/* compiled from: LinkifyCompat */
public final class C0929b {

    /* renamed from: a */
    private static final String[] f4233a = new String[0];

    /* renamed from: b */
    private static final Comparator<C0931b> f4234b = new C0930a();

    /* renamed from: androidx.core.j.h.b$a */
    /* compiled from: LinkifyCompat */
    static class C0930a implements Comparator<C0931b> {
        C0930a() {
        }

        /* renamed from: a */
        public int compare(C0931b bVar, C0931b bVar2) {
            int i = bVar.f4237c;
            int i2 = bVar2.f4237c;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = bVar.f4238d;
            int i4 = bVar2.f4238d;
            if (i3 < i4) {
                return 1;
            }
            if (i3 > i4) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.j.h.b$b */
    /* compiled from: LinkifyCompat */
    private static class C0931b {

        /* renamed from: a */
        URLSpan f4235a;

        /* renamed from: b */
        String f4236b;

        /* renamed from: c */
        int f4237c;

        /* renamed from: d */
        int f4238d;

        C0931b() {
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.j.h.b$c */
    /* compiled from: LinkifyCompat */
    public @interface C0932c {
    }

    private C0929b() {
    }

    /* renamed from: a */
    public static boolean m5308a(@C0193h0 Spannable spannable, int i) {
        if (m5307a()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            ArrayList arrayList2 = arrayList;
            Spannable spannable2 = spannable;
            m5306a(arrayList2, spannable2, C0939g.f4269w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, (TransformFilter) null);
        }
        if ((i & 2) != 0) {
            m5306a(arrayList, spannable, C0939g.f4245A, new String[]{"mailto:"}, (MatchFilter) null, (TransformFilter) null);
        }
        if ((i & 8) != 0) {
            m5305a(arrayList, spannable);
        }
        m5313b(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0931b bVar = (C0931b) it.next();
            if (bVar.f4235a == null) {
                m5304a(bVar.f4236b, bVar.f4237c, bVar.f4238d, spannable);
            }
        }
        return true;
    }

    /* renamed from: b */
    private static void m5313b(ArrayList<C0931b> arrayList, Spannable spannable) {
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            C0931b bVar = new C0931b();
            bVar.f4235a = uRLSpanArr[i2];
            bVar.f4237c = spannable.getSpanStart(uRLSpanArr[i2]);
            bVar.f4238d = spannable.getSpanEnd(uRLSpanArr[i2]);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f4234b);
        int size = arrayList.size();
        while (i < size - 1) {
            C0931b bVar2 = (C0931b) arrayList.get(i);
            int i3 = i + 1;
            C0931b bVar3 = (C0931b) arrayList.get(i3);
            int i4 = bVar2.f4237c;
            int i5 = bVar3.f4237c;
            if (i4 <= i5) {
                int i6 = bVar2.f4238d;
                if (i6 > i5) {
                    int i7 = bVar3.f4238d;
                    int i8 = (i7 > i6 && i6 - i4 <= i7 - i5) ? i6 - i4 < i7 - i5 ? i : -1 : i3;
                    if (i8 != -1) {
                        URLSpan uRLSpan = ((C0931b) arrayList.get(i8)).f4235a;
                        if (uRLSpan != null) {
                            spannable.removeSpan(uRLSpan);
                        }
                        arrayList.remove(i8);
                        size--;
                    }
                }
            }
            i = i3;
        }
    }

    /* renamed from: a */
    public static boolean m5312a(@C0193h0 TextView textView, int i) {
        if (m5307a()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (!m5308a((Spannable) valueOf, i)) {
                return false;
            }
            m5300a(textView);
            textView.setText(valueOf);
            return true;
        } else if (!m5308a((Spannable) text, i)) {
            return false;
        } else {
            m5300a(textView);
            return true;
        }
    }

    /* renamed from: a */
    public static void m5301a(@C0193h0 TextView textView, @C0193h0 Pattern pattern, @C0195i0 String str) {
        if (m5307a()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            m5303a(textView, pattern, str, (String[]) null, (MatchFilter) null, (TransformFilter) null);
        }
    }

    /* renamed from: a */
    public static void m5302a(@C0193h0 TextView textView, @C0193h0 Pattern pattern, @C0195i0 String str, @C0195i0 MatchFilter matchFilter, @C0195i0 TransformFilter transformFilter) {
        if (m5307a()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            m5303a(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m5303a(@C0193h0 TextView textView, @C0193h0 Pattern pattern, @C0195i0 String str, @C0195i0 String[] strArr, @C0195i0 MatchFilter matchFilter, @C0195i0 TransformFilter transformFilter) {
        if (m5307a()) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (m5311a((Spannable) valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            m5300a(textView);
        }
    }

    /* renamed from: a */
    public static boolean m5309a(@C0193h0 Spannable spannable, @C0193h0 Pattern pattern, @C0195i0 String str) {
        if (m5307a()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return m5311a(spannable, pattern, str, (String[]) null, (MatchFilter) null, (TransformFilter) null);
    }

    /* renamed from: a */
    public static boolean m5310a(@C0193h0 Spannable spannable, @C0193h0 Pattern pattern, @C0195i0 String str, @C0195i0 MatchFilter matchFilter, @C0195i0 TransformFilter transformFilter) {
        if (m5307a()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return m5311a(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m5311a(@C0193h0 Spannable spannable, @C0193h0 Pattern pattern, @C0195i0 String str, @C0195i0 String[] strArr, @C0195i0 MatchFilter matchFilter, @C0195i0 TransformFilter transformFilter) {
        String str2;
        if (m5307a()) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f4233a;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str4 = strArr[i];
            i++;
            if (str4 == null) {
                str2 = str3;
            } else {
                str2 = str4.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = str2;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) {
                m5304a(m5299a(matcher.group(0), strArr2, matcher, transformFilter), start, end, spannable);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m5307a() {
        return VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    private static void m5300a(@C0193h0 TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    private static String m5299a(@C0193h0 String str, @C0193h0 String[] strArr, Matcher matcher, @C0195i0 TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= strArr.length) {
                z = false;
                break;
            }
            if (str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr[i]);
                    sb.append(str.substring(strArr[i].length()));
                    str = sb.toString();
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strArr[0]);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static void m5306a(ArrayList<C0931b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, MatchFilter matchFilter, TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                C0931b bVar = new C0931b();
                bVar.f4236b = m5299a(matcher.group(0), strArr, matcher, transformFilter);
                bVar.f4237c = start;
                bVar.f4238d = end;
                arrayList.add(bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m5304a(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:14:0x0005, LOOP_START, PHI: r0 r6 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x0005] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5305a(java.util.ArrayList<androidx.core.p031j.p032h.C0929b.C0931b> r5, android.text.Spannable r6) {
        /*
            java.lang.String r6 = r6.toString()
            r0 = 0
        L_0x0005:
            java.lang.String r1 = m5298a(r6)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r1 == 0) goto L_0x0043
            int r2 = r6.indexOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r2 >= 0) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            androidx.core.j.h.b$b r3 = new androidx.core.j.h.b$b     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r1.length()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.f4237c = r2     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r0 = r0 + r4
            r3.f4238d = r0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r6 = r6.substring(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0005 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.append(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.f4236b = r1     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r5.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            goto L_0x0005
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p031j.p032h.C0929b.m5305a(java.util.ArrayList, android.text.Spannable):void");
    }

    /* renamed from: a */
    private static String m5298a(String str) {
        if (VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return C0927a.m5292b(str);
    }
}

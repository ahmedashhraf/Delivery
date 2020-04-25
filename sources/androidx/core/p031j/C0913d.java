package androidx.core.p031j;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0221u;
import androidx.annotation.C0222u0;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.core.p033k.C0937e;
import androidx.core.p033k.C0944i;
import androidx.core.p038os.C1072n;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: androidx.core.j.d */
/* compiled from: PrecomputedTextCompat */
public class C0913d implements Spannable {

    /* renamed from: P */
    private static final char f4172P = '\n';

    /* renamed from: Q */
    private static final Object f4173Q = new Object();
    @C0193h0
    @C0221u("sLock")

    /* renamed from: R */
    private static Executor f4174R;
    @C0193h0

    /* renamed from: N */
    private final int[] f4175N;
    @C0195i0

    /* renamed from: O */
    private final PrecomputedText f4176O;
    @C0193h0

    /* renamed from: a */
    private final Spannable f4177a;
    @C0193h0

    /* renamed from: b */
    private final C0914a f4178b;

    /* renamed from: androidx.core.j.d$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C0914a {
        @C0193h0

        /* renamed from: a */
        private final TextPaint f4179a;
        @C0195i0

        /* renamed from: b */
        private final TextDirectionHeuristic f4180b;

        /* renamed from: c */
        private final int f4181c;

        /* renamed from: d */
        private final int f4182d;

        /* renamed from: e */
        final Params f4183e = null;

        /* renamed from: androidx.core.j.d$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C0915a {
            @C0193h0

            /* renamed from: a */
            private final TextPaint f4184a;

            /* renamed from: b */
            private TextDirectionHeuristic f4185b;

            /* renamed from: c */
            private int f4186c;

            /* renamed from: d */
            private int f4187d;

            public C0915a(@C0193h0 TextPaint textPaint) {
                this.f4184a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f4186c = 1;
                    this.f4187d = 1;
                } else {
                    this.f4187d = 0;
                    this.f4186c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f4185b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f4185b = null;
                }
            }

            @RequiresApi(23)
            /* renamed from: a */
            public C0915a mo4717a(int i) {
                this.f4186c = i;
                return this;
            }

            @RequiresApi(23)
            /* renamed from: b */
            public C0915a mo4720b(int i) {
                this.f4187d = i;
                return this;
            }

            @RequiresApi(18)
            /* renamed from: a */
            public C0915a mo4718a(@C0193h0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f4185b = textDirectionHeuristic;
                return this;
            }

            @C0193h0
            /* renamed from: a */
            public C0914a mo4719a() {
                return new C0914a(this.f4184a, this.f4185b, this.f4186c, this.f4187d);
            }
        }

        C0914a(@C0193h0 TextPaint textPaint, @C0193h0 TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f4179a = textPaint;
            this.f4180b = textDirectionHeuristic;
            this.f4181c = i;
            this.f4182d = i2;
        }

        @RequiresApi(23)
        /* renamed from: a */
        public int mo4709a() {
            return this.f4181c;
        }

        @RequiresApi(23)
        /* renamed from: b */
        public int mo4711b() {
            return this.f4182d;
        }

        @RequiresApi(18)
        @C0195i0
        /* renamed from: c */
        public TextDirectionHeuristic mo4712c() {
            return this.f4180b;
        }

        @C0193h0
        /* renamed from: d */
        public TextPaint mo4713d() {
            return this.f4179a;
        }

        public boolean equals(@C0195i0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0914a)) {
                return false;
            }
            C0914a aVar = (C0914a) obj;
            if (!mo4710a(aVar)) {
                return false;
            }
            return VERSION.SDK_INT < 18 || this.f4180b == aVar.mo4712c();
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                return C0937e.m5327a(Float.valueOf(this.f4179a.getTextSize()), Float.valueOf(this.f4179a.getTextScaleX()), Float.valueOf(this.f4179a.getTextSkewX()), Float.valueOf(this.f4179a.getLetterSpacing()), Integer.valueOf(this.f4179a.getFlags()), this.f4179a.getTextLocales(), this.f4179a.getTypeface(), Boolean.valueOf(this.f4179a.isElegantTextHeight()), this.f4180b, Integer.valueOf(this.f4181c), Integer.valueOf(this.f4182d));
            } else if (i >= 21) {
                return C0937e.m5327a(Float.valueOf(this.f4179a.getTextSize()), Float.valueOf(this.f4179a.getTextScaleX()), Float.valueOf(this.f4179a.getTextSkewX()), Float.valueOf(this.f4179a.getLetterSpacing()), Integer.valueOf(this.f4179a.getFlags()), this.f4179a.getTextLocale(), this.f4179a.getTypeface(), Boolean.valueOf(this.f4179a.isElegantTextHeight()), this.f4180b, Integer.valueOf(this.f4181c), Integer.valueOf(this.f4182d));
            } else if (i >= 18) {
                return C0937e.m5327a(Float.valueOf(this.f4179a.getTextSize()), Float.valueOf(this.f4179a.getTextScaleX()), Float.valueOf(this.f4179a.getTextSkewX()), Integer.valueOf(this.f4179a.getFlags()), this.f4179a.getTextLocale(), this.f4179a.getTypeface(), this.f4180b, Integer.valueOf(this.f4181c), Integer.valueOf(this.f4182d));
            } else if (i >= 17) {
                return C0937e.m5327a(Float.valueOf(this.f4179a.getTextSize()), Float.valueOf(this.f4179a.getTextScaleX()), Float.valueOf(this.f4179a.getTextSkewX()), Integer.valueOf(this.f4179a.getFlags()), this.f4179a.getTextLocale(), this.f4179a.getTypeface(), this.f4180b, Integer.valueOf(this.f4181c), Integer.valueOf(this.f4182d));
            } else {
                return C0937e.m5327a(Float.valueOf(this.f4179a.getTextSize()), Float.valueOf(this.f4179a.getTextScaleX()), Float.valueOf(this.f4179a.getTextSkewX()), Integer.valueOf(this.f4179a.getFlags()), this.f4179a.getTypeface(), this.f4180b, Integer.valueOf(this.f4181c), Integer.valueOf(this.f4182d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.f4179a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.f4179a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.f4179a.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.f4179a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.f4179a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            int i = VERSION.SDK_INT;
            String str = ", textLocale=";
            if (i >= 24) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.f4179a.getTextLocales());
                sb.append(sb7.toString());
            } else if (i >= 17) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(this.f4179a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(", typeface=");
            sb9.append(this.f4179a.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(", variationSettings=");
                sb10.append(this.f4179a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(", textDir=");
            sb11.append(this.f4180b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(", breakStrategy=");
            sb12.append(this.f4181c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(", hyphenationFrequency=");
            sb13.append(this.f4182d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public boolean mo4710a(@C0193h0 C0914a aVar) {
            Params params = this.f4183e;
            if (params != null) {
                return params.equals(aVar.f4183e);
            }
            if ((VERSION.SDK_INT >= 23 && (this.f4181c != aVar.mo4709a() || this.f4182d != aVar.mo4711b())) || this.f4179a.getTextSize() != aVar.mo4713d().getTextSize() || this.f4179a.getTextScaleX() != aVar.mo4713d().getTextScaleX() || this.f4179a.getTextSkewX() != aVar.mo4713d().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f4179a.getLetterSpacing() != aVar.mo4713d().getLetterSpacing() || !TextUtils.equals(this.f4179a.getFontFeatureSettings(), aVar.mo4713d().getFontFeatureSettings()))) || this.f4179a.getFlags() != aVar.mo4713d().getFlags()) {
                return false;
            }
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f4179a.getTextLocales().equals(aVar.mo4713d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f4179a.getTextLocale().equals(aVar.mo4713d().getTextLocale())) {
                return false;
            }
            if (this.f4179a.getTypeface() == null) {
                if (aVar.mo4713d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f4179a.getTypeface().equals(aVar.mo4713d().getTypeface())) {
                return false;
            }
            return true;
        }

        @RequiresApi(28)
        public C0914a(@C0193h0 Params params) {
            this.f4179a = params.getTextPaint();
            this.f4180b = params.getTextDirection();
            this.f4181c = params.getBreakStrategy();
            this.f4182d = params.getHyphenationFrequency();
        }
    }

    /* renamed from: androidx.core.j.d$b */
    /* compiled from: PrecomputedTextCompat */
    private static class C0916b extends FutureTask<C0913d> {

        /* renamed from: androidx.core.j.d$b$a */
        /* compiled from: PrecomputedTextCompat */
        private static class C0917a implements Callable<C0913d> {

            /* renamed from: a */
            private C0914a f4188a;

            /* renamed from: b */
            private CharSequence f4189b;

            C0917a(@C0193h0 C0914a aVar, @C0193h0 CharSequence charSequence) {
                this.f4188a = aVar;
                this.f4189b = charSequence;
            }

            public C0913d call() throws Exception {
                return C0913d.m5256a(this.f4189b, this.f4188a);
            }
        }

        C0916b(@C0193h0 C0914a aVar, @C0193h0 CharSequence charSequence) {
            super(new C0917a(aVar, charSequence));
        }
    }

    private C0913d(@C0193h0 CharSequence charSequence, @C0193h0 C0914a aVar, @C0193h0 int[] iArr) {
        this.f4177a = new SpannableString(charSequence);
        this.f4178b = aVar;
        this.f4175N = iArr;
        this.f4176O = null;
    }

    /* renamed from: a */
    public static C0913d m5256a(@C0193h0 CharSequence charSequence, @C0193h0 C0914a aVar) {
        C0944i.m5337a(charSequence);
        C0944i.m5337a(aVar);
        try {
            C1072n.m6199a("PrecomputedText");
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, f4172P, i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (VERSION.SDK_INT >= 23) {
                Builder.obtain(charSequence, 0, charSequence.length(), aVar.mo4713d(), Integer.MAX_VALUE).setBreakStrategy(aVar.mo4709a()).setHyphenationFrequency(aVar.mo4711b()).setTextDirection(aVar.mo4712c()).build();
            } else if (VERSION.SDK_INT >= 21) {
                new StaticLayout(charSequence, aVar.mo4713d(), Integer.MAX_VALUE, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new C0913d(charSequence, aVar, iArr);
        } finally {
            C1072n.m6198a();
        }
    }

    @C0193h0
    /* renamed from: b */
    public C0914a mo4696b() {
        return this.f4178b;
    }

    @RequiresApi(28)
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: c */
    public PrecomputedText mo4697c() {
        Spannable spannable = this.f4177a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f4177a.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f4177a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f4177a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f4177a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f4177a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f4177a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4177a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f4177a.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f4177a.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f4177a.subSequence(i, i2);
    }

    public String toString() {
        return this.f4177a.toString();
    }

    @C0237z(from = 0)
    /* renamed from: b */
    public int mo4695b(@C0237z(from = 0) int i) {
        C0944i.m5335a(i, 0, mo4693a(), "paraIndex");
        if (i == 0) {
            return 0;
        }
        return this.f4175N[i - 1];
    }

    @RequiresApi(28)
    private C0913d(@C0193h0 PrecomputedText precomputedText, @C0193h0 C0914a aVar) {
        this.f4177a = precomputedText;
        this.f4178b = aVar;
        this.f4175N = null;
        this.f4176O = null;
    }

    @C0237z(from = 0)
    /* renamed from: a */
    public int mo4693a() {
        return this.f4175N.length;
    }

    @C0237z(from = 0)
    /* renamed from: a */
    public int mo4694a(@C0237z(from = 0) int i) {
        C0944i.m5335a(i, 0, mo4693a(), "paraIndex");
        return this.f4175N[i];
    }

    @C0222u0
    /* renamed from: a */
    public static Future<C0913d> m5257a(@C0193h0 CharSequence charSequence, @C0193h0 C0914a aVar, @C0195i0 Executor executor) {
        C0916b bVar = new C0916b(aVar, charSequence);
        if (executor == null) {
            synchronized (f4173Q) {
                if (f4174R == null) {
                    f4174R = Executors.newFixedThreadPool(1);
                }
                executor = f4174R;
            }
        }
        executor.execute(bVar);
        return bVar;
    }
}

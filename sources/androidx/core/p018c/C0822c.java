package androidx.core.p018c;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.core.p033k.C0938f;

/* renamed from: androidx.core.c.c */
/* compiled from: PaintCompat */
public final class C0822c {

    /* renamed from: a */
    private static final String f3909a = "󟿽";

    /* renamed from: b */
    private static final String f3910b = "m";

    /* renamed from: c */
    private static final ThreadLocal<C0938f<Rect, Rect>> f3911c = new ThreadLocal<>();

    private C0822c() {
    }

    /* renamed from: a */
    public static boolean m4813a(@C0193h0 Paint paint, @C0193h0 String str) {
        if (VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        String str2 = f3909a;
        float measureText = paint.measureText(str2);
        float measureText2 = paint.measureText(f3910b);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C0938f a = m4812a();
        paint.getTextBounds(str2, 0, 2, (Rect) a.f4243a);
        paint.getTextBounds(str, 0, length, (Rect) a.f4244b);
        return !((Rect) a.f4243a).equals(a.f4244b);
    }

    /* renamed from: a */
    private static C0938f<Rect, Rect> m4812a() {
        C0938f<Rect, Rect> fVar = (C0938f) f3911c.get();
        if (fVar == null) {
            C0938f<Rect, Rect> fVar2 = new C0938f<>(new Rect(), new Rect());
            f3911c.set(fVar2);
            return fVar2;
        }
        ((Rect) fVar.f4243a).setEmpty();
        ((Rect) fVar.f4244b).setEmpty();
        return fVar;
    }
}

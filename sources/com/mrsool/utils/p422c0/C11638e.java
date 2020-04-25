package com.mrsool.utils.p422c0;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;

/* renamed from: com.mrsool.utils.c0.e */
/* compiled from: Typefaces */
public final class C11638e {

    /* renamed from: a */
    private static final String f33038a = "Typefaces";

    /* renamed from: b */
    private static final Hashtable<String, Typeface> f33039b = new Hashtable<>();

    private C11638e() {
    }

    /* renamed from: a */
    public static Typeface m52468a(Context context, String str) {
        Typeface typeface;
        synchronized (f33039b) {
            if (!f33039b.containsKey(str)) {
                try {
                    f33039b.put(str, Typeface.createFromAsset(context.getAssets(), str));
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not get typeface '");
                    sb.append(str);
                    sb.append("' because ");
                    sb.append(e.getMessage());
                    sb.toString();
                    return null;
                }
            }
            typeface = (Typeface) f33039b.get(str);
        }
        return typeface;
    }
}

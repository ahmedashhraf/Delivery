package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.view.b */
class C11913b {

    /* renamed from: a */
    private static HashMap<String, Typeface> f34380a = new HashMap<>();

    /* renamed from: a */
    static Typeface m53571a(Context context, String str) {
        return f34380a.containsKey(str) ? (Typeface) f34380a.get(str) : m53572b(context, str);
    }

    /* renamed from: b */
    private static Typeface m53572b(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s.ttf", new Object[]{str}));
            f34380a.put(str, createFromAsset);
            return createFromAsset;
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.google.android.play.core.missingsplits;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.missingsplits.c */
public class C5771c {

    /* renamed from: a */
    private static final AtomicReference<Boolean> f16624a = new AtomicReference<>(null);

    /* renamed from: a */
    public static C5770b m25322a(Context context) {
        return new C7155e(context, Runtime.getRuntime(), new C7154d(context, context.getPackageManager()), f16624a);
    }
}

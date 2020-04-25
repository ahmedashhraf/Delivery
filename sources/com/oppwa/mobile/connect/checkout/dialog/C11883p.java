package com.oppwa.mobile.connect.checkout.dialog;

import android.graphics.Bitmap;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.LruCache;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.p */
public class C11883p extends LruCache<String, Bitmap> {

    /* renamed from: a */
    private static C11883p f34318a;

    /* renamed from: b */
    private static final int f34319b = ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.f473h0));

    /* renamed from: c */
    private static final int f34320c = (f34319b / 8);

    C11883p(int i) {
        super(i);
    }

    /* renamed from: a */
    public static C11883p m53431a() {
        if (f34318a == null) {
            f34318a = new C11883p(f34320c);
        }
        return f34318a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int sizeOf(String str, Bitmap bitmap) {
        return bitmap.getByteCount() / 1024;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo40531a(String str) {
        return (Bitmap) get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40532b(String str, Bitmap bitmap) {
        if (mo40531a(str) == null) {
            put(str, bitmap);
        }
    }
}

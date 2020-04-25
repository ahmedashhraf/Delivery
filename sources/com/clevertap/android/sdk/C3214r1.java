package com.clevertap.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import androidx.annotation.C0193h0;

/* renamed from: com.clevertap.android.sdk.r1 */
/* compiled from: SimpleBitmapProvider */
public class C3214r1 implements C3069a {
    @C0193h0
    /* renamed from: a */
    public Bitmap mo12204a(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: a */
    public void mo12206a(byte[] bArr) {
    }

    /* renamed from: a */
    public void mo12207a(int[] iArr) {
    }

    /* renamed from: b */
    public byte[] mo12209b(int i) {
        return new byte[i];
    }

    /* renamed from: a */
    public void mo12205a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: a */
    public int[] mo12208a(int i) {
        return new int[i];
    }
}

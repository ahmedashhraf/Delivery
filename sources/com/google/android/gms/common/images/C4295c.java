package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.C4311d;
import p076c.p112d.p113a.p114a.p118d.p121c.C2604j;

/* renamed from: com.google.android.gms.common.images.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4295c {

    /* renamed from: a */
    final C4294b f13326a;

    /* renamed from: b */
    private int f13327b = 0;

    /* renamed from: c */
    protected int f13328c = 0;

    /* renamed from: d */
    private boolean f13329d = false;

    /* renamed from: e */
    private boolean f13330e = true;

    /* renamed from: f */
    private boolean f13331f = false;

    /* renamed from: g */
    private boolean f13332g = true;

    public C4295c(Uri uri, int i) {
        this.f13326a = new C4294b(uri);
        this.f13328c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18158a(Context context, Bitmap bitmap, boolean z) {
        C4311d.m18636a((Object) bitmap);
        mo18161a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18161a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18159a(Context context, C2604j jVar) {
        if (this.f13332g) {
            mo18161a(null, false, true, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18160a(Context context, C2604j jVar, boolean z) {
        int i = this.f13328c;
        mo18161a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18162a(boolean z, boolean z2) {
        return this.f13330e && !z2 && !z;
    }
}

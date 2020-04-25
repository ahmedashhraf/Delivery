package p212io.fabric.sdk.android.p493p.p498e;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: io.fabric.sdk.android.p.e.o */
/* compiled from: IconRequest */
public class C14320o {

    /* renamed from: a */
    public final String f42242a;

    /* renamed from: b */
    public final int f42243b;

    /* renamed from: c */
    public final int f42244c;

    /* renamed from: d */
    public final int f42245d;

    public C14320o(String str, int i, int i2, int i3) {
        this.f42242a = str;
        this.f42243b = i;
        this.f42244c = i2;
        this.f42245d = i3;
    }

    /* renamed from: a */
    public static C14320o m62043a(Context context, String str) {
        String str2 = C14215d.f41919m;
        if (str != null) {
            try {
                int d = C14248i.m61833d(context);
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("App icon resource ID is ");
                sb.append(d);
                j.mo45042d(str2, sb.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), d, options);
                return new C14320o(str, d, options.outWidth, options.outHeight);
            } catch (Exception e) {
                C14215d.m61672j().mo45045e(str2, "Failed to load icon", e);
            }
        }
        return null;
    }
}

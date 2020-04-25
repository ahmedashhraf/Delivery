package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.C0221u;
import androidx.collection.C0635a;

/* renamed from: com.google.android.gms.internal.measurement.p1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4909p1 {
    @C0221u("PhenotypeConstants.class")

    /* renamed from: a */
    private static final C0635a<String, Uri> f14330a = new C0635a<>();

    /* renamed from: a */
    public static synchronized Uri m20916a(String str) {
        Uri uri;
        synchronized (C4909p1.class) {
            uri = (Uri) f14330a.get(str);
            if (uri == null) {
                String str2 = "content://com.google.android.gms.phenotype/";
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                f14330a.put(str, uri);
            }
        }
        return uri;
    }
}

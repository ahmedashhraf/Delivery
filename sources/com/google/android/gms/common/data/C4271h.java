package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.C4056a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.h */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4271h {
    @C4056a

    /* renamed from: a */
    public static final String f13268a = "next_page_token";
    @C4056a

    /* renamed from: b */
    public static final String f13269b = "prev_page_token";

    private C4271h() {
    }

    /* renamed from: a */
    public static <T, E extends C4273j<T>> ArrayList<T> m18458a(C4264b<E> bVar) {
        ArrayList<T> arrayList = new ArrayList<>(bVar.getCount());
        try {
            for (E b : bVar) {
                arrayList.add(b.mo18089b());
            }
            return arrayList;
        } finally {
            bVar.close();
        }
    }

    /* renamed from: b */
    public static boolean m18459b(C4264b<?> bVar) {
        return bVar != null && bVar.getCount() > 0;
    }

    /* renamed from: c */
    public static boolean m18460c(C4264b<?> bVar) {
        Bundle j = bVar.mo17665j();
        return (j == null || j.getString(f13268a) == null) ? false : true;
    }

    /* renamed from: d */
    public static boolean m18461d(C4264b<?> bVar) {
        Bundle j = bVar.mo17665j();
        return (j == null || j.getString(f13269b) == null) ? false : true;
    }
}

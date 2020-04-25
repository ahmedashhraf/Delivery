package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.versionedparcelable.c */
/* compiled from: ParcelUtils */
public class C1997c {

    /* renamed from: a */
    private static final String f7711a = "a";

    private C1997c() {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static Parcelable m10509a(C2003g gVar) {
        return new ParcelImpl(gVar);
    }

    @C0195i0
    /* renamed from: b */
    public static <T extends C2003g> List<T> m10516b(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(C1997c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(m10511a((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static <T extends C2003g> T m10511a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo8675a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m10515a(C2003g gVar, OutputStream outputStream) {
        C2000f fVar = new C2000f(null, outputStream);
        fVar.mo8708a(gVar);
        fVar.mo8699a();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static <T extends C2003g> T m10512a(InputStream inputStream) {
        return new C2000f(inputStream, null).mo8783u();
    }

    /* renamed from: a */
    public static void m10513a(@C0193h0 Bundle bundle, @C0193h0 String str, @C0195i0 C2003g gVar) {
        if (gVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m10509a(gVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    @C0195i0
    /* renamed from: a */
    public static <T extends C2003g> T m10510a(@C0193h0 Bundle bundle, @C0193h0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C1997c.class.getClassLoader());
            return m10511a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m10514a(@C0193h0 Bundle bundle, @C0193h0 String str, @C0193h0 List<? extends C2003g> list) {
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (C2003g a : list) {
            arrayList.add(m10509a(a));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }
}

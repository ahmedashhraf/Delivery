package p076c.p082c.p083a.p088u.p089h;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.c.a.u.h.k */
/* compiled from: StreamLocalUriFetcher */
public class C2296k extends C2287h<InputStream> {
    public C2296k(Context context, Uri uri) {
        super(context, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m11960a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return contentResolver.openInputStream(uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9658a(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}

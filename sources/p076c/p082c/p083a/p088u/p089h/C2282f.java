package p076c.p082c.p083a.p088u.p089h;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;

/* renamed from: c.c.a.u.h.f */
/* compiled from: FileDescriptorLocalUriFetcher */
public class C2282f extends C2287h<ParcelFileDescriptor> {
    public C2282f(Context context, Uri uri) {
        super(context, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m11923a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return contentResolver.openAssetFileDescriptor(uri, AckRequest.ELEMENT).getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9658a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}

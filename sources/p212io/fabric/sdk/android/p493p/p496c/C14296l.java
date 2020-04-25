package p212io.fabric.sdk.android.p493p.p496c;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: io.fabric.sdk.android.p.c.l */
/* compiled from: GZIPQueueFileEventStorage */
public class C14296l extends C14297m {
    public C14296l(Context context, File file, String str, String str2) throws IOException {
        super(context, file, str, str2);
    }

    /* renamed from: a */
    public OutputStream mo45240a(File file) throws IOException {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}

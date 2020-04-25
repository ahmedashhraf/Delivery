package p076c.p082c.p083a.p088u.p095j;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p076c.p082c.p083a.p084a0.C2208a;
import p076c.p082c.p083a.p088u.C2271b;

/* renamed from: c.c.a.u.j.o */
/* compiled from: StreamEncoder */
public class C2412o implements C2271b<InputStream> {

    /* renamed from: a */
    private static final String f9394a = "StreamEncoder";

    public String getId() {
        return "";
    }

    /* renamed from: a */
    public boolean mo9634a(InputStream inputStream, OutputStream outputStream) {
        byte[] b = C2208a.m11306c().mo9363b();
        while (true) {
            try {
                int read = inputStream.read(b);
                if (read != -1) {
                    outputStream.write(b, 0, read);
                } else {
                    return true;
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable(f9394a, 3);
                return false;
            } finally {
                C2208a.m11306c().mo9362a(b);
            }
        }
    }
}

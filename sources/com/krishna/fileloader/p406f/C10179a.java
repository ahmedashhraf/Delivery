package com.krishna.fileloader.p406f;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0226w0;
import com.krishna.fileloader.p408i.C10185a;
import com.krishna.fileloader.p408i.C10187c;
import com.krishna.fileloader.p408i.C10188d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p279f.C6610c;
import p468g.C13813c0;
import p468g.C13813c0.C13814a;
import p468g.C13823e0;
import p468g.C13870w;
import p468g.C13876z;
import p468g.C13876z.C13878b;
import p468g.p469k0.C13843a;
import p468g.p469k0.C13843a.C13844a;
import p470h.C13883a0;
import p470h.C13892d;
import p470h.C13906p;

/* renamed from: com.krishna.fileloader.f.a */
/* compiled from: FileDownloader */
public class C10179a {

    /* renamed from: e */
    private static final String f27151e = "FileDownloader";

    /* renamed from: f */
    private static C13876z f27152f;

    /* renamed from: a */
    private String f27153a;

    /* renamed from: b */
    private String f27154b;

    /* renamed from: c */
    private int f27155c;

    /* renamed from: d */
    private Context f27156d;

    public C10179a(Context context, String str, String str2, int i) {
        this.f27156d = context.getApplicationContext();
        this.f27153a = str;
        this.f27154b = str2;
        this.f27155c = i;
        m47309a();
    }

    /* renamed from: a */
    private void m47309a() {
        if (f27152f == null) {
            C13843a aVar = new C13843a();
            aVar.mo43513a(C13844a.NONE);
            f27152f = new C13878b().mo43793b(10, TimeUnit.SECONDS).mo43806e(10, TimeUnit.SECONDS).mo43804d(30, TimeUnit.SECONDS).mo43781a((C13870w) aVar).mo43791a();
        }
    }

    @C0226w0
    /* renamed from: a */
    public File mo36452a(boolean z, boolean z2) throws Exception {
        String str = "";
        C13814a b = new C13814a().mo43374b(this.f27153a);
        File b2 = C10185a.m47371b(this.f27156d, this.f27153a, this.f27154b, this.f27155c);
        if (z) {
            String a = C10188d.m47381a(b2.lastModified());
            if (a != null) {
                b.mo43369a(C6610c.f18447v, a);
            }
        }
        C13813c0 a2 = b.mo43371a();
        C13823e0 execute = f27152f.mo43405a(a2).execute();
        if (z && execute.mo43425g() == 304) {
            return null;
        }
        String str2 = "Failed to download file: ";
        if (!execute.mo43407F() || execute.mo43416a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(execute);
            throw new IOException(sb.toString());
        }
        if (b2.exists() && b2.delete()) {
            b2 = C10185a.m47371b(this.f27156d, this.f27153a, this.f27154b, this.f27155c);
        }
        C13892d a3 = C13906p.m59738a(C13906p.m59749b(b2));
        try {
            long a4 = a3.mo43842a((C13883a0) execute.mo43416a().source());
            a3.close();
            int i = 0;
            try {
                i = Integer.parseInt(execute.mo43418a("Content-Length", str));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (a4 >= ((long) i)) {
                if (z2) {
                    String trim = execute.mo43418a("ETag", str).replaceAll("\"", str).trim();
                    if (!TextUtils.isEmpty(trim) && !C10187c.m47379a(trim, b2)) {
                        b2.delete();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("checksum did not match: ");
                        sb2.append(a2.mo43359h());
                        sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(execute);
                        throw new IOException(sb3.toString());
                    }
                }
                long b3 = C10188d.m47384b(execute.mo43419b("Last-Modified"));
                if (b3 > 0) {
                    b2.setLastModified(b3);
                }
                return b2;
            }
            b2.delete();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("downloaded file is corrupt: ");
            sb4.append(a2.mo43359h());
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(execute);
            throw new IOException(sb5.toString());
        } catch (IOException unused) {
            if (b2.exists()) {
                b2.delete();
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append(execute);
            throw new IOException(sb6.toString());
        }
    }

    @C0226w0
    /* renamed from: a */
    public File mo36453a(boolean z, boolean z2, String str) throws Exception {
        String str2 = "";
        C13814a b = new C13814a().mo43374b(this.f27153a);
        File a = C10185a.m47367a(this.f27156d, this.f27153a, this.f27154b, this.f27155c, str);
        if (z) {
            String a2 = C10188d.m47381a(a.lastModified());
            if (a2 != null) {
                b.mo43369a(C6610c.f18447v, a2);
            }
        }
        C13813c0 a3 = b.mo43371a();
        C13823e0 execute = f27152f.mo43405a(a3).execute();
        if (z && execute.mo43425g() == 304) {
            return null;
        }
        String str3 = "Failed to download file: ";
        if (!execute.mo43407F() || execute.mo43416a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(execute);
            throw new IOException(sb.toString());
        }
        if (a.exists() && a.delete()) {
            a = C10185a.m47367a(this.f27156d, this.f27153a, this.f27154b, this.f27155c, str);
        }
        C13892d a4 = C13906p.m59738a(C13906p.m59749b(a));
        try {
            long a5 = a4.mo43842a((C13883a0) execute.mo43416a().source());
            a4.close();
            int i = 0;
            try {
                i = Integer.parseInt(execute.mo43418a("Content-Length", str2));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (a5 >= ((long) i)) {
                if (z2) {
                    String trim = execute.mo43418a("ETag", str2).replaceAll("\"", str2).trim();
                    if (!TextUtils.isEmpty(trim) && !C10187c.m47379a(trim, a)) {
                        a.delete();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("checksum did not match: ");
                        sb2.append(a3.mo43359h());
                        sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append(execute);
                        throw new IOException(sb3.toString());
                    }
                }
                long b2 = C10188d.m47384b(execute.mo43419b("Last-Modified"));
                if (b2 > 0) {
                    a.setLastModified(b2);
                }
                return a;
            }
            a.delete();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("downloaded file is corrupt: ");
            sb4.append(a3.mo43359h());
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str3);
            sb5.append(execute);
            throw new IOException(sb5.toString());
        } catch (IOException unused) {
            if (a.exists()) {
                a.delete();
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str3);
            sb6.append(execute);
            throw new IOException(sb6.toString());
        }
    }
}

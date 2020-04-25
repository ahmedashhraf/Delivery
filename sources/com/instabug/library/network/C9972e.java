package com.instabug.library.network;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.e */
/* compiled from: Multipart */
class C9972e {

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f26518d;

    /* renamed from: a */
    private final String f26519a;

    /* renamed from: b */
    private OutputStream f26520b;

    /* renamed from: c */
    private PrintWriter f26521c = new PrintWriter(new OutputStreamWriter(this.f26520b, "UTF-8"), true);

    public C9972e(HttpURLConnection httpURLConnection) throws IOException {
        boolean[] b = m46374b();
        b[0] = true;
        StringBuilder sb = new StringBuilder();
        String str = "===";
        sb.append(str);
        sb.append(System.currentTimeMillis());
        sb.append(str);
        this.f26519a = sb.toString();
        b[1] = true;
        httpURLConnection.setUseCaches(false);
        b[2] = true;
        httpURLConnection.setDoOutput(true);
        b[3] = true;
        httpURLConnection.setDoInput(true);
        b[4] = true;
        httpURLConnection.setChunkedStreamingMode(1048576);
        b[5] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("multipart/form-data; boundary=");
        sb2.append(this.f26519a);
        httpURLConnection.setRequestProperty("Content-Type", sb2.toString());
        b[6] = true;
        this.f26520b = httpURLConnection.getOutputStream();
        b[7] = true;
        b[8] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46374b() {
        boolean[] zArr = f26518d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3197351604359147424L, "com/instabug/library/network/Multipart", 34);
        f26518d = a;
        return a;
    }

    /* renamed from: a */
    public void mo35578a(String str, String str2) {
        boolean[] b = m46374b();
        String str3 = "\r\n";
        this.f26521c.append("--").append(this.f26519a).append(str3);
        b[9] = true;
        PrintWriter append = this.f26521c.append("Content-Disposition: form-data; name=\"").append(str).append("\"");
        b[10] = true;
        append.append(str3);
        b[11] = true;
        this.f26521c.append(str3);
        b[12] = true;
        this.f26521c.append(str2).append(str3);
        b[13] = true;
        this.f26521c.flush();
        b[14] = true;
    }

    @SuppressFBWarnings({"OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE"})
    /* renamed from: a */
    public void mo35577a(String str, File file, String str2, String str3) throws IOException {
        boolean[] b = m46374b();
        String str4 = "\r\n";
        this.f26521c.append("--").append(this.f26519a).append(str4);
        b[15] = true;
        PrintWriter append = this.f26521c.append("Content-Disposition: file; name=\"").append(str);
        b[16] = true;
        append.append("\"; filename=\"").append(str2).append("\"").append(str4);
        b[17] = true;
        this.f26521c.append("Content-Type: ").append(str3).append(str4);
        b[18] = true;
        this.f26521c.append(str4);
        b[19] = true;
        this.f26521c.flush();
        b[20] = true;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1048576];
        b[21] = true;
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                b[22] = true;
                this.f26520b.write(bArr, 0, read);
                b[23] = true;
            } else {
                this.f26520b.flush();
                b[24] = true;
                fileInputStream.close();
                b[25] = true;
                this.f26521c.append(str4);
                b[26] = true;
                this.f26521c.flush();
                b[27] = true;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo35576a() {
        boolean[] b = m46374b();
        String str = "\r\n";
        this.f26521c.append(str).flush();
        b[30] = true;
        String str2 = "--";
        PrintWriter append = this.f26521c.append(str2).append(this.f26519a).append(str2);
        b[31] = true;
        append.append(str);
        b[32] = true;
        this.f26521c.close();
        b[33] = true;
    }
}

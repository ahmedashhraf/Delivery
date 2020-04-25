package com.google.api.client.http;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import p076c.p112d.p134b.p135a.p143g.C6397m0;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: com.google.api.client.http.i */
/* compiled from: GZipEncoding */
public class C7271i implements C7296n {

    /* renamed from: com.google.api.client.http.i$a */
    /* compiled from: GZipEncoding */
    class C7272a extends BufferedOutputStream {
        C7272a(OutputStream outputStream) {
            super(outputStream);
        }

        public void close() throws IOException {
            try {
                flush();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo28922a(C6397m0 m0Var, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new C7272a(outputStream));
        m0Var.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    public String getName() {
        return HttpRequest.f42459o;
    }
}

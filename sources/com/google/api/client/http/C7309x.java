package com.google.api.client.http;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6385j;
import p076c.p112d.p134b.p135a.p143g.C6399n0;
import p076c.p112d.p134b.p135a.p143g.C6423t;
import p076c.p112d.p134b.p135a.p143g.C6438y;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: com.google.api.client.http.x */
/* compiled from: HttpResponse */
public final class C7309x {

    /* renamed from: a */
    private InputStream f20704a;

    /* renamed from: b */
    private final String f20705b;

    /* renamed from: c */
    private final String f20706c;

    /* renamed from: d */
    private final C7303s f20707d;

    /* renamed from: e */
    C7261e0 f20708e;

    /* renamed from: f */
    private final int f20709f;

    /* renamed from: g */
    private final String f20710g;

    /* renamed from: h */
    private final C7305u f20711h;

    /* renamed from: i */
    private int f20712i;

    /* renamed from: j */
    private boolean f20713j;

    /* renamed from: k */
    private boolean f20714k;

    C7309x(C7305u uVar, C7261e0 e0Var) throws IOException {
        StringBuilder sb;
        this.f20711h = uVar;
        this.f20712i = uVar.mo29107f();
        this.f20713j = uVar.mo29128z();
        this.f20708e = e0Var;
        this.f20705b = e0Var.mo25353c();
        int h = e0Var.mo25358h();
        boolean z = false;
        if (h < 0) {
            h = 0;
        }
        this.f20709f = h;
        String g = e0Var.mo25357g();
        this.f20710g = g;
        Logger logger = C7253a0.f20539a;
        if (this.f20713j && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        C7303s sVar = null;
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            sb.append(C6399n0.f17828a);
            String i = e0Var.mo25359i();
            if (i != null) {
                sb.append(i);
            } else {
                sb.append(this.f20709f);
                if (g != null) {
                    sb.append(' ');
                    sb.append(g);
                }
            }
            sb.append(C6399n0.f17828a);
        } else {
            sb = null;
        }
        uVar.mo29118p().mo29010a(e0Var, z ? sb : null);
        String e = e0Var.mo25355e();
        if (e == null) {
            e = uVar.mo29118p().mo29042q();
        }
        this.f20706c = e;
        if (e != null) {
            sVar = new C7303s(e);
        }
        this.f20707d = sVar;
        if (z) {
            logger.config(sb.toString());
        }
    }

    /* renamed from: q */
    private boolean m35382q() throws IOException {
        int j = mo29153j();
        if (!mo29152i().mo29117o().equals("HEAD") && j / 100 != 1 && j != 204 && j != 304) {
            return true;
        }
        mo29156m();
        return false;
    }

    /* renamed from: a */
    public C7309x mo29139a(int i) {
        C6381h0.m29667a(i >= 0, (Object) "The content logging limit must be non-negative.");
        this.f20712i = i;
        return this;
    }

    /* renamed from: b */
    public InputStream mo29145b() throws IOException {
        if (!this.f20714k) {
            InputStream b = this.f20708e.mo25351b();
            if (b != null) {
                try {
                    String str = this.f20705b;
                    if (str != null && str.contains(HttpRequest.f42459o)) {
                        b = new GZIPInputStream(b);
                    }
                    Logger logger = C7253a0.f20539a;
                    if (this.f20713j && logger.isLoggable(Level.CONFIG)) {
                        b = new C6438y(b, logger, Level.CONFIG, this.f20712i);
                    }
                    this.f20704a = b;
                } catch (EOFException unused) {
                    b.close();
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            }
            this.f20714k = true;
        }
        return this.f20704a;
    }

    /* renamed from: c */
    public Charset mo29146c() {
        C7303s sVar = this.f20707d;
        return (sVar == null || sVar.mo29070c() == null) ? C6385j.f17805b : this.f20707d.mo29070c();
    }

    /* renamed from: d */
    public String mo29147d() {
        return this.f20705b;
    }

    /* renamed from: e */
    public int mo29148e() {
        return this.f20712i;
    }

    /* renamed from: f */
    public String mo29149f() {
        return this.f20706c;
    }

    /* renamed from: g */
    public C7299q mo29150g() {
        return this.f20711h.mo29118p();
    }

    /* renamed from: h */
    public C7303s mo29151h() {
        return this.f20707d;
    }

    /* renamed from: i */
    public C7305u mo29152i() {
        return this.f20711h;
    }

    /* renamed from: j */
    public int mo29153j() {
        return this.f20709f;
    }

    /* renamed from: k */
    public String mo29154k() {
        return this.f20710g;
    }

    /* renamed from: l */
    public C7253a0 mo29155l() {
        return this.f20711h.mo29124v();
    }

    /* renamed from: m */
    public void mo29156m() throws IOException {
        InputStream b = mo29145b();
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: n */
    public boolean mo29157n() {
        return this.f20713j;
    }

    /* renamed from: o */
    public boolean mo29158o() {
        return C7311z.m35406b(this.f20709f);
    }

    /* renamed from: p */
    public String mo29159p() throws IOException {
        InputStream b = mo29145b();
        if (b == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6423t.m29817a(b, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toString(mo29146c().name());
    }

    /* renamed from: a */
    public C7309x mo29140a(boolean z) {
        this.f20713j = z;
        return this;
    }

    /* renamed from: a */
    public void mo29144a(OutputStream outputStream) throws IOException {
        C6423t.m29817a(mo29145b(), outputStream);
    }

    /* renamed from: a */
    public void mo29143a() throws IOException {
        mo29156m();
        this.f20708e.mo25663a();
    }

    /* renamed from: a */
    public <T> T mo29141a(Class<T> cls) throws IOException {
        if (!m35382q()) {
            return null;
        }
        return this.f20711h.mo29115m().mo25503a(mo29145b(), mo29146c(), cls);
    }

    /* renamed from: a */
    public Object mo29142a(Type type) throws IOException {
        if (!m35382q()) {
            return null;
        }
        return this.f20711h.mo29115m().mo25504a(mo29145b(), mo29146c(), type);
    }
}

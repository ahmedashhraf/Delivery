package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.io.x */
/* compiled from: LineReader */
public final class C8424x {

    /* renamed from: a */
    private final Readable f22320a;

    /* renamed from: b */
    private final Reader f22321b;

    /* renamed from: c */
    private final char[] f22322c = new char[4096];

    /* renamed from: d */
    private final CharBuffer f22323d = CharBuffer.wrap(this.f22322c);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Queue<String> f22324e = new LinkedList();

    /* renamed from: f */
    private final C8422v f22325f = new C8425a();

    /* renamed from: com.google.common.io.x$a */
    /* compiled from: LineReader */
    class C8425a extends C8422v {
        C8425a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo31566a(String str, String str2) {
            C8424x.this.f22324e.add(str);
        }
    }

    public C8424x(Readable readable) {
        this.f22320a = (Readable) C7397x.m35664a(readable);
        this.f22321b = readable instanceof Reader ? (Reader) readable : null;
    }

    /* renamed from: a */
    public String mo31568a() throws IOException {
        int i;
        while (true) {
            if (this.f22324e.peek() != null) {
                break;
            }
            this.f22323d.clear();
            Reader reader = this.f22321b;
            if (reader != null) {
                char[] cArr = this.f22322c;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.f22320a.read(this.f22323d);
            }
            if (i == -1) {
                this.f22325f.mo31565a();
                break;
            }
            this.f22325f.mo31567a(this.f22322c, 0, i);
        }
        return (String) this.f22324e.poll();
    }
}

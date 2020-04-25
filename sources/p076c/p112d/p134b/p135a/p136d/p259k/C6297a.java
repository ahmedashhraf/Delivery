package p076c.p112d.p134b.p135a.p136d.p259k;

import com.fasterxml.jackson.core.C3788d;
import com.fasterxml.jackson.core.C3789e;
import com.fasterxml.jackson.core.C3791f.C3792a;
import com.fasterxml.jackson.core.C3799j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6291e;
import p076c.p112d.p134b.p135a.p136d.C6294g;
import p076c.p112d.p134b.p135a.p136d.C6296j;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.d.k.a */
/* compiled from: JacksonFactory */
public final class C6297a extends C6290d {

    /* renamed from: a */
    private final C3789e f17642a = new C3789e();

    /* renamed from: c.d.b.a.d.k.a$a */
    /* compiled from: JacksonFactory */
    static /* synthetic */ class C6298a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17643a = new int[C3799j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.core.j[] r0 = com.fasterxml.jackson.core.C3799j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17643a = r0
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f17643a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p136d.p259k.C6297a.C6298a.<clinit>():void");
        }
    }

    /* renamed from: c.d.b.a.d.k.a$b */
    /* compiled from: JacksonFactory */
    static class C6299b {

        /* renamed from: a */
        static final C6297a f17644a = new C6297a();

        C6299b() {
        }
    }

    public C6297a() {
        this.f17642a.mo16514a(C3792a.AUTO_CLOSE_JSON_CONTENT, false);
    }

    /* renamed from: b */
    public static C6297a m29246b() {
        return C6299b.f17644a;
    }

    /* renamed from: a */
    public C6291e mo25139a(OutputStream outputStream, Charset charset) throws IOException {
        return new C6300b(this, this.f17642a.mo16547b(outputStream, C3788d.UTF8));
    }

    /* renamed from: a */
    public C6291e mo25140a(Writer writer) throws IOException {
        return new C6300b(this, this.f17642a.mo16549b(writer));
    }

    /* renamed from: a */
    public C6294g mo25143a(Reader reader) throws IOException {
        C6381h0.m29663a(reader);
        return new C6301c(this, this.f17642a.mo16530a(reader));
    }

    /* renamed from: a */
    public C6294g mo25141a(InputStream inputStream) throws IOException {
        C6381h0.m29663a(inputStream);
        return new C6301c(this, this.f17642a.mo16528a(inputStream));
    }

    /* renamed from: a */
    public C6294g mo25142a(InputStream inputStream, Charset charset) throws IOException {
        C6381h0.m29663a(inputStream);
        return new C6301c(this, this.f17642a.mo16528a(inputStream));
    }

    /* renamed from: a */
    public C6294g mo25144a(String str) throws IOException {
        C6381h0.m29663a(str);
        return new C6301c(this, this.f17642a.mo16556b(str));
    }

    /* renamed from: a */
    static C6296j m29245a(C3799j jVar) {
        if (jVar == null) {
            return null;
        }
        switch (C6298a.f17643a[jVar.ordinal()]) {
            case 1:
                return C6296j.END_ARRAY;
            case 2:
                return C6296j.START_ARRAY;
            case 3:
                return C6296j.END_OBJECT;
            case 4:
                return C6296j.START_OBJECT;
            case 5:
                return C6296j.VALUE_FALSE;
            case 6:
                return C6296j.VALUE_TRUE;
            case 7:
                return C6296j.VALUE_NULL;
            case 8:
                return C6296j.VALUE_STRING;
            case 9:
                return C6296j.VALUE_NUMBER_FLOAT;
            case 10:
                return C6296j.VALUE_NUMBER_INT;
            case 11:
                return C6296j.FIELD_NAME;
            default:
                return C6296j.NOT_AVAILABLE;
        }
    }
}

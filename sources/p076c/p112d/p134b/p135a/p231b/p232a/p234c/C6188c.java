package p076c.p112d.p134b.p135a.p231b.p232a.p234c;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.internal.ServerProtocol;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6294g;
import p076c.p112d.p134b.p135a.p136d.C6296j;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@TargetApi(11)
@C2766f
/* renamed from: c.d.b.a.b.a.c.c */
/* compiled from: AndroidJsonParser */
class C6188c extends C6294g {

    /* renamed from: c */
    private final JsonReader f17423c;

    /* renamed from: d */
    private final C6184a f17424d;

    /* renamed from: e */
    private List<String> f17425e = new ArrayList();

    /* renamed from: f */
    private C6296j f17426f;

    /* renamed from: g */
    private String f17427g;

    /* renamed from: c.d.b.a.b.a.c.c$a */
    /* compiled from: AndroidJsonParser */
    static /* synthetic */ class C6189a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17428a = new int[C6296j.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f17429b = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0081 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17429b = r0
                r0 = 1
                int[] r1 = f17429b     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.util.JsonToken r2 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x001f }
                android.util.JsonToken r3 = android.util.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x002a }
                android.util.JsonToken r3 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.util.JsonToken r3 = android.util.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.util.JsonToken r3 = android.util.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x004b }
                android.util.JsonToken r3 = android.util.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.util.JsonToken r3 = android.util.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.util.JsonToken r3 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r2 = f17429b     // Catch:{ NoSuchFieldError -> 0x006e }
                android.util.JsonToken r3 = android.util.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                c.d.b.a.d.j[] r2 = p076c.p112d.p134b.p135a.p136d.C6296j.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f17428a = r2
                int[] r2 = f17428a     // Catch:{ NoSuchFieldError -> 0x0081 }
                c.d.b.a.d.j r3 = p076c.p112d.p134b.p135a.p136d.C6296j.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0081 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0081 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                int[] r0 = f17428a     // Catch:{ NoSuchFieldError -> 0x008b }
                c.d.b.a.d.j r2 = p076c.p112d.p134b.p135a.p136d.C6296j.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x008b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x008b }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x008b }
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p231b.p232a.p234c.C6188c.C6189a.<clinit>():void");
        }
    }

    C6188c(C6184a aVar, JsonReader jsonReader) {
        this.f17424d = aVar;
        this.f17423c = jsonReader;
        jsonReader.setLenient(true);
    }

    /* renamed from: p */
    private void m28425p() {
        C6296j jVar = this.f17426f;
        C6381h0.m29666a(jVar == C6296j.VALUE_NUMBER_INT || jVar == C6296j.VALUE_NUMBER_FLOAT);
    }

    /* renamed from: a */
    public void mo25169a() throws IOException {
        this.f17423c.close();
    }

    /* renamed from: b */
    public BigInteger mo25170b() {
        m28425p();
        return new BigInteger(this.f17427g);
    }

    /* renamed from: c */
    public byte mo25171c() {
        m28425p();
        return Byte.valueOf(this.f17427g).byteValue();
    }

    /* renamed from: d */
    public String mo25172d() {
        if (this.f17425e.isEmpty()) {
            return null;
        }
        List<String> list = this.f17425e;
        return (String) list.get(list.size() - 1);
    }

    /* renamed from: e */
    public C6296j mo25173e() {
        return this.f17426f;
    }

    /* renamed from: f */
    public BigDecimal mo25174f() {
        m28425p();
        return new BigDecimal(this.f17427g);
    }

    /* renamed from: g */
    public double mo25175g() {
        m28425p();
        return Double.valueOf(this.f17427g).doubleValue();
    }

    /* renamed from: h */
    public C6290d mo25176h() {
        return this.f17424d;
    }

    /* renamed from: i */
    public float mo25177i() {
        m28425p();
        return Float.valueOf(this.f17427g).floatValue();
    }

    /* renamed from: j */
    public int mo25178j() {
        m28425p();
        return Integer.valueOf(this.f17427g).intValue();
    }

    /* renamed from: k */
    public long mo25179k() {
        m28425p();
        return Long.valueOf(this.f17427g).longValue();
    }

    /* renamed from: l */
    public short mo25180l() {
        m28425p();
        return Short.valueOf(this.f17427g).shortValue();
    }

    /* renamed from: m */
    public String mo25181m() {
        return this.f17427g;
    }

    /* renamed from: n */
    public C6296j mo25182n() throws IOException {
        JsonToken jsonToken;
        C6296j jVar = this.f17426f;
        if (jVar != null) {
            int i = C6189a.f17428a[jVar.ordinal()];
            if (i == 1) {
                this.f17423c.beginArray();
                this.f17425e.add(null);
            } else if (i == 2) {
                this.f17423c.beginObject();
                this.f17425e.add(null);
            }
        }
        try {
            jsonToken = this.f17423c.peek();
        } catch (EOFException unused) {
            jsonToken = JsonToken.END_DOCUMENT;
        }
        switch (C6189a.f17429b[jsonToken.ordinal()]) {
            case 1:
                this.f17427g = "[";
                this.f17426f = C6296j.START_ARRAY;
                break;
            case 2:
                this.f17427g = "]";
                this.f17426f = C6296j.END_ARRAY;
                List<String> list = this.f17425e;
                list.remove(list.size() - 1);
                this.f17423c.endArray();
                break;
            case 3:
                this.f17427g = "{";
                this.f17426f = C6296j.START_OBJECT;
                break;
            case 4:
                this.f17427g = "}";
                this.f17426f = C6296j.END_OBJECT;
                List<String> list2 = this.f17425e;
                list2.remove(list2.size() - 1);
                this.f17423c.endObject();
                break;
            case 5:
                if (!this.f17423c.nextBoolean()) {
                    this.f17427g = "false";
                    this.f17426f = C6296j.VALUE_FALSE;
                    break;
                } else {
                    this.f17427g = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                    this.f17426f = C6296j.VALUE_TRUE;
                    break;
                }
            case 6:
                this.f17427g = "null";
                this.f17426f = C6296j.VALUE_NULL;
                this.f17423c.nextNull();
                break;
            case 7:
                this.f17427g = this.f17423c.nextString();
                this.f17426f = C6296j.VALUE_STRING;
                break;
            case 8:
                this.f17427g = this.f17423c.nextString();
                this.f17426f = this.f17427g.indexOf(46) == -1 ? C6296j.VALUE_NUMBER_INT : C6296j.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.f17427g = this.f17423c.nextName();
                this.f17426f = C6296j.FIELD_NAME;
                List<String> list3 = this.f17425e;
                list3.set(list3.size() - 1, this.f17427g);
                break;
            default:
                this.f17427g = null;
                this.f17426f = null;
                break;
        }
        return this.f17426f;
    }

    /* renamed from: o */
    public C6294g mo25183o() throws IOException {
        C6296j jVar = this.f17426f;
        if (jVar != null) {
            int i = C6189a.f17428a[jVar.ordinal()];
            if (i == 1) {
                this.f17423c.skipValue();
                this.f17427g = "]";
                this.f17426f = C6296j.END_ARRAY;
            } else if (i == 2) {
                this.f17423c.skipValue();
                this.f17427g = "}";
                this.f17426f = C6296j.END_OBJECT;
            }
        }
        return this;
    }
}

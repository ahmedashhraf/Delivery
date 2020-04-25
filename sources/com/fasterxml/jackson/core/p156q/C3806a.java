package com.fasterxml.jackson.core.p156q;

import com.fasterxml.jackson.core.C3785a;
import com.fasterxml.jackson.core.C3791f;
import com.fasterxml.jackson.core.C3791f.C3792a;
import com.fasterxml.jackson.core.C3794h;
import com.fasterxml.jackson.core.C3794h.C3797c;
import com.fasterxml.jackson.core.C3799j;
import com.fasterxml.jackson.core.C3800k;
import com.fasterxml.jackson.core.C3801l;
import com.fasterxml.jackson.core.C3802m;
import com.fasterxml.jackson.core.C3803n;
import com.fasterxml.jackson.core.C3804o;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.p159t.C3835e;
import com.fasterxml.jackson.core.p162w.C3858c;
import com.fasterxml.jackson.core.p162w.C3870k;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.fasterxml.jackson.core.q.a */
/* compiled from: GeneratorBase */
public abstract class C3806a extends C3791f {

    /* renamed from: N */
    protected int f11860N;

    /* renamed from: O */
    protected boolean f11861O;

    /* renamed from: P */
    protected C3835e f11862P = C3835e.m16373l();

    /* renamed from: Q */
    protected boolean f11863Q;

    /* renamed from: b */
    protected C3800k f11864b;

    /* renamed from: com.fasterxml.jackson.core.q.a$a */
    /* compiled from: GeneratorBase */
    static /* synthetic */ class C3807a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11865a = new int[C3797c.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f11866b = new int[C3799j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b9 */
        static {
            /*
                com.fasterxml.jackson.core.j[] r0 = com.fasterxml.jackson.core.C3799j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11866b = r0
                r0 = 1
                int[] r1 = f11866b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.j r2 = com.fasterxml.jackson.core.C3799j.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f11866b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.j r3 = com.fasterxml.jackson.core.C3799j.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f11866b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.j r4 = com.fasterxml.jackson.core.C3799j.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x004b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x007a }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r4 = f11866b     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.fasterxml.jackson.core.j r5 = com.fasterxml.jackson.core.C3799j.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r6 = 12
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                com.fasterxml.jackson.core.h$c[] r4 = com.fasterxml.jackson.core.C3794h.C3797c.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f11865a = r4
                int[] r4 = f11865a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.fasterxml.jackson.core.h$c r5 = com.fasterxml.jackson.core.C3794h.C3797c.INT     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f11865a     // Catch:{ NoSuchFieldError -> 0x00af }
                com.fasterxml.jackson.core.h$c r4 = com.fasterxml.jackson.core.C3794h.C3797c.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x00af }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = f11865a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.fasterxml.jackson.core.h$c r1 = com.fasterxml.jackson.core.C3794h.C3797c.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = f11865a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.fasterxml.jackson.core.h$c r1 = com.fasterxml.jackson.core.C3794h.C3797c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p156q.C3806a.C3807a.<clinit>():void");
        }
    }

    protected C3806a(int i, C3800k kVar) {
        this.f11860N = i;
        this.f11864b = kVar;
        this.f11861O = mo16634c(C3792a.WRITE_NUMBERS_AS_STRINGS);
    }

    /* renamed from: B */
    public C3791f mo16581B() {
        if (mo16647h() != null) {
            return this;
        }
        return mo16593a((C3801l) new C3858c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo16800K() {
        throw new RuntimeException("Internal error: should never end up through this code path");
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract void mo16801L();

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo16802M() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operation not supported by generator of type ");
        sb.append(getClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo16803N() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    /* renamed from: a */
    public C3791f mo16590a(C3792a aVar) {
        this.f11860N &= aVar.mo16653e() ^ -1;
        if (aVar == C3792a.WRITE_NUMBERS_AS_STRINGS) {
            this.f11861O = false;
        } else if (aVar == C3792a.ESCAPE_NON_ASCII) {
            mo16589a(0);
        }
        return this;
    }

    /* renamed from: b */
    public C3791f mo16621b(C3792a aVar) {
        this.f11860N |= aVar.mo16653e();
        if (aVar == C3792a.WRITE_NUMBERS_AS_STRINGS) {
            this.f11861O = true;
        } else if (aVar == C3792a.ESCAPE_NON_ASCII) {
            mo16589a((int) C13959t.f40827P1);
        }
        return this;
    }

    /* renamed from: c */
    public final boolean mo16634c(C3792a aVar) {
        return (aVar.mo16653e() & this.f11860N) != 0;
    }

    public void close() throws IOException {
        this.f11863Q = true;
    }

    /* renamed from: d */
    public final C3800k mo16636d() {
        return this.f11864b;
    }

    public abstract void flush() throws IOException;

    /* renamed from: h */
    public void mo16648h(String str) throws IOException, JsonGenerationException {
        mo16806k("write raw value");
        mo16646g(str);
    }

    public boolean isClosed() {
        return this.f11863Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo16805j(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo16806k(String str) throws IOException, JsonGenerationException;

    public C3804o version() {
        return C3870k.m16928a(getClass());
    }

    /* renamed from: c */
    public void mo16631c(String str, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write raw value");
        mo16626b(str, i, i2);
    }

    /* renamed from: d */
    public void mo16637d(C3802m mVar) throws IOException, JsonGenerationException {
        mo16650i(mVar.getValue());
    }

    /* renamed from: f */
    public final C3835e m16149f() {
        return this.f11862P;
    }

    /* renamed from: a */
    public C3791f mo16592a(C3800k kVar) {
        this.f11864b = kVar;
        return this;
    }

    /* renamed from: b */
    public void mo16624b(C3802m mVar) throws IOException, JsonGenerationException {
        mo16630c(mVar.getValue());
    }

    /* renamed from: a */
    public int mo16587a(C3785a aVar, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        mo16802M();
        return 0;
    }

    /* renamed from: b */
    public void mo16628b(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        mo16806k("write raw value");
        mo16619a(cArr, i, i2);
    }

    /* renamed from: a */
    public void mo16604a(Object obj) throws IOException, JsonProcessingException {
        if (obj == null) {
            mo16584H();
        } else {
            C3800k kVar = this.f11864b;
            if (kVar != null) {
                kVar.mo16755a((C3791f) this, obj);
                return;
            }
            mo16804b(obj);
        }
    }

    /* renamed from: b */
    public final void mo16623b(C3794h hVar) throws IOException, JsonProcessingException {
        C3799j G = hVar.mo16664G();
        if (G == C3799j.FIELD_NAME) {
            mo16630c(hVar.mo16663F());
            G = hVar.mo16728j0();
        }
        int i = C3807a.f11866b[G.ordinal()];
        if (i == 1) {
            mo16586J();
            while (hVar.mo16728j0() != C3799j.END_OBJECT) {
                mo16623b(hVar);
            }
            mo16583G();
        } else if (i != 3) {
            mo16602a(hVar);
        } else {
            mo16585I();
            while (hVar.mo16728j0() != C3799j.END_ARRAY) {
                mo16623b(hVar);
            }
            mo16582F();
        }
    }

    /* renamed from: a */
    public void mo16603a(C3803n nVar) throws IOException, JsonProcessingException {
        if (nVar == null) {
            mo16584H();
            return;
        }
        C3800k kVar = this.f11864b;
        if (kVar != null) {
            kVar.mo16755a((C3791f) this, (Object) nVar);
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can not serialize JsonNode-based trees");
    }

    /* renamed from: a */
    public final void mo16602a(C3794h hVar) throws IOException, JsonProcessingException {
        C3799j G = hVar.mo16664G();
        if (G == null) {
            mo16805j("No current event to copy");
        }
        switch (C3807a.f11866b[G.ordinal()]) {
            case 1:
                mo16586J();
                return;
            case 2:
                mo16583G();
                return;
            case 3:
                mo16585I();
                return;
            case 4:
                mo16582F();
                return;
            case 5:
                mo16630c(hVar.mo16663F());
                return;
            case 6:
                if (hVar.mo16720f0()) {
                    mo16633c(hVar.mo16679V(), hVar.mo16681X(), hVar.mo16680W());
                    return;
                } else {
                    mo16650i(hVar.mo16678U());
                    return;
                }
            case 7:
                int i = C3807a.f11865a[hVar.mo16673P().ordinal()];
                if (i == 1) {
                    mo16640e(hVar.mo16670M());
                    return;
                } else if (i != 2) {
                    mo16600a(hVar.mo16672O());
                    return;
                } else {
                    mo16615a(hVar.mo16717e());
                    return;
                }
            case 8:
                int i2 = C3807a.f11865a[hVar.mo16673P().ordinal()];
                if (i2 == 3) {
                    mo16614a(hVar.mo16665H());
                    return;
                } else if (i2 != 4) {
                    mo16598a(hVar.mo16666I());
                    return;
                } else {
                    mo16599a(hVar.mo16668K());
                    return;
                }
            case 9:
                mo16616a(true);
                return;
            case 10:
                mo16616a(false);
                return;
            case 11:
                mo16584H();
                return;
            case 12:
                mo16604a(hVar.mo16667J());
                return;
            default:
                mo16800K();
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16804b(Object obj) throws IOException, JsonGenerationException {
        if (obj == null) {
            mo16584H();
        } else if (obj instanceof String) {
            mo16650i((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    mo16640e(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    mo16600a(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    mo16598a(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    mo16599a(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    mo16640e((int) number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    mo16640e((int) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    mo16615a((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    mo16614a((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    mo16640e(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    mo16600a(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                mo16617a((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                mo16616a(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                mo16616a(((AtomicBoolean) obj).get());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
            sb.append(obj.getClass().getName());
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }
}

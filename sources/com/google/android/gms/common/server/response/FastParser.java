package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import kotlin.p217i1.C14662d0;

@C4056a
@C4312d0
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class FastParser<T extends FastJsonResponse> {

    /* renamed from: g */
    private static final char[] f13633g = {'u', 'l', 'l'};

    /* renamed from: h */
    private static final char[] f13634h = {'r', 'u', 'e'};

    /* renamed from: i */
    private static final char[] f13635i = {'r', 'u', 'e', C14662d0.f42850a};

    /* renamed from: j */
    private static final char[] f13636j = {'a', 'l', 's', 'e'};

    /* renamed from: k */
    private static final char[] f13637k = {'a', 'l', 's', 'e', C14662d0.f42850a};

    /* renamed from: l */
    private static final char[] f13638l = {10};

    /* renamed from: m */
    private static final C4447a<Integer> f13639m = new C4449b();

    /* renamed from: n */
    private static final C4447a<Long> f13640n = new C4448a();

    /* renamed from: o */
    private static final C4447a<Float> f13641o = new C4451d();

    /* renamed from: p */
    private static final C4447a<Double> f13642p = new C4450c();

    /* renamed from: q */
    private static final C4447a<Boolean> f13643q = new C4453f();

    /* renamed from: r */
    private static final C4447a<String> f13644r = new C4452e();

    /* renamed from: s */
    private static final C4447a<BigInteger> f13645s = new C4455h();

    /* renamed from: t */
    private static final C4447a<BigDecimal> f13646t = new C4454g();

    /* renamed from: a */
    private final char[] f13647a = new char[1];

    /* renamed from: b */
    private final char[] f13648b = new char[32];

    /* renamed from: c */
    private final char[] f13649c = new char[1024];

    /* renamed from: d */
    private final StringBuilder f13650d = new StringBuilder(32);

    /* renamed from: e */
    private final StringBuilder f13651e = new StringBuilder(1024);

    /* renamed from: f */
    private final Stack<Integer> f13652f = new Stack<>();

    @C4056a
    @C4312d0
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastParser$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private interface C4447a<O> {
        /* renamed from: a */
        O mo18518a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    /* renamed from: b */
    private final String m19203b(BufferedReader bufferedReader) throws ParseException, IOException {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char j = m19218j(bufferedReader);
        String str = "Unexpected token ";
        if (j == '\"') {
            String str2 = "Unexpected EOF while parsing string";
            if (bufferedReader2.read(this.f13647a) != -1) {
                char c = this.f13647a[0];
                boolean z = false;
                do {
                    if (c != '\"' || z) {
                        z = c == '\\' ? !z : false;
                        if (bufferedReader2.read(this.f13647a) != -1) {
                            c = this.f13647a[0];
                        } else {
                            throw new ParseException(str2);
                        }
                    }
                } while (!Character.isISOControl(c));
                throw new ParseException("Unexpected control character while reading string");
            }
            throw new ParseException(str2);
        } else if (j != ',') {
            int i = 1;
            if (j == '[') {
                this.f13652f.push(Integer.valueOf(5));
                bufferedReader2.mark(32);
                if (m19218j(bufferedReader) == ']') {
                    m19198a(5);
                } else {
                    bufferedReader.reset();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i > 0) {
                        char j2 = m19218j(bufferedReader);
                        if (j2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        } else if (!Character.isISOControl(j2)) {
                            if (j2 == '\"' && !z2) {
                                z3 = !z3;
                            }
                            if (j2 == '[' && !z3) {
                                i++;
                            }
                            if (j2 == ']' && !z3) {
                                i--;
                            }
                            z2 = (j2 != '\\' || !z3) ? false : !z2;
                        } else {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                    }
                    m19198a(5);
                }
            } else if (j != '{') {
                bufferedReader.reset();
                m19193a(bufferedReader2, this.f13649c);
            } else {
                this.f13652f.push(Integer.valueOf(1));
                bufferedReader2.mark(32);
                char j3 = m19218j(bufferedReader);
                if (j3 == '}') {
                    m19198a(1);
                } else if (j3 == '\"') {
                    bufferedReader.reset();
                    m19194a(bufferedReader);
                    do {
                    } while (m19203b(bufferedReader) != null);
                    m19198a(1);
                } else {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append(str);
                    sb.append(j3);
                    throw new ParseException(sb.toString());
                }
            }
        } else {
            throw new ParseException("Missing value");
        }
        char j4 = m19218j(bufferedReader);
        if (j4 == ',') {
            m19198a(2);
            return m19194a(bufferedReader);
        } else if (j4 == '}') {
            m19198a(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append(str);
            sb2.append(j4);
            throw new ParseException(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m19207c(BufferedReader bufferedReader) throws ParseException, IOException {
        return m19195a(bufferedReader, this.f13648b, this.f13650d, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m19209d(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int a = m19193a(bufferedReader, this.f13649c);
        if (a == 0) {
            return 0;
        }
        char[] cArr = this.f13649c;
        if (a > 0) {
            if (cArr[0] == '-') {
                i2 = 1;
                z = true;
                i = Integer.MIN_VALUE;
            } else {
                i2 = 0;
                z = false;
                i = -2147483647;
            }
            String str = "Unexpected non-digit character";
            if (i2 < a) {
                i4 = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new ParseException(str);
                }
            } else {
                i4 = i2;
                i3 = 0;
            }
            while (i4 < a) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(cArr[i4], 10);
                if (digit2 >= 0) {
                    String str2 = "Number too large";
                    if (i3 >= -214748364) {
                        int i6 = i3 * 10;
                        if (i6 >= i + digit2) {
                            i3 = i6 - digit2;
                            i4 = i5;
                        } else {
                            throw new ParseException(str2);
                        }
                    } else {
                        throw new ParseException(str2);
                    }
                } else {
                    throw new ParseException(str);
                }
            }
            if (!z) {
                return -i3;
            }
            if (i4 > 1) {
                return i3;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final long m19210e(BufferedReader bufferedReader) throws ParseException, IOException {
        boolean z;
        long j;
        long j2;
        int i;
        int a = m19193a(bufferedReader, this.f13649c);
        if (a == 0) {
            return 0;
        }
        char[] cArr = this.f13649c;
        if (a > 0) {
            int i2 = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
                z = true;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            String str = "Unexpected non-digit character";
            if (i2 < a) {
                i = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException(str);
                }
            } else {
                j2 = 0;
                i = i2;
            }
            while (i < a) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 >= 0) {
                    String str2 = "Number too large";
                    if (j2 >= -922337203685477580L) {
                        long j3 = j2 * 10;
                        long j4 = (long) digit2;
                        if (j3 >= j + j4) {
                            j2 = j3 - j4;
                            i = i3;
                        } else {
                            throw new ParseException(str2);
                        }
                    } else {
                        throw new ParseException(str2);
                    }
                } else {
                    throw new ParseException(str);
                }
            }
            if (!z) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final BigInteger m19213f(BufferedReader bufferedReader) throws ParseException, IOException {
        int a = m19193a(bufferedReader, this.f13649c);
        if (a == 0) {
            return null;
        }
        return new BigInteger(new String(this.f13649c, 0, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final float m19214g(BufferedReader bufferedReader) throws ParseException, IOException {
        int a = m19193a(bufferedReader, this.f13649c);
        if (a == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.f13649c, 0, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final double m19216h(BufferedReader bufferedReader) throws ParseException, IOException {
        int a = m19193a(bufferedReader, this.f13649c);
        if (a == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.f13649c, 0, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final BigDecimal m19217i(BufferedReader bufferedReader) throws ParseException, IOException {
        int a = m19193a(bufferedReader, this.f13649c);
        if (a == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f13649c, 0, a));
    }

    /* renamed from: j */
    private final char m19218j(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.f13647a) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.f13647a[0])) {
            if (bufferedReader.read(this.f13647a) == -1) {
                return 0;
            }
        }
        return this.f13647a[0];
    }

    @C4056a
    /* renamed from: a */
    public void mo18517a(InputStream inputStream, T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.f13652f.push(Integer.valueOf(0));
            char j = m19218j(bufferedReader);
            if (j != 0) {
                if (j == '[') {
                    this.f13652f.push(Integer.valueOf(5));
                    Map N0 = t.mo17325N0();
                    if (N0.size() == 1) {
                        Field field = (Field) ((Entry) N0.entrySet().iterator().next()).getValue();
                        t.mo17328a(field, field.f13625Q, m19196a(bufferedReader, field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (j == '{') {
                    this.f13652f.push(Integer.valueOf(1));
                    m19200a(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(j);
                    throw new ParseException(sb.toString());
                }
                m19198a(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } else {
                throw new ParseException("No data to parse");
            }
        } catch (IOException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026d, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026e, code lost:
        m19198a(r5);
        m19198a(2);
        r5 = m19218j(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0279, code lost:
        if (r5 == ',') goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x027b, code lost:
        if (r5 != '}') goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027d, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0280, code lost:
        r3 = new java.lang.StringBuilder(55);
        r3.append("Expected end of object or field separator, but found: ");
        r3.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0298, code lost:
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0299, code lost:
        r5 = m19194a(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b6, code lost:
        r5 = 4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m19200a(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "Error instantiating inner object"
            java.util.Map r4 = r18.mo17325N0()
            java.lang.String r5 = r16.m19194a(r17)
            r6 = 0
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r5 != 0) goto L_0x001c
            r1.m19198a(r7)
            return r6
        L_0x001c:
            r9 = 0
        L_0x001d:
            if (r5 == 0) goto L_0x029f
            java.lang.Object r5 = r4.get(r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = r16.m19203b(r17)
            goto L_0x001d
        L_0x002c:
            java.util.Stack<java.lang.Integer> r10 = r1.f13652f
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.push(r12)
            int r10 = r5.f13632b
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 44
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 110(0x6e, float:1.54E-43)
            switch(r10) {
                case 0: goto L_0x0258;
                case 1: goto L_0x0242;
                case 2: goto L_0x022c;
                case 3: goto L_0x0216;
                case 4: goto L_0x0200;
                case 5: goto L_0x01e8;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01ba;
                case 8: goto L_0x01a5;
                case 9: goto L_0x0193;
                case 10: goto L_0x00d0;
                case 11: goto L_0x005c;
                default: goto L_0x0043;
            }
        L_0x0043:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Invalid field type "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x005c:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x0093
            char r10 = r16.m19218j(r17)
            if (r10 != r15) goto L_0x0072
            char[] r10 = f13633g
            r1.m19205b(r0, r10)
            java.lang.String r10 = r5.f13625Q
            r2.mo17328a(r5, r10, r9)
            goto L_0x026d
        L_0x0072:
            java.util.Stack<java.lang.Integer> r12 = r1.f13652f
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.push(r15)
            r12 = 91
            if (r10 != r12) goto L_0x008b
            java.lang.String r10 = r5.f13625Q
            java.util.ArrayList r12 = r1.m19196a(r0, r5)
            r2.mo17328a(r5, r10, r12)
            goto L_0x026d
        L_0x008b:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected array start"
            r0.<init>(r2)
            throw r0
        L_0x0093:
            char r10 = r16.m19218j(r17)
            if (r10 != r15) goto L_0x00a5
            char[] r10 = f13633g
            r1.m19205b(r0, r10)
            java.lang.String r10 = r5.f13625Q
            r2.mo17327a(r5, r10, r9)
            goto L_0x026d
        L_0x00a5:
            java.util.Stack<java.lang.Integer> r15 = r1.f13652f
            r15.push(r8)
            if (r10 != r12) goto L_0x00c8
            com.google.android.gms.common.server.response.FastJsonResponse r10 = r5.mo18510Q()     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            r1.m19200a(r0, r10)     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            java.lang.String r12 = r5.f13625Q     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            r2.mo17327a(r5, r12, r10)     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            goto L_0x026d
        L_0x00ba:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00c1:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00c8:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of object"
            r0.<init>(r2)
            throw r0
        L_0x00d0:
            char r10 = r16.m19218j(r17)
            if (r10 != r15) goto L_0x00de
            char[] r10 = f13633g
            r1.m19205b(r0, r10)
            r10 = r9
            goto L_0x0162
        L_0x00de:
            if (r10 != r12) goto L_0x018b
            java.util.Stack<java.lang.Integer> r10 = r1.f13652f
            r10.push(r8)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x00ea:
            char r12 = r16.m19218j(r17)
            if (r12 == 0) goto L_0x0183
            r15 = 34
            if (r12 == r15) goto L_0x00fc
            if (r12 == r14) goto L_0x00f8
            goto L_0x017f
        L_0x00f8:
            r1.m19198a(r7)
            goto L_0x0162
        L_0x00fc:
            char[] r12 = r1.f13648b
            java.lang.StringBuilder r11 = r1.f13650d
            java.lang.String r11 = m19204b(r0, r12, r11, r9)
            char r12 = r16.m19218j(r17)
            r6 = 58
            if (r12 == r6) goto L_0x0129
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No map value found for key "
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x011f
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0125
        L_0x011f:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x0125:
            r0.<init>(r2)
            throw r0
        L_0x0129:
            char r6 = r16.m19218j(r17)
            if (r6 == r15) goto L_0x014c
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected String value for key "
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0142
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0148
        L_0x0142:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x0148:
            r0.<init>(r2)
            throw r0
        L_0x014c:
            char[] r6 = r1.f13648b
            java.lang.StringBuilder r12 = r1.f13650d
            java.lang.String r6 = m19204b(r0, r6, r12, r9)
            r10.put(r11, r6)
            char r6 = r16.m19218j(r17)
            if (r6 == r13) goto L_0x017f
            if (r6 != r14) goto L_0x0166
            r1.m19198a(r7)
        L_0x0162:
            r2.mo18488a(r5, r10)
            goto L_0x01b6
        L_0x0166:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected character while parsing string map: "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x017f:
            r6 = 0
            r11 = 4
            goto L_0x00ea
        L_0x0183:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF"
            r0.<init>(r2)
            throw r0
        L_0x018b:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of a map object"
            r0.<init>(r2)
            throw r0
        L_0x0193:
            char[] r6 = r1.f13649c
            java.lang.StringBuilder r10 = r1.f13651e
            char[] r11 = f13638l
            java.lang.String r6 = r1.m19195a(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.C4473c.m19318b(r6)
            r2.mo18490a(r5, r6)
            goto L_0x01b6
        L_0x01a5:
            char[] r6 = r1.f13649c
            java.lang.StringBuilder r10 = r1.f13651e
            char[] r11 = f13638l
            java.lang.String r6 = r1.m19195a(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.C4473c.m19316a(r6)
            r2.mo18490a(r5, r6)
        L_0x01b6:
            r5 = 4
            r6 = 0
            goto L_0x026e
        L_0x01ba:
            boolean r6 = r5.f13622N
            if (r6 == 0) goto L_0x01c8
            com.google.android.gms.common.server.response.FastParser$a<java.lang.String> r6 = f13644r
            java.util.ArrayList r6 = r1.m19197a(r0, r6)
            r2.mo18504h(r5, r6)
            goto L_0x01b6
        L_0x01c8:
            java.lang.String r6 = r16.m19207c(r17)
            r2.mo18477a(r5, r6)
            goto L_0x01b6
        L_0x01d0:
            boolean r6 = r5.f13622N
            if (r6 == 0) goto L_0x01de
            com.google.android.gms.common.server.response.FastParser$a<java.lang.Boolean> r6 = f13643q
            java.util.ArrayList r6 = r1.m19197a(r0, r6)
            r2.mo18502g(r5, r6)
            goto L_0x01b6
        L_0x01de:
            r6 = 0
            boolean r10 = r1.m19201a(r0, r6)
            r2.mo18489a(r5, r10)
            goto L_0x026d
        L_0x01e8:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x01f7
            com.google.android.gms.common.server.response.FastParser$a<java.math.BigDecimal> r10 = f13646t
            java.util.ArrayList r10 = r1.m19197a(r0, r10)
            r2.mo18500f(r5, r10)
            goto L_0x026d
        L_0x01f7:
            java.math.BigDecimal r10 = r16.m19217i(r17)
            r2.mo18485a(r5, r10)
            goto L_0x026d
        L_0x0200:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x020e
            com.google.android.gms.common.server.response.FastParser$a<java.lang.Double> r10 = f13642p
            java.util.ArrayList r10 = r1.m19197a(r0, r10)
            r2.mo18498e(r5, r10)
            goto L_0x026d
        L_0x020e:
            double r10 = r16.m19216h(r17)
            r2.mo18473a(r5, r10)
            goto L_0x026d
        L_0x0216:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x0224
            com.google.android.gms.common.server.response.FastParser$a<java.lang.Float> r10 = f13641o
            java.util.ArrayList r10 = r1.m19197a(r0, r10)
            r2.mo18496d(r5, r10)
            goto L_0x026d
        L_0x0224:
            float r10 = r16.m19214g(r17)
            r2.mo18474a(r5, r10)
            goto L_0x026d
        L_0x022c:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x023a
            com.google.android.gms.common.server.response.FastParser$a<java.lang.Long> r10 = f13640n
            java.util.ArrayList r10 = r1.m19197a(r0, r10)
            r2.mo18494c(r5, r10)
            goto L_0x026d
        L_0x023a:
            long r10 = r16.m19210e(r17)
            r2.mo18476a(r5, r10)
            goto L_0x026d
        L_0x0242:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x0250
            com.google.android.gms.common.server.response.FastParser$a<java.math.BigInteger> r10 = f13645s
            java.util.ArrayList r10 = r1.m19197a(r0, r10)
            r2.mo18491b(r5, r10)
            goto L_0x026d
        L_0x0250:
            java.math.BigInteger r10 = r16.m19213f(r17)
            r2.mo18486a(r5, r10)
            goto L_0x026d
        L_0x0258:
            boolean r10 = r5.f13622N
            if (r10 == 0) goto L_0x0266
            com.google.android.gms.common.server.response.FastParser$a<java.lang.Integer> r10 = f13639m
            java.util.ArrayList r10 = r1.m19197a(r0, r10)
            r2.mo18487a(r5, r10)
            goto L_0x026d
        L_0x0266:
            int r10 = r16.m19209d(r17)
            r2.mo18475a(r5, r10)
        L_0x026d:
            r5 = 4
        L_0x026e:
            r1.m19198a(r5)
            r5 = 2
            r1.m19198a(r5)
            char r5 = r16.m19218j(r17)
            if (r5 == r13) goto L_0x0299
            if (r5 != r14) goto L_0x0280
            r5 = r9
            goto L_0x001d
        L_0x0280:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Expected end of object or field separator, but found: "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0299:
            java.lang.String r5 = r16.m19194a(r17)
            goto L_0x001d
        L_0x029f:
            r1.m19198a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.m19200a(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0032 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m19204b(java.io.BufferedReader r9, char[] r10, java.lang.StringBuilder r11, char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r11.setLength(r0)
            int r1 = r10.length
            r9.mark(r1)
            r1 = 0
            r2 = 0
        L_0x000a:
            int r3 = r9.read(r10)
            r4 = -1
            if (r3 == r4) goto L_0x0071
            r4 = r2
            r2 = r1
            r1 = 0
        L_0x0014:
            if (r1 >= r3) goto L_0x0067
            char r5 = r10[r1]
            boolean r6 = java.lang.Character.isISOControl(r5)
            r7 = 1
            if (r6 == 0) goto L_0x003a
            if (r12 == 0) goto L_0x002e
            r6 = 0
        L_0x0022:
            int r8 = r12.length
            if (r6 >= r8) goto L_0x002e
            char r8 = r12[r6]
            if (r8 != r5) goto L_0x002b
            r6 = 1
            goto L_0x002f
        L_0x002b:
            int r6 = r6 + 1
            goto L_0x0022
        L_0x002e:
            r6 = 0
        L_0x002f:
            if (r6 == 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected control character while reading string"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            r6 = 34
            if (r5 != r6) goto L_0x005b
            if (r2 != 0) goto L_0x005b
            r11.append(r10, r0, r1)
            r9.reset()
            int r1 = r1 + r7
            long r0 = (long) r1
            r9.skip(r0)
            if (r4 == 0) goto L_0x0056
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = com.google.android.gms.common.util.C4499r.m19403b(r9)
            return r9
        L_0x0056:
            java.lang.String r9 = r11.toString()
            return r9
        L_0x005b:
            r6 = 92
            if (r5 != r6) goto L_0x0063
            r2 = r2 ^ 1
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0067:
            r11.append(r10, r0, r3)
            int r1 = r10.length
            r9.mark(r1)
            r1 = r2
            r2 = r4
            goto L_0x000a
        L_0x0071:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected EOF while parsing string"
            r9.<init>(r10)
            goto L_0x007a
        L_0x0079:
            throw r9
        L_0x007a:
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.m19204b(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    /* renamed from: b */
    private final void m19205b(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.f13648b, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.f13648b[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    /* renamed from: a */
    private final String m19194a(BufferedReader bufferedReader) throws ParseException, IOException {
        this.f13652f.push(Integer.valueOf(2));
        char j = m19218j(bufferedReader);
        if (j == '\"') {
            this.f13652f.push(Integer.valueOf(3));
            String b = m19204b(bufferedReader, this.f13648b, this.f13650d, null);
            m19198a(3);
            if (m19218j(bufferedReader) == ':') {
                return b;
            }
            throw new ParseException("Expected key/value separator");
        } else if (j == ']') {
            m19198a(2);
            m19198a(1);
            m19198a(5);
            return null;
        } else if (j == '}') {
            m19198a(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(j);
            throw new ParseException(sb.toString());
        }
    }

    /* renamed from: a */
    private final <O> ArrayList<O> m19197a(BufferedReader bufferedReader, C4447a<O> aVar) throws ParseException, IOException {
        char j = m19218j(bufferedReader);
        if (j == 'n') {
            m19205b(bufferedReader, f13633g);
            return null;
        } else if (j == '[') {
            this.f13652f.push(Integer.valueOf(5));
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char j2 = m19218j(bufferedReader);
                if (j2 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (j2 != ',') {
                    if (j2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(aVar.mo18518a(this, bufferedReader));
                    } else {
                        m19198a(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    /* renamed from: a */
    private final String m19195a(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char j = m19218j(bufferedReader);
        if (j == '\"') {
            return m19204b(bufferedReader, cArr, sb, cArr2);
        }
        if (j == 'n') {
            m19205b(bufferedReader, f13633g);
            return null;
        }
        throw new ParseException("Expected string");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m19201a(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char j = m19218j(bufferedReader);
            if (j != '\"') {
                if (j == 'f') {
                    m19205b(bufferedReader, z ? f13637k : f13636j);
                    return false;
                } else if (j == 'n') {
                    m19205b(bufferedReader, f13633g);
                    return false;
                } else if (j == 't') {
                    m19205b(bufferedReader, z ? f13635i : f13634h);
                    return true;
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(j);
                    throw new ParseException(sb.toString());
                }
            } else if (!z) {
                z = true;
            } else {
                throw new ParseException("No boolean value found in string");
            }
        }
    }

    /* renamed from: a */
    private final <T extends FastJsonResponse> ArrayList<T> m19196a(BufferedReader bufferedReader, Field<?, ?> field) throws ParseException, IOException {
        String str = "Error instantiating inner object";
        ArrayList<T> arrayList = new ArrayList<>();
        char j = m19218j(bufferedReader);
        if (j == ']') {
            m19198a(5);
            return arrayList;
        } else if (j != 'n') {
            String str2 = "Unexpected token: ";
            if (j == '{') {
                this.f13652f.push(Integer.valueOf(1));
                while (true) {
                    try {
                        FastJsonResponse Q = field.mo18510Q();
                        if (!m19200a(bufferedReader, Q)) {
                            return arrayList;
                        }
                        arrayList.add(Q);
                        char j2 = m19218j(bufferedReader);
                        if (j2 != ',') {
                            if (j2 == ']') {
                                m19198a(5);
                                return arrayList;
                            }
                            StringBuilder sb = new StringBuilder(19);
                            sb.append(str2);
                            sb.append(j2);
                            throw new ParseException(sb.toString());
                        } else if (m19218j(bufferedReader) == '{') {
                            this.f13652f.push(Integer.valueOf(1));
                        } else {
                            throw new ParseException("Expected start of next object in array");
                        }
                    } catch (InstantiationException e) {
                        throw new ParseException(str, e);
                    } catch (IllegalAccessException e2) {
                        throw new ParseException(str, e2);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append(str2);
                sb2.append(j);
                throw new ParseException(sb2.toString());
            }
        } else {
            m19205b(bufferedReader, f13633g);
            m19198a(5);
            return null;
        }
    }

    /* renamed from: a */
    private final int m19193a(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char j = m19218j(bufferedReader);
        String str = "Unexpected EOF";
        if (j == 0) {
            throw new ParseException(str);
        } else if (j == ',') {
            throw new ParseException("Missing value");
        } else if (j == 'n') {
            m19205b(bufferedReader, f13633g);
            return 0;
        } else {
            bufferedReader.mark(1024);
            if (j == '\"') {
                i = 0;
                boolean z = false;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c != '\"' || z) {
                        z = c == '\\' ? !z : false;
                        i++;
                    } else {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    }
                }
            } else {
                cArr[0] = j;
                int i2 = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    if (cArr[i] == '}' || cArr[i] == ',' || Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException(str);
        }
    }

    /* renamed from: a */
    private final void m19198a(int i) throws ParseException {
        String str = "Expected state ";
        if (!this.f13652f.isEmpty()) {
            int intValue = ((Integer) this.f13652f.pop()).intValue();
            if (intValue != i) {
                StringBuilder sb = new StringBuilder(46);
                sb.append(str);
                sb.append(i);
                sb.append(" but had ");
                sb.append(intValue);
                throw new ParseException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(str);
        sb2.append(i);
        sb2.append(" but had empty stack");
        throw new ParseException(sb2.toString());
    }
}

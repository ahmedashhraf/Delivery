package p470h;

import com.google.common.base.C5785c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jivesoftware.smack.util.MAC;
import org.jivesoftware.smack.util.StringUtils;
import p201f.p202a.C5952h;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: h.f */
/* compiled from: ByteString */
public class C13896f implements Serializable, Comparable<C13896f> {

    /* renamed from: O */
    static final char[] f40351O = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: P */
    public static final C13896f f40352P = m59656e(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    transient String f40353N;

    /* renamed from: a */
    final byte[] f40354a;

    /* renamed from: b */
    transient int f40355b;

    C13896f(byte[] bArr) {
        this.f40354a = bArr;
    }

    /* renamed from: a */
    public static C13896f m59651a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C13893d0.m59606a((long) bArr.length, (long) i, (long) i2);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new C13896f(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    @C5952h
    /* renamed from: b */
    public static C13896f m59652b(String str) {
        if (str != null) {
            byte[] a = C13884b.m59469a(str);
            if (a != null) {
                return new C13896f(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: d */
    private C13896f m59654d(String str) {
        try {
            return m59656e(MessageDigest.getInstance(str).digest(this.f40354a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public static C13896f m59656e(byte... bArr) {
        if (bArr != null) {
            return new C13896f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        C13896f a = m59647a((InputStream) objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = C13896f.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, a.f40354a);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f40354a.length);
        objectOutputStream.write(this.f40354a);
    }

    /* renamed from: c */
    public C13896f mo43966c(C13896f fVar) {
        return m59648a(MAC.HMACSHA1, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.mo43958a(0, r3, 0, r3.length) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof p470h.C13896f
            r2 = 0
            if (r1 == 0) goto L_0x001c
            h.f r6 = (p470h.C13896f) r6
            int r1 = r6.mo43985r()
            byte[] r3 = r5.f40354a
            int r4 = r3.length
            if (r1 != r4) goto L_0x001c
            int r1 = r3.length
            boolean r6 = r6.mo43958a(r2, r3, r2, r1)
            if (r6 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p470h.C13896f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo43975f() {
        return C13884b.m59470b(this.f40354a);
    }

    /* renamed from: g */
    public String mo43977g() {
        byte[] bArr = this.f40354a;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f40351O;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & C5785c.f16698q];
        }
        return new String(cArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public byte[] mo43979h() {
        return this.f40354a;
    }

    public int hashCode() {
        int i = this.f40355b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f40354a);
        this.f40355b = hashCode;
        return hashCode;
    }

    /* renamed from: j */
    public C13896f mo43981j() {
        return m59654d(StringUtils.MD5);
    }

    /* renamed from: k */
    public C13896f mo43982k() {
        return m59654d("SHA-1");
    }

    /* renamed from: p */
    public C13896f mo43983p() {
        return m59654d(C14248i.f42026i);
    }

    /* renamed from: q */
    public C13896f mo43984q() {
        return m59654d("SHA-512");
    }

    /* renamed from: r */
    public int mo43985r() {
        return this.f40354a.length;
    }

    /* renamed from: s */
    public C13896f mo43986s() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f40354a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C13896f(bArr2);
            }
        }
    }

    /* renamed from: t */
    public C13896f mo43987t() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f40354a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 97 || b > 122) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new C13896f(bArr2);
            }
        }
    }

    public String toString() {
        String str;
        String str2;
        if (this.f40354a.length == 0) {
            return "[size=0]";
        }
        String v = mo43990v();
        int a = m59646a(v, 64);
        String str3 = "…]";
        String str4 = "[size=";
        String str5 = "]";
        if (a == -1) {
            if (this.f40354a.length <= 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(mo43977g());
                sb.append(str5);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(this.f40354a.length);
                sb2.append(" hex=");
                sb2.append(mo43953a(0, 64).mo43977g());
                sb2.append(str3);
                str2 = sb2.toString();
            }
            return str2;
        }
        String replace = v.substring(0, a).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a < v.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(this.f40354a.length);
            sb3.append(" text=");
            sb3.append(replace);
            sb3.append(str3);
            str = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[text=");
            sb4.append(replace);
            sb4.append(str5);
            str = sb4.toString();
        }
        return str;
    }

    /* renamed from: u */
    public byte[] mo43989u() {
        return (byte[]) this.f40354a.clone();
    }

    /* renamed from: v */
    public String mo43990v() {
        String str = this.f40353N;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f40354a, C13893d0.f40350a);
        this.f40353N = str2;
        return str2;
    }

    /* renamed from: c */
    public static C13896f m59653c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m59645a(str.charAt(i2)) << 4) + m59645a(str.charAt(i2 + 1)));
            }
            return m59656e(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    public final int mo43974f(C13896f fVar) {
        return mo43952a(fVar.mo43979h(), 0);
    }

    /* renamed from: h */
    public final boolean mo43978h(C13896f fVar) {
        return mo43957a(0, fVar, 0, fVar.mo43985r());
    }

    /* renamed from: e */
    public static C13896f m59655e(String str) {
        if (str != null) {
            C13896f fVar = new C13896f(str.getBytes(C13893d0.f40350a));
            fVar.f40353N = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: d */
    public C13896f mo43968d(C13896f fVar) {
        return m59648a("HmacSHA256", fVar);
    }

    /* renamed from: b */
    public C13896f mo43963b(int i) {
        return mo43953a(i, this.f40354a.length);
    }

    /* renamed from: d */
    public ByteBuffer mo43969d() {
        return ByteBuffer.wrap(this.f40354a).asReadOnlyBuffer();
    }

    /* renamed from: b */
    public final boolean mo43964b(C13896f fVar) {
        return mo43957a(mo43985r() - fVar.mo43985r(), fVar, 0, fVar.mo43985r());
    }

    /* renamed from: d */
    public final boolean mo43970d(byte[] bArr) {
        return mo43958a(0, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C13896f m59650a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C13896f(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: b */
    public final int mo43961b(byte[] bArr) {
        return mo43952a(bArr, 0);
    }

    /* renamed from: e */
    public String mo43972e() {
        return C13884b.m59467a(this.f40354a);
    }

    /* renamed from: g */
    public final int mo43976g(C13896f fVar) {
        return mo43962b(fVar.mo43979h(), mo43985r());
    }

    /* renamed from: b */
    public final int mo43960b(C13896f fVar, int i) {
        return mo43962b(fVar.mo43979h(), i);
    }

    /* renamed from: e */
    public C13896f mo43971e(C13896f fVar) {
        return m59648a("HmacSHA512", fVar);
    }

    /* renamed from: b */
    public int mo43962b(byte[] bArr, int i) {
        for (int min = Math.min(i, this.f40354a.length - bArr.length); min >= 0; min--) {
            if (C13893d0.m59608a(this.f40354a, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static C13896f m59649a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new C13896f(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    /* renamed from: c */
    public final int mo43965c(byte[] bArr) {
        return mo43962b(bArr, mo43985r());
    }

    /* renamed from: a */
    public String mo43954a(Charset charset) {
        if (charset != null) {
            return new String(this.f40354a, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: a */
    private C13896f m59648a(String str, C13896f fVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(fVar.mo43989u(), str));
            return m59656e(instance.doFinal(this.f40354a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    private static int m59645a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static C13896f m59647a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new C13896f(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public C13896f mo43953a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f40354a;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f40354a, i, bArr2, 0, i3);
                    return new C13896f(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > length(");
                sb.append(this.f40354a.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo43949a(int i) {
        return this.f40354a[i];
    }

    /* renamed from: a */
    public void mo43956a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f40354a);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43955a(C13887c cVar) {
        byte[] bArr = this.f40354a;
        cVar.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo43957a(int i, C13896f fVar, int i2, int i3) {
        return fVar.mo43958a(i2, this.f40354a, i, i3);
    }

    /* renamed from: a */
    public boolean mo43958a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f40354a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C13893d0.m59608a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo43959a(byte[] bArr) {
        return mo43958a(mo43985r() - bArr.length, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final int mo43951a(C13896f fVar, int i) {
        return mo43952a(fVar.mo43979h(), i);
    }

    /* renamed from: a */
    public int mo43952a(byte[] bArr, int i) {
        int length = this.f40354a.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (C13893d0.m59608a(this.f40354a, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int compareTo(C13896f fVar) {
        int r = mo43985r();
        int r2 = fVar.mo43985r();
        int min = Math.min(r, r2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                byte a = mo43949a(i) & 255;
                byte a2 = fVar.mo43949a(i) & 255;
                if (a == a2) {
                    i++;
                } else {
                    if (a >= a2) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (r == r2) {
                return 0;
            } else {
                if (r >= r2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* renamed from: a */
    static int m59646a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}

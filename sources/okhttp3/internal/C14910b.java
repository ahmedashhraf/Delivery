package okhttp3.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.http2.C14964b;
import p201f.p202a.C5952h;
import p468g.C13817d0;
import p468g.C13826f0;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13868v;
import p468g.C13872x;
import p470h.C13883a0;
import p470h.C13887c;
import p470h.C13894e;
import p470h.C13896f;

/* renamed from: okhttp3.internal.b */
/* compiled from: Util */
public final class C14910b {

    /* renamed from: a */
    public static final byte[] f43158a = new byte[0];

    /* renamed from: b */
    public static final String[] f43159b = new String[0];

    /* renamed from: c */
    public static final C13826f0 f43160c = C13826f0.create((C13872x) null, f43158a);

    /* renamed from: d */
    public static final C13817d0 f43161d = C13817d0.create((C13872x) null, f43158a);

    /* renamed from: e */
    private static final C13896f f43162e = C13896f.m59653c("efbbbf");

    /* renamed from: f */
    private static final C13896f f43163f = C13896f.m59653c("feff");

    /* renamed from: g */
    private static final C13896f f43164g = C13896f.m59653c("fffe");

    /* renamed from: h */
    private static final C13896f f43165h = C13896f.m59653c("0000ffff");

    /* renamed from: i */
    private static final C13896f f43166i = C13896f.m59653c("ffff0000");

    /* renamed from: j */
    public static final Charset f43167j = Charset.forName("UTF-8");

    /* renamed from: k */
    public static final Charset f43168k = Charset.forName("ISO-8859-1");

    /* renamed from: l */
    private static final Charset f43169l = Charset.forName("UTF-16BE");

    /* renamed from: m */
    private static final Charset f43170m = Charset.forName("UTF-16LE");

    /* renamed from: n */
    private static final Charset f43171n = Charset.forName("UTF-32BE");

    /* renamed from: o */
    private static final Charset f43172o = Charset.forName("UTF-32LE");

    /* renamed from: p */
    public static final TimeZone f43173p = TimeZone.getTimeZone("GMT");

    /* renamed from: q */
    public static final Comparator<String> f43174q = new C14911a();

    /* renamed from: r */
    private static final Method f43175r;

    /* renamed from: s */
    private static final Pattern f43176s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: okhttp3.internal.b$a */
    /* compiled from: Util */
    class C14911a implements Comparator<String> {
        C14911a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: okhttp3.internal.b$b */
    /* compiled from: Util */
    class C14912b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f43177a;

        /* renamed from: b */
        final /* synthetic */ boolean f43178b;

        C14912b(String str, boolean z) {
            this.f43177a = str;
            this.f43178b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f43177a);
            thread.setDaemon(this.f43178b);
            return thread;
        }
    }

    static {
        Method method = null;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f43175r = method;
    }

    private C14910b() {
    }

    /* renamed from: a */
    public static int m66037a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static void m66056a(Throwable th, Throwable th2) {
        Method method = f43175r;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m66067b(C13883a0 a0Var, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c = a0Var.timeout().mo43830d() ? a0Var.timeout().mo43829c() - nanoTime : Long.MAX_VALUE;
        a0Var.timeout().mo43824a(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C13887c cVar = new C13887c();
            while (a0Var.read(cVar, PlaybackStateCompat.f476k0) != -1) {
                cVar.mo43879d();
            }
            if (c == Long.MAX_VALUE) {
                a0Var.timeout().mo43823a();
            } else {
                a0Var.timeout().mo43824a(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                a0Var.timeout().mo43823a();
            } else {
                a0Var.timeout().mo43824a(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                a0Var.timeout().mo43823a();
            } else {
                a0Var.timeout().mo43824a(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static int m66071c(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static String m66072d(String str, int i, int i2) {
        int b = m66065b(str, i, i2);
        return str.substring(b, m66071c(str, b, i2));
    }

    /* renamed from: c */
    public static int m66070c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m66054a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static boolean m66061a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static boolean m66073d(String str) {
        return f43176s.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m66055a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m66058a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m66060a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m66057a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m66059a(C13883a0 a0Var, int i, TimeUnit timeUnit) {
        try {
            return m66067b(a0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m66049a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m66051a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: b */
    public static boolean m66069b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <T> List<T> m66050a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static ThreadFactory m66052a(String str, boolean z) {
        return new C14912b(str, z);
    }

    /* renamed from: b */
    public static int m66065b(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static String[] m66063a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    private static boolean m66068b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static C13866u m66066b(List<C14964b> list) {
        C13867a aVar = new C13867a();
        for (C14964b bVar : list) {
            Internal.instance.addLenient(aVar, bVar.f43412a.mo43990v(), bVar.f43413b.mo43990v());
        }
        return aVar.mo43627a();
    }

    /* renamed from: a */
    public static String m66043a(C13868v vVar, boolean z) {
        String str;
        String str2 = ":";
        if (vVar.mo43649h().contains(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(vVar.mo43649h());
            sb.append("]");
            str = sb.toString();
        } else {
            str = vVar.mo43649h();
        }
        if (!z && vVar.mo43656n() == C13868v.m59277e(vVar.mo43661s())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(vVar.mo43656n());
        return sb2.toString();
    }

    /* renamed from: a */
    public static boolean m66060a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static int m66041a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String[] m66064a(String[] strArr, String str) {
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* renamed from: a */
    public static int m66039a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m66038a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static String m66044a(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m66047a(str, 0, str.length());
            } else {
                inetAddress = m66047a(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m66046a(address);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m66068b(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m66045a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static Charset m66048a(C13894e eVar, Charset charset) throws IOException {
        if (eVar.mo43862a(0, f43162e)) {
            eVar.skip((long) f43162e.mo43985r());
            return f43167j;
        } else if (eVar.mo43862a(0, f43163f)) {
            eVar.skip((long) f43163f.mo43985r());
            return f43169l;
        } else if (eVar.mo43862a(0, f43164g)) {
            eVar.skip((long) f43164g.mo43985r());
            return f43170m;
        } else if (eVar.mo43862a(0, f43165h)) {
            eVar.skip((long) f43165h.mo43985r());
            return f43171n;
        } else if (!eVar.mo43862a(0, f43166i)) {
            return charset;
        } else {
            eVar.skip((long) f43166i.mo43985r());
            return f43172o;
        }
    }

    /* renamed from: a */
    public static int m66040a(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString());
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" too small.");
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public static AssertionError m66042a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    @C5952h
    /* renamed from: a */
    private static InetAddress m66047a(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == bArr.length) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m66062a(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int a = m66037a(str.charAt(i));
                    if (a == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + a;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != bArr.length) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, bArr.length - i10, i10);
            Arrays.fill(bArr, i4, (bArr.length - i3) + i4, 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static boolean m66062a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if (i6 == 0 && i != i5) {
                    return false;
                } else {
                    i6 = ((i6 * 10) + charAt) - 48;
                    if (i6 > 255) {
                        return false;
                    }
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            int i7 = i4 + 1;
            bArr[i4] = (byte) i6;
            i4 = i7;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m66046a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < bArr.length) {
            int i5 = i2;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i2;
            if (i6 > i4 && i6 >= 4) {
                i3 = i2;
                i4 = i6;
            }
            i2 = i5 + 2;
        }
        C13887c cVar = new C13887c();
        while (i < bArr.length) {
            if (i == i3) {
                cVar.writeByte(58);
                i += i4;
                if (i == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i > 0) {
                    cVar.writeByte(58);
                }
                cVar.m59547e((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.mo43923w();
    }

    /* renamed from: a */
    public static X509TrustManager m66053a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            throw m66042a("No System TLS", (Exception) e);
        }
    }
}

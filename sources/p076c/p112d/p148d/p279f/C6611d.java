package p076c.p112d.p148d.p279f;

import com.facebook.appevents.AppEventsConstants;
import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.p190io.C8366g;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p150g.C6637f;
import p076c.p112d.p148d.p276c.C6564n;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.f.d */
/* compiled from: InetAddresses */
public final class C6611d {

    /* renamed from: a */
    private static final int f18457a = 4;

    /* renamed from: b */
    private static final int f18458b = 8;

    /* renamed from: c */
    private static final Inet4Address f18459c = ((Inet4Address) m31445b("127.0.0.1"));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Inet4Address f18460d = ((Inet4Address) m31445b("0.0.0.0"));

    @C2775a
    /* renamed from: c.d.d.f.d$a */
    /* compiled from: InetAddresses */
    public static final class C6612a {

        /* renamed from: a */
        private final Inet4Address f18461a;

        /* renamed from: b */
        private final Inet4Address f18462b;

        /* renamed from: c */
        private final int f18463c;

        /* renamed from: d */
        private final int f18464d;

        public C6612a(@C5952h Inet4Address inet4Address, @C5952h Inet4Address inet4Address2, int i, int i2) {
            C7397x.m35672a(i >= 0 && i <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", Integer.valueOf(i));
            C7397x.m35672a(i2 >= 0 && i2 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", Integer.valueOf(i2));
            this.f18461a = (Inet4Address) C5827t.m25564b(inet4Address, C6611d.f18460d);
            this.f18462b = (Inet4Address) C5827t.m25564b(inet4Address2, C6611d.f18460d);
            this.f18463c = i;
            this.f18464d = i2;
        }

        /* renamed from: a */
        public Inet4Address mo26541a() {
            return this.f18462b;
        }

        /* renamed from: b */
        public int mo26542b() {
            return this.f18464d;
        }

        /* renamed from: c */
        public int mo26543c() {
            return this.f18463c;
        }

        /* renamed from: d */
        public Inet4Address mo26544d() {
            return this.f18461a;
        }
    }

    private C6611d() {
    }

    /* renamed from: b */
    public static InetAddress m31445b(String str) {
        byte[] d = m31453d(str);
        if (d != null) {
            return m31439a(d);
        }
        throw new IllegalArgumentException(String.format("'%s' is not an IP string literal.", new Object[]{str}));
    }

    /* renamed from: c */
    private static Inet4Address m31448c(byte[] bArr) {
        C7397x.m35672a(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", Integer.valueOf(bArr.length));
        return (Inet4Address) m31439a(bArr);
    }

    /* renamed from: d */
    private static byte[] m31453d(String str) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.') {
                z2 = true;
            } else if (charAt == ':') {
                if (z2) {
                    return null;
                }
                z = true;
            } else if (Character.digit(charAt, 16) == -1) {
                return null;
            }
        }
        if (z) {
            if (z2) {
                str = m31435a(str);
                if (str == null) {
                    return null;
                }
            }
            return m31468k(str);
        } else if (z2) {
            return m31467j(str);
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m31456e(String str) {
        return m31453d(str) != null;
    }

    /* renamed from: f */
    public static String m31457f(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return m31455e(inetAddress);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(m31455e(inetAddress));
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: g */
    public static boolean m31460g(String str) {
        try {
            m31449c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: h */
    private static short m31462h(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt <= 65535) {
            return (short) parseInt;
        }
        throw new NumberFormatException();
    }

    /* renamed from: i */
    private static byte m31464i(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt <= 255 && (!str.startsWith(AppEventsConstants.EVENT_PARAM_VALUE_NO) || str.length() <= 1)) {
            return (byte) parseInt;
        }
        throw new NumberFormatException();
    }

    /* renamed from: j */
    private static byte[] m31467j(String str) {
        String[] split = str.split("\\.", 5);
        if (split.length != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        while (i < bArr.length) {
            try {
                bArr[i] = m31464i(split[i]);
                i++;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* renamed from: k */
    private static byte[] m31468k(String str) {
        int i;
        int i2;
        String[] split = str.split(":", 10);
        if (split.length < 3 || split.length > 9) {
            return null;
        }
        int i3 = -1;
        for (int i4 = 1; i4 < split.length - 1; i4++) {
            if (split[i4].length() == 0) {
                if (i3 >= 0) {
                    return null;
                }
                i3 = i4;
            }
        }
        if (i3 >= 0) {
            i2 = (split.length - i3) - 1;
            if (split[0].length() == 0) {
                i = i3 - 1;
                if (i != 0) {
                    return null;
                }
            } else {
                i = i3;
            }
            if (split[split.length - 1].length() == 0) {
                i2--;
                if (i2 != 0) {
                    return null;
                }
            }
        } else {
            i = split.length;
            i2 = 0;
        }
        int i5 = 8 - (i + i2);
        if (i3 < 0 ? i5 != 0 : i5 < 1) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        int i6 = 0;
        while (i6 < i) {
            try {
                allocate.putShort(m31462h(split[i6]));
                i6++;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        for (int i7 = 0; i7 < i5; i7++) {
            allocate.putShort(0);
        }
        while (i2 > 0) {
            allocate.putShort(m31462h(split[split.length - i2]));
            i2--;
        }
        return allocate.array();
    }

    /* renamed from: a */
    private static String m31435a(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] j = m31467j(str.substring(lastIndexOf));
        if (j == null) {
            return null;
        }
        String hexString = Integer.toHexString(((j[0] & 255) << 8) | (j[1] & 255));
        String hexString2 = Integer.toHexString((j[3] & 255) | ((j[2] & 255) << 8));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(hexString);
        sb.append(":");
        sb.append(hexString2);
        return sb.toString();
    }

    /* renamed from: e */
    public static String m31455e(InetAddress inetAddress) {
        C7397x.m35664a(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        C7397x.m35670a(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 2;
            iArr[i] = C6637f.m31655a(0, 0, address[i2], address[i2 + 1]);
        }
        m31440a(iArr);
        return m31442b(iArr);
    }

    /* renamed from: g */
    public static boolean m31461g(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] == 32 && address[1] == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static InetAddress m31449c(String str) {
        int i;
        String str2;
        C7397x.m35664a(str);
        if (!str.startsWith("[") || !str.endsWith("]")) {
            i = 4;
            str2 = str;
        } else {
            str2 = str.substring(1, str.length() - 1);
            i = 16;
        }
        byte[] d = m31453d(str2);
        if (d != null && d.length == i) {
            return m31439a(d);
        }
        throw new IllegalArgumentException(String.format("Not a valid URI IP literal: '%s'", new Object[]{str}));
    }

    /* renamed from: h */
    public static boolean m31463h(Inet6Address inet6Address) {
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if (address[12] == 0 && address[13] == 0 && address[14] == 0 && (address[15] == 0 || address[15] == 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m31442b(int[] iArr) {
        StringBuilder sb = new StringBuilder(39);
        int i = 0;
        boolean z = false;
        while (i < iArr.length) {
            boolean z2 = iArr[i] >= 0;
            if (z2) {
                if (z) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(iArr[i]));
            } else if (i == 0 || z) {
                sb.append("::");
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static boolean m31459f(Inet6Address inet6Address) {
        return m31463h(inet6Address) || m31461g(inet6Address) || m31466j(inet6Address);
    }

    /* renamed from: i */
    public static boolean m31465i(Inet6Address inet6Address) {
        boolean z = false;
        if (m31466j(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if ((address[8] | 3) != 3) {
            return false;
        }
        if (address[9] == 0 && address[10] == 94 && address[11] == -2) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public static boolean m31458f(String str) {
        byte[] d = m31453d(str);
        if (d == null || d.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= 10) {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (d[i2] != -1) {
                        return false;
                    }
                }
                return true;
            } else if (d[i] != 0) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: j */
    public static boolean m31466j(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static Inet4Address m31451d(Inet6Address inet6Address) {
        C7397x.m35672a(m31465i(inet6Address), "Address '%s' is not an ISATAP address.", m31455e((InetAddress) inet6Address));
        return m31448c(m31441a(inet6Address.getAddress(), 12, 16));
    }

    /* renamed from: a */
    private static InetAddress m31439a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public static boolean m31452d(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        for (byte b : address) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static Inet4Address m31447c(Inet6Address inet6Address) {
        if (m31463h(inet6Address)) {
            return m31443b(inet6Address);
        }
        if (m31461g(inet6Address)) {
            return m31438a(inet6Address);
        }
        if (m31466j(inet6Address)) {
            return m31454e(inet6Address).mo26541a();
        }
        throw new IllegalArgumentException(String.format("'%s' has no embedded IPv4 address.", new Object[]{m31455e((InetAddress) inet6Address)}));
    }

    /* renamed from: a */
    private static void m31440a(int[] iArr) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length + 1; i4++) {
            if (i4 >= iArr.length || iArr[i4] != 0) {
                if (i3 >= 0) {
                    int i5 = i4 - i3;
                    if (i5 > i) {
                        i2 = i3;
                        i = i5;
                    }
                    i3 = -1;
                }
            } else if (i3 < 0) {
                i3 = i4;
            }
        }
        if (i >= 2) {
            Arrays.fill(iArr, i2, i + i2, -1);
        }
    }

    /* renamed from: b */
    public static Inet4Address m31443b(Inet6Address inet6Address) {
        C7397x.m35672a(m31463h(inet6Address), "Address '%s' is not IPv4-compatible.", m31455e((InetAddress) inet6Address));
        return m31448c(m31441a(inet6Address.getAddress(), 12, 16));
    }

    /* renamed from: e */
    public static C6612a m31454e(Inet6Address inet6Address) {
        C7397x.m35672a(m31466j(inet6Address), "Address '%s' is not a Teredo address.", m31455e((InetAddress) inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address c = m31448c(m31441a(address, 4, 8));
        short readShort = C8366g.m39814b(address, 8).readShort() & 65535;
        short readShort2 = 65535 & (C8366g.m39814b(address, 10).readShort() ^ -1);
        byte[] a = m31441a(address, 12, 16);
        for (int i = 0; i < a.length; i++) {
            a[i] = (byte) (a[i] ^ -1);
        }
        return new C6612a(c, m31448c(a), readShort2, readShort);
    }

    /* renamed from: b */
    public static Inet4Address m31444b(InetAddress inetAddress) {
        boolean z;
        long j;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i = 0;
        while (true) {
            if (i >= 15) {
                z = true;
                break;
            } else if (address[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z && address[15] == 1) {
            return f18459c;
        }
        if (z && address[15] == 0) {
            return f18460d;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        if (m31459f(inet6Address)) {
            j = (long) m31447c(inet6Address).hashCode();
        } else {
            j = ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int d = C6564n.m31267f().mo26436a(j).mo26495d() | -536870912;
        if (d == -1) {
            d = -2;
        }
        return m31448c(C6637f.m31676b(d));
    }

    /* renamed from: a */
    public static Inet4Address m31438a(Inet6Address inet6Address) {
        C7397x.m35672a(m31461g(inet6Address), "Address '%s' is not a 6to4 address.", m31455e((InetAddress) inet6Address));
        return m31448c(m31441a(inet6Address.getAddress(), 2, 6));
    }

    /* renamed from: a */
    public static int m31434a(InetAddress inetAddress) {
        return C8366g.m39792a(m31444b(inetAddress).getAddress()).readInt();
    }

    /* renamed from: a */
    public static Inet4Address m31437a(int i) {
        return m31448c(C6637f.m31676b(i));
    }

    /* renamed from: c */
    public static InetAddress m31450c(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == -1) {
            address[length] = 0;
            length--;
        }
        C7397x.m35672a(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return m31439a(address);
    }

    /* renamed from: a */
    private static byte[] m31441a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: b */
    public static InetAddress m31446b(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }
}

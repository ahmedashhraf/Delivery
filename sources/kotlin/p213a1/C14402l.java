package kotlin.p213a1;

import com.facebook.internal.NativeProtocol;
import kotlin.C14725k;
import kotlin.C6050b0;
import kotlin.C6096e0;
import kotlin.TypeCastException;
import kotlin.p214b1.C6053c;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.a1.l */
/* compiled from: PlatformImplementations.kt */
public final class C14402l {
    @C6003d
    @C6053c

    /* renamed from: a */
    public static final C14401k f42533a;

    static {
        C14401k kVar;
        int a = m62370a();
        String str = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations";
        if (a >= 65544) {
            try {
                Object newInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                if (newInstance != null) {
                    kVar = (C14401k) newInstance;
                    f42533a = kVar;
                }
                throw new TypeCastException(str);
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                if (newInstance2 != null) {
                    kVar = (C14401k) newInstance2;
                } else {
                    throw new TypeCastException(str);
                }
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (a >= 65543) {
            try {
                Object newInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                if (newInstance3 != null) {
                    kVar = (C14401k) newInstance3;
                    f42533a = kVar;
                }
                throw new TypeCastException(str);
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                if (newInstance4 != null) {
                    kVar = (C14401k) newInstance4;
                } else {
                    throw new TypeCastException(str);
                }
            } catch (ClassNotFoundException unused4) {
            }
        }
        kVar = new C14401k();
        f42533a = kVar;
    }

    /* renamed from: a */
    private static final int m62370a() {
        String property = System.getProperty("java.specification.version");
        int i = NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
        if (property == null) {
            return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
        }
        int a = C6112z.m27935a((CharSequence) property, '.', 0, false, 6, (Object) null);
        if (a < 0) {
            try {
                i = Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a + 1;
        int a2 = C6112z.m27935a((CharSequence) property, '.', i2, false, 4, (Object) null);
        if (a2 < 0) {
            a2 = property.length();
        }
        String str = "null cannot be cast to non-null type java.lang.String";
        if (property != null) {
            String substring = property.substring(0, a);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            C14445h0.m62453a((Object) substring, str2);
            if (property != null) {
                String substring2 = property.substring(i2, a2);
                C14445h0.m62453a((Object) substring2, str2);
                try {
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }

    @C6096e0(version = "1.2")
    @C6050b0
    /* renamed from: a */
    public static final boolean m62371a(int i, int i2, int i3) {
        return C14725k.f42969Q.mo45977a(i, i2, i3);
    }
}

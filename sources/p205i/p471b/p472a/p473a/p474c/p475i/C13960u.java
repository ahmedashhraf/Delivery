package p205i.p471b.p472a.p473a.p474c.p475i;

import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1007o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: i.b.a.a.c.i.u */
/* compiled from: Type */
public class C13960u {

    /* renamed from: e */
    public static final int f40982e = 0;

    /* renamed from: f */
    public static final int f40983f = 1;

    /* renamed from: g */
    public static final int f40984g = 2;

    /* renamed from: h */
    public static final int f40985h = 3;

    /* renamed from: i */
    public static final int f40986i = 4;

    /* renamed from: j */
    public static final int f40987j = 5;

    /* renamed from: k */
    public static final int f40988k = 6;

    /* renamed from: l */
    public static final int f40989l = 7;

    /* renamed from: m */
    public static final int f40990m = 8;

    /* renamed from: n */
    public static final int f40991n = 9;

    /* renamed from: o */
    public static final int f40992o = 10;

    /* renamed from: p */
    public static final int f40993p = 11;

    /* renamed from: q */
    public static final C13960u f40994q = new C13960u(0, null, 1443168256, 1);

    /* renamed from: r */
    public static final C13960u f40995r = new C13960u(1, null, 1509950721, 1);

    /* renamed from: s */
    public static final C13960u f40996s = new C13960u(2, null, 1124075009, 1);

    /* renamed from: t */
    public static final C13960u f40997t = new C13960u(3, null, 1107297537, 1);

    /* renamed from: u */
    public static final C13960u f40998u = new C13960u(4, null, 1392510721, 1);

    /* renamed from: v */
    public static final C13960u f40999v = new C13960u(5, null, 1224736769, 1);

    /* renamed from: w */
    public static final C13960u f41000w = new C13960u(6, null, 1174536705, 1);

    /* renamed from: x */
    public static final C13960u f41001x = new C13960u(7, null, 1241579778, 1);

    /* renamed from: y */
    public static final C13960u f41002y = new C13960u(8, null, 1141048066, 1);

    /* renamed from: a */
    private final int f41003a;

    /* renamed from: b */
    private final char[] f41004b;

    /* renamed from: c */
    private final int f41005c;

    /* renamed from: d */
    private final int f41006d;

    private C13960u(int i, char[] cArr, int i2, int i3) {
        this.f41003a = i;
        this.f41004b = cArr;
        this.f41005c = i2;
        this.f41006d = i3;
    }

    /* renamed from: a */
    public static C13960u[] m60138a(String str) {
        char[] charArray = str.toCharArray();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = charArray[i2];
            if (c == ')') {
                break;
            } else if (c == 'L') {
                while (true) {
                    i2 = i4 + 1;
                    if (charArray[i4] == ';') {
                        break;
                    }
                    i4 = i2;
                }
                i3++;
            } else {
                if (c != '[') {
                    i3++;
                }
                i2 = i4;
            }
        }
        C13960u[] uVarArr = new C13960u[i3];
        int i5 = 0;
        while (charArray[i] != ')') {
            uVarArr[i5] = m60132a(charArray, i);
            i += uVarArr[i5].f41006d + (uVarArr[i5].f41003a == 10 ? 2 : 0);
            i5++;
        }
        return uVarArr;
    }

    /* renamed from: b */
    public static C13960u m60141b(C13960u uVar, C13960u... uVarArr) {
        return m60151f(m60133a(uVar, uVarArr));
    }

    /* renamed from: c */
    public static C13960u m60146c(String str) {
        return m60132a(str.toCharArray(), 0);
    }

    /* renamed from: d */
    public static C13960u m60148d(String str) {
        char[] charArray = str.toCharArray();
        return new C13960u(charArray[0] == '[' ? 9 : 10, charArray, 0, charArray.length);
    }

    /* renamed from: e */
    public static C13960u m60150e(String str) {
        char[] charArray = str.toCharArray();
        int i = 1;
        while (true) {
            int i2 = i + 1;
            char c = charArray[i];
            if (c == ')') {
                return m60132a(charArray, i2);
            }
            if (c == 'L') {
                while (true) {
                    i = i2 + 1;
                    if (charArray[i2] == ';') {
                        break;
                    }
                    i2 = i;
                }
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: f */
    public static C13960u m60151f(String str) {
        return m60132a(str.toCharArray(), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13960u)) {
            return false;
        }
        C13960u uVar = (C13960u) obj;
        int i = this.f41003a;
        if (i != uVar.f41003a) {
            return false;
        }
        if (i >= 9) {
            int i2 = this.f41006d;
            if (i2 != uVar.f41006d) {
                return false;
            }
            int i3 = this.f41005c;
            int i4 = uVar.f41005c;
            int i5 = i2 + i3;
            while (i3 < i5) {
                if (this.f41004b[i3] != uVar.f41004b[i4]) {
                    return false;
                }
                i3++;
                i4++;
            }
        }
        return true;
    }

    /* renamed from: g */
    public String mo44208g() {
        return new String(this.f41004b, this.f41005c, this.f41006d);
    }

    /* renamed from: h */
    public C13960u mo44209h() {
        return m60150e(mo44204d());
    }

    public int hashCode() {
        int i = this.f41003a;
        int i2 = i * 13;
        if (i >= 9) {
            int i3 = this.f41005c;
            int i4 = this.f41006d + i3;
            while (i3 < i4) {
                i2 = (i2 + this.f41004b[i3]) * 17;
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: i */
    public int mo44211i() {
        if (this.f41004b == null) {
            return this.f41005c & 255;
        }
        return 1;
    }

    /* renamed from: j */
    public int mo44212j() {
        return this.f41003a;
    }

    public String toString() {
        return mo44204d();
    }

    /* renamed from: b */
    public static C13960u m60142b(Constructor<?> constructor) {
        return m60151f(m60135a(constructor));
    }

    /* renamed from: c */
    public static C13960u m60145c(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return m60151f(m60134a(cls));
        }
        if (cls == Integer.TYPE) {
            return f40999v;
        }
        if (cls == Void.TYPE) {
            return f40994q;
        }
        if (cls == Boolean.TYPE) {
            return f40995r;
        }
        if (cls == Byte.TYPE) {
            return f40997t;
        }
        if (cls == Character.TYPE) {
            return f40996s;
        }
        if (cls == Short.TYPE) {
            return f40998u;
        }
        if (cls == Double.TYPE) {
            return f41002y;
        }
        if (cls == Float.TYPE) {
            return f41000w;
        }
        return f41001x;
    }

    /* renamed from: f */
    public C13960u mo44207f() {
        return m60132a(this.f41004b, this.f41005c + mo44205e());
    }

    /* renamed from: b */
    public static int m60140b(String str) {
        int i;
        char charAt;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            i = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 == ')') {
                break;
            } else if (charAt2 == 'L') {
                while (true) {
                    i3 = i + 1;
                    if (str.charAt(i) == ';') {
                        break;
                    }
                    i = i3;
                }
                i4++;
            } else {
                if (charAt2 == '[') {
                    while (true) {
                        charAt = str.charAt(i);
                        if (charAt != '[') {
                            break;
                        }
                        i++;
                    }
                    if (charAt == 'D' || charAt == 'J') {
                        i4--;
                    }
                } else {
                    i4 = (charAt2 == 'D' || charAt2 == 'J') ? i4 + 2 : i4 + 1;
                }
                i3 = i;
            }
        }
        char charAt3 = str.charAt(i);
        int i5 = i4 << 2;
        if (charAt3 == 'V') {
            i2 = 0;
        } else if (charAt3 == 'D' || charAt3 == 'J') {
            i2 = 2;
        }
        return i5 | i2;
    }

    /* renamed from: d */
    public static C13960u m60149d(Method method) {
        return m60151f(m60144b(method));
    }

    /* renamed from: d */
    public String mo44204d() {
        StringBuilder sb = new StringBuilder();
        m60136a(sb);
        return sb.toString();
    }

    /* renamed from: e */
    public int mo44205e() {
        int i = 1;
        while (this.f41004b[this.f41005c + i] == '[') {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public int mo44202b() {
        return m60140b(mo44204d());
    }

    /* renamed from: a */
    public static C13960u[] m60139a(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        C13960u[] uVarArr = new C13960u[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            uVarArr[length] = m60145c(parameterTypes[length]);
        }
        return uVarArr;
    }

    /* renamed from: b */
    public static String m60143b(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    /* renamed from: b */
    public static String m60144b(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class a : parameterTypes) {
            m60137a(sb, a);
        }
        sb.append(')');
        m60137a(sb, method.getReturnType());
        return sb.toString();
    }

    /* renamed from: a */
    private static C13960u m60132a(char[] cArr, int i) {
        int i2;
        char c = cArr[i];
        if (c == 'F') {
            return f41000w;
        }
        if (c == 'L') {
            int i3 = 1;
            while (cArr[i + i3] != ';') {
                i3++;
            }
            return new C13960u(10, cArr, i + 1, i3 - 1);
        } else if (c == 'S') {
            return f40998u;
        } else {
            if (c == 'V') {
                return f40994q;
            }
            if (c == 'I') {
                return f40999v;
            }
            if (c == 'J') {
                return f41001x;
            }
            if (c == 'Z') {
                return f40995r;
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        return f40997t;
                    case 'C':
                        return f40996s;
                    case 'D':
                        return f41002y;
                    default:
                        return new C13960u(11, cArr, i, cArr.length - i);
                }
            } else {
                int i4 = 1;
                while (true) {
                    i2 = i + i4;
                    if (cArr[i2] != '[') {
                        break;
                    }
                    i4++;
                }
                if (cArr[i2] == 'L') {
                    do {
                        i4++;
                    } while (cArr[i + i4] != ';');
                }
                return new C13960u(9, cArr, i, i4 + 1);
            }
        }
    }

    /* renamed from: c */
    public static C13960u m60147c(Method method) {
        return m60145c(method.getReturnType());
    }

    /* renamed from: c */
    public String mo44203c() {
        switch (this.f41003a) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuilder sb = new StringBuilder(mo44207f().mo44203c());
                for (int e = mo44205e(); e > 0; e--) {
                    sb.append("[]");
                }
                return sb.toString();
            case 10:
                return new String(this.f41004b, this.f41005c, this.f41006d).replace('/', '.');
            default:
                return null;
        }
    }

    /* renamed from: a */
    public C13960u[] mo44201a() {
        return m60138a(mo44204d());
    }

    /* renamed from: a */
    public static String m60133a(C13960u uVar, C13960u... uVarArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (C13960u a : uVarArr) {
            a.m60136a(sb);
        }
        sb.append(')');
        uVar.m60136a(sb);
        return sb.toString();
    }

    /* renamed from: a */
    private void m60136a(StringBuilder sb) {
        char[] cArr = this.f41004b;
        if (cArr == null) {
            sb.append((char) ((this.f41005c & C0962e0.f4343t) >>> 24));
        } else if (this.f41003a == 10) {
            sb.append('L');
            sb.append(this.f41004b, this.f41005c, this.f41006d);
            sb.append(';');
        } else {
            sb.append(cArr, this.f41005c, this.f41006d);
        }
    }

    /* renamed from: a */
    public static String m60134a(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        m60137a(sb, cls);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m60135a(Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class a : parameterTypes) {
            m60137a(sb, a);
        }
        sb.append(")V");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m60137a(StringBuilder sb, Class<?> cls) {
        while (!cls.isPrimitive()) {
            if (cls.isArray()) {
                sb.append('[');
                cls = cls.getComponentType();
            } else {
                sb.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char charAt = name.charAt(i);
                    if (charAt == '.') {
                        charAt = '/';
                    }
                    sb.append(charAt);
                }
                sb.append(';');
                return;
            }
        }
        char c = cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? 'Z' : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J';
        sb.append(c);
    }

    /* renamed from: a */
    public int mo44200a(int i) {
        int i2 = 4;
        if (i == 46 || i == 79) {
            if (this.f41004b == null) {
                i2 = (this.f41005c & C1007o.f4488f) >> 8;
            }
            return i + i2;
        }
        if (this.f41004b == null) {
            i2 = (this.f41005c & 16711680) >> 16;
        }
        return i + i2;
    }
}

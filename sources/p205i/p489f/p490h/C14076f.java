package p205i.p489f.p490h;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i.f.h.f */
/* compiled from: MessageFormatter */
public final class C14076f {

    /* renamed from: a */
    static final char f41358a = '{';

    /* renamed from: b */
    static final char f41359b = '}';

    /* renamed from: c */
    static final String f41360c = "{}";

    /* renamed from: d */
    private static final char f41361d = '\\';

    /* renamed from: a */
    public static final C14074d m60807a(String str, Object obj) {
        return m60809a(str, new Object[]{obj});
    }

    /* renamed from: b */
    static final boolean m60823b(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* renamed from: a */
    public static final C14074d m60808a(String str, Object obj, Object obj2) {
        return m60809a(str, new Object[]{obj, obj2});
    }

    /* renamed from: a */
    static final Throwable m60810a(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th = objArr[objArr.length - 1];
            if (th instanceof Throwable) {
                return th;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C14074d m60809a(String str, Object[] objArr) {
        int i;
        Throwable a = m60810a(objArr);
        if (str == null) {
            return new C14074d(null, objArr, a);
        }
        if (objArr == null) {
            return new C14074d(str);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf(f41360c, i3);
            if (indexOf != -1) {
                if (!m60823b(str, indexOf)) {
                    stringBuffer.append(str.substring(i3, indexOf));
                    m60812a(stringBuffer, objArr[i2], (Map) new HashMap());
                } else if (!m60822a(str, indexOf)) {
                    i2--;
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    stringBuffer.append(f41358a);
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    m60812a(stringBuffer, objArr[i2], (Map) new HashMap());
                }
                i = indexOf + 2;
                i3 = i;
                i2++;
            } else if (i3 == 0) {
                return new C14074d(str, objArr, a);
            } else {
                stringBuffer.append(str.substring(i3, str.length()));
                return new C14074d(stringBuffer.toString(), objArr, a);
            }
        }
        stringBuffer.append(str.substring(i3, str.length()));
        if (i2 < objArr.length - 1) {
            return new C14074d(stringBuffer.toString(), objArr, a);
        }
        return new C14074d(stringBuffer.toString(), objArr, null);
    }

    /* renamed from: a */
    static final boolean m60822a(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    /* renamed from: a */
    private static void m60812a(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            m60811a(stringBuffer, obj);
        } else if (obj instanceof boolean[]) {
            m60821a(stringBuffer, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m60813a(stringBuffer, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m60814a(stringBuffer, (char[]) obj);
        } else if (obj instanceof short[]) {
            m60820a(stringBuffer, (short[]) obj);
        } else if (obj instanceof int[]) {
            m60817a(stringBuffer, (int[]) obj);
        } else if (obj instanceof long[]) {
            m60818a(stringBuffer, (long[]) obj);
        } else if (obj instanceof float[]) {
            m60816a(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            m60815a(stringBuffer, (double[]) obj);
        } else {
            m60819a(stringBuffer, (Object[]) obj, map);
        }
    }

    /* renamed from: a */
    private static void m60811a(StringBuffer stringBuffer, Object obj) {
        try {
            stringBuffer.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("SLF4J: Failed toString() invocation on an object of type [");
            sb.append(obj.getClass().getName());
            sb.append("]");
            printStream.println(sb.toString());
            th.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    /* renamed from: a */
    private static void m60819a(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m60812a(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60821a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60813a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60814a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60820a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60817a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60818a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60816a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m60815a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }
}

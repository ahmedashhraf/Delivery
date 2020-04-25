package org.jcodec.common.tools;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.p217i1.C14662d0;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;

public class ToJSON {
    static Set<String> omitMethods = new HashSet();
    static Set<Class> primitive = new HashSet();

    static {
        primitive.add(Boolean.class);
        primitive.add(Byte.class);
        primitive.add(Short.class);
        primitive.add(Integer.class);
        primitive.add(Long.class);
        primitive.add(Float.class);
        primitive.add(Double.class);
        primitive.add(Character.class);
        omitMethods.add("getClass");
        omitMethods.add("get");
    }

    public static List<String> allFields(Class cls) {
        return allFieldsExcept(cls, new String[0]);
    }

    public static List<String> allFieldsExcept(Class cls, String... strArr) {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getDeclaredMethods()) {
            if (isGetter(method)) {
                try {
                    arrayList.add(toName(method));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    private static void escape(String str, StringBuilder sb) {
        char[] charArray;
        for (char c : str.toCharArray()) {
            if (c < ' ') {
                sb.append(String.format("\\%02x", new Object[]{Integer.valueOf(c)}));
            } else {
                sb.append(c);
            }
        }
    }

    public static void fieldsToJSON(Object obj, StringBuilder sb, String... strArr) {
        Method[] methods = obj.getClass().getMethods();
        for (String str : strArr) {
            Method findGetter = findGetter(methods, str);
            if (findGetter != null) {
                invoke(obj, new IntArrayList(), sb, findGetter, str);
            }
        }
    }

    private static Method findGetter(Method[] methodArr, String str) {
        String str2 = getterName("is", str);
        String str3 = getterName("get", str);
        for (Method method : methodArr) {
            if ((str2.equals(method.getName()) || str3.equals(method.getName())) && isGetter(method)) {
                return method;
            }
        }
        return null;
    }

    private static String getterName(String str, String str2) {
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            if (charArray.length == 0) {
                return str;
            }
            if (charArray.length <= 1 || !Character.isUpperCase(charArray[1])) {
                charArray[0] = Character.toUpperCase(charArray[0]);
            } else {
                charArray[0] = Character.toLowerCase(charArray[0]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(new String(charArray));
            return sb.toString();
        }
        throw new IllegalArgumentException("Passed null string as field name");
    }

    private static void invoke(Object obj, IntArrayList intArrayList, StringBuilder sb, Method method, String str) {
        try {
            Object invoke = method.invoke(obj, new Object[0]);
            sb.append(C14662d0.f42850a);
            sb.append(str);
            sb.append("\":");
            if (invoke == null || !primitive.contains(invoke.getClass())) {
                toJSONSub(invoke, intArrayList, sb);
            } else {
                sb.append(invoke);
            }
            sb.append(",");
        } catch (Exception unused) {
        }
    }

    public static boolean isGetter(Method method) {
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        if ((method.getName().startsWith("get") || (method.getName().startsWith("is") && method.getReturnType() == Boolean.TYPE)) && method.getParameterTypes().length == 0 && !Void.TYPE.equals(method.getReturnType())) {
            return true;
        }
        return false;
    }

    public static String toJSON(Object obj) {
        StringBuilder sb = new StringBuilder();
        toJSONSub(obj, new IntArrayList(), sb);
        return sb.toString();
    }

    private static void toJSONSub(Object obj, IntArrayList intArrayList, StringBuilder sb) {
        int identityHashCode = System.identityHashCode(obj);
        if (intArrayList.contains(identityHashCode)) {
            sb.append("\"!-!-!-!-LOOP-!-!-!-!\"");
            return;
        }
        intArrayList.push(identityHashCode);
        if (obj instanceof ByteBuffer) {
            obj = NIOUtils.toArray((ByteBuffer) obj);
        }
        if (obj == null) {
            sb.append("null");
        } else {
            String str = "\"";
            if (obj instanceof String) {
                sb.append(str);
                escape((String) obj, sb);
                sb.append(str);
            } else {
                String str2 = "}";
                String str3 = "{";
                String str4 = ",";
                if (obj instanceof Map) {
                    Iterator it = ((Map) obj).entrySet().iterator();
                    sb.append(str3);
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        sb.append(str);
                        sb.append(entry.getKey());
                        sb.append("\":");
                        toJSONSub(entry.getValue(), intArrayList, sb);
                        if (it.hasNext()) {
                            sb.append(str4);
                        }
                    }
                    sb.append(str2);
                } else {
                    String str5 = "]";
                    String str6 = "[";
                    if (obj instanceof Iterable) {
                        Iterator it2 = ((Iterable) obj).iterator();
                        sb.append(str6);
                        while (it2.hasNext()) {
                            toJSONSub(it2.next(), intArrayList, sb);
                            if (it2.hasNext()) {
                                sb.append(str4);
                            }
                        }
                        sb.append(str5);
                    } else {
                        int i = 0;
                        if (obj instanceof Object[]) {
                            sb.append(str6);
                            int length = Array.getLength(obj);
                            while (i < length) {
                                toJSONSub(Array.get(obj, i), intArrayList, sb);
                                if (i < length - 1) {
                                    sb.append(str4);
                                }
                                i++;
                            }
                            sb.append(str5);
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            sb.append(str6);
                            for (int i2 = 0; i2 < jArr.length; i2++) {
                                sb.append(String.format("0x%016x", new Object[]{Long.valueOf(jArr[i2])}));
                                if (i2 < jArr.length - 1) {
                                    sb.append(str4);
                                }
                            }
                            sb.append(str5);
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            sb.append(str6);
                            for (int i3 = 0; i3 < iArr.length; i3++) {
                                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(iArr[i3])}));
                                if (i3 < iArr.length - 1) {
                                    sb.append(str4);
                                }
                            }
                            sb.append(str5);
                        } else if (obj instanceof float[]) {
                            float[] fArr = (float[]) obj;
                            sb.append(str6);
                            for (int i4 = 0; i4 < fArr.length; i4++) {
                                sb.append(String.format(".3f", new Object[]{Float.valueOf(fArr[i4])}));
                                if (i4 < fArr.length - 1) {
                                    sb.append(str4);
                                }
                            }
                            sb.append(str5);
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            sb.append(str6);
                            for (int i5 = 0; i5 < dArr.length; i5++) {
                                sb.append(String.format(".6f", new Object[]{Double.valueOf(dArr[i5])}));
                                if (i5 < dArr.length - 1) {
                                    sb.append(str4);
                                }
                            }
                            sb.append(str5);
                        } else if (obj instanceof short[]) {
                            short[] sArr = (short[]) obj;
                            sb.append(str6);
                            for (int i6 = 0; i6 < sArr.length; i6++) {
                                sb.append(String.format("0x%04x", new Object[]{Short.valueOf(sArr[i6])}));
                                if (i6 < sArr.length - 1) {
                                    sb.append(str4);
                                }
                            }
                            sb.append(str5);
                        } else if (obj instanceof byte[]) {
                            byte[] bArr = (byte[]) obj;
                            sb.append(str6);
                            for (int i7 = 0; i7 < bArr.length; i7++) {
                                sb.append(String.format("0x%02x", new Object[]{Byte.valueOf(bArr[i7])}));
                                if (i7 < bArr.length - 1) {
                                    sb.append(str4);
                                }
                            }
                            sb.append(str5);
                        } else if (obj instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj;
                            sb.append(str6);
                            while (i < zArr.length) {
                                sb.append(zArr[i]);
                                if (i < zArr.length - 1) {
                                    sb.append(str4);
                                }
                                i++;
                            }
                            sb.append(str5);
                        } else {
                            sb.append(str3);
                            Method[] methods = obj.getClass().getMethods();
                            int length2 = methods.length;
                            while (i < length2) {
                                Method method = methods[i];
                                if (!omitMethods.contains(method.getName()) && isGetter(method)) {
                                    invoke(obj, intArrayList, sb, method, toName(method));
                                }
                                i++;
                            }
                            sb.append(str2);
                        }
                    }
                }
            }
        }
        intArrayList.pop();
    }

    private static String toName(Method method) {
        if (isGetter(method)) {
            char[] charArray = method.getName().toCharArray();
            int i = charArray[0] == 'g' ? 3 : 2;
            charArray[i] = Character.toLowerCase(charArray[i]);
            return new String(charArray, i, charArray.length - i);
        }
        throw new IllegalArgumentException("Not a getter");
    }
}

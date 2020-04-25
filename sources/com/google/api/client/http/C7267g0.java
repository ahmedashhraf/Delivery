package com.google.api.client.http;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C2752o;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6398n;
import p076c.p112d.p134b.p135a.p143g.C6409q0;
import p076c.p112d.p134b.p135a.p143g.C6412r;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6417a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p489f.C14069f;

/* renamed from: com.google.api.client.http.g0 */
/* compiled from: UriTemplate */
public class C7267g0 {

    /* renamed from: a */
    static final Map<Character, C7268a> f20569a = new HashMap();

    /* renamed from: b */
    private static final String f20570b = ",";

    /* renamed from: com.google.api.client.http.g0$a */
    /* compiled from: UriTemplate */
    private enum C7268a {
        PLUS(Character.valueOf('+'), "", C7267g0.f20570b, false, true),
        HASH(Character.valueOf('#'), "#", C7267g0.f20570b, false, true),
        DOT(Character.valueOf('.'), ".", ".", false, false),
        FORWARD_SLASH(Character.valueOf('/'), "/", "/", false, false),
        SEMI_COLON(Character.valueOf(';'), ";", ";", true, false),
        QUERY(Character.valueOf('?'), "?", "&", true, false),
        AMP(Character.valueOf(C14662d0.f42852c), "&", "&", true, false),
        SIMPLE(null, "", C7267g0.f20570b, false, false);
        
        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        private C7268a(Character ch, String str, String str2, boolean z, boolean z2) {
            this.propertyPrefix = ch;
            this.outputPrefix = (String) C6381h0.m29663a(str);
            this.explodeJoiner = (String) C6381h0.m29663a(str2);
            this.requiresVarAssignment = z;
            this.reservedExpansion = z2;
            if (ch != null) {
                C7267g0.f20569a.put(ch, this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo28913b(String str) {
            if (this.reservedExpansion) {
                return C6417a.m29798c(str);
            }
            return C6417a.m29797b(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo28914d() {
            return this.explodeJoiner;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public String mo28915e() {
            return this.outputPrefix;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo28916f() {
            return this.reservedExpansion;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int mo28917g() {
            return this.propertyPrefix == null ? 0 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo28918h() {
            return this.requiresVarAssignment;
        }
    }

    static {
        C7268a.values();
    }

    /* renamed from: a */
    static C7268a m35072a(String str) {
        C7268a aVar = (C7268a) f20569a.get(Character.valueOf(str.charAt(0)));
        return aVar == null ? C7268a.SIMPLE : aVar;
    }

    /* renamed from: a */
    private static Map<String, Object> m35077a(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : C6398n.m29725d(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !C6398n.m29723b(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static String m35074a(String str, String str2, Object obj, boolean z) {
        String concat;
        if (str2.startsWith("/")) {
            C7274j jVar = new C7274j(str);
            jVar.mo28936f(null);
            String valueOf = String.valueOf(jVar.mo28930d());
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() != 0) {
                concat = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
                return m35073a(str2, obj, z);
            }
        } else {
            if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(str2);
                if (valueOf4.length() != 0) {
                    concat = valueOf3.concat(valueOf4);
                } else {
                    str2 = new String(valueOf3);
                }
            }
            return m35073a(str2, obj, z);
        }
        str2 = concat;
        return m35073a(str2, obj, z);
    }

    /* renamed from: a */
    public static String m35073a(String str, Object obj, boolean z) {
        Object obj2;
        String str2 = str;
        Map a = m35077a(obj);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int indexOf = str2.indexOf(123, i);
            if (indexOf != -1) {
                sb.append(str2.substring(i, indexOf));
                int indexOf2 = str2.indexOf(C13959t.f40819N1, indexOf + 2);
                int i2 = indexOf2 + 1;
                String substring = str2.substring(indexOf + 1, indexOf2);
                C7268a a2 = m35072a(substring);
                ListIterator listIterator = C2752o.m13305b(',').mo10473b((CharSequence) substring).listIterator();
                boolean z2 = true;
                while (listIterator.hasNext()) {
                    String str3 = (String) listIterator.next();
                    boolean endsWith = str3.endsWith(C14069f.f41343G);
                    int g = listIterator.nextIndex() == 1 ? a2.mo28917g() : 0;
                    int length2 = str3.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = str3.substring(g, length2);
                    Object remove = a.remove(substring2);
                    if (remove != null) {
                        if (!z2) {
                            sb.append(a2.mo28914d());
                        } else {
                            sb.append(a2.mo28915e());
                            z2 = false;
                        }
                        if (remove instanceof Iterator) {
                            obj2 = m35075a(substring2, (Iterator) remove, endsWith, a2);
                        } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                            obj2 = m35075a(substring2, C6409q0.m29765a(remove).iterator(), endsWith, a2);
                        } else {
                            String str4 = "%s=%s";
                            if (remove.getClass().isEnum()) {
                                if (C6412r.m29777a((Enum) remove).mo25834e() != null) {
                                    if (a2.mo28918h()) {
                                        remove = String.format(str4, new Object[]{substring2, remove});
                                    }
                                    remove = C6417a.m29798c(remove.toString());
                                }
                                obj2 = remove;
                            } else if (!C6398n.m29724c(remove)) {
                                obj2 = m35076a(substring2, m35077a(remove), endsWith, a2);
                            } else {
                                if (a2.mo28918h()) {
                                    remove = String.format(str4, new Object[]{substring2, remove});
                                }
                                if (a2.mo28916f()) {
                                    obj2 = C6417a.m29799d(remove.toString());
                                } else {
                                    obj2 = C6417a.m29798c(remove.toString());
                                }
                            }
                        }
                        sb.append(obj2);
                    }
                }
                i = i2;
            } else if (i == 0 && !z) {
                return str2;
            } else {
                sb.append(str2.substring(i));
            }
        }
        if (z) {
            C7274j.m35107a(a.entrySet(), sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m35075a(String str, Iterator<?> it, boolean z, C7268a aVar) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str3 = "=";
        if (z) {
            str2 = aVar.mo28914d();
        } else {
            if (aVar.mo28918h()) {
                sb.append(C6417a.m29798c(str));
                sb.append(str3);
            }
            str2 = f20570b;
        }
        while (it.hasNext()) {
            if (z && aVar.mo28918h()) {
                sb.append(C6417a.m29798c(str));
                sb.append(str3);
            }
            sb.append(aVar.mo28913b(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m35076a(String str, Map<String, Object> map, boolean z, C7268a aVar) {
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "=";
        String str3 = f20570b;
        if (z) {
            str3 = aVar.mo28914d();
        } else {
            if (aVar.mo28918h()) {
                sb.append(C6417a.m29798c(str));
                sb.append(str2);
            }
            str2 = str3;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            String b = aVar.mo28913b((String) entry.getKey());
            String b2 = aVar.mo28913b(entry.getValue().toString());
            sb.append(b);
            sb.append(str2);
            sb.append(b2);
            if (it.hasNext()) {
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}

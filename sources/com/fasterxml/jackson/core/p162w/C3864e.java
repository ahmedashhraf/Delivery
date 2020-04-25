package com.fasterxml.jackson.core.p162w;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.fasterxml.jackson.core.w.e */
/* compiled from: InternCache */
public final class C3864e extends LinkedHashMap<String, String> {

    /* renamed from: a */
    private static final int f12242a = 100;

    /* renamed from: b */
    public static final C3864e f12243b = new C3864e();

    private C3864e() {
        super(100, 0.8f, true);
    }

    /* renamed from: b */
    public synchronized String mo17107b(String str) {
        String str2;
        str2 = (String) get(str);
        if (str2 == null) {
            str2 = str.intern();
            put(str2, str2);
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Entry<String, String> entry) {
        return size() > 100;
    }
}

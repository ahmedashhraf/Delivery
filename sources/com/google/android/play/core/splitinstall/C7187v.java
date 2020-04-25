package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.play.core.splitinstall.v */
public final class C7187v {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f20324a = new HashMap();

    /* renamed from: a */
    public final C5778s mo28607a() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f20324a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new C5778s(Collections.unmodifiableMap(hashMap), 0);
    }

    /* renamed from: a */
    public final C7187v mo28608a(String str, String str2, String str3) {
        if (!this.f20324a.containsKey(str2)) {
            this.f20324a.put(str2, new HashMap());
        }
        ((Map) this.f20324a.get(str2)).put(str, str3);
        return this;
    }
}

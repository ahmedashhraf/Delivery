package com.google.android.play.core.splitinstall;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.s */
public final class C5778s {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f16659a;

    private C5778s(Map<String, Map<String, String>> map) {
        this.f16659a = map;
    }

    /* synthetic */ C5778s(Map map, byte b) {
        this(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<String, Set<String>> mo23063a(Collection<String> collection) {
        Set set;
        HashMap hashMap = new HashMap();
        for (String str : this.f16659a.keySet()) {
            if (!this.f16659a.containsKey(str)) {
                set = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Entry entry : ((Map) this.f16659a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, set);
        }
        return hashMap;
    }
}

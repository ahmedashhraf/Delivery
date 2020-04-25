package com.chauthai.swipereveallayout;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.chauthai.swipereveallayout.b */
/* compiled from: ViewBinderHelper */
public class C2991b {

    /* renamed from: f */
    private static final String f10599f = "ViewBinderHelper_Bundle_Map_Key";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Map<String, Integer> f10600a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private Map<String, SwipeRevealLayout> f10601b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private Set<String> f10602c = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile boolean f10603d = false;

    /* renamed from: e */
    private final Object f10604e = new Object();

    /* renamed from: com.chauthai.swipereveallayout.b$a */
    /* compiled from: ViewBinderHelper */
    class C2992a implements C2987c {

        /* renamed from: a */
        final /* synthetic */ String f10605a;

        /* renamed from: b */
        final /* synthetic */ SwipeRevealLayout f10606b;

        C2992a(String str, SwipeRevealLayout swipeRevealLayout) {
            this.f10605a = str;
            this.f10606b = swipeRevealLayout;
        }

        /* renamed from: a */
        public void mo11813a(int i) {
            C2991b.this.f10600a.put(this.f10605a, Integer.valueOf(i));
            if (C2991b.this.f10603d) {
                C2991b.this.m14313a(this.f10605a, this.f10606b);
            }
        }
    }

    /* renamed from: b */
    public void mo11822b(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = new Bundle();
            for (Entry entry : this.f10600a.entrySet()) {
                bundle2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            bundle.putBundle(f10599f, bundle2);
        }
    }

    /* renamed from: a */
    public void mo11818a(SwipeRevealLayout swipeRevealLayout, String str) {
        if (swipeRevealLayout.mo11797e()) {
            swipeRevealLayout.requestLayout();
        }
        this.f10601b.values().remove(swipeRevealLayout);
        this.f10601b.put(str, swipeRevealLayout);
        swipeRevealLayout.mo11790a();
        swipeRevealLayout.setDragStateChangeListener(new C2992a(str, swipeRevealLayout));
        if (!this.f10600a.containsKey(str)) {
            this.f10600a.put(str, Integer.valueOf(0));
            swipeRevealLayout.mo11791a(false);
        } else {
            int intValue = ((Integer) this.f10600a.get(str)).intValue();
            if (intValue == 0 || intValue == 1 || intValue == 4) {
                swipeRevealLayout.mo11791a(false);
            } else {
                swipeRevealLayout.mo11792b(false);
            }
        }
        swipeRevealLayout.setLockDrag(this.f10602c.contains(str));
    }

    /* renamed from: b */
    public void mo11824b(String... strArr) {
        m14314a(false, strArr);
    }

    /* renamed from: b */
    public void mo11823b(String str) {
        synchronized (this.f10604e) {
            this.f10600a.put(str, Integer.valueOf(2));
            if (this.f10601b.containsKey(str)) {
                ((SwipeRevealLayout) this.f10601b.get(str)).mo11792b(true);
            } else if (this.f10603d) {
                m14313a(str, (SwipeRevealLayout) this.f10601b.get(str));
            }
        }
    }

    /* renamed from: a */
    public void mo11817a(Bundle bundle) {
        if (bundle != null) {
            String str = f10599f;
            if (bundle.containsKey(str)) {
                HashMap hashMap = new HashMap();
                Bundle bundle2 = bundle.getBundle(str);
                Set<String> keySet = bundle2.keySet();
                if (keySet != null) {
                    for (String str2 : keySet) {
                        hashMap.put(str2, Integer.valueOf(bundle2.getInt(str2)));
                    }
                }
                this.f10600a = hashMap;
            }
        }
    }

    /* renamed from: a */
    public void mo11821a(String... strArr) {
        m14314a(true, strArr);
    }

    /* renamed from: a */
    public void mo11820a(boolean z) {
        this.f10603d = z;
    }

    /* renamed from: a */
    public void mo11819a(String str) {
        synchronized (this.f10604e) {
            this.f10600a.put(str, Integer.valueOf(0));
            if (this.f10601b.containsKey(str)) {
                ((SwipeRevealLayout) this.f10601b.get(str)).mo11791a(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14313a(String str, SwipeRevealLayout swipeRevealLayout) {
        synchronized (this.f10604e) {
            if (m14310a() > 1) {
                for (Entry entry : this.f10600a.entrySet()) {
                    if (!((String) entry.getKey()).equals(str)) {
                        entry.setValue(Integer.valueOf(0));
                    }
                }
                for (SwipeRevealLayout swipeRevealLayout2 : this.f10601b.values()) {
                    if (swipeRevealLayout2 != swipeRevealLayout) {
                        swipeRevealLayout2.mo11791a(true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m14314a(boolean z, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            if (z) {
                this.f10602c.addAll(Arrays.asList(strArr));
            } else {
                this.f10602c.removeAll(Arrays.asList(strArr));
            }
            for (String str : strArr) {
                SwipeRevealLayout swipeRevealLayout = (SwipeRevealLayout) this.f10601b.get(str);
                if (swipeRevealLayout != null) {
                    swipeRevealLayout.setLockDrag(z);
                }
            }
        }
    }

    /* renamed from: a */
    private int m14310a() {
        int i = 0;
        for (Integer intValue : this.f10600a.values()) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 2 || intValue2 == 3) {
                i++;
            }
        }
        return i;
    }
}

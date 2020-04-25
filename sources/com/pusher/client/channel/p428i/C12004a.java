package com.pusher.client.channel.p428i;

import androidx.core.app.C0770p;
import com.google.gson.C8775f;
import com.pusher.client.channel.C11997b;
import com.pusher.client.channel.C12002g;
import com.pusher.client.channel.ChannelState;
import com.pusher.client.p432f.C12041a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pusher.client.channel.i.a */
/* compiled from: ChannelImpl */
public class C12004a implements C12011c {

    /* renamed from: R */
    private static final C8775f f34587R = new C8775f();

    /* renamed from: S */
    private static final String f34588S = "pusher_internal:";

    /* renamed from: T */
    protected static final String f34589T = "pusher_internal:subscription_succeeded";

    /* renamed from: N */
    protected volatile ChannelState f34590N = ChannelState.INITIAL;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C11997b f34591O;

    /* renamed from: P */
    private final C12041a f34592P;

    /* renamed from: Q */
    private final Object f34593Q = new Object();

    /* renamed from: a */
    protected final String f34594a;

    /* renamed from: b */
    private final Map<String, Set<C12002g>> f34595b = new HashMap();

    /* renamed from: com.pusher.client.channel.i.a$a */
    /* compiled from: ChannelImpl */
    class C12005a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ String f34596N;

        /* renamed from: a */
        final /* synthetic */ C12002g f34598a;

        /* renamed from: b */
        final /* synthetic */ String f34599b;

        C12005a(C12002g gVar, String str, String str2) {
            this.f34598a = gVar;
            this.f34599b = str;
            this.f34596N = str2;
        }

        public void run() {
            this.f34598a.mo37682a(C12004a.this.f34594a, this.f34599b, this.f34596N);
        }
    }

    /* renamed from: com.pusher.client.channel.i.a$b */
    /* compiled from: ChannelImpl */
    class C12006b implements Runnable {
        C12006b() {
        }

        public void run() {
            C12004a.this.f34591O.mo37813a(C12004a.this.getName());
        }
    }

    public C12004a(String str, C12041a aVar) {
        if (str != null) {
            String[] d = mo41115d();
            int length = d.length;
            int i = 0;
            while (i < length) {
                if (!str.matches(d[i])) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Channel name ");
                    sb.append(str);
                    sb.append(" is invalid. Private channel names must start with \"private-\" and presence channel names must start with \"presence-\"");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f34594a = str;
            this.f34592P = aVar;
            return;
        }
        throw new IllegalArgumentException("Cannot subscribe to a channel with a null name");
    }

    /* renamed from: c */
    private void m54197c(String str, C12002g gVar) {
        String str2 = "Cannot bind or unbind to channel ";
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f34594a);
            sb.append(" with a null event name");
            throw new IllegalArgumentException(sb.toString());
        } else if (gVar == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f34594a);
            sb2.append(" with a null listener");
            throw new IllegalArgumentException(sb2.toString());
        } else if (str.startsWith(f34588S)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot bind or unbind channel ");
            sb3.append(this.f34594a);
            sb3.append(" with an internal event name such as ");
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        } else if (this.f34590N == ChannelState.UNSUBSCRIBED) {
            throw new IllegalStateException("Cannot bind or unbind to events on a channel that has been unsubscribed. Call Pusher.subscribe() to resubscribe to this channel");
        }
    }

    /* renamed from: b */
    public void mo41095b(String str, C12002g gVar) {
        m54197c(str, gVar);
        synchronized (this.f34593Q) {
            Set set = (Set) this.f34595b.get(str);
            if (set == null) {
                set = new HashSet();
                this.f34595b.put(str, set);
            }
            set.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String[] mo41115d() {
        return new String[]{"^private-.*", "^presence-.*"};
    }

    public String getName() {
        return this.f34594a;
    }

    /* renamed from: m */
    public String mo41116m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C0770p.f3524g0, "pusher:subscribe");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("channel", this.f34594a);
        linkedHashMap.put("data", linkedHashMap2);
        return f34587R.mo32317a((Object) linkedHashMap);
    }

    /* renamed from: n */
    public C11997b mo41117n() {
        return this.f34591O;
    }

    /* renamed from: o */
    public String mo41118o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C0770p.f3524g0, "pusher:unsubscribe");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("channel", this.f34594a);
        linkedHashMap.put("data", linkedHashMap2);
        return f34587R.mo32317a((Object) linkedHashMap);
    }

    public String toString() {
        return String.format("[Public Channel: name=%s]", new Object[]{this.f34594a});
    }

    /* renamed from: a */
    public void mo41093a(String str, C12002g gVar) {
        m54197c(str, gVar);
        synchronized (this.f34593Q) {
            Set set = (Set) this.f34595b.get(str);
            if (set != null) {
                set.remove(gVar);
                if (set.isEmpty()) {
                    this.f34595b.remove(str);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo41094a() {
        return this.f34590N == ChannelState.SUBSCRIBED;
    }

    /* renamed from: a */
    public void mo41113a(String str, String str2) {
        HashSet<C12002g> hashSet;
        if (str.equals(f34589T)) {
            mo41111a(ChannelState.SUBSCRIBED);
            return;
        }
        synchronized (this.f34593Q) {
            Set set = (Set) this.f34595b.get(str);
            hashSet = set != null ? new HashSet<>(set) : null;
        }
        if (hashSet != null) {
            for (C12002g aVar : hashSet) {
                this.f34592P.mo41182a((Runnable) new C12005a(aVar, str, m54196a(str2)));
            }
        }
    }

    /* renamed from: a */
    public void mo41111a(ChannelState channelState) {
        this.f34590N = channelState;
        if (channelState == ChannelState.SUBSCRIBED && this.f34591O != null) {
            this.f34592P.mo41182a((Runnable) new C12006b());
        }
    }

    /* renamed from: a */
    public void mo41112a(C11997b bVar) {
        this.f34591O = bVar;
    }

    /* renamed from: a */
    public int compareTo(C12011c cVar) {
        return getName().compareTo(cVar.getName());
    }

    /* renamed from: a */
    private String m54196a(String str) {
        return (String) ((Map) f34587R.mo32314a(str, Map.class)).get("data");
    }
}

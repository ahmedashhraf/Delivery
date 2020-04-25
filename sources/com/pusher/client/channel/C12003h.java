package com.pusher.client.channel;

import com.google.gson.C8775f;

/* renamed from: com.pusher.client.channel.h */
/* compiled from: User */
public class C12003h {

    /* renamed from: c */
    private static final C8775f f34584c = new C8775f();

    /* renamed from: a */
    private final String f34585a;

    /* renamed from: b */
    private final String f34586b;

    public C12003h(String str, String str2) {
        this.f34585a = str;
        this.f34586b = str2;
    }

    /* renamed from: a */
    public String mo41105a() {
        return this.f34585a;
    }

    /* renamed from: b */
    public String mo41106b() {
        return this.f34586b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12003h)) {
            return false;
        }
        C12003h hVar = (C12003h) obj;
        if (!mo41105a().equals(hVar.mo41105a()) || !mo41106b().equals(hVar.mo41106b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f34585a.hashCode();
        String str = this.f34586b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("[User id=%s, data=%s]", new Object[]{this.f34585a, this.f34586b});
    }

    /* renamed from: a */
    public <V> V mo41104a(Class<V> cls) {
        return f34584c.mo32314a(this.f34586b, cls);
    }
}

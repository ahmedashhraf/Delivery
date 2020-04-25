package com.google.gson;

import com.google.gson.p321x.C8840h;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.gson.n */
/* compiled from: JsonObject */
public final class C8789n extends C8787l {

    /* renamed from: a */
    private final C8840h<String, C8787l> f23033a = new C8840h<>();

    /* renamed from: E */
    public Set<String> mo32403E() {
        return this.f23033a.keySet();
    }

    /* renamed from: a */
    public void mo32405a(String str, C8787l lVar) {
        if (lVar == null) {
            lVar = C8788m.f23032a;
        }
        this.f23033a.put(str, lVar);
    }

    /* renamed from: c */
    public C8789n mo32411c(String str) {
        return (C8789n) this.f23033a.get(str);
    }

    /* renamed from: d */
    public C8791p mo32412d(String str) {
        return (C8791p) this.f23033a.get(str);
    }

    /* renamed from: e */
    public boolean mo32413e(String str) {
        return this.f23033a.containsKey(str);
    }

    public Set<Entry<String, C8787l>> entrySet() {
        return this.f23033a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8789n) && ((C8789n) obj).f23033a.equals(this.f23033a));
    }

    /* renamed from: f */
    public C8787l mo32416f(String str) {
        return (C8787l) this.f23033a.remove(str);
    }

    public int hashCode() {
        return this.f23033a.hashCode();
    }

    public int size() {
        return this.f23033a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8789n m41233b() {
        C8789n nVar = new C8789n();
        for (Entry entry : this.f23033a.entrySet()) {
            nVar.mo32405a((String) entry.getKey(), ((C8787l) entry.getValue()).mo32368b());
        }
        return nVar;
    }

    /* renamed from: a */
    public void mo32409a(String str, String str2) {
        mo32405a(str, m41223a((Object) str2));
    }

    /* renamed from: a */
    public void mo32408a(String str, Number number) {
        mo32405a(str, m41223a((Object) number));
    }

    /* renamed from: a */
    public void mo32406a(String str, Boolean bool) {
        mo32405a(str, m41223a((Object) bool));
    }

    /* renamed from: b */
    public C8787l mo32410b(String str) {
        return (C8787l) this.f23033a.get(str);
    }

    /* renamed from: a */
    public void mo32407a(String str, Character ch) {
        mo32405a(str, m41223a((Object) ch));
    }

    /* renamed from: a */
    private C8787l m41223a(Object obj) {
        return obj == null ? C8788m.f23032a : new C8791p(obj);
    }

    /* renamed from: a */
    public C8784i mo32404a(String str) {
        return (C8784i) this.f23033a.get(str);
    }
}

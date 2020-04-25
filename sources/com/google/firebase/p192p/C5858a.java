package com.google.firebase.p192p;

import p201f.p202a.C5950g;

/* renamed from: com.google.firebase.p.a */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
final class C5858a extends C5859e {

    /* renamed from: a */
    private final String f16947a;

    /* renamed from: b */
    private final String f16948b;

    C5858a(String str, String str2) {
        if (str != null) {
            this.f16947a = str;
            if (str2 != null) {
                this.f16948b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @C5950g
    /* renamed from: a */
    public String mo23280a() {
        return this.f16947a;
    }

    @C5950g
    /* renamed from: b */
    public String mo23281b() {
        return this.f16948b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5859e)) {
            return false;
        }
        C5859e eVar = (C5859e) obj;
        if (!this.f16947a.equals(eVar.mo23280a()) || !this.f16948b.equals(eVar.mo23281b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f16947a.hashCode() ^ 1000003) * 1000003) ^ this.f16948b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.f16947a);
        sb.append(", version=");
        sb.append(this.f16948b);
        sb.append("}");
        return sb.toString();
    }
}

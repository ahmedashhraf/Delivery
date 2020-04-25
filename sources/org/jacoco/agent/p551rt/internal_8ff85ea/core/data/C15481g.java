package org.jacoco.agent.p551rt.internal_8ff85ea.core.data;

/* renamed from: org.jacoco.agent.rt.internal_8ff85ea.core.data.g */
/* compiled from: SessionInfo */
public class C15481g implements Comparable<C15481g> {

    /* renamed from: N */
    private final long f44709N;

    /* renamed from: a */
    private final String f44710a;

    /* renamed from: b */
    private final long f44711b;

    public C15481g(String str, long j, long j2) {
        if (str != null) {
            this.f44710a = str;
            this.f44711b = j;
            this.f44709N = j2;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public int compareTo(C15481g gVar) {
        long j = this.f44709N;
        long j2 = gVar.f44709N;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: b */
    public long mo47829b() {
        return this.f44709N;
    }

    /* renamed from: c */
    public String mo47830c() {
        return this.f44710a;
    }

    /* renamed from: d */
    public long mo47832d() {
        return this.f44711b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SessionInfo[");
        sb.append(this.f44710a);
        sb.append("]");
        return sb.toString();
    }
}

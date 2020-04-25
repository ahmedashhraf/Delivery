package org.jacoco.agent.p551rt.internal_8ff85ea.core.data;

import java.util.Arrays;

/* renamed from: org.jacoco.agent.rt.internal_8ff85ea.core.data.a */
/* compiled from: ExecutionData */
public final class C15475a {

    /* renamed from: a */
    private final long f44694a;

    /* renamed from: b */
    private final String f44695b;

    /* renamed from: c */
    private final boolean[] f44696c;

    public C15475a(long j, String str, boolean[] zArr) {
        this.f44694a = j;
        this.f44695b = str;
        this.f44696c = zArr;
    }

    /* renamed from: a */
    public long mo47804a() {
        return this.f44694a;
    }

    /* renamed from: b */
    public String mo47808b() {
        return this.f44695b;
    }

    /* renamed from: c */
    public boolean[] mo47809c() {
        return this.f44696c;
    }

    /* renamed from: d */
    public boolean mo47810d() {
        for (boolean z : this.f44696c) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo47811e() {
        Arrays.fill(this.f44696c, false);
    }

    public String toString() {
        return String.format("ExecutionData[name=%s, id=%016x]", new Object[]{this.f44695b, Long.valueOf(this.f44694a)});
    }

    /* renamed from: a */
    public void mo47806a(C15475a aVar) {
        mo47807a(aVar, true);
    }

    /* renamed from: a */
    public void mo47807a(C15475a aVar, boolean z) {
        mo47805a(aVar.mo47804a(), aVar.mo47808b(), aVar.mo47809c().length);
        boolean[] c = aVar.mo47809c();
        int i = 0;
        while (true) {
            boolean[] zArr = this.f44696c;
            if (i < zArr.length) {
                if (c[i]) {
                    zArr[i] = z;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public C15475a(long j, String str, int i) {
        this.f44694a = j;
        this.f44695b = str;
        this.f44696c = new boolean[i];
    }

    /* renamed from: a */
    public void mo47805a(long j, String str, int i) throws IllegalStateException {
        long j2 = this.f44694a;
        if (j2 != j) {
            throw new IllegalStateException(String.format("Different ids (%016x and %016x).", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
        } else if (!this.f44695b.equals(str)) {
            throw new IllegalStateException(String.format("Different class names %s and %s for id %016x.", new Object[]{this.f44695b, str, Long.valueOf(j)}));
        } else if (this.f44696c.length != i) {
            throw new IllegalStateException(String.format("Incompatible execution data for class %s with id %016x.", new Object[]{str, Long.valueOf(j)}));
        }
    }
}

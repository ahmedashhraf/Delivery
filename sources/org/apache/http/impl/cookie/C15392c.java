package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.C15232k;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.cookie.c */
/* compiled from: BasicClientCookie2 */
public class C15392c extends C15394d implements C15232k {

    /* renamed from: U */
    private String f44514U;

    /* renamed from: V */
    private int[] f44515V;

    /* renamed from: W */
    private boolean f44516W;

    public C15392c(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public void mo47138a(int[] iArr) {
        this.f44515V = iArr;
    }

    /* renamed from: b */
    public void mo47139b(boolean z) {
        this.f44516W = z;
    }

    public Object clone() throws CloneNotSupportedException {
        C15392c cVar = (C15392c) super.clone();
        cVar.f44515V = (int[]) this.f44515V.clone();
        return cVar;
    }

    /* renamed from: d */
    public void mo47140d(String str) {
        this.f44514U = str;
    }

    /* renamed from: e */
    public int[] mo47105e() {
        return this.f44515V;
    }

    /* renamed from: g */
    public String mo47107g() {
        return this.f44514U;
    }

    /* renamed from: i */
    public boolean mo47112i() {
        return !this.f44516W && super.mo47112i();
    }

    /* renamed from: a */
    public boolean mo47101a(Date date) {
        return this.f44516W || super.mo47101a(date);
    }
}

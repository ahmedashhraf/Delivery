package com.instabug.chat.model;

import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.model.a */
/* compiled from: FlatMessage */
public class C9420a {

    /* renamed from: k */
    private static transient /* synthetic */ boolean[] f24943k;

    /* renamed from: a */
    private String f24944a;

    /* renamed from: b */
    private String f24945b;

    /* renamed from: c */
    private long f24946c;

    /* renamed from: d */
    private String f24947d;

    /* renamed from: e */
    private String f24948e;

    /* renamed from: f */
    private C9422b f24949f;

    /* renamed from: g */
    private C9421a f24950g;

    /* renamed from: h */
    private boolean f24951h;

    /* renamed from: i */
    private boolean f24952i = false;

    /* renamed from: j */
    private ArrayList<C9423b> f24953j;

    /* renamed from: com.instabug.chat.model.a$a */
    /* compiled from: FlatMessage */
    public enum C9421a {
        NONE,
        PLAYING;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    /* renamed from: com.instabug.chat.model.a$b */
    /* compiled from: FlatMessage */
    public enum C9422b {
        MESSAGE,
        IMAGE,
        AUDIO,
        VIDEO;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    public C9420a() {
        boolean[] l = m44072l();
        l[0] = true;
    }

    /* renamed from: l */
    private static /* synthetic */ boolean[] m44072l() {
        boolean[] zArr = f24943k;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1284071271133499033L, "com/instabug/chat/model/FlatMessage", 28);
        f24943k = a;
        return a;
    }

    /* renamed from: a */
    public String mo33939a() {
        boolean[] l = m44072l();
        String str = this.f24944a;
        l[1] = true;
        return str;
    }

    /* renamed from: b */
    public String mo33943b() {
        boolean[] l = m44072l();
        String str = this.f24945b;
        l[3] = true;
        return str;
    }

    /* renamed from: c */
    public long mo33944c() {
        boolean[] l = m44072l();
        long j = this.f24946c;
        l[5] = true;
        return j;
    }

    /* renamed from: d */
    public String mo33947d() {
        boolean[] l = m44072l();
        String str = this.f24947d;
        l[7] = true;
        return str;
    }

    /* renamed from: e */
    public C9422b mo33948e() {
        boolean[] l = m44072l();
        C9422b bVar = this.f24949f;
        l[9] = true;
        return bVar;
    }

    /* renamed from: f */
    public C9421a mo33949f() {
        boolean[] l = m44072l();
        C9421a aVar = this.f24950g;
        l[11] = true;
        return aVar;
    }

    /* renamed from: g */
    public boolean mo33950g() {
        boolean[] l = m44072l();
        boolean z = this.f24951h;
        l[13] = true;
        return z;
    }

    /* renamed from: h */
    public String mo33951h() {
        boolean[] l = m44072l();
        String str = this.f24948e;
        l[15] = true;
        return str;
    }

    /* renamed from: i */
    public boolean mo33952i() {
        boolean z;
        boolean[] l = m44072l();
        ArrayList<C9423b> arrayList = this.f24953j;
        if (arrayList == null) {
            l[17] = true;
        } else if (arrayList.size() <= 0) {
            l[18] = true;
        } else {
            l[19] = true;
            z = true;
            l[21] = true;
            return z;
        }
        z = false;
        l[20] = true;
        l[21] = true;
        return z;
    }

    /* renamed from: j */
    public ArrayList<C9423b> mo33953j() {
        boolean[] l = m44072l();
        ArrayList<C9423b> arrayList = this.f24953j;
        l[22] = true;
        return arrayList;
    }

    /* renamed from: k */
    public boolean mo33954k() {
        boolean[] l = m44072l();
        boolean z = this.f24952i;
        l[24] = true;
        return z;
    }

    public String toString() {
        boolean[] l = m44072l();
        StringBuilder sb = new StringBuilder();
        sb.append("Body: ");
        sb.append(mo33939a());
        sb.append("URL: ");
        sb.append(mo33947d());
        sb.append("has actions: ");
        sb.append(mo33952i());
        sb.append("type: ");
        l[26] = true;
        sb.append(mo33948e());
        sb.append("actions: ");
        sb.append(mo33953j());
        String sb2 = sb.toString();
        l[27] = true;
        return sb2;
    }

    /* renamed from: a */
    public C9420a mo33937a(String str) {
        boolean[] l = m44072l();
        this.f24944a = str;
        l[2] = true;
        return this;
    }

    /* renamed from: b */
    public C9420a mo33941b(String str) {
        boolean[] l = m44072l();
        this.f24945b = str;
        l[4] = true;
        return this;
    }

    /* renamed from: c */
    public C9420a mo33945c(String str) {
        boolean[] l = m44072l();
        this.f24947d = str;
        l[8] = true;
        return this;
    }

    /* renamed from: d */
    public C9420a mo33946d(String str) {
        boolean[] l = m44072l();
        this.f24948e = str;
        l[16] = true;
        return this;
    }

    /* renamed from: a */
    public C9420a mo33934a(long j) {
        boolean[] l = m44072l();
        this.f24946c = j;
        l[6] = true;
        return this;
    }

    /* renamed from: b */
    public C9420a mo33942b(boolean z) {
        boolean[] l = m44072l();
        this.f24952i = z;
        l[25] = true;
        return this;
    }

    /* renamed from: a */
    public C9420a mo33936a(C9422b bVar) {
        boolean[] l = m44072l();
        this.f24949f = bVar;
        l[10] = true;
        return this;
    }

    /* renamed from: a */
    public C9420a mo33935a(C9421a aVar) {
        boolean[] l = m44072l();
        this.f24950g = aVar;
        l[12] = true;
        return this;
    }

    /* renamed from: a */
    public C9420a mo33938a(boolean z) {
        boolean[] l = m44072l();
        this.f24951h = z;
        l[14] = true;
        return this;
    }

    /* renamed from: a */
    public void mo33940a(ArrayList<C9423b> arrayList) {
        boolean[] l = m44072l();
        this.f24953j = arrayList;
        l[23] = true;
    }
}

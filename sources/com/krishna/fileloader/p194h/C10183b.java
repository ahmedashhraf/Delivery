package com.krishna.fileloader.p194h;

import com.krishna.fileloader.p405e.C10177a;

/* renamed from: com.krishna.fileloader.h.b */
/* compiled from: FileLoadRequest */
public class C10183b {

    /* renamed from: l */
    public static final int f27166l = 1;

    /* renamed from: m */
    public static final int f27167m = 2;

    /* renamed from: n */
    public static final int f27168n = 3;

    /* renamed from: o */
    public static final int f27169o = 4;

    /* renamed from: a */
    private String f27170a;

    /* renamed from: b */
    private String f27171b;

    /* renamed from: c */
    private int f27172c;
    @C5876a

    /* renamed from: d */
    private int f27173d;

    /* renamed from: e */
    private String f27174e;

    /* renamed from: f */
    private Class f27175f;

    /* renamed from: g */
    private boolean f27176g;

    /* renamed from: h */
    private boolean f27177h;

    /* renamed from: i */
    private boolean f27178i;

    /* renamed from: j */
    private String f27179j;

    /* renamed from: k */
    private C10177a f27180k;

    /* renamed from: com.krishna.fileloader.h.b$a */
    /* compiled from: FileLoadRequest */
    public @interface C5876a {
    }

    public C10183b(String str, String str2, int i, int i2, Class cls, String str3, boolean z, C10177a aVar) {
        this.f27174e = "";
        this.f27170a = str;
        this.f27171b = str2;
        this.f27172c = i;
        this.f27173d = i2;
        this.f27175f = cls;
        this.f27174e = str3;
        this.f27176g = z;
        this.f27180k = aVar;
    }

    /* renamed from: a */
    public String mo36472a() {
        return this.f27171b;
    }

    /* renamed from: b */
    public int mo36478b() {
        return this.f27172c;
    }

    /* renamed from: c */
    public String mo36482c() {
        return this.f27174e;
    }

    /* renamed from: d */
    public void mo36486d(String str) {
        this.f27170a = str;
    }

    /* renamed from: e */
    public int mo36487e() {
        return this.f27173d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10183b.class != obj.getClass()) {
            return false;
        }
        C10183b bVar = (C10183b) obj;
        if (this.f27172c == bVar.f27172c && this.f27173d == bVar.f27173d && this.f27170a.equals(bVar.f27170a)) {
            return this.f27171b.equals(bVar.f27171b);
        }
        return false;
    }

    /* renamed from: f */
    public Class mo36489f() {
        return this.f27175f;
    }

    /* renamed from: g */
    public C10177a mo36490g() {
        return this.f27180k;
    }

    /* renamed from: h */
    public String mo36491h() {
        return this.f27170a;
    }

    public int hashCode() {
        return (((((this.f27170a.hashCode() * 31) + this.f27171b.hashCode()) * 31) + this.f27172c) * 31) + this.f27173d;
    }

    /* renamed from: i */
    public boolean mo36493i() {
        return this.f27177h;
    }

    /* renamed from: j */
    public boolean mo36494j() {
        return this.f27178i;
    }

    /* renamed from: k */
    public boolean mo36495k() {
        return this.f27176g;
    }

    /* renamed from: a */
    public void mo36476a(String str) {
        this.f27171b = str;
    }

    /* renamed from: b */
    public void mo36479b(int i) {
        this.f27173d = i;
    }

    /* renamed from: c */
    public void mo36484c(boolean z) {
        this.f27176g = z;
    }

    /* renamed from: d */
    public String mo36485d() {
        return this.f27179j;
    }

    /* renamed from: a */
    public void mo36473a(int i) {
        this.f27172c = i;
    }

    /* renamed from: b */
    public void mo36480b(String str) {
        this.f27174e = str;
    }

    /* renamed from: c */
    public void mo36483c(String str) {
        this.f27179j = str;
    }

    /* renamed from: a */
    public void mo36474a(C10177a aVar) {
        this.f27180k = aVar;
    }

    /* renamed from: b */
    public void mo36481b(boolean z) {
        this.f27178i = z;
    }

    /* renamed from: a */
    public void mo36475a(Class cls) {
        this.f27175f = cls;
    }

    /* renamed from: a */
    public void mo36477a(boolean z) {
        this.f27177h = z;
    }

    public C10183b(String str, String str2, int i, int i2, Class cls, String str3, boolean z, C10177a aVar, String str4) {
        this.f27174e = "";
        this.f27170a = str;
        this.f27171b = str2;
        this.f27172c = i;
        this.f27173d = i2;
        this.f27175f = cls;
        this.f27174e = str3;
        this.f27176g = z;
        this.f27180k = aVar;
        this.f27179j = str4;
    }

    public C10183b(String str, String str2, int i, int i2, Class cls, String str3, boolean z, boolean z2, boolean z3, C10177a aVar) {
        this(str, str2, i, i2, cls, str3, z, aVar);
        this.f27177h = z2;
        this.f27178i = z3;
    }

    public C10183b(String str, String str2, int i) {
        this.f27174e = "";
        this.f27170a = str;
        this.f27171b = str2;
        this.f27172c = i;
    }
}

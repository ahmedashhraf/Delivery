package com.google.api.client.auth.oauth2;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6373f0;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6427d;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6428e;

@C2766f
/* renamed from: com.google.api.client.auth.oauth2.q */
/* compiled from: StoredCredential */
public final class C7231q implements Serializable {

    /* renamed from: P */
    public static final String f20427P = C7231q.class.getSimpleName();
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    private Long f20428N;

    /* renamed from: O */
    private String f20429O;

    /* renamed from: a */
    private final Lock f20430a = new ReentrantLock();

    /* renamed from: b */
    private String f20431b;

    public C7231q() {
    }

    /* renamed from: a */
    public String mo28727a() {
        this.f20430a.lock();
        try {
            return this.f20431b;
        } finally {
            this.f20430a.unlock();
        }
    }

    /* renamed from: b */
    public C7231q mo28728b(String str) {
        this.f20430a.lock();
        try {
            this.f20431b = str;
            return this;
        } finally {
            this.f20430a.unlock();
        }
    }

    /* renamed from: c */
    public C7231q mo28729c(String str) {
        this.f20430a.lock();
        try {
            this.f20429O = str;
            return this;
        } finally {
            this.f20430a.unlock();
        }
    }

    /* renamed from: d */
    public Long mo28730d() {
        this.f20430a.lock();
        try {
            return this.f20428N;
        } finally {
            this.f20430a.unlock();
        }
    }

    /* renamed from: e */
    public String mo28731e() {
        this.f20430a.lock();
        try {
            return this.f20429O;
        } finally {
            this.f20430a.unlock();
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7231q)) {
            return false;
        }
        C7231q qVar = (C7231q) obj;
        if (!C6373f0.m29651a(mo28727a(), qVar.mo28727a()) || !C6373f0.m29651a(mo28731e(), qVar.mo28731e()) || !C6373f0.m29651a(mo28730d(), qVar.mo28730d())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo28727a(), mo28731e(), mo28730d()});
    }

    public String toString() {
        return C6373f0.m29650a(C7231q.class).mo25752a("accessToken", mo28727a()).mo25752a("refreshToken", mo28731e()).mo25752a("expirationTimeMilliseconds", mo28730d()).toString();
    }

    public C7231q(C7222j jVar) {
        mo28728b(jVar.mo28691b());
        mo28729c(jVar.mo28699j());
        mo28726a(jVar.mo28694e());
    }

    /* renamed from: a */
    public C7231q mo28726a(Long l) {
        this.f20430a.lock();
        try {
            this.f20428N = l;
            return this;
        } finally {
            this.f20430a.unlock();
        }
    }

    /* renamed from: a */
    public static C6427d<C7231q> m34785a(C6428e eVar) throws IOException {
        return eVar.mo25864a(f20427P);
    }
}

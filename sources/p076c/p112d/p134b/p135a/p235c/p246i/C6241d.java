package p076c.p112d.p134b.p135a.p235c.p246i;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6373f0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6427d;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6428e;

@C2766f
/* renamed from: c.d.b.a.c.i.d */
/* compiled from: StoredChannel */
public final class C6241d implements Serializable {

    /* renamed from: R */
    public static final String f17560R = C6241d.class.getSimpleName();
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    private String f17561N;

    /* renamed from: O */
    private Long f17562O;

    /* renamed from: P */
    private final String f17563P;

    /* renamed from: Q */
    private String f17564Q;

    /* renamed from: a */
    private final Lock f17565a;

    /* renamed from: b */
    private final C6245h f17566b;

    public C6241d(C6245h hVar) {
        this(hVar, C6239b.m28885a());
    }

    /* renamed from: a */
    public C6241d mo25387a(C6428e eVar) throws IOException {
        return mo25386a(m28886b(eVar));
    }

    /* renamed from: b */
    public C6241d mo25390b(String str) {
        this.f17565a.lock();
        try {
            this.f17561N = str;
            return this;
        } finally {
            this.f17565a.unlock();
        }
    }

    /* renamed from: c */
    public C6241d mo25391c(String str) {
        this.f17565a.lock();
        try {
            this.f17564Q = str;
            return this;
        } finally {
            this.f17565a.unlock();
        }
    }

    /* renamed from: d */
    public Long mo25392d() {
        this.f17565a.lock();
        try {
            return this.f17562O;
        } finally {
            this.f17565a.unlock();
        }
    }

    /* renamed from: e */
    public String mo25393e() {
        this.f17565a.lock();
        try {
            return this.f17563P;
        } finally {
            this.f17565a.unlock();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6241d)) {
            return false;
        }
        return mo25393e().equals(((C6241d) obj).mo25393e());
    }

    /* renamed from: f */
    public C6245h mo25395f() {
        this.f17565a.lock();
        try {
            return this.f17566b;
        } finally {
            this.f17565a.unlock();
        }
    }

    /* renamed from: g */
    public String mo25396g() {
        this.f17565a.lock();
        try {
            return this.f17564Q;
        } finally {
            this.f17565a.unlock();
        }
    }

    public int hashCode() {
        return mo25393e().hashCode();
    }

    public String toString() {
        return C6373f0.m29650a(C6241d.class).mo25752a("notificationCallback", mo25395f()).mo25752a("clientToken", mo25389a()).mo25752a("expiration", mo25392d()).mo25752a("id", mo25393e()).mo25752a("topicId", mo25396g()).toString();
    }

    public C6241d(C6245h hVar, String str) {
        this.f17565a = new ReentrantLock();
        this.f17566b = (C6245h) C6381h0.m29663a(hVar);
        this.f17563P = (String) C6381h0.m29663a(str);
    }

    /* renamed from: a */
    public C6241d mo25386a(C6427d<C6241d> dVar) throws IOException {
        this.f17565a.lock();
        try {
            dVar.mo25866a(mo25393e(), this);
            return this;
        } finally {
            this.f17565a.unlock();
        }
    }

    /* renamed from: b */
    public static C6427d<C6241d> m28886b(C6428e eVar) throws IOException {
        return eVar.mo25864a(f17560R);
    }

    /* renamed from: a */
    public String mo25389a() {
        this.f17565a.lock();
        try {
            return this.f17561N;
        } finally {
            this.f17565a.unlock();
        }
    }

    /* renamed from: a */
    public C6241d mo25388a(Long l) {
        this.f17565a.lock();
        try {
            this.f17562O = l;
            return this;
        } finally {
            this.f17565a.unlock();
        }
    }
}

package com.fasterxml.jackson.core.p162w;

import com.fasterxml.jackson.core.C3791f;
import com.fasterxml.jackson.core.C3801l;
import com.fasterxml.jackson.core.C3802m;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.p158s.C3827l;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.fasterxml.jackson.core.w.c */
/* compiled from: DefaultPrettyPrinter */
public class C3858c implements C3801l, C3863d<C3858c>, Serializable {

    /* renamed from: Q */
    public static final C3827l f12230Q = new C3827l(C3868i.f12248b);
    private static final long serialVersionUID = -5512586643324525213L;

    /* renamed from: N */
    protected final C3802m f12231N;

    /* renamed from: O */
    protected boolean f12232O;

    /* renamed from: P */
    protected transient int f12233P;

    /* renamed from: a */
    protected C3860b f12234a;

    /* renamed from: b */
    protected C3860b f12235b;

    /* renamed from: com.fasterxml.jackson.core.w.c$a */
    /* compiled from: DefaultPrettyPrinter */
    public static class C3859a implements C3860b, Serializable {

        /* renamed from: a */
        public static C3859a f12236a = new C3859a();
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        public void mo17105a(C3791f fVar, int i) throws IOException, JsonGenerationException {
            fVar.mo16597a(' ');
        }

        /* renamed from: g */
        public boolean mo17106g() {
            return true;
        }
    }

    /* renamed from: com.fasterxml.jackson.core.w.c$b */
    /* compiled from: DefaultPrettyPrinter */
    public interface C3860b {
        /* renamed from: a */
        void mo17105a(C3791f fVar, int i) throws IOException, JsonGenerationException;

        /* renamed from: g */
        boolean mo17106g();
    }

    /* renamed from: com.fasterxml.jackson.core.w.c$c */
    /* compiled from: DefaultPrettyPrinter */
    public static class C3861c implements C3860b, Serializable {

        /* renamed from: N */
        static final int f12237N = 64;

        /* renamed from: O */
        static final char[] f12238O = new char[64];

        /* renamed from: a */
        public static C3861c f12239a = new C3861c();

        /* renamed from: b */
        static final String f12240b;
        private static final long serialVersionUID = 1;

        static {
            String str;
            try {
                str = System.getProperty("line.separator");
            } catch (Throwable unused) {
                str = null;
            }
            if (str == null) {
                str = "\n";
            }
            f12240b = str;
            Arrays.fill(f12238O, ' ');
        }

        /* renamed from: a */
        public void mo17105a(C3791f fVar, int i) throws IOException, JsonGenerationException {
            fVar.mo16646g(f12240b);
            if (i > 0) {
                int i2 = i + i;
                while (i2 > 64) {
                    fVar.mo16619a(f12238O, 0, 64);
                    i2 -= f12238O.length;
                }
                fVar.mo16619a(f12238O, 0, i2);
            }
        }

        /* renamed from: g */
        public boolean mo17106g() {
            return false;
        }
    }

    /* renamed from: com.fasterxml.jackson.core.w.c$d */
    /* compiled from: DefaultPrettyPrinter */
    public static class C3862d implements C3860b, Serializable {

        /* renamed from: a */
        public static C3862d f12241a = new C3862d();
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        public void mo17105a(C3791f fVar, int i) {
        }

        /* renamed from: g */
        public boolean mo17106g() {
            return true;
        }
    }

    public C3858c() {
        this((C3802m) f12230Q);
    }

    /* renamed from: b */
    public void mo17104b(C3860b bVar) {
        if (bVar == null) {
            bVar = C3862d.f12241a;
        }
        this.f12235b = bVar;
    }

    /* renamed from: c */
    public void mo16766c(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a(',');
        this.f12234a.mo17105a(fVar, this.f12233P);
    }

    /* renamed from: d */
    public void mo16767d(C3791f fVar) throws IOException, JsonGenerationException {
        this.f12235b.mo17105a(fVar, this.f12233P);
    }

    /* renamed from: e */
    public void mo16768e(C3791f fVar) throws IOException, JsonGenerationException {
        if (!this.f12234a.mo17106g()) {
            this.f12233P++;
        }
        fVar.mo16597a('[');
    }

    /* renamed from: f */
    public void mo16769f(C3791f fVar) throws IOException, JsonGenerationException {
        this.f12234a.mo17105a(fVar, this.f12233P);
    }

    /* renamed from: g */
    public void mo16770g(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a(',');
        this.f12235b.mo17105a(fVar, this.f12233P);
    }

    /* renamed from: h */
    public void mo16771h(C3791f fVar) throws IOException, JsonGenerationException {
        if (this.f12232O) {
            fVar.mo16646g(" : ");
        } else {
            fVar.mo16597a(':');
        }
    }

    public C3858c(String str) {
        this(str == null ? null : new C3827l(str));
    }

    /* renamed from: a */
    public C3858c mo17101a(C3802m mVar) {
        C3802m mVar2 = this.f12231N;
        return (mVar2 == mVar || (mVar != null && mVar.equals(mVar2))) ? this : new C3858c(this, mVar);
    }

    /* renamed from: b */
    public void mo16764b(C3791f fVar) throws IOException, JsonGenerationException {
        C3802m mVar = this.f12231N;
        if (mVar != null) {
            fVar.mo16629c(mVar);
        }
    }

    public C3858c(C3802m mVar) {
        this.f12234a = C3859a.f12236a;
        this.f12235b = C3861c.f12239a;
        this.f12232O = true;
        this.f12233P = 0;
        this.f12231N = mVar;
    }

    /* renamed from: a */
    public void mo17102a(C3860b bVar) {
        if (bVar == null) {
            bVar = C3862d.f12241a;
        }
        this.f12234a = bVar;
    }

    /* renamed from: b */
    public void mo16765b(C3791f fVar, int i) throws IOException, JsonGenerationException {
        if (!this.f12234a.mo17106g()) {
            this.f12233P--;
        }
        if (i > 0) {
            this.f12234a.mo17105a(fVar, this.f12233P);
        } else {
            fVar.mo16597a(' ');
        }
        fVar.mo16597a(']');
    }

    /* renamed from: a */
    public void mo17103a(boolean z) {
        this.f12232O = z;
    }

    /* renamed from: a */
    public C3858c m16756a() {
        return new C3858c(this);
    }

    /* renamed from: a */
    public void mo16762a(C3791f fVar) throws IOException, JsonGenerationException {
        fVar.mo16597a('{');
        if (!this.f12235b.mo17106g()) {
            this.f12233P++;
        }
    }

    public C3858c(C3858c cVar) {
        this(cVar, cVar.f12231N);
    }

    public C3858c(C3858c cVar, C3802m mVar) {
        this.f12234a = C3859a.f12236a;
        this.f12235b = C3861c.f12239a;
        this.f12232O = true;
        this.f12233P = 0;
        this.f12234a = cVar.f12234a;
        this.f12235b = cVar.f12235b;
        this.f12232O = cVar.f12232O;
        this.f12233P = cVar.f12233P;
        this.f12231N = mVar;
    }

    /* renamed from: a */
    public void mo16763a(C3791f fVar, int i) throws IOException, JsonGenerationException {
        if (!this.f12235b.mo17106g()) {
            this.f12233P--;
        }
        if (i > 0) {
            this.f12235b.mo17105a(fVar, this.f12233P);
        } else {
            fVar.mo16597a(' ');
        }
        fVar.mo16597a('}');
    }
}

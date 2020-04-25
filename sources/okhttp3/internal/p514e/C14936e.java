package okhttp3.internal.p514e;

import java.io.IOException;
import p470h.C13887c;
import p470h.C13898h;
import p470h.C13924z;

/* renamed from: okhttp3.internal.e.e */
/* compiled from: FaultHidingSink */
class C14936e extends C13898h {

    /* renamed from: b */
    private boolean f43308b;

    C14936e(C13924z zVar) {
        super(zVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46431a(IOException iOException) {
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) throws IOException {
        if (this.f43308b) {
            cVar.skip(j);
            return;
        }
        try {
            super.mo43815b(cVar, j);
        } catch (IOException e) {
            this.f43308b = true;
            mo46431a(e);
        }
    }

    public void close() throws IOException {
        if (!this.f43308b) {
            try {
                super.close();
            } catch (IOException e) {
                this.f43308b = true;
                mo46431a(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.f43308b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f43308b = true;
                mo46431a(e);
            }
        }
    }
}

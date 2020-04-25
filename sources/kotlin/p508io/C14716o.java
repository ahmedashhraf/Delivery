package kotlin.p508io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo24990d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "reader", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.io.o */
/* compiled from: ReadWrite.kt */
final class C14716o implements C14594m<String> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final BufferedReader f42962a;

    /* renamed from: kotlin.io.o$a */
    /* compiled from: ReadWrite.kt */
    public static final class C14717a implements Iterator<String>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14716o f42963N;

        /* renamed from: a */
        private String f42964a;

        /* renamed from: b */
        private boolean f42965b;

        C14717a(C14716o oVar) {
            this.f42963N = oVar;
        }

        public boolean hasNext() {
            if (this.f42964a == null && !this.f42965b) {
                this.f42964a = this.f42963N.f42962a.readLine();
                if (this.f42964a == null) {
                    this.f42965b = true;
                }
            }
            if (this.f42964a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @C6003d
        public String next() {
            if (hasNext()) {
                String str = this.f42964a;
                this.f42964a = null;
                if (str == null) {
                    C14445h0.m62474e();
                }
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public C14716o(@C6003d BufferedReader bufferedReader) {
        C14445h0.m62478f(bufferedReader, "reader");
        this.f42962a = bufferedReader;
    }

    @C6003d
    public Iterator<String> iterator() {
        return new C14717a(this);
    }
}

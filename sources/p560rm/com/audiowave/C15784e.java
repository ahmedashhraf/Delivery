package p560rm.com.audiowave;

import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p504e1.C14522i;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u000b¨\u0006\f"}, mo24990d2 = {"Lrm/com/audiowave/Sampler;", "", "()V", "downSample", "", "data", "targetSize", "", "downSampleAsync", "", "answer", "Lkotlin/Function1;", "audiowave_release"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: rm.com.audiowave.e */
/* compiled from: Sampler.kt */
public final class C15784e {

    /* renamed from: a */
    public static final C15784e f45084a = new C15784e();

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo24990d2 = {"<anonymous>", "", "run"}, mo24991k = 3, mo24992mv = {1, 1, 10})
    /* renamed from: rm.com.audiowave.e$a */
    /* compiled from: Sampler.kt */
    static final class C15785a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C6080l f45085N;

        /* renamed from: a */
        final /* synthetic */ byte[] f45086a;

        /* renamed from: b */
        final /* synthetic */ int f45087b;

        /* renamed from: rm.com.audiowave.e$a$a */
        /* compiled from: Sampler.kt */
        static final class C15786a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15785a f45088a;

            /* renamed from: b */
            final /* synthetic */ byte[] f45089b;

            C15786a(C15785a aVar, byte[] bArr) {
                this.f45088a = aVar;
                this.f45089b = bArr;
            }

            public final void run() {
                this.f45088a.f45085N.invoke(this.f45089b);
            }
        }

        C15785a(byte[] bArr, int i, C6080l lVar) {
            this.f45086a = bArr;
            this.f45087b = i;
            this.f45085N = lVar;
        }

        public final void run() {
            C15787f.m68782a().post(new C15786a(this, C15784e.f45084a.mo51993a(this.f45086a, this.f45087b)));
        }
    }

    private C15784e() {
    }

    /* renamed from: a */
    public final void mo51992a(@C6003d byte[] bArr, int i, @C6003d C6080l<? super byte[], C14737p0> lVar) {
        C14445h0.m62478f(bArr, "data");
        C14445h0.m62478f(lVar, "answer");
        C15787f.m68784b().submit(new C15785a(bArr, i, lVar));
    }

    @C6003d
    /* renamed from: a */
    public final byte[] mo51993a(@C6003d byte[] bArr, int i) {
        C14445h0.m62478f(bArr, "data");
        byte[] bArr2 = new byte[i];
        double length = (double) (bArr.length / i);
        Double.isNaN(length);
        int max = (int) Math.max(Math.floor(length / 10.0d), 1.0d);
        if (i >= bArr.length) {
            return C15787f.m68783a(bArr2, bArr);
        }
        int i2 = 0;
        C14522i a = C14534q.m62924a((C14522i) new C14525k(0, bArr.length), max);
        int first = a.getFirst();
        int last = a.getLast();
        int e = a.mo45712e();
        if (e <= 0 ? first >= last : first <= last) {
            float f = 0.0f;
            float f2 = 0.0f;
            while (true) {
                int length2 = (int) ((((long) i) * ((long) first)) / ((long) bArr.length));
                if (i2 == length2) {
                    f2 += (float) 1;
                    f += (float) C15787f.m68781a(bArr[first]);
                } else {
                    bArr2[i2] = (byte) ((int) (f / f2));
                    i2 = length2;
                    f = 0.0f;
                    f2 = 0.0f;
                }
                if (first == last) {
                    break;
                }
                first += e;
            }
        }
        return bArr2;
    }
}

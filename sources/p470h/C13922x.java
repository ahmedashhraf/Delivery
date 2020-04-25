package p470h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import p201f.p202a.C5952h;

/* renamed from: h.x */
/* compiled from: SegmentPool */
final class C13922x {

    /* renamed from: a */
    static final long f40433a = 65536;
    @C5952h

    /* renamed from: b */
    static C13921w f40434b;

    /* renamed from: c */
    static long f40435c;

    private C13922x() {
    }

    /* renamed from: a */
    static C13921w m59826a() {
        synchronized (C13922x.class) {
            if (f40434b == null) {
                return new C13921w();
            }
            C13921w wVar = f40434b;
            f40434b = wVar.f40431f;
            wVar.f40431f = null;
            f40435c -= PlaybackStateCompat.f476k0;
            return wVar;
        }
    }

    /* renamed from: a */
    static void m59827a(C13921w wVar) {
        if (wVar.f40431f != null || wVar.f40432g != null) {
            throw new IllegalArgumentException();
        } else if (!wVar.f40429d) {
            synchronized (C13922x.class) {
                if (f40435c + PlaybackStateCompat.f476k0 <= 65536) {
                    f40435c += PlaybackStateCompat.f476k0;
                    wVar.f40431f = f40434b;
                    wVar.f40428c = 0;
                    wVar.f40427b = 0;
                    f40434b = wVar;
                }
            }
        }
    }
}

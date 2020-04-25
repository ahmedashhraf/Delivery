package cafe.adriel.androidaudiorecorder.p151e;

/* renamed from: cafe.adriel.androidaudiorecorder.e.c */
/* compiled from: AudioSource */
public enum C2799c {
    MIC,
    CAMCORDER;

    /* renamed from: cafe.adriel.androidaudiorecorder.e.c$a */
    /* compiled from: AudioSource */
    static /* synthetic */ class C2800a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9979a = null;

        static {
            f9979a = new int[C2799c.values().length];
            try {
                f9979a[C2799c.CAMCORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: d */
    public int mo10547d() {
        return C2800a.f9979a[ordinal()] != 1 ? 1 : 5;
    }
}

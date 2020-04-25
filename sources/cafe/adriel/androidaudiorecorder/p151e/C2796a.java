package cafe.adriel.androidaudiorecorder.p151e;

/* renamed from: cafe.adriel.androidaudiorecorder.e.a */
/* compiled from: AudioChannel */
public enum C2796a {
    STEREO,
    MONO;

    /* renamed from: cafe.adriel.androidaudiorecorder.e.a$a */
    /* compiled from: AudioChannel */
    static /* synthetic */ class C2797a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9978a = null;

        static {
            f9978a = new int[C2796a.values().length];
            try {
                f9978a[C2796a.MONO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: d */
    public int mo10545d() {
        return C2797a.f9978a[ordinal()] != 1 ? 12 : 16;
    }
}

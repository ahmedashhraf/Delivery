package cafe.adriel.androidaudiorecorder.p151e;

/* renamed from: cafe.adriel.androidaudiorecorder.e.b */
/* compiled from: AudioSampleRate */
public enum C2798b {
    HZ_48000,
    HZ_44100,
    HZ_32000,
    HZ_22050,
    HZ_16000,
    HZ_11025,
    HZ_8000;

    /* renamed from: d */
    public int mo10546d() {
        return Integer.parseInt(name().replace("HZ_", ""));
    }
}

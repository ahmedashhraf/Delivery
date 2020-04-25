package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.media.o */
/* compiled from: VolumeProviderCompatApi21 */
class C1590o {

    /* renamed from: androidx.media.o$a */
    /* compiled from: VolumeProviderCompatApi21 */
    static class C1591a extends VolumeProvider {

        /* renamed from: a */
        final /* synthetic */ C1592b f6070a;

        C1591a(int i, int i2, int i3, C1592b bVar) {
            this.f6070a = bVar;
            super(i, i2, i3);
        }

        public void onAdjustVolume(int i) {
            this.f6070a.mo6816b(i);
        }

        public void onSetVolumeTo(int i) {
            this.f6070a.mo6815a(i);
        }
    }

    /* renamed from: androidx.media.o$b */
    /* compiled from: VolumeProviderCompatApi21 */
    public interface C1592b {
        /* renamed from: a */
        void mo6815a(int i);

        /* renamed from: b */
        void mo6816b(int i);
    }

    private C1590o() {
    }

    /* renamed from: a */
    public static Object m8100a(int i, int i2, int i3, C1592b bVar) {
        return new C1591a(i, i2, i3, bVar);
    }

    /* renamed from: a */
    public static void m8101a(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}

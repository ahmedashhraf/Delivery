package cafe.adriel.androidaudiorecorder;

import com.cleveroad.audiovisualization.C3001d;

/* renamed from: cafe.adriel.androidaudiorecorder.d */
/* compiled from: VisualizerHandler */
public class C2795d extends C3001d<Float> {
    /* renamed from: g */
    public void mo10544g() {
        try {
            mo11829a();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10543a(Float f, int i, float[] fArr, float[] fArr2) {
        Float valueOf = Float.valueOf(f.floatValue() / 100.0f);
        if (((double) valueOf.floatValue()) <= 0.5d) {
            valueOf = Float.valueOf(0.0f);
        } else if (((double) valueOf.floatValue()) > 0.5d && ((double) valueOf.floatValue()) <= 0.6d) {
            valueOf = Float.valueOf(0.2f);
        } else if (((double) valueOf.floatValue()) > 0.6d && ((double) valueOf.floatValue()) <= 0.7d) {
            valueOf = Float.valueOf(0.6f);
        } else if (((double) valueOf.floatValue()) > 0.7d) {
            valueOf = Float.valueOf(1.0f);
        }
        try {
            fArr[0] = valueOf.floatValue();
            fArr2[0] = valueOf.floatValue();
        } catch (Exception unused) {
        }
    }
}

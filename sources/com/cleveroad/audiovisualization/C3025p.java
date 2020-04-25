package com.cleveroad.audiovisualization;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.media.audiofx.Visualizer.OnDataCaptureListener;
import androidx.annotation.C0193h0;

/* renamed from: com.cleveroad.audiovisualization.p */
/* compiled from: VisualizerWrapper */
class C3025p {

    /* renamed from: f */
    private static final long f10755f = 500;

    /* renamed from: a */
    private Visualizer f10756a;

    /* renamed from: b */
    private MediaPlayer f10757b;

    /* renamed from: c */
    private OnDataCaptureListener f10758c;

    /* renamed from: d */
    private int f10759d = Visualizer.getMaxCaptureRate();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f10760e;

    /* renamed from: com.cleveroad.audiovisualization.p$a */
    /* compiled from: VisualizerWrapper */
    class C3026a implements OnDataCaptureListener {

        /* renamed from: a */
        final /* synthetic */ C3027b f10761a;

        C3026a(C3027b bVar) {
            this.f10761a = bVar;
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
            boolean a = C3023n.m14434a(bArr);
            if (C3025p.this.f10760e == 0) {
                if (a) {
                    C3025p.this.f10760e = System.currentTimeMillis();
                }
            } else if (!a) {
                C3025p.this.f10760e = 0;
            } else if (System.currentTimeMillis() - C3025p.this.f10760e >= C3025p.f10755f) {
                C3025p.this.mo11907a(true);
                C3025p.this.f10760e = 0;
            }
            this.f10761a.mo11902a(bArr);
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.p$b */
    /* compiled from: VisualizerWrapper */
    public interface C3027b {
        /* renamed from: a */
        void mo11902a(byte[] bArr);
    }

    public C3025p(@C0193h0 Context context, int i, @C0193h0 C3027b bVar) {
        this.f10757b = MediaPlayer.create(context, C2993R.C2997raw.av_workaround_1min);
        this.f10756a = new Visualizer(i);
        this.f10756a.setEnabled(false);
        this.f10756a.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
        this.f10758c = new C3026a(bVar);
        this.f10756a.setEnabled(true);
    }

    /* renamed from: a */
    public void mo11906a() {
        this.f10756a.setEnabled(false);
        this.f10756a.release();
        this.f10756a = null;
        this.f10757b.release();
        this.f10757b = null;
    }

    /* renamed from: a */
    public void mo11907a(boolean z) {
        Visualizer visualizer = this.f10756a;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            if (z) {
                this.f10756a.setDataCaptureListener(this.f10758c, this.f10759d, false, true);
            } else {
                this.f10756a.setDataCaptureListener(null, this.f10759d, false, false);
            }
            this.f10756a.setEnabled(true);
        }
    }
}

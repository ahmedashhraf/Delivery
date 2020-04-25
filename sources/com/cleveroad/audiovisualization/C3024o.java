package com.cleveroad.audiovisualization;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import androidx.annotation.C0193h0;
import com.cleveroad.audiovisualization.C3025p.C3027b;

/* renamed from: com.cleveroad.audiovisualization.o */
/* compiled from: VisualizerDbmHandler */
public class C3024o extends C3001d<byte[]> implements C3027b, OnPreparedListener, OnCompletionListener {

    /* renamed from: Z */
    private static final float f10748Z = 76.0f;

    /* renamed from: T */
    private final C3025p f10749T;

    /* renamed from: U */
    private float[] f10750U;

    /* renamed from: V */
    private float[] f10751V;

    /* renamed from: W */
    private OnPreparedListener f10752W;

    /* renamed from: X */
    private OnCompletionListener f10753X;

    /* renamed from: Y */
    private final float[] f10754Y;

    C3024o(@C0193h0 Context context, int i) {
        this.f10754Y = new float[]{0.001814059f, 0.007936508f, 0.05668934f, 0.22675736f};
        this.f10749T = new C3025p(context, i, this);
    }

    /* renamed from: b */
    public void mo11832b() {
        this.f10749T.mo11907a(false);
        super.mo11832b();
    }

    /* renamed from: c */
    public void mo11833c() {
        super.mo11833c();
        this.f10749T.mo11907a(true);
    }

    /* renamed from: d */
    public void mo11834d() {
        super.mo11834d();
        this.f10749T.mo11906a();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mo11829a();
        this.f10749T.mo11907a(false);
        OnCompletionListener onCompletionListener = this.f10753X;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mo11835e();
        this.f10749T.mo11907a(true);
        OnPreparedListener onPreparedListener = this.f10752W;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10543a(byte[] bArr, int i, float[] fArr, float[] fArr2) {
        int length = (bArr.length / 2) - 1;
        float[] fArr3 = this.f10750U;
        if (fArr3 == null || fArr3.length != length) {
            this.f10750U = new float[length];
        }
        float[] fArr4 = this.f10751V;
        if (fArr4 == null || fArr4.length != length) {
            this.f10751V = new float[length];
        }
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            float f = (float) bArr[i3];
            float f2 = (float) bArr[i3 + 1];
            float f3 = (f * f) + (f2 * f2);
            this.f10750U[i2] = C3023n.m14427a(f3);
            float f4 = 1.0f;
            if (i2 == 0 || i2 == length - 1) {
                f4 = 2.0f;
            }
            float[] fArr5 = this.f10751V;
            double d = (double) f4;
            double sqrt = Math.sqrt((double) f3);
            Double.isNaN(d);
            double d2 = d * sqrt;
            double d3 = (double) length;
            Double.isNaN(d3);
            fArr5[i2] = (float) (d2 / d3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            int length2 = (int) (this.f10754Y[i4] * ((float) bArr.length));
            float f5 = this.f10750U[length2];
            float f6 = this.f10751V[length2];
            fArr[i4] = f5 / f10748Z;
            fArr2[i4] = f6;
        }
    }

    C3024o(@C0193h0 Context context, @C0193h0 MediaPlayer mediaPlayer) {
        this(context, mediaPlayer.getAudioSessionId());
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
    }

    /* renamed from: a */
    public void mo11902a(byte[] bArr) {
        mo11831a(bArr);
    }

    /* renamed from: a */
    public void mo11901a(OnPreparedListener onPreparedListener) {
        this.f10752W = onPreparedListener;
    }

    /* renamed from: a */
    public void mo11900a(OnCompletionListener onCompletionListener) {
        this.f10753X = onCompletionListener;
    }
}

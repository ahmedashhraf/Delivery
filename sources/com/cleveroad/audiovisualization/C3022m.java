package com.cleveroad.audiovisualization;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: com.cleveroad.audiovisualization.m */
/* compiled from: SpeechRecognizerDbmHandler */
public class C3022m extends C3001d<Float> implements RecognitionListener {

    /* renamed from: X */
    private static final float f10742X = -2.12f;

    /* renamed from: Y */
    private static final float f10743Y = 10.0f;

    /* renamed from: T */
    private final SpeechRecognizer f10744T;

    /* renamed from: U */
    private final float f10745U;

    /* renamed from: V */
    private final float f10746V;

    /* renamed from: W */
    private RecognitionListener f10747W;

    C3022m(@C0193h0 Context context) {
        this(context, f10742X, 10.0f);
    }

    /* renamed from: d */
    public void mo11834d() {
        super.mo11834d();
        this.f10744T.destroy();
    }

    /* renamed from: g */
    public RecognitionListener mo10544g() {
        return this.f10747W;
    }

    /* renamed from: h */
    public void mo11890h() {
        this.f10744T.stopListening();
    }

    public void onBeginningOfSpeech() {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onBeginningOfSpeech();
        }
    }

    public void onBufferReceived(byte[] bArr) {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onBufferReceived(bArr);
        }
    }

    public void onEndOfSpeech() {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onEndOfSpeech();
        }
    }

    public void onError(int i) {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onError(i);
        }
    }

    public void onEvent(int i, Bundle bundle) {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onEvent(i, bundle);
        }
    }

    public void onPartialResults(Bundle bundle) {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onPartialResults(bundle);
        }
    }

    public void onReadyForSpeech(Bundle bundle) {
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onReadyForSpeech(bundle);
        }
    }

    public void onResults(Bundle bundle) {
        this.f10744T.cancel();
        mo11831a(Float.valueOf(this.f10745U));
        mo11829a();
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onResults(bundle);
        }
    }

    public void onRmsChanged(float f) {
        mo11831a(Float.valueOf(f));
        RecognitionListener recognitionListener = this.f10747W;
        if (recognitionListener != null) {
            recognitionListener.onRmsChanged(f);
        }
    }

    C3022m(@C0193h0 Context context, float f, float f2) {
        this.f10744T = SpeechRecognizer.createSpeechRecognizer(context);
        this.f10744T.setRecognitionListener(this);
        this.f10745U = f;
        this.f10746V = f2;
    }

    /* renamed from: a */
    public void mo11888a(Intent intent) {
        this.f10744T.startListening(intent);
    }

    /* renamed from: a */
    public C3022m mo11887a(@C0195i0 RecognitionListener recognitionListener) {
        this.f10747W = recognitionListener;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10543a(Float f, int i, float[] fArr, float[] fArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = C3023n.m14438b(f.floatValue(), this.f10745U, this.f10746V);
            fArr2[i2] = 1.0f;
        }
    }
}

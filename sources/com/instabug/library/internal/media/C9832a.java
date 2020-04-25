package com.instabug.library.internal.media;

import android.media.MediaRecorder;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.media.a */
/* compiled from: AudioRecorder */
public class C9832a {

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f26058d;

    /* renamed from: a */
    private final String f26059a;

    /* renamed from: b */
    private MediaRecorder f26060b = null;

    /* renamed from: c */
    private boolean f26061c = false;

    public C9832a(String str) {
        boolean[] c = m45833c();
        this.f26059a = str;
        c[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45833c() {
        boolean[] zArr = f26058d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6159700054803184629L, "com/instabug/library/internal/media/AudioRecorder", 23);
        f26058d = a;
        return a;
    }

    /* renamed from: a */
    public void mo34967a() {
        boolean[] c = m45833c();
        this.f26060b = new MediaRecorder();
        c[1] = true;
        this.f26060b.setAudioSource(1);
        c[2] = true;
        this.f26060b.setOutputFormat(2);
        c[3] = true;
        this.f26060b.setOutputFile(this.f26059a);
        c[4] = true;
        this.f26060b.setAudioEncoder(3);
        try {
            c[5] = true;
            this.f26060b.prepare();
            c[6] = true;
            this.f26060b.start();
            this.f26061c = true;
            c[7] = true;
        } catch (IOException e) {
            c[8] = true;
            InstabugSDKLogger.m46624e(this, "Recording audio failed", e);
            this.f26061c = false;
            c[9] = true;
        }
        c[10] = true;
    }

    /* renamed from: b */
    public void mo34968b() {
        boolean[] c = m45833c();
        MediaRecorder mediaRecorder = this.f26060b;
        if (mediaRecorder == null) {
            c[11] = true;
            return;
        }
        if (!this.f26061c) {
            c[12] = true;
        } else {
            try {
                c[13] = true;
                mediaRecorder.stop();
                c[14] = true;
                this.f26060b.reset();
                c[15] = true;
            } catch (RuntimeException e) {
                c[17] = true;
                InstabugSDKLogger.m46624e(this, "Stopping audio recorder failed", e);
                c[18] = true;
            } finally {
                this.f26060b.release();
                this.f26061c = false;
                this.f26060b = null;
                c[20] = true;
            }
        }
        c[21] = true;
    }
}

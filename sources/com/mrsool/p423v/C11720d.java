package com.mrsool.p423v;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Handler;
import java.io.IOException;

/* renamed from: com.mrsool.v.d */
/* compiled from: MediaPlayerUtils */
public class C11720d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static MediaPlayer f33929a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C11723c f33930b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f33931c;

    /* renamed from: d */
    private static OnCompletionListener f33932d = new C11721a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Runnable f33933e = new C11722b();

    /* renamed from: com.mrsool.v.d$a */
    /* compiled from: MediaPlayerUtils */
    static class C11721a implements OnCompletionListener {
        C11721a() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            C11720d.m52774l();
            C11720d.f33930b.mo37869a();
        }
    }

    /* renamed from: com.mrsool.v.d$b */
    /* compiled from: MediaPlayerUtils */
    static class C11722b implements Runnable {
        C11722b() {
        }

        public void run() {
            try {
                if (C11720d.m52771i()) {
                    C11720d.f33931c.postDelayed(C11720d.f33933e, 100);
                    C11720d.f33930b.mo37870a(C11720d.f33929a.getCurrentPosition());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.v.d$c */
    /* compiled from: MediaPlayerUtils */
    public interface C11723c {
        /* renamed from: a */
        void mo37869a();

        /* renamed from: a */
        void mo37870a(int i);
    }

    /* renamed from: e */
    public static void m52767e() {
        if (f33929a == null) {
            f33929a = new MediaPlayer();
        }
        if (f33931c == null) {
            f33931c = new Handler();
        }
    }

    /* renamed from: f */
    public static MediaPlayer m52768f() {
        return f33929a;
    }

    /* renamed from: g */
    public static int m52769g() {
        return f33929a.getDuration();
    }

    /* renamed from: h */
    public static boolean m52770h() {
        MediaPlayer mediaPlayer = f33929a;
        return mediaPlayer != null && !mediaPlayer.isPlaying() && f33929a.getCurrentPosition() > 1;
    }

    /* renamed from: i */
    public static boolean m52771i() {
        MediaPlayer mediaPlayer = f33929a;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    /* renamed from: j */
    public static void m52772j() {
        f33929a.pause();
    }

    /* renamed from: k */
    public static void m52773k() {
        f33929a.setAudioStreamType(3);
        f33929a.start();
        f33931c.postDelayed(f33933e, 100);
    }

    /* renamed from: l */
    public static void m52774l() {
        MediaPlayer mediaPlayer = f33929a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            f33929a.reset();
            f33929a.release();
            f33929a = null;
        }
    }

    /* renamed from: a */
    public static void m52761a(int i) {
        f33929a.seekTo(i);
        f33931c.postDelayed(f33933e, 100);
    }

    /* renamed from: a */
    public static void m52763a(String str, C11723c cVar) throws IOException {
        f33930b = cVar;
        m52767e();
        if (m52771i()) {
            m52772j();
        }
        m52774l();
        m52767e();
        f33929a.setDataSource(str);
        f33929a.prepare();
        f33929a.setOnCompletionListener(f33932d);
        f33931c.postDelayed(f33933e, 100);
        m52773k();
    }

    /* renamed from: a */
    public static void m52762a(MediaPlayer mediaPlayer) {
        f33929a = mediaPlayer;
    }
}

package omrecorder;

import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build.VERSION;
import omrecorder.C15058k.C15059a;

/* renamed from: omrecorder.i */
/* compiled from: PullableSource */
public interface C15051i extends C15058k {

    /* renamed from: omrecorder.i$a */
    /* compiled from: PullableSource */
    public static class C15052a extends C15053b {
        public C15052a(C15051i iVar) {
            super(iVar);
        }

        /* renamed from: b */
        public AudioRecord mo46710b() {
            if (VERSION.SDK_INT >= 16 && AutomaticGainControl.isAvailable()) {
                AutomaticGainControl create = AutomaticGainControl.create(mo46713a().getAudioSessionId());
                if (create != null) {
                    create.setEnabled(true);
                }
            }
            return super.mo46710b();
        }
    }

    /* renamed from: omrecorder.i$b */
    /* compiled from: PullableSource */
    public static class C15053b implements C15051i {

        /* renamed from: a */
        private final C15051i f43791a;

        C15053b(C15051i iVar) {
            this.f43791a = iVar;
        }

        /* renamed from: a */
        public AudioRecord mo46713a() {
            return this.f43791a.mo46713a();
        }

        /* renamed from: b */
        public AudioRecord mo46710b() {
            return this.f43791a.mo46710b();
        }

        /* renamed from: c */
        public int mo46714c() {
            return this.f43791a.mo46714c();
        }

        /* renamed from: d */
        public boolean mo46711d() {
            return this.f43791a.mo46711d();
        }

        /* renamed from: e */
        public C15038c mo46715e() {
            return this.f43791a.mo46715e();
        }

        /* renamed from: f */
        public int mo46712f() {
            return this.f43791a.mo46712f();
        }

        /* renamed from: a */
        public void mo46709a(boolean z) {
            this.f43791a.mo46709a(z);
        }
    }

    /* renamed from: omrecorder.i$c */
    /* compiled from: PullableSource */
    public static class C15054c extends C15059a implements C15051i {

        /* renamed from: d */
        private final int f43792d;

        /* renamed from: e */
        private volatile boolean f43793e;

        public C15054c(C15038c cVar, int i) {
            super(cVar);
            this.f43792d = i;
        }

        /* renamed from: a */
        public void mo46709a(boolean z) {
            this.f43793e = z;
        }

        /* renamed from: b */
        public AudioRecord mo46710b() {
            AudioRecord a = mo46713a();
            a.startRecording();
            mo46709a(true);
            return a;
        }

        /* renamed from: d */
        public boolean mo46711d() {
            return this.f43793e;
        }

        /* renamed from: f */
        public int mo46712f() {
            return this.f43792d;
        }

        public C15054c(C15038c cVar) {
            super(cVar);
            this.f43792d = mo46714c();
        }
    }

    /* renamed from: omrecorder.i$d */
    /* compiled from: PullableSource */
    public static class C15055d extends C15053b {
        public C15055d(C15051i iVar) {
            super(iVar);
        }

        /* renamed from: b */
        public AudioRecord mo46710b() {
            if (VERSION.SDK_INT >= 16 && NoiseSuppressor.isAvailable()) {
                NoiseSuppressor create = NoiseSuppressor.create(mo46713a().getAudioSessionId());
                if (create != null) {
                    create.setEnabled(true);
                }
            }
            return super.mo46710b();
        }
    }

    /* renamed from: a */
    void mo46709a(boolean z);

    /* renamed from: b */
    AudioRecord mo46710b();

    /* renamed from: d */
    boolean mo46711d();

    /* renamed from: f */
    int mo46712f();
}

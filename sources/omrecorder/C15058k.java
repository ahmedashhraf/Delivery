package omrecorder;

import android.media.AudioRecord;

/* renamed from: omrecorder.k */
/* compiled from: Source */
interface C15058k {

    /* renamed from: omrecorder.k$a */
    /* compiled from: Source */
    public static class C15059a implements C15058k {

        /* renamed from: a */
        private final AudioRecord f43794a;

        /* renamed from: b */
        private final C15038c f43795b;

        /* renamed from: c */
        private final int f43796c;

        C15059a(C15038c cVar) {
            this.f43795b = cVar;
            this.f43796c = new C15041e(cVar).mo46700a();
            AudioRecord audioRecord = new AudioRecord(cVar.mo46699e(), cVar.mo46696b(), cVar.mo46697c(), cVar.mo46695a(), this.f43796c);
            this.f43794a = audioRecord;
        }

        /* renamed from: a */
        public AudioRecord mo46713a() {
            return this.f43794a;
        }

        /* renamed from: c */
        public int mo46714c() {
            return this.f43796c;
        }

        /* renamed from: e */
        public C15038c mo46715e() {
            return this.f43795b;
        }
    }

    /* renamed from: a */
    AudioRecord mo46713a();

    /* renamed from: c */
    int mo46714c();

    /* renamed from: e */
    C15038c mo46715e();
}

package omrecorder;

/* renamed from: omrecorder.c */
/* compiled from: AudioRecordConfig */
public interface C15038c {

    /* renamed from: omrecorder.c$a */
    /* compiled from: AudioRecordConfig */
    public static class C15039a implements C15038c {

        /* renamed from: a */
        private final int f43766a;

        /* renamed from: b */
        private final int f43767b;

        /* renamed from: c */
        private final int f43768c;

        /* renamed from: d */
        private final int f43769d;

        public C15039a(int i, int i2, int i3, int i4) {
            this.f43766a = i;
            this.f43769d = i2;
            this.f43767b = i3;
            this.f43768c = i4;
        }

        /* renamed from: a */
        public int mo46695a() {
            return this.f43769d;
        }

        /* renamed from: b */
        public int mo46696b() {
            return this.f43768c;
        }

        /* renamed from: c */
        public int mo46697c() {
            return this.f43767b;
        }

        /* renamed from: d */
        public byte mo46698d() {
            int i = this.f43769d;
            return (i != 2 && i == 3) ? (byte) 8 : 16;
        }

        /* renamed from: e */
        public int mo46699e() {
            return this.f43766a;
        }
    }

    /* renamed from: a */
    int mo46695a();

    /* renamed from: b */
    int mo46696b();

    /* renamed from: c */
    int mo46697c();

    /* renamed from: d */
    byte mo46698d();

    /* renamed from: e */
    int mo46699e();
}

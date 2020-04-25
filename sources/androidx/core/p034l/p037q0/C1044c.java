package androidx.core.p034l.p037q0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.l.q0.c */
/* compiled from: InputContentInfoCompat */
public final class C1044c {

    /* renamed from: a */
    private final C1047c f4685a;

    @RequiresApi(25)
    /* renamed from: androidx.core.l.q0.c$a */
    /* compiled from: InputContentInfoCompat */
    private static final class C1045a implements C1047c {
        @C0193h0

        /* renamed from: a */
        final InputContentInfo f4686a;

        C1045a(@C0193h0 Object obj) {
            this.f4686a = (InputContentInfo) obj;
        }

        @C0193h0
        /* renamed from: d */
        public ClipDescription mo5157d() {
            return this.f4686a.getDescription();
        }

        @C0193h0
        /* renamed from: e */
        public Uri mo5158e() {
            return this.f4686a.getContentUri();
        }

        /* renamed from: f */
        public void mo5159f() {
            this.f4686a.requestPermission();
        }

        @C0195i0
        /* renamed from: g */
        public Uri mo5160g() {
            return this.f4686a.getLinkUri();
        }

        @C0195i0
        /* renamed from: h */
        public Object mo5161h() {
            return this.f4686a;
        }

        /* renamed from: i */
        public void mo5162i() {
            this.f4686a.releasePermission();
        }

        C1045a(@C0193h0 Uri uri, @C0193h0 ClipDescription clipDescription, @C0195i0 Uri uri2) {
            this.f4686a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    /* renamed from: androidx.core.l.q0.c$b */
    /* compiled from: InputContentInfoCompat */
    private static final class C1046b implements C1047c {
        @C0193h0

        /* renamed from: a */
        private final Uri f4687a;
        @C0193h0

        /* renamed from: b */
        private final ClipDescription f4688b;
        @C0195i0

        /* renamed from: c */
        private final Uri f4689c;

        C1046b(@C0193h0 Uri uri, @C0193h0 ClipDescription clipDescription, @C0195i0 Uri uri2) {
            this.f4687a = uri;
            this.f4688b = clipDescription;
            this.f4689c = uri2;
        }

        @C0193h0
        /* renamed from: d */
        public ClipDescription mo5157d() {
            return this.f4688b;
        }

        @C0193h0
        /* renamed from: e */
        public Uri mo5158e() {
            return this.f4687a;
        }

        /* renamed from: f */
        public void mo5159f() {
        }

        @C0195i0
        /* renamed from: g */
        public Uri mo5160g() {
            return this.f4689c;
        }

        @C0195i0
        /* renamed from: h */
        public Object mo5161h() {
            return null;
        }

        /* renamed from: i */
        public void mo5162i() {
        }
    }

    /* renamed from: androidx.core.l.q0.c$c */
    /* compiled from: InputContentInfoCompat */
    private interface C1047c {
        @C0193h0
        /* renamed from: d */
        ClipDescription mo5157d();

        @C0193h0
        /* renamed from: e */
        Uri mo5158e();

        /* renamed from: f */
        void mo5159f();

        @C0195i0
        /* renamed from: g */
        Uri mo5160g();

        @C0195i0
        /* renamed from: h */
        Object mo5161h();

        /* renamed from: i */
        void mo5162i();
    }

    public C1044c(@C0193h0 Uri uri, @C0193h0 ClipDescription clipDescription, @C0195i0 Uri uri2) {
        if (VERSION.SDK_INT >= 25) {
            this.f4685a = new C1045a(uri, clipDescription, uri2);
        } else {
            this.f4685a = new C1046b(uri, clipDescription, uri2);
        }
    }

    @C0193h0
    /* renamed from: a */
    public Uri mo5151a() {
        return this.f4685a.mo5158e();
    }

    @C0193h0
    /* renamed from: b */
    public ClipDescription mo5152b() {
        return this.f4685a.mo5157d();
    }

    @C0195i0
    /* renamed from: c */
    public Uri mo5153c() {
        return this.f4685a.mo5160g();
    }

    /* renamed from: d */
    public void mo5154d() {
        this.f4685a.mo5162i();
    }

    /* renamed from: e */
    public void mo5155e() {
        this.f4685a.mo5159f();
    }

    @C0195i0
    /* renamed from: f */
    public Object mo5156f() {
        return this.f4685a.mo5161h();
    }

    @C0195i0
    /* renamed from: a */
    public static C1044c m6078a(@C0195i0 Object obj) {
        if (obj != null && VERSION.SDK_INT >= 25) {
            return new C1044c(new C1045a(obj));
        }
        return null;
    }

    private C1044c(@C0193h0 C1047c cVar) {
        this.f4685a = cVar;
    }
}

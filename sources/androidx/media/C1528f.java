package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p003v4.media.MediaBrowserCompat;
import android.support.p003v4.media.MediaBrowserCompat.MediaItem;
import android.support.p003v4.media.session.C0134b;
import android.support.p003v4.media.session.MediaSessionCompat;
import android.support.p003v4.media.session.MediaSessionCompat.Token;
import android.support.p003v4.p004os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.collection.C0635a;
import androidx.core.app.C0748i;
import androidx.core.p033k.C0938f;
import androidx.media.C1565g.C1569d;
import androidx.media.C1570h.C1572b;
import androidx.media.C1573i.C1576c;
import androidx.media.C1577j.C1579b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.media.f */
/* compiled from: MediaBrowserServiceCompat */
public abstract class C1528f extends Service {

    /* renamed from: Q */
    static final String f5909Q = "MBServiceCompat";

    /* renamed from: R */
    static final boolean f5910R = Log.isLoggable(f5909Q, 3);

    /* renamed from: S */
    private static final float f5911S = 1.0E-5f;

    /* renamed from: T */
    public static final String f5912T = "android.media.browse.MediaBrowserService";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: U */
    public static final String f5913U = "media_item";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: V */
    public static final String f5914V = "search_results";

    /* renamed from: W */
    static final int f5915W = 1;

    /* renamed from: X */
    static final int f5916X = 2;

    /* renamed from: Y */
    static final int f5917Y = 4;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: Z */
    public static final int f5918Z = -1;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: a0 */
    public static final int f5919a0 = 0;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: b0 */
    public static final int f5920b0 = 1;

    /* renamed from: N */
    C1534f f5921N;

    /* renamed from: O */
    final C1564q f5922O = new C1564q();

    /* renamed from: P */
    Token f5923P;

    /* renamed from: a */
    private C1536g f5924a;

    /* renamed from: b */
    final C0635a<IBinder, C1534f> f5925b = new C0635a<>();

    /* renamed from: androidx.media.f$a */
    /* compiled from: MediaBrowserServiceCompat */
    class C1529a extends C1551m<List<MediaItem>> {

        /* renamed from: g */
        final /* synthetic */ C1534f f5926g;

        /* renamed from: h */
        final /* synthetic */ String f5927h;

        /* renamed from: i */
        final /* synthetic */ Bundle f5928i;

        /* renamed from: j */
        final /* synthetic */ Bundle f5929j;

        C1529a(Object obj, C1534f fVar, String str, Bundle bundle, Bundle bundle2) {
            this.f5926g = fVar;
            this.f5927h = str;
            this.f5928i = bundle;
            this.f5929j = bundle2;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6712a(List<MediaItem> list) {
            if (C1528f.this.f5925b.get(this.f5926g.f5948f.asBinder()) != this.f5926g) {
                if (C1528f.f5910R) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb.append(this.f5926g.f5943a);
                    sb.append(" id=");
                    sb.append(this.f5927h);
                    sb.toString();
                }
                return;
            }
            if ((mo6750b() & 1) != 0) {
                list = C1528f.this.mo6687a(list, this.f5928i);
            }
            try {
                this.f5926g.f5948f.mo6775a(this.f5927h, list, this.f5928i, this.f5929j);
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calling onLoadChildren() failed for id=");
                sb2.append(this.f5927h);
                sb2.append(" package=");
                sb2.append(this.f5926g.f5943a);
                sb2.toString();
            }
        }
    }

    /* renamed from: androidx.media.f$b */
    /* compiled from: MediaBrowserServiceCompat */
    class C1530b extends C1551m<MediaItem> {

        /* renamed from: g */
        final /* synthetic */ ResultReceiver f5931g;

        C1530b(Object obj, ResultReceiver resultReceiver) {
            this.f5931g = resultReceiver;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6712a(MediaItem mediaItem) {
            if ((mo6750b() & 2) != 0) {
                this.f5931g.mo611b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C1528f.f5913U, mediaItem);
            this.f5931g.mo611b(0, bundle);
        }
    }

    /* renamed from: androidx.media.f$c */
    /* compiled from: MediaBrowserServiceCompat */
    class C1531c extends C1551m<List<MediaItem>> {

        /* renamed from: g */
        final /* synthetic */ ResultReceiver f5933g;

        C1531c(Object obj, ResultReceiver resultReceiver) {
            this.f5933g = resultReceiver;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6712a(List<MediaItem> list) {
            if ((mo6750b() & 4) != 0 || list == null) {
                this.f5933g.mo611b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(C1528f.f5914V, (Parcelable[]) list.toArray(new MediaItem[0]));
            this.f5933g.mo611b(0, bundle);
        }
    }

    /* renamed from: androidx.media.f$d */
    /* compiled from: MediaBrowserServiceCompat */
    class C1532d extends C1551m<Bundle> {

        /* renamed from: g */
        final /* synthetic */ ResultReceiver f5935g;

        C1532d(Object obj, ResultReceiver resultReceiver) {
            this.f5935g = resultReceiver;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6717b(Bundle bundle) {
            this.f5935g.mo611b(1, bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo6712a(Bundle bundle) {
            this.f5935g.mo611b(0, bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6716a(Bundle bundle) {
            this.f5935g.mo611b(-1, bundle);
        }
    }

    /* renamed from: androidx.media.f$e */
    /* compiled from: MediaBrowserServiceCompat */
    public static final class C1533e {

        /* renamed from: c */
        public static final String f5937c = "android.service.media.extra.RECENT";

        /* renamed from: d */
        public static final String f5938d = "android.service.media.extra.OFFLINE";

        /* renamed from: e */
        public static final String f5939e = "android.service.media.extra.SUGGESTED";
        @Deprecated

        /* renamed from: f */
        public static final String f5940f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a */
        private final String f5941a;

        /* renamed from: b */
        private final Bundle f5942b;

        public C1533e(@C0193h0 String str, @C0195i0 Bundle bundle) {
            if (str != null) {
                this.f5941a = str;
                this.f5942b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        /* renamed from: a */
        public Bundle mo6719a() {
            return this.f5942b;
        }

        /* renamed from: b */
        public String mo6720b() {
            return this.f5941a;
        }
    }

    /* renamed from: androidx.media.f$f */
    /* compiled from: MediaBrowserServiceCompat */
    private class C1534f implements DeathRecipient {

        /* renamed from: a */
        public final String f5943a;

        /* renamed from: b */
        public final int f5944b;

        /* renamed from: c */
        public final int f5945c;

        /* renamed from: d */
        public final C1579b f5946d;

        /* renamed from: e */
        public final Bundle f5947e;

        /* renamed from: f */
        public final C1562o f5948f;

        /* renamed from: g */
        public final HashMap<String, List<C0938f<IBinder, Bundle>>> f5949g = new HashMap<>();

        /* renamed from: h */
        public C1533e f5950h;

        /* renamed from: androidx.media.f$f$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1535a implements Runnable {
            C1535a() {
            }

            public void run() {
                C1534f fVar = C1534f.this;
                C1528f.this.f5925b.remove(fVar.f5948f.asBinder());
            }
        }

        C1534f(String str, int i, int i2, Bundle bundle, C1562o oVar) {
            this.f5943a = str;
            this.f5944b = i;
            this.f5945c = i2;
            this.f5946d = new C1579b(str, i, i2);
            this.f5947e = bundle;
            this.f5948f = oVar;
        }

        public void binderDied() {
            C1528f.this.f5922O.post(new C1535a());
        }
    }

    /* renamed from: androidx.media.f$g */
    /* compiled from: MediaBrowserServiceCompat */
    interface C1536g {
        /* renamed from: a */
        IBinder mo6723a(Intent intent);

        /* renamed from: a */
        void mo6724a();

        /* renamed from: a */
        void mo6725a(Token token);

        /* renamed from: a */
        void mo6726a(C1579b bVar, String str, Bundle bundle);

        /* renamed from: a */
        void mo6727a(String str, Bundle bundle);

        /* renamed from: b */
        Bundle mo6728b();

        /* renamed from: c */
        C1579b mo6729c();
    }

    @RequiresApi(21)
    /* renamed from: androidx.media.f$h */
    /* compiled from: MediaBrowserServiceCompat */
    class C1537h implements C1536g, C1569d {

        /* renamed from: a */
        final List<Bundle> f5953a = new ArrayList();

        /* renamed from: b */
        Object f5954b;

        /* renamed from: c */
        Messenger f5955c;

        /* renamed from: androidx.media.f$h$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1538a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Token f5957a;

            C1538a(Token token) {
                this.f5957a = token;
            }

            public void run() {
                if (!C1537h.this.f5953a.isEmpty()) {
                    C0134b a = this.f5957a.mo370a();
                    if (a != null) {
                        for (Bundle a2 : C1537h.this.f5953a) {
                            C0748i.m4316a(a2, C1527e.f5901s, a.asBinder());
                        }
                    }
                    C1537h.this.f5953a.clear();
                }
                C1565g.m8049a(C1537h.this.f5954b, this.f5957a.mo374c());
            }
        }

        /* renamed from: androidx.media.f$h$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1539b extends C1551m<List<MediaItem>> {

            /* renamed from: g */
            final /* synthetic */ C1568c f5959g;

            C1539b(Object obj, C1568c cVar) {
                this.f5959g = cVar;
                super(obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo6712a(List<MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f5959g.mo6784a(arrayList);
            }

            /* renamed from: a */
            public void mo6737a() {
                this.f5959g.mo6783a();
            }
        }

        /* renamed from: androidx.media.f$h$c */
        /* compiled from: MediaBrowserServiceCompat */
        class C1540c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f5962a;

            /* renamed from: b */
            final /* synthetic */ Bundle f5963b;

            C1540c(String str, Bundle bundle) {
                this.f5962a = str;
                this.f5963b = bundle;
            }

            public void run() {
                for (IBinder iBinder : C1528f.this.f5925b.keySet()) {
                    C1537h.this.mo6731a((C1534f) C1528f.this.f5925b.get(iBinder), this.f5962a, this.f5963b);
                }
            }
        }

        /* renamed from: androidx.media.f$h$d */
        /* compiled from: MediaBrowserServiceCompat */
        class C1541d implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f5964N;

            /* renamed from: a */
            final /* synthetic */ C1579b f5966a;

            /* renamed from: b */
            final /* synthetic */ String f5967b;

            C1541d(C1579b bVar, String str, Bundle bundle) {
                this.f5966a = bVar;
                this.f5967b = str;
                this.f5964N = bundle;
            }

            public void run() {
                for (int i = 0; i < C1528f.this.f5925b.size(); i++) {
                    C1534f fVar = (C1534f) C1528f.this.f5925b.mo3367d(i);
                    if (fVar.f5946d.equals(this.f5966a)) {
                        C1537h.this.mo6731a(fVar, this.f5967b, this.f5964N);
                    }
                }
            }
        }

        C1537h() {
        }

        /* renamed from: a */
        public void mo6724a() {
            this.f5954b = C1565g.m8047a((Context) C1528f.this, (C1569d) this);
            C1565g.m8048a(this.f5954b);
        }

        /* renamed from: b */
        public void mo6734b(String str, C1568c<List<Parcel>> cVar) {
            C1528f.this.mo6698a(str, (C1551m<List<MediaItem>>) new C1539b<List<MediaItem>>(str, cVar));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo6735c(String str, Bundle bundle) {
            C1565g.m8050a(this.f5954b, str);
        }

        /* renamed from: c */
        public C1579b mo6729c() {
            C1534f fVar = C1528f.this.f5921N;
            if (fVar != null) {
                return fVar.f5946d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: a */
        public IBinder mo6723a(Intent intent) {
            return C1565g.m8046a(this.f5954b, intent);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6733b(String str, Bundle bundle) {
            C1528f.this.f5922O.post(new C1540c(str, bundle));
        }

        /* renamed from: a */
        public void mo6725a(Token token) {
            C1528f.this.f5922O.mo6777a(new C1538a(token));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6732b(C1579b bVar, String str, Bundle bundle) {
            C1528f.this.f5922O.post(new C1541d(bVar, str, bundle));
        }

        /* renamed from: a */
        public void mo6727a(String str, Bundle bundle) {
            mo6735c(str, bundle);
            mo6733b(str, bundle);
        }

        /* renamed from: b */
        public Bundle mo6728b() {
            Bundle bundle = null;
            if (this.f5955c == null) {
                return null;
            }
            C1534f fVar = C1528f.this.f5921N;
            if (fVar != null) {
                Bundle bundle2 = fVar.f5947e;
                if (bundle2 != null) {
                    bundle = new Bundle(bundle2);
                }
                return bundle;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: a */
        public void mo6726a(C1579b bVar, String str, Bundle bundle) {
            mo6732b(bVar, str, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media.C1565g.C1566a mo6730a(java.lang.String r12, int r13, android.os.Bundle r14) {
            /*
                r11 = this;
                r0 = 0
                if (r14 == 0) goto L_0x004e
                r1 = 0
                java.lang.String r2 = "extra_client_version"
                int r1 = r14.getInt(r2, r1)
                if (r1 == 0) goto L_0x004e
                r14.remove(r2)
                android.os.Messenger r1 = new android.os.Messenger
                androidx.media.f r2 = androidx.media.C1528f.this
                androidx.media.f$q r2 = r2.f5922O
                r1.<init>(r2)
                r11.f5955c = r1
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r2 = 2
                java.lang.String r3 = "extra_service_version"
                r1.putInt(r3, r2)
                android.os.Messenger r2 = r11.f5955c
                android.os.IBinder r2 = r2.getBinder()
                java.lang.String r3 = "extra_messenger"
                androidx.core.app.C0748i.m4316a(r1, r3, r2)
                androidx.media.f r2 = androidx.media.C1528f.this
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.f5923P
                if (r2 == 0) goto L_0x0048
                android.support.v4.media.session.b r2 = r2.mo370a()
                if (r2 != 0) goto L_0x003e
                r2 = r0
                goto L_0x0042
            L_0x003e:
                android.os.IBinder r2 = r2.asBinder()
            L_0x0042:
                java.lang.String r3 = "extra_session_binder"
                androidx.core.app.C0748i.m4316a(r1, r3, r2)
                goto L_0x004f
            L_0x0048:
                java.util.List<android.os.Bundle> r2 = r11.f5953a
                r2.add(r1)
                goto L_0x004f
            L_0x004e:
                r1 = r0
            L_0x004f:
                androidx.media.f r9 = androidx.media.C1528f.this
                androidx.media.f$f r10 = new androidx.media.f$f
                r5 = -1
                r8 = 0
                r2 = r10
                r3 = r9
                r4 = r12
                r6 = r13
                r7 = r14
                r2.<init>(r4, r5, r6, r7, r8)
                r9.f5921N = r10
                androidx.media.f r2 = androidx.media.C1528f.this
                androidx.media.f$e r12 = r2.mo6686a(r12, r13, r14)
                androidx.media.f r13 = androidx.media.C1528f.this
                r13.f5921N = r0
                if (r12 != 0) goto L_0x006c
                return r0
            L_0x006c:
                if (r1 != 0) goto L_0x0073
                android.os.Bundle r1 = r12.mo6719a()
                goto L_0x0080
            L_0x0073:
                android.os.Bundle r13 = r12.mo6719a()
                if (r13 == 0) goto L_0x0080
                android.os.Bundle r13 = r12.mo6719a()
                r1.putAll(r13)
            L_0x0080:
                androidx.media.g$a r13 = new androidx.media.g$a
                java.lang.String r12 = r12.mo6720b()
                r13.<init>(r12, r1)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.C1528f.C1537h.mo6730a(java.lang.String, int, android.os.Bundle):androidx.media.g$a");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6731a(C1534f fVar, String str, Bundle bundle) {
            List<C0938f> list = (List) fVar.f5949g.get(str);
            if (list != null) {
                for (C0938f fVar2 : list) {
                    if (C1526d.m7937b(bundle, (Bundle) fVar2.f4244b)) {
                        C1528f.this.mo6695a(str, fVar, (Bundle) fVar2.f4244b, bundle);
                    }
                }
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.media.f$i */
    /* compiled from: MediaBrowserServiceCompat */
    class C1542i extends C1537h implements C1572b {

        /* renamed from: androidx.media.f$i$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1543a extends C1551m<MediaItem> {

            /* renamed from: g */
            final /* synthetic */ C1568c f5969g;

            C1543a(Object obj, C1568c cVar) {
                this.f5969g = cVar;
                super(obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo6712a(MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f5969g.mo6784a(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f5969g.mo6784a(obtain);
            }

            /* renamed from: a */
            public void mo6737a() {
                this.f5969g.mo6783a();
            }
        }

        C1542i() {
            super();
        }

        /* renamed from: a */
        public void mo6724a() {
            this.f5954b = C1570h.m8056a(C1528f.this, this);
            C1565g.m8048a(this.f5954b);
        }

        /* renamed from: a */
        public void mo6741a(String str, C1568c<Parcel> cVar) {
            C1528f.this.mo6707b(str, (C1551m<MediaItem>) new C1543a<MediaItem>(str, cVar));
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.media.f$j */
    /* compiled from: MediaBrowserServiceCompat */
    class C1544j extends C1542i implements C1576c {

        /* renamed from: androidx.media.f$j$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1545a extends C1551m<List<MediaItem>> {

            /* renamed from: g */
            final /* synthetic */ C1575b f5972g;

            C1545a(Object obj, C1575b bVar) {
                this.f5972g = bVar;
                super(obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo6712a(List<MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f5972g.mo6789a(arrayList, mo6750b());
            }

            /* renamed from: a */
            public void mo6737a() {
                this.f5972g.mo6788a();
            }
        }

        C1544j() {
            super();
        }

        /* renamed from: a */
        public void mo6724a() {
            this.f5954b = C1573i.m8059a(C1528f.this, this);
            C1565g.m8048a(this.f5954b);
        }

        /* renamed from: b */
        public Bundle mo6728b() {
            C1534f fVar = C1528f.this.f5921N;
            if (fVar == null) {
                return C1573i.m8058a(this.f5954b);
            }
            Bundle bundle = fVar.f5947e;
            return bundle == null ? null : new Bundle(bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo6735c(String str, Bundle bundle) {
            if (bundle != null) {
                C1573i.m8060a(this.f5954b, str, bundle);
            } else {
                super.mo6735c(str, bundle);
            }
        }

        /* renamed from: a */
        public void mo6743a(String str, C1575b bVar, Bundle bundle) {
            C1528f.this.mo6699a(str, (C1551m<List<MediaItem>>) new C1545a<List<MediaItem>>(str, bVar), bundle);
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.media.f$k */
    /* compiled from: MediaBrowserServiceCompat */
    class C1546k extends C1544j {
        C1546k() {
            super();
        }

        /* renamed from: c */
        public C1579b mo6729c() {
            C1534f fVar = C1528f.this.f5921N;
            if (fVar != null) {
                return fVar.f5946d;
            }
            return new C1579b(((MediaBrowserService) this.f5954b).getCurrentBrowserInfo());
        }
    }

    /* renamed from: androidx.media.f$l */
    /* compiled from: MediaBrowserServiceCompat */
    class C1547l implements C1536g {

        /* renamed from: a */
        private Messenger f5975a;

        /* renamed from: androidx.media.f$l$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1548a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Token f5977a;

            C1548a(Token token) {
                this.f5977a = token;
            }

            public void run() {
                Iterator it = C1528f.this.f5925b.values().iterator();
                while (it.hasNext()) {
                    C1534f fVar = (C1534f) it.next();
                    try {
                        fVar.f5948f.mo6774a(fVar.f5950h.mo6720b(), this.f5977a, fVar.f5950h.mo6719a());
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connection for ");
                        sb.append(fVar.f5943a);
                        sb.append(" is no longer valid.");
                        sb.toString();
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.f$l$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1549b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f5980a;

            /* renamed from: b */
            final /* synthetic */ Bundle f5981b;

            C1549b(String str, Bundle bundle) {
                this.f5980a = str;
                this.f5981b = bundle;
            }

            public void run() {
                for (IBinder iBinder : C1528f.this.f5925b.keySet()) {
                    C1547l.this.mo6745a((C1534f) C1528f.this.f5925b.get(iBinder), this.f5980a, this.f5981b);
                }
            }
        }

        /* renamed from: androidx.media.f$l$c */
        /* compiled from: MediaBrowserServiceCompat */
        class C1550c implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f5982N;

            /* renamed from: a */
            final /* synthetic */ C1579b f5984a;

            /* renamed from: b */
            final /* synthetic */ String f5985b;

            C1550c(C1579b bVar, String str, Bundle bundle) {
                this.f5984a = bVar;
                this.f5985b = str;
                this.f5982N = bundle;
            }

            public void run() {
                for (int i = 0; i < C1528f.this.f5925b.size(); i++) {
                    C1534f fVar = (C1534f) C1528f.this.f5925b.mo3367d(i);
                    if (fVar.f5946d.equals(this.f5984a)) {
                        C1547l.this.mo6745a(fVar, this.f5985b, this.f5982N);
                        return;
                    }
                }
            }
        }

        C1547l() {
        }

        /* renamed from: a */
        public void mo6724a() {
            this.f5975a = new Messenger(C1528f.this.f5922O);
        }

        /* renamed from: b */
        public Bundle mo6728b() {
            C1534f fVar = C1528f.this.f5921N;
            if (fVar != null) {
                Bundle bundle = fVar.f5947e;
                if (bundle == null) {
                    return null;
                }
                return new Bundle(bundle);
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: c */
        public C1579b mo6729c() {
            C1534f fVar = C1528f.this.f5921N;
            if (fVar != null) {
                return fVar.f5946d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: a */
        public IBinder mo6723a(Intent intent) {
            if (C1528f.f5912T.equals(intent.getAction())) {
                return this.f5975a.getBinder();
            }
            return null;
        }

        /* renamed from: a */
        public void mo6725a(Token token) {
            C1528f.this.f5922O.post(new C1548a(token));
        }

        /* renamed from: a */
        public void mo6727a(@C0193h0 String str, Bundle bundle) {
            C1528f.this.f5922O.post(new C1549b(str, bundle));
        }

        /* renamed from: a */
        public void mo6726a(@C0193h0 C1579b bVar, @C0193h0 String str, Bundle bundle) {
            C1528f.this.f5922O.post(new C1550c(bVar, str, bundle));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6745a(C1534f fVar, String str, Bundle bundle) {
            List<C0938f> list = (List) fVar.f5949g.get(str);
            if (list != null) {
                for (C0938f fVar2 : list) {
                    if (C1526d.m7937b(bundle, (Bundle) fVar2.f4244b)) {
                        C1528f.this.mo6695a(str, fVar, (Bundle) fVar2.f4244b, bundle);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.media.f$m */
    /* compiled from: MediaBrowserServiceCompat */
    public static class C1551m<T> {

        /* renamed from: a */
        private final Object f5986a;

        /* renamed from: b */
        private boolean f5987b;

        /* renamed from: c */
        private boolean f5988c;

        /* renamed from: d */
        private boolean f5989d;

        /* renamed from: e */
        private boolean f5990e;

        /* renamed from: f */
        private int f5991f;

        C1551m(Object obj) {
            this.f5986a = obj;
        }

        /* renamed from: e */
        private void mo6718e(Bundle bundle) {
            if (bundle != null) {
                String str = MediaBrowserCompat.f31g;
                if (bundle.containsKey(str)) {
                    float f = bundle.getFloat(str);
                    if (f < -1.0E-5f || f > 1.00001f) {
                        throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo6737a() {
            if (this.f5987b) {
                StringBuilder sb = new StringBuilder();
                sb.append("detach() called when detach() had already been called for: ");
                sb.append(this.f5986a);
                throw new IllegalStateException(sb.toString());
            } else if (this.f5988c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detach() called when sendResult() had already been called for: ");
                sb2.append(this.f5986a);
                throw new IllegalStateException(sb2.toString());
            } else if (!this.f5990e) {
                this.f5987b = true;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detach() called when sendError() had already been called for: ");
                sb3.append(this.f5986a);
                throw new IllegalStateException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6712a(T t) {
        }

        /* renamed from: b */
        public void mo6751b(T t) {
            if (this.f5988c || this.f5990e) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f5986a);
                throw new IllegalStateException(sb.toString());
            }
            this.f5988c = true;
            mo6712a(t);
        }

        /* renamed from: c */
        public void mo6752c(Bundle bundle) {
            if (this.f5988c || this.f5990e) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f5986a);
                throw new IllegalStateException(sb.toString());
            }
            this.f5990e = true;
            mo6716a(bundle);
        }

        /* renamed from: d */
        public void mo6754d(Bundle bundle) {
            if (this.f5988c || this.f5990e) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f5986a);
                throw new IllegalStateException(sb.toString());
            }
            mo6718e(bundle);
            this.f5989d = true;
            mo6717b(bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo6750b() {
            return this.f5991f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo6753c() {
            return this.f5987b || this.f5988c || this.f5990e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6717b(Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an interim update for ");
            sb.append(this.f5986a);
            throw new UnsupportedOperationException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6749a(int i) {
            this.f5991f = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6716a(Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an error for ");
            sb.append(this.f5986a);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: androidx.media.f$n */
    /* compiled from: MediaBrowserServiceCompat */
    private class C1552n {

        /* renamed from: androidx.media.f$n$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1553a implements Runnable {

            /* renamed from: N */
            final /* synthetic */ int f5993N;

            /* renamed from: O */
            final /* synthetic */ int f5994O;

            /* renamed from: P */
            final /* synthetic */ Bundle f5995P;

            /* renamed from: a */
            final /* synthetic */ C1562o f5997a;

            /* renamed from: b */
            final /* synthetic */ String f5998b;

            C1553a(C1562o oVar, String str, int i, int i2, Bundle bundle) {
                this.f5997a = oVar;
                this.f5998b = str;
                this.f5993N = i;
                this.f5994O = i2;
                this.f5995P = bundle;
            }

            public void run() {
                IBinder asBinder = this.f5997a.asBinder();
                C1528f.this.f5925b.remove(asBinder);
                C1534f fVar = new C1534f(this.f5998b, this.f5993N, this.f5994O, this.f5995P, this.f5997a);
                C1528f fVar2 = C1528f.this;
                fVar2.f5921N = fVar;
                fVar.f5950h = fVar2.mo6686a(this.f5998b, this.f5994O, this.f5995P);
                C1528f fVar3 = C1528f.this;
                fVar3.f5921N = null;
                if (fVar.f5950h == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f5998b);
                    sb.append(" from service ");
                    sb.append(C1553a.class.getName());
                    sb.toString();
                    try {
                        this.f5997a.mo6773a();
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f5998b);
                        sb2.toString();
                    }
                } else {
                    try {
                        fVar3.f5925b.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (C1528f.this.f5923P != null) {
                            this.f5997a.mo6774a(fVar.f5950h.mo6720b(), C1528f.this.f5923P, fVar.f5950h.mo6719a());
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                        sb3.append(this.f5998b);
                        sb3.toString();
                        C1528f.this.f5925b.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.f$n$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1554b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1562o f5999a;

            C1554b(C1562o oVar) {
                this.f5999a = oVar;
            }

            public void run() {
                C1534f fVar = (C1534f) C1528f.this.f5925b.remove(this.f5999a.asBinder());
                if (fVar != null) {
                    fVar.f5948f.asBinder().unlinkToDeath(fVar, 0);
                }
            }
        }

        /* renamed from: androidx.media.f$n$c */
        /* compiled from: MediaBrowserServiceCompat */
        class C1555c implements Runnable {

            /* renamed from: N */
            final /* synthetic */ IBinder f6001N;

            /* renamed from: O */
            final /* synthetic */ Bundle f6002O;

            /* renamed from: a */
            final /* synthetic */ C1562o f6004a;

            /* renamed from: b */
            final /* synthetic */ String f6005b;

            C1555c(C1562o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f6004a = oVar;
                this.f6005b = str;
                this.f6001N = iBinder;
                this.f6002O = bundle;
            }

            public void run() {
                C1534f fVar = (C1534f) C1528f.this.f5925b.get(this.f6004a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription for callback that isn't registered id=");
                    sb.append(this.f6005b);
                    sb.toString();
                    return;
                }
                C1528f.this.mo6696a(this.f6005b, fVar, this.f6001N, this.f6002O);
            }
        }

        /* renamed from: androidx.media.f$n$d */
        /* compiled from: MediaBrowserServiceCompat */
        class C1556d implements Runnable {

            /* renamed from: N */
            final /* synthetic */ IBinder f6006N;

            /* renamed from: a */
            final /* synthetic */ C1562o f6008a;

            /* renamed from: b */
            final /* synthetic */ String f6009b;

            C1556d(C1562o oVar, String str, IBinder iBinder) {
                this.f6008a = oVar;
                this.f6009b = str;
                this.f6006N = iBinder;
            }

            public void run() {
                C1534f fVar = (C1534f) C1528f.this.f5925b.get(this.f6008a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f6009b);
                    sb.toString();
                    return;
                }
                if (!C1528f.this.mo6701a(this.f6009b, fVar, this.f6006N)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f6009b);
                    sb2.append(" which is not subscribed");
                    sb2.toString();
                }
            }
        }

        /* renamed from: androidx.media.f$n$e */
        /* compiled from: MediaBrowserServiceCompat */
        class C1557e implements Runnable {

            /* renamed from: N */
            final /* synthetic */ ResultReceiver f6010N;

            /* renamed from: a */
            final /* synthetic */ C1562o f6012a;

            /* renamed from: b */
            final /* synthetic */ String f6013b;

            C1557e(C1562o oVar, String str, ResultReceiver resultReceiver) {
                this.f6012a = oVar;
                this.f6013b = str;
                this.f6010N = resultReceiver;
            }

            public void run() {
                C1534f fVar = (C1534f) C1528f.this.f5925b.get(this.f6012a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMediaItem for callback that isn't registered id=");
                    sb.append(this.f6013b);
                    sb.toString();
                    return;
                }
                C1528f.this.mo6697a(this.f6013b, fVar, this.f6010N);
            }
        }

        /* renamed from: androidx.media.f$n$f */
        /* compiled from: MediaBrowserServiceCompat */
        class C1558f implements Runnable {

            /* renamed from: N */
            final /* synthetic */ int f6014N;

            /* renamed from: O */
            final /* synthetic */ int f6015O;

            /* renamed from: P */
            final /* synthetic */ Bundle f6016P;

            /* renamed from: a */
            final /* synthetic */ C1562o f6018a;

            /* renamed from: b */
            final /* synthetic */ String f6019b;

            C1558f(C1562o oVar, String str, int i, int i2, Bundle bundle) {
                this.f6018a = oVar;
                this.f6019b = str;
                this.f6014N = i;
                this.f6015O = i2;
                this.f6016P = bundle;
            }

            public void run() {
                IBinder asBinder = this.f6018a.asBinder();
                C1528f.this.f5925b.remove(asBinder);
                C1534f fVar = new C1534f(this.f6019b, this.f6014N, this.f6015O, this.f6016P, this.f6018a);
                C1528f.this.f5925b.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: androidx.media.f$n$g */
        /* compiled from: MediaBrowserServiceCompat */
        class C1559g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1562o f6020a;

            C1559g(C1562o oVar) {
                this.f6020a = oVar;
            }

            public void run() {
                IBinder asBinder = this.f6020a.asBinder();
                C1534f fVar = (C1534f) C1528f.this.f5925b.remove(asBinder);
                if (fVar != null) {
                    asBinder.unlinkToDeath(fVar, 0);
                }
            }
        }

        /* renamed from: androidx.media.f$n$h */
        /* compiled from: MediaBrowserServiceCompat */
        class C1560h implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f6022N;

            /* renamed from: O */
            final /* synthetic */ ResultReceiver f6023O;

            /* renamed from: a */
            final /* synthetic */ C1562o f6025a;

            /* renamed from: b */
            final /* synthetic */ String f6026b;

            C1560h(C1562o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f6025a = oVar;
                this.f6026b = str;
                this.f6022N = bundle;
                this.f6023O = resultReceiver;
            }

            public void run() {
                C1534f fVar = (C1534f) C1528f.this.f5925b.get(this.f6025a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("search for callback that isn't registered query=");
                    sb.append(this.f6026b);
                    sb.toString();
                    return;
                }
                C1528f.this.mo6705b(this.f6026b, this.f6022N, fVar, this.f6023O);
            }
        }

        /* renamed from: androidx.media.f$n$i */
        /* compiled from: MediaBrowserServiceCompat */
        class C1561i implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f6027N;

            /* renamed from: O */
            final /* synthetic */ ResultReceiver f6028O;

            /* renamed from: a */
            final /* synthetic */ C1562o f6030a;

            /* renamed from: b */
            final /* synthetic */ String f6031b;

            C1561i(C1562o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f6030a = oVar;
                this.f6031b = str;
                this.f6027N = bundle;
                this.f6028O = resultReceiver;
            }

            public void run() {
                C1534f fVar = (C1534f) C1528f.this.f5925b.get(this.f6030a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendCustomAction for callback that isn't registered action=");
                    sb.append(this.f6031b);
                    sb.append(", extras=");
                    sb.append(this.f6027N);
                    sb.toString();
                    return;
                }
                C1528f.this.mo6693a(this.f6031b, this.f6027N, fVar, this.f6028O);
            }
        }

        C1552n() {
        }

        /* renamed from: a */
        public void mo6757a(String str, int i, int i2, Bundle bundle, C1562o oVar) {
            if (C1528f.this.mo6700a(str, i2)) {
                C1564q qVar = C1528f.this.f5922O;
                C1553a aVar = new C1553a(oVar, str, i, i2, bundle);
                qVar.mo6777a(aVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Package/uid mismatch: uid=");
            sb.append(i2);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public void mo6762b(C1562o oVar) {
            C1528f.this.f5922O.mo6777a(new C1559g(oVar));
        }

        /* renamed from: b */
        public void mo6763b(String str, Bundle bundle, ResultReceiver resultReceiver, C1562o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C1564q qVar = C1528f.this.f5922O;
                C1561i iVar = new C1561i(oVar, str, bundle, resultReceiver);
                qVar.mo6777a(iVar);
            }
        }

        /* renamed from: a */
        public void mo6755a(C1562o oVar) {
            C1528f.this.f5922O.mo6777a(new C1554b(oVar));
        }

        /* renamed from: a */
        public void mo6759a(String str, IBinder iBinder, Bundle bundle, C1562o oVar) {
            C1564q qVar = C1528f.this.f5922O;
            C1555c cVar = new C1555c(oVar, str, iBinder, bundle);
            qVar.mo6777a(cVar);
        }

        /* renamed from: a */
        public void mo6760a(String str, IBinder iBinder, C1562o oVar) {
            C1528f.this.f5922O.mo6777a(new C1556d(oVar, str, iBinder));
        }

        /* renamed from: a */
        public void mo6761a(String str, ResultReceiver resultReceiver, C1562o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C1528f.this.f5922O.mo6777a(new C1557e(oVar, str, resultReceiver));
            }
        }

        /* renamed from: a */
        public void mo6756a(C1562o oVar, String str, int i, int i2, Bundle bundle) {
            C1564q qVar = C1528f.this.f5922O;
            C1558f fVar = new C1558f(oVar, str, i, i2, bundle);
            qVar.mo6777a(fVar);
        }

        /* renamed from: a */
        public void mo6758a(String str, Bundle bundle, ResultReceiver resultReceiver, C1562o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C1564q qVar = C1528f.this.f5922O;
                C1560h hVar = new C1560h(oVar, str, bundle, resultReceiver);
                qVar.mo6777a(hVar);
            }
        }
    }

    /* renamed from: androidx.media.f$o */
    /* compiled from: MediaBrowserServiceCompat */
    private interface C1562o {
        /* renamed from: a */
        void mo6773a() throws RemoteException;

        /* renamed from: a */
        void mo6774a(String str, Token token, Bundle bundle) throws RemoteException;

        /* renamed from: a */
        void mo6775a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();
    }

    /* renamed from: androidx.media.f$p */
    /* compiled from: MediaBrowserServiceCompat */
    private static class C1563p implements C1562o {

        /* renamed from: a */
        final Messenger f6032a;

        C1563p(Messenger messenger) {
            this.f6032a = messenger;
        }

        /* renamed from: a */
        public void mo6774a(String str, Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(C1527e.f5899q, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(C1527e.f5886d, str);
            bundle2.putParcelable(C1527e.f5888f, token);
            bundle2.putBundle(C1527e.f5893k, bundle);
            m8041a(1, bundle2);
        }

        public IBinder asBinder() {
            return this.f6032a.getBinder();
        }

        /* renamed from: a */
        public void mo6773a() throws RemoteException {
            m8041a(2, null);
        }

        /* renamed from: a */
        public void mo6775a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(C1527e.f5886d, str);
            bundle3.putBundle(C1527e.f5889g, bundle);
            bundle3.putBundle(C1527e.f5890h, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(C1527e.f5887e, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m8041a(3, bundle3);
        }

        /* renamed from: a */
        private void m8041a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f6032a.send(obtain);
        }
    }

    /* renamed from: androidx.media.f$q */
    /* compiled from: MediaBrowserServiceCompat */
    private final class C1564q extends Handler {

        /* renamed from: a */
        private final C1552n f6033a = new C1552n();

        C1564q() {
        }

        /* renamed from: a */
        public void mo6777a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            int i = message.what;
            String str = C1527e.f5883a;
            String str2 = C1527e.f5884b;
            String str3 = C1527e.f5885c;
            String str4 = C1527e.f5891i;
            String str5 = C1527e.f5893k;
            String str6 = C1527e.f5892j;
            String str7 = C1527e.f5886d;
            switch (i) {
                case 1:
                    Bundle bundle = data.getBundle(str5);
                    MediaSessionCompat.m514b(bundle);
                    this.f6033a.mo6757a(data.getString(str4), data.getInt(str3), data.getInt(str2), bundle, (C1562o) new C1563p(message.replyTo));
                    return;
                case 2:
                    this.f6033a.mo6755a(new C1563p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(C1527e.f5889g);
                    MediaSessionCompat.m514b(bundle2);
                    this.f6033a.mo6759a(data.getString(str7), C0748i.m4315a(data, str), bundle2, (C1562o) new C1563p(message.replyTo));
                    return;
                case 4:
                    this.f6033a.mo6760a(data.getString(str7), C0748i.m4315a(data, str), (C1562o) new C1563p(message.replyTo));
                    return;
                case 5:
                    this.f6033a.mo6761a(data.getString(str7), (ResultReceiver) data.getParcelable(str6), (C1562o) new C1563p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(str5);
                    MediaSessionCompat.m514b(bundle3);
                    this.f6033a.mo6756a((C1562o) new C1563p(message.replyTo), data.getString(str4), data.getInt(str3), data.getInt(str2), bundle3);
                    return;
                case 7:
                    this.f6033a.mo6762b(new C1563p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(C1527e.f5894l);
                    MediaSessionCompat.m514b(bundle4);
                    this.f6033a.mo6758a(data.getString(C1527e.f5895m), bundle4, (ResultReceiver) data.getParcelable(str6), (C1562o) new C1563p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(C1527e.f5897o);
                    MediaSessionCompat.m514b(bundle5);
                    this.f6033a.mo6763b(data.getString(C1527e.f5896n), bundle5, (ResultReceiver) data.getParcelable(str6), new C1563p(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    sb.toString();
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(C1527e.f5884b, Binder.getCallingUid());
            data.putInt(C1527e.f5885c, Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    @C0195i0
    /* renamed from: a */
    public abstract C1533e mo6686a(@C0193h0 String str, int i, @C0195i0 Bundle bundle);

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public void mo6688a(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: a */
    public abstract void mo6698a(@C0193h0 String str, @C0193h0 C1551m<List<MediaItem>> mVar);

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: b */
    public void mo6703b(String str) {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: b */
    public void mo6704b(String str, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo6707b(String str, @C0193h0 C1551m<MediaItem> mVar) {
        mVar.mo6749a(2);
        mVar.mo6751b(null);
    }

    @C0195i0
    /* renamed from: c */
    public Token mo6708c() {
        return this.f5923P;
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.f5924a.mo6723a(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f5924a = new C1546k();
        } else if (i >= 26) {
            this.f5924a = new C1544j();
        } else if (i >= 23) {
            this.f5924a = new C1542i();
        } else if (i >= 21) {
            this.f5924a = new C1537h();
        } else {
            this.f5924a = new C1547l();
        }
        this.f5924a.mo6724a();
    }

    /* renamed from: a */
    public void mo6699a(@C0193h0 String str, @C0193h0 C1551m<List<MediaItem>> mVar, @C0193h0 Bundle bundle) {
        mVar.mo6749a(1);
        mo6698a(str, mVar);
    }

    /* renamed from: b */
    public void mo6706b(@C0193h0 String str, Bundle bundle, @C0193h0 C1551m<List<MediaItem>> mVar) {
        mVar.mo6749a(4);
        mVar.mo6751b(null);
    }

    /* renamed from: a */
    public void mo6694a(@C0193h0 String str, Bundle bundle, @C0193h0 C1551m<Bundle> mVar) {
        mVar.mo6752c(null);
    }

    /* renamed from: a */
    public void mo6689a(Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f5923P == null) {
            this.f5923P = token;
            this.f5924a.mo6725a(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    @C0193h0
    /* renamed from: b */
    public final C1579b mo6702b() {
        return this.f5924a.mo6729c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6705b(String str, Bundle bundle, C1534f fVar, ResultReceiver resultReceiver) {
        C1531c cVar = new C1531c(str, resultReceiver);
        this.f5921N = fVar;
        mo6706b(str, bundle, cVar);
        this.f5921N = null;
        if (!cVar.mo6753c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSearch must call detach() or sendResult() before returning for query=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final Bundle mo6685a() {
        return this.f5924a.mo6728b();
    }

    /* renamed from: a */
    public void mo6691a(@C0193h0 String str) {
        if (str != null) {
            this.f5924a.mo6727a(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    /* renamed from: a */
    public void mo6692a(@C0193h0 String str, @C0193h0 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f5924a.mo6727a(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo6690a(@C0193h0 C1579b bVar, @C0193h0 String str, @C0193h0 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f5924a.mo6726a(bVar, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6700a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6696a(String str, C1534f fVar, IBinder iBinder, Bundle bundle) {
        List<C0938f> list = (List) fVar.f5949g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0938f fVar2 : list) {
            if (iBinder == fVar2.f4243a && C1526d.m7936a(bundle, (Bundle) fVar2.f4244b)) {
                return;
            }
        }
        list.add(new C0938f(iBinder, bundle));
        fVar.f5949g.put(str, list);
        mo6695a(str, fVar, bundle, (Bundle) null);
        this.f5921N = fVar;
        mo6704b(str, bundle);
        this.f5921N = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6701a(String str, C1534f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f5949g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f5921N = fVar;
                mo6703b(str);
                this.f5921N = null;
            }
        } else {
            List list = (List) fVar.f5949g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0938f) it.next()).f4243a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f5949g.remove(str);
                }
            }
            this.f5921N = fVar;
            mo6703b(str);
            this.f5921N = null;
            return z2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6695a(String str, C1534f fVar, Bundle bundle, Bundle bundle2) {
        C1529a aVar = new C1529a(str, fVar, str, bundle, bundle2);
        this.f5921N = fVar;
        if (bundle == null) {
            mo6698a(str, (C1551m<List<MediaItem>>) aVar);
        } else {
            mo6699a(str, (C1551m<List<MediaItem>>) aVar, bundle);
        }
        this.f5921N = null;
        if (!aVar.mo6753c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(fVar.f5943a);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<MediaItem> mo6687a(List<MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.f28d, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.f29e, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6697a(String str, C1534f fVar, ResultReceiver resultReceiver) {
        C1530b bVar = new C1530b(str, resultReceiver);
        this.f5921N = fVar;
        mo6707b(str, (C1551m<MediaItem>) bVar);
        this.f5921N = null;
        if (!bVar.mo6753c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadItem must call detach() or sendResult() before returning for id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6693a(String str, Bundle bundle, C1534f fVar, ResultReceiver resultReceiver) {
        C1532d dVar = new C1532d(str, resultReceiver);
        this.f5921N = fVar;
        mo6694a(str, bundle, (C1551m<Bundle>) dVar);
        this.f5921N = null;
        if (!dVar.mo6753c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb.append(str);
            sb.append(" extras=");
            sb.append(bundle);
            throw new IllegalStateException(sb.toString());
        }
    }
}

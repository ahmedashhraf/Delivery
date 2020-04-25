package android.support.p003v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p003v4.media.session.C0134b;
import android.support.p003v4.media.session.C0134b.C0135a;
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
import androidx.media.C1526d;
import androidx.media.C1527e;
import androidx.media.C1528f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final String f26b = "MediaBrowserCompat";

    /* renamed from: c */
    static final boolean f27c = Log.isLoggable(f26b, 3);

    /* renamed from: d */
    public static final String f28d = "android.media.browse.extra.PAGE";

    /* renamed from: e */
    public static final String f29e = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: f */
    public static final String f30f = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: g */
    public static final String f31g = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: h */
    public static final String f32h = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: i */
    public static final String f33i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a */
    private final C0021e f34a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: O */
        private final String f35O;

        /* renamed from: P */
        private final Bundle f36P;

        /* renamed from: Q */
        private final C0018c f37Q;

        CustomActionResultReceiver(String str, Bundle bundle, C0018c cVar, Handler handler) {
            super(handler);
            this.f35O = str;
            this.f36P = bundle;
            this.f37Q = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo50a(int i, Bundle bundle) {
            if (this.f37Q != null) {
                MediaSessionCompat.m514b(bundle);
                if (i == -1) {
                    this.f37Q.mo73a(this.f35O, this.f36P, bundle);
                } else if (i == 0) {
                    this.f37Q.mo75c(this.f35O, this.f36P, bundle);
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown result code: ");
                    sb.append(i);
                    sb.append(" (extras=");
                    sb.append(this.f36P);
                    sb.append(", resultData=");
                    sb.append(bundle);
                    sb.append(")");
                    sb.toString();
                } else {
                    this.f37Q.mo74b(this.f35O, this.f36P, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: O */
        private final String f38O;

        /* renamed from: P */
        private final C0019d f39P;

        ItemReceiver(String str, C0019d dVar, Handler handler) {
            super(handler);
            this.f38O = str;
            this.f39P = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo50a(int i, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            if (i == 0 && bundle != null) {
                String str = C1528f.f5913U;
                if (bundle.containsKey(str)) {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (parcelable == null || (parcelable instanceof MediaItem)) {
                        this.f39P.mo76a((MediaItem) parcelable);
                    } else {
                        this.f39P.mo77a(this.f38O);
                    }
                    return;
                }
            }
            this.f39P.mo77a(this.f38O);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new C0012a();

        /* renamed from: N */
        public static final int f40N = 1;

        /* renamed from: O */
        public static final int f41O = 2;

        /* renamed from: a */
        private final int f42a;

        /* renamed from: b */
        private final MediaDescriptionCompat f43b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        static class C0012a implements Creator<MediaItem> {
            C0012a() {
            }

            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$b */
        public @interface C0013b {
        }

        public MediaItem(@C0193h0 MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo148k())) {
                this.f42a = i;
                this.f43b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static List<MediaItem> m61a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object b : list) {
                arrayList.add(m62b(b));
            }
            return arrayList;
        }

        /* renamed from: b */
        public static MediaItem m62b(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m168b(C0063c.m234a(obj)), C0063c.m235b(obj));
        }

        @C0195i0
        /* renamed from: c */
        public String mo53c() {
            return this.f43b.mo148k();
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: i */
        public boolean mo55i() {
            return (this.f42a & 1) != 0;
        }

        /* renamed from: j */
        public boolean mo56j() {
            return (this.f42a & 2) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f42a);
            sb.append(", mDescription=");
            sb.append(this.f43b);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f42a);
            this.f43b.writeToParcel(parcel, i);
        }

        @C0193h0
        /* renamed from: a */
        public MediaDescriptionCompat mo51a() {
            return this.f43b;
        }

        /* renamed from: b */
        public int mo52b() {
            return this.f42a;
        }

        MediaItem(Parcel parcel) {
            this.f42a = parcel.readInt();
            this.f43b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: O */
        private final String f44O;

        /* renamed from: P */
        private final Bundle f45P;

        /* renamed from: Q */
        private final C0043k f46Q;

        SearchResultReceiver(String str, Bundle bundle, C0043k kVar, Handler handler) {
            super(handler);
            this.f44O = str;
            this.f45P = bundle;
            this.f46Q = kVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo50a(int i, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            if (i == 0 && bundle != null) {
                String str = C1528f.f5914V;
                if (bundle.containsKey(str)) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                    ArrayList arrayList = null;
                    if (parcelableArray != null) {
                        arrayList = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add((MediaItem) parcelable);
                        }
                    }
                    this.f46Q.mo117a(this.f44O, this.f45P, arrayList);
                    return;
                }
            }
            this.f46Q.mo116a(this.f44O, this.f45P);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0014a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0042j> f47a;

        /* renamed from: b */
        private WeakReference<Messenger> f48b;

        C0014a(C0042j jVar) {
            this.f47a = new WeakReference<>(jVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo61a(Messenger messenger) {
            this.f48b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f48b;
            if (weakReference != null && weakReference.get() != null && this.f47a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m514b(data);
                C0042j jVar = (C0042j) this.f47a.get();
                Messenger messenger = (Messenger) this.f48b.get();
                try {
                    int i = message.what;
                    String str = C1527e.f5886d;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(C1527e.f5893k);
                        MediaSessionCompat.m514b(bundle);
                        jVar.mo94a(messenger, data.getString(str), (Token) data.getParcelable(C1527e.f5888f), bundle);
                    } else if (i == 2) {
                        jVar.mo93a(messenger);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled message: ");
                        sb.append(message);
                        sb.append("\n  Client version: ");
                        sb.append(1);
                        sb.append("\n  Service version: ");
                        sb.append(message.arg1);
                        sb.toString();
                    } else {
                        Bundle bundle2 = data.getBundle(C1527e.f5889g);
                        MediaSessionCompat.m514b(bundle2);
                        Bundle bundle3 = data.getBundle(C1527e.f5890h);
                        MediaSessionCompat.m514b(bundle3);
                        jVar.mo95a(messenger, data.getString(str), data.getParcelableArrayList(C1527e.f5887e), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        jVar.mo93a(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0015b {

        /* renamed from: a */
        final Object f49a;

        /* renamed from: b */
        C0016a f50b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0016a {
            /* renamed from: c */
            void mo67c();

            /* renamed from: e */
            void mo68e();

            /* renamed from: f */
            void mo69f();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class C0017b implements C0061a {
            C0017b() {
            }

            /* renamed from: c */
            public void mo70c() {
                C0016a aVar = C0015b.this.f50b;
                if (aVar != null) {
                    aVar.mo67c();
                }
                C0015b.this.mo66c();
            }

            /* renamed from: e */
            public void mo71e() {
                C0016a aVar = C0015b.this.f50b;
                if (aVar != null) {
                    aVar.mo68e();
                }
                C0015b.this.mo63a();
            }

            /* renamed from: f */
            public void mo72f() {
                C0016a aVar = C0015b.this.f50b;
                if (aVar != null) {
                    aVar.mo69f();
                }
                C0015b.this.mo65b();
            }
        }

        public C0015b() {
            if (VERSION.SDK_INT >= 21) {
                this.f49a = C0060a.m220a((C0061a) new C0017b());
            } else {
                this.f49a = null;
            }
        }

        /* renamed from: a */
        public void mo63a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo64a(C0016a aVar) {
            this.f50b = aVar;
        }

        /* renamed from: b */
        public void mo65b() {
        }

        /* renamed from: c */
        public void mo66c() {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0018c {
        /* renamed from: a */
        public void mo73a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo74b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo75c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0019d {

        /* renamed from: a */
        final Object f52a;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$d$a */
        private class C0020a implements C0067a {
            C0020a() {
            }

            /* renamed from: a */
            public void mo78a(Parcel parcel) {
                if (parcel == null) {
                    C0019d.this.mo76a((MediaItem) null);
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem mediaItem = (MediaItem) MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                C0019d.this.mo76a(mediaItem);
            }

            /* renamed from: a */
            public void mo79a(@C0193h0 String str) {
                C0019d.this.mo77a(str);
            }
        }

        public C0019d() {
            if (VERSION.SDK_INT >= 23) {
                this.f52a = C0066b.m238a(new C0020a());
            } else {
                this.f52a = null;
            }
        }

        /* renamed from: a */
        public void mo76a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo77a(@C0193h0 String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface C0021e {
        /* renamed from: a */
        void mo80a();

        /* renamed from: a */
        void mo81a(@C0193h0 String str, Bundle bundle, @C0195i0 C0018c cVar);

        /* renamed from: a */
        void mo82a(@C0193h0 String str, Bundle bundle, @C0193h0 C0043k kVar);

        /* renamed from: a */
        void mo83a(@C0193h0 String str, @C0195i0 Bundle bundle, @C0193h0 C0046n nVar);

        /* renamed from: a */
        void mo84a(@C0193h0 String str, @C0193h0 C0019d dVar);

        /* renamed from: a */
        void mo85a(@C0193h0 String str, C0046n nVar);

        /* renamed from: b */
        void mo86b();

        @C0193h0
        /* renamed from: d */
        Token mo87d();

        /* renamed from: g */
        ComponentName mo88g();

        @C0195i0
        Bundle getExtras();

        @C0193h0
        /* renamed from: h */
        String mo90h();

        @C0195i0
        /* renamed from: i */
        Bundle mo91i();

        boolean isConnected();
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0022f implements C0021e, C0042j, C0016a {

        /* renamed from: a */
        final Context f54a;

        /* renamed from: b */
        protected final Object f55b;

        /* renamed from: c */
        protected final Bundle f56c;

        /* renamed from: d */
        protected final C0014a f57d = new C0014a(this);

        /* renamed from: e */
        private final C0635a<String, C0045m> f58e = new C0635a<>();

        /* renamed from: f */
        protected int f59f;

        /* renamed from: g */
        protected C0044l f60g;

        /* renamed from: h */
        protected Messenger f61h;

        /* renamed from: i */
        private Token f62i;

        /* renamed from: j */
        private Bundle f63j;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$a */
        class C0023a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0019d f65a;

            /* renamed from: b */
            final /* synthetic */ String f66b;

            C0023a(C0019d dVar, String str) {
                this.f65a = dVar;
                this.f66b = str;
            }

            public void run() {
                this.f65a.mo77a(this.f66b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$b */
        class C0024b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0019d f68a;

            /* renamed from: b */
            final /* synthetic */ String f69b;

            C0024b(C0019d dVar, String str) {
                this.f68a = dVar;
                this.f69b = str;
            }

            public void run() {
                this.f68a.mo77a(this.f69b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$c */
        class C0025c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0019d f71a;

            /* renamed from: b */
            final /* synthetic */ String f72b;

            C0025c(C0019d dVar, String str) {
                this.f71a = dVar;
                this.f72b = str;
            }

            public void run() {
                this.f71a.mo77a(this.f72b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$d */
        class C0026d implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f73N;

            /* renamed from: a */
            final /* synthetic */ C0043k f75a;

            /* renamed from: b */
            final /* synthetic */ String f76b;

            C0026d(C0043k kVar, String str, Bundle bundle) {
                this.f75a = kVar;
                this.f76b = str;
                this.f73N = bundle;
            }

            public void run() {
                this.f75a.mo116a(this.f76b, this.f73N);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$e */
        class C0027e implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f77N;

            /* renamed from: a */
            final /* synthetic */ C0043k f79a;

            /* renamed from: b */
            final /* synthetic */ String f80b;

            C0027e(C0043k kVar, String str, Bundle bundle) {
                this.f79a = kVar;
                this.f80b = str;
                this.f77N = bundle;
            }

            public void run() {
                this.f79a.mo116a(this.f80b, this.f77N);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f */
        class C0028f implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f81N;

            /* renamed from: a */
            final /* synthetic */ C0018c f83a;

            /* renamed from: b */
            final /* synthetic */ String f84b;

            C0028f(C0018c cVar, String str, Bundle bundle) {
                this.f83a = cVar;
                this.f84b = str;
                this.f81N = bundle;
            }

            public void run() {
                this.f83a.mo73a(this.f84b, this.f81N, null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$g */
        class C0029g implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f85N;

            /* renamed from: a */
            final /* synthetic */ C0018c f87a;

            /* renamed from: b */
            final /* synthetic */ String f88b;

            C0029g(C0018c cVar, String str, Bundle bundle) {
                this.f87a = cVar;
                this.f88b = str;
                this.f85N = bundle;
            }

            public void run() {
                this.f87a.mo73a(this.f88b, this.f85N, null);
            }
        }

        C0022f(Context context, ComponentName componentName, C0015b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f54a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f56c = bundle2;
            this.f56c.putInt(C1527e.f5898p, 1);
            bVar.mo64a(this);
            this.f55b = C0060a.m219a(context, componentName, bVar.f49a, this.f56c);
        }

        /* renamed from: a */
        public void mo80a() {
            C0044l lVar = this.f60g;
            if (lVar != null) {
                Messenger messenger = this.f61h;
                if (messenger != null) {
                    try {
                        lVar.mo125b(messenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
            C0060a.m225b(this.f55b);
        }

        /* renamed from: a */
        public void mo93a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo94a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo86b() {
            C0060a.m222a(this.f55b);
        }

        /* renamed from: c */
        public void mo67c() {
            this.f60g = null;
            this.f61h = null;
            this.f62i = null;
            this.f57d.mo61a(null);
        }

        @C0193h0
        /* renamed from: d */
        public Token mo87d() {
            if (this.f62i == null) {
                this.f62i = Token.m550b(C0060a.m229f(this.f55b));
            }
            return this.f62i;
        }

        /* renamed from: e */
        public void mo68e() {
            Bundle c = C0060a.m226c(this.f55b);
            if (c != null) {
                this.f59f = c.getInt(C1527e.f5899q, 0);
                IBinder a = C0748i.m4315a(c, C1527e.f5900r);
                if (a != null) {
                    this.f60g = new C0044l(a, this.f56c);
                    this.f61h = new Messenger(this.f57d);
                    this.f57d.mo61a(this.f61h);
                    try {
                        this.f60g.mo124b(this.f54a, this.f61h);
                    } catch (RemoteException unused) {
                    }
                }
                C0134b a2 = C0135a.m914a(C0748i.m4315a(c, C1527e.f5901s));
                if (a2 != null) {
                    this.f62i = Token.m548a(C0060a.m229f(this.f55b), a2);
                }
            }
        }

        /* renamed from: f */
        public void mo69f() {
        }

        /* renamed from: g */
        public ComponentName mo88g() {
            return C0060a.m228e(this.f55b);
        }

        @C0195i0
        public Bundle getExtras() {
            return C0060a.m226c(this.f55b);
        }

        @C0193h0
        /* renamed from: h */
        public String mo90h() {
            return C0060a.m227d(this.f55b);
        }

        /* renamed from: i */
        public Bundle mo91i() {
            return this.f63j;
        }

        public boolean isConnected() {
            return C0060a.m230g(this.f55b);
        }

        /* renamed from: a */
        public void mo83a(@C0193h0 String str, Bundle bundle, @C0193h0 C0046n nVar) {
            Bundle bundle2;
            C0045m mVar = (C0045m) this.f58e.get(str);
            if (mVar == null) {
                mVar = new C0045m();
                this.f58e.put(str, mVar);
            }
            nVar.mo132a(mVar);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            mVar.mo129a(bundle2, nVar);
            C0044l lVar = this.f60g;
            if (lVar == null) {
                C0060a.m224a(this.f55b, str, nVar.f134a);
                return;
            }
            try {
                lVar.mo121a(str, nVar.f135b, bundle2, this.f61h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
                sb.toString();
            }
        }

        /* renamed from: a */
        public void mo85a(@C0193h0 String str, C0046n nVar) {
            C0045m mVar = (C0045m) this.f58e.get(str);
            if (mVar != null) {
                C0044l lVar = this.f60g;
                if (lVar == null) {
                    if (nVar == null) {
                        C0060a.m223a(this.f55b, str);
                    } else {
                        List a = mVar.mo128a();
                        List b = mVar.mo130b();
                        for (int size = a.size() - 1; size >= 0; size--) {
                            if (a.get(size) == nVar) {
                                a.remove(size);
                                b.remove(size);
                            }
                        }
                        if (a.size() == 0) {
                            C0060a.m223a(this.f55b, str);
                        }
                    }
                } else if (nVar == null) {
                    try {
                        lVar.mo122a(str, (IBinder) null, this.f61h);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription failed with RemoteException parentId=");
                        sb.append(str);
                        sb.toString();
                    }
                } else {
                    List a2 = mVar.mo128a();
                    List b2 = mVar.mo130b();
                    for (int size2 = a2.size() - 1; size2 >= 0; size2--) {
                        if (a2.get(size2) == nVar) {
                            this.f60g.mo122a(str, nVar.f135b, this.f61h);
                            a2.remove(size2);
                            b2.remove(size2);
                        }
                    }
                }
                if (mVar.mo131c() || nVar == null) {
                    this.f58e.remove(str);
                }
            }
        }

        /* renamed from: a */
        public void mo84a(@C0193h0 String str, @C0193h0 C0019d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!C0060a.m230g(this.f55b)) {
                this.f57d.post(new C0023a(dVar, str));
            } else if (this.f60g == null) {
                this.f57d.post(new C0024b(dVar, str));
            } else {
                try {
                    this.f60g.mo123a(str, (ResultReceiver) new ItemReceiver(str, dVar, this.f57d), this.f61h);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error getting media item: ");
                    sb.append(str);
                    sb.toString();
                    this.f57d.post(new C0025c(dVar, str));
                }
            }
        }

        /* renamed from: a */
        public void mo82a(@C0193h0 String str, Bundle bundle, @C0193h0 C0043k kVar) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.f60g == null) {
                this.f57d.post(new C0026d(kVar, str, bundle));
            } else {
                try {
                    this.f60g.mo120a(str, bundle, (ResultReceiver) new SearchResultReceiver(str, bundle, kVar, this.f57d), this.f61h);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    sb.toString();
                    this.f57d.post(new C0027e(kVar, str, bundle));
                }
            }
        }

        /* renamed from: a */
        public void mo81a(@C0193h0 String str, Bundle bundle, @C0195i0 C0018c cVar) {
            if (isConnected()) {
                if (this.f60g == null && cVar != null) {
                    this.f57d.post(new C0028f(cVar, str, bundle));
                }
                try {
                    this.f60g.mo126b(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f57d), this.f61h);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(str);
                    sb.append(", extras=");
                    sb.append(bundle);
                    sb.toString();
                    if (cVar != null) {
                        this.f57d.post(new C0029g(cVar, str, bundle));
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot send a custom action (");
                sb2.append(str);
                sb2.append(") with ");
                sb2.append("extras ");
                sb2.append(bundle);
                sb2.append(" because the browser is not connected to the ");
                sb2.append("service.");
                throw new IllegalStateException(sb2.toString());
            }
        }

        /* renamed from: a */
        public void mo95a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f61h == messenger) {
                C0045m mVar = (C0045m) this.f58e.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.f27c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onLoadChildren for id that isn't subscribed id=");
                        sb.append(str);
                        sb.toString();
                    }
                    return;
                }
                C0046n a = mVar.mo127a(bundle);
                if (a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a.mo133a(str);
                        } else {
                            this.f63j = bundle2;
                            a.mo135a(str, list);
                            this.f63j = null;
                        }
                    } else if (list == null) {
                        a.mo134a(str, bundle);
                    } else {
                        this.f63j = bundle2;
                        a.mo136a(str, list, bundle);
                        this.f63j = null;
                    }
                }
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0030g extends C0022f {
        C0030g(Context context, ComponentName componentName, C0015b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: a */
        public void mo84a(@C0193h0 String str, @C0193h0 C0019d dVar) {
            if (this.f60g == null) {
                C0066b.m239a(this.f55b, str, dVar.f52a);
            } else {
                super.mo84a(str, dVar);
            }
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0031h extends C0030g {
        C0031h(Context context, ComponentName componentName, C0015b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: a */
        public void mo83a(@C0193h0 String str, @C0195i0 Bundle bundle, @C0193h0 C0046n nVar) {
            if (this.f60g != null && this.f59f >= 2) {
                super.mo83a(str, bundle, nVar);
            } else if (bundle == null) {
                C0060a.m224a(this.f55b, str, nVar.f134a);
            } else {
                C0069c.m243a(this.f55b, str, bundle, nVar.f134a);
            }
        }

        /* renamed from: a */
        public void mo85a(@C0193h0 String str, C0046n nVar) {
            if (this.f60g != null && this.f59f >= 2) {
                super.mo85a(str, nVar);
            } else if (nVar == null) {
                C0060a.m223a(this.f55b, str);
            } else {
                C0069c.m244a(this.f55b, str, nVar.f134a);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C0032i implements C0021e, C0042j {

        /* renamed from: o */
        static final int f89o = 0;

        /* renamed from: p */
        static final int f90p = 1;

        /* renamed from: q */
        static final int f91q = 2;

        /* renamed from: r */
        static final int f92r = 3;

        /* renamed from: s */
        static final int f93s = 4;

        /* renamed from: a */
        final Context f94a;

        /* renamed from: b */
        final ComponentName f95b;

        /* renamed from: c */
        final C0015b f96c;

        /* renamed from: d */
        final Bundle f97d;

        /* renamed from: e */
        final C0014a f98e = new C0014a(this);

        /* renamed from: f */
        private final C0635a<String, C0045m> f99f = new C0635a<>();

        /* renamed from: g */
        int f100g = 1;

        /* renamed from: h */
        C0039g f101h;

        /* renamed from: i */
        C0044l f102i;

        /* renamed from: j */
        Messenger f103j;

        /* renamed from: k */
        private String f104k;

        /* renamed from: l */
        private Token f105l;

        /* renamed from: m */
        private Bundle f106m;

        /* renamed from: n */
        private Bundle f107n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        class C0033a implements Runnable {
            C0033a() {
            }

            public void run() {
                C0032i iVar = C0032i.this;
                if (iVar.f100g != 0) {
                    iVar.f100g = 2;
                    if (!MediaBrowserCompat.f27c || iVar.f101h == null) {
                        C0032i iVar2 = C0032i.this;
                        if (iVar2.f102i != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("mServiceBinderWrapper should be null. Instead it is ");
                            sb.append(C0032i.this.f102i);
                            throw new RuntimeException(sb.toString());
                        } else if (iVar2.f103j == null) {
                            Intent intent = new Intent(C1528f.f5912T);
                            intent.setComponent(C0032i.this.f95b);
                            C0032i iVar3 = C0032i.this;
                            iVar3.f101h = new C0039g();
                            boolean z = false;
                            try {
                                z = C0032i.this.f94a.bindService(intent, C0032i.this.f101h, 1);
                            } catch (Exception unused) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Failed binding to service ");
                                sb2.append(C0032i.this.f95b);
                                sb2.toString();
                            }
                            if (!z) {
                                C0032i.this.mo104e();
                                C0032i.this.f96c.mo65b();
                            }
                            if (MediaBrowserCompat.f27c) {
                                C0032i.this.mo103c();
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("mCallbacksMessenger should be null. Instead it is ");
                            sb3.append(C0032i.this.f103j);
                            throw new RuntimeException(sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("mServiceConnection should be null. Instead it is ");
                        sb4.append(C0032i.this.f101h);
                        throw new RuntimeException(sb4.toString());
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$b */
        class C0034b implements Runnable {
            C0034b() {
            }

            public void run() {
                C0032i iVar = C0032i.this;
                Messenger messenger = iVar.f103j;
                if (messenger != null) {
                    try {
                        iVar.f102i.mo119a(messenger);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("RemoteException during connect for ");
                        sb.append(C0032i.this.f95b);
                        sb.toString();
                    }
                }
                C0032i iVar2 = C0032i.this;
                int i = iVar2.f100g;
                iVar2.mo104e();
                if (i != 0) {
                    C0032i.this.f100g = i;
                }
                if (MediaBrowserCompat.f27c) {
                    C0032i.this.mo103c();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c */
        class C0035c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0019d f111a;

            /* renamed from: b */
            final /* synthetic */ String f112b;

            C0035c(C0019d dVar, String str) {
                this.f111a = dVar;
                this.f112b = str;
            }

            public void run() {
                this.f111a.mo77a(this.f112b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$d */
        class C0036d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0019d f114a;

            /* renamed from: b */
            final /* synthetic */ String f115b;

            C0036d(C0019d dVar, String str) {
                this.f114a = dVar;
                this.f115b = str;
            }

            public void run() {
                this.f114a.mo77a(this.f115b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$e */
        class C0037e implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f116N;

            /* renamed from: a */
            final /* synthetic */ C0043k f118a;

            /* renamed from: b */
            final /* synthetic */ String f119b;

            C0037e(C0043k kVar, String str, Bundle bundle) {
                this.f118a = kVar;
                this.f119b = str;
                this.f116N = bundle;
            }

            public void run() {
                this.f118a.mo116a(this.f119b, this.f116N);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$f */
        class C0038f implements Runnable {

            /* renamed from: N */
            final /* synthetic */ Bundle f120N;

            /* renamed from: a */
            final /* synthetic */ C0018c f122a;

            /* renamed from: b */
            final /* synthetic */ String f123b;

            C0038f(C0018c cVar, String str, Bundle bundle) {
                this.f122a = cVar;
                this.f123b = str;
                this.f120N = bundle;
            }

            public void run() {
                this.f122a.mo73a(this.f123b, this.f120N, null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g */
        private class C0039g implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g$a */
            class C0040a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ ComponentName f126a;

                /* renamed from: b */
                final /* synthetic */ IBinder f127b;

                C0040a(ComponentName componentName, IBinder iBinder) {
                    this.f126a = componentName;
                    this.f127b = iBinder;
                }

                public void run() {
                    if (MediaBrowserCompat.f27c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceConnected name=");
                        sb.append(this.f126a);
                        sb.append(" binder=");
                        sb.append(this.f127b);
                        sb.toString();
                        C0032i.this.mo103c();
                    }
                    if (C0039g.this.mo111a("onServiceConnected")) {
                        C0032i iVar = C0032i.this;
                        iVar.f102i = new C0044l(this.f127b, iVar.f97d);
                        C0032i iVar2 = C0032i.this;
                        iVar2.f103j = new Messenger(iVar2.f98e);
                        C0032i iVar3 = C0032i.this;
                        iVar3.f98e.mo61a(iVar3.f103j);
                        C0032i.this.f100g = 2;
                        try {
                            if (MediaBrowserCompat.f27c) {
                                C0032i.this.mo103c();
                            }
                            C0032i.this.f102i.mo118a(C0032i.this.f94a, C0032i.this.f103j);
                        } catch (RemoteException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("RemoteException during connect for ");
                            sb2.append(C0032i.this.f95b);
                            sb2.toString();
                            if (MediaBrowserCompat.f27c) {
                                C0032i.this.mo103c();
                            }
                        }
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g$b */
            class C0041b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ ComponentName f128a;

                C0041b(ComponentName componentName) {
                    this.f128a = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f27c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceDisconnected name=");
                        sb.append(this.f128a);
                        sb.append(" this=");
                        sb.append(this);
                        sb.append(" mServiceConnection=");
                        sb.append(C0032i.this.f101h);
                        sb.toString();
                        C0032i.this.mo103c();
                    }
                    if (C0039g.this.mo111a("onServiceDisconnected")) {
                        C0032i iVar = C0032i.this;
                        iVar.f102i = null;
                        iVar.f103j = null;
                        iVar.f98e.mo61a(null);
                        C0032i iVar2 = C0032i.this;
                        iVar2.f100g = 4;
                        iVar2.f96c.mo66c();
                    }
                }
            }

            C0039g() {
            }

            /* renamed from: a */
            private void m136a(Runnable runnable) {
                if (Thread.currentThread() == C0032i.this.f98e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0032i.this.f98e.post(runnable);
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                m136a((Runnable) new C0040a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                m136a((Runnable) new C0041b(componentName));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo111a(String str) {
                C0032i iVar = C0032i.this;
                if (iVar.f101h == this) {
                    int i = iVar.f100g;
                    if (!(i == 0 || i == 1)) {
                        return true;
                    }
                }
                int i2 = C0032i.this.f100g;
                if (!(i2 == 0 || i2 == 1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" for ");
                    sb.append(C0032i.this.f95b);
                    sb.append(" with mServiceConnection=");
                    sb.append(C0032i.this.f101h);
                    sb.append(" this=");
                    sb.append(this);
                    sb.toString();
                }
                return false;
            }
        }

        public C0032i(Context context, ComponentName componentName, C0015b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f94a = context;
                this.f95b = componentName;
                this.f96c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f97d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: a */
        public void mo80a() {
            this.f100g = 0;
            this.f98e.post(new C0034b());
        }

        /* renamed from: b */
        public void mo86b() {
            int i = this.f100g;
            if (i == 0 || i == 1) {
                this.f100g = 2;
                this.f98e.post(new C0033a());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("connect() called while neigther disconnecting nor disconnected (state=");
            sb.append(m118a(this.f100g));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo103c() {
            StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.f95b);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.f96c);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.f97d);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(m118a(this.f100g));
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.f101h);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.f102i);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.f103j);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.f104k);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.f105l);
            sb9.toString();
        }

        @C0193h0
        /* renamed from: d */
        public Token mo87d() {
            if (isConnected()) {
                return this.f105l;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getSessionToken() called while not connected(state=");
            sb.append(this.f100g);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo104e() {
            C0039g gVar = this.f101h;
            if (gVar != null) {
                this.f94a.unbindService(gVar);
            }
            this.f100g = 1;
            this.f101h = null;
            this.f102i = null;
            this.f103j = null;
            this.f98e.mo61a(null);
            this.f104k = null;
            this.f105l = null;
        }

        @C0193h0
        /* renamed from: g */
        public ComponentName mo88g() {
            if (isConnected()) {
                return this.f95b;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getServiceComponent() called while not connected (state=");
            sb.append(this.f100g);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        @C0195i0
        public Bundle getExtras() {
            if (isConnected()) {
                return this.f106m;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getExtras() called while not connected (state=");
            sb.append(m118a(this.f100g));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        @C0193h0
        /* renamed from: h */
        public String mo90h() {
            if (isConnected()) {
                return this.f104k;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getRoot() called while not connected(state=");
            sb.append(m118a(this.f100g));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: i */
        public Bundle mo91i() {
            return this.f107n;
        }

        public boolean isConnected() {
            return this.f100g == 3;
        }

        /* renamed from: a */
        public void mo83a(@C0193h0 String str, Bundle bundle, @C0193h0 C0046n nVar) {
            Bundle bundle2;
            C0045m mVar = (C0045m) this.f99f.get(str);
            if (mVar == null) {
                mVar = new C0045m();
                this.f99f.put(str, mVar);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            mVar.mo129a(bundle2, nVar);
            if (isConnected()) {
                try {
                    this.f102i.mo121a(str, nVar.f135b, bundle2, this.f103j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription failed with RemoteException parentId=");
                    sb.append(str);
                    sb.toString();
                }
            }
        }

        /* renamed from: a */
        public void mo85a(@C0193h0 String str, C0046n nVar) {
            C0045m mVar = (C0045m) this.f99f.get(str);
            if (mVar != null) {
                if (nVar == null) {
                    try {
                        if (isConnected()) {
                            this.f102i.mo122a(str, (IBinder) null, this.f103j);
                        }
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription failed with RemoteException parentId=");
                        sb.append(str);
                        sb.toString();
                    }
                } else {
                    List a = mVar.mo128a();
                    List b = mVar.mo130b();
                    for (int size = a.size() - 1; size >= 0; size--) {
                        if (a.get(size) == nVar) {
                            if (isConnected()) {
                                this.f102i.mo122a(str, nVar.f135b, this.f103j);
                            }
                            a.remove(size);
                            b.remove(size);
                        }
                    }
                }
                if (mVar.mo131c() || nVar == null) {
                    this.f99f.remove(str);
                }
            }
        }

        /* renamed from: a */
        public void mo84a(@C0193h0 String str, @C0193h0 C0019d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!isConnected()) {
                this.f98e.post(new C0035c(dVar, str));
            } else {
                try {
                    this.f102i.mo123a(str, (ResultReceiver) new ItemReceiver(str, dVar, this.f98e), this.f103j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error getting media item: ");
                    sb.append(str);
                    sb.toString();
                    this.f98e.post(new C0036d(dVar, str));
                }
            }
        }

        /* renamed from: a */
        public void mo82a(@C0193h0 String str, Bundle bundle, @C0193h0 C0043k kVar) {
            if (isConnected()) {
                try {
                    this.f102i.mo120a(str, bundle, (ResultReceiver) new SearchResultReceiver(str, bundle, kVar, this.f98e), this.f103j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    sb.toString();
                    this.f98e.post(new C0037e(kVar, str, bundle));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("search() called while not connected (state=");
                sb2.append(m118a(this.f100g));
                sb2.append(")");
                throw new IllegalStateException(sb2.toString());
            }
        }

        /* renamed from: a */
        public void mo81a(@C0193h0 String str, Bundle bundle, @C0195i0 C0018c cVar) {
            if (isConnected()) {
                try {
                    this.f102i.mo126b(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f98e), this.f103j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(str);
                    sb.append(", extras=");
                    sb.append(bundle);
                    sb.toString();
                    if (cVar != null) {
                        this.f98e.post(new C0038f(cVar, str, bundle));
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot send a custom action (");
                sb2.append(str);
                sb2.append(") with ");
                sb2.append("extras ");
                sb2.append(bundle);
                sb2.append(" because the browser is not connected to the ");
                sb2.append("service.");
                throw new IllegalStateException(sb2.toString());
            }
        }

        /* renamed from: a */
        public void mo94a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (m119a(messenger, "onConnect")) {
                if (this.f100g != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConnect from service while mState=");
                    sb.append(m118a(this.f100g));
                    sb.append("... ignoring");
                    sb.toString();
                    return;
                }
                this.f104k = str;
                this.f105l = token;
                this.f106m = bundle;
                this.f100g = 3;
                if (MediaBrowserCompat.f27c) {
                    mo103c();
                }
                this.f96c.mo63a();
                try {
                    for (Entry entry : this.f99f.entrySet()) {
                        String str2 = (String) entry.getKey();
                        C0045m mVar = (C0045m) entry.getValue();
                        List a = mVar.mo128a();
                        List b = mVar.mo130b();
                        for (int i = 0; i < a.size(); i++) {
                            this.f102i.mo121a(str2, ((C0046n) a.get(i)).f135b, (Bundle) b.get(i), this.f103j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: a */
        public void mo93a(Messenger messenger) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.f95b);
            sb.toString();
            if (m119a(messenger, "onConnectFailed")) {
                if (this.f100g != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(m118a(this.f100g));
                    sb2.append("... ignoring");
                    sb2.toString();
                    return;
                }
                mo104e();
                this.f96c.mo65b();
            }
        }

        /* renamed from: a */
        public void mo95a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m119a(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f27c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for ");
                    sb.append(this.f95b);
                    sb.append(" id=");
                    sb.append(str);
                    sb.toString();
                }
                C0045m mVar = (C0045m) this.f99f.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.f27c) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onLoadChildren for id that isn't subscribed id=");
                        sb2.append(str);
                        sb2.toString();
                    }
                    return;
                }
                C0046n a = mVar.mo127a(bundle);
                if (a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a.mo133a(str);
                        } else {
                            this.f107n = bundle2;
                            a.mo135a(str, list);
                            this.f107n = null;
                        }
                    } else if (list == null) {
                        a.mo134a(str, bundle);
                    } else {
                        this.f107n = bundle2;
                        a.mo136a(str, list, bundle);
                        this.f107n = null;
                    }
                }
            }
        }

        /* renamed from: a */
        private static String m118a(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("UNKNOWN/");
            sb.append(i);
            return sb.toString();
        }

        /* renamed from: a */
        private boolean m119a(Messenger messenger, String str) {
            if (this.f103j == messenger) {
                int i = this.f100g;
                if (!(i == 0 || i == 1)) {
                    return true;
                }
            }
            int i2 = this.f100g;
            if (!(i2 == 0 || i2 == 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(this.f95b);
                sb.append(" with mCallbacksMessenger=");
                sb.append(this.f103j);
                sb.append(" this=");
                sb.append(this);
                sb.toString();
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface C0042j {
        /* renamed from: a */
        void mo93a(Messenger messenger);

        /* renamed from: a */
        void mo94a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo95a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0043k {
        /* renamed from: a */
        public void mo116a(@C0193h0 String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo117a(@C0193h0 String str, Bundle bundle, @C0193h0 List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0044l {

        /* renamed from: a */
        private Messenger f130a;

        /* renamed from: b */
        private Bundle f131b;

        public C0044l(IBinder iBinder, Bundle bundle) {
            this.f130a = new Messenger(iBinder);
            this.f131b = bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo118a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C1527e.f5891i, context.getPackageName());
            bundle.putBundle(C1527e.f5893k, this.f131b);
            m143a(1, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo124b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C1527e.f5891i, context.getPackageName());
            bundle.putBundle(C1527e.f5893k, this.f131b);
            m143a(6, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo119a(Messenger messenger) throws RemoteException {
            m143a(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo125b(Messenger messenger) throws RemoteException {
            m143a(7, (Bundle) null, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo121a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C1527e.f5886d, str);
            C0748i.m4316a(bundle2, C1527e.f5883a, iBinder);
            bundle2.putBundle(C1527e.f5889g, bundle);
            m143a(3, bundle2, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo126b(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C1527e.f5896n, str);
            bundle2.putBundle(C1527e.f5897o, bundle);
            bundle2.putParcelable(C1527e.f5892j, resultReceiver);
            m143a(9, bundle2, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo122a(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C1527e.f5886d, str);
            C0748i.m4316a(bundle, C1527e.f5883a, iBinder);
            m143a(4, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo123a(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C1527e.f5886d, str);
            bundle.putParcelable(C1527e.f5892j, resultReceiver);
            m143a(5, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo120a(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C1527e.f5895m, str);
            bundle2.putBundle(C1527e.f5894l, bundle);
            bundle2.putParcelable(C1527e.f5892j, resultReceiver);
            m143a(8, bundle2, messenger);
        }

        /* renamed from: a */
        private void m143a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f130a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0045m {

        /* renamed from: a */
        private final List<C0046n> f132a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f133b = new ArrayList();

        /* renamed from: a */
        public List<C0046n> mo128a() {
            return this.f132a;
        }

        /* renamed from: b */
        public List<Bundle> mo130b() {
            return this.f133b;
        }

        /* renamed from: c */
        public boolean mo131c() {
            return this.f132a.isEmpty();
        }

        /* renamed from: a */
        public C0046n mo127a(Bundle bundle) {
            for (int i = 0; i < this.f133b.size(); i++) {
                if (C1526d.m7936a((Bundle) this.f133b.get(i), bundle)) {
                    return (C0046n) this.f132a.get(i);
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo129a(Bundle bundle, C0046n nVar) {
            for (int i = 0; i < this.f133b.size(); i++) {
                if (C1526d.m7936a((Bundle) this.f133b.get(i), bundle)) {
                    this.f132a.set(i, nVar);
                    return;
                }
            }
            this.f132a.add(nVar);
            this.f133b.add(bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0046n {

        /* renamed from: a */
        final Object f134a;

        /* renamed from: b */
        final IBinder f135b = new Binder();

        /* renamed from: c */
        WeakReference<C0045m> f136c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C0047a implements C0064d {
            C0047a() {
            }

            /* renamed from: a */
            public void mo139a(@C0193h0 String str, List<?> list) {
                WeakReference<C0045m> weakReference = C0046n.this.f136c;
                C0045m mVar = weakReference == null ? null : (C0045m) weakReference.get();
                if (mVar == null) {
                    C0046n.this.mo135a(str, MediaItem.m61a(list));
                    return;
                }
                List a = MediaItem.m61a(list);
                List a2 = mVar.mo128a();
                List b = mVar.mo130b();
                for (int i = 0; i < a2.size(); i++) {
                    Bundle bundle = (Bundle) b.get(i);
                    if (bundle == null) {
                        C0046n.this.mo135a(str, a);
                    } else {
                        C0046n.this.mo136a(str, mo137a(a, bundle), bundle);
                    }
                }
            }

            /* renamed from: a */
            public void mo138a(@C0193h0 String str) {
                C0046n.this.mo133a(str);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public List<MediaItem> mo137a(List<MediaItem> list, Bundle bundle) {
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
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C0048b extends C0047a implements C0070a {
            C0048b() {
                super();
            }

            /* renamed from: a */
            public void mo141a(@C0193h0 String str, List<?> list, @C0193h0 Bundle bundle) {
                C0046n.this.mo136a(str, MediaItem.m61a(list), bundle);
            }

            /* renamed from: a */
            public void mo140a(@C0193h0 String str, @C0193h0 Bundle bundle) {
                C0046n.this.mo134a(str, bundle);
            }
        }

        public C0046n() {
            int i = VERSION.SDK_INT;
            if (i >= 26) {
                this.f134a = C0069c.m242a(new C0048b());
            } else if (i >= 21) {
                this.f134a = C0060a.m221a((C0064d) new C0047a());
            } else {
                this.f134a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo132a(C0045m mVar) {
            this.f136c = new WeakReference<>(mVar);
        }

        /* renamed from: a */
        public void mo133a(@C0193h0 String str) {
        }

        /* renamed from: a */
        public void mo134a(@C0193h0 String str, @C0193h0 Bundle bundle) {
        }

        /* renamed from: a */
        public void mo135a(@C0193h0 String str, @C0193h0 List<MediaItem> list) {
        }

        /* renamed from: a */
        public void mo136a(@C0193h0 String str, @C0193h0 List<MediaItem> list, @C0193h0 Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0015b bVar, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f34a = new C0031h(context, componentName, bVar, bundle);
        } else if (i >= 23) {
            this.f34a = new C0030g(context, componentName, bVar, bundle);
        } else if (i >= 21) {
            this.f34a = new C0022f(context, componentName, bVar, bundle);
        } else {
            this.f34a = new C0032i(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo35a() {
        this.f34a.mo86b();
    }

    /* renamed from: b */
    public void mo42b() {
        this.f34a.mo80a();
    }

    @C0195i0
    /* renamed from: c */
    public Bundle mo44c() {
        return this.f34a.getExtras();
    }

    @C0207n0({C0208a.LIBRARY})
    @C0195i0
    /* renamed from: d */
    public Bundle mo45d() {
        return this.f34a.mo91i();
    }

    @C0193h0
    /* renamed from: e */
    public String mo46e() {
        return this.f34a.mo90h();
    }

    @C0193h0
    /* renamed from: f */
    public ComponentName mo47f() {
        return this.f34a.mo88g();
    }

    @C0193h0
    /* renamed from: g */
    public Token mo48g() {
        return this.f34a.mo87d();
    }

    /* renamed from: h */
    public boolean mo49h() {
        return this.f34a.isConnected();
    }

    /* renamed from: a */
    public void mo41a(@C0193h0 String str, @C0193h0 C0046n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f34a.mo83a(str, (Bundle) null, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    /* renamed from: b */
    public void mo43b(@C0193h0 String str, @C0193h0 C0046n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f34a.mo85a(str, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    /* renamed from: a */
    public void mo39a(@C0193h0 String str, @C0193h0 Bundle bundle, @C0193h0 C0046n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.f34a.mo83a(str, bundle, nVar);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    /* renamed from: a */
    public void mo36a(@C0193h0 String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f34a.mo85a(str, (C0046n) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    /* renamed from: a */
    public void mo40a(@C0193h0 String str, @C0193h0 C0019d dVar) {
        this.f34a.mo84a(str, dVar);
    }

    /* renamed from: a */
    public void mo38a(@C0193h0 String str, Bundle bundle, @C0193h0 C0043k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (kVar != null) {
            this.f34a.mo82a(str, bundle, kVar);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: a */
    public void mo37a(@C0193h0 String str, Bundle bundle, @C0195i0 C0018c cVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f34a.mo81a(str, bundle, cVar);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }
}

package android.support.p003v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p003v4.media.MediaDescriptionCompat;
import android.support.p003v4.media.MediaMetadataCompat;
import android.support.p003v4.media.MediaMetadataCompat.C0053c;
import android.support.p003v4.media.RatingCompat;
import android.support.p003v4.media.session.C0134b.C0135a;
import android.support.p003v4.media.session.C0151h.C0152a;
import android.support.p003v4.media.session.C0154i.C0155a;
import android.support.p003v4.media.session.PlaybackStateCompat.C0126c;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0748i;
import androidx.media.C1577j.C1579b;
import androidx.media.C1586n;
import androidx.media.C1586n.C1588b;
import androidx.media.p049q.C1596a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: A */
    public static final String f280A = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: B */
    public static final String f281B = "android.support.v4.media.session.action.ARGUMENT_URI";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: C */
    public static final String f282C = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: D */
    public static final String f283D = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: E */
    public static final String f284E = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: F */
    public static final String f285F = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: G */
    public static final String f286G = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: H */
    public static final String f287H = "android.support.v4.media.session.TOKEN";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: I */
    public static final String f288I = "android.support.v4.media.session.EXTRA_BINDER";
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: J */
    public static final String f289J = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";

    /* renamed from: K */
    private static final int f290K = 320;

    /* renamed from: L */
    private static final String f291L = "data_calling_pkg";

    /* renamed from: M */
    private static final String f292M = "data_calling_pid";

    /* renamed from: N */
    private static final String f293N = "data_calling_uid";

    /* renamed from: O */
    private static final String f294O = "data_extras";

    /* renamed from: P */
    static int f295P = 0;

    /* renamed from: d */
    static final String f296d = "MediaSessionCompat";

    /* renamed from: e */
    public static final int f297e = 1;

    /* renamed from: f */
    public static final int f298f = 2;

    /* renamed from: g */
    public static final int f299g = 4;

    /* renamed from: h */
    public static final String f300h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: i */
    public static final String f301i = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: j */
    public static final String f302j = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: k */
    public static final String f303k = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: l */
    public static final String f304l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: m */
    public static final String f305m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: n */
    public static final int f306n = 0;

    /* renamed from: o */
    public static final int f307o = 1;

    /* renamed from: p */
    public static final int f308p = 2;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: q */
    public static final String f309q = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: r */
    public static final String f310r = "android.support.v4.media.session.action.PREPARE";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: s */
    public static final String f311s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: t */
    public static final String f312t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: u */
    public static final String f313u = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: v */
    public static final String f314v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: w */
    public static final String f315w = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: x */
    public static final String f316x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: y */
    public static final String f317y = "android.support.v4.media.session.action.SET_RATING";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: z */
    public static final String f318z = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    /* renamed from: a */
    private final C0106e f319a;

    /* renamed from: b */
    private final MediaControllerCompat f320b;

    /* renamed from: c */
    private final ArrayList<C0119k> f321c;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C0095a();

        /* renamed from: O */
        public static final int f322O = -1;

        /* renamed from: N */
        private Object f323N;

        /* renamed from: a */
        private final MediaDescriptionCompat f324a;

        /* renamed from: b */
        private final long f325b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0095a implements Creator<QueueItem> {
            C0095a() {
            }

            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo358a() {
            return this.f324a;
        }

        /* renamed from: b */
        public long mo359b() {
            return this.f325b;
        }

        /* renamed from: c */
        public Object mo360c() {
            if (this.f323N != null || VERSION.SDK_INT < 21) {
                return this.f323N;
            }
            this.f323N = C0149c.m1052a(this.f324a.mo147j(), this.f325b);
            return this.f323N;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.f324a);
            sb.append(", Id=");
            sb.append(this.f325b);
            sb.append(" }");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f324a.writeToParcel(parcel, i);
            parcel.writeLong(this.f325b);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f324a = mediaDescriptionCompat;
                this.f325b = j;
                this.f323N = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static List<QueueItem> m543a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b : list) {
                arrayList.add(m544b(b));
            }
            return arrayList;
        }

        /* renamed from: b */
        public static QueueItem m544b(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m168b(C0149c.m1051a(obj)), C0149c.m1053b(obj));
        }

        QueueItem(Parcel parcel) {
            this.f324a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f325b = parcel.readLong();
        }
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C0096a();

        /* renamed from: a */
        ResultReceiver f326a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0096a implements Creator<ResultReceiverWrapper> {
            C0096a() {
            }

            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f326a = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f326a.writeToParcel(parcel, i);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f326a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C0097a();

        /* renamed from: N */
        private Bundle f327N;

        /* renamed from: a */
        private final Object f328a;

        /* renamed from: b */
        private C0134b f329b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0097a implements Creator<Token> {
            C0097a() {
            }

            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: a */
        public static Token m548a(Object obj, C0134b bVar) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0146f.m1036f(obj), bVar);
        }

        /* renamed from: b */
        public static Token m550b(Object obj) {
            return m548a(obj, null);
        }

        /* renamed from: c */
        public Object mo374c() {
            return this.f328a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f328a;
            if (obj2 == null) {
                if (token.f328a != null) {
                    z = false;
                }
                return z;
            }
            Object obj3 = token.f328a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f328a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: i */
        public Bundle mo378i() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.f287H, this);
            C0134b bVar = this.f329b;
            if (bVar != null) {
                C0748i.m4316a(bundle, MediaSessionCompat.f288I, bVar.asBinder());
            }
            Bundle bundle2 = this.f327N;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.f289J, bundle2);
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f328a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f328a);
            }
        }

        Token(Object obj, C0134b bVar) {
            this(obj, bVar, null);
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: b */
        public Bundle mo373b() {
            return this.f327N;
        }

        Token(Object obj, C0134b bVar, Bundle bundle) {
            this.f328a = obj;
            this.f329b = bVar;
            this.f327N = bundle;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: b */
        public static Token m549b(Bundle bundle) {
            Token token = null;
            if (bundle == null) {
                return null;
            }
            C0134b a = C0135a.m914a(C0748i.m4315a(bundle, MediaSessionCompat.f288I));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f289J);
            Token token2 = (Token) bundle.getParcelable(MediaSessionCompat.f287H);
            if (token2 != null) {
                token = new Token(token2.f328a, a, bundle2);
            }
            return token;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: a */
        public C0134b mo370a() {
            return this.f329b;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo372a(C0134b bVar) {
            this.f329b = bVar;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo371a(Bundle bundle) {
            this.f327N = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    class C0098a extends C0101d {
        C0098a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    class C0099b extends C0101d {
        C0099b() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    class C0100c extends C0101d {
        C0100c() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static abstract class C0101d {

        /* renamed from: a */
        final Object f333a;

        /* renamed from: b */
        WeakReference<C0106e> f334b;

        /* renamed from: c */
        private C0102a f335c = null;

        /* renamed from: d */
        private boolean f336d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        private class C0102a extends Handler {

            /* renamed from: b */
            private static final int f337b = 1;

            C0102a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    C0101d.this.mo391a((C1579b) message.obj);
                }
            }
        }

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$b */
        private class C0103b implements C0147a {
            C0103b() {
            }

            /* renamed from: a */
            public void mo416a(Object obj, Bundle bundle) {
            }

            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v1, types: [android.support.v4.media.session.MediaSessionCompat$QueueItem] */
            /* JADX WARNING: type inference failed for: r1v3, types: [android.support.v4.media.session.MediaSessionCompat$QueueItem] */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.IBinder, android.support.v4.media.session.MediaSessionCompat$QueueItem]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.support.v4.media.session.MediaSessionCompat$QueueItem, android.os.IBinder]
              mth insns count: 90
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 3 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo417a(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r1 = 0
                    if (r0 == 0) goto L_0x003d
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.f334b     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.p003v4.media.session.MediaSessionCompat.C0111h) r5     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r5 == 0) goto L_0x00c3
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00c3 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.mo450d()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.b r0 = r5.mo370a()     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x0027
                    goto L_0x002b
                L_0x0027:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00c3 }
                L_0x002b:
                    androidx.core.app.C0748i.m4316a(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Bundle r5 = r5.mo373b()     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    r6.putBundle(r0, r5)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x003d:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p003v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo386a(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x0054:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p003v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00c3 }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo387a(r7, r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x006e:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r0 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p003v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo400b(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x0082:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r0 == 0) goto L_0x00be
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.f334b     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.p003v4.media.session.MediaSessionCompat.C0111h) r5     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r5 == 0) goto L_0x00c3
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f350f     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r7 == 0) goto L_0x00c3
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r6 < 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f350f     // Catch:{ BadParcelableException -> 0x00c3 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r6 >= r7) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.f350f     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.p003v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00c3 }
                L_0x00b2:
                    if (r1 == 0) goto L_0x00c3
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.mo358a()     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo400b(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x00be:
                    android.support.v4.media.session.MediaSessionCompat$d r0 = android.support.p003v4.media.session.MediaSessionCompat.C0101d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    r0.mo393a(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00c3 }
                L_0x00c3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p003v4.media.session.MediaSessionCompat.C0101d.C0103b.mo417a(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            /* renamed from: b */
            public void mo421b(String str, Bundle bundle) {
                C0101d.this.mo404c(str, bundle);
            }

            /* renamed from: c */
            public void mo422c() {
                C0101d.this.mo402c();
            }

            /* renamed from: d */
            public void mo424d() {
                C0101d.this.mo410g();
            }

            /* renamed from: f */
            public void mo426f() {
                C0101d.this.mo382a();
            }

            public void onPause() {
                C0101d.this.mo396b();
            }

            public void onStop() {
                C0101d.this.mo411h();
            }

            /* renamed from: b */
            public void mo419b() {
                C0101d.this.mo407e();
            }

            /* renamed from: c */
            public void mo423c(String str, Bundle bundle) {
                C0101d.this.mo401b(str, bundle);
            }

            /* renamed from: d */
            public void mo425d(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f283D);
                MediaSessionCompat.m514b(bundle2);
                boolean equals = str.equals(MediaSessionCompat.f309q);
                String str2 = MediaSessionCompat.f281B;
                if (equals) {
                    C0101d.this.mo385a((Uri) bundle.getParcelable(str2), bundle2);
                } else if (str.equals(MediaSessionCompat.f310r)) {
                    C0101d.this.mo405d();
                } else if (str.equals(MediaSessionCompat.f311s)) {
                    C0101d.this.mo406d(bundle.getString(MediaSessionCompat.f318z), bundle2);
                } else if (str.equals(MediaSessionCompat.f312t)) {
                    C0101d.this.mo408e(bundle.getString(MediaSessionCompat.f280A), bundle2);
                } else if (str.equals(MediaSessionCompat.f313u)) {
                    C0101d.this.mo399b((Uri) bundle.getParcelable(str2), bundle2);
                } else if (str.equals(MediaSessionCompat.f314v)) {
                    C0101d.this.mo394a(bundle.getBoolean(MediaSessionCompat.f284E));
                } else if (str.equals(MediaSessionCompat.f315w)) {
                    C0101d.this.mo397b(bundle.getInt(MediaSessionCompat.f285F));
                } else if (str.equals(MediaSessionCompat.f316x)) {
                    C0101d.this.mo403c(bundle.getInt(MediaSessionCompat.f286G));
                } else if (str.equals(MediaSessionCompat.f317y)) {
                    C0101d.this.mo389a((RatingCompat) bundle.getParcelable(MediaSessionCompat.f282C), bundle2);
                } else {
                    C0101d.this.mo392a(str, bundle);
                }
            }

            /* renamed from: b */
            public void mo420b(long j) {
                C0101d.this.mo384a(j);
            }

            /* renamed from: a */
            public boolean mo418a(Intent intent) {
                return C0101d.this.mo395a(intent);
            }

            /* renamed from: a */
            public void mo414a(long j) {
                C0101d.this.mo398b(j);
            }

            /* renamed from: a */
            public void mo413a() {
                C0101d.this.mo409f();
            }

            /* renamed from: a */
            public void mo415a(Object obj) {
                C0101d.this.mo388a(RatingCompat.m210b(obj));
            }
        }

        @RequiresApi(23)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$c */
        private class C0104c extends C0103b implements C0152a {
            C0104c() {
                super();
            }

            /* renamed from: b */
            public void mo429b(Uri uri, Bundle bundle) {
                C0101d.this.mo385a(uri, bundle);
            }
        }

        @RequiresApi(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d */
        private class C0105d extends C0104c implements C0155a {
            C0105d() {
                super();
            }

            /* renamed from: a */
            public void mo431a(String str, Bundle bundle) {
                C0101d.this.mo406d(str, bundle);
            }

            /* renamed from: e */
            public void mo432e() {
                C0101d.this.mo405d();
            }

            /* renamed from: a */
            public void mo430a(Uri uri, Bundle bundle) {
                C0101d.this.mo399b(uri, bundle);
            }

            /* renamed from: e */
            public void mo433e(String str, Bundle bundle) {
                C0101d.this.mo408e(str, bundle);
            }
        }

        public C0101d() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                this.f333a = C0154i.m1057a((C0155a) new C0105d());
            } else if (i >= 23) {
                this.f333a = C0151h.m1055a(new C0104c());
            } else if (i >= 21) {
                this.f333a = C0146f.m1018a((C0147a) new C0103b());
            } else {
                this.f333a = null;
            }
        }

        /* renamed from: a */
        public void mo382a() {
        }

        @Deprecated
        /* renamed from: a */
        public void mo383a(int i) {
        }

        /* renamed from: a */
        public void mo384a(long j) {
        }

        /* renamed from: a */
        public void mo385a(Uri uri, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo386a(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: a */
        public void mo387a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: a */
        public void mo388a(RatingCompat ratingCompat) {
        }

        /* renamed from: a */
        public void mo389a(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo390a(C0106e eVar, Handler handler) {
            this.f334b = new WeakReference<>(eVar);
            C0102a aVar = this.f335c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f335c = new C0102a(handler.getLooper());
        }

        /* renamed from: a */
        public void mo392a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo393a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: a */
        public void mo394a(boolean z) {
        }

        /* renamed from: b */
        public void mo396b() {
        }

        /* renamed from: b */
        public void mo397b(int i) {
        }

        /* renamed from: b */
        public void mo398b(long j) {
        }

        /* renamed from: b */
        public void mo399b(Uri uri, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo400b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: b */
        public void mo401b(String str, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo402c() {
        }

        /* renamed from: c */
        public void mo403c(int i) {
        }

        /* renamed from: c */
        public void mo404c(String str, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo405d() {
        }

        /* renamed from: d */
        public void mo406d(String str, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo407e() {
        }

        /* renamed from: e */
        public void mo408e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo409f() {
        }

        /* renamed from: g */
        public void mo410g() {
        }

        /* renamed from: h */
        public void mo411h() {
        }

        /* renamed from: a */
        public boolean mo395a(Intent intent) {
            long j;
            if (VERSION.SDK_INT >= 27) {
                return false;
            }
            C0106e eVar = (C0106e) this.f334b.get();
            if (!(eVar == null || this.f335c == null)) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    C1579b h = eVar.mo456h();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 79 || keyCode == 85) {
                        if (keyEvent.getRepeatCount() > 0) {
                            mo391a(h);
                        } else if (this.f336d) {
                            this.f335c.removeMessages(1);
                            this.f336d = false;
                            PlaybackStateCompat m = eVar.mo457m();
                            if (m == null) {
                                j = 0;
                            } else {
                                j = m.mo534a();
                            }
                            if ((j & 32) != 0) {
                                mo409f();
                            }
                        } else {
                            this.f336d = true;
                            C0102a aVar = this.f335c;
                            aVar.sendMessageDelayed(aVar.obtainMessage(1, h), (long) ViewConfiguration.getDoubleTapTimeout());
                        }
                        return true;
                    }
                    mo391a(h);
                    return false;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo391a(C1579b bVar) {
            long j;
            if (this.f336d) {
                boolean z = false;
                this.f336d = false;
                this.f335c.removeMessages(1);
                C0106e eVar = (C0106e) this.f334b.get();
                if (eVar != null) {
                    PlaybackStateCompat m = eVar.mo457m();
                    if (m == null) {
                        j = 0;
                    } else {
                        j = m.mo534a();
                    }
                    boolean z2 = m != null && m.mo547q() == 3;
                    boolean z3 = (516 & j) != 0;
                    if ((j & 514) != 0) {
                        z = true;
                    }
                    eVar.mo439a(bVar);
                    if (z2 && z) {
                        mo396b();
                    } else if (!z2 && z3) {
                        mo402c();
                    }
                    eVar.mo439a((C1579b) null);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    interface C0106e {
        /* renamed from: a */
        void mo434a(int i);

        /* renamed from: a */
        void mo435a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo436a(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: a */
        void mo437a(C0101d dVar, Handler handler);

        /* renamed from: a */
        void mo438a(PlaybackStateCompat playbackStateCompat);

        /* renamed from: a */
        void mo439a(C1579b bVar);

        /* renamed from: a */
        void mo440a(C1586n nVar);

        /* renamed from: a */
        void mo441a(CharSequence charSequence);

        /* renamed from: a */
        void mo442a(String str, Bundle bundle);

        /* renamed from: a */
        void mo443a(List<QueueItem> list);

        /* renamed from: a */
        void mo444a(boolean z);

        /* renamed from: b */
        void mo445b(int i);

        /* renamed from: b */
        void mo446b(PendingIntent pendingIntent);

        /* renamed from: b */
        void mo447b(boolean z);

        /* renamed from: c */
        void mo448c(int i);

        /* renamed from: c */
        boolean mo449c();

        /* renamed from: d */
        Token mo450d();

        /* renamed from: d */
        void mo451d(int i);

        /* renamed from: e */
        String mo452e();

        /* renamed from: e */
        void mo453e(int i);

        /* renamed from: f */
        Object mo454f();

        /* renamed from: g */
        Object mo455g();

        /* renamed from: h */
        C1579b mo456h();

        /* renamed from: m */
        PlaybackStateCompat mo457m();

        void release();

        void setExtras(Bundle bundle);
    }

    @RequiresApi(18)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0107f extends C0114j {

        /* renamed from: I */
        private static boolean f342I = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        class C0108a implements OnPlaybackPositionUpdateListener {
            C0108a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0107f.this.mo517a(18, -1, -1, Long.valueOf(j), null);
            }
        }

        C0107f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        /* renamed from: a */
        public void mo437a(C0101d dVar, Handler handler) {
            super.mo437a(dVar, handler);
            if (dVar == null) {
                this.f373i.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f373i.setPlaybackPositionUpdateListener(new C0108a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo463b(PlaybackStateCompat playbackStateCompat) {
            long p = playbackStateCompat.mo546p();
            float n = playbackStateCompat.mo544n();
            long m = playbackStateCompat.mo543m();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo547q() == 3) {
                long j = 0;
                if (p > 0) {
                    if (m > 0) {
                        j = elapsedRealtime - m;
                        if (n > 0.0f && n != 1.0f) {
                            j = (long) (((float) j) * n);
                        }
                    }
                    p += j;
                }
            }
            this.f373i.setPlaybackState(mo521f(playbackStateCompat.mo547q()), p, n);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo460a(long j) {
            int a = super.mo460a(j);
            return (j & 256) != 0 ? a | 256 : a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo461a(PendingIntent pendingIntent, ComponentName componentName) {
            if (f342I) {
                try {
                    this.f372h.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    f342I = false;
                }
            }
            if (!f342I) {
                super.mo461a(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo462b(PendingIntent pendingIntent, ComponentName componentName) {
            if (f342I) {
                this.f372h.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo462b(pendingIntent, componentName);
            }
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0109g extends C0107f {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        class C0110a implements OnMetadataUpdateListener {
            C0110a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0109g.this.mo517a(19, -1, -1, RatingCompat.m210b(obj), null);
                }
            }
        }

        C0109g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        /* renamed from: a */
        public void mo437a(C0101d dVar, Handler handler) {
            super.mo437a(dVar, handler);
            if (dVar == null) {
                this.f373i.setMetadataUpdateListener(null);
                return;
            }
            this.f373i.setMetadataUpdateListener(new C0110a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo460a(long j) {
            int a = super.mo460a(j);
            return (j & 128) != 0 ? a | 512 : a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MetadataEditor mo465a(Bundle bundle) {
            MetadataEditor a = super.mo465a(bundle);
            PlaybackStateCompat playbackStateCompat = this.f385u;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.mo534a()) & 128) != 0) {
                a.addEditableKey(268435457);
            }
            if (bundle == null) {
                return a;
            }
            String str = MediaMetadataCompat.f182Y;
            if (bundle.containsKey(str)) {
                a.putLong(8, bundle.getLong(str));
            }
            String str2 = MediaMetadataCompat.f193j0;
            if (bundle.containsKey(str2)) {
                a.putObject(101, bundle.getParcelable(str2));
            }
            String str3 = MediaMetadataCompat.f192i0;
            if (bundle.containsKey(str3)) {
                a.putObject(268435457, bundle.getParcelable(str3));
            }
            return a;
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    static class C0111h implements C0106e {

        /* renamed from: a */
        final Object f345a;

        /* renamed from: b */
        final Token f346b;

        /* renamed from: c */
        boolean f347c = false;

        /* renamed from: d */
        final RemoteCallbackList<C0131a> f348d = new RemoteCallbackList<>();

        /* renamed from: e */
        PlaybackStateCompat f349e;

        /* renamed from: f */
        List<QueueItem> f350f;

        /* renamed from: g */
        MediaMetadataCompat f351g;

        /* renamed from: h */
        int f352h;

        /* renamed from: i */
        boolean f353i;

        /* renamed from: j */
        int f354j;

        /* renamed from: k */
        int f355k;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$h$a */
        class C0112a extends C0135a {
            C0112a() {
            }

            /* renamed from: B */
            public boolean mo467B() {
                throw new AssertionError();
            }

            /* renamed from: C */
            public PendingIntent mo468C() {
                throw new AssertionError();
            }

            /* renamed from: D */
            public void mo469D() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: F */
            public void mo470F() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: J */
            public void mo471J() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: K */
            public void mo472K() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: M */
            public ParcelableVolumeInfo mo473M() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo483a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo489b(C0131a aVar) {
                C0111h.this.f348d.unregister(aVar);
            }

            /* renamed from: c */
            public void mo493c(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: d */
            public void mo494d(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: e */
            public void mo495e(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: f */
            public void mo497f(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: g */
            public void mo498g(boolean z) throws RemoteException {
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            /* renamed from: j */
            public MediaMetadataCompat mo500j() {
                throw new AssertionError();
            }

            /* renamed from: k */
            public long mo501k() {
                throw new AssertionError();
            }

            /* renamed from: m */
            public PlaybackStateCompat mo502m() {
                C0111h hVar = C0111h.this;
                return MediaSessionCompat.m513a(hVar.f349e, hVar.f351g);
            }

            /* renamed from: n */
            public String mo503n() {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: o */
            public void mo505o() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: p */
            public int mo506p() {
                return C0111h.this.f352h;
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: q */
            public CharSequence mo508q() {
                throw new AssertionError();
            }

            /* renamed from: r */
            public int mo509r() {
                return C0111h.this.f355k;
            }

            /* renamed from: s */
            public boolean mo510s() {
                return C0111h.this.f353i;
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t */
            public List<QueueItem> mo512t() {
                return null;
            }

            /* renamed from: u */
            public int mo513u() {
                return C0111h.this.f354j;
            }

            /* renamed from: y */
            public String mo514y() {
                throw new AssertionError();
            }

            /* renamed from: z */
            public boolean mo515z() {
                return false;
            }

            /* renamed from: a */
            public boolean mo485a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo486b(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: c */
            public void mo492c(long j) {
                throw new AssertionError();
            }

            /* renamed from: f */
            public void mo496f(int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo481a(C0131a aVar) {
                C0111h hVar = C0111h.this;
                if (!hVar.f347c) {
                    String e = hVar.mo452e();
                    if (e == null) {
                        e = C1579b.f6047b;
                    }
                    C0111h.this.f348d.register(aVar, new C1579b(e, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: b */
            public void mo490b(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c */
            public void mo491c(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo487b(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo488b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo474a(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo476a(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo475a(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo479a(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo480a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo484a(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo482a(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo478a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo477a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }
        }

        C0111h(Context context, String str, Bundle bundle) {
            this.f345a = C0146f.m1017a(context, str);
            this.f346b = new Token(C0146f.m1016a(this.f345a), new C0112a(), bundle);
        }

        /* renamed from: a */
        public void mo437a(C0101d dVar, Handler handler) {
            C0146f.m1024a(this.f345a, dVar == null ? null : dVar.f333a, handler);
            if (dVar != null) {
                dVar.mo390a((C0106e) this, handler);
            }
        }

        /* renamed from: a */
        public void mo439a(C1579b bVar) {
        }

        /* renamed from: b */
        public void mo447b(boolean z) {
            C0146f.m1027a(this.f345a, z);
        }

        /* renamed from: c */
        public boolean mo449c() {
            return C0146f.m1033c(this.f345a);
        }

        /* renamed from: d */
        public Token mo450d() {
            return this.f346b;
        }

        /* renamed from: e */
        public void mo453e(int i) {
            C0146f.m1019a(this.f345a, i);
        }

        /* renamed from: f */
        public Object mo454f() {
            return null;
        }

        /* renamed from: g */
        public Object mo455g() {
            return this.f345a;
        }

        /* renamed from: h */
        public C1579b mo456h() {
            return null;
        }

        /* renamed from: m */
        public PlaybackStateCompat mo457m() {
            return this.f349e;
        }

        public void release() {
            this.f347c = true;
            C0146f.m1034d(this.f345a);
        }

        public void setExtras(Bundle bundle) {
            C0146f.m1021a(this.f345a, bundle);
        }

        /* renamed from: b */
        public void mo446b(PendingIntent pendingIntent) {
            C0146f.m1020a(this.f345a, pendingIntent);
        }

        /* renamed from: c */
        public void mo448c(int i) {
            if (this.f354j != i) {
                this.f354j = i;
                for (int beginBroadcast = this.f348d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((C0131a) this.f348d.getBroadcastItem(beginBroadcast)).mo296e(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f348d.finishBroadcast();
            }
        }

        /* renamed from: d */
        public void mo451d(int i) {
            if (this.f355k != i) {
                this.f355k = i;
                for (int beginBroadcast = this.f348d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((C0131a) this.f348d.getBroadcastItem(beginBroadcast)).mo299g(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f348d.finishBroadcast();
            }
        }

        /* renamed from: e */
        public String mo452e() {
            if (VERSION.SDK_INT < 24) {
                return null;
            }
            return C0154i.m1058a(this.f345a);
        }

        /* renamed from: a */
        public void mo434a(int i) {
            C0146f.m1028b(this.f345a, i);
        }

        /* renamed from: b */
        public void mo445b(int i) {
            if (VERSION.SDK_INT < 22) {
                this.f352h = i;
            } else {
                C0150g.m1054a(this.f345a, i);
            }
        }

        /* renamed from: a */
        public void mo440a(C1586n nVar) {
            C0146f.m1032c(this.f345a, nVar.mo6814d());
        }

        C0111h(Object obj) {
            this.f345a = C0146f.m1035e(obj);
            this.f346b = new Token(C0146f.m1016a(this.f345a), new C0112a());
        }

        /* renamed from: a */
        public void mo442a(String str, Bundle bundle) {
            if (VERSION.SDK_INT < 23) {
                for (int beginBroadcast = this.f348d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((C0131a) this.f348d.getBroadcastItem(beginBroadcast)).mo300i(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.f348d.finishBroadcast();
            }
            C0146f.m1025a(this.f345a, str, bundle);
        }

        /* renamed from: a */
        public void mo438a(PlaybackStateCompat playbackStateCompat) {
            Object obj;
            this.f349e = playbackStateCompat;
            for (int beginBroadcast = this.f348d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f348d.getBroadcastItem(beginBroadcast)).mo295a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f348d.finishBroadcast();
            Object obj2 = this.f345a;
            if (playbackStateCompat == null) {
                obj = null;
            } else {
                obj = playbackStateCompat.mo545o();
            }
            C0146f.m1030b(obj2, obj);
        }

        /* renamed from: a */
        public void mo436a(MediaMetadataCompat mediaMetadataCompat) {
            Object obj;
            this.f351g = mediaMetadataCompat;
            Object obj2 = this.f345a;
            if (mediaMetadataCompat == null) {
                obj = null;
            } else {
                obj = mediaMetadataCompat.mo169c();
            }
            C0146f.m1023a(obj2, obj);
        }

        /* renamed from: a */
        public void mo435a(PendingIntent pendingIntent) {
            C0146f.m1029b(this.f345a, pendingIntent);
        }

        /* renamed from: a */
        public void mo443a(List<QueueItem> list) {
            ArrayList arrayList;
            this.f350f = list;
            if (list != null) {
                arrayList = new ArrayList();
                for (QueueItem c : list) {
                    arrayList.add(c.mo360c());
                }
            } else {
                arrayList = null;
            }
            C0146f.m1026a(this.f345a, (List<Object>) arrayList);
        }

        /* renamed from: a */
        public void mo441a(CharSequence charSequence) {
            C0146f.m1022a(this.f345a, charSequence);
        }

        /* renamed from: a */
        public void mo444a(boolean z) {
            if (this.f353i != z) {
                this.f353i = z;
                for (int beginBroadcast = this.f348d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((C0131a) this.f348d.getBroadcastItem(beginBroadcast)).mo297e(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.f348d.finishBroadcast();
            }
        }
    }

    @RequiresApi(28)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    static class C0113i extends C0111h {
        C0113i(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        /* renamed from: a */
        public void mo439a(C1579b bVar) {
        }

        @C0193h0
        /* renamed from: h */
        public final C1579b mo456h() {
            return new C1579b(((MediaSession) this.f345a).getCurrentControllerInfo());
        }

        C0113i(Object obj) {
            super(obj);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    static class C0114j implements C0106e {

        /* renamed from: H */
        static final int f357H = 0;

        /* renamed from: A */
        int f358A;

        /* renamed from: B */
        int f359B;

        /* renamed from: C */
        Bundle f360C;

        /* renamed from: D */
        int f361D;

        /* renamed from: E */
        int f362E;

        /* renamed from: F */
        C1586n f363F;

        /* renamed from: G */
        private C1588b f364G = new C0115a();

        /* renamed from: a */
        private final Context f365a;

        /* renamed from: b */
        private final ComponentName f366b;

        /* renamed from: c */
        private final PendingIntent f367c;

        /* renamed from: d */
        private final C0117c f368d;

        /* renamed from: e */
        private final Token f369e;

        /* renamed from: f */
        final String f370f;

        /* renamed from: g */
        final String f371g;

        /* renamed from: h */
        final AudioManager f372h;

        /* renamed from: i */
        final RemoteControlClient f373i;

        /* renamed from: j */
        final Object f374j = new Object();

        /* renamed from: k */
        final RemoteCallbackList<C0131a> f375k = new RemoteCallbackList<>();

        /* renamed from: l */
        private C0118d f376l;

        /* renamed from: m */
        boolean f377m = false;

        /* renamed from: n */
        boolean f378n = false;

        /* renamed from: o */
        private boolean f379o = false;

        /* renamed from: p */
        private boolean f380p = false;

        /* renamed from: q */
        volatile C0101d f381q;

        /* renamed from: r */
        private C1579b f382r;

        /* renamed from: s */
        int f383s;

        /* renamed from: t */
        MediaMetadataCompat f384t;

        /* renamed from: u */
        PlaybackStateCompat f385u;

        /* renamed from: v */
        PendingIntent f386v;

        /* renamed from: w */
        List<QueueItem> f387w;

        /* renamed from: x */
        CharSequence f388x;

        /* renamed from: y */
        int f389y;

        /* renamed from: z */
        boolean f390z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$a */
        class C0115a extends C1588b {
            C0115a() {
            }

            /* renamed from: a */
            public void mo522a(C1586n nVar) {
                C0114j jVar = C0114j.this;
                if (jVar.f363F == nVar) {
                    ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(jVar.f361D, jVar.f362E, nVar.mo6812c(), nVar.mo6810b(), nVar.mo6807a());
                    C0114j.this.mo518a(parcelableVolumeInfo);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$b */
        private static final class C0116b {

            /* renamed from: a */
            public final String f392a;

            /* renamed from: b */
            public final Bundle f393b;

            /* renamed from: c */
            public final ResultReceiver f394c;

            public C0116b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f392a = str;
                this.f393b = bundle;
                this.f394c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$c */
        class C0117c extends C0135a {
            C0117c() {
            }

            /* renamed from: B */
            public boolean mo467B() {
                return (C0114j.this.f383s & 2) != 0;
            }

            /* renamed from: C */
            public PendingIntent mo468C() {
                PendingIntent pendingIntent;
                synchronized (C0114j.this.f374j) {
                    pendingIntent = C0114j.this.f386v;
                }
                return pendingIntent;
            }

            /* renamed from: D */
            public void mo469D() throws RemoteException {
                mo523a(3);
            }

            /* renamed from: F */
            public void mo470F() throws RemoteException {
                mo523a(16);
            }

            /* renamed from: J */
            public void mo471J() throws RemoteException {
                mo523a(7);
            }

            /* renamed from: K */
            public void mo472K() throws RemoteException {
                mo523a(17);
            }

            /* renamed from: M */
            public ParcelableVolumeInfo mo473M() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0114j.this.f374j) {
                    i = C0114j.this.f361D;
                    i2 = C0114j.this.f362E;
                    C1586n nVar = C0114j.this.f363F;
                    if (i == 2) {
                        int c = nVar.mo6812c();
                        int b = nVar.mo6810b();
                        i3 = nVar.mo6807a();
                        i4 = b;
                        i5 = c;
                    } else {
                        i4 = C0114j.this.f372h.getStreamMaxVolume(i2);
                        i3 = C0114j.this.f372h.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, i5, i4, i3);
                return parcelableVolumeInfo;
            }

            /* renamed from: a */
            public void mo483a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                mo525a(1, (Object) new C0116b(str, bundle, resultReceiverWrapper.f326a));
            }

            /* renamed from: b */
            public void mo489b(C0131a aVar) {
                C0114j.this.f375k.unregister(aVar);
            }

            /* renamed from: c */
            public void mo493c(String str, Bundle bundle) throws RemoteException {
                mo527a(4, (Object) str, bundle);
            }

            /* renamed from: d */
            public void mo494d(int i) throws RemoteException {
                mo524a(30, i);
            }

            /* renamed from: e */
            public void mo495e(String str, Bundle bundle) throws RemoteException {
                mo527a(8, (Object) str, bundle);
            }

            /* renamed from: f */
            public void mo497f(String str, Bundle bundle) throws RemoteException {
                mo527a(9, (Object) str, bundle);
            }

            /* renamed from: g */
            public void mo498g(boolean z) throws RemoteException {
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (C0114j.this.f374j) {
                    bundle = C0114j.this.f360C;
                }
                return bundle;
            }

            /* renamed from: j */
            public MediaMetadataCompat mo500j() {
                return C0114j.this.f384t;
            }

            /* renamed from: k */
            public long mo501k() {
                long j;
                synchronized (C0114j.this.f374j) {
                    j = (long) C0114j.this.f383s;
                }
                return j;
            }

            /* renamed from: m */
            public PlaybackStateCompat mo502m() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0114j.this.f374j) {
                    playbackStateCompat = C0114j.this.f385u;
                    mediaMetadataCompat = C0114j.this.f384t;
                }
                return MediaSessionCompat.m513a(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: n */
            public String mo503n() {
                return C0114j.this.f370f;
            }

            public void next() throws RemoteException {
                mo523a(14);
            }

            /* renamed from: o */
            public void mo505o() throws RemoteException {
                mo523a(12);
            }

            /* renamed from: p */
            public int mo506p() {
                return C0114j.this.f389y;
            }

            public void previous() throws RemoteException {
                mo523a(15);
            }

            /* renamed from: q */
            public CharSequence mo508q() {
                return C0114j.this.f388x;
            }

            /* renamed from: r */
            public int mo509r() {
                return C0114j.this.f359B;
            }

            /* renamed from: s */
            public boolean mo510s() {
                return C0114j.this.f390z;
            }

            public void stop() throws RemoteException {
                mo523a(13);
            }

            /* renamed from: t */
            public List<QueueItem> mo512t() {
                List<QueueItem> list;
                synchronized (C0114j.this.f374j) {
                    list = C0114j.this.f387w;
                }
                return list;
            }

            /* renamed from: u */
            public int mo513u() {
                return C0114j.this.f358A;
            }

            /* renamed from: y */
            public String mo514y() {
                return C0114j.this.f371g;
            }

            /* renamed from: z */
            public boolean mo515z() {
                return false;
            }

            /* renamed from: a */
            public boolean mo485a(KeyEvent keyEvent) {
                boolean z = true;
                if ((C0114j.this.f383s & 1) == 0) {
                    z = false;
                }
                if (z) {
                    mo525a(21, (Object) keyEvent);
                }
                return z;
            }

            /* renamed from: b */
            public void mo486b(int i, int i2, String str) {
                C0114j.this.mo516a(i, i2);
            }

            /* renamed from: c */
            public void mo492c(long j) {
                mo525a(11, (Object) Long.valueOf(j));
            }

            /* renamed from: f */
            public void mo496f(int i) {
                mo524a(28, i);
            }

            /* renamed from: b */
            public void mo490b(String str, Bundle bundle) throws RemoteException {
                mo527a(5, (Object) str, bundle);
            }

            /* renamed from: c */
            public void mo491c(int i) throws RemoteException {
                mo524a(23, i);
            }

            /* renamed from: a */
            public void mo481a(C0131a aVar) {
                if (C0114j.this.f377m) {
                    try {
                        aVar.mo268v();
                    } catch (Exception unused) {
                    }
                    return;
                }
                C0114j.this.f375k.register(aVar, new C1579b(C1579b.f6047b, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            /* renamed from: b */
            public void mo487b(Uri uri, Bundle bundle) throws RemoteException {
                mo527a(10, (Object) uri, bundle);
            }

            /* renamed from: b */
            public void mo488b(MediaDescriptionCompat mediaDescriptionCompat) {
                mo525a(25, (Object) mediaDescriptionCompat);
            }

            /* renamed from: a */
            public void mo474a(int i, int i2, String str) {
                C0114j.this.mo520b(i, i2);
            }

            /* renamed from: a */
            public void mo476a(Uri uri, Bundle bundle) throws RemoteException {
                mo527a(6, (Object) uri, bundle);
            }

            /* renamed from: a */
            public void mo475a(long j) throws RemoteException {
                mo525a(18, (Object) Long.valueOf(j));
            }

            /* renamed from: a */
            public void mo479a(RatingCompat ratingCompat) throws RemoteException {
                mo525a(19, (Object) ratingCompat);
            }

            /* renamed from: a */
            public void mo480a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo527a(31, (Object) ratingCompat, bundle);
            }

            /* renamed from: a */
            public void mo484a(boolean z) throws RemoteException {
                mo525a(29, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public void mo482a(String str, Bundle bundle) throws RemoteException {
                mo527a(20, (Object) str, bundle);
            }

            /* renamed from: a */
            public void mo478a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo526a(26, (Object) mediaDescriptionCompat, i);
            }

            /* renamed from: a */
            public void mo477a(MediaDescriptionCompat mediaDescriptionCompat) {
                mo525a(27, (Object) mediaDescriptionCompat);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo523a(int i) {
                C0114j.this.mo517a(i, 0, 0, null, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo524a(int i, int i2) {
                C0114j.this.mo517a(i, i2, 0, null, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo525a(int i, Object obj) {
                C0114j.this.mo517a(i, 0, 0, obj, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo526a(int i, Object obj, int i2) {
                C0114j.this.mo517a(i, i2, 0, obj, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo527a(int i, Object obj, Bundle bundle) {
                C0114j.this.mo517a(i, 0, 0, obj, bundle);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$d */
        class C0118d extends Handler {

            /* renamed from: A */
            private static final int f396A = 26;

            /* renamed from: B */
            private static final int f397B = 27;

            /* renamed from: C */
            private static final int f398C = 28;

            /* renamed from: D */
            private static final int f399D = 29;

            /* renamed from: E */
            private static final int f400E = 30;

            /* renamed from: F */
            private static final int f401F = 127;

            /* renamed from: G */
            private static final int f402G = 126;

            /* renamed from: b */
            private static final int f403b = 1;

            /* renamed from: c */
            private static final int f404c = 2;

            /* renamed from: d */
            private static final int f405d = 3;

            /* renamed from: e */
            private static final int f406e = 4;

            /* renamed from: f */
            private static final int f407f = 5;

            /* renamed from: g */
            private static final int f408g = 6;

            /* renamed from: h */
            private static final int f409h = 7;

            /* renamed from: i */
            private static final int f410i = 8;

            /* renamed from: j */
            private static final int f411j = 9;

            /* renamed from: k */
            private static final int f412k = 10;

            /* renamed from: l */
            private static final int f413l = 11;

            /* renamed from: m */
            private static final int f414m = 12;

            /* renamed from: n */
            private static final int f415n = 13;

            /* renamed from: o */
            private static final int f416o = 14;

            /* renamed from: p */
            private static final int f417p = 15;

            /* renamed from: q */
            private static final int f418q = 16;

            /* renamed from: r */
            private static final int f419r = 17;

            /* renamed from: s */
            private static final int f420s = 18;

            /* renamed from: t */
            private static final int f421t = 19;

            /* renamed from: u */
            private static final int f422u = 31;

            /* renamed from: v */
            private static final int f423v = 20;

            /* renamed from: w */
            private static final int f424w = 21;

            /* renamed from: x */
            private static final int f425x = 22;

            /* renamed from: y */
            private static final int f426y = 23;

            /* renamed from: z */
            private static final int f427z = 25;

            public C0118d(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m805a(KeyEvent keyEvent, C0101d dVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0114j.this.f385u;
                    long a = playbackStateCompat == null ? 0 : playbackStateCompat.mo534a();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 79) {
                        return;
                    }
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 86:
                                    if ((a & 1) != 0) {
                                        dVar.mo411h();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((a & 32) != 0) {
                                        dVar.mo409f();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((a & 16) != 0) {
                                        dVar.mo410g();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((a & 8) != 0) {
                                        dVar.mo407e();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((a & 64) != 0) {
                                        dVar.mo382a();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((a & 2) != 0) {
                            dVar.mo396b();
                        }
                    } else if ((a & 4) != 0) {
                        dVar.mo402c();
                    }
                }
            }

            public void handleMessage(Message message) {
                C0101d dVar = C0114j.this.f381q;
                if (dVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m514b(data);
                    C0114j.this.mo439a(new C1579b(data.getString(MediaSessionCompat.f291L), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle(MediaSessionCompat.f294O);
                    MediaSessionCompat.m514b(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0116b bVar = (C0116b) message.obj;
                                dVar.mo393a(bVar.f392a, bVar.f393b, bVar.f394c);
                                break;
                            case 2:
                                C0114j.this.mo516a(message.arg1, 0);
                                break;
                            case 3:
                                dVar.mo405d();
                                break;
                            case 4:
                                dVar.mo406d((String) message.obj, bundle);
                                break;
                            case 5:
                                dVar.mo408e((String) message.obj, bundle);
                                break;
                            case 6:
                                dVar.mo399b((Uri) message.obj, bundle);
                                break;
                            case 7:
                                dVar.mo402c();
                                break;
                            case 8:
                                dVar.mo401b((String) message.obj, bundle);
                                break;
                            case 9:
                                dVar.mo404c((String) message.obj, bundle);
                                break;
                            case 10:
                                dVar.mo385a((Uri) message.obj, bundle);
                                break;
                            case 11:
                                dVar.mo398b(((Long) message.obj).longValue());
                                break;
                            case 12:
                                dVar.mo396b();
                                break;
                            case 13:
                                dVar.mo411h();
                                break;
                            case 14:
                                dVar.mo409f();
                                break;
                            case 15:
                                dVar.mo410g();
                                break;
                            case 16:
                                dVar.mo382a();
                                break;
                            case 17:
                                dVar.mo407e();
                                break;
                            case 18:
                                dVar.mo384a(((Long) message.obj).longValue());
                                break;
                            case 19:
                                dVar.mo388a((RatingCompat) message.obj);
                                break;
                            case 20:
                                dVar.mo392a((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!dVar.mo395a(intent)) {
                                    m805a(keyEvent, dVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0114j.this.mo520b(message.arg1, 0);
                                break;
                            case 23:
                                dVar.mo397b(message.arg1);
                                break;
                            case 25:
                                dVar.mo386a((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                dVar.mo387a((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                dVar.mo400b((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                if (C0114j.this.f387w != null) {
                                    QueueItem queueItem = (message.arg1 < 0 || message.arg1 >= C0114j.this.f387w.size()) ? null : (QueueItem) C0114j.this.f387w.get(message.arg1);
                                    if (queueItem != null) {
                                        dVar.mo400b(queueItem.mo358a());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                dVar.mo394a(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                dVar.mo403c(message.arg1);
                                break;
                            case 31:
                                dVar.mo389a((RatingCompat) message.obj, bundle);
                                break;
                        }
                    } finally {
                        C0114j.this.mo439a((C1579b) null);
                    }
                }
            }
        }

        public C0114j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f365a = context;
                this.f370f = context.getPackageName();
                this.f372h = (AudioManager) context.getSystemService("audio");
                this.f371g = str;
                this.f366b = componentName;
                this.f367c = pendingIntent;
                this.f368d = new C0117c();
                this.f369e = new Token(this.f368d);
                this.f389y = 0;
                this.f361D = 1;
                this.f362E = 3;
                this.f373i = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* renamed from: g */
        private void m717g(int i) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo296e(i);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo460a(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* renamed from: a */
        public void mo437a(C0101d dVar, Handler handler) {
            this.f381q = dVar;
            if (dVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f374j) {
                    if (this.f376l != null) {
                        this.f376l.removeCallbacksAndMessages(null);
                    }
                    this.f376l = new C0118d(handler.getLooper());
                    this.f381q.mo390a((C0106e) this, handler);
                }
            }
        }

        /* renamed from: b */
        public void mo446b(PendingIntent pendingIntent) {
        }

        /* renamed from: b */
        public void mo447b(boolean z) {
            if (z != this.f378n) {
                this.f378n = z;
                if (mo519a()) {
                    mo436a(this.f384t);
                    mo438a(this.f385u);
                }
            }
        }

        /* renamed from: c */
        public boolean mo449c() {
            return this.f378n;
        }

        /* renamed from: d */
        public Token mo450d() {
            return this.f369e;
        }

        /* renamed from: e */
        public String mo452e() {
            return null;
        }

        /* renamed from: e */
        public void mo453e(int i) {
            synchronized (this.f374j) {
                this.f383s = i;
            }
            mo519a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo521f(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* renamed from: f */
        public Object mo454f() {
            return null;
        }

        /* renamed from: g */
        public Object mo455g() {
            return null;
        }

        /* renamed from: h */
        public C1579b mo456h() {
            C1579b bVar;
            synchronized (this.f374j) {
                bVar = this.f382r;
            }
            return bVar;
        }

        /* renamed from: m */
        public PlaybackStateCompat mo457m() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f374j) {
                playbackStateCompat = this.f385u;
            }
            return playbackStateCompat;
        }

        public void release() {
            this.f378n = false;
            this.f377m = true;
            mo519a();
            m709b();
        }

        public void setExtras(Bundle bundle) {
            this.f360C = bundle;
            m710b(bundle);
        }

        /* renamed from: c */
        public void mo448c(int i) {
            if (this.f358A != i) {
                this.f358A = i;
                m717g(i);
            }
        }

        /* renamed from: d */
        public void mo451d(int i) {
            if (this.f359B != i) {
                this.f359B = i;
                m718h(i);
            }
        }

        /* renamed from: h */
        private void m718h(int i) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo299g(i);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* renamed from: c */
        private void m715c(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo295a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo463b(PlaybackStateCompat playbackStateCompat) {
            this.f373i.setPlaybackState(mo521f(playbackStateCompat.mo547q()));
        }

        /* renamed from: b */
        public void mo445b(int i) {
            this.f389y = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo462b(PendingIntent pendingIntent, ComponentName componentName) {
            this.f372h.unregisterMediaButtonEventReceiver(componentName);
        }

        /* renamed from: c */
        private void m716c(boolean z) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo297e(z);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo517a(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f374j) {
                if (this.f376l != null) {
                    Message obtainMessage = this.f376l.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaSessionCompat.f291L, C1579b.f6047b);
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle(MediaSessionCompat.f294O, bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo520b(int i, int i2) {
            if (this.f361D == 2) {
                C1586n nVar = this.f363F;
                if (nVar != null) {
                    nVar.mo6811b(i);
                    return;
                }
                return;
            }
            this.f372h.setStreamVolume(this.f362E, i, i2);
        }

        /* renamed from: b */
        private void m709b() {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo268v();
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
            this.f375k.kill();
        }

        /* renamed from: b */
        private void m713b(String str, Bundle bundle) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo300i(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* renamed from: a */
        public void mo434a(int i) {
            C1586n nVar = this.f363F;
            if (nVar != null) {
                nVar.mo6809a((C1588b) null);
            }
            this.f362E = i;
            this.f361D = 1;
            int i2 = this.f361D;
            int i3 = this.f362E;
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i2, i3, 2, this.f372h.getStreamMaxVolume(i3), this.f372h.getStreamVolume(this.f362E));
            mo518a(parcelableVolumeInfo);
        }

        /* renamed from: b */
        private void m711b(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo263a(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* renamed from: b */
        private void m714b(List<QueueItem> list) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo267b(list);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* renamed from: a */
        public void mo440a(C1586n nVar) {
            if (nVar != null) {
                C1586n nVar2 = this.f363F;
                if (nVar2 != null) {
                    nVar2.mo6809a((C1588b) null);
                }
                this.f361D = 2;
                this.f363F = nVar;
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(this.f361D, this.f362E, this.f363F.mo6812c(), this.f363F.mo6810b(), this.f363F.mo6807a());
                mo518a(parcelableVolumeInfo);
                nVar.mo6809a(this.f364G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        /* renamed from: b */
        private void m712b(CharSequence charSequence) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo265a(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* renamed from: b */
        private void m710b(Bundle bundle) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo266b(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }

        /* renamed from: a */
        public void mo442a(String str, Bundle bundle) {
            m713b(str, bundle);
        }

        /* renamed from: a */
        public void mo438a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f374j) {
                this.f385u = playbackStateCompat;
            }
            m715c(playbackStateCompat);
            if (this.f378n) {
                if (playbackStateCompat == null) {
                    this.f373i.setPlaybackState(0);
                    this.f373i.setTransportControlFlags(0);
                } else {
                    mo463b(playbackStateCompat);
                    this.f373i.setTransportControlFlags(mo460a(playbackStateCompat.mo534a()));
                }
            }
        }

        /* renamed from: a */
        public void mo436a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new C0053c(mediaMetadataCompat, MediaSessionCompat.f295P).mo185a();
            }
            synchronized (this.f374j) {
                this.f384t = mediaMetadataCompat;
            }
            m711b(mediaMetadataCompat);
            if (this.f378n) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo165a();
                }
                mo465a(bundle).apply();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MetadataEditor mo465a(Bundle bundle) {
            MetadataEditor editMetadata = this.f373i.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            String str = MediaMetadataCompat.f188e0;
            if (bundle.containsKey(str)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(str);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else {
                String str2 = MediaMetadataCompat.f190g0;
                if (bundle.containsKey(str2)) {
                    Bitmap bitmap2 = (Bitmap) bundle.getParcelable(str2);
                    if (bitmap2 != null) {
                        bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap2);
                }
            }
            String str3 = MediaMetadataCompat.f176S;
            if (bundle.containsKey(str3)) {
                editMetadata.putString(1, bundle.getString(str3));
            }
            String str4 = MediaMetadataCompat.f187d0;
            if (bundle.containsKey(str4)) {
                editMetadata.putString(13, bundle.getString(str4));
            }
            String str5 = MediaMetadataCompat.f174Q;
            if (bundle.containsKey(str5)) {
                editMetadata.putString(2, bundle.getString(str5));
            }
            String str6 = MediaMetadataCompat.f177T;
            if (bundle.containsKey(str6)) {
                editMetadata.putString(3, bundle.getString(str6));
            }
            String str7 = MediaMetadataCompat.f180W;
            if (bundle.containsKey(str7)) {
                editMetadata.putString(15, bundle.getString(str7));
            }
            String str8 = MediaMetadataCompat.f179V;
            if (bundle.containsKey(str8)) {
                editMetadata.putString(4, bundle.getString(str8));
            }
            String str9 = MediaMetadataCompat.f181X;
            if (bundle.containsKey(str9)) {
                editMetadata.putString(5, bundle.getString(str9));
            }
            String str10 = MediaMetadataCompat.f186c0;
            if (bundle.containsKey(str10)) {
                editMetadata.putLong(14, bundle.getLong(str10));
            }
            String str11 = MediaMetadataCompat.f175R;
            if (bundle.containsKey(str11)) {
                editMetadata.putLong(9, bundle.getLong(str11));
            }
            String str12 = MediaMetadataCompat.f183Z;
            if (bundle.containsKey(str12)) {
                editMetadata.putString(6, bundle.getString(str12));
            }
            if (bundle.containsKey(MediaMetadataCompat.f173P)) {
                editMetadata.putString(7, bundle.getString(MediaMetadataCompat.f173P));
            }
            if (bundle.containsKey(MediaMetadataCompat.f184a0)) {
                editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.f184a0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f178U)) {
                editMetadata.putString(11, bundle.getString(MediaMetadataCompat.f178U));
            }
            return editMetadata;
        }

        /* renamed from: a */
        public void mo435a(PendingIntent pendingIntent) {
            synchronized (this.f374j) {
                this.f386v = pendingIntent;
            }
        }

        /* renamed from: a */
        public void mo443a(List<QueueItem> list) {
            this.f387w = list;
            m714b(list);
        }

        /* renamed from: a */
        public void mo441a(CharSequence charSequence) {
            this.f388x = charSequence;
            m712b(charSequence);
        }

        /* renamed from: a */
        public void mo444a(boolean z) {
            if (this.f390z != z) {
                this.f390z = z;
                m716c(z);
            }
        }

        /* renamed from: a */
        public void mo439a(C1579b bVar) {
            synchronized (this.f374j) {
                this.f382r = bVar;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo519a() {
            if (this.f378n) {
                if (!this.f379o && (this.f383s & 1) != 0) {
                    mo461a(this.f367c, this.f366b);
                    this.f379o = true;
                } else if (this.f379o && (this.f383s & 1) == 0) {
                    mo462b(this.f367c, this.f366b);
                    this.f379o = false;
                }
                if (!this.f380p && (this.f383s & 2) != 0) {
                    this.f372h.registerRemoteControlClient(this.f373i);
                    this.f380p = true;
                    return true;
                } else if (this.f380p && (this.f383s & 2) == 0) {
                    this.f373i.setPlaybackState(0);
                    this.f372h.unregisterRemoteControlClient(this.f373i);
                    this.f380p = false;
                }
            } else {
                if (this.f379o) {
                    mo462b(this.f367c, this.f366b);
                    this.f379o = false;
                }
                if (this.f380p) {
                    this.f373i.setPlaybackState(0);
                    this.f372h.unregisterRemoteControlClient(this.f373i);
                    this.f380p = false;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo461a(PendingIntent pendingIntent, ComponentName componentName) {
            this.f372h.registerMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo516a(int i, int i2) {
            if (this.f361D == 2) {
                C1586n nVar = this.f363F;
                if (nVar != null) {
                    nVar.mo6808a(i);
                    return;
                }
                return;
            }
            this.f372h.adjustStreamVolume(this.f362E, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo518a(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f375k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0131a) this.f375k.getBroadcastItem(beginBroadcast)).mo264a(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f375k.finishBroadcast();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$k */
    public interface C0119k {
        /* renamed from: a */
        void mo529a();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$l */
    public @interface C0120l {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* renamed from: a */
    public void mo335a(C0101d dVar) {
        mo336a(dVar, (Handler) null);
    }

    /* renamed from: b */
    public void mo346b(PendingIntent pendingIntent) {
        this.f319a.mo435a(pendingIntent);
    }

    /* renamed from: c */
    public void mo350c(int i) {
        this.f319a.mo445b(i);
    }

    /* renamed from: d */
    public void mo352d(int i) {
        this.f319a.mo448c(i);
    }

    /* renamed from: e */
    public void mo354e(int i) {
        this.f319a.mo451d(i);
    }

    /* renamed from: f */
    public Token mo355f() {
        return this.f319a.mo450d();
    }

    /* renamed from: g */
    public boolean mo356g() {
        return this.f319a.mo449c();
    }

    /* renamed from: h */
    public void mo357h() {
        this.f319a.release();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    /* renamed from: a */
    public void mo336a(C0101d dVar, Handler handler) {
        if (dVar == null) {
            this.f319a.mo437a((C0101d) null, (Handler) null);
            return;
        }
        C0106e eVar = this.f319a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.mo437a(dVar, handler);
    }

    /* renamed from: b */
    public void mo345b(int i) {
        this.f319a.mo434a(i);
    }

    @C0193h0
    /* renamed from: c */
    public final C1579b mo349c() {
        return this.f319a.mo456h();
    }

    /* renamed from: d */
    public Object mo351d() {
        return this.f319a.mo455g();
    }

    /* renamed from: e */
    public Object mo353e() {
        return this.f319a.mo454f();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    /* renamed from: b */
    public MediaControllerCompat mo344b() {
        return this.f320b;
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f321c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                componentName = C1596a.m8127a(context);
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            int i = VERSION.SDK_INT;
            if (i >= 28) {
                this.f319a = new C0113i(context, str, bundle);
                mo335a((C0101d) new C0098a());
                this.f319a.mo446b(pendingIntent);
            } else if (i >= 21) {
                this.f319a = new C0111h(context, str, bundle);
                mo335a((C0101d) new C0099b());
                this.f319a.mo446b(pendingIntent);
            } else if (i >= 19) {
                this.f319a = new C0109g(context, str, componentName, pendingIntent);
            } else if (i >= 18) {
                this.f319a = new C0107f(context, str, componentName, pendingIntent);
            } else {
                this.f319a = new C0114j(context, str, componentName, pendingIntent);
            }
            this.f320b = new MediaControllerCompat(context, this);
            if (f295P == 0) {
                f295P = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    /* renamed from: a */
    public void mo332a(PendingIntent pendingIntent) {
        this.f319a.mo446b(pendingIntent);
    }

    /* renamed from: b */
    public void mo348b(boolean z) {
        this.f319a.mo444a(z);
    }

    /* renamed from: a */
    public void mo331a(int i) {
        this.f319a.mo453e(i);
    }

    /* renamed from: b */
    public void mo347b(C0119k kVar) {
        if (kVar != null) {
            this.f321c.remove(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    /* renamed from: a */
    public void mo339a(C1586n nVar) {
        if (nVar != null) {
            this.f319a.mo440a(nVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: b */
    public static void m514b(@C0195i0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public void mo343a(boolean z) {
        this.f319a.mo447b(z);
        Iterator it = this.f321c.iterator();
        while (it.hasNext()) {
            ((C0119k) it.next()).mo529a();
        }
    }

    /* renamed from: a */
    public void mo341a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f319a.mo442a(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    /* renamed from: a */
    public void mo338a(PlaybackStateCompat playbackStateCompat) {
        this.f319a.mo438a(playbackStateCompat);
    }

    /* renamed from: a */
    public void mo334a(MediaMetadataCompat mediaMetadataCompat) {
        this.f319a.mo436a(mediaMetadataCompat);
    }

    /* renamed from: a */
    public void mo342a(List<QueueItem> list) {
        this.f319a.mo443a(list);
    }

    /* renamed from: a */
    public void mo340a(CharSequence charSequence) {
        this.f319a.mo441a(charSequence);
    }

    /* renamed from: a */
    public void mo333a(Bundle bundle) {
        this.f319a.setExtras(bundle);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public String mo330a() {
        return this.f319a.mo452e();
    }

    /* renamed from: a */
    public void mo337a(C0119k kVar) {
        if (kVar != null) {
            this.f321c.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    /* renamed from: a */
    public static MediaSessionCompat m512a(Context context, Object obj) {
        if (context == null || obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        return new MediaSessionCompat(context, (C0106e) new C0111h(obj));
    }

    /* renamed from: a */
    static PlaybackStateCompat m513a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.mo546p() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo547q() != 3 && playbackStateCompat.mo547q() != 4 && playbackStateCompat.mo547q() != 5) {
            return playbackStateCompat;
        }
        long m = playbackStateCompat.mo543m();
        if (m <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long n = ((long) (playbackStateCompat.mo544n() * ((float) (elapsedRealtime - m)))) + playbackStateCompat.mo546p();
        if (mediaMetadataCompat != null) {
            String str = MediaMetadataCompat.f175R;
            if (mediaMetadataCompat.mo166a(str)) {
                j = mediaMetadataCompat.mo170d(str);
            }
        }
        long j2 = (j < 0 || n <= j) ? n < 0 ? 0 : n : j;
        return new C0126c(playbackStateCompat).mo565a(playbackStateCompat.mo547q(), j2, playbackStateCompat.mo544n(), elapsedRealtime).mo572a();
    }

    private MediaSessionCompat(Context context, C0106e eVar) {
        this.f321c = new ArrayList<>();
        this.f319a = eVar;
        if (VERSION.SDK_INT >= 21 && !C0146f.m1031b(eVar.mo455g())) {
            mo335a((C0101d) new C0100c());
        }
        this.f320b = new MediaControllerCompat(context, this);
    }
}

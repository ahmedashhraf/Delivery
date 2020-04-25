package android.support.p003v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p003v4.media.MediaDescriptionCompat;
import android.support.p003v4.media.MediaMetadataCompat;
import android.support.p003v4.media.RatingCompat;
import android.support.p003v4.media.session.C0131a.C0132a;
import android.support.p003v4.media.session.C0134b.C0135a;
import android.support.p003v4.media.session.C0137c.C0138a;
import android.support.p003v4.media.session.C0137c.C0140c;
import android.support.p003v4.media.session.C0137c.C0141d;
import android.support.p003v4.media.session.C0142d.C0143a;
import android.support.p003v4.media.session.C0144e.C0145a;
import android.support.p003v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p003v4.media.session.MediaSessionCompat.ResultReceiverWrapper;
import android.support.p003v4.media.session.MediaSessionCompat.Token;
import android.support.p003v4.media.session.PlaybackStateCompat.CustomAction;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0221u;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0748i;
import androidx.core.app.C0750j;
import androidx.core.app.C0750j.C0751a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: d */
    static final String f231d = "MediaControllerCompat";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: e */
    public static final String f232e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: f */
    public static final String f233f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: g */
    public static final String f234g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: h */
    public static final String f235h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: i */
    public static final String f236i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: j */
    public static final String f237j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: k */
    public static final String f238k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a */
    private final C0085c f239a;

    /* renamed from: b */
    private final Token f240b;

    /* renamed from: c */
    private final HashSet<C0080a> f241c = new HashSet<>();

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0085c {

        /* renamed from: a */
        protected final Object f242a;

        /* renamed from: b */
        final Object f243b = new Object();
        @C0221u("mLock")

        /* renamed from: c */
        private final List<C0080a> f244c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0080a, C0079a> f245d = new HashMap<>();

        /* renamed from: e */
        final Token f246e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f247a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f247a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f247a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f243b) {
                        mediaControllerImplApi21.f246e.mo372a(C0135a.m914a(C0748i.m4315a(bundle, MediaSessionCompat.f288I)));
                        mediaControllerImplApi21.f246e.mo371a(bundle.getBundle(MediaSessionCompat.f289J));
                        mediaControllerImplApi21.mo250f();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0079a extends C0083c {
            C0079a(C0080a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo263a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo267b(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: v */
            public void mo268v() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo265a(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo266b(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo264a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f246e = token;
            this.f242a = C0137c.m963a(context, this.f246e.mo374c());
            if (this.f242a == null) {
                throw new RemoteException();
            } else if (this.f246e.mo370a() == null) {
                m314g();
            }
        }

        /* renamed from: g */
        private void m314g() {
            mo242a(MediaControllerCompat.f232e, null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: a */
        public final void mo241a(C0080a aVar, Handler handler) {
            C0137c.m968a(this.f242a, aVar.f248a, handler);
            synchronized (this.f243b) {
                if (this.f246e.mo370a() != null) {
                    C0079a aVar2 = new C0079a(aVar);
                    this.f245d.put(aVar, aVar2);
                    aVar.f250c = aVar2;
                    try {
                        this.f246e.mo370a().mo481a((C0131a) aVar2);
                        aVar.mo271a(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    aVar.f250c = null;
                    this.f244c.add(aVar);
                }
            }
        }

        /* renamed from: b */
        public void mo245b(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((mo253k() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f237j, mediaDescriptionCompat);
                mo242a(MediaControllerCompat.f233f, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: c */
        public PendingIntent mo247c() {
            return C0137c.m980j(this.f242a);
        }

        /* renamed from: d */
        public C0090h mo248d() {
            Object l = C0137c.m982l(this.f242a);
            if (l != null) {
                return new C0091i(l);
            }
            return null;
        }

        /* renamed from: e */
        public Object mo249e() {
            return this.f242a;
        }

        /* access modifiers changed from: 0000 */
        @C0221u("mLock")
        /* renamed from: f */
        public void mo250f() {
            if (this.f246e.mo370a() != null) {
                for (C0080a aVar : this.f244c) {
                    C0079a aVar2 = new C0079a(aVar);
                    this.f245d.put(aVar, aVar2);
                    aVar.f250c = aVar2;
                    try {
                        this.f246e.mo370a().mo481a((C0131a) aVar2);
                        aVar.mo271a(13, null, null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f244c.clear();
            }
        }

        public Bundle getExtras() {
            return C0137c.m961a(this.f242a);
        }

        /* renamed from: j */
        public MediaMetadataCompat mo252j() {
            Object c = C0137c.m973c(this.f242a);
            if (c != null) {
                return MediaMetadataCompat.m187b(c);
            }
            return null;
        }

        /* renamed from: k */
        public long mo253k() {
            return C0137c.m971b(this.f242a);
        }

        /* renamed from: m */
        public PlaybackStateCompat mo254m() {
            if (this.f246e.mo370a() != null) {
                try {
                    return this.f246e.mo370a().mo502m();
                } catch (RemoteException unused) {
                }
            }
            Object f = C0137c.m976f(this.f242a);
            return f != null ? PlaybackStateCompat.m807b(f) : null;
        }

        /* renamed from: n */
        public String mo255n() {
            return C0137c.m974d(this.f242a);
        }

        /* renamed from: p */
        public int mo256p() {
            if (VERSION.SDK_INT < 22 && this.f246e.mo370a() != null) {
                try {
                    return this.f246e.mo370a().mo506p();
                } catch (RemoteException unused) {
                }
            }
            return C0137c.m979i(this.f242a);
        }

        /* renamed from: q */
        public CharSequence mo257q() {
            return C0137c.m978h(this.f242a);
        }

        /* renamed from: r */
        public int mo258r() {
            if (this.f246e.mo370a() != null) {
                try {
                    return this.f246e.mo370a().mo509r();
                } catch (RemoteException unused) {
                }
            }
            return -1;
        }

        /* renamed from: s */
        public boolean mo259s() {
            if (this.f246e.mo370a() != null) {
                try {
                    return this.f246e.mo370a().mo510s();
                } catch (RemoteException unused) {
                }
            }
            return false;
        }

        /* renamed from: t */
        public List<QueueItem> mo260t() {
            List g = C0137c.m977g(this.f242a);
            if (g != null) {
                return QueueItem.m543a(g);
            }
            return null;
        }

        /* renamed from: u */
        public int mo261u() {
            if (this.f246e.mo370a() != null) {
                try {
                    return this.f246e.mo370a().mo513u();
                } catch (RemoteException unused) {
                }
            }
            return -1;
        }

        /* renamed from: b */
        public void mo244b(int i, int i2) {
            C0137c.m972b(this.f242a, i, i2);
        }

        /* renamed from: b */
        public boolean mo246b() {
            return this.f246e.mo370a() != null;
        }

        /* renamed from: a */
        public final void mo240a(C0080a aVar) {
            C0137c.m967a(this.f242a, aVar.f248a);
            synchronized (this.f243b) {
                if (this.f246e.mo370a() != null) {
                    try {
                        C0079a aVar2 = (C0079a) this.f245d.remove(aVar);
                        if (aVar2 != null) {
                            aVar.f250c = null;
                            this.f246e.mo370a().mo489b((C0131a) aVar2);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.f244c.remove(aVar);
                }
            }
        }

        /* renamed from: a */
        public boolean mo243a(KeyEvent keyEvent) {
            return C0137c.m970a(this.f242a, keyEvent);
        }

        /* renamed from: a */
        public void mo239a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((mo253k() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f237j, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.f238k, i);
                mo242a(MediaControllerCompat.f234g, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: a */
        public void mo238a(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((mo253k() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f237j, mediaDescriptionCompat);
                mo242a(MediaControllerCompat.f235h, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: a */
        public C0089g mo236a() {
            Object e = C0137c.m975e(this.f242a);
            if (e == null) {
                return null;
            }
            C0089g gVar = new C0089g(C0140c.m996e(e), C0140c.m994c(e), C0140c.m997f(e), C0140c.m995d(e), C0140c.m993b(e));
            return gVar;
        }

        /* renamed from: a */
        public void mo237a(int i, int i2) {
            C0137c.m966a(this.f242a, i, i2);
        }

        /* renamed from: a */
        public void mo242a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0137c.m969a(this.f242a, str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0080a implements DeathRecipient {

        /* renamed from: a */
        final Object f248a;

        /* renamed from: b */
        C0081a f249b;

        /* renamed from: c */
        C0131a f250c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0081a extends Handler {

            /* renamed from: c */
            private static final int f251c = 1;

            /* renamed from: d */
            private static final int f252d = 2;

            /* renamed from: e */
            private static final int f253e = 3;

            /* renamed from: f */
            private static final int f254f = 4;

            /* renamed from: g */
            private static final int f255g = 5;

            /* renamed from: h */
            private static final int f256h = 6;

            /* renamed from: i */
            private static final int f257i = 7;

            /* renamed from: j */
            private static final int f258j = 8;

            /* renamed from: k */
            private static final int f259k = 9;

            /* renamed from: l */
            private static final int f260l = 11;

            /* renamed from: m */
            private static final int f261m = 12;

            /* renamed from: n */
            private static final int f262n = 13;

            /* renamed from: a */
            boolean f263a = false;

            C0081a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f263a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m514b(data);
                            C0080a.this.mo278a((String) message.obj, data);
                            break;
                        case 2:
                            C0080a.this.mo276a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            C0080a.this.mo274a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            C0080a.this.mo275a((C0089g) message.obj);
                            break;
                        case 5:
                            C0080a.this.mo279a((List) message.obj);
                            break;
                        case 6:
                            C0080a.this.mo277a((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m514b(bundle);
                            C0080a.this.mo272a(bundle);
                            break;
                        case 8:
                            C0080a.this.mo281b();
                            break;
                        case 9:
                            C0080a.this.mo270a(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            C0080a.this.mo280a(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            C0080a.this.mo282b(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            C0080a.this.mo284c();
                            break;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0082b implements C0138a {

            /* renamed from: a */
            private final WeakReference<C0080a> f265a;

            C0082b(C0080a aVar) {
                this.f265a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo289a(String str, Bundle bundle) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f250c == null || VERSION.SDK_INT >= 23) {
                    aVar.mo278a(str, bundle);
                }
            }

            /* renamed from: b */
            public void mo291b(Object obj) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null && aVar.f250c == null) {
                    aVar.mo276a(PlaybackStateCompat.m807b(obj));
                }
            }

            /* renamed from: v */
            public void mo293v() {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null) {
                    aVar.mo281b();
                }
            }

            /* renamed from: a */
            public void mo288a(Object obj) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null) {
                    aVar.mo274a(MediaMetadataCompat.m187b(obj));
                }
            }

            /* renamed from: b */
            public void mo292b(List<?> list) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null) {
                    aVar.mo279a(QueueItem.m543a(list));
                }
            }

            /* renamed from: a */
            public void mo287a(CharSequence charSequence) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null) {
                    aVar.mo277a(charSequence);
                }
            }

            /* renamed from: b */
            public void mo290b(Bundle bundle) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null) {
                    aVar.mo272a(bundle);
                }
            }

            /* renamed from: a */
            public void mo286a(int i, int i2, int i3, int i4, int i5) {
                C0080a aVar = (C0080a) this.f265a.get();
                if (aVar != null) {
                    C0089g gVar = new C0089g(i, i2, i3, i4, i5);
                    aVar.mo275a(gVar);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0083c extends C0132a {

            /* renamed from: Z */
            private final WeakReference<C0080a> f266Z;

            C0083c(C0080a aVar) {
                this.f266Z = new WeakReference<>(aVar);
            }

            /* renamed from: E */
            public void mo294E() throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(13, null, null);
                }
            }

            /* renamed from: a */
            public void mo295a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: b */
            public void mo267b(List<QueueItem> list) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(5, list, null);
                }
            }

            /* renamed from: e */
            public void mo297e(boolean z) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(11, Boolean.valueOf(z), null);
                }
            }

            /* renamed from: f */
            public void mo298f(boolean z) throws RemoteException {
            }

            /* renamed from: g */
            public void mo299g(int i) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: i */
            public void mo300i(String str, Bundle bundle) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(1, str, bundle);
                }
            }

            /* renamed from: v */
            public void mo268v() throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(8, null, null);
                }
            }

            /* renamed from: a */
            public void mo263a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: b */
            public void mo266b(Bundle bundle) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(7, bundle, null);
                }
            }

            /* renamed from: e */
            public void mo296e(int i) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo265a(CharSequence charSequence) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(6, charSequence, null);
                }
            }

            /* renamed from: a */
            public void mo264a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0080a aVar = (C0080a) this.f266Z.get();
                if (aVar != null) {
                    aVar.mo271a(4, parcelableVolumeInfo != null ? new C0089g(parcelableVolumeInfo.f432a, parcelableVolumeInfo.f433b, parcelableVolumeInfo.f429N, parcelableVolumeInfo.f430O, parcelableVolumeInfo.f431P) : null, null);
                }
            }
        }

        public C0080a() {
            if (VERSION.SDK_INT >= 21) {
                this.f248a = C0137c.m964a((C0138a) new C0082b(this));
                return;
            }
            C0083c cVar = new C0083c(this);
            this.f250c = cVar;
            this.f248a = cVar;
        }

        @C0207n0({C0208a.LIBRARY})
        /* renamed from: a */
        public C0131a mo269a() {
            return this.f250c;
        }

        /* renamed from: a */
        public void mo270a(int i) {
        }

        /* renamed from: a */
        public void mo272a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo274a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo275a(C0089g gVar) {
        }

        /* renamed from: a */
        public void mo276a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo277a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo278a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo279a(List<QueueItem> list) {
        }

        /* renamed from: a */
        public void mo280a(boolean z) {
        }

        /* renamed from: b */
        public void mo281b() {
        }

        /* renamed from: b */
        public void mo282b(int i) {
        }

        public void binderDied() {
            mo271a(8, null, null);
        }

        /* renamed from: c */
        public void mo284c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo273a(Handler handler) {
            if (handler == null) {
                C0081a aVar = this.f249b;
                if (aVar != null) {
                    aVar.f263a = false;
                    aVar.removeCallbacksAndMessages(null);
                    this.f249b = null;
                    return;
                }
                return;
            }
            this.f249b = new C0081a(handler.getLooper());
            this.f249b.f263a = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo271a(int i, Object obj, Bundle bundle) {
            C0081a aVar = this.f249b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    private static class C0084b extends C0751a {

        /* renamed from: a */
        private final MediaControllerCompat f267a;

        C0084b(MediaControllerCompat mediaControllerCompat) {
            this.f267a = mediaControllerCompat;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MediaControllerCompat mo301a() {
            return this.f267a;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    interface C0085c {
        /* renamed from: a */
        C0089g mo236a();

        /* renamed from: a */
        void mo237a(int i, int i2);

        /* renamed from: a */
        void mo238a(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: a */
        void mo239a(MediaDescriptionCompat mediaDescriptionCompat, int i);

        /* renamed from: a */
        void mo240a(C0080a aVar);

        /* renamed from: a */
        void mo241a(C0080a aVar, Handler handler);

        /* renamed from: a */
        void mo242a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo243a(KeyEvent keyEvent);

        /* renamed from: b */
        void mo244b(int i, int i2);

        /* renamed from: b */
        void mo245b(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: b */
        boolean mo246b();

        /* renamed from: c */
        PendingIntent mo247c();

        /* renamed from: d */
        C0090h mo248d();

        /* renamed from: e */
        Object mo249e();

        Bundle getExtras();

        /* renamed from: j */
        MediaMetadataCompat mo252j();

        /* renamed from: k */
        long mo253k();

        /* renamed from: m */
        PlaybackStateCompat mo254m();

        /* renamed from: n */
        String mo255n();

        /* renamed from: p */
        int mo256p();

        /* renamed from: q */
        CharSequence mo257q();

        /* renamed from: r */
        int mo258r();

        /* renamed from: s */
        boolean mo259s();

        /* renamed from: t */
        List<QueueItem> mo260t();

        /* renamed from: u */
        int mo261u();
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0086d extends MediaControllerImplApi21 {
        public C0086d(Context context, Token token) throws RemoteException {
            super(context, token);
        }

        /* renamed from: d */
        public C0090h mo248d() {
            Object l = C0137c.m982l(this.f242a);
            if (l != null) {
                return new C0092j(l);
            }
            return null;
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0087e extends C0086d {
        public C0087e(Context context, Token token) throws RemoteException {
            super(context, token);
        }

        /* renamed from: d */
        public C0090h mo248d() {
            Object l = C0137c.m982l(this.f242a);
            if (l != null) {
                return new C0093k(l);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    static class C0088f implements C0085c {

        /* renamed from: a */
        private C0134b f268a;

        /* renamed from: b */
        private C0090h f269b;

        public C0088f(Token token) {
            this.f268a = C0135a.m914a((IBinder) token.mo374c());
        }

        /* renamed from: a */
        public void mo241a(C0080a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f268a.asBinder().linkToDeath(aVar, 0);
                    this.f268a.mo481a((C0131a) aVar.f248a);
                    aVar.mo271a(13, null, null);
                } catch (RemoteException unused) {
                    aVar.mo271a(8, null, null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: b */
        public void mo245b(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f268a.mo501k() & 4) != 0) {
                    this.f268a.mo488b(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public boolean mo246b() {
            return true;
        }

        /* renamed from: c */
        public PendingIntent mo247c() {
            try {
                return this.f268a.mo468C();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: d */
        public C0090h mo248d() {
            if (this.f269b == null) {
                this.f269b = new C0094l(this.f268a);
            }
            return this.f269b;
        }

        /* renamed from: e */
        public Object mo249e() {
            return null;
        }

        public Bundle getExtras() {
            try {
                return this.f268a.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: j */
        public MediaMetadataCompat mo252j() {
            try {
                return this.f268a.mo500j();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: k */
        public long mo253k() {
            try {
                return this.f268a.mo501k();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        /* renamed from: m */
        public PlaybackStateCompat mo254m() {
            try {
                return this.f268a.mo502m();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: n */
        public String mo255n() {
            try {
                return this.f268a.mo503n();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: p */
        public int mo256p() {
            try {
                return this.f268a.mo506p();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        /* renamed from: q */
        public CharSequence mo257q() {
            try {
                return this.f268a.mo508q();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: r */
        public int mo258r() {
            try {
                return this.f268a.mo509r();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        /* renamed from: s */
        public boolean mo259s() {
            try {
                return this.f268a.mo510s();
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: t */
        public List<QueueItem> mo260t() {
            try {
                return this.f268a.mo512t();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: u */
        public int mo261u() {
            try {
                return this.f268a.mo513u();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public void mo244b(int i, int i2) {
            try {
                this.f268a.mo474a(i, i2, (String) null);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo240a(C0080a aVar) {
            if (aVar != null) {
                try {
                    this.f268a.mo489b((C0131a) aVar.f248a);
                    this.f268a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException unused) {
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: a */
        public boolean mo243a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f268a.mo485a(keyEvent);
                } catch (RemoteException unused) {
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }

        /* renamed from: a */
        public void mo239a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.f268a.mo501k() & 4) != 0) {
                    this.f268a.mo478a(mediaDescriptionCompat, i);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo238a(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f268a.mo501k() & 4) != 0) {
                    this.f268a.mo477a(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public C0089g mo236a() {
            try {
                ParcelableVolumeInfo M = this.f268a.mo473M();
                C0089g gVar = new C0089g(M.f432a, M.f433b, M.f429N, M.f430O, M.f431P);
                return gVar;
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public void mo237a(int i, int i2) {
            try {
                this.f268a.mo486b(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo242a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f268a.mo483a(str, bundle, new ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    public static final class C0089g {

        /* renamed from: f */
        public static final int f270f = 1;

        /* renamed from: g */
        public static final int f271g = 2;

        /* renamed from: a */
        private final int f272a;

        /* renamed from: b */
        private final int f273b;

        /* renamed from: c */
        private final int f274c;

        /* renamed from: d */
        private final int f275d;

        /* renamed from: e */
        private final int f276e;

        C0089g(int i, int i2, int i3, int i4, int i5) {
            this.f272a = i;
            this.f273b = i2;
            this.f274c = i3;
            this.f275d = i4;
            this.f276e = i5;
        }

        /* renamed from: a */
        public int mo302a() {
            return this.f273b;
        }

        /* renamed from: b */
        public int mo303b() {
            return this.f276e;
        }

        /* renamed from: c */
        public int mo304c() {
            return this.f275d;
        }

        /* renamed from: d */
        public int mo305d() {
            return this.f272a;
        }

        /* renamed from: e */
        public int mo306e() {
            return this.f274c;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$h */
    public static abstract class C0090h {

        /* renamed from: a */
        public static final String f277a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        C0090h() {
        }

        /* renamed from: a */
        public abstract void mo307a();

        /* renamed from: a */
        public abstract void mo308a(int i);

        /* renamed from: a */
        public abstract void mo309a(long j);

        /* renamed from: a */
        public abstract void mo310a(Uri uri, Bundle bundle);

        /* renamed from: a */
        public abstract void mo311a(RatingCompat ratingCompat);

        /* renamed from: a */
        public abstract void mo312a(RatingCompat ratingCompat, Bundle bundle);

        /* renamed from: a */
        public abstract void mo313a(CustomAction customAction, Bundle bundle);

        /* renamed from: a */
        public abstract void mo314a(String str, Bundle bundle);

        /* renamed from: a */
        public abstract void mo315a(boolean z);

        /* renamed from: b */
        public abstract void mo316b();

        /* renamed from: b */
        public abstract void mo317b(int i);

        /* renamed from: b */
        public abstract void mo318b(long j);

        /* renamed from: b */
        public abstract void mo319b(Uri uri, Bundle bundle);

        /* renamed from: b */
        public abstract void mo320b(String str, Bundle bundle);

        /* renamed from: c */
        public abstract void mo321c();

        /* renamed from: c */
        public abstract void mo322c(String str, Bundle bundle);

        /* renamed from: d */
        public abstract void mo323d();

        /* renamed from: d */
        public abstract void mo324d(String str, Bundle bundle);

        /* renamed from: e */
        public abstract void mo325e();

        /* renamed from: e */
        public abstract void mo326e(String str, Bundle bundle);

        /* renamed from: f */
        public abstract void mo327f();

        /* renamed from: g */
        public abstract void mo328g();

        /* renamed from: h */
        public abstract void mo329h();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$i */
    static class C0091i extends C0090h {

        /* renamed from: b */
        protected final Object f278b;

        public C0091i(Object obj) {
            this.f278b = obj;
        }

        /* renamed from: a */
        public void mo309a(long j) {
            C0141d.m999a(this.f278b, j);
        }

        /* renamed from: b */
        public void mo319b(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f281B, uri);
            bundle2.putBundle(MediaSessionCompat.f283D, bundle);
            mo326e(MediaSessionCompat.f313u, bundle2);
        }

        /* renamed from: c */
        public void mo322c(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f318z, str);
            bundle2.putBundle(MediaSessionCompat.f283D, bundle);
            mo326e(MediaSessionCompat.f311s, bundle2);
        }

        /* renamed from: d */
        public void mo323d() {
            mo326e(MediaSessionCompat.f310r, null);
        }

        /* renamed from: e */
        public void mo325e() {
            C0141d.m1007d(this.f278b);
        }

        /* renamed from: f */
        public void mo327f() {
            C0141d.m1008e(this.f278b);
        }

        /* renamed from: g */
        public void mo328g() {
            C0141d.m1009f(this.f278b);
        }

        /* renamed from: h */
        public void mo329h() {
            C0141d.m1010g(this.f278b);
        }

        /* renamed from: a */
        public void mo307a() {
            C0141d.m998a(this.f278b);
        }

        /* renamed from: d */
        public void mo324d(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f280A, str);
            bundle2.putBundle(MediaSessionCompat.f283D, bundle);
            mo326e(MediaSessionCompat.f312t, bundle2);
        }

        /* renamed from: e */
        public void mo326e(String str, Bundle bundle) {
            MediaControllerCompat.m284a(str, bundle);
            C0141d.m1006c(this.f278b, str, bundle);
        }

        /* renamed from: a */
        public void mo311a(RatingCompat ratingCompat) {
            C0141d.m1000a(this.f278b, ratingCompat != null ? ratingCompat.mo187b() : null);
        }

        /* renamed from: b */
        public void mo316b() {
            C0141d.m1002b(this.f278b);
        }

        /* renamed from: c */
        public void mo321c() {
            C0141d.m1005c(this.f278b);
        }

        /* renamed from: a */
        public void mo312a(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f282C, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.f283D, bundle);
            mo326e(MediaSessionCompat.f317y, bundle2);
        }

        /* renamed from: b */
        public void mo317b(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f286G, i);
            mo326e(MediaSessionCompat.f316x, bundle);
        }

        /* renamed from: b */
        public void mo320b(String str, Bundle bundle) {
            C0141d.m1004b(this.f278b, str, bundle);
        }

        /* renamed from: a */
        public void mo315a(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.f284E, z);
            mo326e(MediaSessionCompat.f314v, bundle);
        }

        /* renamed from: b */
        public void mo318b(long j) {
            C0141d.m1003b(this.f278b, j);
        }

        /* renamed from: a */
        public void mo308a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f285F, i);
            mo326e(MediaSessionCompat.f315w, bundle);
        }

        /* renamed from: a */
        public void mo314a(String str, Bundle bundle) {
            C0141d.m1001a(this.f278b, str, bundle);
        }

        /* renamed from: a */
        public void mo310a(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f281B, uri);
            bundle2.putBundle(MediaSessionCompat.f283D, bundle);
            mo326e(MediaSessionCompat.f309q, bundle2);
        }

        /* renamed from: a */
        public void mo313a(CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.m284a(customAction.mo550a(), bundle);
            C0141d.m1006c(this.f278b, customAction.mo550a(), bundle);
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$j */
    static class C0092j extends C0091i {
        public C0092j(Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public void mo310a(Uri uri, Bundle bundle) {
            C0143a.m1011a(this.f278b, uri, bundle);
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$k */
    static class C0093k extends C0092j {
        public C0093k(Object obj) {
            super(obj);
        }

        /* renamed from: b */
        public void mo319b(Uri uri, Bundle bundle) {
            C0145a.m1013a(this.f278b, uri, bundle);
        }

        /* renamed from: c */
        public void mo322c(String str, Bundle bundle) {
            C0145a.m1014a(this.f278b, str, bundle);
        }

        /* renamed from: d */
        public void mo323d() {
            C0145a.m1012a(this.f278b);
        }

        /* renamed from: d */
        public void mo324d(String str, Bundle bundle) {
            C0145a.m1015b(this.f278b, str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$l */
    static class C0094l extends C0090h {

        /* renamed from: b */
        private C0134b f279b;

        public C0094l(C0134b bVar) {
            this.f279b = bVar;
        }

        /* renamed from: a */
        public void mo314a(String str, Bundle bundle) {
            try {
                this.f279b.mo495e(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo319b(Uri uri, Bundle bundle) {
            try {
                this.f279b.mo476a(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: c */
        public void mo322c(String str, Bundle bundle) {
            try {
                this.f279b.mo493c(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: d */
        public void mo323d() {
            try {
                this.f279b.mo469D();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: e */
        public void mo325e() {
            try {
                this.f279b.mo472K();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: f */
        public void mo327f() {
            try {
                this.f279b.next();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: g */
        public void mo328g() {
            try {
                this.f279b.previous();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: h */
        public void mo329h() {
            try {
                this.f279b.stop();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo310a(Uri uri, Bundle bundle) {
            try {
                this.f279b.mo487b(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo320b(String str, Bundle bundle) {
            try {
                this.f279b.mo497f(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: c */
        public void mo321c() {
            try {
                this.f279b.mo471J();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: d */
        public void mo324d(String str, Bundle bundle) {
            try {
                this.f279b.mo490b(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: e */
        public void mo326e(String str, Bundle bundle) {
            MediaControllerCompat.m284a(str, bundle);
            try {
                this.f279b.mo482a(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo309a(long j) {
            try {
                this.f279b.mo475a(j);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo318b(long j) {
            try {
                this.f279b.mo492c(j);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo307a() {
            try {
                this.f279b.mo470F();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo316b() {
            try {
                this.f279b.mo505o();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo311a(RatingCompat ratingCompat) {
            try {
                this.f279b.mo479a(ratingCompat);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo317b(int i) {
            try {
                this.f279b.mo494d(i);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo312a(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f279b.mo480a(ratingCompat, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo315a(boolean z) {
            try {
                this.f279b.mo484a(z);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo308a(int i) {
            try {
                this.f279b.mo491c(i);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo313a(CustomAction customAction, Bundle bundle) {
            mo326e(customAction.mo550a(), bundle);
        }
    }

    public MediaControllerCompat(Context context, @C0193h0 MediaSessionCompat mediaSessionCompat) {
        C0085c mediaControllerImplApi21;
        if (mediaSessionCompat != null) {
            this.f240b = mediaSessionCompat.mo355f();
            C0085c cVar = null;
            try {
                if (VERSION.SDK_INT >= 24) {
                    mediaControllerImplApi21 = new C0087e(context, this.f240b);
                } else if (VERSION.SDK_INT >= 23) {
                    mediaControllerImplApi21 = new C0086d(context, this.f240b);
                } else if (VERSION.SDK_INT >= 21) {
                    mediaControllerImplApi21 = new MediaControllerImplApi21(context, this.f240b);
                } else {
                    cVar = new C0088f(this.f240b);
                    this.f239a = cVar;
                    return;
                }
                cVar = mediaControllerImplApi21;
            } catch (RemoteException unused) {
            }
            this.f239a = cVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* renamed from: a */
    public static void m283a(@C0193h0 Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof C0750j) {
            ((C0750j) activity).putExtraData(new C0084b(mediaControllerCompat));
        }
        if (VERSION.SDK_INT >= 21) {
            Object obj = null;
            if (mediaControllerCompat != null) {
                obj = C0137c.m963a((Context) activity, mediaControllerCompat.mo230m().mo374c());
            }
            C0137c.m965a(activity, obj);
        }
    }

    /* renamed from: b */
    public void mo218b(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f239a.mo238a(mediaDescriptionCompat);
    }

    /* renamed from: c */
    public Object mo220c() {
        return this.f239a.mo249e();
    }

    /* renamed from: d */
    public MediaMetadataCompat mo221d() {
        return this.f239a.mo252j();
    }

    /* renamed from: e */
    public String mo222e() {
        return this.f239a.mo255n();
    }

    /* renamed from: f */
    public C0089g mo223f() {
        return this.f239a.mo236a();
    }

    /* renamed from: g */
    public PlaybackStateCompat mo224g() {
        return this.f239a.mo254m();
    }

    /* renamed from: h */
    public List<QueueItem> mo225h() {
        return this.f239a.mo260t();
    }

    /* renamed from: i */
    public CharSequence mo226i() {
        return this.f239a.mo257q();
    }

    /* renamed from: j */
    public int mo227j() {
        return this.f239a.mo256p();
    }

    /* renamed from: k */
    public int mo228k() {
        return this.f239a.mo261u();
    }

    /* renamed from: l */
    public PendingIntent mo229l() {
        return this.f239a.mo247c();
    }

    /* renamed from: m */
    public Token mo230m() {
        return this.f240b;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0195i0
    /* renamed from: n */
    public Bundle mo231n() {
        return this.f240b.mo373b();
    }

    /* renamed from: o */
    public int mo232o() {
        return this.f239a.mo258r();
    }

    /* renamed from: p */
    public C0090h mo233p() {
        return this.f239a.mo248d();
    }

    /* renamed from: q */
    public boolean mo234q() {
        return this.f239a.mo259s();
    }

    /* renamed from: r */
    public boolean mo235r() {
        return this.f239a.mo246b();
    }

    /* renamed from: b */
    public long mo216b() {
        return this.f239a.mo253k();
    }

    /* renamed from: b */
    public void mo217b(int i, int i2) {
        this.f239a.mo244b(i, i2);
    }

    /* renamed from: b */
    public void mo219b(@C0193h0 C0080a aVar) {
        if (aVar != null) {
            try {
                this.f241c.remove(aVar);
                this.f239a.mo240a(aVar);
            } finally {
                aVar.mo273a((Handler) null);
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    /* renamed from: a */
    public static MediaControllerCompat m282a(@C0193h0 Activity activity) {
        MediaControllerCompat mediaControllerCompat = null;
        if (activity instanceof C0750j) {
            C0084b bVar = (C0084b) ((C0750j) activity).getExtraData(C0084b.class);
            if (bVar != null) {
                mediaControllerCompat = bVar.mo301a();
            }
            return mediaControllerCompat;
        }
        if (VERSION.SDK_INT >= 21) {
            Object a = C0137c.m962a(activity);
            if (a == null) {
                return null;
            }
            try {
                return new MediaControllerCompat((Context) activity, Token.m550b(C0137c.m981k(a)));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public MediaControllerCompat(Context context, @C0193h0 Token token) throws RemoteException {
        if (token != null) {
            this.f240b = token;
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                this.f239a = new C0087e(context, token);
            } else if (i >= 23) {
                this.f239a = new C0086d(context, token);
            } else if (i >= 21) {
                this.f239a = new MediaControllerImplApi21(context, token);
            } else {
                this.f239a = new C0088f(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    /* renamed from: a */
    static void m284a(String str, Bundle bundle) {
        if (str != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1348483723) {
                if (hashCode == 503011406 && str.equals(MediaSessionCompat.f303k)) {
                    c = 1;
                }
            } else if (str.equals(MediaSessionCompat.f302j)) {
                c = 0;
            }
            if ((c == 0 || c == 1) && (bundle == null || !bundle.containsKey(MediaSessionCompat.f304l))) {
                StringBuilder sb = new StringBuilder();
                sb.append("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ");
                sb.append(str);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public boolean mo215a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f239a.mo243a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: a */
    public void mo210a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f239a.mo245b(mediaDescriptionCompat);
    }

    /* renamed from: a */
    public void mo211a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.f239a.mo239a(mediaDescriptionCompat, i);
    }

    @Deprecated
    /* renamed from: a */
    public void mo208a(int i) {
        List h = mo225h();
        if (h != null && i >= 0 && i < h.size()) {
            QueueItem queueItem = (QueueItem) h.get(i);
            if (queueItem != null) {
                mo218b(queueItem.mo358a());
            }
        }
    }

    /* renamed from: a */
    public Bundle mo207a() {
        return this.f239a.getExtras();
    }

    /* renamed from: a */
    public void mo209a(int i, int i2) {
        this.f239a.mo237a(i, i2);
    }

    /* renamed from: a */
    public void mo212a(@C0193h0 C0080a aVar) {
        mo213a(aVar, (Handler) null);
    }

    /* renamed from: a */
    public void mo213a(@C0193h0 C0080a aVar, Handler handler) {
        if (aVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.mo273a(handler);
            this.f239a.mo241a(aVar, handler);
            this.f241c.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* renamed from: a */
    public void mo214a(@C0193h0 String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.f239a.mo242a(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }
}

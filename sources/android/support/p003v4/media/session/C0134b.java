package android.support.p003v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p003v4.media.MediaDescriptionCompat;
import android.support.p003v4.media.MediaMetadataCompat;
import android.support.p003v4.media.RatingCompat;
import android.support.p003v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p003v4.media.session.MediaSessionCompat.ResultReceiverWrapper;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: IMediaSession */
public interface C0134b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0135a extends Binder implements C0134b {

        /* renamed from: A0 */
        static final int f539A0 = 23;

        /* renamed from: B0 */
        static final int f540B0 = 24;

        /* renamed from: C0 */
        static final int f541C0 = 25;

        /* renamed from: D0 */
        static final int f542D0 = 51;

        /* renamed from: E0 */
        static final int f543E0 = 46;

        /* renamed from: F0 */
        static final int f544F0 = 39;

        /* renamed from: G0 */
        static final int f545G0 = 40;

        /* renamed from: H0 */
        static final int f546H0 = 48;

        /* renamed from: I0 */
        static final int f547I0 = 26;

        /* renamed from: N */
        static final int f548N = 2;

        /* renamed from: O */
        static final int f549O = 3;

        /* renamed from: P */
        static final int f550P = 4;

        /* renamed from: Q */
        static final int f551Q = 5;

        /* renamed from: R */
        static final int f552R = 6;

        /* renamed from: S */
        static final int f553S = 7;

        /* renamed from: T */
        static final int f554T = 8;

        /* renamed from: U */
        static final int f555U = 9;

        /* renamed from: V */
        static final int f556V = 10;

        /* renamed from: W */
        static final int f557W = 11;

        /* renamed from: X */
        static final int f558X = 12;

        /* renamed from: Y */
        static final int f559Y = 27;

        /* renamed from: Z */
        static final int f560Z = 28;

        /* renamed from: a */
        private static final String f561a = "android.support.v4.media.session.IMediaSession";

        /* renamed from: a0 */
        static final int f562a0 = 29;

        /* renamed from: b */
        static final int f563b = 1;

        /* renamed from: b0 */
        static final int f564b0 = 30;

        /* renamed from: c0 */
        static final int f565c0 = 31;

        /* renamed from: d0 */
        static final int f566d0 = 32;

        /* renamed from: e0 */
        static final int f567e0 = 45;

        /* renamed from: f0 */
        static final int f568f0 = 37;

        /* renamed from: g0 */
        static final int f569g0 = 38;

        /* renamed from: h0 */
        static final int f570h0 = 47;

        /* renamed from: i0 */
        static final int f571i0 = 41;

        /* renamed from: j0 */
        static final int f572j0 = 42;

        /* renamed from: k0 */
        static final int f573k0 = 43;

        /* renamed from: l0 */
        static final int f574l0 = 44;

        /* renamed from: m0 */
        static final int f575m0 = 33;

        /* renamed from: n0 */
        static final int f576n0 = 34;

        /* renamed from: o0 */
        static final int f577o0 = 35;

        /* renamed from: p0 */
        static final int f578p0 = 36;

        /* renamed from: q0 */
        static final int f579q0 = 13;

        /* renamed from: r0 */
        static final int f580r0 = 14;

        /* renamed from: s0 */
        static final int f581s0 = 15;

        /* renamed from: t0 */
        static final int f582t0 = 16;

        /* renamed from: u0 */
        static final int f583u0 = 17;

        /* renamed from: v0 */
        static final int f584v0 = 18;

        /* renamed from: w0 */
        static final int f585w0 = 19;

        /* renamed from: x0 */
        static final int f586x0 = 20;

        /* renamed from: y0 */
        static final int f587y0 = 21;

        /* renamed from: z0 */
        static final int f588z0 = 22;

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        private static class C0136a implements C0134b {

            /* renamed from: a */
            private IBinder f589a;

            C0136a(IBinder iBinder) {
                this.f589a = iBinder;
            }

            /* renamed from: B */
            public boolean mo467B() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    boolean z = false;
                    this.f589a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C */
            public PendingIntent mo468C() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public void mo469D() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: F */
            public void mo470F() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: J */
            public void mo471J() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: K */
            public void mo472K() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: M */
            public ParcelableVolumeInfo mo473M() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public String mo581a() {
                return C0135a.f561a;
            }

            /* renamed from: a */
            public void mo483a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f589a;
            }

            /* renamed from: b */
            public void mo489b(C0131a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f589a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo493c(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo494d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(i);
                    this.f589a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo495e(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo496f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(i);
                    this.f589a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo498g(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(z ? 1 : 0);
                    this.f589a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getExtras() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public MediaMetadataCompat mo500j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public long mo501k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public PlaybackStateCompat mo502m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public String mo503n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo505o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public int mo506p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public CharSequence mo508q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public int mo509r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public boolean mo510s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    boolean z = false;
                    this.f589a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public List<QueueItem> mo512t() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public int mo513u() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: y */
            public String mo514y() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    this.f589a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: z */
            public boolean mo515z() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    boolean z = false;
                    this.f589a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo486b(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f589a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo497f(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo492c(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeLong(j);
                    this.f589a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo485a(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo488b(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo491c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(i);
                    this.f589a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo481a(C0131a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f589a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo490b(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo474a(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f589a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo487b(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo478a(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f589a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo477a(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo476a(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo475a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeLong(j);
                    this.f589a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo479a(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo480a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo484a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeInt(z ? 1 : 0);
                    this.f589a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo482a(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0135a.f561a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f589a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0135a() {
            attachInterface(this, f561a);
        }

        /* renamed from: a */
        public static C0134b m914a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f561a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0134b)) {
                return new C0136a(iBinder);
            }
            return (C0134b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v4, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper] */
        /* JADX WARNING: type inference failed for: r1v6, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper] */
        /* JADX WARNING: type inference failed for: r1v7, types: [android.view.KeyEvent] */
        /* JADX WARNING: type inference failed for: r1v9, types: [android.view.KeyEvent] */
        /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v13, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v15, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v16, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v18, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v19, types: [android.support.v4.media.RatingCompat] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v4.media.RatingCompat] */
        /* JADX WARNING: type inference failed for: r1v22, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v24, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v25, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v27, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v28, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v30, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v31, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v33, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v34, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v36, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v37, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v39, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v40, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v42, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v43 */
        /* JADX WARNING: type inference failed for: r1v44 */
        /* JADX WARNING: type inference failed for: r1v45 */
        /* JADX WARNING: type inference failed for: r1v46 */
        /* JADX WARNING: type inference failed for: r1v47 */
        /* JADX WARNING: type inference failed for: r1v48 */
        /* JADX WARNING: type inference failed for: r1v49 */
        /* JADX WARNING: type inference failed for: r1v50 */
        /* JADX WARNING: type inference failed for: r1v51 */
        /* JADX WARNING: type inference failed for: r1v52 */
        /* JADX WARNING: type inference failed for: r1v53 */
        /* JADX WARNING: type inference failed for: r1v54 */
        /* JADX WARNING: type inference failed for: r1v55 */
        /* JADX WARNING: type inference failed for: r1v56 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, android.os.Bundle, android.view.KeyEvent, android.support.v4.media.RatingCompat, android.support.v4.media.MediaDescriptionCompat]
          uses: [android.os.Bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, android.view.KeyEvent, android.support.v4.media.RatingCompat, android.support.v4.media.MediaDescriptionCompat]
          mth insns count: 391
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
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 15 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 51
                r1 = 0
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                r3 = 1
                if (r5 == r0) goto L_0x03cd
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x03c9
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x039c;
                    case 2: goto L_0x037f;
                    case 3: goto L_0x036d;
                    case 4: goto L_0x035b;
                    case 5: goto L_0x034d;
                    case 6: goto L_0x033f;
                    case 7: goto L_0x0331;
                    case 8: goto L_0x031a;
                    case 9: goto L_0x030c;
                    case 10: goto L_0x02f5;
                    case 11: goto L_0x02df;
                    case 12: goto L_0x02c9;
                    case 13: goto L_0x02bf;
                    case 14: goto L_0x02a2;
                    case 15: goto L_0x0285;
                    case 16: goto L_0x025c;
                    case 17: goto L_0x024e;
                    case 18: goto L_0x0244;
                    case 19: goto L_0x023a;
                    case 20: goto L_0x0230;
                    case 21: goto L_0x0226;
                    case 22: goto L_0x021c;
                    case 23: goto L_0x0212;
                    case 24: goto L_0x0204;
                    case 25: goto L_0x01eb;
                    case 26: goto L_0x01ce;
                    case 27: goto L_0x01b7;
                    case 28: goto L_0x01a0;
                    case 29: goto L_0x0192;
                    case 30: goto L_0x017b;
                    case 31: goto L_0x0164;
                    case 32: goto L_0x0156;
                    case 33: goto L_0x014c;
                    case 34: goto L_0x012f;
                    case 35: goto L_0x0112;
                    case 36: goto L_0x00e9;
                    case 37: goto L_0x00db;
                    case 38: goto L_0x00cd;
                    case 39: goto L_0x00bf;
                    case 40: goto L_0x00ae;
                    case 41: goto L_0x0095;
                    case 42: goto L_0x0078;
                    case 43: goto L_0x005f;
                    case 44: goto L_0x0051;
                    case 45: goto L_0x0043;
                    case 46: goto L_0x0032;
                    case 47: goto L_0x0024;
                    case 48: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0016:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo494d(r5)
                r7.writeNoException()
                return r3
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r4.mo509r()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.mo484a(r0)
                r7.writeNoException()
                return r3
            L_0x0043:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo510s()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0051:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo496f(r5)
                r7.writeNoException()
                return r3
            L_0x005f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0071
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p003v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p003v4.media.MediaDescriptionCompat) r1
            L_0x0071:
                r4.mo477a(r1)
                r7.writeNoException()
                return r3
            L_0x0078:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x008a
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p003v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p003v4.media.MediaDescriptionCompat) r1
            L_0x008a:
                int r5 = r6.readInt()
                r4.mo478a(r1, r5)
                r7.writeNoException()
                return r3
            L_0x0095:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00a7
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p003v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p003v4.media.MediaDescriptionCompat) r1
            L_0x00a7:
                r4.mo488b(r1)
                r7.writeNoException()
                return r3
            L_0x00ae:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00b8
                r0 = 1
            L_0x00b8:
                r4.mo498g(r0)
                r7.writeNoException()
                return r3
            L_0x00bf:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo491c(r5)
                r7.writeNoException()
                return r3
            L_0x00cd:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo515z()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x00db:
                r6.enforceInterface(r2)
                int r5 = r4.mo513u()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x00e9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x00fc
            L_0x00fb:
                r5 = r1
            L_0x00fc:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x010b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x010b:
                r4.mo476a(r5, r1)
                r7.writeNoException()
                return r3
            L_0x0112:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0128
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0128:
                r4.mo490b(r5, r1)
                r7.writeNoException()
                return r3
            L_0x012f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0145:
                r4.mo493c(r5, r1)
                r7.writeNoException()
                return r3
            L_0x014c:
                r6.enforceInterface(r2)
                r4.mo469D()
                r7.writeNoException()
                return r3
            L_0x0156:
                r6.enforceInterface(r2)
                int r5 = r4.mo506p()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0164:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0177
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x017a
            L_0x0177:
                r7.writeInt(r0)
            L_0x017a:
                return r3
            L_0x017b:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.mo508q()
                r7.writeNoException()
                if (r5 == 0) goto L_0x018e
                r7.writeInt(r3)
                android.text.TextUtils.writeToParcel(r5, r7, r3)
                goto L_0x0191
            L_0x018e:
                r7.writeInt(r0)
            L_0x0191:
                return r3
            L_0x0192:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.mo512t()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r3
            L_0x01a0:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.mo502m()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01b3
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x01b6
            L_0x01b3:
                r7.writeInt(r0)
            L_0x01b6:
                return r3
            L_0x01b7:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.mo500j()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01ca
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x01cd
            L_0x01ca:
                r7.writeInt(r0)
            L_0x01cd:
                return r3
            L_0x01ce:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01e4
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x01e4:
                r4.mo482a(r5, r1)
                r7.writeNoException()
                return r3
            L_0x01eb:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01fd
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p003v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.RatingCompat r1 = (android.support.p003v4.media.RatingCompat) r1
            L_0x01fd:
                r4.mo479a(r1)
                r7.writeNoException()
                return r3
            L_0x0204:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo475a(r5)
                r7.writeNoException()
                return r3
            L_0x0212:
                r6.enforceInterface(r2)
                r4.mo472K()
                r7.writeNoException()
                return r3
            L_0x021c:
                r6.enforceInterface(r2)
                r4.mo470F()
                r7.writeNoException()
                return r3
            L_0x0226:
                r6.enforceInterface(r2)
                r4.previous()
                r7.writeNoException()
                return r3
            L_0x0230:
                r6.enforceInterface(r2)
                r4.next()
                r7.writeNoException()
                return r3
            L_0x023a:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r3
            L_0x0244:
                r6.enforceInterface(r2)
                r4.mo505o()
                r7.writeNoException()
                return r3
            L_0x024e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo492c(r5)
                r7.writeNoException()
                return r3
            L_0x025c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x026e
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x026f
            L_0x026e:
                r5 = r1
            L_0x026f:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x027e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x027e:
                r4.mo487b(r5, r1)
                r7.writeNoException()
                return r3
            L_0x0285:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x029b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x029b:
                r4.mo497f(r5, r1)
                r7.writeNoException()
                return r3
            L_0x02a2:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02b8:
                r4.mo495e(r5, r1)
                r7.writeNoException()
                return r3
            L_0x02bf:
                r6.enforceInterface(r2)
                r4.mo471J()
                r7.writeNoException()
                return r3
            L_0x02c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo474a(r5, r8, r6)
                r7.writeNoException()
                return r3
            L_0x02df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo486b(r5, r8, r6)
                r7.writeNoException()
                return r3
            L_0x02f5:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.mo473M()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0308
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x030b
            L_0x0308:
                r7.writeInt(r0)
            L_0x030b:
                return r3
            L_0x030c:
                r6.enforceInterface(r2)
                long r5 = r4.mo501k()
                r7.writeNoException()
                r7.writeLong(r5)
                return r3
            L_0x031a:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.mo468C()
                r7.writeNoException()
                if (r5 == 0) goto L_0x032d
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x0330
            L_0x032d:
                r7.writeInt(r0)
            L_0x0330:
                return r3
            L_0x0331:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo514y()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L_0x033f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo503n()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L_0x034d:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo467B()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x035b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p003v4.media.session.C0131a.C0132a.m854a(r5)
                r4.mo489b(r5)
                r7.writeNoException()
                return r3
            L_0x036d:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p003v4.media.session.C0131a.C0132a.m854a(r5)
                r4.mo481a(r5)
                r7.writeNoException()
                return r3
            L_0x037f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0391
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            L_0x0391:
                boolean r5 = r4.mo485a(r1)
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x039c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03b3
            L_0x03b2:
                r8 = r1
            L_0x03b3:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x03c2
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p003v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = (android.support.p003v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1
            L_0x03c2:
                r4.mo483a(r5, r8, r1)
                r7.writeNoException()
                return r3
            L_0x03c9:
                r7.writeString(r2)
                return r3
            L_0x03cd:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03df
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p003v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.p003v4.media.RatingCompat) r5
                goto L_0x03e0
            L_0x03df:
                r5 = r1
            L_0x03e0:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03ef
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x03ef:
                r4.mo480a(r5, r1)
                r7.writeNoException()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p003v4.media.session.C0134b.C0135a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: B */
    boolean mo467B() throws RemoteException;

    /* renamed from: C */
    PendingIntent mo468C() throws RemoteException;

    /* renamed from: D */
    void mo469D() throws RemoteException;

    /* renamed from: F */
    void mo470F() throws RemoteException;

    /* renamed from: J */
    void mo471J() throws RemoteException;

    /* renamed from: K */
    void mo472K() throws RemoteException;

    /* renamed from: M */
    ParcelableVolumeInfo mo473M() throws RemoteException;

    /* renamed from: a */
    void mo474a(int i, int i2, String str) throws RemoteException;

    /* renamed from: a */
    void mo475a(long j) throws RemoteException;

    /* renamed from: a */
    void mo476a(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo477a(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: a */
    void mo478a(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* renamed from: a */
    void mo479a(RatingCompat ratingCompat) throws RemoteException;

    /* renamed from: a */
    void mo480a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo481a(C0131a aVar) throws RemoteException;

    /* renamed from: a */
    void mo482a(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo483a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* renamed from: a */
    void mo484a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo485a(KeyEvent keyEvent) throws RemoteException;

    /* renamed from: b */
    void mo486b(int i, int i2, String str) throws RemoteException;

    /* renamed from: b */
    void mo487b(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo488b(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: b */
    void mo489b(C0131a aVar) throws RemoteException;

    /* renamed from: b */
    void mo490b(String str, Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo491c(int i) throws RemoteException;

    /* renamed from: c */
    void mo492c(long j) throws RemoteException;

    /* renamed from: c */
    void mo493c(String str, Bundle bundle) throws RemoteException;

    /* renamed from: d */
    void mo494d(int i) throws RemoteException;

    /* renamed from: e */
    void mo495e(String str, Bundle bundle) throws RemoteException;

    /* renamed from: f */
    void mo496f(int i) throws RemoteException;

    /* renamed from: f */
    void mo497f(String str, Bundle bundle) throws RemoteException;

    /* renamed from: g */
    void mo498g(boolean z) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    /* renamed from: j */
    MediaMetadataCompat mo500j() throws RemoteException;

    /* renamed from: k */
    long mo501k() throws RemoteException;

    /* renamed from: m */
    PlaybackStateCompat mo502m() throws RemoteException;

    /* renamed from: n */
    String mo503n() throws RemoteException;

    void next() throws RemoteException;

    /* renamed from: o */
    void mo505o() throws RemoteException;

    /* renamed from: p */
    int mo506p() throws RemoteException;

    void previous() throws RemoteException;

    /* renamed from: q */
    CharSequence mo508q() throws RemoteException;

    /* renamed from: r */
    int mo509r() throws RemoteException;

    /* renamed from: s */
    boolean mo510s() throws RemoteException;

    void stop() throws RemoteException;

    /* renamed from: t */
    List<QueueItem> mo512t() throws RemoteException;

    /* renamed from: u */
    int mo513u() throws RemoteException;

    /* renamed from: y */
    String mo514y() throws RemoteException;

    /* renamed from: z */
    boolean mo515z() throws RemoteException;
}

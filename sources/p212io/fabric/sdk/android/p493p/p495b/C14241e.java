package p212io.fabric.sdk.android.p493p.p495b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p212io.fabric.sdk.android.C14215d;

/* renamed from: io.fabric.sdk.android.p.b.e */
/* compiled from: AdvertisingInfoServiceStrategy */
class C14241e implements C14245f {

    /* renamed from: b */
    private static final String f41998b = "com.android.vending";

    /* renamed from: c */
    public static final String f41999c = "com.google.android.gms.ads.identifier.service.START";

    /* renamed from: d */
    public static final String f42000d = "com.google.android.gms";

    /* renamed from: a */
    private final Context f42001a;

    /* renamed from: io.fabric.sdk.android.p.b.e$b */
    /* compiled from: AdvertisingInfoServiceStrategy */
    private static final class C14243b implements ServiceConnection {

        /* renamed from: c */
        private static final int f42002c = 200;

        /* renamed from: a */
        private boolean f42003a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f42004b;

        private C14243b() {
            this.f42003a = false;
            this.f42004b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo45128a() {
            if (this.f42003a) {
                C14215d.m61672j().mo45044e(C14215d.f41919m, "getBinder already called");
            }
            this.f42003a = true;
            try {
                return (IBinder) this.f42004b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f42004b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f42004b.clear();
        }
    }

    /* renamed from: io.fabric.sdk.android.p.b.e$c */
    /* compiled from: AdvertisingInfoServiceStrategy */
    private static final class C14244c implements IInterface {

        /* renamed from: N */
        private static final int f42005N = 1;

        /* renamed from: O */
        private static final int f42006O = 2;

        /* renamed from: P */
        public static final String f42007P = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

        /* renamed from: b */
        private static final int f42008b = 0;

        /* renamed from: a */
        private final IBinder f42009a;

        public C14244c(IBinder iBinder) {
            this.f42009a = iBinder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            p212io.fabric.sdk.android.C14215d.m61672j().mo45042d(p212io.fabric.sdk.android.C14215d.f41919m, "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* renamed from: G0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo45131G0() throws android.os.RemoteException {
            /*
                r6 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x0025 }
                r3 = 1
                r0.writeInt(r3)     // Catch:{ Exception -> 0x0025 }
                android.os.IBinder r4 = r6.f42009a     // Catch:{ Exception -> 0x0025 }
                r5 = 2
                r4.transact(r5, r0, r1, r2)     // Catch:{ Exception -> 0x0025 }
                r1.readException()     // Catch:{ Exception -> 0x0025 }
                int r4 = r1.readInt()     // Catch:{ Exception -> 0x0025 }
                if (r4 == 0) goto L_0x0030
                r2 = 1
                goto L_0x0030
            L_0x0023:
                r2 = move-exception
                goto L_0x0037
            L_0x0025:
                io.fabric.sdk.android.l r3 = p212io.fabric.sdk.android.C14215d.m61672j()     // Catch:{ all -> 0x0023 }
                java.lang.String r4 = "Fabric"
                java.lang.String r5 = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking"
                r3.mo45042d(r4, r5)     // Catch:{ all -> 0x0023 }
            L_0x0030:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.fabric.sdk.android.p493p.p495b.C14241e.C14244c.mo45131G0():boolean");
        }

        public IBinder asBinder() {
            return this.f42009a;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            p212io.fabric.sdk.android.C14215d.m61672j().mo45042d(p212io.fabric.sdk.android.C14215d.f41919m, "Could not get parcel from Google Play Service to capture AdvertisingId");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getId() throws android.os.RemoteException {
            /*
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch:{ Exception -> 0x0024 }
                android.os.IBinder r2 = r5.f42009a     // Catch:{ Exception -> 0x0024 }
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch:{ Exception -> 0x0024 }
                r1.readException()     // Catch:{ Exception -> 0x0024 }
                java.lang.String r2 = r1.readString()     // Catch:{ Exception -> 0x0024 }
                r1.recycle()
                r0.recycle()
                goto L_0x0036
            L_0x0022:
                r2 = move-exception
                goto L_0x0037
            L_0x0024:
                io.fabric.sdk.android.l r2 = p212io.fabric.sdk.android.C14215d.m61672j()     // Catch:{ all -> 0x0022 }
                java.lang.String r3 = "Fabric"
                java.lang.String r4 = "Could not get parcel from Google Play Service to capture AdvertisingId"
                r2.mo45042d(r3, r4)     // Catch:{ all -> 0x0022 }
                r1.recycle()
                r0.recycle()
                r2 = 0
            L_0x0036:
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.fabric.sdk.android.p493p.p495b.C14241e.C14244c.getId():java.lang.String");
        }
    }

    public C14241e(Context context) {
        this.f42001a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C14237b mo45126a() {
        String str = "Could not bind to Google Play Service to capture AdvertisingId";
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        String str2 = C14215d.f41919m;
        if (myLooper == mainLooper) {
            C14215d.m61672j().mo45042d(str2, "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.f42001a.getPackageManager().getPackageInfo("com.android.vending", 0);
            C14243b bVar = new C14243b();
            Intent intent = new Intent(f41999c);
            intent.setPackage("com.google.android.gms");
            try {
                if (this.f42001a.bindService(intent, bVar, 1)) {
                    try {
                        C14244c cVar = new C14244c(bVar.mo45128a());
                        C14237b bVar2 = new C14237b(cVar.getId(), cVar.mo45131G0());
                        this.f42001a.unbindService(bVar);
                        return bVar2;
                    } catch (Exception e) {
                        C14215d.m61672j().mo45052w(str2, "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        this.f42001a.unbindService(bVar);
                    }
                } else {
                    C14215d.m61672j().mo45042d(str2, str);
                    return null;
                }
            } catch (Throwable th) {
                C14215d.m61672j().mo45043d(str2, str, th);
            }
        } catch (NameNotFoundException unused) {
            C14215d.m61672j().mo45042d(str2, "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            C14215d.m61672j().mo45043d(str2, "Unable to determine if Google Play Services is available", e2);
            return null;
        }
    }
}

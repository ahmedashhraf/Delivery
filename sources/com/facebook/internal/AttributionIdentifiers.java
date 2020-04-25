package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0195i0;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class AttributionIdentifiers {
    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    private static final String TAG = "com.facebook.internal.AttributionIdentifiers";
    private static AttributionIdentifiers recentlyFetchedIdentifiers;
    private String androidAdvertiserId;
    private String androidInstallerPackage;
    private String attributionId;
    private long fetchTime;
    private boolean limitTracking;

    private static final class GoogleAdInfo implements IInterface {
        private static final int FIRST_TRANSACTION_CODE = 1;
        private static final int SECOND_TRANSACTION_CODE = 2;
        private IBinder binder;

        GoogleAdInfo(IBinder iBinder) {
            this.binder = iBinder;
        }

        public IBinder asBinder() {
            return this.binder;
        }

        public String getAdvertiserId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C14244c.f42007P);
                this.binder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean isTrackingLimited() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C14244c.f42007P);
                boolean z = true;
                obtain.writeInt(1);
                this.binder.transact(2, obtain, obtain2, 0);
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
    }

    private static final class GoogleAdServiceConnection implements ServiceConnection {
        private AtomicBoolean consumed;
        private final BlockingQueue<IBinder> queue;

        private GoogleAdServiceConnection() {
            this.consumed = new AtomicBoolean(false);
            this.queue = new LinkedBlockingDeque();
        }

        public IBinder getBinder() throws InterruptedException {
            if (!this.consumed.compareAndSet(true, true)) {
                return (IBinder) this.queue.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.queue.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers attributionIdentifiers) {
        attributionIdentifiers.fetchTime = System.currentTimeMillis();
        recentlyFetchedIdentifiers = attributionIdentifiers;
        return attributionIdentifiers;
    }

    private static AttributionIdentifiers getAndroidId(Context context) {
        AttributionIdentifiers androidIdViaReflection = getAndroidIdViaReflection(context);
        if (androidIdViaReflection != null) {
            return androidIdViaReflection;
        }
        AttributionIdentifiers androidIdViaService = getAndroidIdViaService(context);
        return androidIdViaService == null ? new AttributionIdentifiers() : androidIdViaService;
    }

    private static AttributionIdentifiers getAndroidIdViaReflection(Context context) {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
                if (methodQuietly == null) {
                    return null;
                }
                Object invokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context);
                if (invokeMethodQuietly instanceof Integer) {
                    if (((Integer) invokeMethodQuietly).intValue() == 0) {
                        Method methodQuietly2 = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                        if (methodQuietly2 == null) {
                            return null;
                        }
                        Object invokeMethodQuietly2 = Utility.invokeMethodQuietly(null, methodQuietly2, context);
                        if (invokeMethodQuietly2 == null) {
                            return null;
                        }
                        Method methodQuietly3 = Utility.getMethodQuietly(invokeMethodQuietly2.getClass(), "getId", (Class<?>[]) new Class[0]);
                        Method methodQuietly4 = Utility.getMethodQuietly(invokeMethodQuietly2.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                        if (methodQuietly3 != null) {
                            if (methodQuietly4 != null) {
                                AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                                attributionIdentifiers.androidAdvertiserId = (String) Utility.invokeMethodQuietly(invokeMethodQuietly2, methodQuietly3, new Object[0]);
                                attributionIdentifiers.limitTracking = ((Boolean) Utility.invokeMethodQuietly(invokeMethodQuietly2, methodQuietly4, new Object[0])).booleanValue();
                                return attributionIdentifiers;
                            }
                        }
                    }
                }
                return null;
            }
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        } catch (Exception e) {
            Utility.logd("android_id", e);
            return null;
        }
    }

    private static AttributionIdentifiers getAndroidIdViaService(Context context) {
        GoogleAdServiceConnection googleAdServiceConnection = new GoogleAdServiceConnection();
        Intent intent = new Intent(C14241e.f41999c);
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, googleAdServiceConnection, 1)) {
            try {
                GoogleAdInfo googleAdInfo = new GoogleAdInfo(googleAdServiceConnection.getBinder());
                AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                attributionIdentifiers.androidAdvertiserId = googleAdInfo.getAdvertiserId();
                attributionIdentifiers.limitTracking = googleAdInfo.isTrackingLimited();
                return attributionIdentifiers;
            } catch (Exception e) {
                Utility.logd("android_id", e);
            } finally {
                context.unbindService(googleAdServiceConnection);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062 A[Catch:{ Exception -> 0x00ca, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[Catch:{ Exception -> 0x00ca, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b A[Catch:{ Exception -> 0x00ca, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.AttributionIdentifiers getAttributionIdentifiers(android.content.Context r13) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            com.facebook.internal.AttributionIdentifiers r3 = recentlyFetchedIdentifiers
            if (r3 == 0) goto L_0x0023
            long r3 = java.lang.System.currentTimeMillis()
            com.facebook.internal.AttributionIdentifiers r5 = recentlyFetchedIdentifiers
            long r6 = r5.fetchTime
            long r3 = r3 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0023
            return r5
        L_0x0023:
            com.facebook.internal.AttributionIdentifiers r3 = getAndroidId(r13)
            r4 = 3
            r5 = 0
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r4 = 0
            r8[r4] = r2     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r6 = 1
            r8[r6] = r1     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r6 = 2
            r8[r6] = r0     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r7 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r7, r4)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r4 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
        L_0x0046:
            r7 = r4
            goto L_0x005c
        L_0x0048:
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r7 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r4 = r6.resolveContentProvider(r7, r4)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            if (r4 == 0) goto L_0x005b
            java.lang.String r4 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            goto L_0x0046
        L_0x005b:
            r7 = r5
        L_0x005c:
            java.lang.String r4 = getInstallerPackageName(r13)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            if (r4 == 0) goto L_0x0064
            r3.androidInstallerPackage = r4     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
        L_0x0064:
            if (r7 != 0) goto L_0x006b
            com.facebook.internal.AttributionIdentifiers r13 = cacheAndReturnIdentifiers(r3)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            return r13
        L_0x006b:
            android.content.ContentResolver r6 = r13.getContentResolver()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            if (r13 == 0) goto L_0x00b5
            boolean r4 = r13.moveToFirst()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r4 != 0) goto L_0x007f
            goto L_0x00b5
        L_0x007f:
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r3.attributionId = r2     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r1 <= 0) goto L_0x00ab
            if (r0 <= 0) goto L_0x00ab
            java.lang.String r2 = r3.getAndroidAdvertiserId()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r2 != 0) goto L_0x00ab
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r3.androidAdvertiserId = r1     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r3.limitTracking = r0     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
        L_0x00ab:
            if (r13 == 0) goto L_0x00b0
            r13.close()
        L_0x00b0:
            com.facebook.internal.AttributionIdentifiers r13 = cacheAndReturnIdentifiers(r3)
            return r13
        L_0x00b5:
            com.facebook.internal.AttributionIdentifiers r0 = cacheAndReturnIdentifiers(r3)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r13 == 0) goto L_0x00be
            r13.close()
        L_0x00be:
            return r0
        L_0x00bf:
            r0 = move-exception
            r5 = r13
            r13 = r0
            goto L_0x00ee
        L_0x00c3:
            r0 = move-exception
            r12 = r0
            r0 = r13
            r13 = r12
            goto L_0x00cc
        L_0x00c8:
            r13 = move-exception
            goto L_0x00ee
        L_0x00ca:
            r13 = move-exception
            r0 = r5
        L_0x00cc:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00ec }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r2.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.append(r3)     // Catch:{ all -> 0x00ec }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ec }
            r2.append(r13)     // Catch:{ all -> 0x00ec }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x00ec }
            com.facebook.internal.Utility.logd(r1, r13)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00eb
            r0.close()
        L_0x00eb:
            return r5
        L_0x00ec:
            r13 = move-exception
            r5 = r0
        L_0x00ee:
            if (r5 == 0) goto L_0x00f3
            r5.close()
        L_0x00f3:
            goto L_0x00f5
        L_0x00f4:
            throw r13
        L_0x00f5:
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.AttributionIdentifiers.getAttributionIdentifiers(android.content.Context):com.facebook.internal.AttributionIdentifiers");
    }

    public static AttributionIdentifiers getCachedIdentifiers() {
        return recentlyFetchedIdentifiers;
    }

    @C0195i0
    private static String getInstallerPackageName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    public String getAndroidAdvertiserId() {
        if (!FacebookSdk.isInitialized() || !FacebookSdk.getAdvertiserIDCollectionEnabled()) {
            return null;
        }
        return this.androidAdvertiserId;
    }

    public String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    public String getAttributionId() {
        return this.attributionId;
    }

    public boolean isTrackingLimited() {
        return this.limitTracking;
    }
}

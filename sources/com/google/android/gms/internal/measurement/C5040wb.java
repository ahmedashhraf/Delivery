package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.wb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C5040wb extends C4677a implements C4813ib {
    C5040wb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeLong(j);
        mo18822b(23, G0);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19945a(G0, (Parcelable) bundle);
        mo18822b(9, G0);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeLong(j);
        mo18822b(24, G0);
    }

    public final void generateEventId(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(22, G0);
    }

    public final void getAppInstanceId(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(20, G0);
    }

    public final void getCachedAppInstanceId(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(19, G0);
    }

    public final void getConditionalUserProperties(String str, String str2, C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(10, G0);
    }

    public final void getCurrentScreenClass(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(17, G0);
    }

    public final void getCurrentScreenName(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(16, G0);
    }

    public final void getGmpAppId(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(21, G0);
    }

    public final void getMaxUserProperties(String str, C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(6, G0);
    }

    public final void getTestFlag(C5027vb vbVar, int i) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        G0.writeInt(i);
        mo18822b(38, G0);
    }

    public final void getUserProperties(String str, String str2, boolean z, C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19946a(G0, z);
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(5, G0);
    }

    public final void initForTests(Map map) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeMap(map);
        mo18822b(37, G0);
    }

    public final void initialize(C4519d dVar, zzv zzv, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        C4692b0.m19945a(G0, (Parcelable) zzv);
        G0.writeLong(j);
        mo18822b(1, G0);
    }

    public final void isDataCollectionEnabled(C5027vb vbVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) vbVar);
        mo18822b(40, G0);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19945a(G0, (Parcelable) bundle);
        C4692b0.m19946a(G0, z);
        C4692b0.m19946a(G0, z2);
        G0.writeLong(j);
        mo18822b(2, G0);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C5027vb vbVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19945a(G0, (Parcelable) bundle);
        C4692b0.m19944a(G0, (IInterface) vbVar);
        G0.writeLong(j);
        mo18822b(3, G0);
    }

    public final void logHealthData(int i, String str, C4519d dVar, C4519d dVar2, C4519d dVar3) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeInt(i);
        G0.writeString(str);
        C4692b0.m19944a(G0, (IInterface) dVar);
        C4692b0.m19944a(G0, (IInterface) dVar2);
        C4692b0.m19944a(G0, (IInterface) dVar3);
        mo18822b(33, G0);
    }

    public final void onActivityCreated(C4519d dVar, Bundle bundle, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        C4692b0.m19945a(G0, (Parcelable) bundle);
        G0.writeLong(j);
        mo18822b(27, G0);
    }

    public final void onActivityDestroyed(C4519d dVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        G0.writeLong(j);
        mo18822b(28, G0);
    }

    public final void onActivityPaused(C4519d dVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        G0.writeLong(j);
        mo18822b(29, G0);
    }

    public final void onActivityResumed(C4519d dVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        G0.writeLong(j);
        mo18822b(30, G0);
    }

    public final void onActivitySaveInstanceState(C4519d dVar, C5027vb vbVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        C4692b0.m19944a(G0, (IInterface) vbVar);
        G0.writeLong(j);
        mo18822b(31, G0);
    }

    public final void onActivityStarted(C4519d dVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        G0.writeLong(j);
        mo18822b(25, G0);
    }

    public final void onActivityStopped(C4519d dVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        G0.writeLong(j);
        mo18822b(26, G0);
    }

    public final void performAction(Bundle bundle, C5027vb vbVar, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) bundle);
        C4692b0.m19944a(G0, (IInterface) vbVar);
        G0.writeLong(j);
        mo18822b(32, G0);
    }

    public final void registerOnMeasurementEventListener(C4690ac acVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) acVar);
        mo18822b(35, G0);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeLong(j);
        mo18822b(12, G0);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) bundle);
        G0.writeLong(j);
        mo18822b(8, G0);
    }

    public final void setCurrentScreen(C4519d dVar, String str, String str2, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) dVar);
        G0.writeString(str);
        G0.writeString(str2);
        G0.writeLong(j);
        mo18822b(15, G0);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19946a(G0, z);
        mo18822b(39, G0);
    }

    public final void setEventInterceptor(C4690ac acVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) acVar);
        mo18822b(34, G0);
    }

    public final void setInstanceIdProvider(C4704bc bcVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) bcVar);
        mo18822b(18, G0);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19946a(G0, z);
        G0.writeLong(j);
        mo18822b(11, G0);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeLong(j);
        mo18822b(13, G0);
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeLong(j);
        mo18822b(14, G0);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeLong(j);
        mo18822b(7, G0);
    }

    public final void setUserProperty(String str, String str2, C4519d dVar, boolean z, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19944a(G0, (IInterface) dVar);
        C4692b0.m19946a(G0, z);
        G0.writeLong(j);
        mo18822b(4, G0);
    }

    public final void unregisterOnMeasurementEventListener(C4690ac acVar) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19944a(G0, (IInterface) acVar);
        mo18822b(36, G0);
    }
}

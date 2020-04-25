package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ib */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public interface C4813ib extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(C5027vb vbVar) throws RemoteException;

    void getAppInstanceId(C5027vb vbVar) throws RemoteException;

    void getCachedAppInstanceId(C5027vb vbVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, C5027vb vbVar) throws RemoteException;

    void getCurrentScreenClass(C5027vb vbVar) throws RemoteException;

    void getCurrentScreenName(C5027vb vbVar) throws RemoteException;

    void getGmpAppId(C5027vb vbVar) throws RemoteException;

    void getMaxUserProperties(String str, C5027vb vbVar) throws RemoteException;

    void getTestFlag(C5027vb vbVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, C5027vb vbVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(C4519d dVar, zzv zzv, long j) throws RemoteException;

    void isDataCollectionEnabled(C5027vb vbVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, C5027vb vbVar, long j) throws RemoteException;

    void logHealthData(int i, String str, C4519d dVar, C4519d dVar2, C4519d dVar3) throws RemoteException;

    void onActivityCreated(C4519d dVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(C4519d dVar, long j) throws RemoteException;

    void onActivityPaused(C4519d dVar, long j) throws RemoteException;

    void onActivityResumed(C4519d dVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(C4519d dVar, C5027vb vbVar, long j) throws RemoteException;

    void onActivityStarted(C4519d dVar, long j) throws RemoteException;

    void onActivityStopped(C4519d dVar, long j) throws RemoteException;

    void performAction(Bundle bundle, C5027vb vbVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(C4690ac acVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(C4519d dVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setEventInterceptor(C4690ac acVar) throws RemoteException;

    void setInstanceIdProvider(C4704bc bcVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, C4519d dVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(C4690ac acVar) throws RemoteException;
}

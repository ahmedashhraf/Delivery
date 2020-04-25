package com.facebook.places.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.internal.Validate;
import com.facebook.places.internal.ScannerException.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WifiScannerImpl implements WifiScanner {
    private static final String SSID_NOMAP = "_nomap";
    private static final String SSID_OPTOUT = "_optout";
    private ScanResultBroadcastReceiver broadcastReceiver;
    private Context context;
    private final LocationPackageRequestParams params;
    /* access modifiers changed from: private */
    public final Object scanLock = new Object();
    private WifiManager wifiManager;

    private class ScanResultBroadcastReceiver extends BroadcastReceiver {
        private ScanResultBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                    synchronized (WifiScannerImpl.this.scanLock) {
                        WifiScannerImpl.this.scanLock.notify();
                    }
                    WifiScannerImpl.this.unregisterBroadcastReceiver();
                }
            }
        }
    }

    WifiScannerImpl(Context context2, LocationPackageRequestParams locationPackageRequestParams) {
        this.context = context2;
        this.params = locationPackageRequestParams;
    }

    private static void filterResults(List<ScanResult> list, int i) {
        if (list.size() > i) {
            Collections.sort(list, new Comparator<ScanResult>() {
                public int compare(ScanResult scanResult, ScanResult scanResult2) {
                    return scanResult2.level - scanResult.level;
                }
            });
            list.subList(i, list.size()).clear();
        }
    }

    private static List<ScanResult> filterWifiScanResultsByMaxAge(List<ScanResult> list, long j) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            if (VERSION.SDK_INT < 17) {
                arrayList.addAll(list);
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                for (ScanResult scanResult : list) {
                    long j2 = elapsedRealtime - (scanResult.timestamp / 1000);
                    if (j2 < 0) {
                        j2 = System.currentTimeMillis() - scanResult.timestamp;
                    }
                    if (j2 < j) {
                        arrayList.add(scanResult);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.facebook.places.internal.WifiScanResult> getActiveScanResults() throws com.facebook.places.internal.ScannerException {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.context     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            boolean r1 = com.facebook.internal.Validate.hasChangeWifiStatePermission(r1)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            if (r1 == 0) goto L_0x0031
            r5.registerBroadcastReceiver()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            android.net.wifi.WifiManager r1 = r5.wifiManager     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            boolean r1 = r1.startScan()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r5.scanLock     // Catch:{ InterruptedException -> 0x0027 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0027 }
            java.lang.Object r2 = r5.scanLock     // Catch:{ all -> 0x0024 }
            com.facebook.places.internal.LocationPackageRequestParams r3 = r5.params     // Catch:{ all -> 0x0024 }
            long r3 = r3.getWifiScanTimeoutMs()     // Catch:{ all -> 0x0024 }
            r2.wait(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            goto L_0x0027
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r2     // Catch:{ InterruptedException -> 0x0027 }
        L_0x0027:
            java.util.List r0 = r5.getCachedScanResults()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            goto L_0x0031
        L_0x002c:
            r0 = move-exception
            r5.unregisterBroadcastReceiver()
            throw r0
        L_0x0031:
            r5.unregisterBroadcastReceiver()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.places.internal.WifiScannerImpl.getActiveScanResults():java.util.List");
    }

    private List<WifiScanResult> getCachedScanResults() throws ScannerException {
        try {
            List<ScanResult> filterWifiScanResultsByMaxAge = filterWifiScanResultsByMaxAge(this.wifiManager.getScanResults(), this.params.getWifiScanMaxAgeMs());
            filterResults(filterWifiScanResultsByMaxAge, this.params.getWifiMaxScanResults());
            ArrayList arrayList = new ArrayList(filterWifiScanResultsByMaxAge.size());
            for (ScanResult scanResult : filterWifiScanResultsByMaxAge) {
                if (!isWifiSsidBlacklisted(scanResult.SSID)) {
                    WifiScanResult wifiScanResult = new WifiScanResult();
                    wifiScanResult.bssid = scanResult.BSSID;
                    wifiScanResult.ssid = scanResult.SSID;
                    wifiScanResult.rssi = scanResult.level;
                    wifiScanResult.frequency = scanResult.frequency;
                    if (VERSION.SDK_INT >= 17) {
                        wifiScanResult.timestampMs = TimeUnit.MICROSECONDS.toMillis(scanResult.timestamp);
                    } else {
                        wifiScanResult.timestampMs = SystemClock.elapsedRealtime();
                    }
                    arrayList.add(wifiScanResult);
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new ScannerException(Type.UNKNOWN_ERROR, e);
        }
    }

    private boolean isWifiScanningAlwaysOn() {
        if (VERSION.SDK_INT >= 18) {
            return this.wifiManager.isScanAlwaysAvailable();
        }
        return false;
    }

    private static boolean isWifiSsidBlacklisted(String str) {
        return str != null && (str.endsWith(SSID_NOMAP) || str.contains(SSID_OPTOUT));
    }

    private void registerBroadcastReceiver() {
        if (this.broadcastReceiver != null) {
            unregisterBroadcastReceiver();
        }
        this.broadcastReceiver = new ScanResultBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        this.context.registerReceiver(this.broadcastReceiver, intentFilter);
    }

    /* access modifiers changed from: private */
    public void unregisterBroadcastReceiver() {
        ScanResultBroadcastReceiver scanResultBroadcastReceiver = this.broadcastReceiver;
        if (scanResultBroadcastReceiver != null) {
            try {
                this.context.unregisterReceiver(scanResultBroadcastReceiver);
            } catch (Exception unused) {
            }
            this.broadcastReceiver = null;
        }
    }

    public WifiScanResult getConnectedWifi() throws ScannerException {
        try {
            WifiInfo connectionInfo = this.wifiManager.getConnectionInfo();
            if (connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getBSSID()) && connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                if (!isWifiSsidBlacklisted(connectionInfo.getSSID())) {
                    WifiScanResult wifiScanResult = new WifiScanResult();
                    wifiScanResult.bssid = connectionInfo.getBSSID();
                    wifiScanResult.ssid = connectionInfo.getSSID();
                    wifiScanResult.rssi = connectionInfo.getRssi();
                    wifiScanResult.timestampMs = SystemClock.elapsedRealtime();
                    if (VERSION.SDK_INT >= 21) {
                        wifiScanResult.frequency = connectionInfo.getFrequency();
                    }
                    return wifiScanResult;
                }
            }
            return null;
        } catch (Exception e) {
            throw new ScannerException(Type.UNKNOWN_ERROR, e);
        }
    }

    public synchronized List<WifiScanResult> getWifiScans() throws ScannerException {
        List<WifiScanResult> list;
        boolean z;
        list = null;
        if (!this.params.isWifiActiveScanForced()) {
            list = getCachedScanResults();
        }
        if (list != null) {
            if (!list.isEmpty()) {
                z = false;
                if (this.params.isWifiActiveScanForced() || (this.params.isWifiActiveScanAllowed() && z)) {
                    list = getActiveScanResults();
                }
            }
        }
        z = true;
        list = getActiveScanResults();
        return list;
    }

    public void initAndCheckEligibility() throws ScannerException {
        if (!this.context.getPackageManager().hasSystemFeature("android.hardware.wifi")) {
            throw new ScannerException(Type.NOT_SUPPORTED);
        } else if (Validate.hasWiFiPermission(this.context)) {
            if (this.wifiManager == null) {
                this.wifiManager = (WifiManager) this.context.getSystemService("wifi");
            }
            if (!isWifiScanningAlwaysOn() && !this.wifiManager.isWifiEnabled()) {
                throw new ScannerException(Type.DISABLED);
            }
        } else {
            throw new ScannerException(Type.PERMISSION_DENIED);
        }
    }

    public boolean isWifiScanningEnabled() {
        try {
            initAndCheckEligibility();
            if (Validate.hasLocationPermission(this.context)) {
                return true;
            }
        } catch (ScannerException unused) {
        }
        return false;
    }
}

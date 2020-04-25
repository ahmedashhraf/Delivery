package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p201f.p202a.p203u.C5966a;

public final class MapsInitializer {
    @C5966a("MapsInitializer.class")
    private static boolean zzbl = false;

    private MapsInitializer() {
    }

    public static synchronized int initialize(Context context) {
        synchronized (MapsInitializer.class) {
            C4300a0.m18621a(context, (Object) "Context is null");
            if (zzbl) {
                return 0;
            }
            try {
                zze zza = zzbz.zza(context);
                try {
                    CameraUpdateFactory.zza(zza.zzd());
                    BitmapDescriptorFactory.zza(zza.zze());
                    zzbl = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.f12771a;
            }
        }
    }
}

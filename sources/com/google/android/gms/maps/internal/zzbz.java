package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class zzbz {
    private static final String TAG = "zzbz";
    @SuppressLint({"StaticFieldLeak"})
    @C0195i0
    private static Context zzcj;
    private static zze zzck;

    public static zze zza(Context context) throws GooglePlayServicesNotAvailableException {
        zze zze;
        C4300a0.m18620a(context);
        zze zze2 = zzck;
        if (zze2 != null) {
            return zze2;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable == 0) {
            IBinder iBinder = (IBinder) zza(zzb(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                zze = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                zze = queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zzf(iBinder);
            }
            zzck = zze;
            try {
                zzck.zza(C4523f.m19511a(zzb(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return zzck;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    private static <T> T zza(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String str = "Unable to instantiate the dynamic class ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException unused2) {
            String str2 = "Unable to call the default constructor of ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }

    private static <T> T zza(ClassLoader classLoader, String str) {
        try {
            return zza(((ClassLoader) C4300a0.m18620a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    @C0195i0
    private static Context zzb(Context context) {
        Context context2 = zzcj;
        if (context2 != null) {
            return context2;
        }
        Context zzc = zzc(context);
        zzcj = zzc;
        return zzc;
    }

    @C0195i0
    private static Context zzc(Context context) {
        try {
            return DynamiteModule.m19544a(context, DynamiteModule.f13809i, "com.google.android.gms.maps_dynamite").mo18635a();
        } catch (Throwable unused) {
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }
}

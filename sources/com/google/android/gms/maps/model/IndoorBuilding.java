package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p113a.p114a.p118d.p124f.C2669v;
import p076c.p112d.p113a.p114a.p118d.p124f.C2672y;
import p076c.p112d.p113a.p114a.p118d.p124f.C2673z;

public final class IndoorBuilding {
    @C0193h0
    private final C2669v zzdc;
    @C0193h0
    private final zza zzdd;

    @C4476d0
    static class zza {
        public static final zza zzde = new zza();

        private zza() {
        }

        @C0193h0
        public static C2672y zza(IBinder iBinder) {
            return C2673z.m13026a(iBinder);
        }

        @C0193h0
        public static IndoorLevel zza(@C0193h0 C2672y yVar) {
            return new IndoorLevel(yVar);
        }
    }

    public IndoorBuilding(@C0193h0 C2669v vVar) {
        this(vVar, zza.zzde);
    }

    @C4476d0
    private IndoorBuilding(@C0193h0 C2669v vVar, @C0193h0 zza zza2) {
        this.zzdc = (C2669v) C4300a0.m18621a(vVar, (Object) "delegate");
        this.zzdd = (zza) C4300a0.m18621a(zza2, (Object) "shim");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.zzdc.mo10322a(((IndoorBuilding) obj).zzdc);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getActiveLevelIndex() {
        try {
            return this.zzdc.mo10326u0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getDefaultLevelIndex() {
        try {
            return this.zzdc.mo10325k0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<IndoorLevel> getLevels() {
        try {
            List<IBinder> b0 = this.zzdc.mo10324b0();
            ArrayList arrayList = new ArrayList(b0.size());
            for (IBinder zza2 : b0) {
                arrayList.add(zza.zza(zza.zza(zza2)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzdc.mo10323b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isUnderground() {
        try {
            return this.zzdc.mo10321F0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

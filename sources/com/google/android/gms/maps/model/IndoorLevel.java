package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2672y;

public final class IndoorLevel {
    private final C2672y zzdf;

    public IndoorLevel(C2672y yVar) {
        this.zzdf = (C2672y) C4300a0.m18620a(yVar);
    }

    public final void activate() {
        try {
            this.zzdf.mo10161t0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.zzdf.mo10158a(((IndoorLevel) obj).zzdf);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0193h0
    public final String getName() {
        try {
            return this.zzdf.getName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0193h0
    public final String getShortName() {
        try {
            return this.zzdf.mo10157Y();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzdf.mo10159b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

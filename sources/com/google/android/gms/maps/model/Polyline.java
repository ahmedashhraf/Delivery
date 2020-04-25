package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.dynamic.C4523f;
import java.util.List;
import p076c.p112d.p113a.p114a.p118d.p124f.C2655h0;

public final class Polyline {
    private final C2655h0 zzea;

    public Polyline(C2655h0 h0Var) {
        this.zzea = (C2655h0) C4300a0.m18620a(h0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            return this.zzea.mo10199a(((Polyline) obj).zzea);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getColor() {
        try {
            return this.zzea.mo10192C0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0193h0
    public final Cap getEndCap() {
        try {
            return this.zzea.mo10193E0().zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            return this.zzea.getId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getJointType() {
        try {
            return this.zzea.mo10214l0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0195i0
    public final List<PatternItem> getPattern() {
        try {
            return PatternItem.zza(this.zzea.mo10211h0());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<LatLng> getPoints() {
        try {
            return this.zzea.mo10194Q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0193h0
    public final Cap getStartCap() {
        try {
            return this.zzea.mo10205e0().zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0195i0
    public final Object getTag() {
        try {
            return C4523f.m19512d(this.zzea.mo10206f());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getWidth() {
        try {
            return this.zzea.getWidth();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.zzea.mo10207g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzea.mo10200b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.zzea.mo10219x();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.zzea.mo10195T();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.zzea.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.zzea.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.zzea.mo10203c(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setColor(int i) {
        try {
            this.zzea.setColor(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setEndCap(@C0193h0 Cap cap) {
        C4300a0.m18621a(cap, (Object) "endCap must not be null");
        try {
            this.zzea.mo10198a(cap);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.zzea.mo10210h(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setJointType(int i) {
        try {
            this.zzea.mo10215m(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPattern(@C0195i0 List<PatternItem> list) {
        try {
            this.zzea.mo10204e(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            this.zzea.mo10202c(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStartCap(@C0193h0 Cap cap) {
        C4300a0.m18621a(cap, (Object) "startCap must not be null");
        try {
            this.zzea.mo10201b(cap);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTag(@C0195i0 Object obj) {
        try {
            this.zzea.mo10197a(C4523f.m19511a(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.zzea.setVisible(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setWidth(float f) {
        try {
            this.zzea.mo10212i(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.zzea.mo10196a(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

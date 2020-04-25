package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback;
import com.google.android.gms.maps.internal.zzbt;

final class zzr extends zzbt {
    private final /* synthetic */ SnapshotReadyCallback zzz;

    zzr(GoogleMap googleMap, SnapshotReadyCallback snapshotReadyCallback) {
        this.zzz = snapshotReadyCallback;
    }

    public final void onSnapshotReady(Bitmap bitmap) throws RemoteException {
        this.zzz.onSnapshotReady(bitmap);
    }

    public final void zzb(C4519d dVar) throws RemoteException {
        this.zzz.onSnapshotReady((Bitmap) C4523f.m19512d(dVar));
    }
}

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.dynamic.C4513a;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.dynamic.C4524g;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    private final zzb zzcc;

    @C4476d0
    static class zza implements StreetViewLifecycleDelegate {
        private final ViewGroup parent;
        private final IStreetViewPanoramaViewDelegate zzcd;
        private View zzce;

        public zza(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.zzcd = (IStreetViewPanoramaViewDelegate) C4300a0.m18620a(iStreetViewPanoramaViewDelegate);
            this.parent = (ViewGroup) C4300a0.m18620a(viewGroup);
        }

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.zzcd.getStreetViewPanoramaAsync(new zzaj(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                this.zzcd.onCreate(bundle2);
                zzby.zza(bundle2, bundle);
                this.zzce = (View) C4523f.m19512d(this.zzcd.getView());
                this.parent.removeAllViews();
                this.parent.addView(this.zzce);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onDestroy() {
            try {
                this.zzcd.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onLowMemory() {
            try {
                this.zzcd.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.zzcd.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.zzcd.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                this.zzcd.onSaveInstanceState(bundle2);
                zzby.zza(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.zzcd.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.zzcd.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @C4476d0
    static class zzb extends C4513a<zza> {
        private C4524g<zza> zzbc;
        private final ViewGroup zzbi;
        private final Context zzbj;
        private final List<OnStreetViewPanoramaReadyCallback> zzbv = new ArrayList();
        private final StreetViewPanoramaOptions zzcf;

        @C4476d0
        zzb(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.zzbi = viewGroup;
            this.zzbj = context;
            this.zzcf = streetViewPanoramaOptions;
        }

        /* access modifiers changed from: protected */
        public final void createDelegate(C4524g<zza> gVar) {
            this.zzbc = gVar;
            if (this.zzbc != null && getDelegate() == null) {
                try {
                    MapsInitializer.initialize(this.zzbj);
                    this.zzbc.mo18633a(new zza(this.zzbi, zzbz.zza(this.zzbj).zza(C4523f.m19511a(this.zzbj), this.zzcf)));
                    for (OnStreetViewPanoramaReadyCallback streetViewPanoramaAsync : this.zzbv) {
                        ((zza) getDelegate()).getStreetViewPanoramaAsync(streetViewPanoramaAsync);
                    }
                    this.zzbv.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                ((zza) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.zzbv.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.zzcc = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzcc = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzcc = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzcc = new zzb(this, context, streetViewPanoramaOptions);
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        C4300a0.m18626a("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzcc.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            this.zzcc.onCreate(bundle);
            if (this.zzcc.getDelegate() == null) {
                C4513a.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.zzcc.onDestroy();
    }

    public final void onLowMemory() {
        this.zzcc.onLowMemory();
    }

    public final void onPause() {
        this.zzcc.onPause();
    }

    public void onResume() {
        this.zzcc.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zzcc.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.zzcc.onStart();
    }

    public void onStop() {
        this.zzcc.onStop();
    }
}

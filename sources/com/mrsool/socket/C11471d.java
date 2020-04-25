package com.mrsool.socket;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.mrsool.socket.d */
/* compiled from: MarkerAnimation */
public class C11471d {

    /* renamed from: com.mrsool.socket.d$a */
    /* compiled from: MarkerAnimation */
    static class C11472a implements Runnable {

        /* renamed from: N */
        float f32320N;

        /* renamed from: O */
        final /* synthetic */ long f32321O;

        /* renamed from: P */
        final /* synthetic */ Interpolator f32322P;

        /* renamed from: Q */
        final /* synthetic */ Marker f32323Q;

        /* renamed from: R */
        final /* synthetic */ C11460a f32324R;

        /* renamed from: S */
        final /* synthetic */ LatLng f32325S;

        /* renamed from: T */
        final /* synthetic */ LatLng f32326T;

        /* renamed from: U */
        final /* synthetic */ Handler f32327U;

        /* renamed from: a */
        long f32328a;

        /* renamed from: b */
        float f32329b;

        C11472a(long j, Interpolator interpolator, Marker marker, C11460a aVar, LatLng latLng, LatLng latLng2, Handler handler) {
            this.f32321O = j;
            this.f32322P = interpolator;
            this.f32323Q = marker;
            this.f32324R = aVar;
            this.f32325S = latLng;
            this.f32326T = latLng2;
            this.f32327U = handler;
        }

        public void run() {
            this.f32328a = SystemClock.uptimeMillis() - this.f32321O;
            this.f32329b = ((float) this.f32328a) / 500.0f;
            this.f32320N = this.f32322P.getInterpolation(this.f32329b);
            this.f32323Q.setPosition(this.f32324R.mo39539a(this.f32320N, this.f32325S, this.f32326T));
            if (this.f32329b < 1.0f) {
                this.f32327U.postDelayed(this, 1);
            }
        }
    }

    /* renamed from: com.mrsool.socket.d$b */
    /* compiled from: MarkerAnimation */
    static class C11473b implements Runnable {

        /* renamed from: N */
        float f32330N;

        /* renamed from: O */
        final /* synthetic */ long f32331O;

        /* renamed from: P */
        final /* synthetic */ float f32332P;

        /* renamed from: Q */
        final /* synthetic */ Interpolator f32333Q;

        /* renamed from: R */
        final /* synthetic */ Marker f32334R;

        /* renamed from: S */
        final /* synthetic */ C11460a f32335S;

        /* renamed from: T */
        final /* synthetic */ LatLng f32336T;

        /* renamed from: U */
        final /* synthetic */ LatLng f32337U;

        /* renamed from: V */
        final /* synthetic */ Handler f32338V;

        /* renamed from: a */
        long f32339a;

        /* renamed from: b */
        float f32340b;

        C11473b(long j, float f, Interpolator interpolator, Marker marker, C11460a aVar, LatLng latLng, LatLng latLng2, Handler handler) {
            this.f32331O = j;
            this.f32332P = f;
            this.f32333Q = interpolator;
            this.f32334R = marker;
            this.f32335S = aVar;
            this.f32336T = latLng;
            this.f32337U = latLng2;
            this.f32338V = handler;
        }

        public void run() {
            this.f32339a = SystemClock.uptimeMillis() - this.f32331O;
            this.f32340b = ((float) this.f32339a) / this.f32332P;
            this.f32330N = this.f32333Q.getInterpolation(this.f32340b);
            this.f32334R.setPosition(this.f32335S.mo39539a(this.f32330N, this.f32336T, this.f32337U));
            if (this.f32340b < 1.0f) {
                this.f32338V.postDelayed(this, 1);
            }
        }
    }

    /* renamed from: com.mrsool.socket.d$c */
    /* compiled from: MarkerAnimation */
    static class C11474c implements Runnable {

        /* renamed from: N */
        float f32341N;

        /* renamed from: O */
        final /* synthetic */ long f32342O;

        /* renamed from: P */
        final /* synthetic */ Interpolator f32343P;

        /* renamed from: Q */
        final /* synthetic */ Marker f32344Q;

        /* renamed from: R */
        final /* synthetic */ C11460a f32345R;

        /* renamed from: S */
        final /* synthetic */ LatLng f32346S;

        /* renamed from: T */
        final /* synthetic */ LatLng f32347T;

        /* renamed from: U */
        final /* synthetic */ Handler f32348U;

        /* renamed from: a */
        long f32349a;

        /* renamed from: b */
        float f32350b;

        C11474c(long j, Interpolator interpolator, Marker marker, C11460a aVar, LatLng latLng, LatLng latLng2, Handler handler) {
            this.f32342O = j;
            this.f32343P = interpolator;
            this.f32344Q = marker;
            this.f32345R = aVar;
            this.f32346S = latLng;
            this.f32347T = latLng2;
            this.f32348U = handler;
        }

        public void run() {
            this.f32349a = SystemClock.uptimeMillis() - this.f32342O;
            this.f32350b = ((float) this.f32349a) / 3000.0f;
            this.f32341N = this.f32343P.getInterpolation(this.f32350b);
            this.f32344Q.setPosition(this.f32345R.mo39539a(this.f32341N, this.f32346S, this.f32347T));
            if (this.f32350b < 1.0f) {
                this.f32348U.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: com.mrsool.socket.d$d */
    /* compiled from: MarkerAnimation */
    static class C11475d implements Runnable {

        /* renamed from: N */
        float f32351N;

        /* renamed from: O */
        int f32352O = 0;

        /* renamed from: P */
        final /* synthetic */ long f32353P;

        /* renamed from: Q */
        final /* synthetic */ Interpolator f32354Q;

        /* renamed from: R */
        final /* synthetic */ Marker f32355R;

        /* renamed from: S */
        final /* synthetic */ C11460a f32356S;

        /* renamed from: T */
        final /* synthetic */ LatLng f32357T;

        /* renamed from: U */
        final /* synthetic */ LatLng f32358U;

        /* renamed from: V */
        final /* synthetic */ Handler f32359V;

        /* renamed from: a */
        long f32360a;

        /* renamed from: b */
        float f32361b;

        C11475d(long j, Interpolator interpolator, Marker marker, C11460a aVar, LatLng latLng, LatLng latLng2, Handler handler) {
            this.f32353P = j;
            this.f32354Q = interpolator;
            this.f32355R = marker;
            this.f32356S = aVar;
            this.f32357T = latLng;
            this.f32358U = latLng2;
            this.f32359V = handler;
        }

        public void run() {
            this.f32360a = SystemClock.uptimeMillis() - this.f32353P;
            this.f32361b = ((float) this.f32360a) / 3000.0f;
            this.f32351N = this.f32354Q.getInterpolation(this.f32361b);
            this.f32355R.setPosition(this.f32356S.mo39539a(this.f32351N, this.f32357T, this.f32358U));
            if (this.f32361b < 1.0f) {
                this.f32359V.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: com.mrsool.socket.d$e */
    /* compiled from: MarkerAnimation */
    static class C11476e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C11460a f32362a;

        /* renamed from: b */
        final /* synthetic */ LatLng f32363b;

        /* renamed from: c */
        final /* synthetic */ LatLng f32364c;

        /* renamed from: d */
        final /* synthetic */ Marker f32365d;

        C11476e(C11460a aVar, LatLng latLng, LatLng latLng2, Marker marker) {
            this.f32362a = aVar;
            this.f32363b = latLng;
            this.f32364c = latLng2;
            this.f32365d = marker;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f32365d.setPosition(this.f32362a.mo39539a(valueAnimator.getAnimatedFraction(), this.f32363b, this.f32364c));
        }
    }

    /* renamed from: com.mrsool.socket.d$f */
    /* compiled from: MarkerAnimation */
    static class C11477f implements TypeEvaluator<LatLng> {

        /* renamed from: a */
        final /* synthetic */ C11460a f32366a;

        C11477f(C11460a aVar) {
            this.f32366a = aVar;
        }

        /* renamed from: a */
        public LatLng evaluate(float f, LatLng latLng, LatLng latLng2) {
            return this.f32366a.mo39539a(f, latLng, latLng2);
        }
    }

    /* renamed from: a */
    public static Handler m51811a(Marker marker, LatLng latLng, C11460a aVar, float f) {
        LatLng position = marker.getPosition();
        Handler handler = new Handler();
        C11473b bVar = new C11473b(SystemClock.uptimeMillis(), f, new AccelerateDecelerateInterpolator(), marker, aVar, position, latLng, handler);
        handler.post(bVar);
        return handler;
    }

    /* renamed from: b */
    public static Handler m51814b(Marker marker, LatLng latLng, C11460a aVar) {
        LatLng position = marker.getPosition();
        Handler handler = new Handler();
        C11472a aVar2 = new C11472a(SystemClock.uptimeMillis(), new AccelerateDecelerateInterpolator(), marker, aVar, position, latLng, handler);
        handler.post(aVar2);
        return handler;
    }

    @TargetApi(11)
    /* renamed from: c */
    public static void m51815c(Marker marker, LatLng latLng, C11460a aVar) {
        LatLng position = marker.getPosition();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new C11476e(aVar, position, latLng, marker));
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(3000);
        valueAnimator.start();
    }

    @TargetApi(14)
    /* renamed from: d */
    public static void m51816d(Marker marker, LatLng latLng, C11460a aVar) {
        C11477f fVar = new C11477f(aVar);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(marker, Property.of(Marker.class, LatLng.class, "position"), fVar, new LatLng[]{latLng});
        ofObject.setDuration(3000);
        ofObject.start();
    }

    /* renamed from: a */
    public static void m51813a(Marker marker, LatLng latLng, C11460a aVar) {
        LatLng position = marker.getPosition();
        Handler handler = new Handler();
        C11474c cVar = new C11474c(SystemClock.uptimeMillis(), new AccelerateDecelerateInterpolator(), marker, aVar, position, latLng, handler);
        handler.post(cVar);
    }

    /* renamed from: a */
    public static void m51812a(Marker marker, LatLng latLng, LatLng latLng2, C11460a aVar) {
        Handler handler = new Handler();
        C11475d dVar = new C11475d(SystemClock.uptimeMillis(), new AccelerateDecelerateInterpolator(), marker, aVar, latLng, latLng2, handler);
        handler.post(dVar);
    }
}

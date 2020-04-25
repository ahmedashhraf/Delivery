package com.instabug.library.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.instabug.library.invocation.InvocationSettings;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.e */
/* compiled from: ShakeDetector */
public class C10024e implements SensorEventListener {

    /* renamed from: i */
    private static transient /* synthetic */ boolean[] f26671i;

    /* renamed from: a */
    private SensorManager f26672a;

    /* renamed from: b */
    private Sensor f26673b;

    /* renamed from: c */
    private long f26674c = 0;

    /* renamed from: d */
    private float f26675d;

    /* renamed from: e */
    private float f26676e;

    /* renamed from: f */
    private float f26677f;

    /* renamed from: g */
    private C10025a f26678g;

    /* renamed from: h */
    private int f26679h = InvocationSettings.SHAKE_DEFAULT_THRESHOLD;

    /* renamed from: com.instabug.library.util.e$a */
    /* compiled from: ShakeDetector */
    public interface C10025a {
        /* renamed from: e */
        void mo35218e();
    }

    public C10024e(Context context, C10025a aVar) {
        boolean[] c = m46639c();
        c[0] = true;
        this.f26672a = (SensorManager) context.getSystemService("sensor");
        c[1] = true;
        this.f26673b = this.f26672a.getDefaultSensor(1);
        c[2] = true;
        mo36009a(aVar);
        c[3] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m46639c() {
        boolean[] zArr = f26671i;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5139722567645055788L, "com/instabug/library/util/ShakeDetector", 19);
        f26671i = a;
        return a;
    }

    /* renamed from: a */
    public void mo36009a(C10025a aVar) {
        boolean[] c = m46639c();
        this.f26678g = aVar;
        c[15] = true;
    }

    /* renamed from: b */
    public void mo36010b() {
        boolean[] c = m46639c();
        this.f26672a.unregisterListener(this);
        c[17] = true;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        m46639c()[14] = true;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean[] c = m46639c();
        Sensor sensor = sensorEvent.sensor;
        c[4] = true;
        if (sensor.getType() != 1) {
            c[5] = true;
        } else {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            c[6] = true;
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f26674c;
            if (currentTimeMillis - j <= 400) {
                c[7] = true;
            } else {
                long j2 = currentTimeMillis - j;
                c[8] = true;
                if ((Math.abs(((((f + f2) + f3) - this.f26675d) - this.f26676e) - this.f26677f) / ((float) j2)) * 10000.0f <= ((float) this.f26679h)) {
                    c[9] = true;
                } else {
                    c[10] = true;
                    this.f26678g.mo35218e();
                    c[11] = true;
                }
                this.f26674c = currentTimeMillis;
                this.f26675d = f;
                this.f26676e = f2;
                this.f26677f = f3;
                c[12] = true;
            }
        }
        c[13] = true;
    }

    /* renamed from: a */
    public void mo36007a() {
        boolean[] c = m46639c();
        this.f26672a.registerListener(this, this.f26673b, 3);
        c[16] = true;
    }

    /* renamed from: a */
    public void mo36008a(int i) {
        boolean[] c = m46639c();
        this.f26679h = i;
        c[18] = true;
    }
}

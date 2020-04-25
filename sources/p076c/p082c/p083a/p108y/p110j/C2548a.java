package p076c.p082c.p083a.p108y.p110j;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import p076c.p082c.p083a.p108y.p109i.C2535c;

/* renamed from: c.c.a.y.j.a */
/* compiled from: AppWidgetTarget */
public class C2548a extends C2557j<Bitmap> {

    /* renamed from: O */
    private final int[] f9627O;

    /* renamed from: P */
    private final ComponentName f9628P;

    /* renamed from: Q */
    private final RemoteViews f9629Q;

    /* renamed from: R */
    private final Context f9630R;

    /* renamed from: S */
    private final int f9631S;

    public C2548a(Context context, RemoteViews remoteViews, int i, int i2, int i3, int... iArr) {
        super(i2, i3);
        if (context == null) {
            throw new NullPointerException("Context can not be null!");
        } else if (iArr == null) {
            throw new NullPointerException("WidgetIds can not be null!");
        } else if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        } else if (remoteViews != null) {
            this.f9630R = context;
            this.f9629Q = remoteViews;
            this.f9631S = i;
            this.f9627O = iArr;
            this.f9628P = null;
        } else {
            throw new NullPointerException("RemoteViews object can not be null!");
        }
    }

    /* renamed from: c */
    private void m12606c() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f9630R);
        ComponentName componentName = this.f9628P;
        if (componentName != null) {
            instance.updateAppWidget(componentName, this.f9629Q);
        } else {
            instance.updateAppWidget(this.f9627O, this.f9629Q);
        }
    }

    /* renamed from: a */
    public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
        this.f9629Q.setImageViewBitmap(this.f9631S, bitmap);
        m12606c();
    }

    public C2548a(Context context, RemoteViews remoteViews, int i, int... iArr) {
        this(context, remoteViews, i, Integer.MIN_VALUE, Integer.MIN_VALUE, iArr);
    }

    public C2548a(Context context, RemoteViews remoteViews, int i, int i2, int i3, ComponentName componentName) {
        super(i2, i3);
        if (context == null) {
            throw new NullPointerException("Context can not be null!");
        } else if (componentName == null) {
            throw new NullPointerException("ComponentName can not be null!");
        } else if (remoteViews != null) {
            this.f9630R = context;
            this.f9629Q = remoteViews;
            this.f9631S = i;
            this.f9628P = componentName;
            this.f9627O = null;
        } else {
            throw new NullPointerException("RemoteViews object can not be null!");
        }
    }

    public C2548a(Context context, RemoteViews remoteViews, int i, ComponentName componentName) {
        this(context, remoteViews, i, Integer.MIN_VALUE, Integer.MIN_VALUE, componentName);
    }
}

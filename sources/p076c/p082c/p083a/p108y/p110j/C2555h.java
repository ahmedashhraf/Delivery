package p076c.p082c.p083a.p108y.p110j;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import p076c.p082c.p083a.p108y.p109i.C2535c;

/* renamed from: c.c.a.y.j.h */
/* compiled from: NotificationTarget */
public class C2555h extends C2557j<Bitmap> {

    /* renamed from: O */
    private final RemoteViews f9636O;

    /* renamed from: P */
    private final Context f9637P;

    /* renamed from: Q */
    private final int f9638Q;

    /* renamed from: R */
    private final Notification f9639R;

    /* renamed from: S */
    private final int f9640S;

    public C2555h(Context context, RemoteViews remoteViews, int i, Notification notification, int i2) {
        this(context, remoteViews, i, Integer.MIN_VALUE, Integer.MIN_VALUE, notification, i2);
    }

    /* renamed from: c */
    private void m12629c() {
        ((NotificationManager) this.f9637P.getSystemService("notification")).notify(this.f9638Q, this.f9639R);
    }

    public C2555h(Context context, RemoteViews remoteViews, int i, int i2, int i3, Notification notification, int i4) {
        super(i2, i3);
        if (context == null) {
            throw new NullPointerException("Context must not be null!");
        } else if (notification == null) {
            throw new NullPointerException("Notification object can not be null!");
        } else if (remoteViews != null) {
            this.f9637P = context;
            this.f9640S = i;
            this.f9639R = notification;
            this.f9638Q = i4;
            this.f9636O = remoteViews;
        } else {
            throw new NullPointerException("RemoteViews object can not be null!");
        }
    }

    /* renamed from: a */
    public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
        this.f9636O.setImageViewBitmap(this.f9640S, bitmap);
        m12629c();
    }
}

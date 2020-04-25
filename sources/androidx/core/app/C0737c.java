package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.p033k.C0938f;

/* renamed from: androidx.core.app.c */
/* compiled from: ActivityOptionsCompat */
public class C0737c {

    /* renamed from: a */
    public static final String f3399a = "android.activity.usage_time";

    /* renamed from: b */
    public static final String f3400b = "android.usage_time_packages";

    @RequiresApi(16)
    /* renamed from: androidx.core.app.c$a */
    /* compiled from: ActivityOptionsCompat */
    private static class C0738a extends C0737c {

        /* renamed from: c */
        private final ActivityOptions f3401c;

        C0738a(ActivityOptions activityOptions) {
            this.f3401c = activityOptions;
        }

        /* renamed from: a */
        public void mo4090a(C0737c cVar) {
            if (cVar instanceof C0738a) {
                this.f3401c.update(((C0738a) cVar).f3401c);
            }
        }

        /* renamed from: b */
        public Bundle mo4091b() {
            return this.f3401c.toBundle();
        }

        /* renamed from: a */
        public void mo4089a(PendingIntent pendingIntent) {
            if (VERSION.SDK_INT >= 23) {
                this.f3401c.requestUsageTimeReport(pendingIntent);
            }
        }

        /* renamed from: a */
        public C0737c mo4088a(@C0195i0 Rect rect) {
            if (VERSION.SDK_INT < 24) {
                return this;
            }
            return new C0738a(this.f3401c.setLaunchBounds(rect));
        }

        /* renamed from: a */
        public Rect mo4087a() {
            if (VERSION.SDK_INT < 24) {
                return null;
            }
            return this.f3401c.getLaunchBounds();
        }
    }

    protected C0737c() {
    }

    @C0193h0
    /* renamed from: a */
    public static C0737c m4274a(@C0193h0 Context context, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            return new C0738a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0737c();
    }

    @C0193h0
    /* renamed from: b */
    public static C0737c m4277b(@C0193h0 View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            return new C0738a(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
        }
        return new C0737c();
    }

    @C0193h0
    /* renamed from: c */
    public static C0737c m4278c() {
        if (VERSION.SDK_INT >= 23) {
            return new C0738a(ActivityOptions.makeBasic());
        }
        return new C0737c();
    }

    @C0193h0
    /* renamed from: d */
    public static C0737c m4279d() {
        if (VERSION.SDK_INT >= 21) {
            return new C0738a(ActivityOptions.makeTaskLaunchBehind());
        }
        return new C0737c();
    }

    @C0195i0
    /* renamed from: a */
    public Rect mo4087a() {
        return null;
    }

    @C0193h0
    /* renamed from: a */
    public C0737c mo4088a(@C0195i0 Rect rect) {
        return this;
    }

    /* renamed from: a */
    public void mo4089a(@C0193h0 PendingIntent pendingIntent) {
    }

    /* renamed from: a */
    public void mo4090a(@C0193h0 C0737c cVar) {
    }

    @C0195i0
    /* renamed from: b */
    public Bundle mo4091b() {
        return null;
    }

    @C0193h0
    /* renamed from: a */
    public static C0737c m4275a(@C0193h0 View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 23) {
            return new C0738a(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
        }
        return new C0737c();
    }

    @C0193h0
    /* renamed from: a */
    public static C0737c m4276a(@C0193h0 View view, @C0193h0 Bitmap bitmap, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            return new C0738a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
        }
        return new C0737c();
    }

    @C0193h0
    /* renamed from: a */
    public static C0737c m4272a(@C0193h0 Activity activity, @C0193h0 View view, @C0193h0 String str) {
        if (VERSION.SDK_INT >= 21) {
            return new C0738a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new C0737c();
    }

    @C0193h0
    /* renamed from: a */
    public static C0737c m4273a(@C0193h0 Activity activity, C0938f<View, String>... fVarArr) {
        if (VERSION.SDK_INT < 21) {
            return new C0737c();
        }
        Pair[] pairArr = null;
        if (fVarArr != null) {
            pairArr = new Pair[fVarArr.length];
            for (int i = 0; i < fVarArr.length; i++) {
                pairArr[i] = Pair.create(fVarArr[i].f4243a, fVarArr[i].f4244b);
            }
        }
        return new C0738a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }
}

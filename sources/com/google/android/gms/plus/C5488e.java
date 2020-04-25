package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

@Deprecated
/* renamed from: com.google.android.gms.plus.e */
public class C5488e extends FrameLayout {
    @Deprecated

    /* renamed from: a */
    public static final String f15769a = "PlusOneDummyView";

    /* renamed from: com.google.android.gms.plus.e$a */
    private static class C5489a implements C5492d {

        /* renamed from: a */
        private Context f15770a;

        private C5489a(Context context) {
            this.f15770a = context;
        }

        /* renamed from: a */
        public final Drawable mo21904a(int i) {
            return this.f15770a.getResources().getDrawable(17301508);
        }

        /* renamed from: a */
        public final boolean mo21905a() {
            return true;
        }
    }

    /* renamed from: com.google.android.gms.plus.e$b */
    private static class C5490b implements C5492d {

        /* renamed from: a */
        private Context f15771a;

        private C5490b(Context context) {
            this.f15771a = context;
        }

        /* renamed from: a */
        public final Drawable mo21904a(int i) {
            String str = "com.google.android.gms";
            try {
                Resources resources = this.f15771a.createPackageContext(str, 4).getResources();
                String str2 = i != 0 ? i != 1 ? i != 2 ? "ic_plusone_standard" : "ic_plusone_tall" : "ic_plusone_medium" : "ic_plusone_small";
                return resources.getDrawable(resources.getIdentifier(str2, "drawable", str));
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo21905a() {
            try {
                this.f15771a.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            } catch (NameNotFoundException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.plus.e$c */
    private static class C5491c implements C5492d {

        /* renamed from: a */
        private Context f15772a;

        private C5491c(Context context) {
            this.f15772a = context;
        }

        /* renamed from: a */
        public final Drawable mo21904a(int i) {
            String str = i != 0 ? i != 1 ? i != 2 ? "ic_plusone_standard_off_client" : "ic_plusone_tall_off_client" : "ic_plusone_medium_off_client" : "ic_plusone_small_off_client";
            return this.f15772a.getResources().getDrawable(this.f15772a.getResources().getIdentifier(str, "drawable", this.f15772a.getPackageName()));
        }

        /* renamed from: a */
        public final boolean mo21905a() {
            String str = "drawable";
            return (this.f15772a.getResources().getIdentifier("ic_plusone_small_off_client", str, this.f15772a.getPackageName()) == 0 || this.f15772a.getResources().getIdentifier("ic_plusone_medium_off_client", str, this.f15772a.getPackageName()) == 0 || this.f15772a.getResources().getIdentifier("ic_plusone_tall_off_client", str, this.f15772a.getPackageName()) == 0 || this.f15772a.getResources().getIdentifier("ic_plusone_standard_off_client", str, this.f15772a.getPackageName()) == 0) ? false : true;
        }
    }

    /* renamed from: com.google.android.gms.plus.e$d */
    private interface C5492d {
        /* renamed from: a */
        Drawable mo21904a(int i);

        /* renamed from: a */
        boolean mo21905a();
    }

    @Deprecated
    public C5488e(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        C5492d bVar = new C5490b(getContext());
        if (!bVar.mo21905a()) {
            bVar = new C5491c(getContext());
        }
        if (!bVar.mo21905a()) {
            bVar = new C5489a(getContext());
        }
        button.setBackgroundDrawable(bVar.mo21904a(i));
        Point point = new Point();
        int i2 = 20;
        int i3 = 24;
        if (i == 0) {
            i2 = 14;
        } else if (i == 1) {
            i3 = 32;
        } else if (i != 2) {
            i2 = 24;
            i3 = 38;
        } else {
            i3 = 50;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        double d = (double) applyDimension;
        Double.isNaN(d);
        point.x = (int) (d + 0.5d);
        double d2 = (double) applyDimension2;
        Double.isNaN(d2);
        point.y = (int) (d2 + 0.5d);
        addView(button, new LayoutParams(point.x, point.y, 17));
    }
}

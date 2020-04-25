package com.instabug.library.util;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instabug.library.Instabug;
import com.instabug.library.settings.SettingsManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Colorizer {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4291404065941188770L, "com/instabug/library/util/Colorizer", 8);
        $jacocoData = a;
        return a;
    }

    public Colorizer() {
        $jacocoInit()[0] = true;
    }

    public static void applyPrimaryColorTint(ImageView imageView) {
        boolean[] $jacocoInit = $jacocoInit();
        applyTint(Instabug.getPrimaryColor(), imageView);
        $jacocoInit[4] = true;
    }

    public static void applyTint(int i, ImageView imageView) {
        boolean[] $jacocoInit = $jacocoInit();
        imageView.clearColorFilter();
        $jacocoInit[5] = true;
        imageView.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
        $jacocoInit[6] = true;
    }

    public static ColorFilter getPrimaryColorFilter() {
        boolean[] $jacocoInit = $jacocoInit();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(SettingsManager.getInstance().getPrimaryColor(), Mode.SRC_IN);
        $jacocoInit[7] = true;
        return porterDuffColorFilter;
    }

    public static Drawable getPrimaryColorTintedDrawable(Drawable drawable) {
        boolean[] $jacocoInit = $jacocoInit();
        Drawable tintedDrawable = getTintedDrawable(Instabug.getPrimaryColor(), drawable);
        $jacocoInit[1] = true;
        return tintedDrawable;
    }

    public static Drawable getTintedDrawable(int i, Drawable drawable) {
        boolean[] $jacocoInit = $jacocoInit();
        drawable.clearColorFilter();
        $jacocoInit[2] = true;
        drawable.setColorFilter(i, Mode.SRC_IN);
        $jacocoInit[3] = true;
        return drawable;
    }
}

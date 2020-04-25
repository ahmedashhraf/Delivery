package com.instabug.library.util;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.annotation.C0188f;
import androidx.annotation.C0198k;
import androidx.annotation.C0213q;
import com.instabug.library.C9700R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AttrResolver {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4932313662073926768L, "com/instabug/library/util/AttrResolver", 18);
        $jacocoData = a;
        return a;
    }

    public AttrResolver() {
        $jacocoInit()[0] = true;
    }

    @C0198k
    public static int getBackgroundColor(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedValue typedValue = new TypedValue();
        $jacocoInit[5] = true;
        context.getTheme().resolveAttribute(C9700R.attr.instabug_background_color, typedValue, true);
        int i = typedValue.data;
        $jacocoInit[6] = true;
        return i;
    }

    @C0198k
    public static int getColor(Context context, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        int[] iArr = {i};
        $jacocoInit[14] = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(iArr);
        $jacocoInit[15] = true;
        int color = obtainStyledAttributes.getColor(0, 0);
        $jacocoInit[16] = true;
        obtainStyledAttributes.recycle();
        $jacocoInit[17] = true;
        return color;
    }

    public static int getDialogItemTextColor(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedValue typedValue = new TypedValue();
        $jacocoInit[9] = true;
        context.getTheme().resolveAttribute(C9700R.attr.instabug_dialog_item_text_color, typedValue, true);
        int i = typedValue.data;
        $jacocoInit[10] = true;
        return i;
    }

    @C0198k
    public static int getDividerColor(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedValue typedValue = new TypedValue();
        $jacocoInit[7] = true;
        context.getTheme().resolveAttribute(C9700R.attr.instabug_divider_color, typedValue, true);
        int i = typedValue.data;
        $jacocoInit[8] = true;
        return i;
    }

    @C0213q
    public static int getDrawableResourceId(Context context, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedValue typedValue = new TypedValue();
        $jacocoInit[1] = true;
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        $jacocoInit[2] = true;
        return i2;
    }

    @C0198k
    public static int getTintingColor(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedValue typedValue = new TypedValue();
        $jacocoInit[3] = true;
        context.getTheme().resolveAttribute(C9700R.attr.instabug_theme_tinting_color, typedValue, true);
        int i = typedValue.data;
        $jacocoInit[4] = true;
        return i;
    }

    @C0198k
    public static int resolveAttributeColor(Context context, @C0188f int i) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedValue typedValue = new TypedValue();
        $jacocoInit[11] = true;
        Theme theme = context.getTheme();
        $jacocoInit[12] = true;
        theme.resolveAttribute(i, typedValue, true);
        int i2 = typedValue.data;
        $jacocoInit[13] = true;
        return i2;
    }
}

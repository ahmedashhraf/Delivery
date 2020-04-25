package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* compiled from: CompoundButtonCompat */
public final class C1108c {

    /* renamed from: a */
    private static final String f4907a = "CompoundButtonCompat";

    /* renamed from: b */
    private static Field f4908b;

    /* renamed from: c */
    private static boolean f4909c;

    private C1108c() {
    }

    /* renamed from: a */
    public static void m6317a(@C0193h0 CompoundButton compoundButton, @C0195i0 ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C1123n) {
            ((C1123n) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    @C0195i0
    /* renamed from: b */
    public static ColorStateList m6319b(@C0193h0 CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof C1123n) {
            return ((C1123n) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    @C0195i0
    /* renamed from: c */
    public static Mode m6320c(@C0193h0 CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintMode();
        }
        if (compoundButton instanceof C1123n) {
            return ((C1123n) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m6318a(@C0193h0 CompoundButton compoundButton, @C0195i0 Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C1123n) {
            ((C1123n) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    @C0195i0
    /* renamed from: a */
    public static Drawable m6316a(@C0193h0 CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f4909c) {
            try {
                f4908b = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f4908b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4909c = true;
        }
        Field field = f4908b;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f4908b = null;
            }
        }
        return null;
    }
}

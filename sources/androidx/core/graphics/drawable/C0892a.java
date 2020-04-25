package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* compiled from: DrawableCompat */
public final class C0892a {

    /* renamed from: a */
    private static final String f4093a = "DrawableCompat";

    /* renamed from: b */
    private static Method f4094b;

    /* renamed from: c */
    private static boolean f4095c;

    /* renamed from: d */
    private static Method f4096d;

    /* renamed from: e */
    private static boolean f4097e;

    private C0892a() {
    }

    /* renamed from: a */
    public static void m5150a(@C0193h0 Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static void m5154b(@C0193h0 Drawable drawable, @C0198k int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0897e) {
            ((C0897e) drawable).setTint(i);
        }
    }

    /* renamed from: c */
    public static int m5155c(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static ColorFilter m5156d(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: e */
    public static int m5157e(@C0193h0 Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f4097e) {
                try {
                    f4096d = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f4096d.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f4097e = true;
            }
            Method method = f4096d;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    f4096d = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m5158f(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public static void m5159g(@C0193h0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: h */
    public static <T extends Drawable> T m5160h(@C0193h0 Drawable drawable) {
        return drawable instanceof C0898f ? ((C0898f) drawable).mo4619a() : drawable;
    }

    /* renamed from: i */
    public static Drawable m5161i(@C0193h0 Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof C0897e) ? new C0900h(drawable) : drawable : !(drawable instanceof C0897e) ? new C0899g(drawable) : drawable;
    }

    /* renamed from: a */
    public static void m5144a(@C0193h0 Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m5145a(@C0193h0 Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m5153b(@C0193h0 Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m5153b(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0898f) {
                m5153b(((C0898f) drawable).mo4619a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        Drawable child = drawableContainerState.getChild(i2);
                        if (child != null) {
                            m5153b(child);
                        }
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: a */
    public static void m5146a(@C0193h0 Drawable drawable, @C0195i0 ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0897e) {
            ((C0897e) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m5149a(@C0193h0 Drawable drawable, @C0193h0 Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0897e) {
            ((C0897e) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m5147a(@C0193h0 Drawable drawable, @C0193h0 Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static boolean m5151a(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: a */
    public static void m5148a(@C0193h0 Drawable drawable, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static boolean m5152a(@C0193h0 Drawable drawable, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f4095c) {
                try {
                    f4094b = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f4094b.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f4095c = true;
            }
            Method method = f4094b;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception unused2) {
                    f4094b = null;
                }
            }
        }
        return false;
    }
}

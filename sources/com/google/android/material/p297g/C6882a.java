package com.google.android.material.p297g;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0231x0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParserException;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.g.a */
/* compiled from: DrawableUtils */
public final class C6882a {
    private C6882a() {
    }

    @C0195i0
    /* renamed from: a */
    public static PorterDuffColorFilter m33051a(@C0193h0 Drawable drawable, @C0195i0 ColorStateList colorStateList, @C0195i0 Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    @C0193h0
    /* renamed from: a */
    public static AttributeSet m33052a(@C0193h0 Context context, @C0231x0 int i, @C0193h0 CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            } else if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Must have a <");
                sb.append(charSequence);
                sb.append("> start tag");
                throw new XmlPullParserException(sb.toString());
            }
        } catch (IOException | XmlPullParserException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't load badge resource ID #0x");
            sb2.append(Integer.toHexString(i));
            NotFoundException notFoundException = new NotFoundException(sb2.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static void m33053a(@C0195i0 RippleDrawable rippleDrawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE}).invoke(rippleDrawable, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
        }
    }
}

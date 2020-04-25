package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: ActionBarDrawerToggleHoneycomb */
class C0293c {

    /* renamed from: a */
    private static final String f885a = "ActionBarDrawerToggleHC";

    /* renamed from: b */
    private static final int[] f886b = {16843531};

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: ActionBarDrawerToggleHoneycomb */
    static class C0294a {

        /* renamed from: a */
        public Method f887a;

        /* renamed from: b */
        public Method f888b;

        /* renamed from: c */
        public ImageView f889c;

        C0294a(Activity activity) {
            try {
                this.f887a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f888b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = viewGroup.getChildAt(1);
                        if (childAt.getId() != 16908332) {
                            childAt2 = childAt;
                        }
                        if (childAt2 instanceof ImageView) {
                            this.f889c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    private C0293c() {
    }

    /* renamed from: a */
    public static C0294a m1468a(Activity activity, Drawable drawable, int i) {
        C0294a aVar = new C0294a(activity);
        if (aVar.f887a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f887a.invoke(actionBar, new Object[]{drawable});
                aVar.f888b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        } else {
            ImageView imageView = aVar.f889c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C0294a m1469a(C0294a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0294a(activity);
        }
        if (aVar.f887a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f888b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception unused) {
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static Drawable m1467a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f886b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}

package p053b.p068f.p069a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout.C1311d;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: b.f.a.a */
/* compiled from: ActionBarDrawerToggle */
public class C2120a implements C1311d {

    /* renamed from: m */
    private static final String f8447m = "ActionBarDrawerToggle";

    /* renamed from: n */
    private static final int[] f8448n = {16843531};

    /* renamed from: o */
    private static final float f8449o = 0.33333334f;

    /* renamed from: p */
    private static final int f8450p = 16908332;

    /* renamed from: a */
    final Activity f8451a;

    /* renamed from: b */
    private final C2121a f8452b;

    /* renamed from: c */
    private final DrawerLayout f8453c;

    /* renamed from: d */
    private boolean f8454d;

    /* renamed from: e */
    private boolean f8455e;

    /* renamed from: f */
    private Drawable f8456f;

    /* renamed from: g */
    private Drawable f8457g;

    /* renamed from: h */
    private C2124d f8458h;

    /* renamed from: i */
    private final int f8459i;

    /* renamed from: j */
    private final int f8460j;

    /* renamed from: k */
    private final int f8461k;

    /* renamed from: l */
    private C2123c f8462l;

    @Deprecated
    /* renamed from: b.f.a.a$a */
    /* compiled from: ActionBarDrawerToggle */
    public interface C2121a {
        @C0195i0
        /* renamed from: a */
        Drawable mo9206a();

        /* renamed from: a */
        void mo9207a(@C0214q0 int i);

        /* renamed from: a */
        void mo9208a(Drawable drawable, @C0214q0 int i);
    }

    @Deprecated
    /* renamed from: b.f.a.a$b */
    /* compiled from: ActionBarDrawerToggle */
    public interface C2122b {
        @C0195i0
        C2121a getDrawerToggleDelegate();
    }

    /* renamed from: b.f.a.a$c */
    /* compiled from: ActionBarDrawerToggle */
    private static class C2123c {

        /* renamed from: a */
        Method f8463a;

        /* renamed from: b */
        Method f8464b;

        /* renamed from: c */
        ImageView f8465c;

        C2123c(Activity activity) {
            try {
                this.f8463a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f8464b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C2120a.f8450p);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = viewGroup.getChildAt(1);
                        if (childAt.getId() != C2120a.f8450p) {
                            childAt2 = childAt;
                        }
                        if (childAt2 instanceof ImageView) {
                            this.f8465c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b.f.a.a$d */
    /* compiled from: ActionBarDrawerToggle */
    private class C2124d extends InsetDrawable implements Callback {

        /* renamed from: N */
        private float f8466N;

        /* renamed from: O */
        private float f8467O;

        /* renamed from: a */
        private final boolean f8469a;

        /* renamed from: b */
        private final Rect f8470b;

        C2124d(Drawable drawable) {
            boolean z = false;
            super(drawable, 0);
            if (VERSION.SDK_INT > 18) {
                z = true;
            }
            this.f8469a = z;
            this.f8470b = new Rect();
        }

        /* renamed from: a */
        public float mo9210a() {
            return this.f8466N;
        }

        /* renamed from: b */
        public void mo9212b(float f) {
            this.f8466N = f;
            invalidateSelf();
        }

        public void draw(@C0193h0 Canvas canvas) {
            copyBounds(this.f8470b);
            canvas.save();
            int i = 1;
            boolean z = C0962e0.m5566x(C2120a.this.f8451a.getWindow().getDecorView()) == 1;
            if (z) {
                i = -1;
            }
            float width = (float) this.f8470b.width();
            canvas.translate((-this.f8467O) * width * this.f8466N * ((float) i), 0.0f);
            if (z && !this.f8469a) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        /* renamed from: a */
        public void mo9211a(float f) {
            this.f8467O = f;
            invalidateSelf();
        }
    }

    public C2120a(Activity activity, DrawerLayout drawerLayout, @C0213q int i, @C0214q0 int i2, @C0214q0 int i3) {
        this(activity, drawerLayout, !m11066a((Context) activity), i, i2, i3);
    }

    /* renamed from: a */
    private static boolean m11066a(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21 && VERSION.SDK_INT >= 21;
    }

    /* renamed from: c */
    private Drawable m11067c() {
        Context context;
        C2121a aVar = this.f8452b;
        if (aVar != null) {
            return aVar.mo9206a();
        }
        if (VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f8451a.getActionBar();
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.f8451a;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f8448n, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }
        TypedArray obtainStyledAttributes2 = this.f8451a.obtainStyledAttributes(f8448n);
        Drawable drawable2 = obtainStyledAttributes2.getDrawable(0);
        obtainStyledAttributes2.recycle();
        return drawable2;
    }

    /* renamed from: a */
    public void mo1015a(int i) {
    }

    /* renamed from: b */
    public void mo9204b() {
        if (this.f8453c.mo5748e((int) C0984g.f4394b)) {
            this.f8458h.mo9212b(1.0f);
        } else {
            this.f8458h.mo9212b(0.0f);
        }
        if (this.f8454d) {
            m11065a((Drawable) this.f8458h, this.f8453c.mo5748e((int) C0984g.f4394b) ? this.f8461k : this.f8460j);
        }
    }

    public C2120a(Activity activity, DrawerLayout drawerLayout, boolean z, @C0213q int i, @C0214q0 int i2, @C0214q0 int i3) {
        this.f8454d = true;
        this.f8451a = activity;
        if (activity instanceof C2122b) {
            this.f8452b = ((C2122b) activity).getDrawerToggleDelegate();
        } else {
            this.f8452b = null;
        }
        this.f8453c = drawerLayout;
        this.f8459i = i;
        this.f8460j = i2;
        this.f8461k = i3;
        this.f8456f = m11067c();
        this.f8457g = C0841b.m4928c(activity, i);
        this.f8458h = new C2124d(this.f8457g);
        this.f8458h.mo9211a(z ? f8449o : 0.0f);
    }

    /* renamed from: a */
    public void mo9200a(Drawable drawable) {
        if (drawable == null) {
            this.f8456f = m11067c();
            this.f8455e = false;
        } else {
            this.f8456f = drawable;
            this.f8455e = true;
        }
        if (!this.f8454d) {
            m11065a(this.f8456f, 0);
        }
    }

    /* renamed from: b */
    public void mo9205b(int i) {
        mo9200a(i != 0 ? C0841b.m4928c(this.f8451a, i) : null);
    }

    /* renamed from: a */
    public void mo9201a(boolean z) {
        if (z != this.f8454d) {
            if (z) {
                m11065a((Drawable) this.f8458h, this.f8453c.mo5748e((int) C0984g.f4394b) ? this.f8461k : this.f8460j);
            } else {
                m11065a(this.f8456f, 0);
            }
            this.f8454d = z;
        }
    }

    /* renamed from: b */
    public void mo1027b(View view) {
        this.f8458h.mo9212b(0.0f);
        if (this.f8454d) {
            m11068c(this.f8460j);
        }
    }

    /* renamed from: a */
    public boolean mo9202a() {
        return this.f8454d;
    }

    /* renamed from: c */
    private void m11068c(int i) {
        C2121a aVar = this.f8452b;
        if (aVar != null) {
            aVar.mo9207a(i);
            return;
        }
        if (VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f8451a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        } else {
            if (this.f8462l == null) {
                this.f8462l = new C2123c(this.f8451a);
            }
            if (this.f8462l.f8463a != null) {
                try {
                    ActionBar actionBar2 = this.f8451a.getActionBar();
                    this.f8462l.f8464b.invoke(actionBar2, new Object[]{Integer.valueOf(i)});
                    actionBar2.setSubtitle(actionBar2.getSubtitle());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo9199a(Configuration configuration) {
        if (!this.f8455e) {
            this.f8456f = m11067c();
        }
        this.f8457g = C0841b.m4928c(this.f8451a, this.f8459i);
        mo9204b();
    }

    /* renamed from: a */
    public boolean mo9203a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != f8450p || !this.f8454d) {
            return false;
        }
        if (this.f8453c.mo5750f((int) C0984g.f4394b)) {
            this.f8453c.mo5712a((int) C0984g.f4394b);
        } else {
            this.f8453c.mo5751g((int) C0984g.f4394b);
        }
        return true;
    }

    /* renamed from: a */
    public void mo1021a(View view, float f) {
        float f2;
        float a = this.f8458h.mo9210a();
        if (f > 0.5f) {
            f2 = Math.max(a, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            f2 = Math.min(a, f * 2.0f);
        }
        this.f8458h.mo9212b(f2);
    }

    /* renamed from: a */
    public void mo1020a(View view) {
        this.f8458h.mo9212b(1.0f);
        if (this.f8454d) {
            m11068c(this.f8461k);
        }
    }

    /* renamed from: a */
    private void m11065a(Drawable drawable, int i) {
        C2121a aVar = this.f8452b;
        if (aVar != null) {
            aVar.mo9208a(drawable, i);
            return;
        }
        if (VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f8451a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        } else {
            if (this.f8462l == null) {
                this.f8462l = new C2123c(this.f8451a);
            }
            C2123c cVar = this.f8462l;
            if (cVar.f8463a != null) {
                try {
                    ActionBar actionBar2 = this.f8451a.getActionBar();
                    this.f8462l.f8463a.invoke(actionBar2, new Object[]{drawable});
                    this.f8462l.f8464b.invoke(actionBar2, new Object[]{Integer.valueOf(i)});
                } catch (Exception unused) {
                }
            } else {
                ImageView imageView = cVar.f8465c;
                if (imageView != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
        }
    }
}

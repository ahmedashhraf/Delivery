package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0341d;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0485d;
import androidx.appcompat.widget.C0494f;
import androidx.appcompat.widget.C0504g;
import androidx.appcompat.widget.C0518j;
import androidx.appcompat.widget.C0522l;
import androidx.appcompat.widget.C0534n;
import androidx.appcompat.widget.C0542q;
import androidx.appcompat.widget.C0543q0;
import androidx.appcompat.widget.C0544r;
import androidx.appcompat.widget.C0546s;
import androidx.appcompat.widget.C0562x;
import androidx.collection.C0635a;
import androidx.core.p034l.C0962e0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {

    /* renamed from: b */
    private static final Class<?>[] f848b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f849c = {16843375};

    /* renamed from: d */
    private static final String[] f850d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final String f851e = "AppCompatViewInflater";

    /* renamed from: f */
    private static final Map<String, Constructor<? extends View>> f852f = new C0635a();

    /* renamed from: a */
    private final Object[] f853a = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    private static class C0278a implements OnClickListener {

        /* renamed from: N */
        private Method f854N;

        /* renamed from: O */
        private Context f855O;

        /* renamed from: a */
        private final View f856a;

        /* renamed from: b */
        private final String f857b;

        public C0278a(@C0193h0 View view, @C0193h0 String str) {
            this.f856a = view;
            this.f857b = str;
        }

        @C0193h0
        /* renamed from: a */
        private void m1331a(@C0195i0 Context context, @C0193h0 String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f857b, new Class[]{View.class});
                        if (method != null) {
                            this.f854N = method;
                            this.f855O = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f856a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f856a.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f857b);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.f856a.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        public void onClick(@C0193h0 View view) {
            if (this.f854N == null) {
                m1331a(this.f856a.getContext(), this.f857b);
            }
            try {
                this.f854N.invoke(this.f855O, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public View mo899a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo900a(View view, String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1310a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0543q0.m2895b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo913m(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 1:
                view2 = mo907g(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 2:
                view2 = mo902b(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 3:
                view2 = mo905e(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 4:
                view2 = mo912l(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 5:
                view2 = mo906f(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 6:
                view2 = mo903c(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 7:
                view2 = mo909i(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 8:
                view2 = mo904d(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 9:
                view2 = mo901a(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 10:
                view2 = mo908h(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 11:
                view2 = mo910j(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 12:
                view2 = mo911k(context2, attributeSet);
                m1313a(view2, str);
                break;
            case 13:
                view2 = mo914n(context2, attributeSet);
                m1313a(view2, str);
                break;
            default:
                view2 = mo899a(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m1314b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m1312a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: b */
    public C0494f mo902b(Context context, AttributeSet attributeSet) {
        return new C0494f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: c */
    public AppCompatCheckBox mo903c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: d */
    public C0504g mo904d(Context context, AttributeSet attributeSet) {
        return new C0504g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: e */
    public C0518j mo905e(Context context, AttributeSet attributeSet) {
        return new C0518j(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: f */
    public C0522l mo906f(Context context, AttributeSet attributeSet) {
        return new C0522l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: g */
    public AppCompatImageView mo907g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: h */
    public C0534n mo908h(Context context, AttributeSet attributeSet) {
        return new C0534n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: i */
    public C0542q mo909i(Context context, AttributeSet attributeSet) {
        return new C0542q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: j */
    public C0544r mo910j(Context context, AttributeSet attributeSet) {
        return new C0544r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: k */
    public C0546s mo911k(Context context, AttributeSet attributeSet) {
        return new C0546s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: l */
    public AppCompatSpinner mo912l(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: m */
    public AppCompatTextView mo913m(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: n */
    public C0562x mo914n(Context context, AttributeSet attributeSet) {
        return new C0562x(context, attributeSet);
    }

    /* renamed from: b */
    private View m1314b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f853a[0] = context;
            this.f853a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f850d) {
                    View a2 = m1311a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f853a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m1311a(context, str, (String) null);
            Object[] objArr2 = this.f853a;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f853a;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: a */
    public C0485d mo901a(Context context, AttributeSet attributeSet) {
        return new C0485d(context, attributeSet);
    }

    /* renamed from: a */
    private void m1313a(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m1312a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C0962e0.m5493d0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f849c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0278a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private View m1311a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor constructor = (Constructor) f852f.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f848b);
            f852f.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f853a);
    }

    /* renamed from: a */
    private static Context m1310a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0238R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0238R.styleable.View_theme, 0);
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C0341d) || ((C0341d) context).mo1324a() != resourceId) ? new C0341d(context, resourceId) : context;
        }
        return context;
    }
}

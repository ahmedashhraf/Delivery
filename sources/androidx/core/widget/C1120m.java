package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0216r0;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.core.p031j.C0913d;
import androidx.core.p031j.C0913d.C0914a;
import androidx.core.p031j.C0913d.C0914a.C0915a;
import androidx.core.p033k.C0944i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.widget.m */
/* compiled from: TextViewCompat */
public final class C1120m {

    /* renamed from: a */
    private static final String f4930a = "TextViewCompat";

    /* renamed from: b */
    public static final int f4931b = 0;

    /* renamed from: c */
    public static final int f4932c = 1;

    /* renamed from: d */
    private static Field f4933d = null;

    /* renamed from: e */
    private static boolean f4934e = false;

    /* renamed from: f */
    private static Field f4935f = null;

    /* renamed from: g */
    private static boolean f4936g = false;

    /* renamed from: h */
    private static Field f4937h = null;

    /* renamed from: i */
    private static boolean f4938i = false;

    /* renamed from: j */
    private static Field f4939j = null;

    /* renamed from: k */
    private static boolean f4940k = false;

    /* renamed from: l */
    private static final int f4941l = 1;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.widget.m$a */
    /* compiled from: TextViewCompat */
    public @interface C1121a {
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.widget.m$b */
    /* compiled from: TextViewCompat */
    private static class C1122b implements Callback {

        /* renamed from: g */
        private static final int f4942g = 100;

        /* renamed from: a */
        private final Callback f4943a;

        /* renamed from: b */
        private final TextView f4944b;

        /* renamed from: c */
        private Class f4945c;

        /* renamed from: d */
        private Method f4946d;

        /* renamed from: e */
        private boolean f4947e;

        /* renamed from: f */
        private boolean f4948f = false;

        C1122b(Callback callback, TextView textView) {
            this.f4943a = callback;
            this.f4944b = textView;
        }

        /* renamed from: a */
        private void m6404a(Menu menu) {
            Method method;
            Context context = this.f4944b.getContext();
            PackageManager packageManager = context.getPackageManager();
            String str = "removeItemAt";
            if (!this.f4948f) {
                this.f4948f = true;
                try {
                    this.f4945c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f4946d = this.f4945c.getDeclaredMethod(str, new Class[]{Integer.TYPE});
                    this.f4947e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f4945c = null;
                    this.f4946d = null;
                    this.f4947e = false;
                }
            }
            try {
                if (!this.f4947e || !this.f4945c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod(str, new Class[]{Integer.TYPE});
                } else {
                    method = this.f4946d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List a = m6403a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m6402a(resolveInfo, this.f4944b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f4943a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f4943a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f4943a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m6404a(menu);
            return this.f4943a.onPrepareActionMode(actionMode, menu);
        }

        /* renamed from: a */
        private List<ResolveInfo> m6403a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m6401a(), 0)) {
                if (m6405a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private boolean m6405a(ResolveInfo resolveInfo, Context context) {
            boolean z = true;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            String str = resolveInfo.activityInfo.permission;
            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        private Intent m6402a(ResolveInfo resolveInfo, TextView textView) {
            return m6401a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m6406a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private boolean m6406a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: a */
        private Intent m6401a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    private C1120m() {
    }

    /* renamed from: a */
    private static Field m6371a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve ");
            sb.append(str);
            sb.append(" field.");
            sb.toString();
            return field;
        }
    }

    /* renamed from: b */
    public static void m6385b(@C0193h0 TextView textView, @C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: c */
    public static int m6386c(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof C1107b) {
            return ((C1107b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    @C0193h0
    /* renamed from: d */
    public static int[] m6389d(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextAvailableSizes();
        }
        return textView instanceof C1107b ? ((C1107b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* renamed from: e */
    public static void m6391e(@C0193h0 TextView textView, @C0216r0 int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    @C0195i0
    /* renamed from: f */
    public static ColorStateList m6392f(@C0193h0 TextView textView) {
        C0944i.m5337a(textView);
        if (VERSION.SDK_INT >= 23) {
            return textView.getCompoundDrawableTintList();
        }
        if (textView instanceof C1124o) {
            return ((C1124o) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    @C0195i0
    /* renamed from: g */
    public static Mode m6393g(@C0193h0 TextView textView) {
        C0944i.m5337a(textView);
        if (VERSION.SDK_INT >= 23) {
            return textView.getCompoundDrawableTintMode();
        }
        if (textView instanceof C1124o) {
            return ((C1124o) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @C0193h0
    /* renamed from: h */
    public static Drawable[] m6394h(@C0193h0 TextView textView) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: i */
    public static int m6395i(@C0193h0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: j */
    public static int m6396j(@C0193h0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: k */
    public static int m6397k(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f4936g) {
            f4935f = m6371a("mMaxMode");
            f4936g = true;
        }
        Field field = f4935f;
        if (field != null && m6370a(field, textView) == 1) {
            if (!f4934e) {
                f4933d = m6371a("mMaximum");
                f4934e = true;
            }
            Field field2 = f4933d;
            if (field2 != null) {
                return m6370a(field2, textView);
            }
        }
        return -1;
    }

    /* renamed from: l */
    public static int m6398l(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 16) {
            return textView.getMinLines();
        }
        if (!f4940k) {
            f4939j = m6371a("mMinMode");
            f4940k = true;
        }
        Field field = f4939j;
        if (field != null && m6370a(field, textView) == 1) {
            if (!f4938i) {
                f4937h = m6371a("mMinimum");
                f4938i = true;
            }
            Field field2 = f4937h;
            if (field2 != null) {
                return m6370a(field2, textView);
            }
        }
        return -1;
    }

    @RequiresApi(18)
    /* renamed from: m */
    private static TextDirectionHeuristic m6399m(@C0193h0 TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    return textDirectionHeuristic;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    @C0193h0
    /* renamed from: n */
    public static C0914a m6400n(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 28) {
            return new C0914a(textView.getTextMetricsParams());
        }
        C0915a aVar = new C0915a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.mo4717a(textView.getBreakStrategy());
            aVar.mo4720b(textView.getHyphenationFrequency());
        }
        if (VERSION.SDK_INT >= 18) {
            aVar.mo4718a(m6399m(textView));
        }
        return aVar.mo4719a();
    }

    /* renamed from: a */
    private static int m6370a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            sb.toString();
            return -1;
        }
    }

    /* renamed from: e */
    public static int m6390e(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof C1107b) {
            return ((C1107b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* renamed from: c */
    public static void m6387c(@C0193h0 TextView textView, @C0237z(from = 0) @C0199k0 int i) {
        int i2;
        C0944i.m5334a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: d */
    public static void m6388d(@C0193h0 TextView textView, @C0237z(from = 0) @C0199k0 int i) {
        C0944i.m5334a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    public static void m6376a(@C0193h0 TextView textView, @C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: b */
    public static void m6384b(@C0193h0 TextView textView, @C0213q int i, @C0213q int i2, @C0213q int i3, @C0213q int i4) {
        int i5 = VERSION.SDK_INT;
        if (i5 >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else if (i5 >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            int i6 = z ? i3 : i;
            if (!z) {
                i = i3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(i6, i2, i, i4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m6372a(@C0193h0 TextView textView, int i) {
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        } else if (textView instanceof C1107b) {
            ((C1107b) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: b */
    public static int m6381b(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof C1107b) {
            return ((C1107b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* renamed from: a */
    public static void m6373a(@C0193h0 TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (textView instanceof C1107b) {
            ((C1107b) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static Callback m6382b(@C0193h0 TextView textView, @C0193h0 Callback callback) {
        int i = VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C1122b)) ? callback : new C1122b(callback, textView);
    }

    /* renamed from: b */
    public static void m6383b(@C0193h0 TextView textView, @C0237z(from = 0) @C0199k0 int i) {
        int i2;
        C0944i.m5334a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m6380a(@C0193h0 TextView textView, @C0193h0 int[] iArr, int i) throws IllegalArgumentException {
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (textView instanceof C1107b) {
            ((C1107b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* renamed from: a */
    public static int m6369a(@C0193h0 TextView textView) {
        if (VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof C1107b) {
            return ((C1107b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* renamed from: a */
    public static void m6377a(@C0193h0 TextView textView, @C0193h0 Callback callback) {
        textView.setCustomSelectionActionModeCallback(m6382b(textView, callback));
    }

    /* renamed from: a */
    public static void m6378a(@C0193h0 TextView textView, @C0193h0 C0914a aVar) {
        if (VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m6368a(aVar.mo4712c()));
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo4713d().getTextScaleX();
            textView.getPaint().set(aVar.mo4713d());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo4713d());
        textView.setBreakStrategy(aVar.mo4709a());
        textView.setHyphenationFrequency(aVar.mo4711b());
    }

    /* renamed from: a */
    public static void m6379a(@C0193h0 TextView textView, @C0193h0 C0913d dVar) {
        if (m6400n(textView).mo4710a(dVar.mo4696b())) {
            textView.setText(dVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    @RequiresApi(18)
    /* renamed from: a */
    private static int m6368a(@C0193h0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public static void m6374a(@C0193h0 TextView textView, @C0195i0 ColorStateList colorStateList) {
        C0944i.m5337a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof C1124o) {
            ((C1124o) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m6375a(@C0193h0 TextView textView, @C0195i0 Mode mode) {
        C0944i.m5337a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof C1124o) {
            ((C1124o) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}

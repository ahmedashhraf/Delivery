package com.instabug.featuresrequest.p370c;

import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.featuresrequest.C9525R;
import com.instabug.library.Instabug;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.i */
/* compiled from: TextInputLayoutHelper */
public class C9547i {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25243a;

    /* renamed from: a */
    public static void m44649a(TextInputLayout textInputLayout, int i) {
        boolean[] a = m44650a();
        try {
            Field declaredField = textInputLayout.getClass().getDeclaredField("mFocusedTextColor");
            a[1] = true;
            declaredField.setAccessible(true);
            int[][] iArr = {new int[0]};
            int[] iArr2 = {i};
            a[2] = true;
            ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
            a[3] = true;
            declaredField.set(textInputLayout, colorStateList);
            a[4] = true;
            Method declaredMethod = textInputLayout.getClass().getDeclaredMethod("updateLabelState", new Class[]{Boolean.TYPE});
            a[5] = true;
            declaredMethod.setAccessible(true);
            a[6] = true;
            declaredMethod.invoke(textInputLayout, new Object[]{Boolean.valueOf(true)});
            a[7] = true;
            m44651b(textInputLayout, C0841b.m4915a(Instabug.getApplicationContext(), C9525R.C9527color.ib_fr_add_comment_error));
            a[8] = true;
        } catch (Exception e) {
            a[9] = true;
            e.printStackTrace();
            a[10] = true;
        }
        a[11] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44650a() {
        boolean[] zArr = f25243a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5938684769896996918L, "com/instabug/featuresrequest/utils/TextInputLayoutHelper", 21);
        f25243a = a;
        return a;
    }

    /* renamed from: b */
    public static void m44651b(TextInputLayout textInputLayout, int i) {
        boolean[] a = m44650a();
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("mErrorView");
            a[12] = true;
            declaredField.setAccessible(true);
            a[13] = true;
            TextView textView = (TextView) declaredField.get(textInputLayout);
            a[14] = true;
            Field declaredField2 = TextView.class.getDeclaredField("mCurTextColor");
            a[15] = true;
            declaredField2.setAccessible(true);
            a[16] = true;
            declaredField2.set(textView, Integer.valueOf(i));
            a[17] = true;
        } catch (Exception e) {
            a[18] = true;
            e.printStackTrace();
            a[19] = true;
        }
        a[20] = true;
    }
}

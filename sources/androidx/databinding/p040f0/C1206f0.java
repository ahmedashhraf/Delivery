package androidx.databinding.p040f0;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.text.method.TextKeyListener.Capitalize;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;
import androidx.databinding.C1285n;
import androidx.databinding.C1286o;
import androidx.databinding.library.baseAdapters.C1277R;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @C1267g(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @C1267g(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @C1267g(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @C1267g(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @C1267g(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @C1267g(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @C1267g(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @C1267g(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @C1267g(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
/* renamed from: androidx.databinding.f0.f0 */
/* compiled from: TextViewBindingAdapter */
public class C1206f0 {

    /* renamed from: a */
    private static final String f5083a = "TextViewBindingAdapters";

    /* renamed from: b */
    public static final int f5084b = 1;

    /* renamed from: c */
    public static final int f5085c = 3;

    /* renamed from: d */
    public static final int f5086d = 5;

    /* renamed from: androidx.databinding.f0.f0$a */
    /* compiled from: TextViewBindingAdapter */
    static class C1207a implements TextWatcher {

        /* renamed from: N */
        final /* synthetic */ C1286o f5087N;

        /* renamed from: O */
        final /* synthetic */ C1208b f5088O;

        /* renamed from: a */
        final /* synthetic */ C1209c f5089a;

        /* renamed from: b */
        final /* synthetic */ C1210d f5090b;

        C1207a(C1209c cVar, C1210d dVar, C1286o oVar, C1208b bVar) {
            this.f5089a = cVar;
            this.f5090b = dVar;
            this.f5087N = oVar;
            this.f5088O = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C1208b bVar = this.f5088O;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1209c cVar = this.f5089a;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1210d dVar = this.f5090b;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i, i2, i3);
            }
            C1286o oVar = this.f5087N;
            if (oVar != null) {
                oVar.mo5680a();
            }
        }
    }

    /* renamed from: androidx.databinding.f0.f0$b */
    /* compiled from: TextViewBindingAdapter */
    public interface C1208b {
        void afterTextChanged(Editable editable);
    }

    /* renamed from: androidx.databinding.f0.f0$c */
    /* compiled from: TextViewBindingAdapter */
    public interface C1209c {
        void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.databinding.f0.f0$d */
    /* compiled from: TextViewBindingAdapter */
    public interface C1210d {
        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    @C1285n(attribute = "android:text", event = "android:textAttrChanged")
    /* renamed from: a */
    public static String m6750a(TextView textView) {
        return textView.getText().toString();
    }

    @C1179d({"android:drawableEnd"})
    /* renamed from: b */
    public static void m6763b(TextView textView, Drawable drawable) {
        if (VERSION.SDK_INT < 17) {
            m6773d(textView, drawable);
            return;
        }
        m6751a(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @C1179d({"android:numeric"})
    /* renamed from: c */
    public static void m6767c(TextView textView, int i) {
        boolean z = true;
        boolean z2 = (i & 3) != 0;
        if ((i & 5) == 0) {
            z = false;
        }
        textView.setKeyListener(DigitsKeyListener.getInstance(z2, z));
    }

    @C1179d({"android:text"})
    /* renamed from: d */
    public static void m6774d(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (!(charSequence == text || (charSequence == null && text.length() == 0))) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!m6760a(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @C1179d({"android:drawableStart"})
    /* renamed from: e */
    public static void m6776e(TextView textView, Drawable drawable) {
        if (VERSION.SDK_INT < 17) {
            m6768c(textView, drawable);
            return;
        }
        m6751a(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @C1179d({"android:drawableTop"})
    /* renamed from: f */
    public static void m6778f(TextView textView, Drawable drawable) {
        m6751a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @C1179d({"android:autoText"})
    /* renamed from: a */
    public static void m6759a(TextView textView, boolean z) {
        KeyListener keyListener = textView.getKeyListener();
        Capitalize capitalize = Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z, capitalize));
    }

    @C1179d({"android:phoneNumber"})
    /* renamed from: c */
    public static void m6770c(TextView textView, boolean z) {
        if (z) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @C1179d({"android:textSize"})
    /* renamed from: f */
    public static void m6777f(TextView textView, float f) {
        textView.setTextSize(0, f);
    }

    @C1179d({"android:drawableLeft"})
    /* renamed from: c */
    public static void m6768c(TextView textView, Drawable drawable) {
        m6751a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @C1179d({"android:imeActionLabel"})
    /* renamed from: b */
    public static void m6764b(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @C1179d({"android:shadowRadius"})
    /* renamed from: e */
    public static void m6775e(TextView textView, float f) {
        if (VERSION.SDK_INT >= 16) {
            textView.setShadowLayer(f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
        }
    }

    @C1179d({"android:lineSpacingMultiplier"})
    /* renamed from: b */
    public static void m6761b(TextView textView, float f) {
        if (VERSION.SDK_INT >= 16) {
            textView.setLineSpacing(textView.getLineSpacingExtra(), f);
        } else {
            textView.setLineSpacing(0.0f, f);
        }
    }

    @C1179d({"android:drawableRight"})
    /* renamed from: d */
    public static void m6773d(TextView textView, Drawable drawable) {
        m6751a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @C1179d({"android:inputMethod"})
    /* renamed from: c */
    public static void m6769c(TextView textView, CharSequence charSequence) {
        String str = "Could not create input method: ";
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(charSequence);
            sb.toString();
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(charSequence);
            sb2.toString();
        } catch (IllegalAccessException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(charSequence);
            sb3.toString();
        }
    }

    @C1179d({"android:capitalize"})
    /* renamed from: a */
    public static void m6755a(TextView textView, Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @C1179d({"android:maxLength"})
    /* renamed from: b */
    public static void m6762b(TextView textView, int i) {
        boolean z;
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new LengthFilter(i)};
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= filters.length) {
                    z = false;
                    break;
                }
                InputFilter inputFilter = filters[i2];
                if (inputFilter instanceof LengthFilter) {
                    if (VERSION.SDK_INT < 21 || ((LengthFilter) inputFilter).getMax() != i) {
                        filters[i2] = new LengthFilter(i);
                    }
                    z = true;
                } else {
                    i2++;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr = new InputFilter[(filters.length + 1)];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[inputFilterArr.length - 1] = new LengthFilter(i);
                filters = inputFilterArr;
            }
        }
        textView.setFilters(filters);
    }

    @C1179d({"android:shadowColor"})
    /* renamed from: d */
    public static void m6772d(TextView textView, int i) {
        if (VERSION.SDK_INT >= 16) {
            textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
        }
    }

    @C1179d({"android:bufferType"})
    /* renamed from: a */
    public static void m6756a(TextView textView, BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @C1179d({"android:digits"})
    /* renamed from: a */
    public static void m6758a(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @C1179d({"android:shadowDx"})
    /* renamed from: c */
    public static void m6766c(TextView textView, float f) {
        if (VERSION.SDK_INT >= 16) {
            int shadowColor = textView.getShadowColor();
            textView.setShadowLayer(textView.getShadowRadius(), f, textView.getShadowDy(), shadowColor);
        }
    }

    @C1179d({"android:shadowDy"})
    /* renamed from: d */
    public static void m6771d(TextView textView, float f) {
        if (VERSION.SDK_INT >= 16) {
            int shadowColor = textView.getShadowColor();
            textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f, shadowColor);
        }
    }

    /* renamed from: a */
    private static void m6751a(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @C1179d({"android:drawableBottom"})
    /* renamed from: a */
    public static void m6754a(TextView textView, Drawable drawable) {
        m6751a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @C1179d({"android:imeActionId"})
    /* renamed from: a */
    public static void m6753a(TextView textView, int i) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i);
    }

    @C1179d({"android:lineSpacingExtra"})
    /* renamed from: a */
    public static void m6752a(TextView textView, float f) {
        if (VERSION.SDK_INT >= 16) {
            textView.setLineSpacing(f, textView.getLineSpacingMultiplier());
        } else {
            textView.setLineSpacing(f, 1.0f);
        }
    }

    @C1179d({"android:password"})
    /* renamed from: b */
    public static void m6765b(TextView textView, boolean z) {
        if (z) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    /* renamed from: a */
    private static boolean m6760a(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    @C1179d(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    /* renamed from: a */
    public static void m6757a(TextView textView, C1209c cVar, C1210d dVar, C1208b bVar, C1286o oVar) {
        TextWatcher aVar = (cVar == null && bVar == null && dVar == null && oVar == null) ? null : new C1207a(cVar, dVar, oVar, bVar);
        TextWatcher textWatcher = (TextWatcher) C1244r.m6821a(textView, aVar, C1277R.C1278id.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }
}

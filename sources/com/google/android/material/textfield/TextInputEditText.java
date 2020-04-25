package com.google.android.material.textfield;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.C0518j;
import com.google.android.material.C5582R;

public class TextInputEditText extends C0518j {

    /* renamed from: O */
    private final Rect f19977O;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    @C0193h0
    /* renamed from: a */
    private String m34029a(@C0193h0 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(helperText);
        boolean z3 = !TextUtils.isEmpty(error);
        String str = "";
        String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : str;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        String str2 = ", ";
        sb.append(((z3 || z2) && !TextUtils.isEmpty(charSequence)) ? str2 : str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (!z3) {
            error = z2 ? helperText : str;
        }
        sb3.append(error);
        String sb4 = sb3.toString();
        if (!z) {
            return !TextUtils.isEmpty(sb4) ? sb4 : str;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(text);
        if (!TextUtils.isEmpty(sb4)) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append(sb4);
            str = sb6.toString();
        }
        sb5.append(str);
        return sb5.toString();
    }

    @C0195i0
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @C0195i0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(@C0195i0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && rect != null) {
            textInputLayout.getFocusedRect(this.f19977O);
            rect.bottom = this.f19977O.bottom;
        }
    }

    public boolean getGlobalVisibleRect(@C0195i0 Rect rect, @C0195i0 Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f19977O, point);
            rect.bottom = this.f19977O.bottom;
        }
        return globalVisibleRect;
    }

    @C0195i0
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.mo28309n()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo28309n() && super.getHint() == null && Build.MANUFACTURER.equalsIgnoreCase("Meizu")) {
            setHint("");
        }
    }

    @C0195i0
    public InputConnection onCreateInputConnection(@C0193h0 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(@C0193h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(m34029a(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(@C0195i0 Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            this.f19977O.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f19977O, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19977O = new Rect();
    }
}

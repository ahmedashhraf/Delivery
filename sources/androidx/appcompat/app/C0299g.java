package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.C0183c0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0225w;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.core.p034l.C0988i;
import androidx.core.p034l.C0988i.C0989a;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: AppCompatDialog */
public class C0299g extends Dialog implements C0296e {
    private C0297f mDelegate;
    private final C0989a mKeyDispatcher;

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: AppCompatDialog */
    class C0300a implements C0989a {
        C0300a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return C0299g.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public C0299g(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0238R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo793a(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0988i.m5668a(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @C0195i0
    public <T extends View> T findViewById(@C0225w int i) {
        return getDelegate().mo783a(i);
    }

    public C0297f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0297f.m1471a((Dialog) this, (C0296e) this);
        }
        return this.mDelegate;
    }

    public C0279a getSupportActionBar() {
        return getDelegate().mo817e();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().mo821g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getDelegate().mo819f();
        super.onCreate(bundle);
        getDelegate().mo791a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo830l();
    }

    public void onSupportActionModeFinished(C0338b bVar) {
    }

    public void onSupportActionModeStarted(C0338b bVar) {
    }

    @C0195i0
    public C0338b onWindowStartingSupportActionMode(C0339a aVar) {
        return null;
    }

    public void setContentView(@C0183c0 int i) {
        getDelegate().mo816d(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo798a(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo813c(i);
    }

    public C0299g(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C0300a();
        C0297f delegate = getDelegate();
        delegate.mo820f(getThemeResId(context, i));
        delegate.mo791a((Bundle) null);
    }

    public void setContentView(View view) {
        getDelegate().mo792a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo807b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo798a((CharSequence) getContext().getString(i));
    }

    protected C0299g(Context context, boolean z, OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new C0300a();
    }
}

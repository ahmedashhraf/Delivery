package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0206n;
import androidx.annotation.C0216r0;
import androidx.annotation.C0225w;
import androidx.appcompat.app.C0287b.C0289b;
import androidx.appcompat.app.C0287b.C0290c;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.appcompat.widget.C0565y0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0727a;
import androidx.core.app.C0734a0;
import androidx.core.app.C0734a0.C0735a;
import androidx.core.app.C0768n;
import androidx.fragment.app.C1376c;

/* renamed from: androidx.appcompat.app.d */
/* compiled from: AppCompatActivity */
public class C0295d extends C1376c implements C0296e, C0735a, C0290c {
    private C0297f mDelegate;
    private Resources mResources;

    public C0295d() {
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo793a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        getDelegate().mo789a(context);
    }

    public void closeOptionsMenu() {
        C0279a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo954e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0279a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo935a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(@C0225w int i) {
        return getDelegate().mo783a(i);
    }

    @C0193h0
    public C0297f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0297f.m1470a((Activity) this, (C0296e) this);
        }
        return this.mDelegate;
    }

    @C0195i0
    public C0289b getDrawerToggleDelegate() {
        return getDelegate().mo804b();
    }

    @C0193h0
    public MenuInflater getMenuInflater() {
        return getDelegate().mo815d();
    }

    public Resources getResources() {
        if (this.mResources == null && C0565y0.m3091b()) {
            this.mResources = new C0565y0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @C0195i0
    public C0279a getSupportActionBar() {
        return getDelegate().mo817e();
    }

    @C0195i0
    public Intent getSupportParentActivityIntent() {
        return C0768n.m4356a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo821g();
    }

    public void onConfigurationChanged(@C0193h0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo790a(configuration);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        C0297f delegate = getDelegate();
        delegate.mo819f();
        delegate.mo791a(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(@C0193h0 C0734a0 a0Var) {
        a0Var.mo4075a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo824i();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, @C0193h0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0279a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo962h() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, @C0193h0 Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(@C0195i0 Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo806b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo827j();
    }

    public void onPrepareSupportNavigateUpTaskStack(@C0193h0 C0734a0 a0Var) {
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo812c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().mo828k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo830l();
    }

    @C0194i
    public void onSupportActionModeFinished(@C0193h0 C0338b bVar) {
    }

    @C0194i
    public void onSupportActionModeStarted(@C0193h0 C0338b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0734a0 a = C0734a0.m4256a((Context) this);
            onCreateSupportNavigateUpTaskStack(a);
            onPrepareSupportNavigateUpTaskStack(a);
            a.mo4085e();
            try {
                C0727a.m4239a((Activity) this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo798a(charSequence);
    }

    @C0195i0
    public C0338b onWindowStartingSupportActionMode(@C0193h0 C0339a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        C0279a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo916A()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(@C0183c0 int i) {
        getDelegate().mo816d(i);
    }

    public void setSupportActionBar(@C0195i0 Toolbar toolbar) {
        getDelegate().mo797a(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(@C0216r0 int i) {
        super.setTheme(i);
        getDelegate().mo820f(i);
    }

    @C0195i0
    public C0338b startSupportActionMode(@C0193h0 C0339a aVar) {
        return getDelegate().mo787a(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo821g();
    }

    public void supportNavigateUpTo(@C0193h0 Intent intent) {
        C0768n.m4359a((Activity) this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo813c(i);
    }

    public boolean supportShouldUpRecreateTask(@C0193h0 Intent intent) {
        return C0768n.m4362b((Activity) this, intent);
    }

    @C0206n
    public C0295d(@C0183c0 int i) {
        super(i);
    }

    public void setContentView(View view) {
        getDelegate().mo792a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo807b(view, layoutParams);
    }
}

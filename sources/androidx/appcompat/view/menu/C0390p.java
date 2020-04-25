package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p024e.p025b.C0886a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.p */
/* compiled from: MenuWrapperICS */
public class C0390p extends C0359c implements Menu {

    /* renamed from: o */
    private final C0886a f1436o;

    public C0390p(Context context, C0886a aVar) {
        super(context);
        if (aVar != null) {
            this.f1436o = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1499a(this.f1436o.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f1436o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo1499a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo1500a(this.f1436o.addSubMenu(charSequence));
    }

    public void clear() {
        mo1503d();
        this.f1436o.clear();
    }

    public void close() {
        this.f1436o.close();
    }

    public MenuItem findItem(int i) {
        return mo1499a(this.f1436o.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo1499a(this.f1436o.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f1436o.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1436o.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f1436o.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1436o.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo1501a(i);
        this.f1436o.removeGroup(i);
    }

    public void removeItem(int i) {
        mo1502b(i);
        this.f1436o.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1436o.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f1436o.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f1436o.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f1436o.setQwertyMode(z);
    }

    public int size() {
        return this.f1436o.size();
    }

    public MenuItem add(int i) {
        return mo1499a(this.f1436o.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo1500a(this.f1436o.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1499a(this.f1436o.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo1500a(this.f1436o.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1499a(this.f1436o.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo1500a(this.f1436o.addSubMenu(i, i2, i3, i4));
    }
}

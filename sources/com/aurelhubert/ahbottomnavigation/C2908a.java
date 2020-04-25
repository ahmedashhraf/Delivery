package com.aurelhubert.ahbottomnavigation;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.C0189f0;
import androidx.annotation.C0198k;
import androidx.appcompat.widget.C0512i0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.aurelhubert.ahbottomnavigation.a */
/* compiled from: AHBottomNavigationAdapter */
public class C2908a {

    /* renamed from: a */
    private Menu f10337a;

    /* renamed from: b */
    private List<C2909b> f10338b;

    public C2908a(Activity activity, @C0189f0 int i) {
        this.f10337a = new C0512i0(activity, null).mo2683d();
        activity.getMenuInflater().inflate(i, this.f10337a);
    }

    /* renamed from: a */
    public void mo11576a(AHBottomNavigation aHBottomNavigation) {
        mo11577a(aHBottomNavigation, null);
    }

    /* renamed from: b */
    public C2909b mo11578b(int i) {
        return (C2909b) this.f10338b.get(i);
    }

    /* renamed from: c */
    public Integer mo11579c(int i) {
        for (int i2 = 0; i2 < this.f10337a.size(); i2++) {
            if (this.f10337a.getItem(i2).getItemId() == i) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo11577a(AHBottomNavigation aHBottomNavigation, @C0198k int[] iArr) {
        List<C2909b> list = this.f10338b;
        if (list == null) {
            this.f10338b = new ArrayList();
        } else {
            list.clear();
        }
        if (this.f10337a != null) {
            for (int i = 0; i < this.f10337a.size(); i++) {
                MenuItem item = this.f10337a.getItem(i);
                if (iArr == null || iArr.length < this.f10337a.size() || iArr[i] == 0) {
                    this.f10338b.add(new C2909b(String.valueOf(item.getTitle()), item.getIcon()));
                } else {
                    this.f10338b.add(new C2909b(String.valueOf(item.getTitle()), item.getIcon(), iArr[i]));
                }
            }
            aHBottomNavigation.mo11515i();
            aHBottomNavigation.mo11489a(this.f10338b);
        }
    }

    /* renamed from: a */
    public MenuItem mo11575a(int i) {
        return this.f10337a.getItem(i);
    }
}

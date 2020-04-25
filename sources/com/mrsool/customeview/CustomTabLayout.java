package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.C2024a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(Context context) {
        super(context);
    }

    public void setupWithViewPager(@C0195i0 ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        try {
            C2024a adapter = viewPager.getAdapter();
            Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Semibold.otf");
            mo28139h();
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            int a = adapter.mo8886a();
            for (int i = 0; i < a; i++) {
                mo28105a(mo28126f().mo28195b(adapter.mo8888a(i)));
                AppCompatTextView appCompatTextView = (AppCompatTextView) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
                appCompatTextView.setTextSize(18.0f);
                appCompatTextView.setTextColor(-1);
                appCompatTextView.setTypeface(createFromAsset, 0);
            }
        } catch (Exception unused) {
        }
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

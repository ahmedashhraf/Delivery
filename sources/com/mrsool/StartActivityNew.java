package com.mrsool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.mrsool.C10940n.C10941a;
import com.mrsool.utils.C11644i;
import com.viewpagerindicator.CirclePageIndicator;

public class StartActivityNew extends C10787d implements OnClickListener {

    /* renamed from: S */
    private C10940n f27432S;

    /* renamed from: T */
    private ViewPager f27433T;

    /* renamed from: U */
    private CirclePageIndicator f27434U;

    /* renamed from: V */
    private TextView f27435V;

    /* renamed from: W */
    private TextView f27436W;

    /* renamed from: X */
    private LinearLayout f27437X;

    /* renamed from: Y */
    private String[] f27438Y = null;

    /* renamed from: Z */
    private int[] f27439Z = null;

    /* renamed from: a0 */
    private String[] f27440a0 = null;

    /* renamed from: b0 */
    private Uri f27441b0;

    /* renamed from: c0 */
    private String f27442c0;

    /* renamed from: d0 */
    private String f27443d0;

    /* renamed from: e0 */
    private boolean f27444e0;

    /* renamed from: f0 */
    private Bundle f27445f0;

    /* renamed from: com.mrsool.StartActivityNew$a */
    class C10248a implements C10941a {
        C10248a() {
        }

        /* renamed from: a */
        public void mo36583a() {
            StartActivityNew startActivityNew = StartActivityNew.this;
            startActivityNew.startActivity(new Intent(startActivityNew, WebviewActivity.class));
        }
    }

    /* renamed from: com.mrsool.StartActivityNew$b */
    class C10249b implements C2019j {
        C10249b() {
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            StartActivityNew.this.m47649j(i);
        }
    }

    /* renamed from: K */
    private void m47644K() {
        if (this.f29642a.mo23497S()) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(C11644i.f33324i2, "Splash");
            startActivity(intent);
            finish();
        }
    }

    /* renamed from: L */
    private void m47645L() {
        this.f27445f0 = getIntent().getExtras();
        Bundle bundle = this.f27445f0;
        if (bundle != null) {
            String str = "isFromSplash";
            if (bundle.containsKey(str)) {
                this.f27444e0 = this.f27445f0.getBoolean(str);
            }
        }
    }

    /* renamed from: M */
    private void m47646M() {
        this.f27433T.addOnPageChangeListener(new C10249b());
    }

    /* renamed from: N */
    private void m47647N() {
        this.f27437X = (LinearLayout) findViewById(C10232R.C10236id.llSkipContainer);
        if (this.f29642a.mo23496R()) {
            mo38399G();
            setRtl(this.f27437X);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m47649j(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f27436W.getLayoutParams();
        if (i == this.f27438Y.length - 1) {
            this.f27435V.setVisibility(8);
            layoutParams.width = -1;
            this.f27436W.setText(getResources().getString(C10232R.string.lbl_close));
        } else {
            this.f27435V.setVisibility(0);
            layoutParams.width = -2;
            this.f27436W.setText(getResources().getString(C10232R.string.lbl_next));
        }
        this.f27436W.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo36584J() {
        this.f29642a.mo23468C().mo23453b(C11644i.f33238Y4, Boolean.valueOf(true));
        m47645L();
        this.f27438Y = getResources().getStringArray(C10232R.array.intro_title_array_new);
        this.f27439Z = new int[]{C10232R.C10235drawable.intro_1_new, C10232R.C10235drawable.intro_2_new, C10232R.C10235drawable.intro_3_new, C10232R.C10235drawable.intro_4_new};
        this.f27440a0 = getResources().getStringArray(C10232R.array.intro_desc_array_new);
        this.f27433T = (ViewPager) findViewById(C10232R.C10236id.viewPager);
        this.f27434U = (CirclePageIndicator) findViewById(C10232R.C10236id.pagerIndicator);
        this.f27432S = new C10940n(this, this.f27438Y, this.f27439Z, this.f27440a0);
        this.f27433T.setAdapter(this.f27432S);
        this.f27432S.mo38563a(new C10248a());
        this.f27434U.setViewPager(this.f27433T);
        this.f27435V = (TextView) findViewById(C10232R.C10236id.txtSkip);
        this.f27436W = (TextView) findViewById(C10232R.C10236id.btnNext);
        this.f27435V.setOnClickListener(this);
        findViewById(C10232R.C10236id.ivNext).setOnClickListener(this);
        m47646M();
    }

    public void onBackPressed() {
        if (!this.f27444e0) {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.ivNext) {
            int currentItem = this.f27433T.getCurrentItem();
            if (currentItem != -1 && currentItem != this.f27438Y.length - 1) {
                this.f27433T.setCurrentItem(currentItem + 1);
            } else if (currentItem != this.f27438Y.length - 1) {
            } else {
                if (this.f27444e0) {
                    m47644K();
                } else {
                    finish();
                }
            }
        } else if (id == C10232R.C10236id.txtSkip) {
            if (this.f27444e0) {
                m47644K();
            } else {
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_start_new);
        m47647N();
        mo36584J();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}

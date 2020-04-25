package com.mrsool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.mrsool.C10940n.C10941a;
import com.mrsool.utils.C11644i;
import com.viewpagerindicator.CirclePageIndicator;

public class StartActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private C10940n f27416S;

    /* renamed from: T */
    private ViewPager f27417T;

    /* renamed from: U */
    private CirclePageIndicator f27418U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ImageView f27419V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f27420W;

    /* renamed from: X */
    private LinearLayout f27421X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public String[] f27422Y = null;

    /* renamed from: Z */
    private int[] f27423Z = null;

    /* renamed from: a0 */
    private String[] f27424a0 = null;

    /* renamed from: b0 */
    private Uri f27425b0;

    /* renamed from: c0 */
    private String f27426c0;

    /* renamed from: d0 */
    private String f27427d0;

    /* renamed from: e0 */
    private boolean f27428e0;

    /* renamed from: f0 */
    private Bundle f27429f0;

    /* renamed from: com.mrsool.StartActivity$a */
    class C10246a implements C10941a {
        C10246a() {
        }

        /* renamed from: a */
        public void mo36583a() {
            StartActivity startActivity = StartActivity.this;
            startActivity.startActivity(new Intent(startActivity, WebviewActivity.class));
        }
    }

    /* renamed from: com.mrsool.StartActivity$b */
    class C10247b implements C2019j {
        C10247b() {
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            if (i == StartActivity.this.f27422Y.length - 1) {
                StartActivity.this.f27420W.setText(StartActivity.this.getResources().getString(C10232R.string.lbl_close));
                StartActivity.this.f27419V.setVisibility(4);
                return;
            }
            StartActivity.this.f27420W.setText(StartActivity.this.getResources().getString(C10232R.string.lbl_skip));
            StartActivity.this.f27419V.setVisibility(0);
        }
    }

    /* renamed from: K */
    private void m47632K() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(C11644i.f33324i2, "Splash");
        startActivity(intent);
        finish();
    }

    /* renamed from: L */
    private void m47633L() {
        this.f27429f0 = getIntent().getExtras();
        Bundle bundle = this.f27429f0;
        if (bundle != null) {
            String str = "isFromSplash";
            if (bundle.containsKey(str)) {
                this.f27428e0 = this.f27429f0.getBoolean(str);
            }
        }
    }

    /* renamed from: M */
    private void m47634M() {
        this.f27417T.addOnPageChangeListener(new C10247b());
    }

    /* renamed from: N */
    private void m47635N() {
        this.f27419V = (ImageView) findViewById(C10232R.C10236id.imgArrow);
        this.f27421X = (LinearLayout) findViewById(C10232R.C10236id.llSkipContainer);
        if (this.f29642a.mo23496R()) {
            mo38399G();
            mo38405a(this.f27419V);
            setRtl(this.f27421X);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo36581J() {
        this.f29642a.mo23468C().mo23453b(C11644i.f33238Y4, Boolean.valueOf(true));
        m47633L();
        this.f27422Y = getResources().getStringArray(C10232R.array.intro_title_array);
        this.f27423Z = new int[]{C10232R.C10235drawable.intro_1, C10232R.C10235drawable.intro_2, C10232R.C10235drawable.intro_3, C10232R.C10235drawable.intro_4, C10232R.C10235drawable.intro_5};
        this.f27424a0 = getResources().getStringArray(C10232R.array.intro_desc_array);
        this.f27417T = (ViewPager) findViewById(C10232R.C10236id.viewPager);
        this.f27418U = (CirclePageIndicator) findViewById(C10232R.C10236id.pagerIndicator);
        this.f27416S = new C10940n(this, this.f27422Y, this.f27423Z, this.f27424a0);
        this.f27417T.setAdapter(this.f27416S);
        this.f27416S.mo38563a(new C10246a());
        this.f27418U.setViewPager(this.f27417T);
        this.f27419V.setOnClickListener(this);
        this.f27420W = (TextView) findViewById(C10232R.C10236id.txtSkip);
        this.f27420W.setOnClickListener(this);
        m47634M();
    }

    public void onBackPressed() {
        if (!this.f27428e0) {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.imgArrow) {
            int currentItem = this.f27417T.getCurrentItem();
            if (currentItem != -1 && currentItem != this.f27422Y.length - 1) {
                this.f27417T.setCurrentItem(currentItem + 1);
            } else if (currentItem != this.f27422Y.length - 1) {
            } else {
                if (this.f27428e0) {
                    m47632K();
                } else {
                    finish();
                }
            }
        } else if (id == C10232R.C10236id.txtSkip) {
            if (this.f27428e0) {
                m47632K();
            } else {
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_start);
        m47635N();
        mo36581J();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}

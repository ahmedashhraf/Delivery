package com.mrsool.chat;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bogdwellers.pinchtozoom.C2942c;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.io.File;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;

public class ViewPhotoFullActivity extends C10787d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ImageView f28326S;

    /* renamed from: T */
    private boolean f28327T;

    /* renamed from: U */
    private Bundle f28328U;

    /* renamed from: V */
    private String f28329V;

    /* renamed from: com.mrsool.chat.ViewPhotoFullActivity$a */
    class C10480a extends C2557j<Bitmap> {
        C10480a() {
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (!ViewPhotoFullActivity.this.isFinishing()) {
                ViewPhotoFullActivity.this.f28326S.setImageBitmap(bitmap);
                ViewPhotoFullActivity.this.f28326S.setVisibility(0);
            }
        }
    }

    /* renamed from: J */
    private void m48508J() {
        if (this.f29642a.mo23496R()) {
            mo38399G();
        }
        findViewById(C10232R.C10236id.llClose).setOnClickListener(this);
    }

    /* renamed from: K */
    private void m48509K() {
        m48510L();
    }

    /* renamed from: L */
    private void m48510L() {
        this.f28326S = (ImageView) findViewById(C10232R.C10236id.imageView);
        this.f28326S.setOnTouchListener(new C2942c(this));
        this.f28328U = getIntent().getExtras();
        Bundle bundle = this.f28328U;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33360m2)) {
                this.f28327T = this.f28328U.getBoolean(C11644i.f33360m2);
            }
            if (this.f28328U.containsKey(C11644i.f33463z1)) {
                this.f28329V = this.f28328U.getString(C11644i.f33463z1);
            }
        }
        C2232l.m11649c(getApplicationContext()).mo9514a(this.f28327T ? new File(this.f28329V) : this.f28329V).mo9441j().mo9458b(new C10480a());
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.llClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_view_photo_full);
        m48508J();
        m48509K();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }
}

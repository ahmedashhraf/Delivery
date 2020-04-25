package com.mrsool.shop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.krishna.fileloader.C10171b;
import com.krishna.fileloader.p194h.C10183b;
import com.krishna.fileloader.p405e.C10177a;
import com.krishna.fileloader.p407g.C10181b;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.customeview.TwitterVideoView.C10724c;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11668s;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import java.io.File;

public class ViewVideoFullActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private RelativeLayout f31234S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C10724c f31235T;

    /* renamed from: U */
    private C11669t f31236U;

    /* renamed from: com.mrsool.shop.ViewVideoFullActivity$a */
    class C11226a implements C11673d {

        /* renamed from: a */
        final /* synthetic */ C11668s f31237a;

        /* renamed from: com.mrsool.shop.ViewVideoFullActivity$a$a */
        class C11227a implements C10177a<File> {
            C11227a() {
            }

            /* renamed from: a */
            public void mo36448a(C10183b bVar, C10181b<File> bVar2) {
                File file = (File) bVar2.mo36458a();
                ViewVideoFullActivity.this.f31235T.f29412a.mo38177b();
                Uri fromFile = Uri.fromFile(file);
                C11226a.this.f31237a.f33575a = fromFile.getPath();
                C10724c a = ViewVideoFullActivity.this.f31235T;
                C11668s sVar = C11226a.this.f31237a;
                a.mo38204a(sVar, sVar.f33574S);
            }

            /* renamed from: a */
            public void mo36449a(C10183b bVar, Throwable th) {
            }
        }

        C11226a(C11668s sVar) {
            this.f31237a = sVar;
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            C10171b.m47256c(ViewVideoFullActivity.this).mo36428a(this.f31237a.f33575a, false).mo36427a(".mrsool", 4).mo36436b((C10177a<File>) new C11227a<File>());
        }
    }

    /* renamed from: J */
    private void m50808J() {
        if (this.f29642a.mo23496R()) {
            mo38399G();
        }
        this.f31236U = new C11669t(this);
        findViewById(C10232R.C10236id.llClose).setOnClickListener(this);
        this.f31234S = (RelativeLayout) findViewById(C10232R.C10236id.llContainerMain);
    }

    /* renamed from: K */
    private void m50809K() {
        C11668s sVar = (C11668s) getIntent().getSerializableExtra(C11644i.f33448x2);
        sVar.f33573R = false;
        this.f31235T = new C10724c(this.f31234S);
        this.f31235T.mo38204a(sVar, sVar.f33574S);
        m50811a(sVar);
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra(C11644i.f33456y2, this.f31235T.mo38199a());
        setResult(-1, intent);
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.llClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_view_video_full);
        m50808J();
        m50809K();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    private void m50811a(C11668s sVar) {
        this.f31236U.mo40036a(C11644i.f33357m, (C11673d) new C11226a(sVar));
    }
}

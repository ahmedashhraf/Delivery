package com.mrsool.shop;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import com.mrsool.C10232R;

/* renamed from: com.mrsool.shop.b */
/* compiled from: AddCardsDialog */
public class C11229b extends Dialog {

    /* renamed from: a */
    private C11231b f31241a;

    /* renamed from: com.mrsool.shop.b$a */
    /* compiled from: AddCardsDialog */
    public static class C11230a {

        /* renamed from: a */
        public String f31242a;

        /* renamed from: b */
        public String f31243b;

        /* renamed from: c */
        public String f31244c;

        public C11230a(String str, String str2, String str3) {
            this.f31242a = str;
            this.f31243b = str2;
            this.f31244c = str3;
        }
    }

    /* renamed from: com.mrsool.shop.b$b */
    /* compiled from: AddCardsDialog */
    public interface C11231b {
        /* renamed from: a */
        void mo38027a();
    }

    public C11229b(@C0193h0 Context context, C11230a aVar) {
        super(context, C10232R.style.AlertCustomerDialogStyle);
        setContentView(C10232R.layout.dialog_no_card_alert);
        ((TextView) findViewById(C10232R.C10236id.tvTitle)).setText(aVar.f31242a);
        ((TextView) findViewById(C10232R.C10236id.tvMessage)).setText(aVar.f31243b);
        ((TextView) findViewById(C10232R.C10236id.tvAddCard)).setText(aVar.f31244c);
        findViewById(C10232R.C10236id.tvAddCard).setOnClickListener(new C11228a(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo39067a(View view) {
        dismiss();
        C11231b bVar = this.f31241a;
        if (bVar != null) {
            bVar.mo38027a();
        }
    }

    /* renamed from: a */
    public void mo39068a(C11231b bVar) {
        this.f31241a = bVar;
        if (!((getContext() instanceof Activity) && ((Activity) getContext()).isFinishing())) {
            show();
        }
    }
}

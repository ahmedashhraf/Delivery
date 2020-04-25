package com.instabug.chat.p361ui;

import android.content.Context;
import android.content.Intent;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.instabug.chat.model.Attachment;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.chat.ui.b */
/* compiled from: ChatActivityLauncher */
public class C9456b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25043a;

    /* renamed from: a */
    public static Intent m44297a(Context context) {
        boolean[] a = m44300a();
        Intent intent = new Intent(context, ChatActivity.class);
        a[1] = true;
        intent.putExtra("chat_process", C13959t.f40969w2);
        a[2] = true;
        intent.addFlags(65536);
        a[3] = true;
        intent.addFlags(268435456);
        a[4] = true;
        return intent;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44300a() {
        boolean[] zArr = f25043a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9024831729046442474L, "com/instabug/chat/ui/ChatActivityLauncher", 20);
        f25043a = a;
        return a;
    }

    /* renamed from: b */
    public static Intent m44301b(Context context) {
        boolean[] a = m44300a();
        Intent intent = new Intent(context, ChatActivity.class);
        a[10] = true;
        intent.putExtra("chat_process", C13959t.f40977y2);
        a[11] = true;
        intent.addFlags(65536);
        a[12] = true;
        intent.addFlags(268435456);
        a[13] = true;
        return intent;
    }

    /* renamed from: a */
    public static Intent m44298a(Context context, String str) {
        boolean[] a = m44300a();
        Intent intent = new Intent(context, ChatActivity.class);
        a[5] = true;
        intent.putExtra("chat_process", C13959t.f40973x2);
        a[6] = true;
        intent.putExtra("chat_number", str);
        a[7] = true;
        intent.addFlags(65536);
        a[8] = true;
        intent.addFlags(268435456);
        a[9] = true;
        return intent;
    }

    /* renamed from: a */
    public static Intent m44299a(Context context, String str, Attachment attachment) {
        boolean[] a = m44300a();
        Intent intent = new Intent(context, ChatActivity.class);
        a[14] = true;
        intent.putExtra("chat_process", C13959t.f40768A2);
        a[15] = true;
        intent.putExtra("chat_number", str);
        a[16] = true;
        intent.putExtra(MessengerShareContentUtility.ATTACHMENT, attachment);
        a[17] = true;
        intent.addFlags(65536);
        a[18] = true;
        intent.addFlags(268435456);
        a[19] = true;
        return intent;
    }
}

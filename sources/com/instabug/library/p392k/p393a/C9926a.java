package com.instabug.library.p392k.p393a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.invocation.invocationdialog.InstabugDialogListener;
import com.instabug.library.invocation.invocationdialog.InstabugDialogListener.InstabugDialogCallbacks;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import java.util.ArrayList;
import java.util.Iterator;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.k.a.a */
/* compiled from: PromptOptionsLauncher */
public class C9926a implements InstabugDialogCallbacks {

    /* renamed from: a */
    private static C9926a f26386a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26387b;

    public C9926a() {
        m46182b()[0] = true;
    }

    /* renamed from: a */
    public static C9926a m46180a() {
        boolean[] b = m46182b();
        C9926a aVar = f26386a;
        if (aVar == null) {
            aVar = new C9926a();
            f26386a = aVar;
            b[1] = true;
        } else {
            b[2] = true;
        }
        b[3] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46182b() {
        boolean[] zArr = f26387b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4449617445572724346L, "com/instabug/library/ui/promptoptions/PromptOptionsLauncher", 25);
        f26387b = a;
        return a;
    }

    public void onClick(int i, String str, Uri uri) {
        boolean[] b = m46182b();
        if (uri != null) {
            b[21] = true;
            ((PluginPromptOption) InvocationManager.getInstance().getAvailablePromptOptions().get(i)).invoke(uri);
            b[22] = true;
        } else {
            ((PluginPromptOption) InvocationManager.getInstance().getAvailablePromptOptions().get(i)).invoke();
            b[23] = true;
        }
        b[24] = true;
    }

    /* renamed from: a */
    public void mo35260a(Activity activity, Uri uri) {
        boolean[] b = m46182b();
        InstabugDialogListener.getInstance().setListener(this);
        b[4] = true;
        ArrayList availablePromptOptions = InvocationManager.getInstance().getAvailablePromptOptions();
        b[5] = true;
        ArrayList arrayList = new ArrayList();
        b[6] = true;
        Iterator it = availablePromptOptions.iterator();
        b[7] = true;
        while (it.hasNext()) {
            PluginPromptOption pluginPromptOption = (PluginPromptOption) it.next();
            b[8] = true;
            InstabugDialogItem instabugDialogItem = new InstabugDialogItem();
            b[9] = true;
            instabugDialogItem.setResDrawable(pluginPromptOption.getIcon());
            b[10] = true;
            instabugDialogItem.setTitle(pluginPromptOption.getTitle());
            b[11] = true;
            instabugDialogItem.setBadge(pluginPromptOption.getNotificationCount());
            b[12] = true;
            arrayList.add(instabugDialogItem);
            b[13] = true;
        }
        b[14] = true;
        String a = m46181a(activity);
        b[15] = true;
        Intent intent = InstabugDialogActivity.getIntent(activity, a, uri, arrayList, false);
        b[16] = true;
        activity.startActivity(intent);
        b[17] = true;
    }

    /* renamed from: a */
    private String m46181a(Context context) {
        boolean[] b = m46182b();
        Key key = Key.INVOCATION_HEADER;
        b[18] = true;
        String localeStringResource = LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), C9700R.string.instabug_str_invocation_dialog_title, context);
        b[19] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, localeStringResource);
        b[20] = true;
        return placeHolder;
    }
}

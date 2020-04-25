package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.p177g.p178a.C5495a;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.plus.f */
public final class C5493f {
    @Deprecated

    /* renamed from: a */
    public static final String f15773a = "com.google.android.apps.plus.CONTENT_URL";
    @Deprecated

    /* renamed from: b */
    public static final String f15774b = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
    @Deprecated

    /* renamed from: c */
    public static final String f15775c = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
    @Deprecated

    /* renamed from: d */
    public static final String f15776d = "title";
    @Deprecated

    /* renamed from: e */
    public static final String f15777e = "description";
    @Deprecated

    /* renamed from: f */
    public static final String f15778f = "thumbnailUrl";
    @Deprecated

    /* renamed from: g */
    public static final String f15779g = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
    @Deprecated

    /* renamed from: h */
    public static final String f15780h = "com.google.android.apps.plus.CALL_TO_ACTION";
    @Deprecated

    /* renamed from: i */
    public static final String f15781i = "label";
    @Deprecated

    /* renamed from: j */
    public static final String f15782j = "url";
    @Deprecated

    /* renamed from: k */
    public static final String f15783k = "deepLinkId";
    @Deprecated

    /* renamed from: l */
    public static final String f15784l = "com.google.android.apps.plus.SENDER_ID";
    @Deprecated

    /* renamed from: m */
    public static final String f15785m = "deep_link_id";

    @Deprecated
    @C4476d0
    /* renamed from: com.google.android.gms.plus.f$a */
    public static class C5494a {

        /* renamed from: a */
        private final Context f15786a;

        /* renamed from: b */
        private final Intent f15787b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c */
        private boolean f15788c;

        /* renamed from: d */
        private ArrayList<Uri> f15789d;

        @Deprecated
        public C5494a(Activity activity) {
            this.f15786a = activity;
            this.f15787b.addFlags(524288);
            if (activity != null && activity.getComponentName() != null) {
                this.f15788c = true;
            }
        }

        @Deprecated
        public C5494a(Context context) {
            this.f15786a = context;
        }

        @Deprecated
        /* renamed from: a */
        public Intent mo21906a() {
            ArrayList<Uri> arrayList = this.f15789d;
            boolean z = true;
            boolean z2 = arrayList != null && arrayList.size() > 1;
            String str = "android.intent.action.SEND_MULTIPLE";
            boolean equals = str.equals(this.f15787b.getAction());
            boolean booleanExtra = this.f15787b.getBooleanExtra(C5493f.f15779g, false);
            C4300a0.m18632b(!z2 || !booleanExtra, "Call-to-action buttons are only available for URLs.");
            String str2 = C5493f.f15773a;
            C4300a0.m18632b(!booleanExtra || this.f15787b.hasExtra(str2), "The content URL is required for interactive posts.");
            String str3 = C5493f.f15774b;
            if (booleanExtra && !this.f15787b.hasExtra(str2) && !this.f15787b.hasExtra(str3)) {
                z = false;
            }
            C4300a0.m18632b(z, "Must set content URL or content deep-link ID to use a call-to-action button.");
            if (this.f15787b.hasExtra(str3)) {
                C4300a0.m18632b(C5493f.m23920a(this.f15787b.getStringExtra(str3)), "The specified deep-link ID was malformed.");
            }
            String str4 = "android.intent.extra.STREAM";
            if (!z2 && equals) {
                this.f15787b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList2 = this.f15789d;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.f15787b.removeExtra(str4);
                } else {
                    this.f15787b.putExtra(str4, (Parcelable) this.f15789d.get(0));
                }
                this.f15789d = null;
            }
            if (z2 && !equals) {
                this.f15787b.setAction(str);
                ArrayList<Uri> arrayList3 = this.f15789d;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    this.f15787b.removeExtra(str4);
                } else {
                    this.f15787b.putParcelableArrayListExtra(str4, this.f15789d);
                }
            }
            String str5 = "com.google.android.gms";
            if (!"com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(this.f15787b.getAction())) {
                if (!this.f15787b.hasExtra(str4)) {
                    this.f15787b.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
                } else {
                    this.f15787b.setPackage("com.google.android.apps.plus");
                    return this.f15787b;
                }
            }
            this.f15787b.setPackage(str5);
            return this.f15787b;
        }

        @Deprecated
        /* renamed from: a */
        public C5494a mo21907a(Uri uri) {
            Uri uri2 = (Uri) this.f15787b.getParcelableExtra("android.intent.extra.STREAM");
            if (uri2 == null) {
                return mo21915c(uri);
            }
            if (this.f15789d == null) {
                this.f15789d = new ArrayList<>();
            }
            this.f15789d.add(uri2);
            this.f15789d.add(uri);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C5494a mo21908a(C5495a aVar, List<C5495a> list) {
            this.f15787b.putExtra(C5493f.f15784l, aVar != null ? aVar.getId() : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            int size = list != null ? list.size() : 0;
            String str = "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES";
            String str2 = "com.google.android.apps.plus.RECIPIENT_IDS";
            if (size == 0) {
                this.f15787b.removeExtra(str2);
                this.f15787b.removeExtra(str);
                return this;
            }
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (C5495a aVar2 : list) {
                arrayList.add(aVar2.getId());
                arrayList2.add(aVar2.mo19862s());
            }
            this.f15787b.putStringArrayListExtra(str2, arrayList);
            this.f15787b.putStringArrayListExtra(str, arrayList2);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C5494a mo21909a(CharSequence charSequence) {
            this.f15787b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C5494a mo21910a(String str) {
            return mo21912a(str, null, null, null);
        }

        @Deprecated
        /* renamed from: a */
        public C5494a mo21911a(String str, Uri uri, String str2) {
            C4300a0.m18632b(this.f15788c, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
            C4300a0.m18628a(uri != null && !TextUtils.isEmpty(uri.toString()), (Object) "Must provide a call to action URL");
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(C5493f.f15781i, str);
            }
            bundle.putString("url", uri.toString());
            if (!TextUtils.isEmpty(str2)) {
                C4300a0.m18632b(C5493f.m23920a(str2), "The specified deep-link ID was malformed.");
                bundle.putString(C5493f.f15783k, str2);
            }
            this.f15787b.putExtra(C5493f.f15780h, bundle);
            this.f15787b.putExtra(C5493f.f15779g, true);
            this.f15787b.setType("text/plain");
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C5494a mo21912a(String str, String str2, String str3, Uri uri) {
            C4300a0.m18628a(this.f15788c, (Object) "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
            C4300a0.m18628a(!TextUtils.isEmpty(str), (Object) "The deepLinkId parameter is required.");
            Bundle bundle = new Bundle();
            bundle.putString("title", str2);
            bundle.putString("description", str3);
            if (uri != null) {
                bundle.putString(C5493f.f15778f, uri.toString());
            }
            this.f15787b.putExtra(C5493f.f15774b, str);
            this.f15787b.putExtra(C5493f.f15775c, bundle);
            this.f15787b.setType("text/plain");
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C5494a mo21913b(Uri uri) {
            String uri2 = uri != null ? uri.toString() : null;
            boolean isEmpty = TextUtils.isEmpty(uri2);
            String str = C5493f.f15773a;
            if (isEmpty) {
                this.f15787b.removeExtra(str);
            } else {
                this.f15787b.putExtra(str, uri2);
            }
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C5494a mo21914b(String str) {
            this.f15787b.setType(str);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C5494a mo21915c(Uri uri) {
            this.f15789d = null;
            this.f15787b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }
    }

    @Deprecated
    protected C5493f() {
        throw new AssertionError();
    }

    @Deprecated
    @C4476d0
    /* renamed from: a */
    public static C5495a m23918a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
        } else if (!TextUtils.isEmpty(str2)) {
            zzr zzr = new zzr(str2, str, null, 0, null);
            return zzr;
        } else {
            throw new IllegalArgumentException("Display name must not be empty.");
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m23919a(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return null;
        }
        return intent.getData().getQueryParameter(f15785m);
    }

    @C4476d0
    /* renamed from: a */
    protected static boolean m23920a(String str) {
        return !TextUtils.isEmpty(str) && !str.contains(C3868i.f12248b);
    }
}

package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.C0721R;
import androidx.core.app.C0805v.C0806a;
import androidx.core.p031j.C0908a;
import androidx.core.p034l.C0962e0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.p */
/* compiled from: NotificationCompat */
public class C0770p {

    /* renamed from: A */
    public static final String f3485A = "android.summaryText";

    /* renamed from: B */
    public static final String f3486B = "android.bigText";

    /* renamed from: C */
    public static final String f3487C = "android.icon";

    /* renamed from: D */
    public static final String f3488D = "android.largeIcon";

    /* renamed from: E */
    public static final String f3489E = "android.largeIcon.big";

    /* renamed from: F */
    public static final String f3490F = "android.progress";

    /* renamed from: G */
    public static final String f3491G = "android.progressMax";

    /* renamed from: H */
    public static final String f3492H = "android.progressIndeterminate";

    /* renamed from: I */
    public static final String f3493I = "android.showChronometer";

    /* renamed from: J */
    public static final String f3494J = "android.showWhen";

    /* renamed from: K */
    public static final String f3495K = "android.picture";

    /* renamed from: L */
    public static final String f3496L = "android.textLines";

    /* renamed from: M */
    public static final String f3497M = "android.template";

    /* renamed from: N */
    public static final String f3498N = "android.people";

    /* renamed from: O */
    public static final String f3499O = "android.backgroundImageUri";

    /* renamed from: P */
    public static final String f3500P = "android.mediaSession";

    /* renamed from: Q */
    public static final String f3501Q = "android.compactActions";

    /* renamed from: R */
    public static final String f3502R = "android.selfDisplayName";

    /* renamed from: S */
    public static final String f3503S = "android.messagingStyleUser";

    /* renamed from: T */
    public static final String f3504T = "android.conversationTitle";

    /* renamed from: U */
    public static final String f3505U = "android.messages";

    /* renamed from: V */
    public static final String f3506V = "android.isGroupConversation";

    /* renamed from: W */
    public static final String f3507W = "android.hiddenConversationTitle";

    /* renamed from: X */
    public static final String f3508X = "android.audioContents";
    @C0198k

    /* renamed from: Y */
    public static final int f3509Y = 0;

    /* renamed from: Z */
    public static final int f3510Z = 1;

    /* renamed from: a */
    public static final int f3511a = -1;

    /* renamed from: a0 */
    public static final int f3512a0 = 0;

    /* renamed from: b */
    public static final int f3513b = 1;

    /* renamed from: b0 */
    public static final int f3514b0 = -1;

    /* renamed from: c */
    public static final int f3515c = 2;

    /* renamed from: c0 */
    public static final String f3516c0 = "call";

    /* renamed from: d */
    public static final int f3517d = 4;

    /* renamed from: d0 */
    public static final String f3518d0 = "navigation";

    /* renamed from: e */
    public static final int f3519e = -1;

    /* renamed from: e0 */
    public static final String f3520e0 = "msg";

    /* renamed from: f */
    public static final int f3521f = 1;

    /* renamed from: f0 */
    public static final String f3522f0 = "email";

    /* renamed from: g */
    public static final int f3523g = 2;

    /* renamed from: g0 */
    public static final String f3524g0 = "event";

    /* renamed from: h */
    public static final int f3525h = 4;

    /* renamed from: h0 */
    public static final String f3526h0 = "promo";

    /* renamed from: i */
    public static final int f3527i = 8;

    /* renamed from: i0 */
    public static final String f3528i0 = "alarm";

    /* renamed from: j */
    public static final int f3529j = 16;

    /* renamed from: j0 */
    public static final String f3530j0 = "progress";

    /* renamed from: k */
    public static final int f3531k = 32;

    /* renamed from: k0 */
    public static final String f3532k0 = "social";

    /* renamed from: l */
    public static final int f3533l = 64;

    /* renamed from: l0 */
    public static final String f3534l0 = "err";
    @Deprecated

    /* renamed from: m */
    public static final int f3535m = 128;

    /* renamed from: m0 */
    public static final String f3536m0 = "transport";

    /* renamed from: n */
    public static final int f3537n = 256;

    /* renamed from: n0 */
    public static final String f3538n0 = "sys";

    /* renamed from: o */
    public static final int f3539o = 512;

    /* renamed from: o0 */
    public static final String f3540o0 = "service";

    /* renamed from: p */
    public static final int f3541p = 0;

    /* renamed from: p0 */
    public static final String f3542p0 = "reminder";

    /* renamed from: q */
    public static final int f3543q = -1;

    /* renamed from: q0 */
    public static final String f3544q0 = "recommendation";

    /* renamed from: r */
    public static final int f3545r = -2;

    /* renamed from: r0 */
    public static final String f3546r0 = "status";

    /* renamed from: s */
    public static final int f3547s = 1;

    /* renamed from: s0 */
    public static final int f3548s0 = 0;

    /* renamed from: t */
    public static final int f3549t = 2;

    /* renamed from: t0 */
    public static final int f3550t0 = 1;

    /* renamed from: u */
    public static final String f3551u = "android.title";

    /* renamed from: u0 */
    public static final int f3552u0 = 2;

    /* renamed from: v */
    public static final String f3553v = "android.title.big";

    /* renamed from: v0 */
    public static final int f3554v0 = 0;

    /* renamed from: w */
    public static final String f3555w = "android.text";

    /* renamed from: w0 */
    public static final int f3556w0 = 1;

    /* renamed from: x */
    public static final String f3557x = "android.subText";

    /* renamed from: x0 */
    public static final int f3558x0 = 2;

    /* renamed from: y */
    public static final String f3559y = "android.remoteInputHistory";

    /* renamed from: z */
    public static final String f3560z = "android.infoText";

    /* renamed from: androidx.core.app.p$a */
    /* compiled from: NotificationCompat */
    public static class C0771a {

        /* renamed from: j */
        public static final int f3561j = 0;

        /* renamed from: k */
        public static final int f3562k = 1;

        /* renamed from: l */
        public static final int f3563l = 2;

        /* renamed from: m */
        public static final int f3564m = 3;

        /* renamed from: n */
        public static final int f3565n = 4;

        /* renamed from: o */
        public static final int f3566o = 5;

        /* renamed from: p */
        public static final int f3567p = 6;

        /* renamed from: q */
        public static final int f3568q = 7;

        /* renamed from: r */
        public static final int f3569r = 8;

        /* renamed from: s */
        public static final int f3570s = 9;

        /* renamed from: t */
        public static final int f3571t = 10;

        /* renamed from: u */
        static final String f3572u = "android.support.action.showsUserInterface";

        /* renamed from: v */
        static final String f3573v = "android.support.action.semanticAction";

        /* renamed from: a */
        final Bundle f3574a;

        /* renamed from: b */
        private final C0807w[] f3575b;

        /* renamed from: c */
        private final C0807w[] f3576c;

        /* renamed from: d */
        private boolean f3577d;

        /* renamed from: e */
        boolean f3578e;

        /* renamed from: f */
        private final int f3579f;

        /* renamed from: g */
        public int f3580g;

        /* renamed from: h */
        public CharSequence f3581h;

        /* renamed from: i */
        public PendingIntent f3582i;

        /* renamed from: androidx.core.app.p$a$a */
        /* compiled from: NotificationCompat */
        public static final class C0772a {

            /* renamed from: a */
            private final int f3583a;

            /* renamed from: b */
            private final CharSequence f3584b;

            /* renamed from: c */
            private final PendingIntent f3585c;

            /* renamed from: d */
            private boolean f3586d;

            /* renamed from: e */
            private final Bundle f3587e;

            /* renamed from: f */
            private ArrayList<C0807w> f3588f;

            /* renamed from: g */
            private int f3589g;

            /* renamed from: h */
            private boolean f3590h;

            public C0772a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            /* renamed from: a */
            public C0772a mo4167a(Bundle bundle) {
                if (bundle != null) {
                    this.f3587e.putAll(bundle);
                }
                return this;
            }

            /* renamed from: b */
            public Bundle mo4172b() {
                return this.f3587e;
            }

            public C0772a(C0771a aVar) {
                this(aVar.f3580g, aVar.f3581h, aVar.f3582i, new Bundle(aVar.f3574a), aVar.mo4162f(), aVar.mo4158b(), aVar.mo4163g(), aVar.f3578e);
            }

            /* renamed from: a */
            public C0772a mo4169a(C0807w wVar) {
                if (this.f3588f == null) {
                    this.f3588f = new ArrayList<>();
                }
                this.f3588f.add(wVar);
                return this;
            }

            /* renamed from: b */
            public C0772a mo4173b(boolean z) {
                this.f3590h = z;
                return this;
            }

            /* renamed from: a */
            public C0772a mo4170a(boolean z) {
                this.f3586d = z;
                return this;
            }

            private C0772a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0807w[] wVarArr, boolean z, int i2, boolean z2) {
                ArrayList<C0807w> arrayList;
                this.f3586d = true;
                this.f3590h = true;
                this.f3583a = i;
                this.f3584b = C0779e.m4425f(charSequence);
                this.f3585c = pendingIntent;
                this.f3587e = bundle;
                if (wVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(wVarArr));
                }
                this.f3588f = arrayList;
                this.f3586d = z;
                this.f3589g = i2;
                this.f3590h = z2;
            }

            /* renamed from: a */
            public C0772a mo4166a(int i) {
                this.f3589g = i;
                return this;
            }

            /* renamed from: a */
            public C0772a mo4168a(C0773b bVar) {
                bVar.mo4174a(this);
                return this;
            }

            /* renamed from: a */
            public C0771a mo4171a() {
                C0807w[] wVarArr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C0807w> arrayList3 = this.f3588f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C0807w wVar = (C0807w) it.next();
                        if (wVar.mo4408g()) {
                            arrayList.add(wVar);
                        } else {
                            arrayList2.add(wVar);
                        }
                    }
                }
                C0807w[] wVarArr2 = null;
                if (arrayList.isEmpty()) {
                    wVarArr = null;
                } else {
                    wVarArr = (C0807w[]) arrayList.toArray(new C0807w[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    wVarArr2 = (C0807w[]) arrayList2.toArray(new C0807w[arrayList2.size()]);
                }
                C0771a aVar = new C0771a(this.f3583a, this.f3584b, this.f3585c, this.f3587e, wVarArr2, wVarArr, this.f3586d, this.f3589g, this.f3590h);
                return aVar;
            }
        }

        /* renamed from: androidx.core.app.p$a$b */
        /* compiled from: NotificationCompat */
        public interface C0773b {
            /* renamed from: a */
            C0772a mo4174a(C0772a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.core.app.p$a$c */
        /* compiled from: NotificationCompat */
        public @interface C0774c {
        }

        /* renamed from: androidx.core.app.p$a$d */
        /* compiled from: NotificationCompat */
        public static final class C0775d implements C0773b {

            /* renamed from: e */
            private static final String f3591e = "android.wearable.EXTENSIONS";

            /* renamed from: f */
            private static final String f3592f = "flags";

            /* renamed from: g */
            private static final String f3593g = "inProgressLabel";

            /* renamed from: h */
            private static final String f3594h = "confirmLabel";

            /* renamed from: i */
            private static final String f3595i = "cancelLabel";

            /* renamed from: j */
            private static final int f3596j = 1;

            /* renamed from: k */
            private static final int f3597k = 2;

            /* renamed from: l */
            private static final int f3598l = 4;

            /* renamed from: m */
            private static final int f3599m = 1;

            /* renamed from: a */
            private int f3600a = 1;

            /* renamed from: b */
            private CharSequence f3601b;

            /* renamed from: c */
            private CharSequence f3602c;

            /* renamed from: d */
            private CharSequence f3603d;

            public C0775d() {
            }

            /* renamed from: a */
            public C0772a mo4174a(C0772a aVar) {
                Bundle bundle = new Bundle();
                int i = this.f3600a;
                if (i != 1) {
                    bundle.putInt(f3592f, i);
                }
                CharSequence charSequence = this.f3601b;
                if (charSequence != null) {
                    bundle.putCharSequence(f3593g, charSequence);
                }
                CharSequence charSequence2 = this.f3602c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f3594h, charSequence2);
                }
                CharSequence charSequence3 = this.f3603d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f3595i, charSequence3);
                }
                aVar.mo4172b().putBundle(f3591e, bundle);
                return aVar;
            }

            @Deprecated
            /* renamed from: b */
            public C0775d mo4178b(CharSequence charSequence) {
                this.f3602c = charSequence;
                return this;
            }

            @Deprecated
            /* renamed from: c */
            public C0775d mo4181c(CharSequence charSequence) {
                this.f3601b = charSequence;
                return this;
            }

            /* renamed from: d */
            public boolean mo4185d() {
                return (this.f3600a & 2) != 0;
            }

            @Deprecated
            /* renamed from: e */
            public CharSequence mo4186e() {
                return this.f3601b;
            }

            /* renamed from: f */
            public boolean mo4187f() {
                return (this.f3600a & 1) != 0;
            }

            @Deprecated
            /* renamed from: b */
            public CharSequence mo4180b() {
                return this.f3602c;
            }

            /* renamed from: c */
            public C0775d mo4182c(boolean z) {
                m4400a(2, z);
                return this;
            }

            public C0775d clone() {
                C0775d dVar = new C0775d();
                dVar.f3600a = this.f3600a;
                dVar.f3601b = this.f3601b;
                dVar.f3602c = this.f3602c;
                dVar.f3603d = this.f3603d;
                return dVar;
            }

            public C0775d(C0771a aVar) {
                Bundle bundle = aVar.mo4160d().getBundle(f3591e);
                if (bundle != null) {
                    this.f3600a = bundle.getInt(f3592f, 1);
                    this.f3601b = bundle.getCharSequence(f3593g);
                    this.f3602c = bundle.getCharSequence(f3594h);
                    this.f3603d = bundle.getCharSequence(f3595i);
                }
            }

            /* renamed from: b */
            public C0775d mo4179b(boolean z) {
                m4400a(4, z);
                return this;
            }

            /* renamed from: c */
            public boolean mo4183c() {
                return (this.f3600a & 4) != 0;
            }

            /* renamed from: a */
            public C0775d mo4176a(boolean z) {
                m4400a(1, z);
                return this;
            }

            /* renamed from: a */
            private void m4400a(int i, boolean z) {
                if (z) {
                    this.f3600a = i | this.f3600a;
                    return;
                }
                this.f3600a = (i ^ -1) & this.f3600a;
            }

            @Deprecated
            /* renamed from: a */
            public C0775d mo4175a(CharSequence charSequence) {
                this.f3603d = charSequence;
                return this;
            }

            @Deprecated
            /* renamed from: a */
            public CharSequence mo4177a() {
                return this.f3603d;
            }
        }

        public C0771a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        /* renamed from: a */
        public PendingIntent mo4157a() {
            return this.f3582i;
        }

        /* renamed from: b */
        public boolean mo4158b() {
            return this.f3577d;
        }

        /* renamed from: c */
        public C0807w[] mo4159c() {
            return this.f3576c;
        }

        /* renamed from: d */
        public Bundle mo4160d() {
            return this.f3574a;
        }

        /* renamed from: e */
        public int mo4161e() {
            return this.f3580g;
        }

        /* renamed from: f */
        public C0807w[] mo4162f() {
            return this.f3575b;
        }

        /* renamed from: g */
        public int mo4163g() {
            return this.f3579f;
        }

        /* renamed from: h */
        public boolean mo4164h() {
            return this.f3578e;
        }

        /* renamed from: i */
        public CharSequence mo4165i() {
            return this.f3581h;
        }

        C0771a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0807w[] wVarArr, C0807w[] wVarArr2, boolean z, int i2, boolean z2) {
            this.f3578e = true;
            this.f3580g = i;
            this.f3581h = C0779e.m4425f(charSequence);
            this.f3582i = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f3574a = bundle;
            this.f3575b = wVarArr;
            this.f3576c = wVarArr2;
            this.f3577d = z;
            this.f3579f = i2;
            this.f3578e = z2;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.p$b */
    /* compiled from: NotificationCompat */
    public @interface C0776b {
    }

    /* renamed from: androidx.core.app.p$c */
    /* compiled from: NotificationCompat */
    public static class C0777c extends C0791n {

        /* renamed from: e */
        private Bitmap f3604e;

        /* renamed from: f */
        private Bitmap f3605f;

        /* renamed from: g */
        private boolean f3606g;

        public C0777c() {
        }

        /* renamed from: a */
        public C0777c mo4189a(CharSequence charSequence) {
            this.f3700b = C0779e.m4425f(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0777c mo4192b(CharSequence charSequence) {
            this.f3701c = C0779e.m4425f(charSequence);
            this.f3702d = true;
            return this;
        }

        public C0777c(C0779e eVar) {
            mo4308a(eVar);
        }

        /* renamed from: a */
        public C0777c mo4188a(Bitmap bitmap) {
            this.f3605f = bitmap;
            this.f3606g = true;
            return this;
        }

        /* renamed from: b */
        public C0777c mo4191b(Bitmap bitmap) {
            this.f3604e = bitmap;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(oVar.mo4156a()).setBigContentTitle(this.f3700b).bigPicture(this.f3604e);
                if (this.f3606g) {
                    bigPicture.bigLargeIcon(this.f3605f);
                }
                if (this.f3702d) {
                    bigPicture.setSummaryText(this.f3701c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.p$d */
    /* compiled from: NotificationCompat */
    public static class C0778d extends C0791n {

        /* renamed from: e */
        private CharSequence f3607e;

        public C0778d() {
        }

        /* renamed from: a */
        public C0778d mo4193a(CharSequence charSequence) {
            this.f3607e = C0779e.m4425f(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0778d mo4194b(CharSequence charSequence) {
            this.f3700b = C0779e.m4425f(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0778d mo4195c(CharSequence charSequence) {
            this.f3701c = C0779e.m4425f(charSequence);
            this.f3702d = true;
            return this;
        }

        public C0778d(C0779e eVar) {
            mo4308a(eVar);
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(oVar.mo4156a()).setBigContentTitle(this.f3700b).bigText(this.f3607e);
                if (this.f3702d) {
                    bigText.setSummaryText(this.f3701c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.p$e */
    /* compiled from: NotificationCompat */
    public static class C0779e {

        /* renamed from: P */
        private static final int f3608P = 5120;

        /* renamed from: A */
        String f3609A;

        /* renamed from: B */
        Bundle f3610B;

        /* renamed from: C */
        int f3611C;

        /* renamed from: D */
        int f3612D;

        /* renamed from: E */
        Notification f3613E;

        /* renamed from: F */
        RemoteViews f3614F;

        /* renamed from: G */
        RemoteViews f3615G;

        /* renamed from: H */
        RemoteViews f3616H;

        /* renamed from: I */
        String f3617I;

        /* renamed from: J */
        int f3618J;

        /* renamed from: K */
        String f3619K;

        /* renamed from: L */
        long f3620L;

        /* renamed from: M */
        int f3621M;

        /* renamed from: N */
        Notification f3622N;
        @Deprecated

        /* renamed from: O */
        public ArrayList<String> f3623O;
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a */
        public Context f3624a;
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: b */
        public ArrayList<C0771a> f3625b;

        /* renamed from: c */
        ArrayList<C0771a> f3626c;

        /* renamed from: d */
        CharSequence f3627d;

        /* renamed from: e */
        CharSequence f3628e;

        /* renamed from: f */
        PendingIntent f3629f;

        /* renamed from: g */
        PendingIntent f3630g;

        /* renamed from: h */
        RemoteViews f3631h;

        /* renamed from: i */
        Bitmap f3632i;

        /* renamed from: j */
        CharSequence f3633j;

        /* renamed from: k */
        int f3634k;

        /* renamed from: l */
        int f3635l;

        /* renamed from: m */
        boolean f3636m;

        /* renamed from: n */
        boolean f3637n;

        /* renamed from: o */
        C0791n f3638o;

        /* renamed from: p */
        CharSequence f3639p;

        /* renamed from: q */
        CharSequence[] f3640q;

        /* renamed from: r */
        int f3641r;

        /* renamed from: s */
        int f3642s;

        /* renamed from: t */
        boolean f3643t;

        /* renamed from: u */
        String f3644u;

        /* renamed from: v */
        boolean f3645v;

        /* renamed from: w */
        String f3646w;

        /* renamed from: x */
        boolean f3647x;

        /* renamed from: y */
        boolean f3648y;

        /* renamed from: z */
        boolean f3649z;

        public C0779e(@C0193h0 Context context, @C0193h0 String str) {
            this.f3625b = new ArrayList<>();
            this.f3626c = new ArrayList<>();
            this.f3636m = true;
            this.f3647x = false;
            this.f3611C = 0;
            this.f3612D = 0;
            this.f3618J = 0;
            this.f3621M = 0;
            this.f3622N = new Notification();
            this.f3624a = context;
            this.f3617I = str;
            this.f3622N.when = System.currentTimeMillis();
            this.f3622N.audioStreamType = -1;
            this.f3635l = 0;
            this.f3623O = new ArrayList<>();
        }

        /* renamed from: a */
        public C0779e mo4198a(int i, int i2) {
            Notification notification = this.f3622N;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        /* renamed from: b */
        public C0779e mo4223b(long j) {
            this.f3622N.when = j;
            return this;
        }

        /* renamed from: c */
        public C0779e mo4234c(CharSequence charSequence) {
            this.f3627d = m4425f(charSequence);
            return this;
        }

        /* renamed from: d */
        public C0779e mo4240d(CharSequence charSequence) {
            this.f3639p = m4425f(charSequence);
            return this;
        }

        /* renamed from: e */
        public C0779e mo4244e(int i) {
            this.f3634k = i;
            return this;
        }

        /* renamed from: f */
        public C0779e mo4251f(boolean z) {
            m4423a(8, z);
            return this;
        }

        /* renamed from: g */
        public C0779e mo4254g(boolean z) {
            this.f3636m = z;
            return this;
        }

        /* renamed from: h */
        public C0779e mo4257h(boolean z) {
            this.f3637n = z;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: i */
        public long mo4258i() {
            if (this.f3636m) {
                return this.f3622N.when;
            }
            return 0;
        }

        /* renamed from: b */
        public C0779e mo4228b(CharSequence charSequence) {
            this.f3628e = m4425f(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0779e mo4232c(int i) {
            Notification notification = this.f3622N;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: d */
        public C0779e mo4242d(boolean z) {
            this.f3647x = z;
            return this;
        }

        /* renamed from: e */
        public C0779e mo4245e(CharSequence charSequence) {
            this.f3622N.tickerText = m4425f(charSequence);
            return this;
        }

        /* renamed from: f */
        public C0779e mo4249f(int i) {
            this.f3635l = i;
            return this;
        }

        /* renamed from: g */
        public C0779e mo4253g(int i) {
            this.f3622N.icon = i;
            return this;
        }

        /* renamed from: h */
        public C0779e mo4256h(int i) {
            this.f3612D = i;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4219a(CharSequence[] charSequenceArr) {
            this.f3640q = charSequenceArr;
            return this;
        }

        /* renamed from: b */
        public C0779e mo4224b(PendingIntent pendingIntent) {
            this.f3622N.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: d */
        public C0779e mo4241d(String str) {
            this.f3644u = str;
            return this;
        }

        /* renamed from: e */
        public C0779e mo4247e(boolean z) {
            m4423a(2, z);
            return this;
        }

        /* renamed from: f */
        public C0779e mo4250f(String str) {
            this.f3646w = str;
            return this;
        }

        @Deprecated
        /* renamed from: g */
        public Notification mo4252g() {
            return mo4196a();
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: h */
        public int mo4255h() {
            return this.f3635l;
        }

        /* renamed from: b */
        private Bitmap m4424b(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.f3624a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C0721R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C0721R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double d = (double) dimensionPixelSize;
                double max = (double) Math.max(1, bitmap.getWidth());
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double d3 = (double) dimensionPixelSize2;
                double max2 = (double) Math.max(1, bitmap.getHeight());
                Double.isNaN(d3);
                Double.isNaN(max2);
                double min = Math.min(d2, d3 / max2);
                double width = (double) bitmap.getWidth();
                Double.isNaN(width);
                int ceil = (int) Math.ceil(width * min);
                double height = (double) bitmap.getHeight();
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
            }
            return bitmap;
        }

        /* renamed from: f */
        protected static CharSequence m4425f(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > f3608P) {
                charSequence = charSequence.subSequence(0, f3608P);
            }
            return charSequence;
        }

        /* renamed from: a */
        public C0779e mo4214a(CharSequence charSequence) {
            this.f3633j = m4425f(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0779e mo4236c(boolean z) {
            this.f3645v = z;
            return this;
        }

        /* renamed from: d */
        public C0779e mo4239d(RemoteViews remoteViews) {
            this.f3616H = remoteViews;
            return this;
        }

        /* renamed from: e */
        public Bundle mo4243e() {
            if (this.f3610B == null) {
                this.f3610B = new Bundle();
            }
            return this.f3610B;
        }

        /* renamed from: a */
        public C0779e mo4200a(int i, int i2, boolean z) {
            this.f3641r = i;
            this.f3642s = i2;
            this.f3643t = z;
            return this;
        }

        /* renamed from: c */
        public C0779e mo4233c(RemoteViews remoteViews) {
            this.f3614F = remoteViews;
            return this;
        }

        /* renamed from: d */
        public C0779e mo4238d(int i) {
            this.f3621M = i;
            return this;
        }

        /* renamed from: c */
        public C0779e mo4235c(@C0193h0 String str) {
            this.f3617I = str;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        public RemoteViews mo4237d() {
            return this.f3614F;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: f */
        public RemoteViews mo4248f() {
            return this.f3616H;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        public int mo4231c() {
            return this.f3611C;
        }

        /* renamed from: e */
        public C0779e mo4246e(String str) {
            this.f3619K = str;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4210a(RemoteViews remoteViews) {
            this.f3622N.contentView = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4204a(PendingIntent pendingIntent) {
            this.f3629f = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4205a(PendingIntent pendingIntent, boolean z) {
            this.f3630g = pendingIntent;
            m4423a(128, z);
            return this;
        }

        /* renamed from: a */
        public C0779e mo4215a(CharSequence charSequence, RemoteViews remoteViews) {
            this.f3622N.tickerText = m4425f(charSequence);
            this.f3631h = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4206a(Bitmap bitmap) {
            this.f3632i = m4424b(bitmap);
            return this;
        }

        /* renamed from: a */
        public C0779e mo4207a(Uri uri) {
            Notification notification = this.f3622N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        @Deprecated
        public C0779e(Context context) {
            this(context, null);
        }

        /* renamed from: b */
        public C0779e mo4230b(boolean z) {
            this.f3648y = z;
            this.f3649z = true;
            return this;
        }

        /* renamed from: b */
        public C0779e mo4229b(String str) {
            this.f3609A = str;
            return this;
        }

        /* renamed from: b */
        public C0779e mo4225b(Bundle bundle) {
            this.f3610B = bundle;
            return this;
        }

        @RequiresApi(21)
        /* renamed from: b */
        public C0779e mo4222b(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return mo4227b(new C0771a(i, charSequence, pendingIntent));
        }

        /* renamed from: a */
        public C0779e mo4208a(Uri uri, int i) {
            Notification notification = this.f3622N;
            notification.sound = uri;
            notification.audioStreamType = i;
            if (VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new Builder().setContentType(4).setLegacyStreamType(i).build();
            }
            return this;
        }

        @RequiresApi(21)
        /* renamed from: b */
        public C0779e mo4227b(C0771a aVar) {
            this.f3626c.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C0779e mo4221b(@C0198k int i) {
            this.f3611C = i;
            return this;
        }

        /* renamed from: b */
        public C0779e mo4226b(RemoteViews remoteViews) {
            this.f3615G = remoteViews;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public RemoteViews mo4220b() {
            return this.f3615G;
        }

        /* renamed from: a */
        public C0779e mo4218a(long[] jArr) {
            this.f3622N.vibrate = jArr;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4199a(@C0198k int i, int i2, int i3) {
            Notification notification = this.f3622N;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (notification.ledOnMS == 0 || notification.ledOffMS == 0) ? 0 : 1;
            Notification notification2 = this.f3622N;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        /* renamed from: a */
        public C0779e mo4217a(boolean z) {
            m4423a(16, z);
            return this;
        }

        /* renamed from: a */
        private void m4423a(int i, boolean z) {
            if (z) {
                Notification notification = this.f3622N;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f3622N;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        /* renamed from: a */
        public C0779e mo4216a(String str) {
            this.f3623O.add(str);
            return this;
        }

        /* renamed from: a */
        public C0779e mo4209a(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f3610B;
                if (bundle2 == null) {
                    this.f3610B = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0779e mo4201a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3625b.add(new C0771a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0779e mo4211a(C0771a aVar) {
            this.f3625b.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0779e mo4213a(C0791n nVar) {
            if (this.f3638o != nVar) {
                this.f3638o = nVar;
                C0791n nVar2 = this.f3638o;
                if (nVar2 != null) {
                    nVar2.mo4308a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0779e mo4203a(Notification notification) {
            this.f3613E = notification;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4202a(long j) {
            this.f3620L = j;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4197a(int i) {
            this.f3618J = i;
            return this;
        }

        /* renamed from: a */
        public C0779e mo4212a(C0784h hVar) {
            hVar.mo4260a(this);
            return this;
        }

        /* renamed from: a */
        public Notification mo4196a() {
            return new C0793q(this).mo4354b();
        }
    }

    /* renamed from: androidx.core.app.p$f */
    /* compiled from: NotificationCompat */
    public static final class C0780f implements C0784h {
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: d */
        static final String f3650d = "android.car.EXTENSIONS";

        /* renamed from: e */
        private static final String f3651e = "large_icon";

        /* renamed from: f */
        private static final String f3652f = "car_conversation";

        /* renamed from: g */
        private static final String f3653g = "app_color";
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: h */
        static final String f3654h = "invisible_actions";

        /* renamed from: i */
        private static final String f3655i = "author";

        /* renamed from: j */
        private static final String f3656j = "text";

        /* renamed from: k */
        private static final String f3657k = "messages";

        /* renamed from: l */
        private static final String f3658l = "remote_input";

        /* renamed from: m */
        private static final String f3659m = "on_reply";

        /* renamed from: n */
        private static final String f3660n = "on_read";

        /* renamed from: o */
        private static final String f3661o = "participants";

        /* renamed from: p */
        private static final String f3662p = "timestamp";

        /* renamed from: a */
        private Bitmap f3663a;

        /* renamed from: b */
        private C0781a f3664b;

        /* renamed from: c */
        private int f3665c = 0;

        /* renamed from: androidx.core.app.p$f$a */
        /* compiled from: NotificationCompat */
        public static class C0781a {

            /* renamed from: a */
            private final String[] f3666a;

            /* renamed from: b */
            private final C0807w f3667b;

            /* renamed from: c */
            private final PendingIntent f3668c;

            /* renamed from: d */
            private final PendingIntent f3669d;

            /* renamed from: e */
            private final String[] f3670e;

            /* renamed from: f */
            private final long f3671f;

            /* renamed from: androidx.core.app.p$f$a$a */
            /* compiled from: NotificationCompat */
            public static class C0782a {

                /* renamed from: a */
                private final List<String> f3672a = new ArrayList();

                /* renamed from: b */
                private final String f3673b;

                /* renamed from: c */
                private C0807w f3674c;

                /* renamed from: d */
                private PendingIntent f3675d;

                /* renamed from: e */
                private PendingIntent f3676e;

                /* renamed from: f */
                private long f3677f;

                public C0782a(String str) {
                    this.f3673b = str;
                }

                /* renamed from: a */
                public C0782a mo4276a(String str) {
                    this.f3672a.add(str);
                    return this;
                }

                /* renamed from: a */
                public C0782a mo4275a(PendingIntent pendingIntent, C0807w wVar) {
                    this.f3674c = wVar;
                    this.f3676e = pendingIntent;
                    return this;
                }

                /* renamed from: a */
                public C0782a mo4274a(PendingIntent pendingIntent) {
                    this.f3675d = pendingIntent;
                    return this;
                }

                /* renamed from: a */
                public C0782a mo4273a(long j) {
                    this.f3677f = j;
                    return this;
                }

                /* renamed from: a */
                public C0781a mo4277a() {
                    List<String> list = this.f3672a;
                    C0781a aVar = new C0781a((String[]) list.toArray(new String[list.size()]), this.f3674c, this.f3676e, this.f3675d, new String[]{this.f3673b}, this.f3677f);
                    return aVar;
                }
            }

            C0781a(String[] strArr, C0807w wVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f3666a = strArr;
                this.f3667b = wVar;
                this.f3669d = pendingIntent2;
                this.f3668c = pendingIntent;
                this.f3670e = strArr2;
                this.f3671f = j;
            }

            /* renamed from: a */
            public long mo4266a() {
                return this.f3671f;
            }

            /* renamed from: b */
            public String[] mo4267b() {
                return this.f3666a;
            }

            /* renamed from: c */
            public String mo4268c() {
                String[] strArr = this.f3670e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            /* renamed from: d */
            public String[] mo4269d() {
                return this.f3670e;
            }

            /* renamed from: e */
            public PendingIntent mo4270e() {
                return this.f3669d;
            }

            /* renamed from: f */
            public C0807w mo4271f() {
                return this.f3667b;
            }

            /* renamed from: g */
            public PendingIntent mo4272g() {
                return this.f3668c;
            }
        }

        public C0780f() {
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [androidx.core.app.p$f$a] */
        /* JADX WARNING: type inference failed for: r1v2 */
        /* JADX WARNING: type inference failed for: r8v0, types: [androidx.core.app.w] */
        /* JADX WARNING: type inference failed for: r6v0, types: [androidx.core.app.p$f$a] */
        /* JADX WARNING: type inference failed for: r12v1, types: [androidx.core.app.w] */
        /* JADX WARNING: type inference failed for: r6v4, types: [androidx.core.app.p$f$a] */
        /* JADX WARNING: type inference failed for: r12v2, types: [androidx.core.app.w] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], androidx.core.app.p$f$a, androidx.core.app.w]
          uses: [androidx.core.app.p$f$a, ?[OBJECT, ARRAY], androidx.core.app.w]
          mth insns count: 59
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        @androidx.annotation.RequiresApi(21)
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static androidx.core.app.C0770p.C0780f.C0781a m4489a(@androidx.annotation.C0195i0 android.os.Bundle r19) {
            /*
                r0 = r19
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.lang.String r2 = "messages"
                android.os.Parcelable[] r2 = r0.getParcelableArray(r2)
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r4 = r2.length
                java.lang.String[] r4 = new java.lang.String[r4]
                r5 = 0
                r6 = 0
            L_0x0014:
                int r7 = r4.length
                if (r6 >= r7) goto L_0x0032
                r7 = r2[r6]
                boolean r7 = r7 instanceof android.os.Bundle
                if (r7 != 0) goto L_0x001e
                goto L_0x0033
            L_0x001e:
                r7 = r2[r6]
                android.os.Bundle r7 = (android.os.Bundle) r7
                java.lang.String r8 = "text"
                java.lang.String r7 = r7.getString(r8)
                r4[r6] = r7
                r7 = r4[r6]
                if (r7 != 0) goto L_0x002f
                goto L_0x0033
            L_0x002f:
                int r6 = r6 + 1
                goto L_0x0014
            L_0x0032:
                r5 = 1
            L_0x0033:
                if (r5 == 0) goto L_0x0037
                r7 = r4
                goto L_0x0039
            L_0x0037:
                return r1
            L_0x0038:
                r7 = r1
            L_0x0039:
                java.lang.String r2 = "on_read"
                android.os.Parcelable r2 = r0.getParcelable(r2)
                r10 = r2
                android.app.PendingIntent r10 = (android.app.PendingIntent) r10
                java.lang.String r2 = "on_reply"
                android.os.Parcelable r2 = r0.getParcelable(r2)
                r9 = r2
                android.app.PendingIntent r9 = (android.app.PendingIntent) r9
                java.lang.String r2 = "remote_input"
                android.os.Parcelable r2 = r0.getParcelable(r2)
                android.app.RemoteInput r2 = (android.app.RemoteInput) r2
                java.lang.String r4 = "participants"
                java.lang.String[] r11 = r0.getStringArray(r4)
                if (r11 == 0) goto L_0x008a
                int r4 = r11.length
                if (r4 == r3) goto L_0x005f
                goto L_0x008a
            L_0x005f:
                if (r2 == 0) goto L_0x007d
                androidx.core.app.w r1 = new androidx.core.app.w
                java.lang.String r13 = r2.getResultKey()
                java.lang.CharSequence r14 = r2.getLabel()
                java.lang.CharSequence[] r15 = r2.getChoices()
                boolean r16 = r2.getAllowFreeFormInput()
                android.os.Bundle r17 = r2.getExtras()
                r18 = 0
                r12 = r1
                r12.<init>(r13, r14, r15, r16, r17, r18)
            L_0x007d:
                r8 = r1
                androidx.core.app.p$f$a r1 = new androidx.core.app.p$f$a
                java.lang.String r2 = "timestamp"
                long r12 = r0.getLong(r2)
                r6 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12)
            L_0x008a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0770p.C0780f.m4489a(android.os.Bundle):androidx.core.app.p$f$a");
        }

        @RequiresApi(21)
        /* renamed from: b */
        private static Bundle m4490b(@C0193h0 C0781a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.mo4269d() == null || aVar.mo4269d().length <= 1) ? null : aVar.mo4269d()[0];
            Parcelable[] parcelableArr = new Parcelable[aVar.mo4267b().length];
            for (int i = 0; i < parcelableArr.length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.mo4267b()[i]);
                bundle2.putString(f3655i, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(f3657k, parcelableArr);
            C0807w f = aVar.mo4271f();
            if (f != null) {
                bundle.putParcelable(f3658l, new RemoteInput.Builder(f.mo4407f()).setLabel(f.mo4406e()).setChoices(f.mo4404c()).setAllowFreeFormInput(f.mo4402a()).addExtras(f.mo4405d()).build());
            }
            bundle.putParcelable(f3659m, aVar.mo4272g());
            bundle.putParcelable(f3660n, aVar.mo4270e());
            bundle.putStringArray(f3661o, aVar.mo4269d());
            bundle.putLong("timestamp", aVar.mo4266a());
            return bundle;
        }

        /* renamed from: c */
        public C0781a mo4265c() {
            return this.f3664b;
        }

        public C0780f(Notification notification) {
            Bundle bundle;
            if (VERSION.SDK_INT >= 21) {
                if (C0770p.m4373f(notification) == null) {
                    bundle = null;
                } else {
                    bundle = C0770p.m4373f(notification).getBundle(f3650d);
                }
                if (bundle != null) {
                    this.f3663a = (Bitmap) bundle.getParcelable(f3651e);
                    this.f3665c = bundle.getInt(f3653g, 0);
                    this.f3664b = m4489a(bundle.getBundle(f3652f));
                }
            }
        }

        /* renamed from: a */
        public C0779e mo4260a(C0779e eVar) {
            if (VERSION.SDK_INT < 21) {
                return eVar;
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f3663a;
            if (bitmap != null) {
                bundle.putParcelable(f3651e, bitmap);
            }
            int i = this.f3665c;
            if (i != 0) {
                bundle.putInt(f3653g, i);
            }
            C0781a aVar = this.f3664b;
            if (aVar != null) {
                bundle.putBundle(f3652f, m4490b(aVar));
            }
            eVar.mo4243e().putBundle(f3650d, bundle);
            return eVar;
        }

        /* renamed from: b */
        public Bitmap mo4264b() {
            return this.f3663a;
        }

        /* renamed from: a */
        public C0780f mo4261a(@C0198k int i) {
            this.f3665c = i;
            return this;
        }

        @C0198k
        /* renamed from: a */
        public int mo4259a() {
            return this.f3665c;
        }

        /* renamed from: a */
        public C0780f mo4262a(Bitmap bitmap) {
            this.f3663a = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0780f mo4263a(C0781a aVar) {
            this.f3664b = aVar;
            return this;
        }
    }

    /* renamed from: androidx.core.app.p$g */
    /* compiled from: NotificationCompat */
    public static class C0783g extends C0791n {

        /* renamed from: e */
        private static final int f3678e = 3;

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            if (VERSION.SDK_INT >= 24) {
                oVar.mo4156a().setStyle(new DecoratedCustomViewStyle());
            }
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public RemoteViews mo4278b(C0769o oVar) {
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews b = this.f3699a.mo4220b();
            if (b == null) {
                b = this.f3699a.mo4237d();
            }
            if (b == null) {
                return null;
            }
            return m4510a(b, true);
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        public RemoteViews mo4279c(C0769o oVar) {
            if (VERSION.SDK_INT < 24 && this.f3699a.mo4237d() != null) {
                return m4510a(this.f3699a.mo4237d(), false);
            }
            return null;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        public RemoteViews mo4280d(C0769o oVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews f = this.f3699a.mo4248f();
            if (f != null) {
                remoteViews = f;
            } else {
                remoteViews = this.f3699a.mo4237d();
            }
            if (f == null) {
                return null;
            }
            return m4510a(remoteViews, true);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.widget.RemoteViews m4510a(android.widget.RemoteViews r7, boolean r8) {
            /*
                r6 = this;
                int r0 = androidx.core.C0721R.layout.notification_template_custom_big
                r1 = 1
                r2 = 0
                android.widget.RemoteViews r0 = r6.mo4306a(r1, r0, r2)
                int r3 = androidx.core.C0721R.C0724id.actions
                r0.removeAllViews(r3)
                if (r8 == 0) goto L_0x0039
                androidx.core.app.p$e r8 = r6.f3699a
                java.util.ArrayList<androidx.core.app.p$a> r8 = r8.f3625b
                if (r8 == 0) goto L_0x0039
                int r8 = r8.size()
                r3 = 3
                int r8 = java.lang.Math.min(r8, r3)
                if (r8 <= 0) goto L_0x0039
                r3 = 0
            L_0x0021:
                if (r3 >= r8) goto L_0x003a
                androidx.core.app.p$e r4 = r6.f3699a
                java.util.ArrayList<androidx.core.app.p$a> r4 = r4.f3625b
                java.lang.Object r4 = r4.get(r3)
                androidx.core.app.p$a r4 = (androidx.core.app.C0770p.C0771a) r4
                android.widget.RemoteViews r4 = r6.m4511a(r4)
                int r5 = androidx.core.C0721R.C0724id.actions
                r0.addView(r5, r4)
                int r3 = r3 + 1
                goto L_0x0021
            L_0x0039:
                r1 = 0
            L_0x003a:
                if (r1 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r2 = 8
            L_0x003f:
                int r8 = androidx.core.C0721R.C0724id.actions
                r0.setViewVisibility(r8, r2)
                int r8 = androidx.core.C0721R.C0724id.action_divider
                r0.setViewVisibility(r8, r2)
                r6.mo4307a(r0, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0770p.C0783g.m4510a(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
        }

        /* renamed from: a */
        private RemoteViews m4511a(C0771a aVar) {
            boolean z = aVar.f3582i == null;
            RemoteViews remoteViews = new RemoteViews(this.f3699a.f3624a.getPackageName(), z ? C0721R.layout.notification_action_tombstone : C0721R.layout.notification_action);
            remoteViews.setImageViewBitmap(C0721R.C0724id.action_image, mo4305a(aVar.mo4161e(), this.f3699a.f3624a.getResources().getColor(C0721R.C0722color.notification_action_color_filter)));
            remoteViews.setTextViewText(C0721R.C0724id.action_text, aVar.f3581h);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C0721R.C0724id.action_container, aVar.f3582i);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C0721R.C0724id.action_container, aVar.f3581h);
            }
            return remoteViews;
        }
    }

    /* renamed from: androidx.core.app.p$h */
    /* compiled from: NotificationCompat */
    public interface C0784h {
        /* renamed from: a */
        C0779e mo4260a(C0779e eVar);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.p$i */
    /* compiled from: NotificationCompat */
    public @interface C0785i {
    }

    /* renamed from: androidx.core.app.p$j */
    /* compiled from: NotificationCompat */
    public static class C0786j extends C0791n {

        /* renamed from: e */
        private ArrayList<CharSequence> f3679e = new ArrayList<>();

        public C0786j() {
        }

        /* renamed from: a */
        public C0786j mo4281a(CharSequence charSequence) {
            this.f3679e.add(C0779e.m4425f(charSequence));
            return this;
        }

        /* renamed from: b */
        public C0786j mo4282b(CharSequence charSequence) {
            this.f3700b = C0779e.m4425f(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0786j mo4283c(CharSequence charSequence) {
            this.f3701c = C0779e.m4425f(charSequence);
            this.f3702d = true;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            if (VERSION.SDK_INT >= 16) {
                InboxStyle bigContentTitle = new InboxStyle(oVar.mo4156a()).setBigContentTitle(this.f3700b);
                if (this.f3702d) {
                    bigContentTitle.setSummaryText(this.f3701c);
                }
                Iterator it = this.f3679e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
            }
        }

        public C0786j(C0779e eVar) {
            mo4308a(eVar);
        }
    }

    /* renamed from: androidx.core.app.p$k */
    /* compiled from: NotificationCompat */
    public static class C0787k extends C0791n {

        /* renamed from: i */
        public static final int f3680i = 25;

        /* renamed from: e */
        private final List<C0788a> f3681e = new ArrayList();

        /* renamed from: f */
        private C0805v f3682f;
        @C0195i0

        /* renamed from: g */
        private CharSequence f3683g;
        @C0195i0

        /* renamed from: h */
        private Boolean f3684h;

        /* renamed from: androidx.core.app.p$k$a */
        /* compiled from: NotificationCompat */
        public static final class C0788a {

            /* renamed from: g */
            static final String f3685g = "text";

            /* renamed from: h */
            static final String f3686h = "time";

            /* renamed from: i */
            static final String f3687i = "sender";

            /* renamed from: j */
            static final String f3688j = "type";

            /* renamed from: k */
            static final String f3689k = "uri";

            /* renamed from: l */
            static final String f3690l = "extras";

            /* renamed from: m */
            static final String f3691m = "person";

            /* renamed from: n */
            static final String f3692n = "sender_person";

            /* renamed from: a */
            private final CharSequence f3693a;

            /* renamed from: b */
            private final long f3694b;
            @C0195i0

            /* renamed from: c */
            private final C0805v f3695c;

            /* renamed from: d */
            private Bundle f3696d;
            @C0195i0

            /* renamed from: e */
            private String f3697e;
            @C0195i0

            /* renamed from: f */
            private Uri f3698f;

            public C0788a(CharSequence charSequence, long j, @C0195i0 C0805v vVar) {
                this.f3696d = new Bundle();
                this.f3693a = charSequence;
                this.f3694b = j;
                this.f3695c = vVar;
            }

            /* renamed from: h */
            private Bundle m4542h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3693a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f3694b);
                C0805v vVar = this.f3695c;
                if (vVar != null) {
                    bundle.putCharSequence(f3687i, vVar.mo4387c());
                    if (VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f3692n, this.f3695c.mo4391g());
                    } else {
                        bundle.putBundle(f3691m, this.f3695c.mo4393i());
                    }
                }
                String str = this.f3697e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f3698f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f3696d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* renamed from: a */
            public C0788a mo4296a(String str, Uri uri) {
                this.f3697e = str;
                this.f3698f = uri;
                return this;
            }

            @C0195i0
            /* renamed from: b */
            public Uri mo4298b() {
                return this.f3698f;
            }

            @C0193h0
            /* renamed from: c */
            public Bundle mo4299c() {
                return this.f3696d;
            }

            @C0195i0
            /* renamed from: d */
            public C0805v mo4300d() {
                return this.f3695c;
            }

            @Deprecated
            @C0195i0
            /* renamed from: e */
            public CharSequence mo4301e() {
                C0805v vVar = this.f3695c;
                if (vVar == null) {
                    return null;
                }
                return vVar.mo4387c();
            }

            @C0193h0
            /* renamed from: f */
            public CharSequence mo4302f() {
                return this.f3693a;
            }

            /* renamed from: g */
            public long mo4303g() {
                return this.f3694b;
            }

            @C0195i0
            /* renamed from: a */
            public String mo4297a() {
                return this.f3697e;
            }

            @C0193h0
            /* renamed from: a */
            static Bundle[] m4541a(List<C0788a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((C0788a) list.get(i)).m4542h();
                }
                return bundleArr;
            }

            @Deprecated
            public C0788a(CharSequence charSequence, long j, CharSequence charSequence2) {
                this(charSequence, j, new C0806a().mo4396a(charSequence2).mo4399a());
            }

            @C0193h0
            /* renamed from: a */
            static List<C0788a> m4540a(Parcelable[] parcelableArr) {
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if (parcelableArr[i] instanceof Bundle) {
                        C0788a a = m4539a(parcelableArr[i]);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
                return arrayList;
            }

            @C0195i0
            /* renamed from: a */
            static C0788a m4539a(Bundle bundle) {
                String str = "uri";
                String str2 = "extras";
                String str3 = "type";
                String str4 = f3687i;
                String str5 = f3692n;
                String str6 = f3691m;
                String str7 = "time";
                String str8 = "text";
                try {
                    if (bundle.containsKey(str8)) {
                        if (bundle.containsKey(str7)) {
                            C0805v vVar = bundle.containsKey(str6) ? C0805v.m4676a(bundle.getBundle(str6)) : (!bundle.containsKey(str5) || VERSION.SDK_INT < 28) ? bundle.containsKey(str4) ? new C0806a().mo4396a(bundle.getCharSequence(str4)).mo4399a() : null : C0805v.m4675a((Person) bundle.getParcelable(str5));
                            C0788a aVar = new C0788a(bundle.getCharSequence(str8), bundle.getLong(str7), vVar);
                            if (bundle.containsKey(str3) && bundle.containsKey(str)) {
                                aVar.mo4296a(bundle.getString(str3), (Uri) bundle.getParcelable(str));
                            }
                            if (bundle.containsKey(str2)) {
                                aVar.mo4299c().putAll(bundle.getBundle(str2));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }
        }

        private C0787k() {
        }

        @C0195i0
        /* renamed from: g */
        private C0788a m4524g() {
            for (int size = this.f3681e.size() - 1; size >= 0; size--) {
                C0788a aVar = (C0788a) this.f3681e.get(size);
                if (aVar.mo4300d() != null && !TextUtils.isEmpty(aVar.mo4300d().mo4387c())) {
                    return aVar;
                }
            }
            if (this.f3681e.isEmpty()) {
                return null;
            }
            List<C0788a> list = this.f3681e;
            return (C0788a) list.get(list.size() - 1);
        }

        /* renamed from: h */
        private boolean m4525h() {
            for (int size = this.f3681e.size() - 1; size >= 0; size--) {
                C0788a aVar = (C0788a) this.f3681e.get(size);
                if (aVar.mo4300d() != null && aVar.mo4300d().mo4387c() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public C0787k mo4285a(@C0195i0 CharSequence charSequence) {
            this.f3683g = charSequence;
            return this;
        }

        @C0195i0
        /* renamed from: b */
        public CharSequence mo4290b() {
            return this.f3683g;
        }

        /* renamed from: c */
        public List<C0788a> mo4292c() {
            return this.f3681e;
        }

        /* renamed from: d */
        public C0805v mo4293d() {
            return this.f3682f;
        }

        @Deprecated
        /* renamed from: e */
        public CharSequence mo4294e() {
            return this.f3682f.mo4387c();
        }

        /* renamed from: f */
        public boolean mo4295f() {
            C0779e eVar = this.f3699a;
            boolean z = false;
            if (eVar == null || eVar.f3624a.getApplicationInfo().targetSdkVersion >= 28 || this.f3684h != null) {
                Boolean bool = this.f3684h;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                return z;
            }
            if (this.f3683g != null) {
                z = true;
            }
            return z;
        }

        /* renamed from: b */
        private CharSequence m4523b(C0788a aVar) {
            C0908a c = C0908a.m5221c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = VERSION.SDK_INT >= 21;
            int i = z ? C0962e0.f4343t : -1;
            CharSequence charSequence = "";
            CharSequence c2 = aVar.mo4300d() == null ? charSequence : aVar.mo4300d().mo4387c();
            if (TextUtils.isEmpty(c2)) {
                c2 = this.f3682f.mo4387c();
                if (z && this.f3699a.mo4231c() != 0) {
                    i = this.f3699a.mo4231c();
                }
            }
            CharSequence b = c.mo4683b(c2);
            spannableStringBuilder.append(b);
            spannableStringBuilder.setSpan(m4521a(i), spannableStringBuilder.length() - b.length(), spannableStringBuilder.length(), 33);
            if (aVar.mo4302f() != null) {
                charSequence = aVar.mo4302f();
            }
            spannableStringBuilder.append("  ").append(c.mo4683b(charSequence));
            return spannableStringBuilder;
        }

        @Deprecated
        /* renamed from: a */
        public C0787k mo4287a(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.f3681e.add(new C0788a(charSequence, j, new C0806a().mo4396a(charSequence2).mo4399a()));
            if (this.f3681e.size() > 25) {
                this.f3681e.remove(0);
            }
            return this;
        }

        @Deprecated
        public C0787k(@C0193h0 CharSequence charSequence) {
            this.f3682f = new C0806a().mo4396a(charSequence).mo4399a();
        }

        public C0787k(@C0193h0 C0805v vVar) {
            if (!TextUtils.isEmpty(vVar.mo4387c())) {
                this.f3682f = vVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        /* renamed from: a */
        public C0787k mo4286a(CharSequence charSequence, long j, C0805v vVar) {
            mo4284a(new C0788a(charSequence, j, vVar));
            return this;
        }

        /* renamed from: a */
        public C0787k mo4284a(C0788a aVar) {
            this.f3681e.add(aVar);
            if (this.f3681e.size() > 25) {
                this.f3681e.remove(0);
            }
            return this;
        }

        /* renamed from: a */
        public C0787k mo4288a(boolean z) {
            this.f3684h = Boolean.valueOf(z);
            return this;
        }

        @C0195i0
        /* renamed from: a */
        public static C0787k m4522a(Notification notification) {
            Bundle f = C0770p.m4373f(notification);
            if (f != null && !f.containsKey(C0770p.f3502R) && !f.containsKey(C0770p.f3503S)) {
                return null;
            }
            try {
                C0787k kVar = new C0787k();
                kVar.mo4291b(f);
                return kVar;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            CharSequence charSequence;
            MessagingStyle messagingStyle;
            Message message;
            Person person;
            mo4288a(mo4295f());
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    messagingStyle = new MessagingStyle(this.f3682f.mo4391g());
                } else {
                    messagingStyle = new MessagingStyle(this.f3682f.mo4387c());
                }
                if (this.f3684h.booleanValue() || VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f3683g);
                }
                if (VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f3684h.booleanValue());
                }
                for (C0788a aVar : this.f3681e) {
                    if (VERSION.SDK_INT >= 28) {
                        C0805v d = aVar.mo4300d();
                        CharSequence f = aVar.mo4302f();
                        long g = aVar.mo4303g();
                        if (d == null) {
                            person = null;
                        } else {
                            person = d.mo4391g();
                        }
                        message = new Message(f, g, person);
                    } else {
                        message = new Message(aVar.mo4302f(), aVar.mo4303g(), aVar.mo4300d() != null ? aVar.mo4300d().mo4387c() : null);
                    }
                    if (aVar.mo4297a() != null) {
                        message.setData(aVar.mo4297a(), aVar.mo4298b());
                    }
                    messagingStyle.addMessage(message);
                }
                messagingStyle.setBuilder(oVar.mo4156a());
                return;
            }
            C0788a g2 = m4524g();
            if (this.f3683g != null && this.f3684h.booleanValue()) {
                oVar.mo4156a().setContentTitle(this.f3683g);
            } else if (g2 != null) {
                oVar.mo4156a().setContentTitle("");
                if (g2.mo4300d() != null) {
                    oVar.mo4156a().setContentTitle(g2.mo4300d().mo4387c());
                }
            }
            if (g2 != null) {
                Notification.Builder a = oVar.mo4156a();
                if (this.f3683g != null) {
                    charSequence = m4523b(g2);
                } else {
                    charSequence = g2.mo4302f();
                }
                a.setContentText(charSequence);
            }
            if (VERSION.SDK_INT >= 16) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z = this.f3683g != null || m4525h();
                for (int size = this.f3681e.size() - 1; size >= 0; size--) {
                    C0788a aVar2 = (C0788a) this.f3681e.get(size);
                    CharSequence b = z ? m4523b(aVar2) : aVar2.mo4302f();
                    if (size != this.f3681e.size() - 1) {
                        spannableStringBuilder.insert(0, "\n");
                    }
                    spannableStringBuilder.insert(0, b);
                }
                new BigTextStyle(oVar.mo4156a()).setBigContentTitle(null).bigText(spannableStringBuilder);
            }
        }

        /* access modifiers changed from: protected */
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo4291b(Bundle bundle) {
            this.f3681e.clear();
            String str = C0770p.f3503S;
            if (bundle.containsKey(str)) {
                this.f3682f = C0805v.m4676a(bundle.getBundle(str));
            } else {
                this.f3682f = new C0806a().mo4396a((CharSequence) bundle.getString(C0770p.f3502R)).mo4399a();
            }
            this.f3683g = bundle.getCharSequence(C0770p.f3504T);
            if (this.f3683g == null) {
                this.f3683g = bundle.getCharSequence(C0770p.f3507W);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C0770p.f3505U);
            if (parcelableArray != null) {
                this.f3681e.addAll(C0788a.m4540a(parcelableArray));
            }
            String str2 = C0770p.f3506V;
            if (bundle.containsKey(str2)) {
                this.f3684h = Boolean.valueOf(bundle.getBoolean(str2));
            }
        }

        @C0193h0
        /* renamed from: a */
        private TextAppearanceSpan m4521a(int i) {
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
            return textAppearanceSpan;
        }

        /* renamed from: a */
        public void mo4289a(Bundle bundle) {
            super.mo4289a(bundle);
            bundle.putCharSequence(C0770p.f3502R, this.f3682f.mo4387c());
            bundle.putBundle(C0770p.f3503S, this.f3682f.mo4393i());
            bundle.putCharSequence(C0770p.f3507W, this.f3683g);
            if (this.f3683g != null && this.f3684h.booleanValue()) {
                bundle.putCharSequence(C0770p.f3504T, this.f3683g);
            }
            if (!this.f3681e.isEmpty()) {
                bundle.putParcelableArray(C0770p.f3505U, C0788a.m4541a(this.f3681e));
            }
            Boolean bool = this.f3684h;
            if (bool != null) {
                bundle.putBoolean(C0770p.f3506V, bool.booleanValue());
            }
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.p$l */
    /* compiled from: NotificationCompat */
    public @interface C0789l {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.p$m */
    /* compiled from: NotificationCompat */
    public @interface C0790m {
    }

    /* renamed from: androidx.core.app.p$n */
    /* compiled from: NotificationCompat */
    public static abstract class C0791n {
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a */
        protected C0779e f3699a;

        /* renamed from: b */
        CharSequence f3700b;

        /* renamed from: c */
        CharSequence f3701c;

        /* renamed from: d */
        boolean f3702d = false;

        /* renamed from: a */
        private static float m4551a(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: b */
        private int mo4290b() {
            Resources resources = this.f3699a.f3624a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0721R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0721R.dimen.notification_top_pad_large_text);
            float a = (m4551a(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - a) * ((float) dimensionPixelSize)) + (a * ((float) dimensionPixelSize2)));
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4289a(Bundle bundle) {
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
        }

        /* renamed from: a */
        public void mo4308a(C0779e eVar) {
            if (this.f3699a != eVar) {
                this.f3699a = eVar;
                C0779e eVar2 = this.f3699a;
                if (eVar2 != null) {
                    eVar2.mo4213a(this);
                }
            }
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public RemoteViews mo4278b(C0769o oVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo4291b(Bundle bundle) {
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        public RemoteViews mo4279c(C0769o oVar) {
            return null;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        public RemoteViews mo4280d(C0769o oVar) {
            return null;
        }

        /* renamed from: a */
        public Notification mo4304a() {
            C0779e eVar = this.f3699a;
            if (eVar != null) {
                return eVar.mo4196a();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0210  */
        @androidx.annotation.C0207n0({androidx.annotation.C0207n0.C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo4306a(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.core.app.p$e r0 = r12.f3699a
                android.content.Context r0 = r0.f3624a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.p$e r1 = r12.f3699a
                android.content.Context r1 = r1.f3624a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                androidx.core.app.p$e r14 = r12.f3699a
                int r14 = r14.mo4255h()
                r1 = -1
                r8 = 1
                r9 = 0
                if (r14 >= r1) goto L_0x0022
                r14 = 1
                goto L_0x0023
            L_0x0022:
                r14 = 0
            L_0x0023:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                r10 = 16
                if (r2 < r10) goto L_0x004e
                if (r2 >= r3) goto L_0x004e
                java.lang.String r2 = "setBackgroundResource"
                if (r14 == 0) goto L_0x0040
                int r14 = androidx.core.C0721R.C0724id.notification_background
                int r4 = androidx.core.C0721R.C0723drawable.notification_bg_low
                r7.setInt(r14, r2, r4)
                int r14 = androidx.core.C0721R.C0724id.icon
                int r4 = androidx.core.C0721R.C0723drawable.notification_template_icon_low_bg
                r7.setInt(r14, r2, r4)
                goto L_0x004e
            L_0x0040:
                int r14 = androidx.core.C0721R.C0724id.notification_background
                int r4 = androidx.core.C0721R.C0723drawable.notification_bg
                r7.setInt(r14, r2, r4)
                int r14 = androidx.core.C0721R.C0724id.icon
                int r4 = androidx.core.C0721R.C0723drawable.notification_template_icon_bg
                r7.setInt(r14, r2, r4)
            L_0x004e:
                androidx.core.app.p$e r14 = r12.f3699a
                android.graphics.Bitmap r2 = r14.f3632i
                r11 = 8
                if (r2 == 0) goto L_0x00b5
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x0069
                int r14 = androidx.core.C0721R.C0724id.icon
                r7.setViewVisibility(r14, r9)
                int r14 = androidx.core.C0721R.C0724id.icon
                androidx.core.app.p$e r2 = r12.f3699a
                android.graphics.Bitmap r2 = r2.f3632i
                r7.setImageViewBitmap(r14, r2)
                goto L_0x006e
            L_0x0069:
                int r14 = androidx.core.C0721R.C0724id.icon
                r7.setViewVisibility(r14, r11)
            L_0x006e:
                if (r13 == 0) goto L_0x00fc
                androidx.core.app.p$e r13 = r12.f3699a
                android.app.Notification r13 = r13.f3622N
                int r13 = r13.icon
                if (r13 == 0) goto L_0x00fc
                int r13 = androidx.core.C0721R.dimen.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = androidx.core.C0721R.dimen.notification_small_icon_background_padding
                int r14 = r0.getDimensionPixelSize(r14)
                int r14 = r14 * 2
                int r14 = r13 - r14
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto L_0x00a0
                androidx.core.app.p$e r1 = r12.f3699a
                android.app.Notification r2 = r1.f3622N
                int r2 = r2.icon
                int r1 = r1.mo4231c()
                android.graphics.Bitmap r13 = r12.m4553a(r2, r13, r14, r1)
                int r14 = androidx.core.C0721R.C0724id.right_icon
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00af
            L_0x00a0:
                int r13 = androidx.core.C0721R.C0724id.right_icon
                androidx.core.app.p$e r14 = r12.f3699a
                android.app.Notification r14 = r14.f3622N
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.mo4305a(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00af:
                int r13 = androidx.core.C0721R.C0724id.right_icon
                r7.setViewVisibility(r13, r9)
                goto L_0x00fc
            L_0x00b5:
                if (r13 == 0) goto L_0x00fc
                android.app.Notification r13 = r14.f3622N
                int r13 = r13.icon
                if (r13 == 0) goto L_0x00fc
                int r13 = androidx.core.C0721R.C0724id.icon
                r7.setViewVisibility(r13, r9)
                int r13 = android.os.Build.VERSION.SDK_INT
                if (r13 < r3) goto L_0x00ed
                int r13 = androidx.core.C0721R.dimen.notification_large_icon_width
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = androidx.core.C0721R.dimen.notification_big_circle_margin
                int r14 = r0.getDimensionPixelSize(r14)
                int r13 = r13 - r14
                int r14 = androidx.core.C0721R.dimen.notification_small_icon_size_as_large
                int r14 = r0.getDimensionPixelSize(r14)
                androidx.core.app.p$e r1 = r12.f3699a
                android.app.Notification r2 = r1.f3622N
                int r2 = r2.icon
                int r1 = r1.mo4231c()
                android.graphics.Bitmap r13 = r12.m4553a(r2, r13, r14, r1)
                int r14 = androidx.core.C0721R.C0724id.icon
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00fc
            L_0x00ed:
                int r13 = androidx.core.C0721R.C0724id.icon
                androidx.core.app.p$e r14 = r12.f3699a
                android.app.Notification r14 = r14.f3622N
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.mo4305a(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00fc:
                androidx.core.app.p$e r13 = r12.f3699a
                java.lang.CharSequence r13 = r13.f3627d
                if (r13 == 0) goto L_0x0107
                int r14 = androidx.core.C0721R.C0724id.title
                r7.setTextViewText(r14, r13)
            L_0x0107:
                androidx.core.app.p$e r13 = r12.f3699a
                java.lang.CharSequence r13 = r13.f3628e
                if (r13 == 0) goto L_0x0114
                int r14 = androidx.core.C0721R.C0724id.text
                r7.setTextViewText(r14, r13)
                r13 = 1
                goto L_0x0115
            L_0x0114:
                r13 = 0
            L_0x0115:
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 >= r3) goto L_0x0121
                androidx.core.app.p$e r14 = r12.f3699a
                android.graphics.Bitmap r14 = r14.f3632i
                if (r14 == 0) goto L_0x0121
                r14 = 1
                goto L_0x0122
            L_0x0121:
                r14 = 0
            L_0x0122:
                androidx.core.app.p$e r1 = r12.f3699a
                java.lang.CharSequence r2 = r1.f3633j
                if (r2 == 0) goto L_0x0135
                int r13 = androidx.core.C0721R.C0724id.info
                r7.setTextViewText(r13, r2)
                int r13 = androidx.core.C0721R.C0724id.info
                r7.setViewVisibility(r13, r9)
            L_0x0132:
                r13 = 1
                r14 = 1
                goto L_0x016e
            L_0x0135:
                int r1 = r1.f3634k
                if (r1 <= 0) goto L_0x0169
                int r13 = androidx.core.C0721R.integer.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                androidx.core.app.p$e r14 = r12.f3699a
                int r14 = r14.f3634k
                if (r14 <= r13) goto L_0x0151
                int r13 = androidx.core.C0721R.C0724id.info
                int r14 = androidx.core.C0721R.string.status_bar_notification_info_overflow
                java.lang.String r14 = r0.getString(r14)
                r7.setTextViewText(r13, r14)
                goto L_0x0163
            L_0x0151:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r14 = androidx.core.C0721R.C0724id.info
                androidx.core.app.p$e r1 = r12.f3699a
                int r1 = r1.f3634k
                long r1 = (long) r1
                java.lang.String r13 = r13.format(r1)
                r7.setTextViewText(r14, r13)
            L_0x0163:
                int r13 = androidx.core.C0721R.C0724id.info
                r7.setViewVisibility(r13, r9)
                goto L_0x0132
            L_0x0169:
                int r1 = androidx.core.C0721R.C0724id.info
                r7.setViewVisibility(r1, r11)
            L_0x016e:
                androidx.core.app.p$e r1 = r12.f3699a
                java.lang.CharSequence r1 = r1.f3639p
                if (r1 == 0) goto L_0x0194
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r10) goto L_0x0194
                int r2 = androidx.core.C0721R.C0724id.text
                r7.setTextViewText(r2, r1)
                androidx.core.app.p$e r1 = r12.f3699a
                java.lang.CharSequence r1 = r1.f3628e
                if (r1 == 0) goto L_0x018f
                int r2 = androidx.core.C0721R.C0724id.text2
                r7.setTextViewText(r2, r1)
                int r1 = androidx.core.C0721R.C0724id.text2
                r7.setViewVisibility(r1, r9)
                r1 = 1
                goto L_0x0195
            L_0x018f:
                int r1 = androidx.core.C0721R.C0724id.text2
                r7.setViewVisibility(r1, r11)
            L_0x0194:
                r1 = 0
            L_0x0195:
                if (r1 == 0) goto L_0x01b3
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r10) goto L_0x01b3
                if (r15 == 0) goto L_0x01a9
                int r15 = androidx.core.C0721R.dimen.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = androidx.core.C0721R.C0724id.text
                r7.setTextViewTextSize(r0, r9, r15)
            L_0x01a9:
                int r2 = androidx.core.C0721R.C0724id.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x01b3:
                androidx.core.app.p$e r15 = r12.f3699a
                long r0 = r15.mo4258i()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0200
                androidx.core.app.p$e r14 = r12.f3699a
                boolean r14 = r14.f3637n
                if (r14 == 0) goto L_0x01ed
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x01ed
                int r14 = androidx.core.C0721R.C0724id.chronometer
                r7.setViewVisibility(r14, r9)
                int r14 = androidx.core.C0721R.C0724id.chronometer
                androidx.core.app.p$e r15 = r12.f3699a
                long r0 = r15.mo4258i()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r15 = "setBase"
                r7.setLong(r14, r15, r0)
                int r14 = androidx.core.C0721R.C0724id.chronometer
                java.lang.String r15 = "setStarted"
                r7.setBoolean(r14, r15, r8)
                goto L_0x01ff
            L_0x01ed:
                int r14 = androidx.core.C0721R.C0724id.time
                r7.setViewVisibility(r14, r9)
                int r14 = androidx.core.C0721R.C0724id.time
                androidx.core.app.p$e r15 = r12.f3699a
                long r0 = r15.mo4258i()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
            L_0x01ff:
                r14 = 1
            L_0x0200:
                int r15 = androidx.core.C0721R.C0724id.right_side
                if (r14 == 0) goto L_0x0206
                r14 = 0
                goto L_0x0208
            L_0x0206:
                r14 = 8
            L_0x0208:
                r7.setViewVisibility(r15, r14)
                int r14 = androidx.core.C0721R.C0724id.line3
                if (r13 == 0) goto L_0x0210
                goto L_0x0212
            L_0x0210:
                r9 = 8
            L_0x0212:
                r7.setViewVisibility(r14, r9)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0770p.C0791n.mo4306a(boolean, int, boolean):android.widget.RemoteViews");
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public Bitmap mo4305a(int i, int i2) {
            return m4552a(i, i2, 0);
        }

        /* renamed from: a */
        private Bitmap m4552a(int i, int i2, int i3) {
            Drawable drawable = this.f3699a.f3624a.getResources().getDrawable(i);
            int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: a */
        private Bitmap m4553a(int i, int i2, int i3, int i4) {
            int i5 = C0721R.C0723drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap a = m4552a(i5, i4, i2);
            Canvas canvas = new Canvas(a);
            Drawable mutate = this.f3699a.f3624a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
            mutate.draw(canvas);
            return a;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo4307a(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m4554a(remoteViews);
            remoteViews.removeAllViews(C0721R.C0724id.notification_main_column);
            remoteViews.addView(C0721R.C0724id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(C0721R.C0724id.notification_main_column, 0);
            if (VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(C0721R.C0724id.notification_main_column_container, 0, mo4290b(), 0, 0);
            }
        }

        /* renamed from: a */
        private void m4554a(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C0721R.C0724id.title, 8);
            remoteViews.setViewVisibility(C0721R.C0724id.text2, 8);
            remoteViews.setViewVisibility(C0721R.C0724id.text, 8);
        }
    }

    /* renamed from: androidx.core.app.p$o */
    /* compiled from: NotificationCompat */
    public static final class C0792o implements C0784h {

        /* renamed from: A */
        private static final String f3703A = "displayIntent";

        /* renamed from: B */
        private static final String f3704B = "pages";

        /* renamed from: C */
        private static final String f3705C = "background";

        /* renamed from: D */
        private static final String f3706D = "contentIcon";

        /* renamed from: E */
        private static final String f3707E = "contentIconGravity";

        /* renamed from: F */
        private static final String f3708F = "contentActionIndex";

        /* renamed from: G */
        private static final String f3709G = "customSizePreset";

        /* renamed from: H */
        private static final String f3710H = "customContentHeight";

        /* renamed from: I */
        private static final String f3711I = "gravity";

        /* renamed from: J */
        private static final String f3712J = "hintScreenTimeout";

        /* renamed from: K */
        private static final String f3713K = "dismissalId";

        /* renamed from: L */
        private static final String f3714L = "bridgeTag";

        /* renamed from: M */
        private static final int f3715M = 1;

        /* renamed from: N */
        private static final int f3716N = 2;

        /* renamed from: O */
        private static final int f3717O = 4;

        /* renamed from: P */
        private static final int f3718P = 8;

        /* renamed from: Q */
        private static final int f3719Q = 16;

        /* renamed from: R */
        private static final int f3720R = 32;

        /* renamed from: S */
        private static final int f3721S = 64;

        /* renamed from: T */
        private static final int f3722T = 1;

        /* renamed from: U */
        private static final int f3723U = 8388613;

        /* renamed from: V */
        private static final int f3724V = 80;

        /* renamed from: o */
        public static final int f3725o = -1;
        @Deprecated

        /* renamed from: p */
        public static final int f3726p = 0;
        @Deprecated

        /* renamed from: q */
        public static final int f3727q = 1;
        @Deprecated

        /* renamed from: r */
        public static final int f3728r = 2;
        @Deprecated

        /* renamed from: s */
        public static final int f3729s = 3;
        @Deprecated

        /* renamed from: t */
        public static final int f3730t = 4;
        @Deprecated

        /* renamed from: u */
        public static final int f3731u = 5;
        @Deprecated

        /* renamed from: v */
        public static final int f3732v = 0;
        @Deprecated

        /* renamed from: w */
        public static final int f3733w = -1;

        /* renamed from: x */
        private static final String f3734x = "android.wearable.EXTENSIONS";

        /* renamed from: y */
        private static final String f3735y = "actions";

        /* renamed from: z */
        private static final String f3736z = "flags";

        /* renamed from: a */
        private ArrayList<C0771a> f3737a = new ArrayList<>();

        /* renamed from: b */
        private int f3738b = 1;

        /* renamed from: c */
        private PendingIntent f3739c;

        /* renamed from: d */
        private ArrayList<Notification> f3740d = new ArrayList<>();

        /* renamed from: e */
        private Bitmap f3741e;

        /* renamed from: f */
        private int f3742f;

        /* renamed from: g */
        private int f3743g = 8388613;

        /* renamed from: h */
        private int f3744h = -1;

        /* renamed from: i */
        private int f3745i = 0;

        /* renamed from: j */
        private int f3746j;

        /* renamed from: k */
        private int f3747k = 80;

        /* renamed from: l */
        private int f3748l;

        /* renamed from: m */
        private String f3749m;

        /* renamed from: n */
        private String f3750n;

        public C0792o() {
        }

        @RequiresApi(20)
        /* renamed from: b */
        private static Action m4568b(C0771a aVar) {
            Bundle bundle;
            Action.Builder builder = new Action.Builder(aVar.mo4161e(), aVar.mo4165i(), aVar.mo4157a());
            if (aVar.mo4160d() != null) {
                bundle = new Bundle(aVar.mo4160d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo4158b());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo4158b());
            }
            builder.addExtras(bundle);
            C0807w[] f = aVar.mo4162f();
            if (f != null) {
                for (RemoteInput addRemoteInput : C0807w.m4702a(f)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            return builder.build();
        }

        /* renamed from: a */
        public C0779e mo4260a(C0779e eVar) {
            Bundle bundle = new Bundle();
            if (!this.f3737a.isEmpty()) {
                int i = VERSION.SDK_INT;
                String str = f3735y;
                if (i >= 16) {
                    ArrayList arrayList = new ArrayList(this.f3737a.size());
                    Iterator it = this.f3737a.iterator();
                    while (it.hasNext()) {
                        C0771a aVar = (C0771a) it.next();
                        int i2 = VERSION.SDK_INT;
                        if (i2 >= 20) {
                            arrayList.add(m4568b(aVar));
                        } else if (i2 >= 16) {
                            arrayList.add(C0795s.m4621a(aVar));
                        }
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                } else {
                    bundle.putParcelableArrayList(str, null);
                }
            }
            int i3 = this.f3738b;
            if (i3 != 1) {
                bundle.putInt(f3736z, i3);
            }
            PendingIntent pendingIntent = this.f3739c;
            if (pendingIntent != null) {
                bundle.putParcelable(f3703A, pendingIntent);
            }
            if (!this.f3740d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f3740d;
                bundle.putParcelableArray(f3704B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f3741e;
            if (bitmap != null) {
                bundle.putParcelable(f3705C, bitmap);
            }
            int i4 = this.f3742f;
            if (i4 != 0) {
                bundle.putInt(f3706D, i4);
            }
            int i5 = this.f3743g;
            if (i5 != 8388613) {
                bundle.putInt(f3707E, i5);
            }
            int i6 = this.f3744h;
            if (i6 != -1) {
                bundle.putInt(f3708F, i6);
            }
            int i7 = this.f3745i;
            if (i7 != 0) {
                bundle.putInt(f3709G, i7);
            }
            int i8 = this.f3746j;
            if (i8 != 0) {
                bundle.putInt(f3710H, i8);
            }
            int i9 = this.f3747k;
            if (i9 != 80) {
                bundle.putInt(f3711I, i9);
            }
            int i10 = this.f3748l;
            if (i10 != 0) {
                bundle.putInt(f3712J, i10);
            }
            String str2 = this.f3749m;
            if (str2 != null) {
                bundle.putString(f3713K, str2);
            }
            String str3 = this.f3750n;
            if (str3 != null) {
                bundle.putString(f3714L, str3);
            }
            eVar.mo4243e().putBundle(f3734x, bundle);
            return eVar;
        }

        /* renamed from: c */
        public List<C0771a> mo4325c() {
            return this.f3737a;
        }

        @Deprecated
        /* renamed from: d */
        public Bitmap mo4327d() {
            return this.f3741e;
        }

        @Deprecated
        /* renamed from: e */
        public C0792o mo4330e(int i) {
            this.f3745i = i;
            return this;
        }

        /* renamed from: f */
        public int mo4333f() {
            return this.f3744h;
        }

        @Deprecated
        /* renamed from: g */
        public int mo4336g() {
            return this.f3742f;
        }

        @Deprecated
        /* renamed from: h */
        public int mo4339h() {
            return this.f3743g;
        }

        /* renamed from: i */
        public boolean mo4340i() {
            return (this.f3738b & 1) != 0;
        }

        @Deprecated
        /* renamed from: j */
        public int mo4341j() {
            return this.f3746j;
        }

        @Deprecated
        /* renamed from: k */
        public int mo4342k() {
            return this.f3745i;
        }

        /* renamed from: l */
        public String mo4343l() {
            return this.f3749m;
        }

        @Deprecated
        /* renamed from: m */
        public PendingIntent mo4344m() {
            return this.f3739c;
        }

        @Deprecated
        /* renamed from: n */
        public int mo4345n() {
            return this.f3747k;
        }

        @Deprecated
        /* renamed from: o */
        public boolean mo4346o() {
            return (this.f3738b & 32) != 0;
        }

        @Deprecated
        /* renamed from: p */
        public boolean mo4347p() {
            return (this.f3738b & 16) != 0;
        }

        /* renamed from: q */
        public boolean mo4348q() {
            return (this.f3738b & 64) != 0;
        }

        @Deprecated
        /* renamed from: r */
        public boolean mo4349r() {
            return (this.f3738b & 2) != 0;
        }

        @Deprecated
        /* renamed from: s */
        public int mo4350s() {
            return this.f3748l;
        }

        @Deprecated
        /* renamed from: t */
        public boolean mo4351t() {
            return (this.f3738b & 4) != 0;
        }

        @Deprecated
        /* renamed from: u */
        public List<Notification> mo4352u() {
            return this.f3740d;
        }

        /* renamed from: v */
        public boolean mo4353v() {
            return (this.f3738b & 8) != 0;
        }

        @Deprecated
        /* renamed from: c */
        public C0792o mo4323c(int i) {
            this.f3743g = i;
            return this;
        }

        public C0792o clone() {
            C0792o oVar = new C0792o();
            oVar.f3737a = new ArrayList<>(this.f3737a);
            oVar.f3738b = this.f3738b;
            oVar.f3739c = this.f3739c;
            oVar.f3740d = new ArrayList<>(this.f3740d);
            oVar.f3741e = this.f3741e;
            oVar.f3742f = this.f3742f;
            oVar.f3743g = this.f3743g;
            oVar.f3744h = this.f3744h;
            oVar.f3745i = this.f3745i;
            oVar.f3746j = this.f3746j;
            oVar.f3747k = this.f3747k;
            oVar.f3748l = this.f3748l;
            oVar.f3749m = this.f3749m;
            oVar.f3750n = this.f3750n;
            return oVar;
        }

        @Deprecated
        /* renamed from: d */
        public C0792o mo4328d(int i) {
            this.f3746j = i;
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C0792o mo4331e(boolean z) {
            m4567a(2, z);
            return this;
        }

        @Deprecated
        /* renamed from: f */
        public C0792o mo4334f(int i) {
            this.f3747k = i;
            return this;
        }

        /* renamed from: g */
        public C0792o mo4338g(boolean z) {
            m4567a(8, z);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0792o mo4324c(boolean z) {
            m4567a(16, z);
            return this;
        }

        /* renamed from: d */
        public C0792o mo4329d(boolean z) {
            m4567a(64, z);
            return this;
        }

        /* renamed from: e */
        public String mo4332e() {
            return this.f3750n;
        }

        @Deprecated
        /* renamed from: f */
        public C0792o mo4335f(boolean z) {
            m4567a(4, z);
            return this;
        }

        @Deprecated
        /* renamed from: g */
        public C0792o mo4337g(int i) {
            this.f3748l = i;
            return this;
        }

        public C0792o(Notification notification) {
            Bundle f = C0770p.m4373f(notification);
            Bundle bundle = f != null ? f.getBundle(f3734x) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f3735y);
                if (VERSION.SDK_INT >= 16 && parcelableArrayList != null) {
                    C0771a[] aVarArr = new C0771a[parcelableArrayList.size()];
                    for (int i = 0; i < aVarArr.length; i++) {
                        int i2 = VERSION.SDK_INT;
                        if (i2 >= 20) {
                            aVarArr[i] = C0770p.m4366a((Action) parcelableArrayList.get(i));
                        } else if (i2 >= 16) {
                            aVarArr[i] = C0795s.m4631b((Bundle) parcelableArrayList.get(i));
                        }
                    }
                    Collections.addAll(this.f3737a, aVarArr);
                }
                this.f3738b = bundle.getInt(f3736z, 1);
                this.f3739c = (PendingIntent) bundle.getParcelable(f3703A);
                Notification[] a = C0770p.m4368a(bundle, f3704B);
                if (a != null) {
                    Collections.addAll(this.f3740d, a);
                }
                this.f3741e = (Bitmap) bundle.getParcelable(f3705C);
                this.f3742f = bundle.getInt(f3706D);
                this.f3743g = bundle.getInt(f3707E, 8388613);
                this.f3744h = bundle.getInt(f3708F, -1);
                this.f3745i = bundle.getInt(f3709G, 0);
                this.f3746j = bundle.getInt(f3710H);
                this.f3747k = bundle.getInt(f3711I, 80);
                this.f3748l = bundle.getInt(f3712J);
                this.f3749m = bundle.getString(f3713K);
                this.f3750n = bundle.getString(f3714L);
            }
        }

        @Deprecated
        /* renamed from: b */
        public C0792o mo4321b(List<Notification> list) {
            this.f3740d.addAll(list);
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C0792o mo4318b() {
            this.f3740d.clear();
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C0792o mo4319b(int i) {
            this.f3742f = i;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C0792o mo4322b(boolean z) {
            m4567a(32, z);
            return this;
        }

        /* renamed from: b */
        public C0792o mo4320b(String str) {
            this.f3749m = str;
            return this;
        }

        /* renamed from: a */
        public C0792o mo4314a(C0771a aVar) {
            this.f3737a.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0792o mo4316a(List<C0771a> list) {
            this.f3737a.addAll(list);
            return this;
        }

        /* renamed from: a */
        public C0792o mo4309a() {
            this.f3737a.clear();
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C0792o mo4312a(PendingIntent pendingIntent) {
            this.f3739c = pendingIntent;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C0792o mo4311a(Notification notification) {
            this.f3740d.add(notification);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C0792o mo4313a(Bitmap bitmap) {
            this.f3741e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0792o mo4310a(int i) {
            this.f3744h = i;
            return this;
        }

        /* renamed from: a */
        public C0792o mo4317a(boolean z) {
            m4567a(1, z);
            return this;
        }

        /* renamed from: a */
        public C0792o mo4315a(String str) {
            this.f3750n = str;
            return this;
        }

        /* renamed from: a */
        private void m4567a(int i, boolean z) {
            if (z) {
                this.f3738b = i | this.f3738b;
                return;
            }
            this.f3738b = (i ^ -1) & this.f3738b;
        }
    }

    /* renamed from: a */
    static Notification[] m4368a(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* renamed from: b */
    public static int m4369b(Notification notification) {
        if (VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    /* renamed from: c */
    public static String m4370c(Notification notification) {
        if (VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }

    /* renamed from: d */
    public static String m4371d(Notification notification) {
        if (VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    @RequiresApi(19)
    /* renamed from: e */
    public static CharSequence m4372e(Notification notification) {
        return notification.extras.getCharSequence(f3551u);
    }

    @C0195i0
    /* renamed from: f */
    public static Bundle m4373f(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0795s.m4633c(notification);
        }
        return null;
    }

    /* renamed from: g */
    public static String m4374g(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getGroup();
        }
        String str = C0794r.f3760b;
        if (i >= 19) {
            return notification.extras.getString(str);
        }
        if (i >= 16) {
            return C0795s.m4633c(notification).getString(str);
        }
        return null;
    }

    /* renamed from: h */
    public static int m4375h(Notification notification) {
        if (VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @RequiresApi(21)
    /* renamed from: i */
    public static List<C0771a> m4376i(Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                arrayList.add(C0795s.m4631b(bundle2.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static boolean m4377j(Notification notification) {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i >= 20) {
            if ((notification.flags & 256) != 0) {
                z = true;
            }
            return z;
        }
        String str = C0794r.f3759a;
        if (i >= 19) {
            return notification.extras.getBoolean(str);
        }
        if (i >= 16) {
            return C0795s.m4633c(notification).getBoolean(str);
        }
        return false;
    }

    /* renamed from: k */
    public static String m4378k(Notification notification) {
        if (VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    /* renamed from: l */
    public static String m4379l(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getSortKey();
        }
        String str = C0794r.f3762d;
        if (i >= 19) {
            return notification.extras.getString(str);
        }
        if (i >= 16) {
            return C0795s.m4633c(notification).getString(str);
        }
        return null;
    }

    /* renamed from: m */
    public static long m4380m(Notification notification) {
        if (VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    /* renamed from: n */
    public static boolean m4381n(Notification notification) {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i >= 20) {
            if ((notification.flags & 512) != 0) {
                z = true;
            }
            return z;
        }
        String str = C0794r.f3761c;
        if (i >= 19) {
            return notification.extras.getBoolean(str);
        }
        if (i >= 16) {
            return C0795s.m4633c(notification).getBoolean(str);
        }
        return false;
    }

    /* renamed from: a */
    public static int m4365a(Notification notification) {
        int i = VERSION.SDK_INT;
        int i2 = 0;
        if (i >= 19) {
            Action[] actionArr = notification.actions;
            if (actionArr != null) {
                i2 = actionArr.length;
            }
            return i2;
        } else if (i >= 16) {
            return C0795s.m4619a(notification);
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public static C0771a m4367a(Notification notification, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 20) {
            return m4366a(notification.actions[i]);
        }
        Bundle bundle = null;
        if (i2 >= 19) {
            Action action = notification.actions[i];
            SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray(C0794r.f3763e);
            if (sparseParcelableArray != null) {
                bundle = (Bundle) sparseParcelableArray.get(i);
            }
            return C0795s.m4624a(action.icon, action.title, action.actionIntent, bundle);
        } else if (i2 >= 16) {
            return C0795s.m4625a(notification, i);
        } else {
            return null;
        }
    }

    @RequiresApi(20)
    /* renamed from: a */
    static C0771a m4366a(Action action) {
        C0807w[] wVarArr;
        int i;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            wVarArr = null;
        } else {
            C0807w[] wVarArr2 = new C0807w[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                RemoteInput remoteInput = remoteInputs[i2];
                C0807w wVar = new C0807w(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras(), null);
                wVarArr2[i2] = wVar;
            }
            wVarArr = wVarArr2;
        }
        String str = "android.support.allowGeneratedReplies";
        boolean z = VERSION.SDK_INT >= 24 ? action.getExtras().getBoolean(str) || action.getAllowGeneratedReplies() : action.getExtras().getBoolean(str);
        boolean z2 = z;
        boolean z3 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (VERSION.SDK_INT >= 28) {
            i = action.getSemanticAction();
        } else {
            i = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        C0771a aVar = new C0771a(action.icon, action.title, action.actionIntent, action.getExtras(), wVarArr, null, z2, i, z3);
        return aVar;
    }
}

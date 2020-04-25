package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.app.C0770p.C0771a;
import androidx.core.app.C0770p.C0779e;
import androidx.core.app.C0770p.C0791n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.q */
/* compiled from: NotificationCompatBuilder */
class C0793q implements C0769o {

    /* renamed from: a */
    private final Builder f3751a;

    /* renamed from: b */
    private final C0779e f3752b;

    /* renamed from: c */
    private RemoteViews f3753c;

    /* renamed from: d */
    private RemoteViews f3754d;

    /* renamed from: e */
    private final List<Bundle> f3755e = new ArrayList();

    /* renamed from: f */
    private final Bundle f3756f = new Bundle();

    /* renamed from: g */
    private int f3757g;

    /* renamed from: h */
    private RemoteViews f3758h;

    C0793q(C0779e eVar) {
        this.f3752b = eVar;
        if (VERSION.SDK_INT >= 26) {
            this.f3751a = new Builder(eVar.f3624a, eVar.f3617I);
        } else {
            this.f3751a = new Builder(eVar.f3624a);
        }
        Notification notification = eVar.f3622N;
        this.f3751a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f3631h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f3627d).setContentText(eVar.f3628e).setContentInfo(eVar.f3633j).setContentIntent(eVar.f3629f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f3630g, (notification.flags & 128) != 0).setLargeIcon(eVar.f3632i).setNumber(eVar.f3634k).setProgress(eVar.f3641r, eVar.f3642s, eVar.f3643t);
        if (VERSION.SDK_INT < 21) {
            this.f3751a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f3751a.setSubText(eVar.f3639p).setUsesChronometer(eVar.f3637n).setPriority(eVar.f3635l);
            Iterator it = eVar.f3625b.iterator();
            while (it.hasNext()) {
                m4615a((C0771a) it.next());
            }
            Bundle bundle = eVar.f3610B;
            if (bundle != null) {
                this.f3756f.putAll(bundle);
            }
            if (VERSION.SDK_INT < 20) {
                if (eVar.f3647x) {
                    this.f3756f.putBoolean(C0794r.f3759a, true);
                }
                String str = eVar.f3644u;
                if (str != null) {
                    this.f3756f.putString(C0794r.f3760b, str);
                    if (eVar.f3645v) {
                        this.f3756f.putBoolean(C0794r.f3761c, true);
                    } else {
                        this.f3756f.putBoolean(C0798u.f3794f, true);
                    }
                }
                String str2 = eVar.f3646w;
                if (str2 != null) {
                    this.f3756f.putString(C0794r.f3762d, str2);
                }
            }
            this.f3753c = eVar.f3614F;
            this.f3754d = eVar.f3615G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f3751a.setShowWhen(eVar.f3636m);
            if (VERSION.SDK_INT < 21) {
                ArrayList<String> arrayList = eVar.f3623O;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle2 = this.f3756f;
                    ArrayList<String> arrayList2 = eVar.f3623O;
                    bundle2.putStringArray(C0770p.f3498N, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f3751a.setLocalOnly(eVar.f3647x).setGroup(eVar.f3644u).setGroupSummary(eVar.f3645v).setSortKey(eVar.f3646w);
            this.f3757g = eVar.f3621M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f3751a.setCategory(eVar.f3609A).setColor(eVar.f3611C).setVisibility(eVar.f3612D).setPublicVersion(eVar.f3613E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = eVar.f3623O.iterator();
            while (it2.hasNext()) {
                this.f3751a.addPerson((String) it2.next());
            }
            this.f3758h = eVar.f3616H;
            if (eVar.f3626c.size() > 0) {
                String str3 = "android.car.EXTENSIONS";
                Bundle bundle3 = eVar.mo4243e().getBundle(str3);
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < eVar.f3626c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), C0795s.m4621a((C0771a) eVar.f3626c.get(i)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.mo4243e().putBundle(str3, bundle3);
                this.f3756f.putBundle(str3, bundle3);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f3751a.setExtras(eVar.f3610B).setRemoteInputHistory(eVar.f3640q);
            RemoteViews remoteViews = eVar.f3614F;
            if (remoteViews != null) {
                this.f3751a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f3615G;
            if (remoteViews2 != null) {
                this.f3751a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f3616H;
            if (remoteViews3 != null) {
                this.f3751a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f3751a.setBadgeIconType(eVar.f3618J).setShortcutId(eVar.f3619K).setTimeoutAfter(eVar.f3620L).setGroupAlertBehavior(eVar.f3621M);
            if (eVar.f3649z) {
                this.f3751a.setColorized(eVar.f3648y);
            }
            if (!TextUtils.isEmpty(eVar.f3617I)) {
                this.f3751a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    /* renamed from: a */
    public Builder mo4156a() {
        return this.f3751a;
    }

    /* renamed from: b */
    public Notification mo4354b() {
        C0791n nVar = this.f3752b.f3638o;
        if (nVar != null) {
            nVar.mo4190a((C0769o) this);
        }
        RemoteViews c = nVar != null ? nVar.mo4279c(this) : null;
        Notification c2 = mo4355c();
        if (c != null) {
            c2.contentView = c;
        } else {
            RemoteViews remoteViews = this.f3752b.f3614F;
            if (remoteViews != null) {
                c2.contentView = remoteViews;
            }
        }
        if (VERSION.SDK_INT >= 16 && nVar != null) {
            RemoteViews b = nVar.mo4278b((C0769o) this);
            if (b != null) {
                c2.bigContentView = b;
            }
        }
        if (VERSION.SDK_INT >= 21 && nVar != null) {
            RemoteViews d = this.f3752b.f3638o.mo4280d(this);
            if (d != null) {
                c2.headsUpContentView = d;
            }
        }
        if (VERSION.SDK_INT >= 16 && nVar != null) {
            Bundle f = C0770p.m4373f(c2);
            if (f != null) {
                nVar.mo4289a(f);
            }
        }
        return c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo4355c() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return this.f3751a.build();
        }
        if (i >= 24) {
            Notification build = this.f3751a.build();
            if (this.f3757g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f3757g != 2)) {
                    m4614a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f3757g == 1) {
                    m4614a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f3751a.setExtras(this.f3756f);
            Notification build2 = this.f3751a.build();
            RemoteViews remoteViews = this.f3753c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f3754d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f3758h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f3757g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f3757g != 2)) {
                    m4614a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f3757g == 1) {
                    m4614a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f3751a.setExtras(this.f3756f);
            Notification build3 = this.f3751a.build();
            RemoteViews remoteViews4 = this.f3753c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f3754d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f3757g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f3757g != 2)) {
                    m4614a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f3757g == 1) {
                    m4614a(build3);
                }
            }
            return build3;
        } else {
            String str = C0794r.f3763e;
            if (i >= 19) {
                SparseArray a = C0795s.m4623a(this.f3755e);
                if (a != null) {
                    this.f3756f.putSparseParcelableArray(str, a);
                }
                this.f3751a.setExtras(this.f3756f);
                Notification build4 = this.f3751a.build();
                RemoteViews remoteViews6 = this.f3753c;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.f3754d;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i < 16) {
                return this.f3751a.getNotification();
            } else {
                Notification build5 = this.f3751a.build();
                Bundle f = C0770p.m4373f(build5);
                Bundle bundle = new Bundle(this.f3756f);
                for (String str2 : this.f3756f.keySet()) {
                    if (f.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
                f.putAll(bundle);
                SparseArray a2 = C0795s.m4623a(this.f3755e);
                if (a2 != null) {
                    C0770p.m4373f(build5).putSparseParcelableArray(str, a2);
                }
                RemoteViews remoteViews8 = this.f3753c;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.f3754d;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            }
        }
    }

    /* renamed from: a */
    private void m4615a(C0771a aVar) {
        Bundle bundle;
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            Action.Builder builder = new Action.Builder(aVar.mo4161e(), aVar.mo4165i(), aVar.mo4157a());
            if (aVar.mo4162f() != null) {
                for (RemoteInput addRemoteInput : C0807w.m4702a(aVar.mo4162f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo4160d() != null) {
                bundle = new Bundle(aVar.mo4160d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo4158b());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo4158b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo4163g());
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo4163g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo4164h());
            builder.addExtras(bundle);
            this.f3751a.addAction(builder.build());
        } else if (i >= 16) {
            this.f3755e.add(C0795s.m4620a(this.f3751a, aVar));
        }
    }

    /* renamed from: a */
    private void m4614a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.p018c.C0821b;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.i */
/* compiled from: AppCompatDrawableManager */
public final class C0510i {

    /* renamed from: b */
    private static final String f2045b = "AppCompatDrawableManag";

    /* renamed from: c */
    private static final boolean f2046c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Mode f2047d = Mode.SRC_IN;

    /* renamed from: e */
    private static C0510i f2048e;

    /* renamed from: a */
    private ResourceManagerInternal f2049a;

    /* renamed from: androidx.appcompat.widget.i$a */
    /* compiled from: AppCompatDrawableManager */
    static class C0511a implements C0438e {

        /* renamed from: a */
        private final int[] f2050a = {C0238R.C0240drawable.abc_textfield_search_default_mtrl_alpha, C0238R.C0240drawable.abc_textfield_default_mtrl_alpha, C0238R.C0240drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f2051b = {C0238R.C0240drawable.abc_ic_commit_search_api_mtrl_alpha, C0238R.C0240drawable.abc_seekbar_tick_mark_material, C0238R.C0240drawable.abc_ic_menu_share_mtrl_alpha, C0238R.C0240drawable.abc_ic_menu_copy_mtrl_am_alpha, C0238R.C0240drawable.abc_ic_menu_cut_mtrl_alpha, C0238R.C0240drawable.abc_ic_menu_selectall_mtrl_alpha, C0238R.C0240drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f2052c = {C0238R.C0240drawable.abc_textfield_activated_mtrl_alpha, C0238R.C0240drawable.abc_textfield_search_activated_mtrl_alpha, C0238R.C0240drawable.abc_cab_background_top_mtrl_alpha, C0238R.C0240drawable.abc_text_cursor_material, C0238R.C0240drawable.abc_text_select_handle_left_mtrl_dark, C0238R.C0240drawable.abc_text_select_handle_middle_mtrl_dark, C0238R.C0240drawable.abc_text_select_handle_right_mtrl_dark, C0238R.C0240drawable.abc_text_select_handle_left_mtrl_light, C0238R.C0240drawable.abc_text_select_handle_middle_mtrl_light, C0238R.C0240drawable.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f2053d = {C0238R.C0240drawable.abc_popup_background_mtrl_mult, C0238R.C0240drawable.abc_cab_background_internal_bg, C0238R.C0240drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f2054e = {C0238R.C0240drawable.abc_tab_indicator_material, C0238R.C0240drawable.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f2055f = {C0238R.C0240drawable.abc_btn_check_material, C0238R.C0240drawable.abc_btn_radio_material, C0238R.C0240drawable.abc_btn_check_material_anim, C0238R.C0240drawable.abc_btn_radio_material_anim};

        C0511a() {
        }

        /* renamed from: a */
        private ColorStateList m2778a(@C0193h0 Context context) {
            return m2782b(context, 0);
        }

        /* renamed from: b */
        private ColorStateList m2781b(@C0193h0 Context context) {
            return m2782b(context, C0538o0.m2884b(context, C0238R.attr.colorAccent));
        }

        /* renamed from: c */
        private ColorStateList m2783c(@C0193h0 Context context) {
            return m2782b(context, C0538o0.m2884b(context, C0238R.attr.colorButtonNormal));
        }

        /* renamed from: d */
        private ColorStateList m2784d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c = C0538o0.m2885c(context, C0238R.attr.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = C0538o0.f2156b;
                iArr2[0] = C0538o0.m2880a(context, C0238R.attr.colorSwitchThumbNormal);
                iArr[1] = C0538o0.f2160f;
                iArr2[1] = C0538o0.m2884b(context, C0238R.attr.colorControlActivated);
                iArr[2] = C0538o0.f2163i;
                iArr2[2] = C0538o0.m2884b(context, C0238R.attr.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0538o0.f2156b;
                iArr2[0] = c.getColorForState(iArr[0], 0);
                iArr[1] = C0538o0.f2160f;
                iArr2[1] = C0538o0.m2884b(context, C0238R.attr.colorControlActivated);
                iArr[2] = C0538o0.f2163i;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: a */
        public Drawable mo2200a(@C0193h0 ResourceManagerInternal resourceManagerInternal, @C0193h0 Context context, int i) {
            if (i != C0238R.C0240drawable.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, C0238R.C0240drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, C0238R.C0240drawable.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: b */
        private ColorStateList m2782b(@C0193h0 Context context, @C0198k int i) {
            int b = C0538o0.m2884b(context, C0238R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{C0538o0.f2156b, C0538o0.f2159e, C0538o0.f2157c, C0538o0.f2163i}, new int[]{C0538o0.m2880a(context, C0238R.attr.colorButtonNormal), C0821b.m4810c(b, i), C0821b.m4810c(b, i), i});
        }

        /* renamed from: a */
        private void m2779a(Drawable drawable, int i, Mode mode) {
            if (C0469a0.m2595a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0510i.f2047d;
            }
            drawable.setColorFilter(C0510i.m2768a(i, mode));
        }

        /* renamed from: a */
        private boolean m2780a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public ColorStateList mo2198a(@C0193h0 Context context, int i) {
            if (i == C0238R.C0240drawable.abc_edit_text_material) {
                return C0242a.m1108b(context, C0238R.C0239color.abc_tint_edittext);
            }
            if (i == C0238R.C0240drawable.abc_switch_track_mtrl_alpha) {
                return C0242a.m1108b(context, C0238R.C0239color.abc_tint_switch_track);
            }
            if (i == C0238R.C0240drawable.abc_switch_thumb_material) {
                return m2784d(context);
            }
            if (i == C0238R.C0240drawable.abc_btn_default_mtrl_shape) {
                return m2783c(context);
            }
            if (i == C0238R.C0240drawable.abc_btn_borderless_material) {
                return m2778a(context);
            }
            if (i == C0238R.C0240drawable.abc_btn_colored_material) {
                return m2781b(context);
            }
            if (i == C0238R.C0240drawable.abc_spinner_mtrl_am_alpha || i == C0238R.C0240drawable.abc_spinner_textfield_background_material) {
                return C0242a.m1108b(context, C0238R.C0239color.abc_tint_spinner);
            }
            if (m2780a(this.f2051b, i)) {
                return C0538o0.m2885c(context, C0238R.attr.colorControlNormal);
            }
            if (m2780a(this.f2054e, i)) {
                return C0242a.m1108b(context, C0238R.C0239color.abc_tint_default);
            }
            if (m2780a(this.f2055f, i)) {
                return C0242a.m1108b(context, C0238R.C0239color.abc_tint_btn_checkable);
            }
            if (i == C0238R.C0240drawable.abc_seekbar_thumb_material) {
                return C0242a.m1108b(context, C0238R.C0239color.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo2202b(@C0193h0 Context context, int i, @C0193h0 Drawable drawable) {
            if (i == C0238R.C0240drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m2779a(layerDrawable.findDrawableByLayerId(16908288), C0538o0.m2884b(context, C0238R.attr.colorControlNormal), C0510i.f2047d);
                m2779a(layerDrawable.findDrawableByLayerId(16908303), C0538o0.m2884b(context, C0238R.attr.colorControlNormal), C0510i.f2047d);
                m2779a(layerDrawable.findDrawableByLayerId(16908301), C0538o0.m2884b(context, C0238R.attr.colorControlActivated), C0510i.f2047d);
                return true;
            } else if (i != C0238R.C0240drawable.abc_ratingbar_material && i != C0238R.C0240drawable.abc_ratingbar_indicator_material && i != C0238R.C0240drawable.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m2779a(layerDrawable2.findDrawableByLayerId(16908288), C0538o0.m2880a(context, C0238R.attr.colorControlNormal), C0510i.f2047d);
                m2779a(layerDrawable2.findDrawableByLayerId(16908303), C0538o0.m2884b(context, C0238R.attr.colorControlActivated), C0510i.f2047d);
                m2779a(layerDrawable2.findDrawableByLayerId(16908301), C0538o0.m2884b(context, C0238R.attr.colorControlActivated), C0510i.f2047d);
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2201a(@androidx.annotation.C0193h0 android.content.Context r7, int r8, @androidx.annotation.C0193h0 android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0510i.f2047d
                int[] r1 = r6.f2050a
                boolean r1 = r6.m2780a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0018
                int r2 = androidx.appcompat.C0238R.attr.colorControlNormal
            L_0x0014:
                r1 = r0
                r8 = 1
                r0 = -1
                goto L_0x0049
            L_0x0018:
                int[] r1 = r6.f2052c
                boolean r1 = r6.m2780a(r1, r8)
                if (r1 == 0) goto L_0x0023
                int r2 = androidx.appcompat.C0238R.attr.colorControlActivated
                goto L_0x0014
            L_0x0023:
                int[] r1 = r6.f2053d
                boolean r1 = r6.m2780a(r1, r8)
                if (r1 == 0) goto L_0x002e
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002e:
                int r1 = androidx.appcompat.C0238R.C0240drawable.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x0040
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = r0
                r0 = r8
                r8 = 1
                goto L_0x0049
            L_0x0040:
                int r1 = androidx.appcompat.C0238R.C0240drawable.abc_dialog_material_background
                if (r8 != r1) goto L_0x0045
                goto L_0x0014
            L_0x0045:
                r1 = r0
                r8 = 0
                r0 = -1
                r2 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x0066
                boolean r8 = androidx.appcompat.widget.C0469a0.m2595a(r9)
                if (r8 == 0) goto L_0x0055
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0055:
                int r7 = androidx.appcompat.widget.C0538o0.m2884b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0510i.m2768a(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r3) goto L_0x0065
                r9.setAlpha(r0)
            L_0x0065:
                return r5
            L_0x0066:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0510i.C0511a.mo2201a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: a */
        public Mode mo2199a(int i) {
            if (i == C0238R.C0240drawable.abc_switch_thumb_material) {
                return Mode.MULTIPLY;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C0510i m2770b() {
        C0510i iVar;
        synchronized (C0510i.class) {
            if (f2048e == null) {
                m2771c();
            }
            iVar = f2048e;
        }
        return iVar;
    }

    /* renamed from: c */
    public static synchronized void m2771c() {
        synchronized (C0510i.class) {
            if (f2048e == null) {
                f2048e = new C0510i();
                f2048e.f2049a = ResourceManagerInternal.get();
                f2048e.f2049a.setHooks(new C0511a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo2670a(@C0193h0 Context context, @C0213q int i) {
        return this.f2049a.getDrawable(context, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo2671a(@C0193h0 Context context, @C0213q int i, boolean z) {
        return this.f2049a.getDrawable(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo2673a(@C0193h0 Context context) {
        this.f2049a.onConfigurationChanged(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo2675b(@C0193h0 Context context, @C0213q int i) {
        return this.f2049a.getTintList(context, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo2672a(@C0193h0 Context context, @C0193h0 C0565y0 y0Var, @C0213q int i) {
        return this.f2049a.onDrawableLoadedFromResources(context, y0Var, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2674a(@C0193h0 Context context, @C0213q int i, @C0193h0 Drawable drawable) {
        return this.f2049a.tintDrawableUsingColorFilter(context, i, drawable);
    }

    /* renamed from: a */
    static void m2769a(Drawable drawable, C0545r0 r0Var, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, r0Var, iArr);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2768a(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0510i.class) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }
}

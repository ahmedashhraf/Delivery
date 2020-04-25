package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.dynamic.C4516c.C4517a;

@C4056a
/* renamed from: com.google.android.gms.dynamic.h */
public final class C4525h extends C4517a {

    /* renamed from: b */
    private Fragment f13785b;

    private C4525h(Fragment fragment) {
        this.f13785b = fragment;
    }

    @C4056a
    /* renamed from: a */
    public static C4525h m19514a(Fragment fragment) {
        if (fragment != null) {
            return new C4525h(fragment);
        }
        return null;
    }

    /* renamed from: A */
    public final C4519d mo18596A() {
        return C4523f.m19511a(this.f13785b.getResources());
    }

    /* renamed from: G */
    public final C4516c mo18597G() {
        return m19514a(this.f13785b.getTargetFragment());
    }

    /* renamed from: H */
    public final C4519d mo18598H() {
        return C4523f.m19511a(this.f13785b.getActivity());
    }

    /* renamed from: I */
    public final C4516c mo18599I() {
        return m19514a(this.f13785b.getParentFragment());
    }

    /* renamed from: N */
    public final C4519d mo18600N() {
        return C4523f.m19511a(this.f13785b.getView());
    }

    /* renamed from: S */
    public final Bundle mo18601S() {
        return this.f13785b.getArguments();
    }

    /* renamed from: W */
    public final boolean mo18602W() {
        return this.f13785b.isHidden();
    }

    /* renamed from: Z */
    public final boolean mo18603Z() {
        return this.f13785b.getUserVisibleHint();
    }

    /* renamed from: c0 */
    public final boolean mo18605c0() {
        return this.f13785b.isDetached();
    }

    /* renamed from: f0 */
    public final boolean mo18606f0() {
        return this.f13785b.getRetainInstance();
    }

    public final int getId() {
        return this.f13785b.getId();
    }

    /* renamed from: i */
    public final void mo18608i(boolean z) {
        this.f13785b.setHasOptionsMenu(z);
    }

    public final boolean isVisible() {
        return this.f13785b.isVisible();
    }

    /* renamed from: j */
    public final void mo18610j(boolean z) {
        this.f13785b.setUserVisibleHint(z);
    }

    /* renamed from: n */
    public final void mo18611n(boolean z) {
        this.f13785b.setMenuVisibility(z);
    }

    /* renamed from: n0 */
    public final boolean mo18612n0() {
        return this.f13785b.isInLayout();
    }

    /* renamed from: o */
    public final void mo18613o(boolean z) {
        this.f13785b.setRetainInstance(z);
    }

    /* renamed from: q0 */
    public final boolean mo18614q0() {
        return this.f13785b.isRemoving();
    }

    /* renamed from: r0 */
    public final boolean mo18615r0() {
        return this.f13785b.isResumed();
    }

    /* renamed from: s0 */
    public final boolean mo18616s0() {
        return this.f13785b.isAdded();
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f13785b.startActivityForResult(intent, i);
    }

    /* renamed from: v0 */
    public final int mo18618v0() {
        return this.f13785b.getTargetRequestCode();
    }

    /* renamed from: y */
    public final String mo18619y() {
        return this.f13785b.getTag();
    }

    public final void zza(C4519d dVar) {
        this.f13785b.registerForContextMenu((View) C4523f.m19512d(dVar));
    }

    public final void zzb(C4519d dVar) {
        this.f13785b.unregisterForContextMenu((View) C4523f.m19512d(dVar));
    }

    /* renamed from: a */
    public final void mo18604a(Intent intent) {
        this.f13785b.startActivity(intent);
    }
}

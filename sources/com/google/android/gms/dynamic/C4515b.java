package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.dynamic.C4516c.C4517a;

@C4056a
@SuppressLint({"NewApi"})
/* renamed from: com.google.android.gms.dynamic.b */
public final class C4515b extends C4517a {

    /* renamed from: b */
    private Fragment f13783b;

    private C4515b(Fragment fragment) {
        this.f13783b = fragment;
    }

    @C4056a
    /* renamed from: a */
    public static C4515b m19444a(Fragment fragment) {
        if (fragment != null) {
            return new C4515b(fragment);
        }
        return null;
    }

    /* renamed from: A */
    public final C4519d mo18596A() {
        return C4523f.m19511a(this.f13783b.getResources());
    }

    /* renamed from: G */
    public final C4516c mo18597G() {
        return m19444a(this.f13783b.getTargetFragment());
    }

    /* renamed from: H */
    public final C4519d mo18598H() {
        return C4523f.m19511a(this.f13783b.getActivity());
    }

    /* renamed from: I */
    public final C4516c mo18599I() {
        return m19444a(this.f13783b.getParentFragment());
    }

    /* renamed from: N */
    public final C4519d mo18600N() {
        return C4523f.m19511a(this.f13783b.getView());
    }

    /* renamed from: S */
    public final Bundle mo18601S() {
        return this.f13783b.getArguments();
    }

    /* renamed from: W */
    public final boolean mo18602W() {
        return this.f13783b.isHidden();
    }

    /* renamed from: Z */
    public final boolean mo18603Z() {
        return this.f13783b.getUserVisibleHint();
    }

    /* renamed from: c0 */
    public final boolean mo18605c0() {
        return this.f13783b.isDetached();
    }

    /* renamed from: f0 */
    public final boolean mo18606f0() {
        return this.f13783b.getRetainInstance();
    }

    public final int getId() {
        return this.f13783b.getId();
    }

    /* renamed from: i */
    public final void mo18608i(boolean z) {
        this.f13783b.setHasOptionsMenu(z);
    }

    public final boolean isVisible() {
        return this.f13783b.isVisible();
    }

    /* renamed from: j */
    public final void mo18610j(boolean z) {
        this.f13783b.setUserVisibleHint(z);
    }

    /* renamed from: n */
    public final void mo18611n(boolean z) {
        this.f13783b.setMenuVisibility(z);
    }

    /* renamed from: n0 */
    public final boolean mo18612n0() {
        return this.f13783b.isInLayout();
    }

    /* renamed from: o */
    public final void mo18613o(boolean z) {
        this.f13783b.setRetainInstance(z);
    }

    /* renamed from: q0 */
    public final boolean mo18614q0() {
        return this.f13783b.isRemoving();
    }

    /* renamed from: r0 */
    public final boolean mo18615r0() {
        return this.f13783b.isResumed();
    }

    /* renamed from: s0 */
    public final boolean mo18616s0() {
        return this.f13783b.isAdded();
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f13783b.startActivityForResult(intent, i);
    }

    /* renamed from: v0 */
    public final int mo18618v0() {
        return this.f13783b.getTargetRequestCode();
    }

    /* renamed from: y */
    public final String mo18619y() {
        return this.f13783b.getTag();
    }

    public final void zza(C4519d dVar) {
        this.f13783b.registerForContextMenu((View) C4523f.m19512d(dVar));
    }

    public final void zzb(C4519d dVar) {
        this.f13783b.unregisterForContextMenu((View) C4523f.m19512d(dVar));
    }

    /* renamed from: a */
    public final void mo18604a(Intent intent) {
        this.f13783b.startActivity(intent);
    }
}

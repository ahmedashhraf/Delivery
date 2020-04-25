package omrecorder;

import android.media.AudioRecord;

/* renamed from: omrecorder.e */
/* compiled from: MinimumBufferSize */
final class C15041e {

    /* renamed from: a */
    private final int f43776a;

    C15041e(C15038c cVar) {
        this.f43776a = AudioRecord.getMinBufferSize(cVar.mo46696b(), cVar.mo46697c(), cVar.mo46695a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo46700a() {
        return this.f43776a;
    }
}

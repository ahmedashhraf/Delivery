package kotlin.p508io;

import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.io.r */
/* compiled from: Utils.kt */
final class C14720r extends FileSystemException {
    public C14720r(@C6003d File file) {
        C14445h0.m62478f(file, UriUtil.LOCAL_FILE_SCHEME);
        super(file, null, null, 6, null);
    }
}

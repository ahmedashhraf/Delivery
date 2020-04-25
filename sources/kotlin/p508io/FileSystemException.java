package kotlin.p508io;

import com.facebook.common.util.UriUtil;
import java.io.File;
import java.io.IOException;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo24990d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "file", "Ljava/io/File;", "other", "reason", "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getOther", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.io.FileSystemException */
/* compiled from: Exceptions.kt */
public class FileSystemException extends IOException {
    @C6004e

    /* renamed from: N */
    private final String f42921N;
    @C6003d

    /* renamed from: a */
    private final File f42922a;
    @C6004e

    /* renamed from: b */
    private final File f42923b;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i, C14487u uVar) {
        if ((i & 2) != 0) {
            file2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(file, file2, str);
    }

    @C6003d
    /* renamed from: a */
    public final File mo45939a() {
        return this.f42922a;
    }

    @C6004e
    /* renamed from: d */
    public final File mo45940d() {
        return this.f42923b;
    }

    @C6004e
    /* renamed from: e */
    public final String mo45941e() {
        return this.f42921N;
    }

    public FileSystemException(@C6003d File file, @C6004e File file2, @C6004e String str) {
        C14445h0.m62478f(file, UriUtil.LOCAL_FILE_SCHEME);
        super(C14697e.m63731b(file, file2, str));
        this.f42922a = file;
        this.f42923b = file2;
        this.f42921N = str;
    }
}

package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import p201f.p202a.C5952h;

public class DirectorySoSource extends SoSource {
    public static final int ON_LD_LIBRARY_PATH = 2;
    public static final int RESOLVE_DEPENDENCIES = 1;
    protected final int flags;
    protected final File soDirectory;

    public DirectorySoSource(File file, int i) {
        this.soDirectory = file;
        this.flags = i;
    }

    private static String[] getDependencies(File file) throws IOException {
        if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
            StringBuilder sb = new StringBuilder();
            sb.append("SoLoader.getElfDependencies[");
            sb.append(file.getName());
            sb.append("]");
            Api18TraceUtils.beginTraceSection(sb.toString());
        }
        try {
            return MinElf.extract_DT_NEEDED(file);
        } finally {
            if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
                Api18TraceUtils.endSection();
            }
        }
    }

    private void loadDependencies(File file, int i, ThreadPolicy threadPolicy) throws IOException {
        String[] dependencies = getDependencies(file);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading lib dependencies: ");
        sb.append(Arrays.toString(dependencies));
        sb.toString();
        for (String str : dependencies) {
            if (!str.startsWith("/")) {
                SoLoader.loadLibraryBySoName(str, i | 1, threadPolicy);
            }
        }
    }

    public void addToLdLibraryPath(Collection<String> collection) {
        collection.add(this.soDirectory.getAbsolutePath());
    }

    public int loadLibrary(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
    }

    /* access modifiers changed from: protected */
    public int loadLibraryFrom(String str, int i, File file, ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found on ");
            sb.append(file.getCanonicalPath());
            sb.toString();
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" found on ");
        sb2.append(file.getCanonicalPath());
        sb2.toString();
        if ((i & 1) == 0 || (this.flags & 2) == 0) {
            if ((this.flags & 1) != 0) {
                loadDependencies(file2, i, threadPolicy);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not resolving dependencies for ");
                sb3.append(str);
                sb3.toString();
            }
            try {
                SoLoader.sSoFileLoader.load(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    return 3;
                }
                throw e;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" loaded implicitly");
            sb4.toString();
            return 2;
        }
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.soDirectory.getCanonicalPath());
        } catch (IOException unused) {
            str = this.soDirectory.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.flags);
        sb.append(']');
        return sb.toString();
    }

    @C5952h
    public File unpackLibrary(String str) throws IOException {
        File file = new File(this.soDirectory, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }
}

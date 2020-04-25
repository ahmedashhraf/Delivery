package com.google.common.base;

import org.jivesoftware.smack.util.SystemUtil;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2777c;

@C2777c("java.lang.System#getProperty")
@C2775a
/* renamed from: com.google.common.base.d0 */
/* compiled from: StandardSystemProperty */
public enum C7332d0 {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR(SystemUtil.PROPERTY_JAVA_VENDOR),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");
    
    private final String key;

    private C7332d0(String str) {
        this.key = str;
    }

    /* renamed from: d */
    public String mo29204d() {
        return this.key;
    }

    /* renamed from: e */
    public String mo29205e() {
        return System.getProperty(this.key);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo29204d());
        sb.append("=");
        sb.append(mo29205e());
        return sb.toString();
    }
}

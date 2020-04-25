package org.jivesoftware.smack.provider;

abstract class AbstractProviderInfo {
    private String element;

    /* renamed from: ns */
    private String f44985ns;
    private Object provider;

    AbstractProviderInfo(String str, String str2, Object obj) {
        this.element = str;
        this.f44985ns = str2;
        this.provider = obj;
    }

    public String getElementName() {
        return this.element;
    }

    public String getNamespace() {
        return this.f44985ns;
    }

    /* access modifiers changed from: 0000 */
    public Object getProvider() {
        return this.provider;
    }
}

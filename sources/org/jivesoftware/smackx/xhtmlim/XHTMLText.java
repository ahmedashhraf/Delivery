package org.jivesoftware.smackx.xhtmlim;

import org.jivesoftware.smack.util.XmlStringBuilder;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class XHTMLText {

    /* renamed from: A */
    public static final String f45018A = "a";
    public static final String BLOCKQUOTE = "blockquote";

    /* renamed from: BR */
    public static final String f45019BR = "br";
    public static final String CITE = "cite";
    public static final String CODE = "code";

    /* renamed from: EM */
    public static final String f45020EM = "em";

    /* renamed from: H */
    public static final String f45021H = "h";
    public static final String HREF = "href";
    public static final String IMG = "img";

    /* renamed from: LI */
    public static final String f45022LI = "li";
    public static final String NAMESPACE = "http://www.w3.org/1999/xhtml";

    /* renamed from: OL */
    public static final String f45023OL = "ol";

    /* renamed from: P */
    public static final String f45024P = "p";

    /* renamed from: Q */
    public static final String f45025Q = "q";
    public static final String SPAN = "span";
    public static final String STRONG = "strong";
    public static final String STYLE = "style";

    /* renamed from: UL */
    public static final String f45026UL = "ul";
    private final XmlStringBuilder text = new XmlStringBuilder();

    public XHTMLText(String str, String str2) {
        appendOpenBodyTag(str, str2);
    }

    private XHTMLText appendOpenBodyTag(String str, String str2) {
        this.text.halfOpenElement("body");
        this.text.xmlnsAttribute(NAMESPACE);
        this.text.optElement("style", str);
        this.text.xmllangAttribute(str2);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText append(String str) {
        this.text.escape(str);
        return this;
    }

    public XHTMLText appendBrTag() {
        this.text.emptyElement(f45019BR);
        return this;
    }

    public XHTMLText appendCloseAnchorTag() {
        this.text.closeElement("a");
        return this;
    }

    public XHTMLText appendCloseBlockQuoteTag() {
        this.text.closeElement(BLOCKQUOTE);
        return this;
    }

    public XHTMLText appendCloseBodyTag() {
        this.text.closeElement("body");
        return this;
    }

    public XHTMLText appendCloseCodeTag() {
        this.text.closeElement(CODE);
        return this;
    }

    public XHTMLText appendCloseEmTag() {
        this.text.closeElement("em");
        return this;
    }

    public XHTMLText appendCloseHeaderTag(int i) {
        if (i > 3 || i < 1) {
            throw new IllegalArgumentException("Level must be between 1 and 3");
        }
        XmlStringBuilder xmlStringBuilder = this.text;
        StringBuilder sb = new StringBuilder();
        sb.append(f45021H);
        sb.append(Integer.toBinaryString(i));
        xmlStringBuilder.closeElement(sb.toString());
        return this;
    }

    public XHTMLText appendCloseInlinedQuoteTag() {
        this.text.closeElement(f45025Q);
        return this;
    }

    public XHTMLText appendCloseLineItemTag() {
        this.text.closeElement(f45022LI);
        return this;
    }

    public XHTMLText appendCloseOrderedListTag() {
        this.text.closeElement(f45023OL);
        return this;
    }

    public XHTMLText appendCloseParagraphTag() {
        this.text.closeElement(f45024P);
        return this;
    }

    public XHTMLText appendCloseSpanTag() {
        this.text.closeElement(SPAN);
        return this;
    }

    public XHTMLText appendCloseStrongTag() {
        this.text.closeElement(STRONG);
        return this;
    }

    public XHTMLText appendCloseUnorderedListTag() {
        this.text.closeElement(f45026UL);
        return this;
    }

    public XHTMLText appendImageTag(String str, String str2, String str3, String str4, String str5) {
        this.text.halfOpenElement(IMG);
        this.text.optAttribute("align", str);
        this.text.optAttribute("alt", str2);
        this.text.optAttribute(C14330v.f42320e0, str3);
        this.text.optAttribute("src", str4);
        this.text.optAttribute(C14330v.f42318d0, str5);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendLineItemTag(String str) {
        this.text.halfOpenElement(f45022LI);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenAnchorTag(String str, String str2) {
        this.text.halfOpenElement("a");
        this.text.optAttribute("href", str);
        this.text.optAttribute("style", str2);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenBlockQuoteTag(String str) {
        this.text.halfOpenElement(BLOCKQUOTE);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenCiteTag() {
        this.text.openElement(CITE);
        return this;
    }

    public XHTMLText appendOpenCodeTag() {
        this.text.openElement(CODE);
        return this;
    }

    public XHTMLText appendOpenEmTag() {
        this.text.openElement("em");
        return this;
    }

    public XHTMLText appendOpenHeaderTag(int i, String str) {
        if (i > 3 || i < 1) {
            throw new IllegalArgumentException("Level must be between 1 and 3");
        }
        XmlStringBuilder xmlStringBuilder = this.text;
        StringBuilder sb = new StringBuilder();
        sb.append(f45021H);
        sb.append(Integer.toString(i));
        xmlStringBuilder.halfOpenElement(sb.toString());
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenInlinedQuoteTag(String str) {
        this.text.halfOpenElement(f45025Q);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenOrderedListTag(String str) {
        this.text.halfOpenElement(f45023OL);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenParagraphTag(String str) {
        this.text.halfOpenElement(f45024P);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenSpanTag(String str) {
        this.text.halfOpenElement(SPAN);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public XHTMLText appendOpenStrongTag() {
        this.text.openElement(STRONG);
        return this;
    }

    public XHTMLText appendOpenUnorderedListTag(String str) {
        this.text.halfOpenElement(f45026UL);
        this.text.optAttribute("style", str);
        this.text.rightAngleBracket();
        return this;
    }

    public String toString() {
        return this.text.toString();
    }

    public XmlStringBuilder toXML() {
        return this.text;
    }
}

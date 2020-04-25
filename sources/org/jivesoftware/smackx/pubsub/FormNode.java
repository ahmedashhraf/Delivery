package org.jivesoftware.smackx.pubsub;

import kotlin.p217i1.C14662d0;
import org.jivesoftware.smackx.xdata.Form;

public class FormNode extends NodeExtension {
    private Form configForm;

    public FormNode(FormNodeType formNodeType, Form form) {
        super(formNodeType.getNodeElement());
        if (form != null) {
            this.configForm = form;
            return;
        }
        throw new IllegalArgumentException("Submit form cannot be null");
    }

    public Form getForm() {
        return this.configForm;
    }

    public CharSequence toXML() {
        if (this.configForm == null) {
            return super.toXML();
        }
        StringBuilder sb = new StringBuilder("<");
        sb.append(getElementName());
        if (getNode() != null) {
            sb.append(" node='");
            sb.append(getNode());
            sb.append("'>");
        } else {
            sb.append(C14662d0.f42854e);
        }
        sb.append(this.configForm.getDataFormToSend().toXML());
        sb.append("</");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getElementName());
        sb2.append(C14662d0.f42854e);
        sb.append(sb2.toString());
        return sb.toString();
    }

    public FormNode(FormNodeType formNodeType, String str, Form form) {
        super(formNodeType.getNodeElement(), str);
        if (form != null) {
            this.configForm = form;
            return;
        }
        throw new IllegalArgumentException("Submit form cannot be null");
    }
}

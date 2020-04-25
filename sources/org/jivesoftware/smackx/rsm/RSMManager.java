package org.jivesoftware.smackx.rsm;

import java.util.Collection;
import java.util.LinkedList;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.PacketUtil;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.rsm.packet.RSMSet.PageDirection;

public class RSMManager {
    /* access modifiers changed from: 0000 */
    public Collection<ExtensionElement> continuePage(int i, Collection<ExtensionElement> collection) {
        return continuePage(i, collection, null);
    }

    /* access modifiers changed from: 0000 */
    public Collection<ExtensionElement> page(int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new RSMSet(i));
        return linkedList;
    }

    /* access modifiers changed from: 0000 */
    public Collection<ExtensionElement> continuePage(int i, Collection<ExtensionElement> collection, Collection<ExtensionElement> collection2) {
        if (collection != null) {
            if (collection2 == null) {
                collection2 = new LinkedList<>();
            }
            RSMSet rSMSet = (RSMSet) PacketUtil.extensionElementFrom(collection, RSMSet.ELEMENT, RSMSet.NAMESPACE);
            if (rSMSet != null) {
                collection2.add(new RSMSet(i, rSMSet.getLast(), PageDirection.after));
                return collection2;
            }
            throw new IllegalArgumentException("returnedExtensions did not contain a RSMset");
        }
        throw new IllegalArgumentException("returnedExtensions must no be null");
    }
}

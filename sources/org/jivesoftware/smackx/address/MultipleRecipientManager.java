package org.jivesoftware.smackx.address;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.FeatureNotSupportedException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.address.packet.MultipleAddresses;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Type;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import p205i.p486d.p487a.C14055b;

public class MultipleRecipientManager {

    private static class PacketCopy extends Stanza {
        private CharSequence text;

        public PacketCopy(CharSequence charSequence) {
            this.text = charSequence;
        }

        public CharSequence toXML() {
            return this.text;
        }
    }

    private static String getMultipleRecipienServiceAddress(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        List findServices = ServiceDiscoveryManager.getInstanceFor(xMPPConnection).findServices(MultipleAddresses.NAMESPACE, true, true);
        if (findServices.size() > 0) {
            return (String) findServices.get(0);
        }
        return null;
    }

    public static MultipleRecipientInfo getMultipleRecipientInfo(Stanza stanza) {
        MultipleAddresses multipleAddresses = (MultipleAddresses) stanza.getExtension(MultipleAddresses.ELEMENT, MultipleAddresses.NAMESPACE);
        if (multipleAddresses == null) {
            return null;
        }
        return new MultipleRecipientInfo(multipleAddresses);
    }

    public static void reply(XMPPConnection xMPPConnection, Message message, Message message2) throws SmackException, XMPPErrorException {
        MultipleRecipientInfo multipleRecipientInfo = getMultipleRecipientInfo(message);
        if (multipleRecipientInfo == null) {
            throw new SmackException("Original message does not contain multiple recipient info");
        } else if (multipleRecipientInfo.shouldNotReply()) {
            throw new SmackException("Original message should not be replied");
        } else if (multipleRecipientInfo.getReplyRoom() == null) {
            if (message.getThread() != null) {
                message2.setThread(message.getThread());
            }
            Address replyAddress = multipleRecipientInfo.getReplyAddress();
            if (replyAddress == null || replyAddress.getJid() == null) {
                ArrayList arrayList = new ArrayList(multipleRecipientInfo.getTOAddresses().size());
                ArrayList arrayList2 = new ArrayList(multipleRecipientInfo.getCCAddresses().size());
                for (Address jid : multipleRecipientInfo.getTOAddresses()) {
                    arrayList.add(jid.getJid());
                }
                for (Address jid2 : multipleRecipientInfo.getCCAddresses()) {
                    arrayList2.add(jid2.getJid());
                }
                if (!arrayList.contains(message.getFrom()) && !arrayList2.contains(message.getFrom())) {
                    arrayList.add(message.getFrom());
                }
                String user = xMPPConnection.getUser();
                if (!arrayList.remove(user) && !arrayList2.remove(user)) {
                    String e = C14055b.m60645e(user);
                    arrayList.remove(e);
                    arrayList2.remove(e);
                }
                send(xMPPConnection, message2, arrayList, arrayList2, null, null, null, false);
                return;
            }
            message2.setTo(replyAddress.getJid());
            xMPPConnection.sendStanza(message2);
        } else {
            throw new SmackException("Reply should be sent through a room");
        }
    }

    public static void send(XMPPConnection xMPPConnection, Stanza stanza, Collection<String> collection, Collection<String> collection2, Collection<String> collection3) throws NoResponseException, XMPPErrorException, FeatureNotSupportedException, NotConnectedException {
        send(xMPPConnection, stanza, collection, collection2, collection3, null, null, false);
    }

    private static void sendThroughService(XMPPConnection xMPPConnection, Stanza stanza, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, String str, String str2, boolean z, String str3) throws NotConnectedException {
        Stanza stanza2 = stanza;
        MultipleAddresses multipleAddresses = new MultipleAddresses();
        if (collection != null) {
            for (String addAddress : collection) {
                MultipleAddresses multipleAddresses2 = multipleAddresses;
                multipleAddresses2.addAddress(Type.to, addAddress, null, null, false, null);
            }
        }
        if (collection2 != null) {
            for (String addAddress2 : collection2) {
                MultipleAddresses multipleAddresses3 = multipleAddresses;
                multipleAddresses3.addAddress(Type.to, addAddress2, null, null, false, null);
            }
        }
        if (collection3 != null) {
            for (String addAddress3 : collection3) {
                MultipleAddresses multipleAddresses4 = multipleAddresses;
                multipleAddresses4.addAddress(Type.bcc, addAddress3, null, null, false, null);
            }
        }
        if (z) {
            multipleAddresses.setNoReply();
        } else {
            if (str != null && str.trim().length() > 0) {
                multipleAddresses.addAddress(Type.replyto, str, null, null, false, null);
            }
            if (str2 != null && str2.trim().length() > 0) {
                multipleAddresses.addAddress(Type.replyroom, str2, null, null, false, null);
            }
        }
        stanza.setTo(str3);
        stanza.addExtension(multipleAddresses);
        xMPPConnection.sendStanza(stanza);
    }

    private static void sendToIndividualRecipients(XMPPConnection xMPPConnection, Stanza stanza, Collection<String> collection, Collection<String> collection2, Collection<String> collection3) throws NotConnectedException {
        if (collection != null) {
            for (String to : collection) {
                stanza.setTo(to);
                xMPPConnection.sendStanza(new PacketCopy(stanza.toXML()));
            }
        }
        if (collection2 != null) {
            for (String to2 : collection2) {
                stanza.setTo(to2);
                xMPPConnection.sendStanza(new PacketCopy(stanza.toXML()));
            }
        }
        if (collection3 != null) {
            for (String to3 : collection3) {
                stanza.setTo(to3);
                xMPPConnection.sendStanza(new PacketCopy(stanza.toXML()));
            }
        }
    }

    public static void send(XMPPConnection xMPPConnection, Stanza stanza, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, String str, String str2, boolean z) throws NoResponseException, XMPPErrorException, FeatureNotSupportedException, NotConnectedException {
        if (collection == null || collection.size() != 1 || ((collection2 != null && !collection2.isEmpty()) || ((collection3 != null && !collection3.isEmpty()) || z || !StringUtils.isNullOrEmpty(str) || !StringUtils.isNullOrEmpty(str2)))) {
            Stanza stanza2 = stanza;
            String multipleRecipienServiceAddress = getMultipleRecipienServiceAddress(xMPPConnection);
            if (multipleRecipienServiceAddress != null) {
                sendThroughService(xMPPConnection, stanza, collection, collection2, collection3, str, str2, z, multipleRecipienServiceAddress);
            } else if (z || ((str != null && str.trim().length() > 0) || (str2 != null && str2.trim().length() > 0))) {
                throw new FeatureNotSupportedException("Extended Stanza Addressing");
            } else {
                sendToIndividualRecipients(xMPPConnection, stanza, collection, collection2, collection3);
            }
            return;
        }
        Stanza stanza3 = stanza;
        stanza.setTo((String) collection.iterator().next());
        xMPPConnection.sendStanza(stanza);
    }
}

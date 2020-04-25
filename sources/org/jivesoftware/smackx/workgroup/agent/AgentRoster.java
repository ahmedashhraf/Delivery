package org.jivesoftware.smackx.workgroup.agent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.workgroup.packet.AgentStatus;
import org.jivesoftware.smackx.workgroup.packet.AgentStatusRequest;
import org.jivesoftware.smackx.workgroup.packet.AgentStatusRequest.Item;
import p205i.p486d.p487a.C14055b;

public class AgentRoster {
    private static final int EVENT_AGENT_ADDED = 0;
    private static final int EVENT_AGENT_REMOVED = 1;
    private static final int EVENT_PRESENCE_CHANGED = 2;
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(AgentRoster.class.getName());
    private XMPPConnection connection;
    /* access modifiers changed from: private */
    public List<String> entries;
    private List<AgentRosterListener> listeners;
    /* access modifiers changed from: private */
    public Map<String, Map<String, Presence>> presenceMap;
    boolean rosterInitialized = false;
    /* access modifiers changed from: private */
    public String workgroupJID;

    private class AgentStatusListener implements StanzaListener {
        private AgentStatusListener() {
        }

        public void processPacket(Stanza stanza) {
            if (stanza instanceof AgentStatusRequest) {
                for (Item item : ((AgentStatusRequest) stanza).getAgents()) {
                    String jid = item.getJID();
                    if (DiscoverItems.Item.REMOVE_ACTION.equals(item.getType())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C14055b.m60647g(jid));
                        sb.append("@");
                        sb.append(C14055b.m60646f(jid));
                        AgentRoster.this.presenceMap.remove(C14055b.m60647g(sb.toString()));
                        AgentRoster.this.fireEvent(1, jid);
                    } else {
                        AgentRoster.this.entries.add(jid);
                        AgentRoster.this.fireEvent(0, jid);
                    }
                }
                AgentRoster.this.rosterInitialized = true;
            }
        }
    }

    private class PresencePacketListener implements StanzaListener {
        private PresencePacketListener() {
        }

        public void processPacket(Stanza stanza) {
            Map map;
            Presence presence = (Presence) stanza;
            String from = presence.getFrom();
            if (from == null) {
                Logger access$200 = AgentRoster.LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Presence with no FROM: ");
                sb.append(presence.toXML());
                access$200.warning(sb.toString());
                return;
            }
            String access$300 = AgentRoster.this.getPresenceMapKey(from);
            if (presence.getType() == Type.available) {
                AgentStatus agentStatus = (AgentStatus) presence.getExtension(AgentStatus.ELEMENT_NAME, "http://jabber.org/protocol/workgroup");
                if (agentStatus != null && AgentRoster.this.workgroupJID.equals(agentStatus.getWorkgroupJID())) {
                    if (AgentRoster.this.presenceMap.get(access$300) == null) {
                        map = new HashMap();
                        AgentRoster.this.presenceMap.put(access$300, map);
                    } else {
                        map = (Map) AgentRoster.this.presenceMap.get(access$300);
                    }
                    synchronized (map) {
                        map.put(C14055b.m60648h(from), presence);
                    }
                    synchronized (AgentRoster.this.entries) {
                        for (String lowerCase : AgentRoster.this.entries) {
                            if (lowerCase.toLowerCase(Locale.US).equals(C14055b.m60645e(access$300).toLowerCase())) {
                                AgentRoster.this.fireEvent(2, stanza);
                            }
                        }
                    }
                }
            } else if (presence.getType() == Type.unavailable) {
                if (AgentRoster.this.presenceMap.get(access$300) != null) {
                    Map map2 = (Map) AgentRoster.this.presenceMap.get(access$300);
                    synchronized (map2) {
                        map2.remove(C14055b.m60648h(from));
                    }
                    if (map2.isEmpty()) {
                        AgentRoster.this.presenceMap.remove(access$300);
                    }
                }
                synchronized (AgentRoster.this.entries) {
                    for (String lowerCase2 : AgentRoster.this.entries) {
                        if (lowerCase2.toLowerCase(Locale.US).equals(C14055b.m60645e(access$300).toLowerCase())) {
                            AgentRoster.this.fireEvent(2, stanza);
                        }
                    }
                }
            }
        }
    }

    AgentRoster(XMPPConnection xMPPConnection, String str) throws NotConnectedException {
        this.connection = xMPPConnection;
        this.workgroupJID = str;
        this.entries = new ArrayList();
        this.listeners = new ArrayList();
        this.presenceMap = new HashMap();
        xMPPConnection.addAsyncStanzaListener(new AgentStatusListener(), new StanzaTypeFilter(AgentStatusRequest.class));
        xMPPConnection.addAsyncStanzaListener(new PresencePacketListener(), new StanzaTypeFilter(Presence.class));
        AgentStatusRequest agentStatusRequest = new AgentStatusRequest();
        agentStatusRequest.setTo(str);
        xMPPConnection.sendStanza(agentStatusRequest);
    }

    /* access modifiers changed from: private */
    public void fireEvent(int i, Object obj) {
        AgentRosterListener[] agentRosterListenerArr;
        synchronized (this.listeners) {
            agentRosterListenerArr = new AgentRosterListener[this.listeners.size()];
            this.listeners.toArray(agentRosterListenerArr);
        }
        for (int i2 = 0; i2 < agentRosterListenerArr.length; i2++) {
            if (i == 0) {
                agentRosterListenerArr[i2].agentAdded((String) obj);
            } else if (i == 1) {
                agentRosterListenerArr[i2].agentRemoved((String) obj);
            } else if (i == 2) {
                agentRosterListenerArr[i2].presenceChanged((Presence) obj);
            }
        }
    }

    /* access modifiers changed from: private */
    public String getPresenceMapKey(String str) {
        return !contains(str) ? C14055b.m60645e(str).toLowerCase(Locale.US) : str;
    }

    public void addListener(AgentRosterListener agentRosterListener) {
        synchronized (this.listeners) {
            if (!this.listeners.contains(agentRosterListener)) {
                this.listeners.add(agentRosterListener);
                for (String str : getAgents()) {
                    if (this.entries.contains(str)) {
                        agentRosterListener.agentAdded(str);
                        Map map = (Map) this.presenceMap.get(str);
                        if (map != null) {
                            for (Presence presenceChanged : map.values()) {
                                agentRosterListener.presenceChanged(presenceChanged);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean contains(String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.entries) {
            for (String lowerCase : this.entries) {
                if (lowerCase.toLowerCase(Locale.US).equals(str.toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
    }

    public int getAgentCount() {
        return this.entries.size();
    }

    public Set<String> getAgents() {
        HashSet hashSet = new HashSet();
        synchronized (this.entries) {
            for (Object add : this.entries) {
                hashSet.add(add);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Presence getPresence(String str) {
        Map map = (Map) this.presenceMap.get(getPresenceMapKey(str));
        if (map == null) {
            Presence presence = new Presence(Type.unavailable);
            presence.setFrom(str);
            return presence;
        }
        Presence presence2 = null;
        for (Object obj : map.keySet()) {
            Presence presence3 = (Presence) map.get(obj);
            if (presence2 == null || presence3.getPriority() > presence2.getPriority()) {
                presence2 = presence3;
            }
        }
        if (presence2 != null) {
            return presence2;
        }
        Presence presence4 = new Presence(Type.unavailable);
        presence4.setFrom(str);
        return presence4;
    }

    public void reload() throws NotConnectedException {
        AgentStatusRequest agentStatusRequest = new AgentStatusRequest();
        agentStatusRequest.setTo(this.workgroupJID);
        this.connection.sendStanza(agentStatusRequest);
    }

    public void removeListener(AgentRosterListener agentRosterListener) {
        synchronized (this.listeners) {
            this.listeners.remove(agentRosterListener);
        }
    }
}

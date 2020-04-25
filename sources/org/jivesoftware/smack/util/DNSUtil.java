package org.jivesoftware.smack.util;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.util.dns.DNSResolver;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.jivesoftware.smack.util.dns.SRVRecord;

public class DNSUtil {
    private static final Logger LOGGER = Logger.getLogger(DNSUtil.class.getName());
    private static DNSResolver dnsResolver = null;
    private static StringTransformer idnaTransformer = new StringTransformer() {
        public String transform(String str) {
            return str;
        }
    };

    /* renamed from: org.jivesoftware.smack.util.DNSUtil$2 */
    static /* synthetic */ class C156392 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$util$DNSUtil$DomainType = new int[DomainType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.util.DNSUtil$DomainType[] r0 = org.jivesoftware.smack.util.DNSUtil.DomainType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$util$DNSUtil$DomainType = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$util$DNSUtil$DomainType     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.util.DNSUtil$DomainType r1 = org.jivesoftware.smack.util.DNSUtil.DomainType.Server     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$util$DNSUtil$DomainType     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.util.DNSUtil$DomainType r1 = org.jivesoftware.smack.util.DNSUtil.DomainType.Client     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.DNSUtil.C156392.<clinit>():void");
        }
    }

    private enum DomainType {
        Server,
        Client
    }

    private static int bisect(int[] iArr, double d) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length && d >= ((double) iArr[i])) {
            i2++;
            i++;
        }
        return i2;
    }

    public static DNSResolver getDNSResolver() {
        return dnsResolver;
    }

    private static List<HostAddress> resolveDomain(String str, DomainType domainType, List<HostAddress> list) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = C156392.$SwitchMap$org$jivesoftware$smack$util$DNSUtil$DomainType[domainType.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("_xmpp-server._tcp.");
            sb.append(str);
            str2 = sb.toString();
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("_xmpp-client._tcp.");
            sb2.append(str);
            str2 = sb2.toString();
        } else {
            throw new AssertionError();
        }
        try {
            List<SRVRecord> lookupSRVRecords = dnsResolver.lookupSRVRecords(str2);
            if (LOGGER.isLoggable(Level.FINE)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Resolved SRV RR for ");
                sb3.append(str2);
                sb3.append(":");
                String sb4 = sb3.toString();
                for (SRVRecord sRVRecord : lookupSRVRecords) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(C3868i.f12248b);
                    sb5.append(sRVRecord);
                    sb4 = sb5.toString();
                }
                LOGGER.fine(sb4);
            }
            arrayList.addAll(sortSRVRecords(lookupSRVRecords));
        } catch (Exception e) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Exception while resovling SRV records for ");
            sb6.append(str);
            sb6.append(". Consider adding '_xmpp-(server|client)._tcp' DNS SRV Records");
            logger.log(level, sb6.toString(), e);
            if (list != null) {
                HostAddress hostAddress = new HostAddress(str2);
                hostAddress.setException(e);
                list.add(hostAddress);
            }
        }
        arrayList.add(new HostAddress(str));
        return arrayList;
    }

    public static List<HostAddress> resolveXMPPDomain(String str, List<HostAddress> list) {
        String transform = idnaTransformer.transform(str);
        if (dnsResolver != null) {
            return resolveDomain(transform, DomainType.Client, list);
        }
        LOGGER.warning("No DNS Resolver active in Smack, will be unable to perform DNS SRV lookups");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new HostAddress(transform, 5222));
        return arrayList;
    }

    public static List<HostAddress> resolveXMPPServerDomain(String str, List<HostAddress> list) {
        String transform = idnaTransformer.transform(str);
        if (dnsResolver != null) {
            return resolveDomain(transform, DomainType.Server, list);
        }
        LOGGER.warning("No DNS Resolver active in Smack, will be unable to perform DNS SRV lookups");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new HostAddress(transform, 5269));
        return arrayList;
    }

    public static void setDNSResolver(DNSResolver dNSResolver) {
        dnsResolver = dNSResolver;
    }

    public static void setIdnaTransformer(StringTransformer stringTransformer) {
        if (stringTransformer != null) {
            idnaTransformer = stringTransformer;
            return;
        }
        throw new NullPointerException();
    }

    private static List<HostAddress> sortSRVRecords(List<SRVRecord> list) {
        int i;
        if (list.size() == 1 && ((SRVRecord) list.get(0)).getFQDN().equals(".")) {
            return Collections.emptyList();
        }
        Collections.sort(list);
        TreeMap treeMap = new TreeMap();
        for (SRVRecord sRVRecord : list) {
            Integer valueOf = Integer.valueOf(sRVRecord.getPriority());
            List list2 = (List) treeMap.get(valueOf);
            if (list2 == null) {
                list2 = new LinkedList();
                treeMap.put(valueOf, list2);
            }
            list2.add(sRVRecord);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Integer num : treeMap.keySet()) {
            List<SRVRecord> list3 = (List) treeMap.get(num);
            while (true) {
                int size = list3.size();
                if (size > 0) {
                    int[] iArr = new int[list3.size()];
                    int i2 = 1;
                    for (SRVRecord weight : list3) {
                        if (weight.getWeight() > 0) {
                            i2 = 0;
                        }
                    }
                    int i3 = 0;
                    int i4 = 0;
                    for (SRVRecord weight2 : list3) {
                        i3 += weight2.getWeight() + i2;
                        iArr[i4] = i3;
                        i4++;
                    }
                    if (i3 == 0) {
                        double random = Math.random();
                        double d = (double) size;
                        Double.isNaN(d);
                        i = (int) (random * d);
                    } else {
                        double random2 = Math.random();
                        double d2 = (double) i3;
                        Double.isNaN(d2);
                        i = bisect(iArr, random2 * d2);
                    }
                    arrayList.add((SRVRecord) list3.remove(i));
                }
            }
        }
        return arrayList;
    }
}

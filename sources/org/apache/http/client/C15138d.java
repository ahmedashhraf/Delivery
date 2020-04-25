package org.apache.http.client;

import java.io.IOException;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.client.p530k.C15155k;
import org.apache.http.conn.C15179c;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.client.d */
/* compiled from: HttpClient */
public interface C15138d {
    <T> T execute(C15155k kVar, C15142h<? extends T> hVar) throws IOException, ClientProtocolException;

    <T> T execute(C15155k kVar, C15142h<? extends T> hVar, C15431f fVar) throws IOException, ClientProtocolException;

    <T> T execute(C15460l lVar, C15463o oVar, C15142h<? extends T> hVar) throws IOException, ClientProtocolException;

    <T> T execute(C15460l lVar, C15463o oVar, C15142h<? extends T> hVar, C15431f fVar) throws IOException, ClientProtocolException;

    C15466r execute(C15155k kVar) throws IOException, ClientProtocolException;

    C15466r execute(C15155k kVar, C15431f fVar) throws IOException, ClientProtocolException;

    C15466r execute(C15460l lVar, C15463o oVar) throws IOException, ClientProtocolException;

    C15466r execute(C15460l lVar, C15463o oVar, C15431f fVar) throws IOException, ClientProtocolException;

    C15179c getConnectionManager();

    C15357i getParams();
}

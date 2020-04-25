package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p161v.C3852a;
import com.fasterxml.jackson.core.p161v.C3853b;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.fasterxml.jackson.core.k */
/* compiled from: ObjectCodec */
public abstract class C3800k {
    protected C3800k() {
    }

    /* renamed from: a */
    public abstract C3794h mo16748a(C3803n nVar);

    /* renamed from: a */
    public abstract C3803n mo16749a();

    /* renamed from: a */
    public abstract <T extends C3803n> T mo16750a(C3794h hVar) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract <T> T mo16751a(C3794h hVar, C3852a aVar) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract <T> T mo16752a(C3794h hVar, C3853b<?> bVar) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract <T> T mo16753a(C3794h hVar, Class<T> cls) throws IOException, JsonProcessingException;

    /* renamed from: a */
    public abstract <T> T mo16754a(C3803n nVar, Class<T> cls) throws JsonProcessingException;

    /* renamed from: a */
    public abstract void mo16755a(C3791f fVar, Object obj) throws IOException, JsonProcessingException;

    /* renamed from: b */
    public abstract C3803n mo16756b();

    /* renamed from: b */
    public abstract <T> Iterator<T> mo16757b(C3794h hVar, C3852a aVar) throws IOException, JsonProcessingException;

    /* renamed from: b */
    public abstract <T> Iterator<T> mo16758b(C3794h hVar, C3853b<?> bVar) throws IOException, JsonProcessingException;

    /* renamed from: b */
    public abstract <T> Iterator<T> mo16759b(C3794h hVar, Class<T> cls) throws IOException, JsonProcessingException;

    /* renamed from: c */
    public C3789e mo16760c() {
        return mo16761d();
    }

    @Deprecated
    /* renamed from: d */
    public abstract C3789e mo16761d();
}

package com.hussein.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class ProxySource extends Proxy implements User {

    private static Method m0;
    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m5;
    private static Method m4;

    public ProxySource(InvocationHandler var1) {
        super(var1);
    }

    @Override
    public final int hashCode() throws UndeclaredThrowableException {
        try {
            return (Integer) super.h.invoke(this, m0, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final boolean equals(Object var1) throws UndeclaredThrowableException {
        try {
            return (Boolean) super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final String toString() throws UndeclaredThrowableException {
        try {
            return (String) super.h.invoke(this, m2, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final void add(String var1, int var2) throws UndeclaredThrowableException {
        try {
            super.h.invoke(this, m3, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

    @Override
    public final void update(String var1, int var2) throws UndeclaredThrowableException {
        try {
            super.h.invoke(this, m4, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

    @Override
    public final boolean delete(String var1) throws UndeclaredThrowableException {
        try {
            return (Boolean) super.h.invoke(this, m5, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    static {
        try {
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m3 = Class.forName("com.hussein.proxy.dynamic.jdk.User").getMethod("add", Class.forName("java.lang.String"), Integer.TYPE);
            m4 = Class.forName("com.hussein.proxy.dynamic.jdk.User").getMethod("update", Class.forName("java.lang.String"), Integer.TYPE);
            m5 = Class.forName("com.hussein.proxy.dynamic.jdk.User").getMethod("delete", Class.forName("java.lang.String"));
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}

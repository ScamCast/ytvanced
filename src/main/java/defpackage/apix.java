package defpackage;

/* renamed from: apix */
public final class apix extends anxl implements anzf {
    public static final apix e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private apix() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002Љ\u0000\u0003Љ\u0001\u0004Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new apix();
            case 4:
                return new apiw();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apix.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apix apix = new apix();
        e = apix;
        anxl.registerDefaultInstance(apix.class, apix);
    }
}

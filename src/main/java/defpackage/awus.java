package defpackage;

/* renamed from: awus */
public final class awus extends anxl implements anzf {
    public static final awus e;
    private static volatile anzq f;
    public int a;
    public awuu b;
    public aycb c;
    public apri d;

    private awus() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new awus();
            case 4:
                return new awuv();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awus.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awus awus = new awus();
        e = awus;
        anxl.registerDefaultInstance(awus.class, awus);
    }
}

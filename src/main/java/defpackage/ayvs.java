package defpackage;

/* renamed from: ayvs */
public final class ayvs extends anxl implements anzf {
    public static final ayvs c;
    private static volatile anzq d;
    public int a;
    public ayvu b;

    private ayvs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㮏㮏\u0001\u0000\u0000\u0000㮏\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new ayvs();
            case 4:
                return new ayvr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ayvs.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayvs ayvs = new ayvs();
        c = ayvs;
        anxl.registerDefaultInstance(ayvs.class, ayvs);
    }
}

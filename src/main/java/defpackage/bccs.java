package defpackage;

/* renamed from: bccs */
public final class bccs extends anxl implements anzf {
    public static final bccs d;
    private static volatile anzq e;
    public int a;
    public int b = 4;
    public int c;

    private bccs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{"a", "b", bcct.a, "c"});
            case 3:
                return new bccs();
            case 4:
                return new bccr();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (bccs.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bccs bccs = new bccs();
        d = bccs;
        anxl.registerDefaultInstance(bccs.class, bccs);
    }
}

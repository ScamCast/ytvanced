package defpackage;

/* renamed from: auhn */
public final class auhn extends anxl implements anzf {
    public static final auhn f;
    private static volatile anzq g;
    public int a;
    public auhj b;
    public int c;
    public int d;
    public int e;

    private auhn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0004\u0003", new Object[]{"a", "b", "c", auia.a, "d", auhx.a, "e"});
            case 3:
                return new auhn();
            case 4:
                return new auhm();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (auhn.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        auhn auhn = new auhn();
        f = auhn;
        anxl.registerDefaultInstance(auhn.class, auhn);
    }
}

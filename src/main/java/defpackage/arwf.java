package defpackage;

/* renamed from: arwf */
public final class arwf extends anxl implements anzf {
    public static final arwf c;
    private static volatile anzq d;
    public int a;
    public int b;

    private arwf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", arwh.a()});
            case 3:
                return new arwf();
            case 4:
                return new arwe();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (arwf.class) {
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
        arwf arwf = new arwf();
        c = arwf;
        anxl.registerDefaultInstance(arwf.class, arwf);
    }
}

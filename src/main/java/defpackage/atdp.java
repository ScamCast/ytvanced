package defpackage;

/* renamed from: atdp */
public final class atdp extends anxl implements anzf {
    public static final atdp c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private atdp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䡎䡎\u0001\u0000\u0000\u0000䡎<\u0000", new Object[]{"b", "a", avzk.class});
            case 3:
                return new atdp();
            case 4:
                return new atds();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atdp.class) {
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
        atdp atdp = new atdp();
        c = atdp;
        anxl.registerDefaultInstance(atdp.class, atdp);
    }
}

package defpackage;

/* renamed from: asbq */
public final class asbq extends anxl implements anzf {
    public static final asbq c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private asbq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000⡇⡇\u0001\u0000\u0000\u0001⡇м\u0000", new Object[]{"b", "a", aybe.class});
            case 3:
                return new asbq();
            case 4:
                return new asbt();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (asbq.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        asbq asbq = new asbq();
        c = asbq;
        anxl.registerDefaultInstance(asbq.class, asbq);
    }
}

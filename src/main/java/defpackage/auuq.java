package defpackage;

/* renamed from: auuq */
public final class auuq extends anxl implements anzf {
    public static final auuq c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private auuq() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000ἑἑ\u0001\u0000\u0000\u0001ἑм\u0000", new Object[]{"b", "a", aphg.class});
            case 3:
                return new auuq();
            case 4:
                return new auup();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auuq.class) {
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
        auuq auuq = new auuq();
        c = auuq;
        anxl.registerDefaultInstance(auuq.class, auuq);
    }
}

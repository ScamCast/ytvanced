package defpackage;

/* renamed from: axlq */
public final class axlq extends anxl implements anzf {
    public static final axlq c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private axlq() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000⤒⤒\u0001\u0000\u0000\u0001⤒м\u0000", new Object[]{"b", "a", atuf.class});
            case 3:
                return new axlq();
            case 4:
                return new axls();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axlq.class) {
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
        axlq axlq = new axlq();
        c = axlq;
        anxl.registerDefaultInstance(axlq.class, axlq);
    }
}

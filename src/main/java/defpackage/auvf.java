package defpackage;

/* renamed from: auvf */
public final class auvf extends anxl implements anzf {
    public static final auvf g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arwf c;
    public apxu d;
    public anvu e = anvu.a;
    public int f;
    private byte h = (byte) 2;

    private auvf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001Љ\u0000\u0002\t\u0001\u0003Љ\u0002\u0005\n\u0004\u0007\f\u0006", new Object[]{"a", "b", "c", "d", "e", "f", auwc.a});
            case 3:
                return new auvf();
            case 4:
                return new auvi();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (auvf.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auvf auvf = new auvf();
        g = auvf;
        anxl.registerDefaultInstance(auvf.class, auvf);
    }
}

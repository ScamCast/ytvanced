package defpackage;

/* renamed from: awnz */
public final class awnz extends anxl implements anzf {
    public static final awnz g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public axak d;
    public apxu e;
    public apxu f;
    private byte h = (byte) 2;

    private awnz() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awnz();
            case 4:
                return new awoc();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awnz.class) {
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
        awnz awnz = new awnz();
        g = awnz;
        anxl.registerDefaultInstance(awnz.class, awnz);
    }
}

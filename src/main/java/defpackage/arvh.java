package defpackage;

/* renamed from: arvh */
public final class arvh extends anxl implements anzf {
    public static final arvh g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public apxu c;
    public axbm d;
    public arvj e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private arvh() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005\n\u0005\u0006\t\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            case 3:
                return new arvh();
            case 4:
                return new arvk();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arvh.class) {
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
        arvh arvh = new arvh();
        g = arvh;
        anxl.registerDefaultInstance(arvh.class, arvh);
    }
}

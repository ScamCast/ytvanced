package defpackage;

/* renamed from: axez */
public final class axez extends anxl implements anzf {
    public static final axez g;
    private static volatile anzq i;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public axfb c;
    public axex d;
    public axet e;
    public axev f;
    private byte h = (byte) 2;

    private axez() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0005\u0001Л\u0005Љ\u0000\u0006Љ\u0001\u0007Љ\u0004\bЉ\u0002", new Object[]{"a", "b", axff.class, "c", "d", "f", "e"});
            case 3:
                return new axez();
            case 4:
                return new axey();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axez.class) {
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
        axez axez = new axez();
        g = axez;
        anxl.registerDefaultInstance(axez.class, axez);
    }
}
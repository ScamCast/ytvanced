package defpackage;

/* renamed from: ayih */
public final class ayih extends anxl implements anzf {
    public static final ayih h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public axak d;
    public aphj e;
    public apxu f;
    public aphj g;
    private byte i = (byte) 2;

    private ayih() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\bЉ\u0005\tЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new ayih();
            case 4:
                return new ayig();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (ayih.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayih ayih = new ayih();
        h = ayih;
        anxl.registerDefaultInstance(ayih.class, ayih);
    }
}

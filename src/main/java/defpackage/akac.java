package defpackage;

/* renamed from: akac */
public final class akac extends aoca {
    public akab a;

    public akac() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akac)) {
            return false;
        }
        akac akac = (akac) obj;
        akab akab = this.a;
        if (akab == null) {
            if (akac.a != null) {
                return false;
            }
        } else if (!akab.equals(akac.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akac.unknownFieldData);
        }
        aocb aocb2 = akac.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akab akab = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (akab != null ? akab.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(49399797, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(49399797, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 395198378) {
                if (this.a == null) {
                    this.a = new akab();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}

package defpackage;

/* renamed from: aodi */
public enum aodi implements anxv {
    EVENT_UNKNOWN(0),
    EVENT_TRANSITION(1),
    EVENT_NETWORK_ERROR(2),
    EVENT_HTTP_CLIENT_ERROR(3),
    EVENT_HTTP_SERVER_ERROR(4),
    EVENT_MALFORMED_RESPONSE(5),
    EVENT_FORM_VALIDATION_ERROR(6),
    EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT(20),
    EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT(21),
    EVENT_ACCOUNT_SELECTION_CANCEL(22),
    EVENT_PROVIDER_CONSENT_LINK(30),
    EVENT_PROVIDER_CONSENT_CANCEL(31),
    EVENT_PROVIDER_CONSENT_LEARN_MORE(32),
    EVENT_ACCOUNT_CREATION_CREATE_ACCOUNT(40),
    EVENT_ACCOUNT_CREATION_CANCEL(41),
    EVENT_ACCOUNT_CREATION_CHANGE_PHONE(42),
    EVENT_ACCOUNT_CREATION_ADD_PHONE(43),
    EVENT_ACCOUNT_CREATION_LEARN_MORE(44),
    EVENT_APP_AUTH_DISMISS(50),
    EVENT_ADD_PHONE_ADD(60),
    EVENT_ADD_PHONE_CANCEL(61),
    EVENT_VERIFY_PHONE_VERIFY(70),
    EVENT_VERIFY_PHONE_CANCEL(71),
    EVENT_VERIFY_PHONE_FAIL_TRY_AGAIN(80),
    EVENT_VERIFY_PHONE_FAIL_CLOSE(81),
    EVENT_ERROR_OK(90),
    EVENT_APP_FLIP_3P_APP_INSTALLED(100),
    EVENT_APP_FLIP_3P_APP_NOT_INSTALLED(101),
    EVENT_APP_FLIP_3P_APP_SUPPORTED(102),
    EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED(103),
    EVENT_APP_FLIP_FLOW_SUCCESS(104),
    EVENT_APP_FLIP_FLOW_CANCELED(105),
    EVENT_APP_FLIP_3P_ERROR_RECOVERABLE(106),
    EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE(107),
    EVENT_APP_FLIP_3P_CONSENT_REJECTED(108),
    UNRECOGNIZED(-1);
    
    private final int K;

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.K;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private aodi(int i) {
        this.K = i;
    }
}
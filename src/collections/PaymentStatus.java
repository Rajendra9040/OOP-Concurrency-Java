package collections;

import com.sun.net.httpserver.Authenticator;

public enum PaymentStatus {
    SUCCESS,
    FAILURE,
    PAINDING,
    AWAITING_BANK_CONFIRMATION,
}

package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

public class AccountTransferException extends ApiException {
    public AccountTransferException(@C0193h0 Status status) {
        super(status);
    }
}

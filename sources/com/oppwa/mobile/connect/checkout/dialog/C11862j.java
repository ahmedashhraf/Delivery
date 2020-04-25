package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.tasks.C5547e;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentDataRequest.Builder;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.TransactionInfo;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.Wallet.WalletOptions;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.util.List;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.j */
public class C11862j {

    /* renamed from: a */
    public static final String f34277a = "aciworldwide";

    @C0193h0
    /* renamed from: a */
    public static Builder m53331a(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3, @C0193h0 Integer[] numArr, @C0193h0 Integer[] numArr2) {
        Builder newBuilder = PaymentDataRequest.newBuilder();
        newBuilder.setTransactionInfo(TransactionInfo.newBuilder().setTotalPriceStatus(3).setTotalPrice(str).setCurrencyCode(str2).build());
        for (Integer intValue : numArr) {
            newBuilder.addAllowedPaymentMethod(intValue.intValue());
        }
        CardRequirements.Builder newBuilder2 = CardRequirements.newBuilder();
        for (Integer intValue2 : numArr2) {
            newBuilder2.addAllowedCardNetwork(intValue2.intValue());
        }
        newBuilder.setCardRequirements(newBuilder2.build());
        newBuilder.setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters.newBuilder().setPaymentMethodTokenizationType(1).addParameter("gateway", f34277a).addParameter("gatewayMerchantId", str3).build());
        return newBuilder;
    }

    /* renamed from: a */
    public static PaymentsClient m53332a(Context context, C11978a aVar) {
        return Wallet.getPaymentsClient(context, new WalletOptions.Builder().setEnvironment(aVar == C11978a.LIVE ? 1 : 3).build());
    }

    /* renamed from: a */
    public static void m53333a(Context context, C11978a aVar, List<Integer> list, C5547e<Boolean> eVar) {
        m53334a(m53332a(context, aVar), list, eVar);
    }

    /* renamed from: a */
    static void m53334a(PaymentsClient paymentsClient, List<Integer> list, C5547e<Boolean> eVar) {
        IsReadyToPayRequest.Builder newBuilder = IsReadyToPayRequest.newBuilder();
        for (Integer intValue : list) {
            newBuilder.addAllowedPaymentMethod(intValue.intValue());
        }
        paymentsClient.isReadyToPay(newBuilder.build()).mo21992a(eVar);
    }
}

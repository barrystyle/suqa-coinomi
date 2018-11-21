package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class SuqaMain extends BitFamily {
    private SuqaMain() {
        id = "bitcoin.main";

        addressHeader = 63;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 191;

        name = "Suqa";
        symbol = "SUQA";
        uriScheme = "suqa";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(1000);
        minNonDust = value(1000);
        softDustLimit = value(1000000); // 0.01 SUQA
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Bitcoin Signed Message:\n");
    }

    private static SuqaMain instance = new SuqaMain();
    public static synchronized CoinType get() {
        return instance;
    }
}

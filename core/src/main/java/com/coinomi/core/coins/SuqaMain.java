package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class SuqaMain extends BitFamily {
    private SuqaMain() {
        id = "bitcoin.main";

        addressHeader = 0;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        name = "Suqa";
        symbol = "BTC";
        uriScheme = "bitcoin";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(12000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Suqa Signed Message:\n");
    }

    private static SuqaMain instance = new SuqaMain();
    public static synchronized CoinType get() {
        return instance;
    }
}

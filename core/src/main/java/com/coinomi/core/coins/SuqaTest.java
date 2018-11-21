package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class SuqaTest extends BitFamily {
    private SuqaTest() {
        id = "bitcoin.test";

        addressHeader = 111;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 239;

        name = "Suqa Test";
        symbol = "BTCt";
        uriScheme = "bitcoin";
        bip44Index = 1;
        unitExponent = 8;
        feeValue = value(10000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Suqa Signed Message:\n");
    }

    private static SuqaTest instance = new SuqaTest();
    public static synchronized CoinType get() {
        return instance;
    }
}

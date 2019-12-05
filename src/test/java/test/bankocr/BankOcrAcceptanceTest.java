package test.bankocr;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Path;

public class BankOcrAcceptanceTest {

    @Test
    public void parseFileWithSingleAllZeroesEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(Path.of(allZerosSingleEntry.toURI()));

        application.showsAccountNumber("000000000\n");
    }

    @Test
    public void parseFileWithSingleAllOnesEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allOnesSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allOnesEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(Path.of(allOnesSingleEntry.toURI()));

        application.showsAccountNumber("111111111\n");
    }

    @Test
    public void parseFileWithAllNumsEntryAndShowActualAccountNumerOnConsole() throws Exception {
        URL allNumsSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allOneToNineDigitEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(Path.of(allNumsSingleEntry.toURI()));

        application.showsAccountNumber("123456789\n");
    }


    @Test
    public void parseFileWithmultipleNumbers() throws Exception{
        URL allNumsMultipleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("multipleEntries");
        ApplicationRunner application = new ApplicationRunner();
        application.parseFile(Path.of(allNumsMultipleEntry.toURI()));

        application.showsAccountNumber("200800000\n999999999\n490867715\n");

    }
}

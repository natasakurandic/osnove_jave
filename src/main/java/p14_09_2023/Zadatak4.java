package p14_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {


        TestStep test1 = new TestStep(" Ovo je opis testa ", "https://outlook.live.com/mail/0/inbox", "https://outlook.live.com/mail/0/inbox", "Error 404");
        TestStep test2 = new TestStep(" Ovo je opis testa 2", "https://outlook.live.com/mail/0/inbox", "https://outlook.live.com/mail/0/sentitems", "Error 204");
        TestStep test3 = new TestStep(" Ovo je opis testa 3", "https://outlook.live.com/mail/0/inbox", "https://outlook.live.com/mail/0/drafts", "Error 104");

        TestCase testCase1 = new TestCase("1-1", "Test case one");

                testCase1.addTestStep(test1);
                testCase1.addTestStep(test2);
                testCase1.addTestStep(test3);

                testCase1.stampajStatusTasteCase();

                testCase1.numberFaildTest();
        System.out.println();
        System.out.println("Broj faild test stepova je " + testCase1.numberFaildTest());
        testCase1.stanjeTestCase();

    }
}
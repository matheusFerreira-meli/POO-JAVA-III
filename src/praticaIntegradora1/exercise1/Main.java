package praticaIntegradora1.exercise1;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Executivo-----------");
        Executive executive = new Executive();
        executive.makeDeposit();
        executive.transactionNotOK();
        executive.transactionOK();

        System.out.println("------------Básico-----------");
        Basic basic = new Basic();
        basic.checkBalance();
        basic.transactionOK();
        basic.makePayment();
        basic.transactionNotOK();
        basic.makeWithdraw();

        System.out.println("----------Cobradores----------");
        Collector collector = new Collector();
        collector.checkBalance();
        collector.transactionOK();
        collector.makeWithdraw();
        collector.transactionNotOK();
    }
}

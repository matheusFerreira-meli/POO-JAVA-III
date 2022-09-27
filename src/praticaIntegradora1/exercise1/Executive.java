package praticaIntegradora1.exercise1;

import praticaIntegradora1.exercise1.interfaces.IDeposit;

public class Executive implements IDeposit {
    @Override
    public void makeDeposit() {
        System.out.println("Realizando deposito de executivo");
    }

    @Override
    public void transactionOK() {
        System.out.println("Transação de executivo deu certo");
    }

    @Override
    public void transactionNotOK() {
        System.out.println("Transação de executivo não deu certo");
    }
}

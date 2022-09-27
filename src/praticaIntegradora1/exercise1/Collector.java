package praticaIntegradora1.exercise1;

import praticaIntegradora1.exercise1.interfaces.IBalance;
import praticaIntegradora1.exercise1.interfaces.IWithdraw;

public class Collector implements IWithdraw, IBalance {
    @Override
    public void checkBalance() {
        System.out.println("Verificando saldo de cobrador");
    }

    @Override
    public void transactionOK() {
        System.out.println("Transacao de cobrador deu certo");
    }

    @Override
    public void transactionNotOK() {
        System.out.println("Transacao de cobrador nao deu certo");
    }

    @Override
    public void makeWithdraw() {
        System.out.println("depositando de cobrador");
    }
}

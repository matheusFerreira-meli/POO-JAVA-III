package praticaIntegradora1.exercise1;

import praticaIntegradora1.exercise1.interfaces.IBalance;
import praticaIntegradora1.exercise1.interfaces.IServicePayments;
import praticaIntegradora1.exercise1.interfaces.IWithdraw;

public class Basic implements IBalance, IServicePayments, IWithdraw {
    @Override
    public void checkBalance() {
        System.out.println("Checando Saldo");
    }

    @Override
    public void makePayment() {
        System.out.println("Realizando pagamento");
    }

    @Override
    public void makeWithdraw() {
        System.out.println("Realizando saque");
    }

    @Override
    public void transactionOK() {
        System.out.println("Transação deu certo");
    }

    @Override
    public void transactionNotOK() {
        System.out.println("Transação não deu certo");
    }
}

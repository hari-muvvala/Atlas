package trainertasks.day21;

import java.util.List;
import java.util.ArrayList;

/*
 * Interface Segregation Principle (ISP) Demonstration
 *
 * This program separates Bank and Loan operations into distinct interfaces
 * so that classes implement only the methods they actually need.
 *
 * Common payment-related behavior is abstracted in a shared interface.
 */

// Common abstraction for all types of payments
interface Payment {
    Object status();
    List<Object> getListOfPayment();
}

// Bank-specific operations
interface Bank {
    void initiatePayment();
    void stopPayment();
}

// Loan-specific operations
interface Loan {
    void initiateRepayment();
    void initiateFinalSettlement();
    void initiateLoanSettlement();
}

// BankPayment implements only what it needs: Payment + Bank
class BankPayment implements Payment, Bank {

    @Override
    public Object status() {
        return "Bank Payment Status: COMPLETED";
    }

    @Override
    public List<Object> getListOfPayment() {
        List<Object> bankPayments = new ArrayList<>();
        bankPayments.add("Electricity Bill");
        bankPayments.add("Credit Card Bill");
        return bankPayments;
    }

    @Override
    public void initiatePayment() {
        System.out.println("Initiating bank payment...");
    }

    @Override
    public void stopPayment() {
        System.out.println("Stopping bank payment...");
    }
}

// LoanPayment implements only what it needs: Payment + Loan
class LoanPayment implements Payment, Loan {

    @Override
    public Object status() {
        return "Loan Status: ACTIVE";
    }

    @Override
    public List<Object> getListOfPayment() {
        List<Object> loanPayments = new ArrayList<>();
        loanPayments.add("Home Loan EMI");
        loanPayments.add("Personal Loan EMI");
        return loanPayments;
    }

    @Override
    public void initiateRepayment() {
        System.out.println("Initiating loan repayment...");
    }

    @Override
    public void initiateFinalSettlement() {
        System.out.println("Initiating final loan settlement...");
    }

    @Override
    public void initiateLoanSettlement() {
        System.out.println("Initiating part-loan settlement...");
    }
}

// Driver class
public class Task7_ISPHomePaymentSystem {
    public static void main(String[] args) {
        System.out.println("=== Bank Payment Scenario ===");
        BankPayment bank = new BankPayment();
        bank.initiatePayment();
        bank.stopPayment();
        System.out.println("Bank Status: " + bank.status());
        System.out.println("Bank Payments: " + bank.getListOfPayment());

        System.out.println("\n=== Loan Payment Scenario ===");
        LoanPayment loan = new LoanPayment();
        loan.initiateRepayment();
        loan.initiateFinalSettlement();
        loan.initiateLoanSettlement();
        System.out.println("Loan Status: " + loan.status());
        System.out.println("Loan Payments: " + loan.getListOfPayment());
    }
}
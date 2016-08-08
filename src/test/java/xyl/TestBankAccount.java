package xyl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
  
  @Test
  public void testDebitWithSufficientFunds() {
    BankAccount account = new BankAccount(10);
    double amount = account.debit(5);
    assertEquals(5.0, amount, 0);
  }
}
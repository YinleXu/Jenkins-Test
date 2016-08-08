package xyl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
  
  @Test
  public void testDebitWithSufficientFunds() {
    BankAccount account = new BankAccount(10);
    double amount = account.debit(4);
    assertEquals(4.0, amount, 0);
  }
  
  @Test
  public void testDebitWithInsufficientFunds() {
      BankAccount account = new BankAccount(10);
      double amount = amount.debit(15);
      Assert.assertEquals(10.0,amount,0);
  }
}
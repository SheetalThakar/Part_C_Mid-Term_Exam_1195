/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author sheetal
 */
public class Account {
    
        private String user;
        private double balance;
        private double interestRate=0.23;
        
        private String [] accountsType={"Saving","Chequing","TFS"};
        private String accountType;
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(String givenUser,double initialBalance,String givenAccType)
        {
            balance=initialBalance;
            user=givenUser;
            accountType=givenAccType;
            //Note that the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param aAccountType the accountType to set
     */
    public void setAccountType(String aAccountType) {
        accountType = aAccountType;
    }

    
}//class end

package assessment2;

public class BankAccount 
{
private long AccountNo=1234567890;
private String AccountHolderName="srini";
private float AccountBalance=1000.50f;
private int Pin=12345;

@Override
public String toString() 
{
	return "BankAccount [AccountNo=" + AccountNo + ", AccountHolderName=" + AccountHolderName + ", AccountBalance="
			+ AccountBalance + ", Pin=" + Pin + "]";
}

public long getAccountNo()
{
	return AccountNo;
}
public void setAccountNo(long accountNo) 
{
	AccountNo = accountNo;
}
public String getAccountHolderName()
{
	return AccountHolderName;
}
public void setAccountHolderName(String accountHolderName) 
{
	AccountHolderName = accountHolderName;
}
public float getAccountBalance() 
{
	return AccountBalance;
}
public void setAccountBalance(float accountBalance) 
{
	AccountBalance = accountBalance;
}
public int getPin()
{
	return Pin;
}
public void setPin(int pin) 
{
	Pin = pin;
}


}

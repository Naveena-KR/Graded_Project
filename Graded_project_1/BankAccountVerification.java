package Graded_project_1;
import java.util.Scanner;
class CredentialVerification extends Random_OTP_generation {//This class is to verify the user bank account number & Password to login
	Scanner input=new Scanner(System.in);//input Object is created for Scanner.
	long BankAccountNo=1122334455l;//HardCoded user BankAccountNumber.
	long Password=12345l;//HardCoded user Password.
	void verifyBankAccount(){
		System.out.print("Enter the bank Account no:");
		long AccountVerified=input.nextLong();
		if(BankAccountNo==AccountVerified){//If entered user bank account number is correct, it moves to password verification.
			verifyPassword();
			}
		else{
			System.out.println("Incorrect Account Number");
			verifyBankAccount();
			}
		}
	void verifyPassword(){
		System.out.print("Enter the Password:");
		long PasswordVerified=input.nextLong();
		if(Password==PasswordVerified){//If password is correct, then main options will be displayed.
			System.out.println("		Successfull");
			}
		else{
			System.out.println("Incorrect Password");
			verifyPassword();
			}
		}
	}
public class BankAccountVerification {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialVerification vv=new CredentialVerification();
		vv.verifyBankAccount();
	}
}
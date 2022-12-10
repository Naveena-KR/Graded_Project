package Graded_project_1;
public class MainMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("			Credential verification\n");
		System.out.println("Welcome to login page\n");
		CredentialVerification bankAccountLogin=new CredentialVerification();
		bankAccountLogin.verifyBankAccount();//Calling method in CredentialVerification class.
		MainOptions mainMenu=new MainOptions();
		mainMenu.selectOptions();//Calling method in bank service class.
	}
}
/* User Bank account number=1122334455, password=12345
   Recipient Bank account number=5544332211                          */                  
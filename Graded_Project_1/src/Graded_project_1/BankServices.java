package Graded_project_1;
class MainOptions extends CredentialVerification{
	long Balance=5000l;//Minimum Balance is HardCoded, Balance=5000.
	long TransferAmount=0l;//Initially Transfer Amount is zero.
	long TransferAccountNo=5544332211l;//HardCoded recipient BankAccountNumber.
	long TransferAccountInput;
	long WithdrawAmount=0;//Initially withdraw amount is zero.
	int Back=0;//To come back from process, 0 key is used.
	void selectOptions (){
		System.out.println("\n!!!!!!!!!!!! Welcome to Karnataka Bank !!!!!!!!!!!!\n");
		System.out.println("\n\nPlease Select Your Service");
		System.out.println("1)Deposit\n2)Withdraw\n3)Transfer\n4)Check Balance\n5)Logout");
		int Deposit=1, Withdraw=2, Transfer=3,CheckBalance=4,Logout=5;//Declaring the numbers to variables.
		System.out.print("\nEnter the Option: ");
		int Options=input.nextInt();
		if(Options>5 || Options<1){
			System.out.println("Please Enter Correct Option.........");
			selectOptions();
		}
		if(Options==Deposit){
			long DepositAmmount;
			System.out.print("Enter the Amount:");DepositAmmount=input.nextLong();
			Balance=Balance+DepositAmmount;//Entered amount is added to current balance.
			System.out.println("Amount Rs."+DepositAmmount+" deposited successfully");
			System.out.println("Updated Acount Balance is: "+Balance);
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\nPress 0 to go Back");Back=input.nextInt();
			backOption();
			}
		if(Options==Withdraw){
				System.out.print("Enter Amount to Withdraw:");
				WithdrawAmount=input.nextInt();
				if(WithdrawAmount<=Balance) {
					System.out.println("Processing...........!");
					System.out.println("Your Withdraw Amount is:"+WithdrawAmount+"\nSuccessfull\n               Collect Your Cash");
					Balance=Balance-WithdrawAmount;
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\nPress 0 to go Back");
					Back=input.nextInt();
					backOption();
				}
				else {
					System.out.println("Entered amount is greater than current balance");
					System.out.println("----------------------------------------------------------------------------------------------");
					selectOptions();
				}
			}		
		if(Options==Transfer){
			System.out.print("Enter the amount you want to transfer: ");
			TransferAmount=input.nextLong();
			if(TransferAmount>Balance){//If entered amount is greater than current balance, shows waring message and takes to options page.
				System.out.println("Your Transfer Amount is more than Current Balance!!!!!!!!!!!!!!!!!");
				System.out.println("Please Enter Correct Amount");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
				selectOptions();
			}
			else 
				System.out.print("Enter the BankAccount no to which you want to transfer:");
				TransferAccountInput=input.nextLong();
				if(TransferAccountInput==TransferAccountNo){
					int otpStore=Integer.parseInt(String.valueOf(generateOTP(4)));
					System.out.println("Your OTP is "+otpStore);
					System.out.println("Enter the OTP");
					int OTPgeneration=input.nextInt();
					if(OTPgeneration==otpStore){//If correct OTP and Recipient account number is entered, transfers the amount
						System.out.println("OTP verification Successful !!!");
						System.out.println("Processing...........!");
						System.out.println("Amount "+TransferAmount+" transferred successful to BankAccount "+TransferAccountNo);
						System.out.println("Remaining Bank balance is: "+Balance);
						System.out.println("Transaction Status: Success");
						System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

						}
					else
						System.out.println("Invalid OTP");
						System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");		
						selectOptions();//If invalid OTP is entered, it exits from transaction page.
						}
				if(TransferAccountInput!=TransferAccountNo){//If wrong Recipient account number entered, it exits from transaction page.
					System.out.println("Please Enter Valid Bank Account No");
					System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
					selectOptions();//Takes to options pages
					}
				}
		if(Options==CheckBalance){
			System.out.println("Balance = "+Balance);//Displays the current balance
			System.out.println("\nPress 0 to go Back");
			Back=input.nextInt();
			backOption();
		}
		if(Options==Logout){
			System.out.println("Logout success\n*****************************************************************************************************************************");
			System.out.println("    Login to continue\n\n");
			verifyBankAccount();//This will takes to login page.
			selectOptions();//If login pages passed, then main option page will appear.
			}
		}
	void backOption() {//This method is created to go back to main options. 
		try{
			if(Back==0){//If user input is exact 0, then main options will be repeated.
				System.out.println("----------------------------------------------------------------------------------------------");
				selectOptions();
				}
			else{//If not zero, it creates text filed to re-enter the option until 0 will be entered
				System.out.print("Please press 0 to go back:");
				Back=input.nextInt();
				}
			}
		finally{	
			backOption();//Finally calling this backOption method, Repeats the loop until 0 is entered
			}
		}
	
}
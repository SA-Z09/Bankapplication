Public class Account {
	
	int balance;                //Assigning
	int previousTransaction;
	String custName;
	String custID;
	
	// Creating a Class constructor
	Account(String custname, String custid) {
		custName = custname;custID = custid }  //specifying the output by setting it equal
    // Depositing money
	void deposit(int amount) {            //Int because we are going to specify the amount to deposit
		if (amount != 0) {
            // if amount is not equaly to 0 then 
			balance = balance + amount; 
	//Setting prevtrans to amount
    previousTransaction = amount;}}

    // Withdrawing money
    //User is going to enter amount 
	void withdraw(int amount) {
		if (amount != 0) {
            //if not 0 then
			balance = balance - amount;
            //negative because we going to withdraw
			previousTransaction = -amount;}
        
        //Showing the previous transaction
	void getPreviousTransaction() {
        //if greater than 0 then we have deposited money 
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
            //if less than 0 then we have withdrawn money
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            //If 0 no action 
		} else {
			System.out.println("No transaction occurred");}}}

//Calculating the interest of current funds after years
//feed in years 
void calculateInterest(int years) {
    double interestRate = .0185;
    //Basic calculation
    double newBalance = (balance * interestRate * years) + balance;
    //Multiplying the interest by 100 to get the value in whole number
    //Concaneting 
    System.out.println
    ("The current interest rate is " + (100 * interestRate) +"%");
    System.out.println
    ("After " + years + " years, you balance will be: " +newBalance);}

    
	//Showing the main menu
    //Main function
	void showMenu() {
        //Variable option A,B,C,D,E,F..
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
        //Displaying customer name
		System.out.println("Welcome, " + customerName + "!");
         //Displaying customer Id
		System.out.println("Your ID is: " + customerID);
        //Seperation
		System.out.println();
        //Question to the user
		System.out.println("What would you like to do?");
        //Space again
		System.out.println();
        //Options 
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");

        //Putting inside a switch function
        do {
			System.out.println();
            //Otions
			System.out.println("Enter an option: ");
            //taking only the first character by specifying 0
			char option1 = scanner.next().charAt(0);
            //Keeping an option of lower case if used then convert it to uupercase
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			
			case 'A': //Check the balance
				System.out.println("==="); System.out.println("Balance = $" + balance);   
				System.out.println("==="); System.out.println();
				break;

			
			case 'B': //Make a deposit 
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt(); deposit(amount); System.out.println();
				break;

			
			case 'C': //Withdraw money
				System.out.println("Enter an amount to withdraw: "); int amount2 = scanner.nextInt();
				withdraw(amount2); System.out.println();
				break;


		
			case 'D': //Recent transaction
				System.out.println("==="); getPreviousTransaction();
				System.out.println("==="); System.out.println();
				break;



			
			case 'E': //Accured interest
            //A question asked
				System.out.println("Enter how many years of accrued interest: "); int years = scanner.nextInt();
				calculateInterest(years);
				break;



			
			case 'F': //Exit
				System.out.println("===");
				break;

			//Letting the user know to put a valid option if it's invalid
			default:
				System.out.println("Error: invalid option. Please enter A, B, C, D, or E or contact us.");
				break;}} while(option != 'F');
                //Printing 
		System.out.println("Thank you!");}}
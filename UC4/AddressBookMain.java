package com.bridgelabz.UC4;

public class AddressBookMain {

    public static void main(String[] args) {
        //Welcome message for Users
        System.out.println("Welcome to Address Book System Problem Developed by Tahir Mansuri.");

        //Variable for user Choice
        int choice;

        //AddressBook Class Object for Contact Management
        AddressBook addressBook = new AddressBook();

        //Show Menu for user to Select Operation on AddressBook
        do {
            System.out.println("** ADDRESS BOOK MANAGEMENT **");
            System.out.println("1. ADD NEW CONTACT\n2. EDIT CONTACT\n3. DELETE CONTACT" +
                    "\n4. DISPLAY CONTACT\n5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    //Adding New Contact Details
                    addressBook.addNewContact();
                    break;
                case 2:
                    //Edit Contact Details
                    addressBook.editContact();
                    break;
                case 3:
                    //Delete the Contact Details
                    addressBook.deleteContact();
                    break;
                case 4:
                    //Show Contact Details
                    addressBook.displayContact();
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        }while( choice != 5 );
    }
}
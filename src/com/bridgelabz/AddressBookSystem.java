package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System !");
        AddressBookSystem addressbooksystem = new AddressBookSystem();
        addressbooksystem.addContactDetails();
        boolean condition = true;

        while (condition == true) {
            System.out.println("1.add" + "\n" + "2.edit" + "\n" + "3.delete");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addressbooksystem.addContactDetails();
                    break;
                case 2:
                    addressbooksystem.editContactDetails();
                    break;
                case 3:
                    addressbooksystem.deleteContactDetails();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }


    public static Contact addContactDetails() {

        Contact contact = new Contact();

        System.out.println("Enter First name");
        String firstName = scanner.next();
        contact.setFirstName(scanner.next());

        System.out.println("Enter Last name");
        String lastName = scanner.next();
        contact.setLastName(scanner.next());

        System.out.println("Enter Address");
        contact.setAddress(scanner.next());
        String address = scanner.next();

        System.out.println("Enter City name");
        contact.setCity(scanner.next());
        String city = scanner.next();

        System.out.println("Enter State name");
        contact.setState(scanner.next());
        String state = scanner.next();

        System.out.println("Enter Zip code");
        int zip = scanner.nextInt();
        contact.setZip(Integer.parseInt(scanner.next()));

        System.out.println("Enter Phone number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(Long.parseLong(scanner.next()));

        System.out.println("Enter Email");
        contact.setEmail(scanner.next());
        String email = scanner.next();


        addressBook.add(contact);
        Contact details1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.add(details1);
        System.out.println(addressBook);
        System.out.println("Successfully created contacts");
        return contact;


    }

    public void editContactDetails() {
        System.out.println("Enter a name for edit:");
        String editName = scanner.next();
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(editName)) {
                System.out.println("Select options");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.Email");
                int editOption = scanner.nextInt();
                switch (editOption) {
                    case 1:
                        System.out.println("Enter First name:");
                        addressBook.get(i).setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter Last name:");
                        addressBook.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter Address:");
                        addressBook.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter City:");
                        addressBook.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter State:");
                        addressBook.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip code:");
                        addressBook.get(i).setZip(Integer.parseInt(scanner.next()));
                        break;
                    case 7:
                        System.out.println("Enter Phone number:");
                        addressBook.get(i).setPhoneNumber(Long.parseLong(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Email :");
                        addressBook.get(i).setEmail(scanner.next());
                        break;
                    default:
                        System.out.println("Enter valid contact");
                }
            }
            System.out.println("Edited list is:");
            System.out.println(addressBook);
        }
    }

    public void deleteContactDetails() {
        System.out.println("Confirm first name to delete contact");
        String confirmName = scanner.next();
        System.out.println(confirmName);
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(confirmName)) ;
            Contact person = addressBook.get(i);
            addressBook.remove(person);

        }
        System.out.println(addressBook);

    }

}







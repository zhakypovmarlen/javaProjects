package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String, Integer> phonebook = new HashMap<>();


    public void addContact(String name, Integer phoneNumber) {
        //write code which will add new contact to phonebook hashmap
        phonebook.put(name, phoneNumber);
    }

    public void deleteContact(String nameOrPhone) {
        //write a code which will delete contact by either name or phone
        //if user provided name, delete the contact
        //if user provided phone, still delete the contact
        for (String s : phonebook.keySet()) {
            if (nameOrPhone.equals(s)) {
                phonebook.remove(s);
            }
            int phone = Integer.parseInt(nameOrPhone);
            if (phonebook.containsValue(phone)) {
                phonebook.remove(s, phone);
            }

        }

    }


    public void updateContactsName(String oldName, String newName) {
        //write a code which will update name of the contact
        for (String s : phonebook.keySet()) {
            if (oldName.equals(s)) {
                phonebook.put(newName, phonebook.get(oldName));
                phonebook.remove(oldName);
            }
        }

    }

    public void updateContactsPhoneNumber(String oldNumber, String newNumber) {
        //write a code which will update phone number of the contact
        int oldNumber1 = Integer.parseInt(oldNumber);
        int newNumber1 = Integer.parseInt(newNumber);
        for (String s : phonebook.keySet()) {
            if (phonebook.get(s).equals(oldNumber1)) {
                phonebook.replace(s, newNumber1);
            }
        }
    }

    public String searchForContact(String name) {
        //write a code which returns the phone number of the given name
        //print error message and return -1 if the contact doesn't exist
        for (String s : phonebook.keySet()) {
            if (name.equals(s)) {
                return phonebook.get(s) + "";
            }
            return "Error";
        }
        return -1 + "";

    }

    public ArrayList<String> getAllContacts() {
        //return list of all contact names
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(phonebook.toString());
        return arrayList;
    }

    public static void main(String[] args) {
        /*
        using Scanner class, write a code that will produce following output:

        Welcome to the phonebook!

        Enter a command: add
        Enter name: John
        Enter phone number: 123-456-7890
        Contact added successfully.

        Enter a command: add
        Enter name: John
        Enter phone number: 111-222-3333
        Contact updated successfully.

        Enter a command: search
        Enter name: John
        John: 123-456-7890

        Enter a command: list
        Contacts:
        - John: 111-222-3333

        Enter a command: remove
        Enter name: John
        Contact removed successfully.

        Enter a command: list
        Contacts:
        - (empty)

        Enter a command: quit
        Goodbye!
         */
        PhoneBook user1 = new PhoneBook();
        System.out.println("Welcome to the Phonebook");

        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < 100; i++) {
//            System.out.println("Enter a command: ");
//            String command = sc.next();
//            if(command.equals("quit")){
//                System.out.println("GoodBye!");
//                break;
        boolean notYet = true;
        while (notYet) {
            System.out.println("Enter a command: ");
            String command = sc.next();
            if (command.equals("add")) {
                System.out.println("Enter a name: ");
                String name = sc.next();
                System.out.println("Enter a phone number: ");
                int phoneNumber = sc.nextInt();
                user1.addContact(name, phoneNumber);
            }
            if (command.equals("search")) {
                System.out.println("Enter a name: ");
                String name = sc.next();
                for (String s : user1.phonebook.keySet()) {
                    if (name.equals(s)) {
                        System.out.println(user1.phonebook.get(s));
                    }
                }
            }
                if (command.equals("list")) {
                    System.out.println("Contacts: ");
                    if(user1.phonebook.isEmpty()){
                        System.out.println("Empty");
                    }
                    else {
                        for (int i = 0; i < user1.getAllContacts().size(); i++) {
                            System.out.println(user1.getAllContacts().get(i));
                        }
                    }
                }
                if (command.equals("remove")) {
                    System.out.println("Enter a name: ");
                    String name1 = sc.next();
                    if(!user1.phonebook.containsKey(name1)){
                        System.out.println("Error");
                    }
                    else {
                        for (String s : user1.phonebook.keySet()) {
                            if (name1.equals(s)) {
                                user1.phonebook.remove(s);
                                System.out.println("Contact removed successfully");
                                break;
                            }
                        }
                    }
                }
                if (command.equals("quit")) {
                    System.out.println("GoodBye!");
                    notYet = false;


                }
            }


        }


    }




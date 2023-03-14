package primitiveDataTypes;

public class PracticeVariableDeclaration {

    public static void main (String [] args){

        /*
            multiline comments
        1. Declare variable
        2. Assign value to variable
        3. Reassign value to variable
         */

        //variable declaration

        byte myByte;  // min -128 max 127
        short myShort; // min -32768 max 32767
        int myInt; // min -2,147,483,648 max 2,147,483,647
        long myLong; // min -9,223,372,036,854,775,808 max 9,223,372,036,854,775,807

        myByte = 12;
        myShort = 12312;
        myInt = 1231231;
        myLong = 1231231231;

        myByte = 123;
        myShort = 21321;
        myInt = 1321321;
        myLong = 1321321321;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);



        /*
        naming convention
        1. all variables must start with lower case
        2. all variables must use camelCase (thisIsMyCamelCaseLongWord)
        3. all classes must start with upper case, use camelCase
        4. all packages must start with lower case, use camelCase
        5. names must start with any letter, or _ or $
        */

        short myShort1;
        myShort1 = 12;
        System.out.println(myShort1);
        myShort1 = 13;
        System.out.println(myShort1);

        long myLong1;
        myLong1 = 119l;
        System.out.println(myLong1);
        myLong1 = 120l;
        System.out.println(myLong1);

        myLong1 = myShort1;
        System.out.println(myLong1);

        myShort1 = (short)myLong1;
        System.out.println(myShort1);

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int myInt1;
        myInt1 = 1555;
        System.out.println(myInt1);
        myInt1 = 1556;
        System.out.println(myInt1);

        int myInt2 = 12;
        System.out.println(myInt2);
        myInt2 = 22;
        System.out.println(myInt2);

        int myInt3= 13;
        System.out.println(myInt3);
        myInt3 = 23;
        System.out.println(myInt3);

        int myInt4 = 14;
        System.out.println(myInt4);
        myInt4 = 24;
        System.out.println(myInt4);

        int myInt5 = 15;
        System.out.println(myInt5);
        myInt5 = 25;
        System.out.println(myInt5);

        int myInt6 = 16;
        System.out.println(myInt6);
        myInt6 = 26;
        System.out.println(myInt6);

        int myInt7 = 17;
        System.out.println(myInt7);
        myInt7 = 27;
        System.out.println(myInt7);

        int myInt8 = 18;
        System.out.println(myInt8);
        myInt8 = 28;
        System.out.println(myInt8);

        int myInt9 = 19;
        System.out.println(myInt9);
        myInt9 = 29;
        System.out.println(myInt9);

        int myInt10 = 20;
        System.out.println(myInt10);
        myInt10 = 30;
        System.out.println(myInt10);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        byte myByte1;
        myByte1 = 120;
        System.out.println(myByte1);
        myByte1 = 121;
        System.out.println(myByte1);

        double myDouble1;
        myDouble1 = 123.221111112;
        System.out.println(myDouble1);
        myDouble1 = 124.22111111;
        System.out.println(myDouble1);

        float myFloat1;
        myFloat1 = 89.115119999999999999999999999f;
        System.out.println(myFloat1);
        myFloat1 = 89.11512f;
        System.out.println(myFloat1);

        boolean myBoolean1;
        myBoolean1 = false;
        System.out.println(myBoolean1);
        myBoolean1 = true;
        System.out.println(myBoolean1);

        char myChar1;
        myChar1 = 'a';
        System.out.println(myChar1);
        myChar1 = 'b';
        System.out.println(myChar1);

        String myString1;
        myString1 = "Hello World";
        System.out.println(myString1);
        myString1 = new String("Hello yall ");
        System.out.println(myString1);

        String myString2 = myString1 + myInt1;
        System.out.println(myString2);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        byte myByte10 = 95;
        short myShort10 = 100;
        int myInt20 = 2000;
        long myLong10 = 9000l;

        myByte10 = (byte) myShort10;
        System.out.println(myByte10);

        myShort10 = (short) myInt20;
        System.out.println(myShort10);

        myInt20 = (int) myLong10;
        System.out.println(myInt20);

        myLong10 = myByte10;
        System.out.println(myLong10);


    }
}

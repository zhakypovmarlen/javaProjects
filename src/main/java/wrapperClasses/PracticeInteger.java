package wrapperClasses;

public class PracticeInteger {
    public static void main(String[] args) {

        String accountNumber = "12312312";
        int a = Integer.parseInt(accountNumber);
        Integer aa = Integer.max(3, 60);
        System.out.println(a);
        System.out.println(aa);

        byte b = Byte.parseByte("120");
        System.out.println(b);

        double d = Double.sum(32, 4);
        System.out.println(d);

        boolean boo = Boolean.parseBoolean("TRUE");
        System.out.println(boo);

        char character = Character.valueOf('6');
        System.out.println(character);

        String balance = "423425";

        Integer num1 = Integer.valueOf(4);
        Integer num2 = Integer.valueOf('4');
        Integer num3 = Integer.valueOf("4");

        int number = 4;
        long number2 = number;  // implicit casting

        number = (int) number2; // explicit casting


        String intNumber = "19932";
        System.out.println(intNumber);
        int number1 = Integer.parseInt(intNumber);
        System.out.println(number1);

        String doubleNumber = "123.33";
        System.out.println(doubleNumber);
        double numberDouble = Double.parseDouble(doubleNumber);
        System.out.println(numberDouble);

        getIntFromString("applebanana12");


        String strBool = "false";
        boolean bool = Boolean.parseBoolean(strBool);
        System.out.println(bool);

        String intWrap = "1343";
        Integer intWrap1 = Integer.parseInt(intWrap);

        String shortWrap = "354";
        short shortNum = Short.parseShort(shortWrap);

        String byteWrap = "31";
        Byte wrapByte = Byte.parseByte(byteWrap);

        Integer intObj = Integer.valueOf(200);
        String obj = String.valueOf(intObj);
        System.out.println(obj);

        int prim = intObj;

        Boolean boolObj = Boolean.valueOf("true");
        String obj1 = String.valueOf(boolObj);
        System.out.println(obj1);

        boolean bool1 = boolObj;
        System.out.println(bool1);

        Double doubleObj = Double.valueOf("20.9");
        String strDouble = String.valueOf(doubleObj);

        double doublee = doubleObj;
    }
        public static int getIntFromString(String number){
            String number2 = "";
            for(int i = 0; i < number.length(); i++){
                if(Character.isDigit(number.charAt(i))){
                    number2 += number.charAt(i);
                }
            }
            if(number2.isEmpty()){
                return -1;
            }

            return Integer.parseInt(number2);
        }



}
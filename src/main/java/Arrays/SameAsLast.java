package Arrays;

public class SameAsLast {


    public static boolean isMoreThan3(int [] a){
        if(a.length >= 1){
            if(a[0] == a[a.length - 1]){
                return true;
            }
        }
        return false;
    }


    public static boolean string (String [] str){
        return str.length >= 3 && str[0].equals(str[1]) && str[1].equals(str[str.length - 1]  );
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,1};
        int [] numbers2 = {1,23,4,5};
        int [] numbers3 = {1};

        System.out.println(isMoreThan3(new int [] {1,2,3,4,1}));
        System.out.println(isMoreThan3(numbers2));
        System.out.println(isMoreThan3(numbers3));

        String [] str1 = {"Apple", "Banana", "Pear"};
        String [] str2 = {"Apple", "Banana"};
        String [] str3 = {"car", "car", "string", "car"};

        System.out.println(string(str1));
        System.out.println(string(str2));
        System.out.println(string(str3));

    }
}

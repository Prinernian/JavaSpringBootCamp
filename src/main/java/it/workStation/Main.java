package it.workStation;


class Calculator{

    int num = 5;

    public int add(int a, int b){
        return a+b;
    }
}
public class Main {
    static void main() {
//        int n = 9;
//        switch (n){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }



//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        } while(i < 8);



//        int j = 10;
//        do {
//            System.out.println("j is " + j);
//            j--;
//        } while (j >= 5);


//        int data = 10;
//
//        Calculator obj1 = new Calculator();
//        Calculator obj2 = new Calculator();
//        int r1 = obj1.add(1,2);
//
//        obj1.num = 10;
//        System.out.println(obj1.num);
//        System.out.println(obj2.num);


//        int barray[][] = new int[3][4];
//
//
//        for(int i =0; i < 3; i++){
//            for(int j = 0; j < 4; j++){
//                barray[i][j] = (int)(Math.random() * 100);
//            }
//            System.out.println();
//        }


//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 4; j++){
//                System.out.print(barray[i][j] + " ");
//            }
//            System.out.println();
//        }


        int nums[][] = new int [3][];   //jagged array
        nums[0] = new int[5];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums[i].length; j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int n []: nums){
//            for(int i: n){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // how to create an object of String
        String str = new String("PearsonHardman");
        System.out.println(str.hashCode());
        System.out.println(str.charAt(3));
    }
}

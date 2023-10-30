public class lesson_2 {
    public static void main(String[] args) {

        TwoNumder(10,20);
        PlusOrMinus(-20);
        MunysNumder(-10);
        Array100();


    }


    public static void TwoNumder(int a , int b){
        boolean c = false;
        if ( a+b >= 10 && a+b <= 20){
            c = true;
        }
        System.out.print(c + "\n");

    }
    public static void PlusOrMinus (int a ){

        if ( a >=0 ) {
            System.out.print("Число положительное" + "\n");
        }
        else {
            System.out.print("Число отрицательное" + "\n");
            }
        }

    public static void MunysNumder(int a){
        boolean c = false;
        if ( a < 0){
            c = true;
        }
        System.out.print(c + "\n");

    }
    public static void visokosny (int a ){

        if ( a >=0 ) {
            System.out.print("Число положительное" + "\n");
        }
        else {
            System.out.print("Число отрицательное" + "\n");
        }
    }

    public static void Array01(){

    }
    public  static  void  Array100(){
        int array[] = new int[100];

        for (int i=0; i< array.length; i++)
        {
            System.out.print(array[i] = i+1);
            System.out.print(" ");

        }
    }
    }


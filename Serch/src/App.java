import java.util.Scanner;

/**
 * Dssg
 */
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Ingrese extension del array");
        Scanner sc = new Scanner(System.in);
        int ex = sc.nextInt();
        int ary[];
        ary =  new int[ex] ; 
        System.out.println("Ingrese "+ ex +" numeros en el array");
        int a = 0;
        int e = 0;
        do{
            int num = sc.nextInt();
            ary[a] = num;
            a++;
        }while(a < ary.length);
        do{
            System.out.print(ary[e]+" ");
            e++;
        }while(e < ary.length);


        System.out.println("\n Ingrese un numero a buscar");
        int seh = sc.nextInt();
        if (Binario(ary, seh) == -1){
            System.out.println("No se encuentra el número");
        }else{
            System.out.println("El numero se encuentra en la posicion "+ Binario(ary, seh)+" del array");
        }

      
    }

    public static int Binario(int[] ary, int valor) {

            int left = 0;
            int right = ary.length - 1;
            
            while (left <= right) {
              int middle = (left + right) / 2;
              if (ary[middle] == valor) {
                return middle;
              } else if (ary[middle] < valor) {
                left = middle + 1;
              } else {
                right = middle - 1;
              }
            }
            
            return -1;
    }
}
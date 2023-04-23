package April23_2023;

public class HJ72 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution(){
        int x, y, z;

        for (x = 0; x < 15; x++){
            if ((100 - 7 * x) % 4 == 0){
                y = (100 - 7 * x) / 4;
                z = 100 - x - y;
                System.out.println(x +" "+ y +" "+ z);
            }
        }
    }
}

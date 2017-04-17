package lacosaaninhados;

public class LacosaAninhados {

    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.printf("%d:%d:%d \n", h, m, s);
                    if (h == 23 && m == 50 && s == 50) {
                        System.out.println("ALARME!!! ");
                        break;

                    }
                }
                if (m == 50) {
                    break;
                }
            }
if (h==50){
    break;
        }
        }
    }
}

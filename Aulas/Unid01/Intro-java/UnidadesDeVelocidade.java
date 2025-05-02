import java.text.DecimalFormat;

public class UnidadesDeVelocidade {
    public static void main(String[] args) {
        double kph = 0.0, mps, mph, pps;

        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("k/h \t m/s \t m/h \t ml/s");

        while (kph <= 50.0) {
            mps = kph * 0.2778;
            mph = kph * 0.6214;
            pps = kph * 0.9113;

            System.out.println(
                df.format(kph) + "\t" +
                df.format(mps) + "\t" +
                df.format(mph) + "\t" +
                df.format(pps)
            );

            kph += 0.5;
        }
    }
}


// public class UnidadesDeVelocidade {
//     public static void main(String[] args){
//         double kph = 0.0, mps;

//         System.out.println("k/h \t m/s");

//         while (kph <= 50.0){
//             mps = kph * 0.2778;
//             System.out.println(kph + "\t" + mps);
//             kph += 0.5;
//         }
//     }
// }

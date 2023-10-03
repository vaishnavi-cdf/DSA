public class Pattern {
    public class PatternsP1 {
        public static void main(String[] args) {
            // *
            // **
            // ***
            // ****
            // *****

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // *****
            // ****
            // ***
            // **
            // *

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // 54321
            // 5432
            // 543
            // 54
            // 5
            for(int i = 0; i < 5; i++) {
                for(int j = 5; j > i; j--){
                    System.out.print(j);
                }
                System.out.println();
            }

            // 1
            // 23
            // 456
            // 78910
            int k = 0;
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i+1; j++){
                    k++;
                    System.out.print(k);
                }
                System.out.println();
            }   
        }
    }
    public class PatternsP1 {
        public static void main(String[] args) {
            // *
            // **
            // ***
            // ****
            // *****

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // *****
            // ****
            // ***
            // **
            // *

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // 54321
            // 5432
            // 543
            // 54
            // 5
            for(int i = 0; i < 5; i++) {
                for(int j = 5; j > i; j--){
                    System.out.print(j);
                }
                System.out.println();
            }

            // 1
            // 23
            // 456
            // 78910
            int k = 0;
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i+1; j++){
                    k++;
                    System.out.print(k);
                }
                System.out.println();
            }   
        }
    }
    public class PatternsP3 {
        public static void main(String[] args) {
            // *****
            // *   *
            // *   *
            // *   *
            // *****
            int row = 11;
            int col = 11;
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++){
                    if(i == 0 || j == 0 || i == row-1 || j == col-1)
                     {
                        System.out.print("*");
                     }
                     else {
                        System.out.print(" ");
                     }
                }
                System.out.println();
            }


            // *****
            // *   *
            // * * *
            // *   *
            // *****

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++){
                    if(i == 0 || j == 0 || i == row-1 || j == col-1 || i == row/2 && j == col/2)
                     {
                        System.out.print("*");
                     }
                     else {
                        System.out.print(" ");
                     }
                }
                System.out.println();
            }



        }
    }

}
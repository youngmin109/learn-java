package src;

public class Class1105 {
    public static void main(String[] args) {
        int img[][][] = {
                { {100, 200}, {1, 78}   },
                { {-1, -2},   {300, 0}  },
                { {50, 70},   {7, 90}   }
        };

        boolean flagNum = false;

        bar:
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 2 ; j++) {
                for(int k = 0 ; k < 2 ; k++) {
                    System.out.print(img[i][j][k] + "\t");
                    if (img[i][j][k] == 78) {
                        flagNum = true;
                        break bar; // label 유일한 쓰는 1개
                        // 연구할 때는 문제를 빨리 해결하는게 우선
                    }
                }
                System.out.println();
            }
            System.out.println("-----------------");

        }
        if(flagNum) {
            System.out.println("해당되는 값을 찾았습니다.");
        }else {
            System.out.println("해당되는 값이 없습니다.");
        }
    }
}

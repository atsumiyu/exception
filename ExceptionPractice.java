package exception;
import oop.Account;

import java.util.Scanner;
public class ExceptionPractice {

    public static void main(String[] args) {

        var num = 0;
        var resurt = "";

        var sc = new Scanner(System.in);


        while(true) {

            System.out.println("数字を入力してください");
            var s1 = sc.nextLine();
            try {
                num = Integer.parseInt(s1);
                resurt = judgeScore(num);
                System.out.println(resurt);
                break;
            } catch(NumberFormatException e) {
                e.printStackTrace();
                System.out.println("数値を入力してください");
            } catch (IlligalScoreException e) {
                e.printStackTrace();
                System.out.println("スコアが不正です");
            }


//            if(insertNum == "A" || insertNum == "B" || insertNum == "C" || insertNum == "D") {
//                System.out.println(insertNum);
//            } else {
//                System.out.println("スコアが不正です");
//            }

        }

        sc.close();
    }


    // メソッド
    public static String judgeScore(int score) throws IlligalScoreException {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 70 && score < 80) {
            return "B";
        } else if (score >= 60 && score < 70) {
            return "C";
        } else if (score >= 0 && score <= 59) {
            return "D";
        } else {

            throw new IlligalScoreException();

//            try {
//                (score < 0 && score > 100);
//            } catch(illigalScoreException e) {
//                e.System.out.println("スコアが不正です");
//            }
        }

    }

}

/**
 * Created by Dinesh on 9/6/2015.
 */
public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 3;
        int k = max(5, 3);

        System.out.println(k);

    }


/**
* max @function
*/
        public static int max(int num1, int num2) {
            int result = 0;

            if(num1 > num2)
                result = num1;
            else
                result = num2;

            return result;
    }

    }

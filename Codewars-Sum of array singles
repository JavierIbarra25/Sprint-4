public class Solution {
    public static int repeats(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            int cuenta = 0;
  
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cuenta++;
                }
            }
          
            if (cuenta == 1) {
                suma = suma + array[i];
            }
        }

        return suma;
    }
}

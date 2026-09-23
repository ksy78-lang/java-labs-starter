package edu.course.lab01;
/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }
   
    
    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
     public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        for (int i=2; i*i<=number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
        }
    public static boolean isPalindrome(String text) {
        if(text==null){
          throw new IllegalArgumentException("null");  
        }
        StringBuilder reversed = new StringBuilder(text);
        reversed.reverse();
        return text.equals(reversed.toString());
        }

    public static double average(int[] values){
        if (values==null||values.length==0){
            throw new IllegalArgumentException("null");
        }
        int sum=0;
        for(int i=0;i<values.length; i++){
            sum=sum+values[i];
        }
        return (double) sum / values.length;
    }

    public static int max(int[] array){
        if (array==null||array.length==0){
            throw new IllegalArgumentException("null");
        }

        int maxZ=array[0];
        for(int i=1; i<array.length; i++){
            if (array[i]>maxZ){
                maxZ=array[i];
            }
        }
        return maxZ;
    }
    public static int min(int[] array){
        if (array==null||array.length==0){
            throw new IllegalArgumentException("null");
        }

        int minZ=array[0];
        for(int i=1; i<array.length; i++){
            if (array[i]<minZ){
                minZ=array[i];
            }
        }
        return minZ;
    }
}

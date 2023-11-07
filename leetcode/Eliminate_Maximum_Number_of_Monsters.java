import java.util.Arrays;

public class Eliminate_Maximum_Number_of_Monsters {
    public static void main(String[] args) {

        int[] dict = {1,3,4};
        int[] speed ={1,1,1};
        int result  = eliminateMaximum(dict,speed);
        System.out.print(result);
    }
    public static int eliminateMaximum(int[] dist, int[] speed) {
        double[] time = new double[speed.length];
        for(int i=0;i<dist.length;i++){
            double a=dist[i]*1.0/speed[i];
            time[i]=a;
        }
        Arrays.sort(time);
        int t=0,count=0;
        for(double i:time){
            if(i>t){
                count++;
            }else{
                break;
            }
            t++;
        }
        return count;
        
    }
}

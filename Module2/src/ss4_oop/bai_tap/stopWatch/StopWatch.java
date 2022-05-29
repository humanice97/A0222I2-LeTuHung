package ss4_oop.bai_tap.stopWatch;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random()*100000);
        }
        stopWatch.start();
        Arrays.sort(arr);
        stopWatch.stop();

        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
    }
}


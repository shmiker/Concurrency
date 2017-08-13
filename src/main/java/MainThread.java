import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by Mikhail.Shumaev on 26.07.2017.
 */
class MainThread extends Thread {

    static ArrayList<Integer> list = new ArrayList<Integer>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        while (true) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
            }
            int min = 9999;

            for (int j = 0; j < MainThread.list.size(); j++) {
                if (MainThread.list.get(j) < min) {
                    min = MainThread.list.remove(j);
                }
            }
            System.out.println("Minimum is " + min);
            Thread.interrupted();
        }
    }
}

class FirstThread
{
    static MainThread mainThread;

    public static void main(String[] args) {
        mainThread = new MainThread();

        mainThread.start();


        int n = -1;
        while (true) {
            String number = null;
            try {
                number = MainThread.reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            MainThread.list.add(Integer.parseInt(Converter.replaceNumbers(number)));
            //System.out.println(MainThread.list.get(++n));
        }
    }

}

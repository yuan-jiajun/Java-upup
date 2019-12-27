package thread.guessNumber;

/**
 * @author yuanjiajun
 * @date 2019/6/3
 * @time 17:03
 * description:
 */
public class DisplayMessage implements Runnable{
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}

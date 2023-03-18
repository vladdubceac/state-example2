package learning.vladdubceac.state;

public class SilentState implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("silent...");
    }
}

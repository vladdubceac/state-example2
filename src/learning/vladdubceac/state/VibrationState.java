package learning.vladdubceac.state;

public class VibrationState implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("vibration...");
    }
}

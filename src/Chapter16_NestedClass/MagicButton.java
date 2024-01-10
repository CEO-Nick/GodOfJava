package Chapter16_NestedClass;

public class MagicButton {
    public MagicButton() {

    }

    private EventListener listener;
    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    public void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }
}



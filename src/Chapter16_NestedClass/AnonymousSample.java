package Chapter16_NestedClass;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();

    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous() {
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked!!!");
            }
        });
        button.onClickProcess();
    }
}

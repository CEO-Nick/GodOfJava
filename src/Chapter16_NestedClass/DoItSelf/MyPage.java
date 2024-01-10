package Chapter16_NestedClass.DoItSelf;

public class MyPage {
    public static void main(String[] args) {
        MyPage sample = new MyPage();
        sample.setUI();
        sample.pressKey();
    }

    InputBox input;

    public void setUI() {
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(listener);
    }

    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }
}


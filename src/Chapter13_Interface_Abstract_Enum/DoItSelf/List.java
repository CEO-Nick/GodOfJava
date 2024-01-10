package Chapter13_Interface_Abstract_Enum.DoItSelf;

public interface List {
    public void add();
    public void update(int index, Object value);
    public void remove(int index);
    public Object findByIndex(int index);
    public Object popLeft();
    public Object popRight();
}

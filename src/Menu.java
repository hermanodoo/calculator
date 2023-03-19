public class Menu {
    private int option;

    Menu(int option) {
        this.option = option;
    }
    public void setOption(int option) {
        this.option = option;
    }
    public int getOption() {
        if (option == 1 || option == 2) {
            return option;
        } else {
            return -1;
        }
    }
}

public class Runner {
    public static void main(String[] args){
        MaxWindow window = new MaxWindow();
        window.setSize(200,200);
        window.setLocation(500,500);
        window.setVisible(true);

        window.maximizeWidth(true);
        window.maximizeHeight(true);
        window.maximizeWidth(false);
        window.maximizeHeight(false);
    }
}


public class ui {
    private boolean status;
    ui(){
        this.status = true;
    }

    public void start(){
        System.out.println("started.");
    }

    public boolean isStatus() {
        return status;
    }
}

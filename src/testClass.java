import java.util.ArrayList;

public class testClass {
    private int num;
    private String msg;
    private ArrayList<Integer> numlist;

    public testClass(int num, String msg){
        this.num = num;
        this.msg = msg;
        this.numlist = new ArrayList<>();
    }

    public int getNum() {
        return num;
    }

    public String getMsg() {
        return msg;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

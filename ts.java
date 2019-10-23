package pertemuan5;

public class ts {

    private String data[];
    private int top;
    public ts(int jumlah){
        data = new String [jumlah];
        top = -1;
    }

    public int pop(){
        if (top >= 0){
            String temp = data[top--];
            top = -1;
        }
        return 0;
    }
    public void push(String nilai){
        if (top <data.length-1){
            data [++top]=nilai;
        }

    }
    public void print(){
        for (int i = data.length-1; i >=0;i--){
            System.out.println(data[i]);
        }

    }
}

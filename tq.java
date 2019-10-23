package pertemuan5;

public class tq {

    private String data[];
    private int tail;
    public tq(int jumlah){
        data = new String[jumlah];
        tail = -1;
    }
    public void enqueue(String nilai){
        if (tail <data.length-1){
            data [++tail]= nilai;
        }
    }
    public int dequeue() {
        if (tail >= 0) {
            String temp = data[0];
            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i + 1];
            }
            //kurangi tail
            tail--;
            return 0;
        }
        return 0;
        }

    public void print(){
        for (int i = data.length-1; i >=0;i--){
            System.out.println(data[i]);
        }
    }
}

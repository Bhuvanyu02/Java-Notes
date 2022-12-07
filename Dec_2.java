// HASHING  (LINEAR PROBING)
public class Dec_2 {
    int size=20;
    data[] hashtable=new data[size];
    public int index(int key){
        return key%size;
    }
int count=0;
    public void insert(data data1){
        if(count>=size){
            System.out.println("OVER-FLOW");
        }else{
            int key1=data1.data_key();
            int value1=data1.data_value();
            int index1=index(key1);
            while(hashtable[index1]!=null){
                index1++;
                if(index1==size){
                    index1=0;
                }
            }
            hashtable[index1]=data1;
            count++;
        }

    }

    public void insert2(data data1){
        // QUADRATIC PROBING (MID-SQUARE METHOD)
        if(count>=size){
            System.out.println("OVER-FLOW");
        }else{
            int key1=data1.data_key();
            int value1=data1.data_value();
            int index1=index(key1);
            int k=1;
            while(hashtable[index1]!=null){
                index1=index1+(k*k);
                k++;
                if(index1>=size){
                    index1=0;
                }
            }
            hashtable[index1]=data1;
            count++;
        }

    }
    public void delete(data data1){
        int key1=data1.data_key();
        int value1=data1.data_value();
        int index1=index(key1);
        while(hashtable[index1]!=null){
            if(hashtable[index1].data_key()==key1 && hashtable[index1].data_value()==value1){
//                data data2=new data(-1,-1);
                hashtable[index1]=null;
                System.out.println("DATA DELETED");
                break;
            }
            index1++;
            if (index1==size){
                index1=0;
            }
            }
        }

    void display(){
        if (count<1){
            System.out.println("UNDER-FLOW");
        }else {
            for (int i=0;i<size;i++){
                if(hashtable[i]!=null){
                    System.out.println(hashtable[i].data_key()+" "+hashtable[i].data_value());
                }
            }
        }

    }

    public static void main(String[] args) {
            data d1=new data(4,5);
            data d2=new data(22,5);
            data d3=new data(42,5);

        Dec_2 d=new Dec_2();
            d.insert2(d1);
            d.insert2(d2);
            d.insert2(d3);
            d.display();
//            d.delete(d2);
//            d.display();

    }
}

class data{
    private int key;
    private int value;
    data(int key1,int value1){
        key=key1;
        value=value1;
    }
    int data_key(){
        return key;
    }
    int data_value(){
        return value;
    }
}

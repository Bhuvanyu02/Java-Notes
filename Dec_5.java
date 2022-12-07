public class Dec_5 {
    //// HASHING  (CHAINING-METHOD)
    private int size=20;

    data_1[] hashtable=new data_1[size];


    public int index(int key){
        return key%size;
    }

    public void insert(data_1 data1){
        int key1= data1.data_key();
        int val1= data1.data_value();
        data_1 next1=null;
        int index1=index(key1);
        if(hashtable[index1]==null){
            hashtable[index1]=data1;
        }
        else{
            data_1 data2=hashtable[index1];// refering to data stored at index
            while (data2.data_next()!=null && data2.data_key()!=key1){
                data2=data2.data_next();
            }
            data2.data_next1(data1);// prev pointer pointing to new data
        }
    }

    public void display(int key){
        int index1=index(key);
        int count=0;
        if(hashtable[index1]==null){
            System.out.println("No item stored");
        }
        else{
            data_1 data1=hashtable[index1];
            while (data1!=null){
                System.out.println("Key: "+data1.data_key()+" Value : "+data1.data_value());
                data1=data1.data_next();
                count++;
            }

            System.out.println("Total Values at index is " + count);
        }
    }

    public void search(data_1 data1){
        int index1=index(data1.data_key());
        if(hashtable[index1]==null){
            System.out.println("Not Found");
        }
        else{
            data_1 d1=hashtable[index1];
            boolean found=false;
            while (d1!=null){
                if(d1.data_value()==data1.data_value()){
                    System.out.println("YES FOUND");
                    found=true;
                    break;
                }
                if(found==true){
                    break;
                }
                else{
                    d1=d1.data_next();
                }
            }
        }
    }

    public void delete(data_1 data1){
        int index1=index(data1.data_key());
        int key1=data1.data_key();
        int val=data1.data_value();
        data_1 temp_data=new data_1(-1,-1);
        if(hashtable[index1]==null){
            System.out.println("Not Found");
        }
        else{
            if(key1==hashtable[index1].data_key() && val==hashtable[index1].data_value()){
                temp_data.data_next1(data1.data_next());
                hashtable[index1]=temp_data;
            }
            else {
                while(val!=hashtable[index1].data_value()&& key1!=hashtable[index1].data_key()){
                    hashtable[index1]=hashtable[index1].data_next();
                }
                temp_data.data_next1(data1.data_next());
                hashtable[index1]=temp_data;
            }
            System.out.println("Element Deleted");
            }
        }

    public static void main(String[] args) {

            data_1 d1=new data_1(4,676);
            data_1 d2=new data_1(24,686);
            Dec_5 d=new Dec_5();
            d.insert(d1);
            d.insert(d2);
            data_1 d3=new data_1(5,432);
            data_1 d4=new data_1(5,430);
            d.insert(d3);
            d.insert(d4);
            d.display(5);
            d.search(d3);
            d.delete(d3);
            d.display(5);
    }
}


class data_1{
    private int key;
    private int value;
    private data_1 next;

    data_1(int key1,int value1){
        key=key1;
        value=value1;
        next=null;
    }

    int data_key(){
        return key;
    }
    int data_value(){
        return value;
    }
    data_1 data_next(){
        return next;
    }

    void data_next1(data_1 next1){
        next=next1;
    }

}
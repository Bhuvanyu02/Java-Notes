public class JobSequence {


   static int minimum(int a,int b){
        if(a<b){
            return a;
        }
            return b;
    }
    static void JobSeq(Job[]jobs,int n){
        int[] time=new int[10];
        int processed=0;
        int maxdelay=0;

        // fetching maxdelay
        for (int i=0;i<n;i++){
            if (jobs[i].dead>maxdelay){
                maxdelay=jobs[i].dead;
            }
        }
        for (int i=1;i<=maxdelay;i++){
            time[i]=-1;
        }
        for (int i=1;i<=n;i++){
           int k=minimum(maxdelay,jobs[i-1].dead);
           while(k>=1){
               if(time[k]==-1){
                   time[k]=i-1;
                   processed++;
                   break;
               }
               k--;
           }
           if (processed==maxdelay){
               break;
           }
        }
        int maxp=0;
        for (int i=1;i<=maxdelay;i++){
            System.out.println(jobs[time[i]].id+" "+jobs[time[i]].profit);
            maxp+=jobs[time[i]].profit;
        }
        System.out.println("Max Profit "+maxp);
    }

    public static void main(String[] args) {
         Job[] jobs=new Job[5];
        jobs[0]=new Job("j1",2,20);
        jobs[1]=new Job("j2",2,15);
        jobs[2]=new Job("j3",1,10);
        jobs[3]=new Job("j4",3,5);
        jobs[4]=new Job("j5",3,1);

        Job temp;
        int n= jobs.length;
        for (int i=1;i<n;i++){
            for (int j=0;j<n-i;j++){
                if (jobs[j+1].profit>jobs[j].profit){
                    temp=jobs[j+1];
                    jobs[j+1]=jobs[j];
                    jobs[j]=temp;
                }
            }
        }
        JobSeq(jobs,n);
    }
}
class Job{
    String id;
    int dead;
    int profit;
    Job(String id1,int d,int p){
        id=id1;
        dead=d;
        profit=p;
    }
}

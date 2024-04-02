package Ch6;
public class Ch6_11{
    public static void main(String[] args){
        float temp[][]={{18.2f,17.3f,15.0f,13.4f},
                        {23.8f,25.1f,20.6f,17.8f},
                        {20.6f,21.5f,18.4f,15.7f}};
        System.out.println("(a)");
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                System.out.printf("%.1f ",temp[i][j]);
            }
            System.out.println();
        }
        System.out.println("(b)");
        float[] sum=new float[4];
        sum[0]=temp[0][0]+temp[1][0]+temp[2][0];
        sum[1]=temp[0][1]+temp[1][1]+temp[2][1];
        sum[2]=temp[0][2]+temp[1][2]+temp[2][2];
        sum[3]=temp[0][3]+temp[1][3]+temp[2][3];
        for(int i=0;i<sum.length;i++){
        System.out.printf("星期%d 平均溫度 %.2f  ",i+1,(float)sum[i]/3); 
        }
        System.out.println();
        System.out.println("(c)");
        for(int i=0;i<temp.length;i++){
            float sum1=0;
            for(int j=0;j<temp[i].length;j++){
                sum1+=temp[i][j];
                }
        System.out.printf("時段%d 平均溫度%.3f ",i+1,(float)sum1/4); 
            }
        System.out.println();
        System.out.println("(d)");
        float hot=temp[0][0];
        int day1=0,time1=0;

        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                if(temp[i][j]>hot){
                    hot=temp[i][j];
                    day1=j;
                    time1=i;
                }
            }
        }
        System.out.printf("禮拜%d時段%d 溫度%.1f 最高溫",day1+1,time1+1,hot);
        System.out.println();
        System.out.println("(d)");
        float cold=temp[0][0];
        int day2=0,time2=0;

        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                if(temp[i][j]<cold){
                    hot=temp[i][j];
                    day2=j;
                    time2=i;
                }
            }
        }
        System.out.printf("禮拜%d時段%d 溫度%.1f 最高溫",day2+1,time2+1,cold);
    }
}
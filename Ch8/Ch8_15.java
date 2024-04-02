package Ch8;

class CSphere{
    private int x;    	// 圓心的x座標
    private int y;    	// 圓心的y座標
    private int z;    	// 圓心的z座標
    private int r; 		// 圓球的半徑r

    void setLocation(int cx1, int cy1, int cz1){
        x=cx1;
        y=cy1;
        z=cz1;
    }
    void setRadius(int r1){
        r=r1;
    }
    double surfaceArea(){
        return 4*Math.PI*r*r;
    }
    double volume(){
        return (4.0/3.0)*Math.PI*r*r*r;
    }
    void showCenter(){
        System.out.println("Center: ("+x+", "+y+", "+z+")");
    }
 }
 
 public class Ch8_15{
    public static void main(String[] args){
       CSphere obj =new CSphere();
       obj.setLocation(3, 4, 5);
       obj.setRadius(1);
       obj.showCenter();
       System.out.println("Surface Area: "+obj.surfaceArea());
       System.out.println("Volume: "+obj.volume());
    }
 }
 
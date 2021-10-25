import java.util.Scanner;

public class Main {
    //select figure ;
    public static void main(String[] args) throws Exception {
        System.out.println("please select a  figure : 1 triangle ; 2 squre ; 3 circle ;4 prism");
        Scanner sc = new Scanner(System.in);
        int figure=sc.nextInt();
        implementingPrintable IM=new implementingPrintable();
        if(figure==1){
          IM.print(1);
        }else if(figure==2){
          IM.print(2);
        }else if(figure==3){
            IM.print(3);
        }else if(figure==4){
            IM.print(4);
        }else{
            System.out.println("sorry too complicated for me to calculate ");
        }
    }
}

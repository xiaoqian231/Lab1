import java.util.Scanner;

public class implementingPrintable{

    Scanner sc = new Scanner(System.in);

    public void print(int type) throws Exception {
        if(type==1){
            System.out.println("you had chosen: triangle");
            System.out.println("please enter your triangle data:");
            double[] myNum = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

            for (int i = 0; i <myNum.length ; i++) {
                if (myNum[i]<0){
                    throw new Exception("must be a positive number!");
                }
            }
            Triangle TR=new Triangle(myNum[0], myNum[1], myNum[2]);



            System.out.println("result :area"+ TR.calculateArea()+"\nPerimeter"+TR.calculatePerimeter());

        }
        else if(type==2){
            System.out.println("you had chosen: square");
            System.out.println("please enter your square data:");
            double[] myNum = {sc.nextDouble(), sc.nextDouble()};
            for (int i = 0; i <myNum.length ; i++) {
                if (myNum[i]<0){
                    throw new Exception("must be a positive number!");
                }
            }
            Square SQ=new Square();
            SQ.setA(myNum[0]);
            SQ.setB(myNum[1]);
            System.out.println("result :area"+ SQ.calculateArea()+"\nPerimeter"+SQ.calculatePerimeter());

        }
        else if(type==3){
            System.out.println("you had chosen: circle");
            System.out.println("please enter your circle radius:");
            double[] myNum = {sc.nextDouble()};
            for (int i = 0; i <myNum.length ; i++) {
                if (myNum[i]<0){
                    throw new Exception("must be a positive number!");
                }
            }
           Circle CI=new Circle();
            CI.setR(myNum[0]);
            System.out.println("result :area"+ CI.calculateArea()+"\nPerimeter"+CI.calculatePerimeter());

        }
        else if(type==4){
            System.out.println("you had chosen: Prism");
            System.out.println("please enter your Prism data:");
            double[] myNum = {sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
            for (int i = 0; i <myNum.length ; i++) {
                if (myNum[i]<0){
                    throw new Exception("must be a positive number!");
                }
            }
            Prism PR=new Prism();
            PR.setA(myNum[0]);
            PR.setB(myNum[1]);
            PR.setC(myNum[2]);
            PR.setH(myNum[3]);
            System.out.println("result :area"+ PR.calculateTotalArea()+"\nvolum"+PR.calculateVolum());
        }
        else{
            System.out.println("sorry figure not exist ");
        }
    }


}

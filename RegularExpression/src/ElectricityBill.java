import java.io.*;
abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}//end of Plan class.
class  DomesticPlan extends Plan{
    //@override
    public void getRate(){
        rate=3.50;
    }
}//end of DomesticPlan class.
class CommercialPlan extends Plan {
    //@override
    public void getRate() {
        rate = 7.50;
    }
}//end of CommercialPlan class.

class  InstitutionalPlan extends Plan {
    //@override
    public void getRate() {
        rate = 5.50;
    }
}//end of InstitutionalPlan class.
class GetPlanFactory{

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}//end of GetPlanFactory class.

    public class ElectricityBill {
        public static void main(String args[])throws IOException{
            GetPlanFactory planFactory = new GetPlanFactory();

           // System.out.print("Enter the name of plan for which the bill will be generated: ");

            String planName="DomesticPlan";
           // System.out.print("Enter the number of units for bill will be calculated: ");
            int units=500;

            Plan p = planFactory.getPlan(planName);
            //call getRate() method and calculateBill()method of DomesticPaln.

            System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
            p.getRate();
            p.calculateBill(units);
        }
    }//end of GenerateBill class.



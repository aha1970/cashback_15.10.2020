public class Cashback {
    private int persent=1;
    private int limit=3000_00;
    public int calculate(int expenses,char statusIncreased, char statusSpecialOffer){
      if(statusIncreased=='Y')  {
          this.persent=5;
      }
      if(statusSpecialOffer=='Y'){
          this.persent=30;
      }
      int result=(expenses/100/100)*100*100*persent/100;

      if(result>limit){
          result=limit;
      }
      return result;

    }
}

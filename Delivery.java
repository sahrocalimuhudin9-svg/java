package assigment;

public abstract class Delivery {
     protected int  distances ,weight;

     Delivery(){
         distances=0;
         weight=0;
     }
     Delivery( int distance ,int weight){
         this.distances =distances;
         this.weight =weight;

     }
     public abstract long calculateFee();


}

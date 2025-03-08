public class Flowers {

    public boolean canPlaceFlowers(int[] flowerbed, int flower){
       if(flower==0)
        return true;

       for(int i=0;i<flowerbed.length;i++){
        if(flower==0) return true;
        boolean leftEmpty = i==0||flowerbed[i-1]==0;
        boolean rightEmpty = i==flowerbed.length-1 || flowerbed[i+1]==0;
        boolean PositionEmpty = flowerbed[i]==0;

        if(leftEmpty&&rightEmpty&&PositionEmpty){
         flower--;
         flowerbed[i]=1;
        }
       }
       if(flower==0)
        return true;
       else
        return false;
    }

    public static void main(String[] args){
        int[] flowerbed = {0,0,0,1,0,0,0,0};
        int flowers = 2;

        Flowers flower = new Flowers();

        boolean result = flower.canPlaceFlowers(flowerbed, flowers);

        System.out.print(result);
    }
}

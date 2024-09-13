public class Snake {


    private int length;
    private int[] coordinates=new int[2];

    public Snake(int length, int[] coordinates){
        this.length=length;
        this.coordinates=coordinates;
    }

    public Snake(){
        this(0, new int[]{0,0});
    }
    public int getLength() {
        return length;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

}

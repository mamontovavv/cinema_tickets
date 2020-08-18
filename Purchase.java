public class Purchase  {
    private String hall;
    private int row;
    private int place;

    public Purchase (String hall, int row, int place) {
        this.hall = hall;
        this.row = row;
        this.place = place;
    }
    
    public String getHall() {
        return hall;
    }
    
   public void setHall (String hall) {
       this.hall = hall;
   }
    
    public int getRow() {
        return row;
    }
    
    public void setRow(int row) {
       this.row = row;
   }
    
    public int getPlace() {
        return place;
    }    
    
    public void setPlace(int place) {
       this.place = place;
   }
    
}

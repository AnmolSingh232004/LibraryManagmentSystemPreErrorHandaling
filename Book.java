public class Book{
    private String title;
    private String category;
    private Boolean isReserved;

    public Book(String title, String category, Boolean isReserved){
        this.title = title;
        this.category = category;
        this.isReserved = isReserved;
    }
    public Boolean getReserved() {
        return isReserved;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    /*public synchronized void reserveBook(Book name){

            if(name.getReserved())
            if(isReserved){
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            isReserved = true;
        }*/
    public synchronized void returnBook(){
        isReserved = false;
        notifyAll();
    }



}
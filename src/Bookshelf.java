public class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int size){
        books = new Book[size];
        count = 0;
    }

    public void add(Book book){
        books[count] = book;
        count++;
    }

    public Book getOldest(){
        Book oldest = books[0];
        for(int i = 1; i < count; i++){
            if(books[i].getYear() < oldest.getYear()){
                oldest = books[i];
            }
        }
        return oldest;
    }

    public Book getNewest(){
        Book newest = books[0];
        for(int i = 1; i < count; i++){
            if(books[i].getYear() > newest.getYear()){
                newest = books[i];
            }
        }
        return newest;
    }

    public void sortByYear(){
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count - 1; j++){
                if(books[j].getYear() > books[j + 1].getYear()){
                    Book tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }

    public void printAll(){
        for(int i = 0; i < count; i++){
            System.out.println(books[i].toString());
        }
    }
}

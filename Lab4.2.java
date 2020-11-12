import java.util.*;
class Book{
    
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;
    
    void setISBN(int ISBN){
    this.ISBN = ISBN;
    }
    int getISBN(){
     return ISBN;
    }
    
    void setbookTitle(String bookTitle){
    this.bookTitle = bookTitle;
    }
    String getbookTitle(){
     return bookTitle;
    }
    
    void setnumberOfPages(int numberOfPages){
    this.numberOfPages = numberOfPages;
    }
    int getnumberOfPages(){
     return numberOfPages;
    }
    
    public void Book(int ISBN,String bookTitle, int numberOfPages){
    }
    public void Book(){    
    }
    public String toString(){
        return "ISBN:"+ISBN+"\nTitle:"+bookTitle+"\nPage:"+numberOfPages;
    }
    public int compareTo( Book book ){
        if(this.getnumberOfPages() > book.getnumberOfPages()) return 1;
        else if(this.getnumberOfPages() == book.getnumberOfPages()) return 0;
        else return -1;
    }
    public int getCount(){
        return 0;
    }
    
    
}

class main{
    public static void displayAll(Book[] BookArray ){
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println(BookArray[i].toString());
        }
    }
    public static boolean isHeavier( Book book ){
        return( book.getnumberOfPages() > 500);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Book[] BookArray = new Book[5];
        x:while(true){
        for( int i = 0 ; i < 5 ; i++ ){
        System.out.println((i+1) + "st book Detail");
        BookArray[i] = new Book();
        System.out.printf("ISBN: ");
        BookArray[i].setISBN(sc.nextInt());
        sc.nextLine();
        System.out.printf("Title: ");
        BookArray[i].setbookTitle(sc.nextLine());
        System.out.printf("Pages: ");
        BookArray[i].setnumberOfPages(sc.nextInt());
        }
        System.out.println("Detail Save for 5 book Successfully....\n");
        y:while(true){
        System.out.println("Press 1 to check weight of a book\nPress 2 to compare\npress 3 for detail of all books");
        int option = sc.nextInt();
        if( option == 1 ){
          System.out.printf("Select a book check weight\n");
          for( int i = 0 ; i < 5 ; i++ ){
              System.out.println( i+1 +" "+ BookArray[i].getbookTitle());
          }
            int optioncom = sc.nextInt();
                optioncom--;
          if(isHeavier(BookArray[optioncom]) == true){
                System.out.println(BookArray[optioncom].getbookTitle()+" is heavy");
            }
            else{
                System.out.println(BookArray[optioncom].getbookTitle()+" is not heavy");
            }
        }
        
        else if( option == 2 ){
          System.out.printf("Select a book\n");
          for( int i = 0 ; i < 5 ; i++ ){
              System.out.println( i+1 +"."+ BookArray[i].getbookTitle());
          }
            int optioncom = sc.nextInt();
                optioncom--;
          System.out.printf("Select another book to compare\n");
          for( int i = 0 ; i < 5 ; i++ ){
              System.out.println( i+1 +" "+ BookArray[i].getbookTitle());
          }
            int optioncom1 = sc.nextInt();
                optioncom1--;
            if(BookArray[optioncom].compareTo(BookArray[optioncom1]) == 1){
                System.out.println(BookArray[optioncom].getbookTitle()+" pages are more than "+ BookArray[optioncom1].getbookTitle());
            }
            else if(BookArray[optioncom].compareTo(BookArray[optioncom1]) == 0){
                System.out.println(BookArray[optioncom].getbookTitle()+" pages are equal to "+ BookArray[optioncom1].getbookTitle());
            }
            else{
                System.out.println(BookArray[optioncom].getbookTitle()+" pages are less than "+ BookArray[optioncom1].getbookTitle());
            }
        }
        else if ( option == 3 ){
           displayAll(BookArray);
        }
        System.out.println("1 for return to option\n2 for new books\n3 for exit(0)");
        int option1 = sc.nextInt();
        if( option1 == 1 )
            continue y;
        else if( option1 == 2)
            continue x;
        else break;
        }
        break;
        }
   }
    
}

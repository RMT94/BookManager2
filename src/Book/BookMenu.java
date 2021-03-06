package Book;

import Book.BookAPL.BookCenter;
import Book.BookAPL.BookInput;
import Book.BookAPL.BookRemove;
import Book.BookAPL.BookSearch;

/**
 * 책 관련 클래스 연결 클래스
 */
public class BookMenu
{
    BookCenter bc=new BookCenter();

    public void bookMenu()
    {
        while(true)
        {
            System.out.println(bc.books);
            System.out.println("============================");
            System.out.println("1. 도서 대여");
            System.out.println("2. 도서 추가");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 찾기");

            Inputclass in=new Inputclass();

            InputMenu inputMenu=in.getInputMenu();

            //q,Q,x,X를 누르면 뒤로가기
            if(inputMenu.isBack ())
                break;

            if (("1").equals(inputMenu.getMenuCode()))
            {
                BookSearch booksearch=new BookSearch();
                booksearch.search();
            }
            else if (("2").equals(inputMenu.getMenuCode()))
            {
                System.out.println("추가 할 책을 입력해주세요.(책 이름)");
                BookInput bookInput=new BookInput();
                bookInput.input();
            }
            else if (("3").equals(inputMenu.getMenuCode()))
            {
                System.out.println("삭제 할 책을 입력해주세요.");
                BookRemove bookRemove=new BookRemove();
                bookRemove.Remove();
            }
            else if(("4").equals(inputMenu.getMenuCode()))
            {
                //todo 도서 찾기 메소드
                System.out.println("빌릴 책을 입력하시오");
            }
        }
    }
}

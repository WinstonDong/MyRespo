package dl.cn.test;

import cn.dl3.domain.Book;
import cn.dl3.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestClass3 {

    @Test
    public void testJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId(2);
        book.setName("dongliang");
        book.setStatus("failure");
        //bookService.addBook(book);
        //bookService.deleteBook(3);
        //bookService.updateBook(book);
//        int count =  bookService.selectCount();
//        System.out.println(count);
//        Book book1 = bookService.queryBook(2);
//        System.out.println(book1);

        //批量搜索
        List<Book> list = bookService.queryAll();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //批量添加测试、修改、删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] objects1 = {3, "haha", "fly"};
        Object[] objects2 = {4, "heihei", "run"};
        Object[] objects3 = {5, "gaga", "run"};
        batchArgs.add(objects1);
        batchArgs.add(objects2);
        batchArgs.add(objects3);
        List<Object[]> batchArgs2 = new ArrayList<>();
        Object[] objects11 = {"haha", "fly", 3};
        Object[] objects21 = {"heihei", "run", 4};
        Object[] objects31 = {"gaga", "run", 5};
        batchArgs2.add(objects11);
        batchArgs2.add(objects21);
        batchArgs2.add(objects31);
        //bookService.addBooks(batchArgs);
//        bookService.updatesBooks(batchArgs2);
        //批量删除
        List<Object[]> batchArgs3 = new ArrayList<>();
        Object[] o1 = {3};
        Object[] o2 = {4};
        Object[] o3 = {5};
        batchArgs3.add(o1);
        batchArgs3.add(o2);
        batchArgs3.add(o3);
//        bookService.deleteBooks(batchArgs3);

    }
}

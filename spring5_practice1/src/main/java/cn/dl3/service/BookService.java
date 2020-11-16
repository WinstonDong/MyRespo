package cn.dl3.service;

import cn.dl3.Dao.BookDao;
import cn.dl3.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
       bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void deleteBook(int id){
        bookDao.deleteBook(id);
    }

    public int selectCount(){
        return bookDao.selectCount();
    }

    public Book queryBook(int id){
        return bookDao.queryBook(id);
    }

    public List<Book> queryAll(){
        return bookDao.queryBooks();
    }
    public void addBooks(List<Object[]> list){
        bookDao.addBooks(list);
    }

    public void updatesBooks(List<Object[]> list){
        bookDao.updateBooks(list);
    }

    public void deleteBooks(List<Object[]> batchArgs){
        bookDao.deleteBooks(batchArgs);
    }
}

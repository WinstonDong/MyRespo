package cn.dl3.Dao;

import cn.dl3.domain.Book;

import java.util.List;

public interface BookDao {

    public void add(Book book);
    public void update(Book book);
    public void deleteBook(int id);
    public Book queryBook(int id);
    public List<Book> queryBooks();
    public void addBooks(List<Object[]> batchArgs);
    public void updateBooks(List<Object[]> batchArgs);
    public void deleteBooks(List<Object[]> batchArgs);
    public int selectCount();
}

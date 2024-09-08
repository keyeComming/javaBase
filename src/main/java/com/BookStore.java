package com;

@Book(value = "红楼梦", authors = "曹雪芹", price = 998)
public class BookStore {

    @Book(value = "西游记", authors = "吴承恩")
    public void buyBook() {
    }
}
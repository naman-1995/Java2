package com.company;

public class java2_1 {

        public static void main(String[] args) {

        }
        interface adminLogin
        {
            void status();
            void issuedBookDetails();
            void calculateFine();

        }

        interface memberLogin
        {
            void issuedBooks();
            void finePayment();
            void searchBook();
        }

        interface addBook
        {
            void add();
        }

        interface removeBook
        {
            void remove();
        }

        class Admin implements adminLogin, addBook, removeBook, searchBook, issueBook, calculateFine
        {
            int id;
            String password;
            public void showLibraryDetails()
            {

            }

            @Override
            public void status() {

            }

            @Override
            public void issuedBookDetails() {

            }

            @Override
            public void calculateFine() {

            }


            @Override
            public void remove(){

            }

            @Override
            public void add() {

            }
            @Override
            public void search() {


            }
            @Override
            public void issue() {


            }
            @Override
            public void calculate() {


            }

        }

        class Book
        {
            int Book_id;
            String author;
            float price;
            int quantity;
            String type;
        }

        class Member implements searchBook, issueBook
        {
            int id;
            String password;
            @Override
            public void search() {

            }
            @Override
            public void issue() {

            }
        }

        interface searchBook
        {
            void search();
        }

        interface issueBook
        {
            void issue();
        }

        interface calculateFine
        {
            void calculate();
        }


    }


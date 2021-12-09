package com.example.bridgepattern;

public class Client {
    public static void main(String[] args) {
        //new CheckingAccount trong new VietcomBank
        // cung phuong thuc goi .openAccount() nhung xu ly khac nhau dua vao class impletment duoc tao
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();

        //new SavingAccount trong new TPBank
        Bank tpBank = new TPBank(new SavingAccount());
        tpBank.openAccount();

    }
}

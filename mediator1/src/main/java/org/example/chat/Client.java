package org.example.chat;

public class Client {

    public static void main(String[] args) {
        //聊天服务器
        ChatServer chatServer = new ChatServer();

        //三个小伙伴
        User andy = new Member("wang",chatServer);
        User ben = new VIP("zhen",chatServer);
        User lily = new VIP("alex",chatServer);


        andy.sendMessage("Hi！Everybody~");
        System.out.println("---------------");

        ben.sendMessage("who likes lol?");
        System.out.println("---------------");
    }
}

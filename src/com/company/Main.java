package com.company;
import java.util.*;

public class Main
{
    public static List a = new ArrayList();
    public static Scanner k = new Scanner(System.in);


    public static void main(String[] args) throws NumberFormatException
    {
        String u;
        do
        {
            System.out.println("Enter 1: To Create a new Chat\nEnter 2: Send a Message in a Chat\nEnter 3: Check Messages\nEnter 4: Exit");
            u=k.next();
            if(u.equalsIgnoreCase("exit"))
            if(Integer.parseInt(u)==1) Main.createChat();
            else if(Integer.parseInt(u)==2) Main.sendMessage();
            else if(Integer.parseInt(u)==3) Main.checkmessages();
        }
        while(Integer.parseInt(u)!=4);
    }

    public static void createChat()
    {
        ArrayList a1 = new ArrayList();
        a.add(a1);
        System.out.println("You created a new chat: Chat "+ (a.lastIndexOf(a1)+1)+"\n");
    }

    public static void sendMessage()
    {
        System.out.println("Enter the chat number");
        int e = k.nextInt();
        String c;

        do
        {
            System.out.println("Enter a phone number followed by the message you want to send");
            int b = k.nextInt();
            c = k.nextLine();
            Date d = new Date();
            Message m1 = new Message(b, c, d.getTime());
            ((List) a.get(e - 1)).add(m1);
            System.out.println("Your message was sent, enter exit to return");
        }
        while(c.equalsIgnoreCase("exit"));

    }

    public static void checkmessages()
    {
        System.out.println("Enter the chat number you want to check\nEnter 0 to see all the chats you have\nEnter EXIT to return");
        String s1 = k.next();
        if(s1.equalsIgnoreCase("Exit")) return;
        int f = Integer.parseInt(s1)-1;
        if(f<0)
        {
            if(a.size()==0)
                System.out.println("You have no chats!\n");
            else for(int i=0;i<a.size();i++)
                System.out.println("Chat " + (i+1));
            Main.checkmessages();
        }
        if(f>=0)
        {
            List list = (List)a.get(f);
            for(int i=0;i<list.size();i++)
            {
                Message message = (Message)list.get(i);
                System.out.println(message.num + ":" + message.message + " (Sent at " + message.time + ")");
            }
        }
        System.out.println();
    }

}

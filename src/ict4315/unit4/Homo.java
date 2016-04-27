package ict4315.unit4;

import java.util.List;
public class Homo {
    public static void main(String args[]) {
        Node<String> Homo = new Node<String>("Homo - Genus");
        Node<String> HomoHabilis = new Node<String>("Homo Habilis");
        Node<String> HomoRudolfensis = new Node<String>("Homo Rudolfensis");
        Node<String> HomoErectus = new Node<String>("Homo Erectus");
       // private static Node<String> HomoFloresiensis = new Node<String>("Homo Floresiensis AKA - The Hobbit");
        Node<String> HomoNeanderthalensis = new Node<String>("Homo Neanderthalensis");
        Node<String> HomoSapiens = new Node<String>("Home Sapiens AKA - Mondern Man");
        Homo.addChild("Homo Habilis");
        Homo.addChild("Homo Rudolfensis");
        HomoHabilis.addChild("Homo Erectus");
        HomoErectus.addChild("Homo Floresiensis AKA - The Hobbit");
        HomoErectus.addChild("Homo Neanderthalensis");
        HomoNeanderthalensis.addChild("Home Sapiens AKA - Mondern Man");
        List<Node<String>> childrenNodes = Homo.getChildren();
        for (Node h : childrenNodes)
        System.out.println(h.toString());

    }

}

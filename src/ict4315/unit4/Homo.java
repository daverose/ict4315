package ict4315.unit4;

import java.util.List;
public class Homo {
    public static void main(String args[]) {
        Node<String> Homo = new Node<>("Homo - Genus");
        Node<String> HomoHabilis = new Node<>("Homo Habilis");
        Node<String> HomoRudolfensis = new Node<>("Homo Rudolfensis");
        Node<String> HomoErectus = new Node<>("Homo Erectus");
       // private static Node<String> HomoFloresiensis = new Node<String>("Homo Floresiensis AKA - The Hobbit");
        Node<String> HomoNeanderthalensis = new Node<>("Homo Neanderthalensis");
        Node<String> HomoSapiens = new Node<>("Home Sapiens AKA - Mondern Man");
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

package org.example;

public class ReplaceSymbolClass implements ReplaceAInterface1, ReplaceBInterface2 {

    public void replaceSymbolA(String replaceA){
        String result1 = replaceA.replace('a', 'z');
        System.out.println(result1);
    }

    public void replaceSymbolB(String replaceB) {
        String result2 = replaceB.replace('b', 'w');
        System.out.println(result2);

    }
}

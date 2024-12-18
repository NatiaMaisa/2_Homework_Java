package org.example;

public class CountVowelSubClass extends CountVowelAbstractClass {

    public int countVowel(String mystring){
        int count = 0; // ხმოვნების დასათვლელად
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < mystring.length(); i++) {
            if (vowels.indexOf(mystring.charAt(i)) != -1) {
                count++;
            }

        }
        return count;

    }

    int countVowel1(String str){
        int vowelCount = 0;
        String s = str.toLowerCase();
        for (int i =0; i < s.length(); i ++){
            if(s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                vowelCount ++;
        }
        return vowelCount;
    }
    }

